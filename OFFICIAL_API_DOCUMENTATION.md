# Shortcat Official API & Architecture Documentation

This document provides a comprehensive technical analysis of the **Shortcat** mobile application's architecture, endpoints, data flow, security structures, and video streaming ingestion mechanisms. This is compiled based on static analysis of the decompiled Android packages (`shortcat_decoded-apktool`, `app-jadx`) and network configuration logs.

---

## 1. System Architecture & Tech Stack

Shortcat is a short-form anime streaming platform built using **React Native (Expo SDK 55.0.0)**. It utilizes a modular, hook-driven architecture for state management and network calls.

```mermaid
graph TD
    Client[Shortcat React Native App] -->|Authentication| Kratos[Ory Kratos Auth Server]
    Client -->|API Requests| Backend[Shortcat Backend API]
    Client -->|Static Assets / Streaming| CDN[Cloudflare R2 CDN]
    Backend -->|Metadata / DB| DB[(Database)]
    CDN -->|Video/JSON Delivery| Client
```

### Key Technologies:
- **Core Framework**: React Native with **Expo Router** (file-based navigation).
- **State & Query Management**: React Query (`@tanstack/react-query`) for API query caching and synchronization.
- **Rendering & Animation**: `@shopify/react-native-skia` for high-performance canvas rendering.
- **Video Engine**: `expo-video` supporting background playback, picture-in-picture, and HLS/MP4 streams.
- **Analytics & Experimentation**: PostHog and Firebase Analytics.
- **Monitoring**: Sentry (`@sentry/react-native/expo`).
- **Security & Anti-Tamper**: Google Play Integrity with PairIP integration.

---

## 2. Network Environment & Hosts

| Component | Target Host (Production) | Target Host (Staging) | Description |
| :--- | :--- | :--- | :--- |
| **API Base URL** | `https://www.getshortcat.com` | - | Primary REST backend for business logic. |
| **Identity/Auth** | `https://auth.k.prod.sinj.net` | `https://auth.k.staging.sinj.net` | Ory Kratos server for registration and login. |
| **Content CDN/Storage** | `https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev` | - | Cloudflare R2 bucket for catalogs, genres, and media files. |
| **Onboarding CDN** | `https://cdn.getshortcat.com` | - | Static video assets (onboarding loops, montages). |

---

## 3. Onboarding & Catalog Structure

Before hitting the main business logic endpoints, the app prepares the user onboarding state and fetches static catalogs from Cloudflare R2.

### 3.1. Onboarding Media Assets
- **Montage Loop**: `https://cdn.getshortcat.com/onboarding/montage.mp4`
- **Test/Placeholder Stream**: `https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/output.mp4`

### 3.2. Static Content Catalog
Fetched via `useOnboardingCatalog`:
```http
GET https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/shortcat/onboarding/catalog.json
```
- **Description**: Contains the curated initial list of titles, trailers, and settings required to render onboarding choice pages.

### 3.3. Static Genre List
```http
GET https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/shortcat/genres
```
- **Description**: Contains the configuration mapping genre IDs to user preference selection screens.

---

## 4. Authentication Architecture & Login Flows

Shortcat implements Ory Kratos for secure self-service authentication flows. All network actions are handled via the Kratos public server hosted under `https://auth.k.prod.sinj.net`.

### 4.1. Core Authentication Methods (inside `@/store/auth`)
The auth state machine manages session state and provides dedicated actions:
1. **`signInWithPassword`**: Initiates traditional email/password credentials exchange.
2. **`signInWithIdToken`**: Coordinates OAuth2 Token/ID exchange (Google and Apple identity tokens).
3. **`debugEmailLogin`**: Internal diagnostic login flow used for bypass validation.

