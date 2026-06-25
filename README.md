# Shortcat Anime App Analysis & Decompilation

A deep technical analysis and reverse-engineering project of the **Shortcat** mobile application. This repository contains the decompiled source files (via JADX and Apktool), static analysis logs, API maps, security architecture reports, and content protection findings.

## 📂 Repository Structure

- [app-jadx/](./app-jadx) — Decompiled Java source code output from JADX.
- [shortcat_decoded-apktool/](./shortcat_decoded-apktool) — Reconstructable Smali resources and asset directories from Apktool.
- [com.flagcat.shortcat-apkleaks.txt](./com.flagcat.shortcat-apkleaks.txt) — Endpoint mappings, embedded API keys, and secret string scans.
- [OFFICIAL_API_DOCUMENTATION.md](./OFFICIAL_API_DOCUMENTATION.md) — Fully detailed reverse-engineered specification cataloging every endpoint, authentication schema, and data model.

---

## 🔍 Key Findings Summary

### 1. Technology Stack
- **Framework**: React Native (Expo SDK 55) using Expo Router.
- **State Management**: Zustand and React Query hooks (`useFeedItems`, `useSeriesDetail`).
- **Telemetry**: PostHog and Sentry SDKs integrated natively.

### 2. Video Streaming & Ingestion
- **Streaming Pipeline**: HLS (HTTP Live Streaming via `.m3u8` playlists) and MP4 fallbacks hosted on Cloudflare R2 (`*.r2.dev`).
- **Upload Capabilities**: There is **no client-side video uploading functionality** for users. The only upload endpoint is reserved for profile configurations (`POST /api/v1/profile_picture`).
- **DRM**: No active digital rights management encryption (Widevine/FairPlay) is implemented on the HLS streams.

### 3. Video & Content Protection
- **CORS Constraints**: Asset buckets enforce strict `Referer` constraints requiring requests to stem from the application's domain (`https://www.getshortcat.com/` or `android-app://com.flagcat.shortcat`).
- **Native Block**: Screen recording, screenshots, and screen casting are blocked via Android's native `WindowManager.LayoutParams.FLAG_SECURE` (`8192`) layout parameters applied on modal window rendering.

### 4. Authentication Pipeline
- Orchestrated using a headless **Ory Kratos** server (`https://auth.k.prod.sinj.net`).
- Supports credentials-based authentication, SSO exchanges (Google & Apple ID token exchanges), and verification code (OTP) dynamics. No phone number or SMS verification is present.

### 5. Subscription Verification
- Subscription validation and VIP entitlements are handled via **RevenueCat SDK**:
  `GET https://api.revenuecat.com/v1/subscribers/{appUserID}`

---

## 📖 Access Detailed Specifications

For complete documentation on endpoints, request schemas, payloads, headers, security models, and code pathways, check out:
👉 **[OFFICIAL_API_DOCUMENTATION.md](./OFFICIAL_API_DOCUMENTATION.md)**
