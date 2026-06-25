.class public final Lcom/facebook/react/modules/network/NetworkingModule;
.super Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/network/NetworkingModule$a;,
        Lcom/facebook/react/modules/network/NetworkingModule$b;,
        Lcom/facebook/react/modules/network/NetworkingModule$c;,
        Lcom/facebook/react/modules/network/NetworkingModule$d;
    }
.end annotation

.annotation runtime Lk7/a;
    name = "Networking"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0006\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u000c\u0008\u0007\u0018\u0000 v2\u00020\u0001:\u0004wxyzB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB#\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000eB\u0011\u0008\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000fB!\u0008\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u0010B\u001b\u0008\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015Je\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008#\u0010$J#\u0010\'\u001a\u0004\u0018\u00010%2\u0008\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\'\u0010+\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u0010/\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008/\u0010.J\u000f\u00100\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u00080\u00101J\u0017\u00102\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u00082\u0010.J1\u00106\u001a\u0004\u0018\u0001052\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u00086\u00107J%\u0010;\u001a\u0004\u0018\u00010:2\u0008\u00108\u001a\u0004\u0018\u00010\u001a2\u0008\u00109\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u000f\u0010=\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008=\u00101J\u000f\u0010>\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008>\u00101J\u0017\u0010C\u001a\u00020\"2\u0006\u0010@\u001a\u00020?H\u0000\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010G\u001a\u00020\"2\u0006\u0010@\u001a\u00020DH\u0000\u00a2\u0006\u0004\u0008E\u0010FJ\u0017\u0010K\u001a\u00020\"2\u0006\u0010@\u001a\u00020HH\u0000\u00a2\u0006\u0004\u0008I\u0010JJ\u0017\u0010M\u001a\u00020\"2\u0006\u0010@\u001a\u00020?H\u0000\u00a2\u0006\u0004\u0008L\u0010BJ\u0017\u0010O\u001a\u00020\"2\u0006\u0010@\u001a\u00020DH\u0000\u00a2\u0006\u0004\u0008N\u0010FJ\u0017\u0010Q\u001a\u00020\"2\u0006\u0010@\u001a\u00020HH\u0000\u00a2\u0006\u0004\u0008P\u0010JJ[\u0010U\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010S\u001a\u00020R2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020R2\u0006\u0010 \u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008U\u0010VJ]\u0010W\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00042\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001dH\u0007\u00a2\u0006\u0004\u0008W\u0010XJ\u0017\u0010Y\u001a\u00020\"2\u0006\u0010S\u001a\u00020RH\u0016\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0017\u0010]\u001a\u00020\"2\u0006\u0010\\\u001a\u00020[H\u0017\u00a2\u0006\u0004\u0008]\u0010^J\u0019\u0010`\u001a\u00020\"2\u0008\u0010_\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008`\u0010aJ\u0017\u0010c\u001a\u00020\"2\u0006\u0010b\u001a\u00020RH\u0016\u00a2\u0006\u0004\u0008c\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR\u001a\u0010m\u001a\u0008\u0012\u0004\u0012\u00020\u00180l8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR\u001a\u0010p\u001a\u0008\u0012\u0004\u0012\u00020D0o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u001a\u0010r\u001a\u0008\u0012\u0004\u0012\u00020?0o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008r\u0010qR\u001a\u0010s\u001a\u0008\u0012\u0004\u0012\u00020H0o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008s\u0010qR\u0016\u0010t\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010u\u00a8\u0006{"
    }
    d2 = {
        "Lcom/facebook/react/modules/network/NetworkingModule;",
        "Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "",
        "defaultUserAgent",
        "Ldg/A;",
        "client",
        "",
        "",
        "networkInterceptorCreators",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;Ljava/util/List;)V",
        "context",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;)V",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "data",
        "extractOrGenerateDevToolsRequestId",
        "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;",
        "method",
        "url",
        "",
        "requestId",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "headers",
        "responseType",
        "",
        "useIncrementalUpdates",
        "timeout",
        "withCredentials",
        "devToolsRequestId",
        "LTd/L;",
        "sendRequestInternalReal",
        "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V",
        "Ldg/D;",
        "requestBody",
        "wrapRequestBodyWithProgressEmitter",
        "(Ldg/D;I)Ldg/D;",
        "Ldg/F;",
        "responseBody",
        "readWithProgress",
        "(ILjava/lang/String;Ldg/F;)V",
        "addRequest",
        "(I)V",
        "removeRequest",
        "cancelAllRequests",
        "()V",
        "cancelRequest",
        "body",
        "contentType",
        "Ldg/y$a;",
        "constructMultipartBody",
        "(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;ILjava/lang/String;)Ldg/y$a;",
        "headersArray",
        "requestData",
        "Ldg/t;",
        "extractHeaders",
        "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Ldg/t;",
        "initialize",
        "invalidate",
        "Lcom/facebook/react/modules/network/NetworkingModule$d;",
        "handler",
        "addUriHandler$ReactAndroid_release",
        "(Lcom/facebook/react/modules/network/NetworkingModule$d;)V",
        "addUriHandler",
        "Lcom/facebook/react/modules/network/NetworkingModule$b;",
        "addRequestBodyHandler$ReactAndroid_release",
        "(Lcom/facebook/react/modules/network/NetworkingModule$b;)V",
        "addRequestBodyHandler",
        "Lcom/facebook/react/modules/network/NetworkingModule$c;",
        "addResponseHandler$ReactAndroid_release",
        "(Lcom/facebook/react/modules/network/NetworkingModule$c;)V",
        "addResponseHandler",
        "removeUriHandler$ReactAndroid_release",
        "removeUriHandler",
        "removeRequestBodyHandler$ReactAndroid_release",
        "removeRequestBodyHandler",
        "removeResponseHandler$ReactAndroid_release",
        "removeResponseHandler",
        "",
        "requestIdAsDouble",
        "timeoutAsDouble",
        "sendRequest",
        "(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ)V",
        "sendRequestInternal",
        "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZ)V",
        "abortRequest",
        "(D)V",
        "Lcom/facebook/react/bridge/Callback;",
        "callback",
        "clearCookies",
        "(Lcom/facebook/react/bridge/Callback;)V",
        "eventName",
        "addListener",
        "(Ljava/lang/String;)V",
        "count",
        "removeListeners",
        "Ldg/A;",
        "Lv7/d;",
        "cookieHandler",
        "Lv7/d;",
        "Ljava/lang/String;",
        "Lv7/a;",
        "cookieJarContainer",
        "Lv7/a;",
        "",
        "requestIds",
        "Ljava/util/Set;",
        "",
        "requestBodyHandlers",
        "Ljava/util/List;",
        "uriHandlers",
        "responseHandlers",
        "shuttingDown",
        "Z",
        "Companion",
        "d",
        "b",
        "c",
        "a",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CHUNK_TIMEOUT_NS:I = 0x5f5e100