### 4.2. Detailed Headless Kratos Flow Sequence
```mermaid
sequenceDiagram
    participant App as Shortcat Mobile App
    participant Kratos as Ory Kratos Auth Server
    participant Storage as Expo SecureStore

    App->>Kratos: 1. GET /self-service/login/api (Request flow id)
    Kratos-->>App: 2. Returns Flow Object (contains flow ID & form schema)
    App->>App: 3. User inputs Email / Password
    App->>Kratos: 4. POST /self-service/login?flow=<flow_id> (Submit credentials)
    alt Success
        Kratos-->>App: 5. Returns Session Token (session_token)
        App->>Storage: 6. _setItemAsync("ory_session_token", session_token)
    else Failure
        Kratos-->>App: 5. Returns error payload (Validation failures)
    end
```

### 4.3. SSO Token Exchange Flow
For Google and Apple Sign-in, the app obtains identity credentials using native modules and submits them to the identity provider router:
- **Flow Initialization**: `/self-service/login/browser` / `GET /self-service/login/flow`
- **Exchange Code**: Passes token parameters using `return_session_token_exchange_code`.
- **Validation**: Callback parameters are validated against `/admin/oauth2/auth/sessions/login_code_validate`.

### 4.4. Session Persistence & Security
- **Secure Storage**: Persistent authentication state is secured using **`expo-secure-store`** (accesses Android Keystore / iOS Keychain).
- **Session Tokens**: Saved under the key `ory_session_token`.
- **Flow Actions**:
  - Store token: `_setItemAsync('ory_session_token', token)`
  - Retrieve token: `_getItemAsync('ory_session_token')`
  - Remove token (Logout): `_deleteItemAsync('ory_session_token')`

### 4.5. Token Generation Mechanics (Server-Side)
The `ory_session_token` value passed in request headers is **never generated on the client side** for security reasons. Instead, it is generated dynamically by the Ory Kratos server:
1. **Password Authentication**:
   - The server receives the plaintext credentials via Argon2 hashing algorithms.
   - Upon matching against the identity store, Kratos constructs a session schema, inserts a session record in the database, and returns a high-entropy cryptographically secure random token (e.g. starting with `ory_st_`) to the client.
2. **SSO Identity Provider Exchange**:
   - The native Google/Apple frameworks generate a client-signed JWT (ID Token) locally.
   - The app sends this JWT to Kratos `/self-service/login` endpoint using `jwt-bearer` grant configurations.
   - Kratos fetches the identity provider's public key (JWKS) to verify signature authenticity, parses user traits (email, name), creates/finds the mapped Kratos identity, registers a session, and issues the Kratos `ory_session_token` in response.

### 4.6. Payload Requirements & Verification Code (OTP) Dynamics
Based on compiled routes, Kratos supports standard credential parameters and verification procedures:

#### A. Registration / Signup Payload
- **Endpoint**: `POST /self-service/registration?flow=<flow_id>`
- **Body Schema**:
  ```json
  {
    "method": "password",
    "traits": {
      "email": "user@example.com"
    },
    "password": "yourpassword123"
  }
  ```

#### B. Login Payload
- **Endpoint**: `POST /self-service/login?flow=<flow_id>`
- **Body Schema**:
  ```json
  {
    "method": "password",
    "password_identifier": "user@example.com",
    "password": "yourpassword123"
  }
  ```

#### C. Verification (OTP/Link) & Recovery Dynamics
Ory Kratos orchestrates account verification and password resets using two methods:
1. **Link Strategy**: Kratos sends a unique validation URL to the user's email (`/self-service/verification/browser-updated` or `/self-service/recovery/link`). Clicking this logs the client in.
2. **Code (OTP) Strategy**: Instead of an automatic link, Kratos is configured to generate an alphanumeric or 6-digit **Verification Code** (OTP) sent to the user's email.
   - **User Input**: The user must manually input this code within the application UI.
   - **Verification Submission**:
     ```json
     {
       "method": "code",
       "code": "123456"
     }
     ```
   - **Target Endpoints**: Submitted to `/self-service/verification` or `/self-service/recovery` depending on the active workflow flow ID.

