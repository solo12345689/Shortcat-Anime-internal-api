.class public final Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00082\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "Landroid/app/Activity;",
        "activity",
        "LTd/L;",
        "presentCustomerCenterFromActivity",
        "(Landroid/app/Activity;)V",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "createCustomerCenterListener",
        "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "",
        "eventName",
        "Lcom/facebook/react/bridge/WritableMap;",
        "params",
        "sendEvent",
        "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V",
        "getName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/bridge/Promise;",
        "promise",
        "presentCustomerCenter",
        "(Lcom/facebook/react/bridge/Promise;)V",
        "addListener",
        "(Ljava/lang/String;)V",
        "",
        "count",
        "removeListeners",
        "(Ljava/lang/Integer;)V",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "customerCenterPromise",
        "Lcom/facebook/react/bridge/Promise;",
        "Lcom/facebook/react/bridge/ActivityEventListener;",
        "activityEventListener",
        "Lcom/facebook/react/bridge/ActivityEventListener;",
        "Companion",
        "react-native-purchases-ui_release"
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
.field public static final Companion:Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$Companion;

.field public static final NAME:Ljava/lang/String; = "RNCustomerCenter"

.field private static final REQUEST_CODE_CUSTOMER_CENTER:I = 0x3e9


# instance fields
.field private final activityEventListener:Lcom/facebook/react/bridge/ActivityEventListener;

.field private customerCenterPromise:Lcom/facebook/react/bridge/Promise;

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->Companion:Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$activityEventListener$1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$activityEventListener$1;-><init>(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->activityEventListener:Lcom/facebook/react/bridge/ActivityEventListener;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->sendEvent$lambda$2(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getCustomerCenterPromise$p(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;)Lcom/facebook/react/bridge/Promise;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->customerCenterPromise:Lcom/facebook/react/bridge/Promise;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$sendEvent(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setCustomerCenterPromise$p(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->customerCenterPromise:Lcom/facebook/react/bridge/Promise;

    .line 2
    .line 3
    return-void
.end method

.method private final createCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$createCustomerCenterListener$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$createCustomerCenterListener$1;-><init>(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final presentCustomerCenterFromActivity(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->createCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/revenuecat/purchases/Purchases$Companion;->getSharedInstance()Lcom/revenuecat/purchases/Purchases;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/Purchases;->setCustomerCenterListener(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/ShowCustomerCenter;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/ShowCustomerCenter;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, LTd/L;->a:LTd/L;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/ShowCustomerCenter;->createIntent(Landroid/content/Context;LTd/L;)Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/16 v1, 0x3e9

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    new-instance v1, Lcom/revenuecat/purchases/react/ui/h;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/h;-><init>(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnUiQueueThread(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final sendEvent$lambda$2(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    const-class v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p0

    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v0, "Error sending event "

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string p2, "RNCustomerCenter"

    .line 34
    .line 35
    invoke-static {p2, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final addListener(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNCustomerCenter"

    .line 2
    .line 3
    return-object v0
.end method

.method public final presentCustomerCenter(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->customerCenterPromise:Lcom/facebook/react/bridge/Promise;

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->presentCustomerCenterFromActivity(Landroid/app/Activity;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string v0, "Could not present Customer Center. There\'s no activity"

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const-string v2, "CUSTOMER_CENTER_MISSING_ACTIVITY"

    .line 26
    .line 27
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final removeListeners(Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    return-void
.end method