.field private static final CONTENT_ENCODING_HEADER_NAME:Ljava/lang/String; = "content-encoding"

.field private static final CONTENT_TYPE_HEADER_NAME:Ljava/lang/String; = "content-type"

.field public static final Companion:Lcom/facebook/react/modules/network/NetworkingModule$a;

.field private static final MAX_CHUNK_SIZE_BETWEEN_FLUSHES:I = 0x2000

.field public static final NAME:Ljava/lang/String; = "Networking"

.field private static final REQUEST_BODY_KEY_BASE64:Ljava/lang/String; = "base64"

.field private static final REQUEST_BODY_KEY_FORMDATA:Ljava/lang/String; = "formData"

.field private static final REQUEST_BODY_KEY_STRING:Ljava/lang/String; = "string"

.field private static final REQUEST_BODY_KEY_URI:Ljava/lang/String; = "uri"

.field private static final REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID:Ljava/lang/String; = "devToolsRequestId"

.field private static final TAG:Ljava/lang/String; = "Networking"

.field private static final USER_AGENT_HEADER_NAME:Ljava/lang/String; = "user-agent"

.field private static customClientBuilder:Lv7/b;


# instance fields
.field private final client:Ldg/A;

.field private final cookieHandler:Lv7/d;

.field private cookieJarContainer:Lv7/a;

.field private final defaultUserAgent:Ljava/lang/String;

.field private final requestBodyHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/modules/network/NetworkingModule$b;",
            ">;"
        }
    .end annotation
.end field

.field private final requestIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final responseHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/modules/network/NetworkingModule$c;",
            ">;"
        }
    .end annotation
.end field

.field private shuttingDown:Z

