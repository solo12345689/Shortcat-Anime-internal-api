.class public final Lcom/revenuecat/purchases/common/HTTPClient;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/common/HTTPClient$Companion;,
        Lcom/revenuecat/purchases/common/HTTPClient$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0008\u0000\u0018\u0000 }2\u00020\u0001:\u0001}Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0019\u0010(\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\'\u001a\u00020&H\u0002\u00a2\u0006\u0004\u0008(\u0010)J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008-\u0010.Jy\u0010<\u001a\u0004\u0018\u00010;2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001052\u001a\u00108\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#07\u0018\u0001062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#052\u0006\u0010:\u001a\u000201H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010@\u001a\u00020#2\u0006\u0010?\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008@\u0010AJK\u0010I\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u0002032\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002012\u0008\u0010E\u001a\u0004\u0018\u00010;2\u0006\u0010F\u001a\u0002012\u0008\u0010H\u001a\u0004\u0018\u00010GH\u0002\u00a2\u0006\u0004\u0008I\u0010JJ[\u0010P\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#052\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#052\u0006\u0010L\u001a\u00020/2\u0006\u0010:\u001a\u0002012\u0008\u0010M\u001a\u0004\u0018\u00010#2\u0006\u0010N\u001a\u0002012\u0008\u0010O\u001a\u0004\u0018\u00010#H\u0002\u00a2\u0006\u0004\u0008P\u0010QJ\u001f\u0010U\u001a\u00020&2\u0006\u0010R\u001a\u00020>2\u0006\u0010T\u001a\u00020SH\u0002\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010W\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008W\u0010XJ=\u0010]\u001a\u00020\\2\u0006\u0010Y\u001a\u00020#2\u0006\u0010\'\u001a\u00020Z2\u0008\u0010[\u001a\u0004\u0018\u00010#2\u0008\u0010M\u001a\u0004\u0018\u00010#2\u0008\u0010O\u001a\u0004\u0018\u00010#H\u0002\u00a2\u0006\u0004\u0008]\u0010^J\u001f\u0010`\u001a\n _*\u0004\u0018\u00010#0#2\u0006\u0010\'\u001a\u00020ZH\u0002\u00a2\u0006\u0004\u0008`\u0010aJ\u0019\u0010b\u001a\u0004\u0018\u00010#2\u0006\u0010\'\u001a\u00020ZH\u0002\u00a2\u0006\u0004\u0008b\u0010aJ\u0019\u0010c\u001a\u0004\u0018\u00010B2\u0006\u0010\'\u001a\u00020ZH\u0002\u00a2\u0006\u0004\u0008c\u0010dJ\u0017\u0010e\u001a\u0002012\u0006\u0010\'\u001a\u00020ZH\u0002\u00a2\u0006\u0004\u0008e\u0010fJ\u0089\u0001\u0010j\u001a\u00020;2\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u0002032\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001052\u001a\u00108\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#07\u0018\u0001062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#052\u0008\u0008\u0002\u0010:\u001a\u0002012\u000e\u0008\u0002\u0010g\u001a\u0008\u0012\u0004\u0012\u00020/062\u0008\u0008\u0002\u0010i\u001a\u00020h\u00a2\u0006\u0004\u0008j\u0010kJ\r\u0010l\u001a\u00020,\u00a2\u0006\u0004\u0008l\u0010mR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010oR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010pR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010q\u001a\u0004\u0008r\u0010sR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010tR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010uR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010vR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010wR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010xR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010yR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010zR\u0014\u0010{\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010|\u00a8\u0006~"
    }
    d2 = {
        "Lcom/revenuecat/purchases/common/HTTPClient;",
        "",
        "Lcom/revenuecat/purchases/common/AppConfig;",
        "appConfig",
        "Lcom/revenuecat/purchases/common/networking/ETagManager;",
        "eTagManager",
        "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;",
        "diagnosticsTrackerIfEnabled",
        "Lcom/revenuecat/purchases/common/verification/SigningManager;",
        "signingManager",
        "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;",
        "storefrontProvider",
        "Lcom/revenuecat/purchases/common/DateProvider;",
        "dateProvider",
        "Lcom/revenuecat/purchases/common/networking/MapConverter;",
        "mapConverter",
        "Lcom/revenuecat/purchases/common/LocaleProvider;",
        "localeProvider",
        "Lcom/revenuecat/purchases/ForceServerErrorStrategy;",
        "forceServerErrorStrategy",
        "Lcom/revenuecat/purchases/common/RequestResponseListener;",
        "requestResponseListener",
        "Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;",
        "timeoutManager",
        "<init>",
        "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;Lcom/revenuecat/purchases/common/LocaleProvider;Lcom/revenuecat/purchases/ForceServerErrorStrategy;Lcom/revenuecat/purchases/common/RequestResponseListener;Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;)V",
        "Ljava/io/InputStream;",
        "inputStream",
        "Ljava/io/BufferedReader;",
        "buffer",
        "(Ljava/io/InputStream;)Ljava/io/BufferedReader;",
        "Ljava/io/OutputStream;",
        "outputStream",
        "Ljava/io/BufferedWriter;",
        "(Ljava/io/OutputStream;)Ljava/io/BufferedWriter;",
        "",
        "readFully",
        "(Ljava/io/InputStream;)Ljava/lang/String;",
        "Ljava/net/HttpURLConnection;",
        "connection",
        "getInputStream",
        "(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;",
        "writer",
        "body",
        "LTd/L;",
        "writeFully",
        "(Ljava/io/BufferedWriter;Ljava/lang/String;)V",
        "Ljava/net/URL;",
        "baseURL",
        "",
        "isFallbackURL",
        "Lcom/revenuecat/purchases/common/networking/Endpoint;",
        "endpoint",
        "",
        "",
        "Lkotlin/Pair;",
        "postFieldsToSign",
        "requestHeaders",
        "refreshETag",
        "Lcom/revenuecat/purchases/common/networking/HTTPResult;",
        "performCall",
        "(Ljava/net/URL;ZLcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;",
        "Lcom/revenuecat/purchases/common/networking/HTTPRequest;",
        "httpRequest",
        "toCurlRequest",
        "(Lcom/revenuecat/purchases/common/networking/HTTPRequest;)Ljava/lang/String;",
        "Ljava/util/Date;",
        "requestStartTime",
        "callSuccessful",
        "callResult",
        "isRetry",
        "Ljava/io/IOException;",
        "connectionException",
        "trackHttpRequestPerformedIfNeeded",
        "(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;ZLjava/io/IOException;)V",
        "authenticationHeaders",
        "fullURL",
        "nonce",
        "shouldSignResponse",
        "postFieldsToSignHeader",
        "getHeaders",
        "(Ljava/util/Map;Ljava/net/URL;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;",
        "request",
        "",
        "timeoutMs",
        "getConnection",
        "(Lcom/revenuecat/purchases/common/networking/HTTPRequest;J)Ljava/net/HttpURLConnection;",
        "getXPlatformHeader",
        "()Ljava/lang/String;",
        "urlPath",
        "Ljava/net/URLConnection;",
        "payload",
        "Lcom/revenuecat/purchases/VerificationResult;",
        "verifyResponse",
        "(Ljava/lang/String;Ljava/net/URLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;",
        "kotlin.jvm.PlatformType",
        "getETagHeader",
        "(Ljava/net/URLConnection;)Ljava/lang/String;",
        "getRequestTimeHeader",
        "getRequestDateHeader",
        "(Ljava/net/URLConnection;)Ljava/util/Date;",
        "getLoadShedderHeader",
        "(Ljava/net/URLConnection;)Z",
        "fallbackBaseURLs",
        "",
        "fallbackURLIndex",
        "performRequest",
        "(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;I)Lcom/revenuecat/purchases/common/networking/HTTPResult;",
        "clearCaches",
        "()V",
        "Lcom/revenuecat/purchases/common/AppConfig;",
        "Lcom/revenuecat/purchases/common/networking/ETagManager;",
        "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;",
        "Lcom/revenuecat/purchases/common/verification/SigningManager;",
        "getSigningManager",
        "()Lcom/revenuecat/purchases/common/verification/SigningManager;",
        "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;",
        "Lcom/revenuecat/purchases/common/DateProvider;",
        "Lcom/revenuecat/purchases/common/networking/MapConverter;",
        "Lcom/revenuecat/purchases/common/LocaleProvider;",
        "Lcom/revenuecat/purchases/ForceServerErrorStrategy;",
        "Lcom/revenuecat/purchases/common/RequestResponseListener;",
        "Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;",
        "enableExtraRequestLogging",
        "Z",
        "Companion",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/revenuecat/purchases/common/HTTPClient$Companion;

.field public static final NO_STATUS_CODE:I = -0x1


# instance fields
.field private final appConfig:Lcom/revenuecat/purchases/common/AppConfig;

.field private final dateProvider:Lcom/revenuecat/purchases/common/DateProvider;

.field private final diagnosticsTrackerIfEnabled:Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;

.field private final eTagManager:Lcom/revenuecat/purchases/common/networking/ETagManager;

.field private final enableExtraRequestLogging:Z

.field private final forceServerErrorStrategy:Lcom/revenuecat/purchases/ForceServerErrorStrategy;

.field private final localeProvider:Lcom/revenuecat/purchases/common/LocaleProvider;

.field private final mapConverter:Lcom/revenuecat/purchases/common/networking/MapConverter;

.field private final requestResponseListener:Lcom/revenuecat/purchases/common/RequestResponseListener;

.field private final signingManager:Lcom/revenuecat/purchases/common/verification/SigningManager;

.field private final storefrontProvider:Lcom/revenuecat/purchases/interfaces/StorefrontProvider;

.field private final timeoutManager:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/HTTPClient$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/common/HTTPClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/common/HTTPClient;->Companion:Lcom/revenuecat/purchases/common/HTTPClient$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;Lcom/revenuecat/purchases/common/LocaleProvider;Lcom/revenuecat/purchases/ForceServerErrorStrategy;Lcom/revenuecat/purchases/common/RequestResponseListener;Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;)V
    .locals 1

    const-string v0, "appConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eTagManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signingManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storefrontProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapConverter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localeProvider"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeoutManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/common/HTTPClient;->eTagManager:Lcom/revenuecat/purchases/common/networking/ETagManager;

    .line 4
    iput-object p3, p0, Lcom/revenuecat/purchases/common/HTTPClient;->diagnosticsTrackerIfEnabled:Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;

    .line 5
    iput-object p4, p0, Lcom/revenuecat/purchases/common/HTTPClient;->signingManager:Lcom/revenuecat/purchases/common/verification/SigningManager;

    .line 6
    iput-object p5, p0, Lcom/revenuecat/purchases/common/HTTPClient;->storefrontProvider:Lcom/revenuecat/purchases/interfaces/StorefrontProvider;

    .line 7
    iput-object p6, p0, Lcom/revenuecat/purchases/common/HTTPClient;->dateProvider:Lcom/revenuecat/purchases/common/DateProvider;

    .line 8
    iput-object p7, p0, Lcom/revenuecat/purchases/common/HTTPClient;->mapConverter:Lcom/revenuecat/purchases/common/networking/MapConverter;

    .line 9
    iput-object p8, p0, Lcom/revenuecat/purchases/common/HTTPClient;->localeProvider:Lcom/revenuecat/purchases/common/LocaleProvider;

    .line 10
    iput-object p9, p0, Lcom/revenuecat/purchases/common/HTTPClient;->forceServerErrorStrategy:Lcom/revenuecat/purchases/ForceServerErrorStrategy;

    .line 11
    iput-object p10, p0, Lcom/revenuecat/purchases/common/HTTPClient;->requestResponseListener:Lcom/revenuecat/purchases/common/RequestResponseListener;

    .line 12
    iput-object p11, p0, Lcom/revenuecat/purchases/common/HTTPClient;->timeoutManager:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;

    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/revenuecat/purchases/common/HTTPClient;->enableExtraRequestLogging:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;Lcom/revenuecat/purchases/common/LocaleProvider;Lcom/revenuecat/purchases/ForceServerErrorStrategy;Lcom/revenuecat/purchases/common/RequestResponseListener;Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 14
    new-instance v1, Lcom/revenuecat/purchases/common/DefaultDateProvider;

    invoke-direct {v1}, Lcom/revenuecat/purchases/common/DefaultDateProvider;-><init>()V

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    .line 15
    new-instance v1, Lcom/revenuecat/purchases/common/networking/MapConverter;

    invoke-direct {v1}, Lcom/revenuecat/purchases/common/networking/MapConverter;-><init>()V

    move-object v9, v1

    goto :goto_1

    :cond_1
    move-object/from16 v9, p7

    :goto_1
    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p9

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move-object v12, v2

    goto :goto_3

    :cond_3
    move-object/from16 v12, p10

    :goto_3
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_4

    .line 16
    new-instance v0, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;

    invoke-direct {v0, p1, v8}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;-><init>(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/DateProvider;)V

    move-object v13, v0

    :goto_4
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v10, p8

    goto :goto_5

    :cond_4
    move-object/from16 v13, p11

    goto :goto_4

    .line 17
    :goto_5
    invoke-direct/range {v2 .. v13}, Lcom/revenuecat/purchases/common/HTTPClient;-><init>(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;Lcom/revenuecat/purchases/common/LocaleProvider;Lcom/revenuecat/purchases/ForceServerErrorStrategy;Lcom/revenuecat/purchases/common/RequestResponseListener;Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;)V

    return-void