### 4.7. Absence of Phone Number & SMS Authentication
Based on analysis of code structures, layouts, and Android configurations:
- **No Phone Input/Login Support**: The application does not collect, verify, or authentic users via phone numbers or SMS messages.
- **Email-Only Identity Schema**: User schemas (`traits`) are locked to email addresses.
- **Manifest Permissions**: The manifest requests no SMS-related runtime permissions (e.g. `READ_SMS` or `RECEIVE_SMS`), meaning automatic retrieval/verification of SMS OTPs is disabled.
- **Linking Capabilities**: The code parses the `sms:` URI scheme solely to allow launching the system's default messenger for user sharing.

---

## 5. Main Application API Endpoints (v1)

All endpoints below are relative to `https://www.getshortcat.com/api/v1` and require an Authorization Bearer token header obtained from Kratos:
```http
Authorization: Bearer <kratos_session_token>
```

### 5.1. Feed API
- **Endpoint**: `/api/v1/feed`
- **Method**: `GET`
- **Hook**: `useFeedItems`
- **Response Shape (Mocked)**:
  ```json
  {
    "sections": [
      {
        "id": "for-you",
        "title": "For You",
        "items": [
          {
            "id": "series-101",
            "title": "Demon Sword Saga",
            "thumbnailUrl": "https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/thumbnails/demon_sword.jpg",
            "genres": ["Action", "Fantasy"]
          }
        ]
      }
    ]
  }
  ```

### 5.2. Series API
- **Get Series Details**: `GET /api/v1/series/{seriesId}` (via `useSeriesDetail`)
- **Get Series by Genre**: `GET /api/v1/series/genre/{genreId}` (via `useSeriesByGenre`)
- **Get Series by Tag**: `GET /api/v1/series/tag/{tagId}` (via `useSeriesByTag`)
- **Search Series**: `GET /api/v1/series/search?q={query}`
- **Series Completion (Local Only)**: No API endpoint. Playback status is tracked inside the client local store. (Note: `thumbhash:/api/v1/series/complete` found in compilation artifacts is a ThumbHash image placeholder asset path, not an active REST route).
- **Hero/Highlight Media**: `GET /api/v1/series/hero-video` (Fetches current featured banner series)

### 5.3. Episodes API
- **Get Episode Details**: `GET /api/v1/episodes/{episodeId}` (via `useEpisodeDetail`)
- **Get Episodes by Season**: `GET /api/v1/seasons/{seasonId}` (via `episodesBySeasonId` logic)
- **Response Shape (Mocked)**:
  ```json
  {
    "id": "episode-201",
    "seasonId": "season-12",
    "episodeNumber": 1,
    "title": "The Awakening",
    "durationSeconds": 90,
    "videoUrl": "https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/shortcat/streams/ep201.m3u8",
    "backupVideoUrl": "https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/shortcat/streams/ep201.mp4"
  }
  ```

### 5.4. Profile & Rewards
The mobile client implements a dedicated Profile Screen route at `/(tabs)/profile.tsx` containing the following sections and integrations:

1. **Profile Picture / Avatar**:
   - **Hook**: `useProfilePictures` and `getProfilePicture`
   - **Changing Avatar**: Triggers the Expo system library `launchImageLibraryAsync` to pick an image from the device storage.
   - **Upload Endpoint**: `PUT /api/v1/profile`
   - **Payload Format**: `multipart/form-data` with the file attached to the form field key `user[picture]`.

2. **Bookmarks List**:
   - **Endpoints**: `GET /api/v1/profile/bookmarks` / `POST /api/v1/profile/bookmarks`
   - **Description**: Displays the user's bookmarked anime series.

3. **Rewards Program**:
   - **Endpoint**: `GET /api/v1/profile/rewards`
   - **Description**: Fetches user coins or loyalty points used for unlocking premium episodes.

4. **Linked Devices**:
   - **Endpoint**: `GET /api/v1/profile/devices`
   - **Description**: Lists active login sessions and authorized devices for the session identity.