.field private final uriHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/modules/network/NetworkingModule$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/modules/network/NetworkingModule$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/modules/network/NetworkingModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/modules/network/NetworkingModule;->Companion:Lcom/facebook/react/modules/network/NetworkingModule$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lv7/f;->b(Landroid/content/Context;)Ldg/A;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lv7/f;->b(Landroid/content/Context;)Ldg/A;

    move-result-object v0

    const/4 v1, 0x0

    .line 23
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/lang/String;",
            "Ldg/A;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    new-instance p1, Lv7/d;

    invoke-direct {p1}, Lv7/d;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->cookieHandler:Lv7/d;

    .line 3
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestIds:Ljava/util/Set;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestBodyHandlers:Ljava/util/List;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->uriHandlers:Ljava/util/List;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->responseHandlers:Ljava/util/List;

    const/4 p1, 0x0

    if-eqz p4, :cond_1

    .line 7
    invoke-virtual {p3}, Ldg/A;->F()Ldg/A$a;

    move-result-object p3

    .line 8
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    invoke-virtual {p3}, Ldg/A$a;->c()Ldg/A;

    move-result-object p3

    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 11
    throw p1

    .line 12
    :cond_1
    :goto_0
    iput-object p3, p0, Lcom/facebook/react/modules/network/NetworkingModule;->client:Ldg/A;

    .line 13
    invoke-virtual {p3}, Ldg/A;->d()Ldg/n;

    move-result-object p3

    .line 14
    instance-of p4, p3, Lv7/a;

    if-eqz p4, :cond_2

    .line 15
    move-object p1, p3

    check-cast p1, Lv7/a;

    .line 16
    :cond_2
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->cookieJarContainer:Lv7/a;

    .line 17
    iput-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule;->defaultUserAgent:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lv7/f;->b(Landroid/content/Context;)Ldg/A;

    move-result-object v0

    const/4 v1, 0x0

    .line 21
    invoke-direct {p0, p1, v1, v0, p2}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ldg/A;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getCustomClientBuilder$cp()Lv7/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public static final synthetic access$getResponseHandlers$p(Lcom/facebook/react/modules/network/NetworkingModule;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->responseHandlers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getShuttingDown$p(Lcom/facebook/react/modules/network/NetworkingModule;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->shuttingDown:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$readWithProgress(Lcom/facebook/react/modules/network/NetworkingModule;ILjava/lang/String;Ldg/F;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/modules/network/NetworkingModule;->readWithProgress(ILjava/lang/String;Ldg/F;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$removeRequest(Lcom/facebook/react/modules/network/NetworkingModule;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->removeRequest(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setCustomClientBuilder$cp(Lv7/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final declared-synchronized addRequest(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestIds:Ljava/util/Set;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw p1
.end method

.method private final declared-synchronized cancelAllRequests()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestIds:Ljava/util/Set;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-direct {p0, v1}, Lcom/facebook/react/modules/network/NetworkingModule;->cancelRequest(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestIds:Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v0
.end method

.method private final cancelRequest(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->client:Ldg/A;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, La7/a;->a(Ldg/A;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final constructMultipartBody(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;ILjava/lang/String;)Ldg/y$a;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ldg/y$a;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, v3, v2, v3}, Ldg/y$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Ldg/x;->e:Ldg/x$a;

    .line 13
    .line 14
    invoke-virtual {v2, p2}, Ldg/x$a;->a(Ljava/lang/String;)Ldg/x;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    const-string p1, "Invalid media type."

    .line 21
    .line 22
    invoke-static {v0, p3, p4, p1, v3}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_0
    invoke-virtual {v1, p2}, Ldg/y$a;->f(Ldg/x;)Ldg/y$a;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-ge v2, p2, :cond_a

    .line 35
    .line 36
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const-string v5, "Unrecognized FormData part."

    .line 41
    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    invoke-static {v0, p3, p4, v5, v3}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_1
    const-string v6, "headers"

    .line 49
    .line 50
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-direct {p0, v6, v3}, Lcom/facebook/react/modules/network/NetworkingModule;->extractHeaders(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Ldg/t;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    if-nez v6, :cond_2

    .line 59
    .line 60
    const-string p1, "Missing or invalid header format for FormData part."

    .line 61
    .line 62
    invoke-static {v0, p3, p4, p1, v3}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_2
    const-string v7, "content-type"

    .line 67
    .line 68
    invoke-virtual {v6, v7}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    if-eqz v8, :cond_3

    .line 73
    .line 74
    sget-object v9, Ldg/x;->e:Ldg/x$a;

    .line 75
    .line 76
    invoke-virtual {v9, v8}, Ldg/x$a;->a(Ljava/lang/String;)Ldg/x;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v6}, Ldg/t;->l()Ldg/t$a;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {v6, v7}, Ldg/t$a;->h(Ljava/lang/String;)Ldg/t$a;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v6}, Ldg/t$a;->e()Ldg/t;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move-object v8, v3

    .line 94
    :goto_1
    const-string v7, "string"

    .line 95
    .line 96
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-eqz v9, :cond_5

    .line 101
    .line 102
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    if-eqz v9, :cond_5

    .line 107
    .line 108
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-nez v4, :cond_4

    .line 113
    .line 114
    const-string v4, ""

    .line 115
    .line 116
    :cond_4
    sget-object v5, Ldg/D;->a:Ldg/D$a;

    .line 117
    .line 118
    invoke-virtual {v5, v8, v4}, Ldg/D$a;->a(Ldg/x;Ljava/lang/String;)Ldg/D;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v1, v6, v4}, Ldg/y$a;->c(Ldg/t;Ldg/D;)Ldg/y$a;

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    const-string v7, "uri"

    .line 127
    .line 128
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_9

    .line 133
    .line 134
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    if-eqz v9, :cond_9

    .line 139
    .line 140
    if-nez v8, :cond_6

    .line 141
    .line 142
    const-string p1, "Binary FormData part needs a content-type header."

    .line 143
    .line 144
    invoke-static {v0, p3, p4, p1, v3}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    return-object v3

    .line 148
    :cond_6
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-nez v4, :cond_7

    .line 153
    .line 154
    const-string p1, "Body must have a valid file uri"

    .line 155
    .line 156
    invoke-static {v0, p3, p4, p1, v3}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    return-object v3

    .line 160
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    const-string v7, "getReactApplicationContext(...)"

    .line 165
    .line 166
    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v5, v4}, Lv7/l;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-nez v5, :cond_8

    .line 174
    .line 175
    new-instance p1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string p2, "Could not retrieve file for uri "

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {v0, p3, p4, p1, v3}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    return-object v3

    .line 196
    :cond_8
    invoke-static {v8, v5}, Lv7/l;->c(Ldg/x;Ljava/io/InputStream;)Ldg/D;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v1, v6, v4}, Ldg/y$a;->c(Ldg/t;Ldg/D;)Ldg/y$a;

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_9
    invoke-static {v0, p3, p4, v5, v3}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    sget-object v4, LTd/L;->a:LTd/L;

    .line 208
    .line 209
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_a
    return-object v1
.end method

.method private final extractHeaders(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Ldg/t;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Ldg/t$a;

    .line 6
    .line 7
    invoke-direct {v1}, Ldg/t$a;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    const/4 v5, 0x1

    .line 17
    if-ge v4, v2, :cond_5

    .line 18
    .line 19
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    if-eqz v6, :cond_4

    .line 24
    .line 25
    invoke-interface {v6}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    const/4 v8, 0x2

    .line 30
    if-eq v7, v8, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-interface {v6, v3}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    sget-object v8, Lcom/facebook/react/modules/network/a;->a:Lcom/facebook/react/modules/network/a$a;

    .line 40
    .line 41
    invoke-virtual {v8, v7}, Lcom/facebook/react/modules/network/a$a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    :cond_2
    invoke-interface {v6, v5}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-eqz v7, :cond_4

    .line 50
    .line 51
    if-nez v5, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-virtual {v1, v7, v5}, Ldg/t$a;->d(Ljava/lang/String;Ljava/lang/String;)Ldg/t$a;

    .line 55
    .line 56
    .line 57
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    :goto_1
    return-object v0

    .line 61
    :cond_5
    const-string p1, "user-agent"

    .line 62
    .line 63
    invoke-virtual {v1, p1}, Ldg/t$a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-nez v0, :cond_6

    .line 68
    .line 69
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->defaultUserAgent:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    invoke-virtual {v1, p1, v0}, Ldg/t$a;->a(Ljava/lang/String;Ljava/lang/String;)Ldg/t$a;

    .line 74
    .line 75
    .line 76
    :cond_6
    if-eqz p2, :cond_7

    .line 77
    .line 78
    const-string p1, "string"

    .line 79
    .line 80
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-ne p1, v5, :cond_7

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_7
    const-string p1, "content-encoding"

    .line 88
    .line 89
    invoke-virtual {v1, p1}, Ldg/t$a;->h(Ljava/lang/String;)Ldg/t$a;

    .line 90
    .line 91
    .line 92
    :goto_2
    invoke-virtual {v1}, Ldg/t$a;->e()Ldg/t;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1
.end method

.method private final extractOrGenerateDevToolsRequestId(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "devToolsRequestId"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "toString(...)"

    .line 36
    .line 37
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object p1
.end method

.method private final readWithProgress(ILjava/lang/String;Ldg/F;)V
    .locals 14

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    :try_start_0
    const-string v3, "null cannot be cast to non-null type com.facebook.react.modules.network.ProgressResponseBody"

    .line 6
    .line 7
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Lv7/i;

    .line 12
    .line 13
    invoke-virtual {v3}, Lv7/i;->C()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    :try_start_1
    invoke-virtual {v3}, Lv7/i;->h()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    :catch_0
    :goto_0
    move-wide v12, v1

    .line 22
    move-wide v10, v4

    .line 23
    goto :goto_1

    .line 24
    :catch_1
    move-wide v4, v1

    .line 25
    goto :goto_0

    .line 26
    :goto_1
    invoke-virtual {v0}, Ldg/F;->j()Ldg/x;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_0
    invoke-virtual {v0}, Ldg/F;->j()Ldg/x;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ldg/x;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    const/4 v1, 0x0

    .line 49
    :goto_2
    if-eqz v1, :cond_3

    .line 50
    .line 51
    :goto_3
    new-instance v2, Lv7/j;

    .line 52
    .line 53
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v1}, Lv7/j;-><init>(Ljava/nio/charset/Charset;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ldg/F;->a()Ljava/io/InputStream;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/16 v0, 0x2000

    .line 64
    .line 65
    :try_start_2
    new-array v0, v0, [B

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    :goto_4
    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const/4 v4, -0x1

    .line 76
    if-eq v3, v4, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2, v0, v3}, Lv7/j;->a([BI)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    move v7, p1

    .line 83
    move-object/from16 v8, p2

    .line 84
    .line 85
    invoke-static/range {v6 .. v13}, Lv7/e;->g(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_4

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object p1, v0

    .line 91
    goto :goto_5

    .line 92
    :cond_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :goto_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_3
    invoke-virtual {v0}, Ldg/F;->j()Ldg/x;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v1, "Null character set for Content-Type: "

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0
.end method

.method private final declared-synchronized removeRequest(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestIds:Ljava/util/Set;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw p1
.end method

.method private final sendRequestInternalReal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v6, p6

    .line 6
    .line 7
    move/from16 v3, p8

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :try_start_0
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v7, v1, Lcom/facebook/react/modules/network/NetworkingModule;->uriHandlers:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v8
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 29
    const-string v9, "getBytes(...)"

    .line 30
    .line 31
    if-eqz v8, :cond_1

    .line 32
    .line 33
    :try_start_1
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    check-cast v8, Lcom/facebook/react/modules/network/NetworkingModule$d;

    .line 38
    .line 39
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v8, v5, v6}, Lcom/facebook/react/modules/network/NetworkingModule$d;->b(Landroid/net/Uri;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    if-eqz v10, :cond_0

    .line 47
    .line 48
    invoke-interface {v8, v5}, Lcom/facebook/react/modules/network/NetworkingModule$d;->a(Landroid/net/Uri;)Lkotlin/Pair;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v10, v3

    .line 57
    check-cast v10, Lcom/facebook/react/bridge/WritableMap;

    .line 58
    .line 59
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, [B

    .line 64
    .line 65
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    sget-object v4, LDf/d;->b:Ljava/nio/charset/Charset;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v3, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    array-length v3, v3

    .line 79
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 83
    int-to-long v8, v3

    .line 84
    const/16 v6, 0xc8

    .line 85
    .line 86
    move-object/from16 v5, p2

    .line 87
    .line 88
    move/from16 v3, p3

    .line 89
    .line 90
    move-object/from16 v4, p10

    .line 91
    .line 92
    :try_start_2
    invoke-static/range {v2 .. v9}, Lv7/e;->j(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;ILjava/util/Map;J)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 93
    .line 94
    .line 95
    move-object v11, v2

    .line 96
    move v2, v3

    .line 97
    move-wide/from16 v21, v8

    .line 98
    .line 99
    move-object v8, v4

    .line 100
    move-wide/from16 v3, v21

    .line 101
    .line 102
    :try_start_3
    invoke-static {v11, v2, v8, v10, v0}, Lv7/e;->c(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;[B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v11, v2, v8, v3, v4}, Lv7/e;->i(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :catch_0
    move-exception v0

    .line 110
    :goto_1
    move-object v4, v8

    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :catch_1
    move-exception v0

    .line 114
    move-object v11, v2

    .line 115
    move v2, v3

    .line 116
    move-object v8, v4

    .line 117
    goto/16 :goto_9

    .line 118
    .line 119
    :catch_2
    move-exception v0

    .line 120
    move-object/from16 v8, p10

    .line 121
    .line 122
    move-object v11, v2

    .line 123
    move/from16 v2, p3

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_0
    move-object/from16 v8, p10

    .line 127
    .line 128
    move-object v11, v2

    .line 129
    move/from16 v2, p3

    .line 130
    .line 131
    move-object v2, v11

    .line 132
    goto :goto_0

    .line 133
    :cond_1
    move-object/from16 v8, p10

    .line 134
    .line 135
    move-object v11, v2

    .line 136
    move/from16 v2, p3

    .line 137
    .line 138
    :try_start_4
    new-instance v5, Ldg/C$a;

    .line 139
    .line 140
    invoke-direct {v5}, Ldg/C$a;-><init>()V

    .line 141
    .line 142
    .line 143
    if-nez p2, :cond_2

    .line 144
    .line 145
    const-string v7, ""

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :catch_3
    move-exception v0

    .line 149
    move-object v4, v8

    .line 150
    goto/16 :goto_8

    .line 151
    .line 152
    :cond_2
    move-object/from16 v7, p2

    .line 153
    .line 154
    :goto_2
    invoke-virtual {v5, v7}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 155
    .line 156
    .line 157
    move-result-object v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 158
    if-eqz v2, :cond_3

    .line 159
    .line 160
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-virtual {v5, v7}, Ldg/C$a;->k(Ljava/lang/Object;)Ldg/C$a;

    .line 165
    .line 166
    .line 167
    :cond_3
    iget-object v7, v1, Lcom/facebook/react/modules/network/NetworkingModule;->client:Ldg/A;

    .line 168
    .line 169
    invoke-virtual {v7}, Ldg/A;->F()Ldg/A$a;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    sget-object v10, Lcom/facebook/react/modules/network/NetworkingModule;->Companion:Lcom/facebook/react/modules/network/NetworkingModule$a;

    .line 174
    .line 175
    invoke-static {v10, v7}, Lcom/facebook/react/modules/network/NetworkingModule$a;->a(Lcom/facebook/react/modules/network/NetworkingModule$a;Ldg/A$a;)V

    .line 176
    .line 177
    .line 178
    if-nez p9, :cond_4

    .line 179
    .line 180
    sget-object v10, Ldg/n;->b:Ldg/n;

    .line 181
    .line 182
    invoke-virtual {v7, v10}, Ldg/A$a;->g(Ldg/n;)Ldg/A$a;

    .line 183
    .line 184
    .line 185
    :cond_4
    if-eqz p7, :cond_5

    .line 186
    .line 187
    new-instance v10, Lcom/facebook/react/modules/network/NetworkingModule$e;

    .line 188
    .line 189
    invoke-direct {v10, v6, v11, v2}, Lcom/facebook/react/modules/network/NetworkingModule$e;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v10}, Ldg/A$a;->b(Ldg/v;)Ldg/A$a;

    .line 193
    .line 194
    .line 195
    :cond_5
    iget-object v10, v1, Lcom/facebook/react/modules/network/NetworkingModule;->client:Ldg/A;

    .line 196
    .line 197
    invoke-virtual {v10}, Ldg/A;->c()I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    if-eq v3, v10, :cond_6

    .line 202
    .line 203
    int-to-long v12, v3

    .line 204
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 205
    .line 206
    invoke-virtual {v7, v12, v13, v3}, Ldg/A$a;->e(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 207
    .line 208
    .line 209
    :cond_6
    invoke-virtual {v7}, Ldg/A$a;->c()Ldg/A;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    move-object/from16 v7, p4

    .line 214
    .line 215
    invoke-direct {v1, v7, v4}, Lcom/facebook/react/modules/network/NetworkingModule;->extractHeaders(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Ldg/t;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    const/4 v10, 0x0

    .line 220
    if-nez v7, :cond_7

    .line 221
    .line 222
    const-string v0, "Unrecognized headers format"

    .line 223
    .line 224
    invoke-static {v11, v2, v8, v0, v10}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_7
    const-string v12, "content-type"

    .line 229
    .line 230
    invoke-virtual {v7, v12}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    const-string v13, "content-encoding"

    .line 235
    .line 236
    invoke-virtual {v7, v13}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    invoke-virtual {v5, v7}, Ldg/C$a;->f(Ldg/t;)Ldg/C$a;

    .line 241
    .line 242
    .line 243
    if-eqz v4, :cond_9

    .line 244
    .line 245
    iget-object v7, v1, Lcom/facebook/react/modules/network/NetworkingModule;->requestBodyHandlers:Ljava/util/List;

    .line 246
    .line 247
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v14

    .line 255
    if-eqz v14, :cond_9

    .line 256
    .line 257
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v14

    .line 261
    check-cast v14, Lcom/facebook/react/modules/network/NetworkingModule$b;

    .line 262
    .line 263
    invoke-interface {v14, v4}, Lcom/facebook/react/modules/network/NetworkingModule$b;->a(Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    if-eqz v15, :cond_8

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_9
    move-object v14, v10

    .line 271
    :goto_3
    if-eqz v4, :cond_20

    .line 272
    .line 273
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 274
    .line 275
    invoke-virtual {v0, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v15

    .line 279
    const-string v10, "toLowerCase(...)"

    .line 280
    .line 281
    invoke-static {v15, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    const-string v6, "get"

    .line 285
    .line 286
    invoke-static {v15, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-nez v6, :cond_20

    .line 291
    .line 292
    invoke-virtual {v0, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    const-string v7, "head"

    .line 300
    .line 301
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-eqz v6, :cond_a

    .line 306
    .line 307
    goto/16 :goto_6

    .line 308
    .line 309
    :cond_a
    if-eqz v14, :cond_b

    .line 310
    .line 311
    invoke-interface {v14, v4, v12}, Lcom/facebook/react/modules/network/NetworkingModule$b;->b(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ldg/D;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    goto/16 :goto_7

    .line 316
    .line 317
    :cond_b
    const-string v6, "string"

    .line 318
    .line 319
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    const-string v10, "Required value was null."

    .line 324
    .line 325
    const-string v14, "Payload is set but no content-type header specified"

    .line 326
    .line 327
    if-eqz v7, :cond_12

    .line 328
    .line 329
    if-nez v12, :cond_c

    .line 330
    .line 331
    const/4 v7, 0x0

    .line 332
    invoke-static {v11, v2, v8, v14, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :cond_c
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    sget-object v6, Ldg/x;->e:Ldg/x$a;

    .line 341
    .line 342
    invoke-virtual {v6, v12}, Ldg/x$a;->a(Ljava/lang/String;)Ldg/x;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    invoke-static {v13}, Lv7/l;->i(Ljava/lang/String;)Z

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    if-eqz v6, :cond_e

    .line 351
    .line 352
    if-eqz v15, :cond_d

    .line 353
    .line 354
    if-eqz v4, :cond_d

    .line 355
    .line 356
    invoke-static {v15, v4}, Lv7/l;->d(Ldg/x;Ljava/lang/String;)Ldg/D;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    goto :goto_4

    .line 361
    :cond_d
    const/4 v4, 0x0

    .line 362
    :goto_4
    if-nez v4, :cond_21

    .line 363
    .line 364
    const-string v0, "Failed to gzip request body"

    .line 365
    .line 366
    const/4 v7, 0x0

    .line 367
    invoke-static {v11, v2, v8, v0, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_e
    if-nez v15, :cond_f

    .line 372
    .line 373
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_f
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 377
    .line 378
    invoke-virtual {v15, v6}, Ldg/x;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    if-eqz v6, :cond_11

    .line 383
    .line 384
    :goto_5
    if-nez v4, :cond_10

    .line 385
    .line 386
    const-string v0, "Received request but body was empty"

    .line 387
    .line 388
    const/4 v7, 0x0

    .line 389
    invoke-static {v11, v2, v8, v0, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :cond_10
    sget-object v14, Ldg/D;->a:Ldg/D$a;

    .line 394
    .line 395
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    const/16 v19, 0xc

    .line 406
    .line 407
    const/16 v20, 0x0

    .line 408
    .line 409
    const/16 v17, 0x0

    .line 410
    .line 411
    const/16 v18, 0x0

    .line 412
    .line 413
    move-object/from16 v16, v4

    .line 414
    .line 415
    invoke-static/range {v14 .. v20}, Ldg/D$a;->i(Ldg/D$a;Ldg/x;[BIIILjava/lang/Object;)Ldg/D;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    goto/16 :goto_7

    .line 420
    .line 421
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 422
    .line 423
    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v0

    .line 427
    :cond_12
    const-string v6, "base64"

    .line 428
    .line 429
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 430
    .line 431
    .line 432
    move-result v7

    .line 433
    if-eqz v7, :cond_17

    .line 434
    .line 435
    if-nez v12, :cond_13

    .line 436
    .line 437
    const/4 v7, 0x0

    .line 438
    invoke-static {v11, v2, v8, v14, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 439
    .line 440
    .line 441
    return-void

    .line 442
    :cond_13
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    if-eqz v4, :cond_16

    .line 447
    .line 448
    sget-object v6, Ldg/x;->e:Ldg/x$a;

    .line 449
    .line 450
    invoke-virtual {v6, v12}, Ldg/x$a;->a(Ljava/lang/String;)Ldg/x;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    if-nez v6, :cond_14

    .line 455
    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    const-string v3, "Invalid content type specified: "

    .line 462
    .line 463
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    const/4 v7, 0x0

    .line 474
    invoke-static {v11, v2, v8, v0, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 475
    .line 476
    .line 477
    return-void

    .line 478
    :cond_14
    const/4 v7, 0x0

    .line 479
    sget-object v9, Ltg/k;->d:Ltg/k$a;

    .line 480
    .line 481
    invoke-virtual {v9, v4}, Ltg/k$a;->a(Ljava/lang/String;)Ltg/k;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    if-nez v4, :cond_15

    .line 486
    .line 487
    const-string v0, "Request body base64 string was invalid"

    .line 488
    .line 489
    invoke-static {v11, v2, v8, v0, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_15
    sget-object v7, Ldg/D;->a:Ldg/D$a;

    .line 494
    .line 495
    invoke-virtual {v7, v6, v4}, Ldg/D$a;->b(Ldg/x;Ltg/k;)Ldg/D;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    goto/16 :goto_7

    .line 500
    .line 501
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 502
    .line 503
    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    throw v0

    .line 507
    :cond_17
    const-string v6, "uri"

    .line 508
    .line 509
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 510
    .line 511
    .line 512
    move-result v7

    .line 513
    if-eqz v7, :cond_1b

    .line 514
    .line 515
    if-nez v12, :cond_18

    .line 516
    .line 517
    const/4 v7, 0x0

    .line 518
    invoke-static {v11, v2, v8, v14, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 519
    .line 520
    .line 521
    return-void

    .line 522
    :cond_18
    const/4 v7, 0x0

    .line 523
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    if-nez v4, :cond_19

    .line 528
    .line 529
    const-string v0, "Request body URI field was set but null"

    .line 530
    .line 531
    invoke-static {v11, v2, v8, v0, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :cond_19
    invoke-virtual {v1}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    const-string v7, "getReactApplicationContext(...)"

    .line 540
    .line 541
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-static {v6, v4}, Lv7/l;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 545
    .line 546
    .line 547
    move-result-object v6

    .line 548
    if-nez v6, :cond_1a

    .line 549
    .line 550
    new-instance v0, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    const-string v3, "Could not retrieve file for uri "

    .line 556
    .line 557
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    const/4 v7, 0x0

    .line 568
    invoke-static {v11, v2, v8, v0, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :cond_1a
    sget-object v4, Ldg/x;->e:Ldg/x$a;

    .line 573
    .line 574
    invoke-virtual {v4, v12}, Ldg/x$a;->a(Ljava/lang/String;)Ldg/x;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    invoke-static {v4, v6}, Lv7/l;->c(Ldg/x;Ljava/io/InputStream;)Ldg/D;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    goto :goto_7

    .line 583
    :cond_1b
    const-string v6, "formData"

    .line 584
    .line 585
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 586
    .line 587
    .line 588
    move-result v7

    .line 589
    if-eqz v7, :cond_1f

    .line 590
    .line 591
    if-nez v12, :cond_1c

    .line 592
    .line 593
    const-string v12, "multipart/form-data"

    .line 594
    .line 595
    :cond_1c
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    if-nez v4, :cond_1d

    .line 600
    .line 601
    const-string v0, "Received request but form data was empty"

    .line 602
    .line 603
    const/4 v7, 0x0

    .line 604
    invoke-static {v11, v2, v8, v0, v7}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 605
    .line 606
    .line 607
    return-void

    .line 608
    :cond_1d
    invoke-direct {v1, v4, v12, v2, v8}, Lcom/facebook/react/modules/network/NetworkingModule;->constructMultipartBody(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;ILjava/lang/String;)Ldg/y$a;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    if-nez v4, :cond_1e

    .line 613
    .line 614
    return-void

    .line 615
    :cond_1e
    invoke-virtual {v4}, Ldg/y$a;->e()Ldg/y;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    goto :goto_7

    .line 620
    :cond_1f
    invoke-static {v0}, Lv7/l;->g(Ljava/lang/String;)Ldg/D;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    goto :goto_7

    .line 625
    :cond_20
    :goto_6
    invoke-static {v0}, Lv7/l;->g(Ljava/lang/String;)Ldg/D;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    :cond_21
    :goto_7
    invoke-direct {v1, v4, v2}, Lcom/facebook/react/modules/network/NetworkingModule;->wrapRequestBodyWithProgressEmitter(Ldg/D;I)Ldg/D;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    invoke-virtual {v5, v0, v4}, Ldg/C$a;->g(Ljava/lang/String;Ldg/D;)Ldg/C$a;

    .line 634
    .line 635
    .line 636
    invoke-direct {v1, v2}, Lcom/facebook/react/modules/network/NetworkingModule;->addRequest(I)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v5}, Ldg/C$a;->b()Ldg/C;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-static {v8, v0}, Lv7/e;->b(Ljava/lang/String;Ldg/C;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v3, v0}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 647
    .line 648
    .line 649
    move-result-object v9

    .line 650
    new-instance v0, Lcom/facebook/react/modules/network/NetworkingModule$g;

    .line 651
    .line 652
    move-object/from16 v5, p2

    .line 653
    .line 654
    move-object/from16 v6, p6

    .line 655
    .line 656
    move/from16 v7, p7

    .line 657
    .line 658
    move-object v4, v8

    .line 659
    move-object v3, v11

    .line 660
    invoke-direct/range {v0 .. v7}, Lcom/facebook/react/modules/network/NetworkingModule$g;-><init>(Lcom/facebook/react/modules/network/NetworkingModule;ILcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 661
    .line 662
    .line 663
    invoke-interface {v9, v0}, Ldg/e;->O1(Ldg/f;)V

    .line 664
    .line 665
    .line 666
    return-void

    .line 667
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-static {v11, v2, v4, v1, v0}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :catch_4
    move-exception v0

    .line 676
    move-object/from16 v4, p10

    .line 677
    .line 678
    move-object v11, v2

    .line 679
    move/from16 v2, p3

    .line 680
    .line 681
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v1

    .line 685
    invoke-static {v11, v2, v4, v1, v0}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 686
    .line 687
    .line 688
    return-void
.end method

.method public static final setCustomClientBuilder(Lv7/b;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/network/NetworkingModule;->Companion:Lcom/facebook/react/modules/network/NetworkingModule$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/facebook/react/modules/network/NetworkingModule$a;->d(Lv7/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final wrapRequestBodyWithProgressEmitter(Ldg/D;I)Ldg/D;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/facebook/react/modules/network/NetworkingModule$h;

    .line 10
    .line 11
    invoke-direct {v1, v0, p2}, Lcom/facebook/react/modules/network/NetworkingModule$h;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v1}, Lv7/l;->e(Ldg/D;Lv7/g;)Lv7/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method


# virtual methods
.method public abortRequest(D)V
    .locals 0

    .line 1
    double-to-int p1, p1

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->cancelRequest(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->removeRequest(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public addListener(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final addRequestBodyHandler$ReactAndroid_release(Lcom/facebook/react/modules/network/NetworkingModule$b;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestBodyHandlers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final addResponseHandler$ReactAndroid_release(Lcom/facebook/react/modules/network/NetworkingModule$c;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->responseHandlers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final addUriHandler$ReactAndroid_release(Lcom/facebook/react/modules/network/NetworkingModule$d;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->uriHandlers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public clearCookies(Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->cookieHandler:Lv7/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lv7/d;->d(Lcom/facebook/react/bridge/Callback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public initialize()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->cookieJarContainer:Lv7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ldg/w;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule;->cookieHandler:Lv7/d;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ldg/w;-><init>(Ljava/net/CookieHandler;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lv7/a;->a(Ldg/n;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public invalidate()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->shuttingDown:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/facebook/react/modules/network/NetworkingModule;->cancelAllRequests()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->cookieHandler:Lv7/d;

    .line 8
    .line 9
    invoke-virtual {v0}, Lv7/d;->f()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->cookieJarContainer:Lv7/a;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Lv7/a;->c()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestBodyHandlers:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->responseHandlers:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->uriHandlers:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    .line 1
    return-void
.end method

.method public final removeRequestBodyHandler$ReactAndroid_release(Lcom/facebook/react/modules/network/NetworkingModule$b;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->requestBodyHandlers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final removeResponseHandler$ReactAndroid_release(Lcom/facebook/react/modules/network/NetworkingModule$c;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->responseHandlers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final removeUriHandler$ReactAndroid_release(Lcom/facebook/react/modules/network/NetworkingModule$d;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->uriHandlers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public sendRequest(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ)V
    .locals 1

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "responseType"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    double-to-int p4, p3

    .line 17
    double-to-int p9, p9

    .line 18
    move p10, p11

    .line 19
    invoke-direct {p0, p6}, Lcom/facebook/react/modules/network/NetworkingModule;->extractOrGenerateDevToolsRequestId(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p11

    .line 23
    move-object p3, p2

    .line 24
    move-object p2, p1

    .line 25
    move-object p1, p0

    .line 26
    :try_start_0
    invoke-direct/range {p1 .. p11}, Lcom/facebook/react/modules/network/NetworkingModule;->sendRequestInternalReal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    new-instance p2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string p5, "Failed to send url request: "

    .line 38
    .line 39
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string p3, "Networking"

    .line 50
    .line 51
    invoke-static {p3, p2, p1}, Lz5/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-static {p2, p4, p11, p3, p1}, Lv7/e;->h(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final sendRequestInternal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZ)V
    .locals 12
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "responseType"

    .line 7
    .line 8
    move-object/from16 v7, p6

    .line 9
    .line 10
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object/from16 v6, p5

    .line 14
    .line 15
    invoke-direct {p0, v6}, Lcom/facebook/react/modules/network/NetworkingModule;->extractOrGenerateDevToolsRequestId(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    move-object v1, p0

    .line 20
    move-object v2, p1

    .line 21
    move-object v3, p2

    .line 22
    move v4, p3

    .line 23
    move-object/from16 v5, p4

    .line 24
    .line 25
    move/from16 v8, p7

    .line 26
    .line 27
    move/from16 v9, p8

    .line 28
    .line 29
    move/from16 v10, p9

    .line 30
    .line 31
    invoke-direct/range {v1 .. v11}, Lcom/facebook/react/modules/network/NetworkingModule;->sendRequestInternalReal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