.end method

.method private final buffer(Ljava/io/InputStream;)Ljava/io/BufferedReader;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    return-object v0
.end method

.method private final buffer(Ljava/io/OutputStream;)Ljava/io/BufferedWriter;
    .locals 2

    .line 2
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    return-object v0
.end method

.method private final getConnection(Lcom/revenuecat/purchases/common/networking/HTTPRequest;J)Ljava/net/HttpURLConnection;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;->getFullURL()Ljava/net/URL;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "null cannot be cast to non-null type java.net.HttpURLConnection"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    long-to-int p2, p2

    .line 17
    invoke-virtual {v0, p2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;->getHeaders()Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_0

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    check-cast p3, Ljava/util/Map$Entry;

    .line 43
    .line 44
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    check-cast p3, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1, p3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;->getBody()Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    const/4 p2, 0x1

    .line 67
    invoke-virtual {v0, p2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 68
    .line 69
    .line 70
    const-string p2, "POST"

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    const-string p3, "os"

    .line 80
    .line 81
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, p2}, Lcom/revenuecat/purchases/common/HTTPClient;->buffer(Ljava/io/OutputStream;)Ljava/io/BufferedWriter;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string p3, "body.toString()"

    .line 93
    .line 94
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, p2, p1}, Lcom/revenuecat/purchases/common/HTTPClient;->writeFully(Ljava/io/BufferedWriter;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-object v0
.end method

.method private final getETagHeader(Ljava/net/URLConnection;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "X-RevenueCat-ETag"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private final getHeaders(Ljava/util/Map;Ljava/net/URL;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/net/URL;",
            "Z",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "Content-Type"

    .line 4
    .line 5
    const-string v2, "application/json"

    .line 6
    .line 7
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v1, "X-Platform"

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/revenuecat/purchases/common/HTTPClient;->getXPlatformHeader()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->getPlatformInfo()Lcom/revenuecat/purchases/common/PlatformInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/PlatformInfo;->getFlavor()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "X-Platform-Flavor"

    .line 32
    .line 33
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->getPlatformInfo()Lcom/revenuecat/purchases/common/PlatformInfo;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/PlatformInfo;->getVersion()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "X-Platform-Flavor-Version"

    .line 48
    .line 49
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "X-Platform-Version"

    .line 60
    .line 61
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    const-string v1, "X-Platform-Device"

    .line 66
    .line 67
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    const-string v1, "X-Platform-Brand"

    .line 74
    .line 75
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    const-string v1, "X-Version"

    .line 82
    .line 83
    const-string v2, "9.29.0"

    .line 84
    .line 85
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->localeProvider:Lcom/revenuecat/purchases/common/LocaleProvider;

    .line 90
    .line 91
    invoke-interface {v1}, Lcom/revenuecat/purchases/common/LocaleProvider;->getCurrentLocalesLanguageTags()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    const/4 v15, 0x4

    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const/16 v12, 0x2d

    .line 99
    .line 100
    const/16 v13, 0x5f

    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    invoke-static/range {v11 .. v16}, LDf/r;->J(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-string v2, "X-Preferred-Locales"

    .line 108
    .line 109
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->getLanguageTag()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v2, "X-Client-Locale"

    .line 120
    .line 121
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 126
    .line 127
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->getVersionName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    const-string v2, "X-Client-Version"

    .line 132
    .line 133
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->getPackageName()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    const-string v2, "X-Client-Bundle-ID"

    .line 144
    .line 145
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 150
    .line 151
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->getFinishTransactions()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    const-string v2, "true"

    .line 156
    .line 157
    if-eqz v1, :cond_0

    .line 158
    .line 159
    const-string v1, "false"

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_0
    move-object v1, v2

    .line 163
    :goto_0
    const-string v15, "X-Observer-Mode-Enabled"

    .line 164
    .line 165
    invoke-static {v15, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    const-string v1, "X-Nonce"

    .line 170
    .line 171
    move-object/from16 v16, v2

    .line 172
    .line 173
    move-object/from16 v2, p4

    .line 174
    .line 175
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v2, "X-Post-Params-Hash"

    .line 180
    .line 181
    move-object/from16 p4, v1

    .line 182
    .line 183
    move-object/from16 v1, p6

    .line 184
    .line 185
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 186
    .line 187
    .line 188
    move-result-object v17

    .line 189
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 190
    .line 191
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->getCustomEntitlementComputation()Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_1

    .line 196
    .line 197
    move-object/from16 v1, v16

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_1
    const/4 v1, 0x0

    .line 201
    :goto_1
    const-string v2, "X-Custom-Entitlements-Computation"

    .line 202
    .line 203
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 204
    .line 205
    .line 206
    move-result-object v18

    .line 207
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->getUiPreviewMode()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_2

    .line 214
    .line 215
    move-object/from16 v2, v16

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_2
    const/4 v2, 0x0

    .line 219
    :goto_2
    const-string v1, "X-UI-Preview-Mode"

    .line 220
    .line 221
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 222
    .line 223
    .line 224
    move-result-object v19

    .line 225
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->storefrontProvider:Lcom/revenuecat/purchases/interfaces/StorefrontProvider;

    .line 226
    .line 227
    invoke-interface {v1}, Lcom/revenuecat/purchases/interfaces/StorefrontProvider;->getStorefront()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    const-string v2, "X-Storefront"

    .line 232
    .line 233
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 234
    .line 235
    .line 236
    move-result-object v20

    .line 237
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 238
    .line 239
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->isDebugBuild()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    const-string v2, "X-Is-Debug-Build"

    .line 248
    .line 249
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 250
    .line 251
    .line 252
    move-result-object v21

    .line 253
    sget-object v1, LTd/l;->f:LTd/l;

    .line 254
    .line 255
    invoke-virtual {v1}, LTd/l;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    const-string v2, "X-Kotlin-Version"

    .line 260
    .line 261
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 262
    .line 263
    .line 264
    move-result-object v22

    .line 265
    iget-object v1, v0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 266
    .line 267
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/AppConfig;->isAppBackgrounded()Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    const-string v2, "X-Is-Backgrounded"

    .line 276
    .line 277
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 278
    .line 279
    .line 280
    move-result-object v23

    .line 281
    const-string v1, "X-Billing-Client-Sdk-Version"

    .line 282
    .line 283
    const-string v2, "8.0.0"

    .line 284
    .line 285
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 286
    .line 287
    .line 288
    move-result-object v24

    .line 289
    move-object/from16 v16, p4

    .line 290
    .line 291
    filled-new-array/range {v3 .. v24}, [Lkotlin/Pair;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-static {v1}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    move-object/from16 v2, p1

    .line 300
    .line 301
    invoke-static {v1, v2}, LUd/S;->p(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    iget-object v2, v0, Lcom/revenuecat/purchases/common/HTTPClient;->eTagManager:Lcom/revenuecat/purchases/common/networking/ETagManager;

    .line 306
    .line 307
    invoke-virtual/range {p2 .. p2}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    const-string v4, "fullURL.toString()"

    .line 312
    .line 313
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    move/from16 v4, p3

    .line 317
    .line 318
    move/from16 v5, p5

    .line 319
    .line 320
    invoke-virtual {v2, v3, v5, v4}, Lcom/revenuecat/purchases/common/networking/ETagManager;->getETagHeaders$purchases_defaultsBc8Release(Ljava/lang/String;ZZ)Ljava/util/Map;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-static {v1, v2}, LUd/S;->p(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-static {v1}, Lcom/revenuecat/purchases/utils/MapExtensionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    return-object v1
.end method

.method private final getInputStream(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception v0

    .line 7
    instance-of v1, v0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    instance-of v1, v0, Ljava/io/IOException;

    .line 14
    .line 15
    :goto_0
    if-eqz v1, :cond_2

    .line 16
    .line 17
    sget-object v1, Lcom/revenuecat/purchases/common/LogIntent;->WARNING:Lcom/revenuecat/purchases/common/LogIntent;

    .line 18
    .line 19
    new-instance v2, Lcom/revenuecat/purchases/common/HTTPClient$getInputStream$$inlined$log$1;

    .line 20
    .line 21
    invoke-direct {v2, v1, v0}, Lcom/revenuecat/purchases/common/HTTPClient$getInputStream$$inlined$log$1;-><init>(Lcom/revenuecat/purchases/common/LogIntent;Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    aget v0, v0, v1

    .line 31
    .line 32
    const-string v1, "[Purchases] - ERROR"

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const-string v4, "[Purchases] - "

    .line 36
    .line 37
    packed-switch v0, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :pswitch_0
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-interface {v0, v1, v2, v3}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :pswitch_1
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 58
    .line 59
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 64
    .line 65
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-gtz v3, :cond_1

    .line 74
    .line 75
    new-instance v3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :pswitch_2
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {v0, v1, v2, v3}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_2

    .line 119
    .line 120
    :pswitch_3
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 121
    .line 122
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 127
    .line 128
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-gtz v3, :cond_1

    .line 137
    .line 138
    new-instance v3, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :pswitch_4
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 169
    .line 170
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 175
    .line 176
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-gtz v3, :cond_1

    .line 185
    .line 186
    new-instance v3, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Ljava/lang/String;

    .line 210
    .line 211
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_2

    .line 215
    .line 216
    :pswitch_5
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 217
    .line 218
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 223
    .line 224
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-gtz v3, :cond_1

    .line 233
    .line 234
    new-instance v3, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    check-cast v2, Ljava/lang/String;

    .line 258
    .line 259
    :goto_1
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :pswitch_6
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 265
    .line 266
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 271
    .line 272
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-gtz v3, :cond_1

    .line 281
    .line 282
    new-instance v3, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    check-cast v2, Ljava/lang/String;

    .line 306
    .line 307
    goto :goto_1

    .line 308
    :pswitch_7
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 309
    .line 310
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 315
    .line 316
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-gtz v3, :cond_1

    .line 325
    .line 326
    new-instance v3, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    check-cast v2, Ljava/lang/String;

    .line 350
    .line 351
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_2

    .line 355
    .line 356
    :pswitch_8
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, Ljava/lang/String;

    .line 365
    .line 366
    invoke-interface {v0, v1, v2, v3}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_2

    .line 370
    .line 371
    :pswitch_9
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 372
    .line 373
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 378
    .line 379
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    if-gtz v3, :cond_1

    .line 388
    .line 389
    new-instance v3, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    check-cast v2, Ljava/lang/String;

    .line 413
    .line 414
    goto/16 :goto_1

    .line 415
    .line 416
    :pswitch_a
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 417
    .line 418
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 423
    .line 424
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    if-gtz v3, :cond_1

    .line 433
    .line 434
    new-instance v3, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    check-cast v2, Ljava/lang/String;

    .line 458
    .line 459
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    goto :goto_2

    .line 463
    :pswitch_b
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 464
    .line 465
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 470
    .line 471
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-gtz v3, :cond_1

    .line 480
    .line 481
    new-instance v3, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    check-cast v2, Ljava/lang/String;

    .line 505
    .line 506
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    goto :goto_2

    .line 510
    :pswitch_c
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    check-cast v2, Ljava/lang/String;

    .line 519
    .line 520
    invoke-interface {v0, v1, v2, v3}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 521
    .line 522
    .line 523
    goto :goto_2

    .line 524
    :pswitch_d
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 525
    .line 526
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 531
    .line 532
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    if-gtz v3, :cond_1

    .line 541
    .line 542
    new-instance v3, Ljava/lang/StringBuilder;

    .line 543
    .line 544
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    check-cast v2, Ljava/lang/String;

    .line 566
    .line 567
    goto/16 :goto_1

    .line 568
    .line 569
    :cond_1
    :goto_2
    :try_start_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 570
    .line 571
    .line 572
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    .line 573
    return-object p1

    .line 574
    :catch_1
    move-exception p1

    .line 575
    new-instance v0, Lcom/revenuecat/purchases/common/networking/NullPointerReadingErrorStreamException;

    .line 576
    .line 577
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-direct {v0, v1, p1}, Lcom/revenuecat/purchases/common/networking/NullPointerReadingErrorStreamException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 582
    .line 583
    .line 584
    throw v0

    .line 585
    :cond_2
    throw v0

    .line 586
    nop

    .line 587
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getLoadShedderHeader(Ljava/net/URLConnection;)Z
    .locals 1

    .line 1
    const-string v0, "x-revenuecat-fortress"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "toLowerCase(...)"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    const-string v0, "true"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method private final getRequestDateHeader(Ljava/net/URLConnection;)Ljava/util/Date;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/common/HTTPClient;->getRequestTimeHeader(Ljava/net/URLConnection;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    new-instance p1, Ljava/util/Date;

    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method private final getRequestTimeHeader(Ljava/net/URLConnection;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "X-RevenueCat-Request-Time"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LDf/r;->l0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    return-object v0
.end method

.method private final getXPlatformHeader()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/common/AppConfig;->getStore()Lcom/revenuecat/purchases/Store;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/revenuecat/purchases/common/HTTPClient$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const-string v0, "amazon"

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const-string v0, "android"

    .line 22
    .line 23
    return-object v0
.end method

.method private final performCall(Ljava/net/URL;ZLcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Z",
            "Lcom/revenuecat/purchases/common/networking/Endpoint;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/revenuecat/purchases/common/networking/HTTPResult;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v9, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    move-object/from16 v2, p4

    .line 10
    .line 11
    move-object/from16 v3, p5

    .line 12
    .line 13
    const/4 v10, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v4, v1, Lcom/revenuecat/purchases/common/HTTPClient;->mapConverter:Lcom/revenuecat/purchases/common/networking/MapConverter;

    .line 17
    .line 18
    invoke-virtual {v4, v2}, Lcom/revenuecat/purchases/common/networking/MapConverter;->convertToJSON$purchases_defaultsBc8Release(Ljava/util/Map;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v11, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v11, v10

    .line 25
    :goto_0
    invoke-virtual {v8, v9}, Lcom/revenuecat/purchases/common/networking/Endpoint;->getPath(Z)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    iget-object v2, v1, Lcom/revenuecat/purchases/common/HTTPClient;->signingManager:Lcom/revenuecat/purchases/common/verification/SigningManager;

    .line 30
    .line 31
    invoke-virtual {v2, v8}, Lcom/revenuecat/purchases/common/verification/SigningManager;->shouldVerifyEndpoint(Lcom/revenuecat/purchases/common/networking/Endpoint;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v13, 0x0

    .line 36
    const/4 v14, 0x1

    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    invoke-virtual {v8}, Lcom/revenuecat/purchases/common/networking/Endpoint;->getNeedsNonceToPerformSigning()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    move v2, v14

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v2, v13

    .line 48
    :goto_1
    iget-object v4, v1, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 49
    .line 50
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/AppConfig;->getRunningTests()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const-string v15, "[Purchases] - "

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    iget-object v4, v1, Lcom/revenuecat/purchases/common/HTTPClient;->forceServerErrorStrategy:Lcom/revenuecat/purchases/ForceServerErrorStrategy;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-interface {v4, v0, v8}, Lcom/revenuecat/purchases/ForceServerErrorStrategy;->fakeResponseWithoutPerformingRequest(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 69
    .line 70
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 75
    .line 76
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-gtz v3, :cond_2

    .line 85
    .line 86
    new-instance v3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v5, "Faking response for request to "

    .line 111
    .line 112
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-static {v8, v13, v14, v10}, Lcom/revenuecat/purchases/common/networking/Endpoint;->getPath$default(Lcom/revenuecat/purchases/common/networking/Endpoint;ZILjava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v2, v0, v3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_2
    return-object v4

    .line 130
    :cond_3
    :try_start_0
    iget-object v4, v1, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 131
    .line 132
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/AppConfig;->getRunningTests()Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eqz v4, :cond_5

    .line 137
    .line 138
    iget-object v4, v1, Lcom/revenuecat/purchases/common/HTTPClient;->forceServerErrorStrategy:Lcom/revenuecat/purchases/ForceServerErrorStrategy;

    .line 139
    .line 140
    if-eqz v4, :cond_5

    .line 141
    .line 142
    invoke-interface {v4, v0, v8}, Lcom/revenuecat/purchases/ForceServerErrorStrategy;->shouldForceServerError(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-ne v4, v14, :cond_5

    .line 147
    .line 148
    sget-object v4, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 149
    .line 150
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    sget-object v7, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 155
    .line 156
    invoke-virtual {v7}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-virtual {v7, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-gtz v7, :cond_4

    .line 165
    .line 166
    new-instance v7, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    new-instance v7, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const-string v10, "Forcing server error for request to "

    .line 191
    .line 192
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    new-instance v10, Ljava/net/URL;

    .line 196
    .line 197
    invoke-direct {v10, v0, v12}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-interface {v5, v4, v7}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :catch_0
    move-exception v0

    .line 212
    move-object v11, v1

    .line 213
    goto/16 :goto_18

    .line 214
    .line 215
    :cond_4
    :goto_2
    new-instance v4, Ljava/net/URL;

    .line 216
    .line 217
    iget-object v5, v1, Lcom/revenuecat/purchases/common/HTTPClient;->forceServerErrorStrategy:Lcom/revenuecat/purchases/ForceServerErrorStrategy;

    .line 218
    .line 219
    invoke-interface {v5}, Lcom/revenuecat/purchases/ForceServerErrorStrategy;->getServerErrorURL()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-direct {v4, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_5
    new-instance v4, Ljava/net/URL;

    .line 228
    .line 229
    invoke-direct {v4, v0, v12}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :goto_3
    if-eqz v2, :cond_6

    .line 233
    .line 234
    iget-object v2, v1, Lcom/revenuecat/purchases/common/HTTPClient;->signingManager:Lcom/revenuecat/purchases/common/verification/SigningManager;

    .line 235
    .line 236
    invoke-virtual {v2}, Lcom/revenuecat/purchases/common/verification/SigningManager;->createRandomNonce()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    move-object v5, v2

    .line 241
    goto :goto_4

    .line 242
    :cond_6
    const/4 v5, 0x0

    .line 243
    :goto_4
    if-eqz v3, :cond_8

    .line 244
    .line 245
    if-eqz v6, :cond_7

    .line 246
    .line 247
    move-object v2, v3

    .line 248
    goto :goto_5

    .line 249
    :cond_7
    const/4 v2, 0x0

    .line 250
    :goto_5
    if-eqz v2, :cond_8

    .line 251
    .line 252
    iget-object v2, v1, Lcom/revenuecat/purchases/common/HTTPClient;->signingManager:Lcom/revenuecat/purchases/common/verification/SigningManager;

    .line 253
    .line 254
    invoke-virtual {v2, v8, v3}, Lcom/revenuecat/purchases/common/verification/SigningManager;->getPostParamsForSigningHeaderIfNeeded(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/List;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    move-object v7, v2

    .line 259
    move-object v3, v4

    .line 260
    move-object/from16 v2, p6

    .line 261
    .line 262
    :goto_6
    move/from16 v4, p7

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_8
    const/4 v7, 0x0

    .line 266
    move-object/from16 v2, p6

    .line 267
    .line 268
    move-object v3, v4

    .line 269
    goto :goto_6

    .line 270
    :goto_7
    invoke-direct/range {v1 .. v7}, Lcom/revenuecat/purchases/common/HTTPClient;->getHeaders(Ljava/util/Map;Ljava/net/URL;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    move-object v2, v3

    .line 275
    new-instance v3, Lcom/revenuecat/purchases/common/networking/HTTPRequest;

    .line 276
    .line 277
    invoke-direct {v3, v2, v10, v11}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;-><init>(Ljava/net/URL;Ljava/util/Map;Lorg/json/JSONObject;)V

    .line 278
    .line 279
    .line 280
    iget-boolean v4, v1, Lcom/revenuecat/purchases/common/HTTPClient;->enableExtraRequestLogging:Z

    .line 281
    .line 282
    if-eqz v4, :cond_9

    .line 283
    .line 284
    sget-object v4, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 285
    .line 286
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    sget-object v17, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 291
    .line 292
    invoke-virtual/range {v17 .. v17}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    invoke-virtual {v13, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    if-gtz v13, :cond_9

    .line 301
    .line 302
    new-instance v13, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    new-instance v13, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    .line 325
    .line 326
    const-string v14, "HTTP request:\\n "

    .line 327
    .line 328
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/common/HTTPClient;->toCurlRequest(Lcom/revenuecat/purchases/common/networking/HTTPRequest;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v14

    .line 335
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v13

    .line 342
    invoke-interface {v10, v4, v13}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    :cond_9
    iget-object v4, v1, Lcom/revenuecat/purchases/common/HTTPClient;->timeoutManager:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;

    .line 346
    .line 347
    invoke-virtual {v8}, Lcom/revenuecat/purchases/common/networking/Endpoint;->getSupportsFallbackBaseURLs()Z

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    if-eqz v8, :cond_a

    .line 352
    .line 353
    iget-object v8, v1, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 354
    .line 355
    invoke-virtual {v8}, Lcom/revenuecat/purchases/common/AppConfig;->getFallbackBaseURLs()Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 360
    .line 361
    .line 362
    move-result v8

    .line 363
    if-nez v8, :cond_a

    .line 364
    .line 365
    const/4 v13, 0x1

    .line 366
    goto :goto_8

    .line 367
    :cond_a
    const/4 v13, 0x0

    .line 368
    :goto_8
    invoke-virtual {v4, v9, v13}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->getTimeoutForRequest(ZZ)J

    .line 369
    .line 370
    .line 371
    move-result-wide v13

    .line 372
    invoke-direct {v1, v3, v13, v14}, Lcom/revenuecat/purchases/common/HTTPClient;->getConnection(Lcom/revenuecat/purchases/common/networking/HTTPRequest;J)Ljava/net/HttpURLConnection;

    .line 373
    .line 374
    .line 375
    move-result-object v8
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    invoke-direct {v1, v8}, Lcom/revenuecat/purchases/common/HTTPClient;->getInputStream(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    :try_start_1
    sget-object v4, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 381
    .line 382
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    sget-object v13, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 387
    .line 388
    invoke-virtual {v13}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 389
    .line 390
    .line 391
    move-result-object v14

    .line 392
    invoke-virtual {v14, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 393
    .line 394
    .line 395
    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 396
    move-object/from16 v17, v2

    .line 397
    .line 398
    const-string v2, "format(...)"

    .line 399
    .line 400
    if-gtz v14, :cond_b

    .line 401
    .line 402
    :try_start_2
    new-instance v14, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    move-object/from16 p4, v5

    .line 411
    .line 412
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    const-string v14, "API request started: %s %s"

    .line 424
    .line 425
    move/from16 p5, v6

    .line 426
    .line 427
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    filled-new-array {v6, v12}, [Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    move-object/from16 v18, v7

    .line 436
    .line 437
    const/4 v7, 0x2

    .line 438
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    invoke-static {v14, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-interface {v10, v5, v6}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    goto :goto_a

    .line 453
    :catchall_0
    move-exception v0

    .line 454
    move-object v11, v1

    .line 455
    move-object/from16 p3, v3

    .line 456
    .line 457
    :goto_9
    move-object v3, v8

    .line 458
    goto/16 :goto_15

    .line 459
    .line 460
    :cond_b
    move-object/from16 p4, v5

    .line 461
    .line 462
    move/from16 p5, v6

    .line 463
    .line 464
    move-object/from16 v18, v7

    .line 465
    .line 466
    :goto_a
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    if-eqz v3, :cond_c

    .line 471
    .line 472
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/common/HTTPClient;->readFully(Ljava/io/InputStream;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    move-object v14, v5

    .line 477
    goto :goto_b

    .line 478
    :cond_c
    const/4 v14, 0x0

    .line 479
    :goto_b
    iget-boolean v5, v1, Lcom/revenuecat/purchases/common/HTTPClient;->enableExtraRequestLogging:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 480
    .line 481
    if-eqz v5, :cond_d

    .line 482
    .line 483
    :try_start_3
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    invoke-virtual {v13}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 488
    .line 489
    .line 490
    move-result-object v6

    .line 491
    invoke-virtual {v6, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 492
    .line 493
    .line 494
    move-result v6

    .line 495
    if-gtz v6, :cond_d

    .line 496
    .line 497
    new-instance v6, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v7

    .line 509
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    new-instance v7, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 519
    .line 520
    .line 521
    move-object/from16 p3, v3

    .line 522
    .line 523
    :try_start_4
    const-string v3, "HTTP response:\\n  status code: "

    .line 524
    .line 525
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    const-string v3, " \\n  body: "

    .line 532
    .line 533
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    invoke-interface {v5, v6, v3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 544
    .line 545
    .line 546
    goto :goto_d

    .line 547
    :catchall_1
    move-exception v0

    .line 548
    :goto_c
    move-object v11, v1

    .line 549
    goto :goto_9

    .line 550
    :catchall_2
    move-exception v0

    .line 551
    move-object/from16 p3, v3

    .line 552
    .line 553
    goto :goto_c

    .line 554
    :cond_d
    move-object/from16 p3, v3

    .line 555
    .line 556
    :goto_d
    if-eqz p3, :cond_e

    .line 557
    .line 558
    invoke-virtual/range {p3 .. p3}, Ljava/io/InputStream;->close()V

    .line 559
    .line 560
    .line 561
    :cond_e
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 562
    .line 563
    .line 564
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    invoke-virtual {v13}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 573
    .line 574
    .line 575
    move-result v5

    .line 576
    if-gtz v5, :cond_f

    .line 577
    .line 578
    new-instance v5, Ljava/lang/StringBuilder;

    .line 579
    .line 580
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v5

    .line 601
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 602
    .line 603
    .line 604
    move-result-object v6

    .line 605
    filled-new-array {v5, v12, v6}, [Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    const/4 v6, 0x3

    .line 610
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    const-string v6, "API request completed with status: %s %s %s"

    .line 615
    .line 616
    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    invoke-interface {v3, v4, v5}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    :cond_f
    if-eqz v14, :cond_18

    .line 627
    .line 628
    iget-object v2, v1, Lcom/revenuecat/purchases/common/HTTPClient;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 629
    .line 630
    invoke-virtual {v2}, Lcom/revenuecat/purchases/common/AppConfig;->getRunningTests()Z

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    const-string v13, "fullURL.toString()"

    .line 635
    .line 636
    if-eqz v2, :cond_13

    .line 637
    .line 638
    iget-object v2, v1, Lcom/revenuecat/purchases/common/HTTPClient;->requestResponseListener:Lcom/revenuecat/purchases/common/RequestResponseListener;

    .line 639
    .line 640
    if-eqz v2, :cond_13

    .line 641
    .line 642
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 643
    .line 644
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v8}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    const-string v5, "connection.headerFields"

    .line 652
    .line 653
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    :cond_10
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 665
    .line 666
    .line 667
    move-result v5

    .line 668
    if-eqz v5, :cond_11

    .line 669
    .line 670
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v5

    .line 674
    check-cast v5, Ljava/util/Map$Entry;

    .line 675
    .line 676
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v6

    .line 680
    check-cast v6, Ljava/lang/String;

    .line 681
    .line 682
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    check-cast v5, Ljava/util/List;

    .line 687
    .line 688
    if-eqz v6, :cond_10

    .line 689
    .line 690
    const-string v7, "values"

    .line 691
    .line 692
    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 696
    .line 697
    .line 698
    move-result v7

    .line 699
    if-nez v7, :cond_10

    .line 700
    .line 701
    const/16 v26, 0x3e

    .line 702
    .line 703
    const/16 v27, 0x0

    .line 704
    .line 705
    const-string v20, ", "

    .line 706
    .line 707
    const/16 v21, 0x0

    .line 708
    .line 709
    const/16 v22, 0x0

    .line 710
    .line 711
    const/16 v23, 0x0

    .line 712
    .line 713
    const/16 v24, 0x0

    .line 714
    .line 715
    const/16 v25, 0x0

    .line 716
    .line 717
    move-object/from16 v19, v5

    .line 718
    .line 719
    invoke-static/range {v19 .. v27}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    goto :goto_e

    .line 727
    :cond_11
    :try_start_5
    new-instance v4, Ljava/net/URL;

    .line 728
    .line 729
    invoke-direct {v4, v0, v12}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-static {v0, v13}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v5

    .line 743
    const-string v6, "connection.requestMethod"

    .line 744
    .line 745
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 746
    .line 747
    .line 748
    move/from16 v6, p5

    .line 749
    .line 750
    move-object/from16 v16, v2

    .line 751
    .line 752
    move-object/from16 v22, v3

    .line 753
    .line 754
    move-object v3, v4

    .line 755
    move-object/from16 v24, v17

    .line 756
    .line 757
    move-object/from16 v7, v18

    .line 758
    .line 759
    const/16 v17, 0x0

    .line 760
    .line 761
    move-object/from16 v2, p6

    .line 762
    .line 763
    move/from16 v4, p7

    .line 764
    .line 765
    move-object/from16 v18, v5

    .line 766
    .line 767
    move-object/from16 v5, p4

    .line 768
    .line 769
    :try_start_6
    invoke-direct/range {v1 .. v7}, Lcom/revenuecat/purchases/common/HTTPClient;->getHeaders(Ljava/util/Map;Ljava/net/URL;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;

    .line 770
    .line 771
    .line 772
    move-result-object v19

    .line 773
    if-eqz v11, :cond_12

    .line 774
    .line 775
    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 779
    move-object/from16 v20, v1

    .line 780
    .line 781
    move-object/from16 v17, v0

    .line 782
    .line 783
    move/from16 v21, v10

    .line 784
    .line 785
    move-object/from16 v23, v14

    .line 786
    .line 787
    goto :goto_f

    .line 788
    :catchall_3
    move-exception v0

    .line 789
    move-object v2, v14

    .line 790
    goto :goto_10

    .line 791
    :cond_12
    move-object/from16 v20, v17

    .line 792
    .line 793
    move/from16 v21, v10

    .line 794
    .line 795
    move-object/from16 v23, v14

    .line 796
    .line 797
    move-object/from16 v17, v0

    .line 798
    .line 799
    :goto_f
    :try_start_7
    invoke-interface/range {v16 .. v23}, Lcom/revenuecat/purchases/common/RequestResponseListener;->onRequestResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 800
    .line 801
    .line 802
    move/from16 v10, v21

    .line 803
    .line 804
    move-object/from16 v2, v23

    .line 805
    .line 806
    goto :goto_11

    .line 807
    :catchall_4
    move-exception v0

    .line 808
    move/from16 v10, v21

    .line 809
    .line 810
    move-object/from16 v2, v23

    .line 811
    .line 812
    goto :goto_10

    .line 813
    :catchall_5
    move-exception v0

    .line 814
    move-object/from16 v5, p4

    .line 815
    .line 816
    move/from16 v6, p5

    .line 817
    .line 818
    move-object v2, v14

    .line 819
    move-object/from16 v24, v17

    .line 820
    .line 821
    move-object/from16 v7, v18

    .line 822
    .line 823
    :goto_10
    sget-object v1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 824
    .line 825
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 830
    .line 831
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    invoke-virtual {v4, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 836
    .line 837
    .line 838
    move-result v4

    .line 839
    if-gtz v4, :cond_14

    .line 840
    .line 841
    new-instance v4, Ljava/lang/StringBuilder;

    .line 842
    .line 843
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    new-instance v4, Ljava/lang/StringBuilder;

    .line 861
    .line 862
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 863
    .line 864
    .line 865
    const-string v11, "RequestResponseListener error: "

    .line 866
    .line 867
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-interface {v3, v1, v0}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    goto :goto_11

    .line 885
    :cond_13
    move-object/from16 v5, p4

    .line 886
    .line 887
    move/from16 v6, p5

    .line 888
    .line 889
    move-object v2, v14

    .line 890
    move-object/from16 v24, v17

    .line 891
    .line 892
    move-object/from16 v7, v18

    .line 893
    .line 894
    :cond_14
    :goto_11
    if-eqz v6, :cond_15

    .line 895
    .line 896
    sget-object v0, Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;->INSTANCE:Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;

    .line 897
    .line 898
    invoke-virtual {v0, v10}, Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;->isSuccessful(I)Z

    .line 899
    .line 900
    .line 901
    move-result v0

    .line 902
    if-eqz v0, :cond_15

    .line 903
    .line 904
    move-object/from16 v1, p0

    .line 905
    .line 906
    move-object v4, v2

    .line 907
    move-object v6, v7

    .line 908
    move-object v3, v8

    .line 909
    move-object v2, v12

    .line 910
    invoke-direct/range {v1 .. v6}, Lcom/revenuecat/purchases/common/HTTPClient;->verifyResponse(Ljava/lang/String;Ljava/net/URLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    move-object v11, v1

    .line 915
    :goto_12
    move-object v7, v0

    .line 916
    goto :goto_13

    .line 917
    :cond_15
    move-object/from16 v11, p0

    .line 918
    .line 919
    move-object v4, v2

    .line 920
    move-object v3, v8

    .line 921
    move-object v2, v12

    .line 922
    sget-object v0, Lcom/revenuecat/purchases/VerificationResult;->NOT_REQUESTED:Lcom/revenuecat/purchases/VerificationResult;

    .line 923
    .line 924
    goto :goto_12

    .line 925
    :goto_13
    sget-object v0, Lcom/revenuecat/purchases/VerificationResult;->FAILED:Lcom/revenuecat/purchases/VerificationResult;

    .line 926
    .line 927
    if-ne v7, v0, :cond_17

    .line 928
    .line 929
    iget-object v0, v11, Lcom/revenuecat/purchases/common/HTTPClient;->signingManager:Lcom/revenuecat/purchases/common/verification/SigningManager;

    .line 930
    .line 931
    invoke-virtual {v0}, Lcom/revenuecat/purchases/common/verification/SigningManager;->getSignatureVerificationMode()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    instance-of v0, v0, Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Enforced;

    .line 936
    .line 937
    if-nez v0, :cond_16

    .line 938
    .line 939
    goto :goto_14

    .line 940
    :cond_16
    new-instance v0, Lcom/revenuecat/purchases/common/verification/SignatureVerificationException;

    .line 941
    .line 942
    invoke-direct {v0, v2}, Lcom/revenuecat/purchases/common/verification/SignatureVerificationException;-><init>(Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    throw v0

    .line 946
    :cond_17
    :goto_14
    invoke-direct {v11, v3}, Lcom/revenuecat/purchases/common/HTTPClient;->getLoadShedderHeader(Ljava/net/URLConnection;)Z

    .line 947
    .line 948
    .line 949
    move-result v8

    .line 950
    iget-object v0, v11, Lcom/revenuecat/purchases/common/HTTPClient;->eTagManager:Lcom/revenuecat/purchases/common/networking/ETagManager;

    .line 951
    .line 952
    invoke-direct {v11, v3}, Lcom/revenuecat/purchases/common/HTTPClient;->getETagHeader(Ljava/net/URLConnection;)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    invoke-virtual/range {v24 .. v24}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    invoke-static {v2, v13}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 961
    .line 962
    .line 963
    invoke-direct {v11, v3}, Lcom/revenuecat/purchases/common/HTTPClient;->getRequestDateHeader(Ljava/net/URLConnection;)Ljava/util/Date;

    .line 964
    .line 965
    .line 966
    move-result-object v6

    .line 967
    move-object v3, v4

    .line 968
    move-object v4, v2

    .line 969
    move-object v2, v3

    .line 970
    move/from16 v5, p7

    .line 971
    .line 972
    move-object v3, v1

    .line 973
    move v1, v10

    .line 974
    invoke-virtual/range {v0 .. v9}, Lcom/revenuecat/purchases/common/networking/ETagManager;->getHTTPResultFromCacheOrBackend$purchases_defaultsBc8Release(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZ)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    return-object v0

    .line 979
    :cond_18
    move-object v11, v1

    .line 980
    new-instance v0, Ljava/io/IOException;

    .line 981
    .line 982
    const-string v1, "HTTP Response payload is null"

    .line 983
    .line 984
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    throw v0

    .line 988
    :goto_15
    :try_start_8
    iget-boolean v1, v11, Lcom/revenuecat/purchases/common/HTTPClient;->enableExtraRequestLogging:Z

    .line 989
    .line 990
    if-eqz v1, :cond_19

    .line 991
    .line 992
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    const-string v2, "[Purchases] - ERROR"

    .line 997
    .line 998
    const-string v4, "HTTP request failed"

    .line 999
    .line 1000
    invoke-interface {v1, v2, v4, v0}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1001
    .line 1002
    .line 1003
    goto :goto_16

    .line 1004
    :catchall_6
    move-exception v0

    .line 1005
    goto :goto_17

    .line 1006
    :cond_19
    :goto_16
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1007
    :goto_17
    if-eqz p3, :cond_1a

    .line 1008
    .line 1009
    invoke-virtual/range {p3 .. p3}, Ljava/io/InputStream;->close()V

    .line 1010
    .line 1011
    .line 1012
    :cond_1a
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 1013
    .line 1014
    .line 1015
    throw v0

    .line 1016
    :goto_18
    new-instance v1, Ljava/lang/RuntimeException;

    .line 1017
    .line 1018
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1019
    .line 1020
    .line 1021
    throw v1
.end method

.method private static final performRequest$canUseFallback(Lcom/revenuecat/purchases/common/networking/Endpoint;ILjava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/common/networking/Endpoint;",
            "I",
            "Ljava/util/List<",
            "Ljava/net/URL;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/common/networking/Endpoint;->getSupportsFallbackBaseURLs()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ge p1, p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static synthetic performRequest$default(Lcom/revenuecat/purchases/common/HTTPClient;Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;IILjava/lang/Object;)Lcom/revenuecat/purchases/common/networking/HTTPResult;
    .locals 1

    .line 1
    and-int/lit8 p10, p9, 0x20

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p10, :cond_0

    .line 5
    .line 6
    move p6, v0

    .line 7
    :cond_0
    and-int/lit8 p10, p9, 0x40

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p7

    .line 15
    :cond_1
    and-int/lit16 p9, p9, 0x80

    .line 16
    .line 17
    if-eqz p9, :cond_2

    .line 18
    .line 19
    move p8, v0

    .line 20
    :cond_2
    invoke-virtual/range {p0 .. p8}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;I)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method private static final performRequest$performRequestToFallbackURL(Ljava/util/List;ILcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/net/URL;",
            ">;I",
            "Lcom/revenuecat/purchases/common/HTTPClient;",
            "Lcom/revenuecat/purchases/common/networking/Endpoint;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/revenuecat/purchases/common/networking/HTTPResult;"
        }
    .end annotation

    .line 1
    invoke-interface/range {p0 .. p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Ljava/net/URL;

    .line 7
    .line 8
    sget-object v0, Lcom/revenuecat/purchases/common/LogIntent;->DEBUG:Lcom/revenuecat/purchases/common/LogIntent;

    .line 9
    .line 10
    new-instance v1, Lcom/revenuecat/purchases/common/HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1;

    .line 11
    .line 12
    invoke-direct {v1, v0, p3, v2}, Lcom/revenuecat/purchases/common/HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1;-><init>(Lcom/revenuecat/purchases/common/LogIntent;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/net/URL;)V

    .line 13
    .line 14
    .line 15
    sget-object v3, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    aget v0, v3, v0

    .line 22
    .line 23
    const-string v3, "[Purchases] - ERROR"

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const-string v5, "[Purchases] - "

    .line 27
    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :pswitch_0
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {v0, v3, v1, v4}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :pswitch_1
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 49
    .line 50
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 55
    .line 56
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-gtz v4, :cond_0

    .line 65
    .line 66
    new-instance v4, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Ljava/lang/String;

    .line 90
    .line 91
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :pswitch_2
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ljava/lang/String;

    .line 105
    .line 106
    invoke-interface {v0, v3, v1, v4}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_1

    .line 110
    .line 111
    :pswitch_3
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 112
    .line 113
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 118
    .line 119
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-gtz v4, :cond_0

    .line 128
    .line 129
    new-instance v4, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    :pswitch_4
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 160
    .line 161
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 166
    .line 167
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-gtz v4, :cond_0

    .line 176
    .line 177
    new-instance v4, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Ljava/lang/String;

    .line 201
    .line 202
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :pswitch_5
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 208
    .line 209
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 214
    .line 215
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-gtz v4, :cond_0

    .line 224
    .line 225
    new-instance v4, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    check-cast v1, Ljava/lang/String;

    .line 249
    .line 250
    :goto_0
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_1

    .line 254
    .line 255
    :pswitch_6
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 256
    .line 257
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 262
    .line 263
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-gtz v4, :cond_0

    .line 272
    .line 273
    new-instance v4, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Ljava/lang/String;

    .line 297
    .line 298
    goto :goto_0

    .line 299
    :pswitch_7
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 300
    .line 301
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 306
    .line 307
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-gtz v4, :cond_0

    .line 316
    .line 317
    new-instance v4, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    check-cast v1, Ljava/lang/String;

    .line 341
    .line 342
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :pswitch_8
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    check-cast v1, Ljava/lang/String;

    .line 356
    .line 357
    invoke-interface {v0, v3, v1, v4}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    :pswitch_9
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 363
    .line 364
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 369
    .line 370
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-gtz v4, :cond_0

    .line 379
    .line 380
    new-instance v4, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    check-cast v1, Ljava/lang/String;

    .line 404
    .line 405
    goto/16 :goto_0

    .line 406
    .line 407
    :pswitch_a
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 408
    .line 409
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 414
    .line 415
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    if-gtz v4, :cond_0

    .line 424
    .line 425
    new-instance v4, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    check-cast v1, Ljava/lang/String;

    .line 449
    .line 450
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    goto :goto_1

    .line 454
    :pswitch_b
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 455
    .line 456
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 461
    .line 462
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    if-gtz v4, :cond_0

    .line 471
    .line 472
    new-instance v4, Ljava/lang/StringBuilder;

    .line 473
    .line 474
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    check-cast v1, Ljava/lang/String;

    .line 496
    .line 497
    invoke-interface {v3, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    goto :goto_1

    .line 501
    :pswitch_c
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    check-cast v1, Ljava/lang/String;

    .line 510
    .line 511
    invoke-interface {v0, v3, v1, v4}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 512
    .line 513
    .line 514
    goto :goto_1

    .line 515
    :pswitch_d
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 516
    .line 517
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 522
    .line 523
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    if-gtz v4, :cond_0

    .line 532
    .line 533
    new-instance v4, Ljava/lang/StringBuilder;

    .line 534
    .line 535
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    check-cast v1, Ljava/lang/String;

    .line 557
    .line 558
    goto/16 :goto_0

    .line 559
    .line 560
    :cond_0
    :goto_1
    add-int/lit8 v9, p1, 0x1

    .line 561
    .line 562
    move-object v8, p0

    .line 563
    move-object v1, p2

    .line 564
    move-object v3, p3

    .line 565
    move-object v4, p4

    .line 566
    move-object v5, p5

    .line 567
    move-object/from16 v6, p6

    .line 568
    .line 569
    move/from16 v7, p7

    .line 570
    .line 571
    invoke-virtual/range {v1 .. v9}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;I)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    return-object p0

    .line 576
    nop

    .line 577
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final readFully(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/common/HTTPClient;->buffer(Ljava/io/InputStream;)Ljava/io/BufferedReader;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lfe/v;->e(Ljava/io/Reader;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final toCurlRequest(Lcom/revenuecat/purchases/common/networking/HTTPRequest;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "curl -v "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;->getBody()Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v1, "GET"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v1, "POST"

    .line 18
    .line 19
    :goto_0
    const-string v2, "-X "

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " \\\n  "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;->getHeaders()Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/util/Map$Entry;

    .line 55
    .line 56
    const-string v3, "-H \""

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v3, ":"

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v2, "\" \\\n  "

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;->getBody()Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    const-string v1, "-d \'"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;->getBody()Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, "\' \\\n  "

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    :cond_2
    const-string v1, "\""

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/networking/HTTPRequest;->getFullURL()Ljava/net/URL;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string v0, "builder.toString()"

    .line 137
    .line 138
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-object p1
.end method

.method private final trackHttpRequestPerformedIfNeeded(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;ZLjava/io/IOException;)V
    .locals 12

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/common/HTTPClient;->diagnosticsTrackerIfEnabled:Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;

    .line 4
    .line 5
    if-eqz v1, :cond_8

    .line 6
    .line 7
    sget-object v2, LEf/a;->b:LEf/a$a;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/revenuecat/purchases/common/HTTPClient;->dateProvider:Lcom/revenuecat/purchases/common/DateProvider;

    .line 10
    .line 11
    invoke-interface {v3}, Lcom/revenuecat/purchases/common/DateProvider;->getNow()Ljava/util/Date;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v2, p3, v3}, Lcom/revenuecat/purchases/common/DurationExtensionsKt;->between(LEf/a$a;Ljava/util/Date;Ljava/util/Date;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    if-eqz p4, :cond_1

    .line 20
    .line 21
    if-eqz p5, :cond_0

    .line 22
    .line 23
    invoke-virtual/range {p5 .. p5}, Lcom/revenuecat/purchases/common/networking/HTTPResult;->getResponseCode()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    :goto_0
    move v6, p3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/16 p3, 0x130

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p3, -0x1

    .line 33
    goto :goto_0

    .line 34
    :goto_1
    const/4 p3, 0x0

    .line 35
    if-eqz p5, :cond_2

    .line 36
    .line 37
    invoke-virtual/range {p5 .. p5}, Lcom/revenuecat/purchases/common/networking/HTTPResult;->getOrigin()Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    move-object v8, v2

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move-object v8, p3

    .line 44
    :goto_2
    if-eqz p5, :cond_4

    .line 45
    .line 46
    invoke-virtual/range {p5 .. p5}, Lcom/revenuecat/purchases/common/networking/HTTPResult;->getVerificationResult()Lcom/revenuecat/purchases/VerificationResult;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_3
    :goto_3
    move-object v9, v2

    .line 54
    goto :goto_5

    .line 55
    :cond_4
    :goto_4
    sget-object v2, Lcom/revenuecat/purchases/VerificationResult;->NOT_REQUESTED:Lcom/revenuecat/purchases/VerificationResult;

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :goto_5
    if-eqz p4, :cond_5

    .line 59
    .line 60
    sget-object v2, Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;->INSTANCE:Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;

    .line 61
    .line 62
    invoke-virtual {v2, v6}, Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;->isSuccessful(I)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    :goto_6
    move v5, v2

    .line 70
    goto :goto_7

    .line 71
    :cond_5
    const/4 v2, 0x0

    .line 72
    goto :goto_6

    .line 73
    :goto_7
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object v2, Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason;->Companion:Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason$Companion;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason$Companion;->fromIOException(Ljava/io/IOException;)Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    move-object v11, v0

    .line 82
    goto :goto_8

    .line 83
    :cond_6
    move-object v11, p3

    .line 84
    :goto_8
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v0, "baseURL.host"

    .line 89
    .line 90
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    if-eqz p5, :cond_7

    .line 94
    .line 95
    invoke-virtual/range {p5 .. p5}, Lcom/revenuecat/purchases/common/networking/HTTPResult;->getBackendErrorCode()Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    :cond_7
    move-object v2, p2

    .line 100
    move-object v7, p3

    .line 101
    move/from16 v10, p6

    .line 102
    .line 103
    move-object v0, v1

    .line 104
    move-object v1, p1

    .line 105
    invoke-virtual/range {v0 .. v11}, Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;->trackHttpRequestPerformed--XzGXFE(Ljava/lang/String;Lcom/revenuecat/purchases/common/networking/Endpoint;JZILjava/lang/Integer;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Lcom/revenuecat/purchases/VerificationResult;ZLcom/revenuecat/purchases/common/networking/ConnectionErrorReason;)V

    .line 106
    .line 107
    .line 108
    :cond_8
    return-void
.end method

.method private final verifyResponse(Ljava/lang/String;Ljava/net/URLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/HTTPClient;->signingManager:Lcom/revenuecat/purchases/common/verification/SigningManager;

    .line 2
    .line 3
    const-string v1, "X-Signature"

    .line 4
    .line 5
    invoke-virtual {p2, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {p0, p2}, Lcom/revenuecat/purchases/common/HTTPClient;->getRequestTimeHeader(Ljava/net/URLConnection;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-direct {p0, p2}, Lcom/revenuecat/purchases/common/HTTPClient;->getETagHeader(Ljava/net/URLConnection;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    move-object v1, p1

    .line 18
    move-object v4, p3

    .line 19
    move-object v3, p4

    .line 20
    move-object v7, p5

    .line 21
    invoke-virtual/range {v0 .. v7}, Lcom/revenuecat/purchases/common/verification/SigningManager;->verifyResponse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method private final writeFully(Ljava/io/BufferedWriter;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/BufferedWriter;->flush()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final clearCaches()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/HTTPClient;->eTagManager:Lcom/revenuecat/purchases/common/networking/ETagManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/common/networking/ETagManager;->clearCaches$purchases_defaultsBc8Release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getSigningManager()Lcom/revenuecat/purchases/common/verification/SigningManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/HTTPClient;->signingManager:Lcom/revenuecat/purchases/common/verification/SigningManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final performRequest(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;I)Lcom/revenuecat/purchases/common/networking/HTTPResult;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Lcom/revenuecat/purchases/common/networking/Endpoint;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/List<",
            "Ljava/net/URL;",
            ">;I)",
            "Lcom/revenuecat/purchases/common/networking/HTTPResult;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v9, p7

    .line 6
    .line 7
    move/from16 v10, p8

    .line 8
    .line 9
    const-string v0, "baseURL"

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "endpoint"

    .line 17
    .line 18
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "requestHeaders"

    .line 22
    .line 23
    move-object/from16 v7, p5

    .line 24
    .line 25
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "fallbackBaseURLs"

    .line 29
    .line 30
    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v0, 0x1

    .line 35
    if-nez v10, :cond_0

    .line 36
    .line 37
    move v12, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v12, v11

    .line 40
    :goto_0
    iget-object v4, v1, Lcom/revenuecat/purchases/common/HTTPClient;->dateProvider:Lcom/revenuecat/purchases/common/DateProvider;

    .line 41
    .line 42
    invoke-interface {v4}, Lcom/revenuecat/purchases/common/DateProvider;->getNow()Ljava/util/Date;

    .line 43
    .line 44
    .line 45
    move-result-object v13

    .line 46
    sget-object v14, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;->OTHER_RESULT:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;

    .line 47
    .line 48
    if-lez v10, :cond_1

    .line 49
    .line 50
    move v3, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v3, v11

    .line 53
    :goto_1
    const/4 v15, 0x0

    .line 54
    const/16 v16, 0x0

    .line 55
    .line 56
    move-object/from16 v4, p2

    .line 57
    .line 58
    move-object/from16 v5, p3

    .line 59
    .line 60
    move-object/from16 v6, p4

    .line 61
    .line 62
    move/from16 v8, p6

    .line 63
    .line 64
    :try_start_0
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/common/HTTPClient;->performCall(Ljava/net/URL;ZLcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 65
    .line 66
    .line 67
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 68
    const/4 v5, 0x1

    .line 69
    if-eqz v12, :cond_2

    .line 70
    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    :try_start_1
    sget-object v2, Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;->INSTANCE:Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;

    .line 74
    .line 75
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/networking/HTTPResult;->getResponseCode()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-virtual {v2, v4}, Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;->isSuccessful(I)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-ne v2, v0, :cond_2

    .line 84
    .line 85
    sget-object v14, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;->SUCCESS_ON_MAIN_BACKEND:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object v6, v3

    .line 90
    move-object v4, v13

    .line 91
    move-object/from16 v8, v16

    .line 92
    .line 93
    goto/16 :goto_e

    .line 94
    .line 95
    :catch_0
    move-exception v0

    .line 96
    move-object v1, v0

    .line 97
    move-object v11, v3

    .line 98
    move/from16 v16, v5

    .line 99
    .line 100
    move-object/from16 v3, p2

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_2
    :goto_2
    iget-object v0, v1, Lcom/revenuecat/purchases/common/HTTPClient;->timeoutManager:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;

    .line 104
    .line 105
    invoke-virtual {v0, v14}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->recordRequestResult(Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v2, p1

    .line 109
    .line 110
    move/from16 v7, p6

    .line 111
    .line 112
    move-object v6, v3

    .line 113
    move-object v4, v13

    .line 114
    move-object/from16 v8, v16

    .line 115
    .line 116
    move-object/from16 v3, p2

    .line 117
    .line 118
    :goto_3
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/common/HTTPClient;->trackHttpRequestPerformedIfNeeded(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;ZLjava/io/IOException;)V

    .line 119
    .line 120
    .line 121
    move-object v0, v6

    .line 122
    goto/16 :goto_8

    .line 123
    .line 124
    :catchall_1
    move-exception v0

    .line 125
    move-object v3, v4

    .line 126
    move-object/from16 v8, v16

    .line 127
    .line 128
    move-object/from16 v1, p0

    .line 129
    .line 130
    move v5, v11

    .line 131
    move-object v4, v13

    .line 132
    move-object v6, v15

    .line 133
    goto/16 :goto_e

    .line 134
    .line 135
    :catch_1
    move-exception v0

    .line 136
    move-object v3, v4

    .line 137
    move-object v1, v0

    .line 138
    move/from16 v16, v11

    .line 139
    .line 140
    move-object v11, v15

    .line 141
    :goto_4
    :try_start_2
    instance-of v0, v1, Ljava/net/SocketTimeoutException;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 142
    .line 143
    if-eqz v0, :cond_3

    .line 144
    .line 145
    if-eqz v12, :cond_3

    .line 146
    .line 147
    :try_start_3
    invoke-static {v3, v10, v9}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest$canUseFallback(Lcom/revenuecat/purchases/common/networking/Endpoint;ILjava/util/List;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    sget-object v14, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;->TIMEOUT_ON_MAIN_BACKEND_FOR_FALLBACK_SUPPORTED_ENDPOINT:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 154
    .line 155
    move-object v2, v9

    .line 156
    move-object v9, v1

    .line 157
    move-object v1, v2

    .line 158
    move-object/from16 v5, p3

    .line 159
    .line 160
    move-object/from16 v6, p4

    .line 161
    .line 162
    move-object/from16 v7, p5

    .line 163
    .line 164
    move/from16 v8, p6

    .line 165
    .line 166
    move-object v4, v3

    .line 167
    move v2, v10

    .line 168
    move-object/from16 v3, p0

    .line 169
    .line 170
    :try_start_4
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest$performRequestToFallbackURL(Ljava/util/List;ILcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 171
    .line 172
    .line 173
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 174
    move-object v3, v4

    .line 175
    move-object/from16 v1, p0

    .line 176
    .line 177
    :goto_5
    move-object v6, v0

    .line 178
    goto :goto_7

    .line 179
    :catchall_2
    move-exception v0

    .line 180
    move-object v3, v4

    .line 181
    :goto_6
    move-object/from16 v1, p0

    .line 182
    .line 183
    move-object v8, v9

    .line 184
    move-object v6, v11

    .line 185
    move-object v4, v13

    .line 186
    move/from16 v5, v16

    .line 187
    .line 188
    goto/16 :goto_e

    .line 189
    .line 190
    :catchall_3
    move-exception v0

    .line 191
    move-object v9, v1

    .line 192
    goto :goto_6

    .line 193
    :cond_3
    move-object v2, v9

    .line 194
    move-object v9, v1

    .line 195
    move-object v1, v2

    .line 196
    move v2, v10

    .line 197
    :try_start_5
    invoke-static {v3, v2, v1}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest$canUseFallback(Lcom/revenuecat/purchases/common/networking/Endpoint;ILjava/util/List;)Z

    .line 198
    .line 199
    .line 200
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 201
    if-eqz v0, :cond_7

    .line 202
    .line 203
    move-object/from16 v5, p3

    .line 204
    .line 205
    move-object/from16 v6, p4

    .line 206
    .line 207
    move-object/from16 v7, p5

    .line 208
    .line 209
    move/from16 v8, p6

    .line 210
    .line 211
    move-object v4, v3

    .line 212
    move-object/from16 v3, p0

    .line 213
    .line 214
    :try_start_6
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest$performRequestToFallbackURL(Ljava/util/List;ILcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 215
    .line 216
    .line 217
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 218
    move-object v1, v3

    .line 219
    goto :goto_5

    .line 220
    :goto_7
    iget-object v0, v1, Lcom/revenuecat/purchases/common/HTTPClient;->timeoutManager:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;

    .line 221
    .line 222
    invoke-virtual {v0, v14}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->recordRequestResult(Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;)V

    .line 223
    .line 224
    .line 225
    move-object/from16 v2, p1

    .line 226
    .line 227
    move-object/from16 v3, p2

    .line 228
    .line 229
    move/from16 v7, p6

    .line 230
    .line 231
    move-object v8, v9

    .line 232
    move-object v4, v13

    .line 233
    move/from16 v5, v16

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :goto_8
    if-nez v0, :cond_5

    .line 237
    .line 238
    sget-object v0, Lcom/revenuecat/purchases/common/LogIntent;->WARNING:Lcom/revenuecat/purchases/common/LogIntent;

    .line 239
    .line 240
    new-instance v1, Lcom/revenuecat/purchases/common/HTTPClient$performRequest$$inlined$log$1;

    .line 241
    .line 242
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/common/HTTPClient$performRequest$$inlined$log$1;-><init>(Lcom/revenuecat/purchases/common/LogIntent;)V

    .line 243
    .line 244
    .line 245
    sget-object v2, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    aget v0, v2, v0

    .line 252
    .line 253
    const-string v2, "[Purchases] - ERROR"

    .line 254
    .line 255
    const-string v3, "[Purchases] - "

    .line 256
    .line 257
    packed-switch v0, :pswitch_data_0

    .line 258
    .line 259
    .line 260
    goto/16 :goto_a

    .line 261
    .line 262
    :pswitch_0
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    check-cast v1, Ljava/lang/String;

    .line 271
    .line 272
    invoke-interface {v0, v2, v1, v15}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_a

    .line 276
    .line 277
    :pswitch_1
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 278
    .line 279
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 284
    .line 285
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-gtz v4, :cond_4

    .line 294
    .line 295
    new-instance v4, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, Ljava/lang/String;

    .line 319
    .line 320
    invoke-interface {v2, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    goto/16 :goto_a

    .line 324
    .line 325
    :pswitch_2
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, Ljava/lang/String;

    .line 334
    .line 335
    invoke-interface {v0, v2, v1, v15}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    goto/16 :goto_a

    .line 339
    .line 340
    :pswitch_3
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 341
    .line 342
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 347
    .line 348
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-gtz v4, :cond_4

    .line 357
    .line 358
    new-instance v4, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    check-cast v1, Ljava/lang/String;

    .line 382
    .line 383
    invoke-interface {v2, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    goto/16 :goto_a

    .line 387
    .line 388
    :pswitch_4
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 389
    .line 390
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 395
    .line 396
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    if-gtz v4, :cond_4

    .line 405
    .line 406
    new-instance v4, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    check-cast v1, Ljava/lang/String;

    .line 430
    .line 431
    invoke-interface {v2, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_a

    .line 435
    .line 436
    :pswitch_5
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 437
    .line 438
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 443
    .line 444
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    if-gtz v4, :cond_4

    .line 453
    .line 454
    new-instance v4, Ljava/lang/StringBuilder;

    .line 455
    .line 456
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    check-cast v1, Ljava/lang/String;

    .line 478
    .line 479
    :goto_9
    invoke-interface {v2, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_a

    .line 483
    .line 484
    :pswitch_6
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 485
    .line 486
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 491
    .line 492
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    if-gtz v4, :cond_4

    .line 501
    .line 502
    new-instance v4, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, Ljava/lang/String;

    .line 526
    .line 527
    goto :goto_9

    .line 528
    :pswitch_7
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 529
    .line 530
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 535
    .line 536
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    if-gtz v4, :cond_4

    .line 545
    .line 546
    new-instance v4, Ljava/lang/StringBuilder;

    .line 547
    .line 548
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    check-cast v1, Ljava/lang/String;

    .line 570
    .line 571
    invoke-interface {v2, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    goto/16 :goto_a

    .line 575
    .line 576
    :pswitch_8
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    check-cast v1, Ljava/lang/String;

    .line 585
    .line 586
    invoke-interface {v0, v2, v1, v15}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_a

    .line 590
    .line 591
    :pswitch_9
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 592
    .line 593
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 598
    .line 599
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    if-gtz v4, :cond_4

    .line 608
    .line 609
    new-instance v4, Ljava/lang/StringBuilder;

    .line 610
    .line 611
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    check-cast v1, Ljava/lang/String;

    .line 633
    .line 634
    goto/16 :goto_9

    .line 635
    .line 636
    :pswitch_a
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 637
    .line 638
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 643
    .line 644
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 645
    .line 646
    .line 647
    move-result-object v4

    .line 648
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 649
    .line 650
    .line 651
    move-result v4

    .line 652
    if-gtz v4, :cond_4

    .line 653
    .line 654
    new-instance v4, Ljava/lang/StringBuilder;

    .line 655
    .line 656
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    check-cast v1, Ljava/lang/String;

    .line 678
    .line 679
    invoke-interface {v2, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    goto :goto_a

    .line 683
    :pswitch_b
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 684
    .line 685
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 690
    .line 691
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 696
    .line 697
    .line 698
    move-result v4

    .line 699
    if-gtz v4, :cond_4

    .line 700
    .line 701
    new-instance v4, Ljava/lang/StringBuilder;

    .line 702
    .line 703
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    check-cast v1, Ljava/lang/String;

    .line 725
    .line 726
    invoke-interface {v2, v0, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    goto :goto_a

    .line 730
    :pswitch_c
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    check-cast v1, Ljava/lang/String;

    .line 739
    .line 740
    invoke-interface {v0, v2, v1, v15}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 741
    .line 742
    .line 743
    goto :goto_a

    .line 744
    :pswitch_d
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 745
    .line 746
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 751
    .line 752
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 753
    .line 754
    .line 755
    move-result-object v4

    .line 756
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 757
    .line 758
    .line 759
    move-result v4

    .line 760
    if-gtz v4, :cond_4

    .line 761
    .line 762
    new-instance v4, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    check-cast v1, Ljava/lang/String;

    .line 786
    .line 787
    goto/16 :goto_9

    .line 788
    .line 789
    :cond_4
    :goto_a
    const/4 v7, 0x1

    .line 790
    move-object/from16 v1, p0

    .line 791
    .line 792
    move-object/from16 v2, p1

    .line 793
    .line 794
    move-object/from16 v3, p2

    .line 795
    .line 796
    move-object/from16 v4, p3

    .line 797
    .line 798
    move-object/from16 v5, p4

    .line 799
    .line 800
    move-object/from16 v6, p5

    .line 801
    .line 802
    move-object/from16 v8, p7

    .line 803
    .line 804
    move/from16 v9, p8

    .line 805
    .line 806
    invoke-virtual/range {v1 .. v9}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;I)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    goto :goto_b

    .line 811
    :cond_5
    move-object/from16 v3, p2

    .line 812
    .line 813
    move-object/from16 v1, p7

    .line 814
    .line 815
    move/from16 v2, p8

    .line 816
    .line 817
    sget-object v4, Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;->INSTANCE:Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;

    .line 818
    .line 819
    invoke-virtual {v0}, Lcom/revenuecat/purchases/common/networking/HTTPResult;->getResponseCode()I

    .line 820
    .line 821
    .line 822
    move-result v5

    .line 823
    invoke-virtual {v4, v5}, Lcom/revenuecat/purchases/common/networking/RCHTTPStatusCodes;->isServerError(I)Z

    .line 824
    .line 825
    .line 826
    move-result v4

    .line 827
    if-eqz v4, :cond_6

    .line 828
    .line 829
    invoke-static {v3, v2, v1}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest$canUseFallback(Lcom/revenuecat/purchases/common/networking/Endpoint;ILjava/util/List;)Z

    .line 830
    .line 831
    .line 832
    move-result v4

    .line 833
    if-eqz v4, :cond_6

    .line 834
    .line 835
    move-object/from16 v5, p3

    .line 836
    .line 837
    move-object/from16 v6, p4

    .line 838
    .line 839
    move-object/from16 v7, p5

    .line 840
    .line 841
    move/from16 v8, p6

    .line 842
    .line 843
    move-object v4, v3

    .line 844
    move-object/from16 v3, p0

    .line 845
    .line 846
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/common/HTTPClient;->performRequest$performRequestToFallbackURL(Ljava/util/List;ILcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    move-object v1, v3

    .line 851
    goto :goto_b

    .line 852
    :cond_6
    move-object/from16 v1, p0

    .line 853
    .line 854
    :goto_b
    return-object v0

    .line 855
    :catchall_4
    move-exception v0

    .line 856
    move-object v1, v3

    .line 857
    :goto_c
    move-object v8, v9

    .line 858
    move-object v4, v13

    .line 859
    move/from16 v5, v16

    .line 860
    .line 861
    :goto_d
    move-object v6, v11

    .line 862
    goto :goto_e

    .line 863
    :cond_7
    move-object/from16 v1, p0

    .line 864
    .line 865
    move-object v8, v9

    .line 866
    move-object v4, v13

    .line 867
    move/from16 v5, v16

    .line 868
    .line 869
    :try_start_7
    throw v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 870
    :catchall_5
    move-exception v0

    .line 871
    goto :goto_d

    .line 872
    :catchall_6
    move-exception v0

    .line 873
    move-object/from16 v1, p0

    .line 874
    .line 875
    goto :goto_c

    .line 876
    :catchall_7
    move-exception v0

    .line 877
    move-object v8, v1

    .line 878
    move-object v4, v13

    .line 879
    move/from16 v5, v16

    .line 880
    .line 881
    move-object/from16 v1, p0

    .line 882
    .line 883
    goto :goto_d

    .line 884
    :goto_e
    iget-object v2, v1, Lcom/revenuecat/purchases/common/HTTPClient;->timeoutManager:Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;

    .line 885
    .line 886
    invoke-virtual {v2, v14}, Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;->recordRequestResult(Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager$RequestResult;)V

    .line 887
    .line 888
    .line 889
    move-object/from16 v2, p1

    .line 890
    .line 891
    move-object/from16 v3, p2

    .line 892
    .line 893
    move/from16 v7, p6

    .line 894
    .line 895
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/common/HTTPClient;->trackHttpRequestPerformedIfNeeded(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;ZLjava/io/IOException;)V

    .line 896
    .line 897
    .line 898
    throw v0

    .line 899
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