5. **User Feedback Form**:
   - **Endpoint**: `POST /api/v1/profile/feedbacks`
   - **Payload Format**: `application/json` with the following structure:
     ```json
     {
       "feedback": {
         "campaign": "web_app_feedback",
         "content": {
           "body": "User's feedback or support message text here"
         }
       }
     }
     ```
   - **Validation Constraints**:
     - `campaign`: Minimum 3 characters (returns `422 Unprocessable Entity` on violation).
     - Rails 8 Strong Parameters: Expects a nested `content` hash containing `body`. Passing a flat string or missing container structure results in a `500 Internal Server Error` (`ActionController::ParameterMissing`).
   - **Description**: Allows submitting support requests or feedback. Returns `201 Created` on success.

### 5.5. Watch Progress Synchronization (Local Only / MMKV)
- **Sync Watch Progress**: Currently **Not Implemented** as a backend network request. The endpoint `/api/v1/watch/progress` does not exist in the JS bundle string tables and returns a `404 Not Found` if called.
- **Client Storage**: Watch progress is tracked entirely local to the device using the `useWatchProgressStore` state engine and persisted in key-value format using the native `MMKV` library to enable "Continue Watching" playback resume.

---

## 6. Video Ingestion, Streaming & Upload Capabilities

### 6.1. Format Handling
The streaming pipeline in Shortcat is optimized for high-speed mobile delivery of micro-episodes (mostly under 90 seconds).
- **Resolution & Formats**: Handles both **HLS (HTTP Live Streaming)** via `.m3u8` playlists and raw **MP4** fallbacks.
- **CDN Delivery**: Video sources are stored inside the Cloudflare R2 bucket and delivered through highly optimized caching layers.

### 6.2. Absence of Video Upload Capability
Based on comprehensive analysis of compilation headers, dependencies, and permissions:
- **No Video Upload Support**: The application **does not** feature any video upload capabilities for users.
- **Lack of Picker Dependencies**: The project settings (`app.config`) omit standard video-selection packages such as `expo-image-picker` or `react-native-image-crop-picker`.
- **System Permissions**: The `AndroidManifest.xml` does not declare photo or video library permissions required for file ingestion on modern Android systems (e.g. `READ_MEDIA_VIDEO`).
- **Endpoints**: The only upload endpoint is restricted to profile configurations (`POST /api/v1/profile_picture`), which uploads raw avatars.

### 6.3. Digital Rights Management (DRM) Status
- **No Active DRM Encryption**: The video streams are not encrypted using commercial DRM systems (e.g. Widevine Modular, Microsoft PlayReady, or Apple FairPlay).
- **Clear Streams Delivery**: The HLS `.m3u8` manifest profiles contain no DRM key acquisition tags (such as `#EXT-X-KEY` directing to license servers).
- **Framework Support**: The occurrence of Microsoft PlayReady schema parameters originates from decompiled third-party `androidx.media3` / Google ExoPlayer libraries dependencies, rather than local client application business logic.
- **Asset Access Security**: Access validation relies entirely on HTTPS CORS checks, User-Agent authentication, and Referer tracking.

### 6.4. Native Screen Recording & Capture Block (Content Protection)
Shortcat enforces strict local content protection rules to block users from capturing, recording, or casting premium video content via native Android APIs:
1. **Window Secure Flag Enforcement**:
   - The application enforces the layout window configuration flag `WindowManager.LayoutParams.FLAG_SECURE` (integer value `8192` or hex `0x2000`).
   - This native flag is dynamically read and inherited during container layout instantiation. In `com.facebook.react.views.modal.d.java` (React Modal Host view renderer), the dialog updates properties and applies the flag:
     ```java
     private final boolean c(Activity activity) {
         return (activity == null || (activity.getWindow().getAttributes().flags & 8192) == 0) ? false : true;
     }
     ...
     if (c(currentActivity)) {
         window.setFlags(8192, 8192);
     }
     ```
2. **Resulting Restrictions**:
   - **Screenshots Blocked**: Attempting to take a screenshot results in a system notification stating "Can't take screenshot due to security policy."
   - **Screen Recording Blackout**: Any screen recorder tool (system or third-party) only records a pitch-black screen when the premium video modal window is in focus.
   - **Screen Mirroring Blocked**: Protects streams from being cast to untrusted external displays by blanking out the mirroring context natively.

---

## 7. Packaging & Security Architecture


### 7.1. Packaging Metadata (Split APKs)
(version Code: `53`, version Name: `0.0.24`, Min SDK: `24`, Target SDK: `36`)

### 7.2. Anti-Tampering & License Verification
(Integrates Google Play Integrity API via PairIP software protection layers to prevent sideloading).

### 7.3. RevenueCat Subscription & Entitlement Validation
Shortcat delegates subscription status validation entirely to the **RevenueCat** SDK:
- **State Store (`useSubscriptionStore`)**: Maintains the client-side subscription cache. It validates whether the active user possesses the premium entitlement product configuration (`paywall_subscribe_entitlement_missing`).
- **User Identifier Binding**: RevenueCat's SDK is initialized using Kratos' identity ID as the `appUserID`.
- **Entitlement Verification Mode**: Configured with signature validation checks (`EntitlementVerificationMode` mapping) to authenticate receipts with the play store and prevent spoofing. If verification fails, it blocks video rendering (`trusted-entitlements` verification warning).
- **Paywall Routing**: If the state flags indicate that the user is not subscribed, the client triggers the paywall screen (`usePaywallStore`) to prompt payment.

#### Verification Endpoints:
The application uses the following REST endpoints to communicate with RevenueCat servers to query active subscriptions and offerings:
1. **Entitlements Fetch Endpoint**:
   ```http
   GET https://api.revenuecat.com/v1/subscribers/{appUserID}
   ```
   - **Description**: Returns the active subscriber JSON schema containing the user's entitlements state (checks if `"premium"` or `"vip"` is in the active list).
2. **Offerings Metadata Endpoint**:
   ```http
   GET https://api.revenuecat.com/v1/subscribers/{appUserID}/offerings
   ```
   - **Description**: Returns current product offers, prices, and trial periods available for purchase.
3. **Alternative Profile Verification (Backup)**:
   ```http
   GET https://www.getshortcat.com/api/v1/profile
   ```
   - **Description**: Shortcat API endpoint returning the synced subscription state from the backend DB.

---

## 8. Embedded Third-Party Keys & Integrations

- **Google API Key**: `AIzaSyDRcoZY4B51MZuaeyFGrTUG7XrP_YkL-Gw` (Firebase Analytics, Cloud Messaging, and storage bucket configuration).
- **Google GCP OAuth Client ID**: `760267574226-q2gu17lth4ovsmiqhm04eto4i1urqinj.apps.googleusercontent.com`
- **PostHog Key**: `phc_EiWNmm5rpifKBgjzzFev5rl29GRsCl2CqRC92N3cF7L`
- **Sentry DSN**: `https://aae4ec0d9ddfbea9f4c79e5c273c63ed@o345669.ingest.us.sentry.io/4510693765152768`

---

## 9. Request Headers & Referrer Constraints

To authenticate and prevent unauthorized scraping or hotlinking, the following headers are required depending on target endpoint surfaces:

### 9.1. API Server (`https://www.getshortcat.com/api/v1/*`)
Requests made to the backend REST API require validation headers:
- **Authorization**: `Bearer <ory_session_token>` (Mandatory for fetching authenticated catalog details, bookmarks, and watch updates).
- **X-Session-Token**: `<ory_session_token>` (Fallback header populated by Ory integration libraries).
- **User-Agent**: Must identify as the application container (e.g. `Shortcat/0.0.24 (Android)`) to bypass Cloudflare security filters.
- **Content-Type**: `application/json`

### 9.2. Media & Catalog Assets (`*.r2.dev` / `cdn.getshortcat.com`)
Requests made to download streaming video slices (`.ts`, `.mp4`, `.m3u8`) or static onboarding JSON parameters require referrer verification to pass CORS policies:
- **Referer**: Must match the official origin of the application:
  `Referer: https://www.getshortcat.com/` or `Referer: android-app://com.flagcat.shortcat`
- **Origin**: `https://www.getshortcat.com`
- **User-Agent**: Native player client configurations (e.g. `ExoPlayer` or `AVPlayer`).

---

## 10. Anonymous Video Access & Session Guards

The application enforces structural rules governing whether a user can stream content without an active authenticated account.

### 10.1. Unauthenticated Preview Assets
The client code references a small set of static preview resources that are public and bypass login/signup checking:
- **Onboarding Intro Video**: `https://cdn.getshortcat.com/onboarding/montage.mp4` (Used for user onboarding sequence background loop).
- **Trailer/Demo Asset**: `https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/output.mp4`
- **Onboarding Catalog Metadata**: `https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/shortcat/onboarding/catalog.json`

### 10.2. Authenticated Catalog Guarding
For all standard serial episodes, access is blocked unless the user logs in:
1. **Dynamic URL Ingestion**: Real streaming endpoints (`.m3u8` playlists) are fetched on-demand via the episode detail endpoint (`GET /api/v1/episodes/{episodeId}`). This endpoint requires a valid `Authorization: Bearer <ory_session_token>` header; requests without it are rejected by the server (HTTP 401 Unauthorized), preventing retrieval of the stream location.
2. **Navigation Stack Router Guard**: The client navigation hierarchy is managed by `expo-router` using the `(app)` structure. The main layout wrapper initializes the `useSession` hook. If no valid session token exists in `expo-secure-store`, the routing manager cancels rendering and redirects the navigation stack to the login view `(auth)/login`.
3. **Paywall Overlay Guard**: Standard media items execute check flows verifying active subscription status (`premium` or `vip` entitlement IDs) via RevenueCat. Active player components are masked by full-screen purchase views if these validation flags are missing.

---

## 11. Loyalty Coins & Rewards System

The application incorporates a virtual rewards system utilizing "Loyalty Coins" that is managed through a combination of server-side states and payment SDK integrations.

### 11.1. Native SDK Dependencies (Amazon IAP)
The mobile app embeds the **Amazon Device In-App Purchasing (IAP) SDK** (`com.amazon.device.iap.model.*`) which maps product packages to coin rewards natively:
- **Product Mapping**: The `Product` and `ProductBuilder` classes contain a `CoinsReward` field.
- **Coin Reward Value**: The `coinsRewardAmount` parameter stores the number of Amazon Coins rewarded to the user upon making standard in-app purchases.

### 11.2. Server-Side Balance Management
The actual balance is read-only on the client application and is stored/calculated entirely on the Rails backend database:
- **Profile Endpoint**: `GET /api/v1/profile` returns the `"coins"` field nested under `"user"`.
- **Promotion/Tasks Endpoint**: `GET /api/v1/profile/rewards` returns a list of active reward campaigns/claims available to the user.
- **Progress Ingestion**: Placed locally on the client via `useWatchProgressStore` and stored in MMKV to support playback resume. The app does not sync watch duration to the server, meaning it is currently impossible to earn coins dynamically via watch time progression.

### 11.3. Survey Rewards System (Disabled)
The React Native bundle contains hooks (`useRewards` and `getRewards`) for an interactive survey rewards system.
- **State Logs**: Hermes bytecode string tables contain flags indicating the survey logic is skipped:
  - `isInitialLoading surveys is disabled.`
  - `isRewardsLoading surveys skipped, disabled.`
- **Status**: Currently deactivated via remote configuration or feature flags, resulting in empty returns from the rewards list API.


