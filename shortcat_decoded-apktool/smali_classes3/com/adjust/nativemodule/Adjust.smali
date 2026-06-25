.class public Lcom/adjust/nativemodule/Adjust;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/adjust/sdk/OnAttributionChangedListener;
.implements Lcom/adjust/sdk/OnEventTrackingSucceededListener;
.implements Lcom/adjust/sdk/OnEventTrackingFailedListener;
.implements Lcom/adjust/sdk/OnSessionTrackingSucceededListener;
.implements Lcom/adjust/sdk/OnSessionTrackingFailedListener;
.implements Lcom/adjust/sdk/OnDeferredDeeplinkResponseListener;
.implements Lcom/adjust/sdk/OnRemoteTriggerListener;


# static fields
.field private static TAG:Ljava/lang/String; = "AdjustBridge"


# instance fields
.field private isAttributionCallbackImplemented:Z

.field private isDeferredDeeplinkCallbackImplemented:Z

.field private isDeferredDeeplinkOpeningEnabled:Z

.field private isEventTrackingFailedCallbackImplemented:Z

.field private isEventTrackingSucceededCallbackImplemented:Z

.field private isRemoteTriggerCallbackImplemented:Z

.field private isSessionTrackingFailedCallbackImplemented:Z

.field private isSessionTrackingSucceededCallbackImplemented:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isDeferredDeeplinkOpeningEnabled:Z

    .line 6
    .line 7
    return-void
.end method

.method private checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method private sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 1
    const-class v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 8
    .line 9
    invoke-interface {p1, p2, p3}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public addGlobalCallbackParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lcom/adjust/sdk/Adjust;->addGlobalCallbackParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public addGlobalPartnerParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lcom/adjust/sdk/Adjust;->addGlobalPartnerParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public addListener(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    return-void
.end method

.method public disable()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->disable()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public disableCoppaComplianceInDelay()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->disableCoppaComplianceInDelay()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public disablePlayStoreKidsComplianceInDelay()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->disablePlayStoreKidsComplianceInDelay()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public enable()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->enable()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public enableCoppaComplianceInDelay()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->enableCoppaComplianceInDelay()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public enablePlayStoreKidsComplianceInDelay()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->enablePlayStoreKidsComplianceInDelay()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public endFirstSessionDelay()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->endFirstSessionDelay()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public gdprForgetMe()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->gdprForgetMe(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getAdid(Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    new-instance v0, Lcom/adjust/nativemodule/Adjust$j;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/adjust/nativemodule/Adjust$j;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->getAdid(Lcom/adjust/sdk/OnAdidReadListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public getAdidWithTimeout(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    const-string v1, "timeoutInMilliseconds"

    .line 5
    .line 6
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    double-to-long v0, v0

    .line 18
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v2, Lcom/adjust/nativemodule/Adjust$k;

    .line 23
    .line 24
    invoke-direct {v2, p0, p2}, Lcom/adjust/nativemodule/Adjust$k;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, Lcom/adjust/sdk/Adjust;->getAdidWithTimeout(Landroid/content/Context;JLcom/adjust/sdk/OnAdidReadListener;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    if-eqz p2, :cond_2

    .line 32
    .line 33
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 42
    .line 43
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    return-void
.end method

.method public getAmazonAdId(Lcom/facebook/react/bridge/Callback;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/adjust/nativemodule/Adjust$d;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/adjust/nativemodule/Adjust$d;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/adjust/sdk/Adjust;->getAmazonAdId(Landroid/content/Context;Lcom/adjust/sdk/OnAmazonAdIdReadListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public getAttribution(Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    new-instance v0, Lcom/adjust/nativemodule/Adjust$h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/adjust/nativemodule/Adjust$h;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->getAttribution(Lcom/adjust/sdk/OnAttributionReadListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public getAttributionWithTimeout(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    const-string v1, "timeoutInMilliseconds"

    .line 5
    .line 6
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    double-to-long v0, v0

    .line 18
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v2, Lcom/adjust/nativemodule/Adjust$i;

    .line 23
    .line 24
    invoke-direct {v2, p0, p2}, Lcom/adjust/nativemodule/Adjust$i;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, Lcom/adjust/sdk/Adjust;->getAttributionWithTimeout(Landroid/content/Context;JLcom/adjust/sdk/OnAttributionReadListener;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    if-eqz p2, :cond_2

    .line 32
    .line 33
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 42
    .line 43
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    return-void
.end method

.method public getGoogleAdId(Lcom/facebook/react/bridge/Callback;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/adjust/nativemodule/Adjust$c;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/adjust/nativemodule/Adjust$c;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/adjust/sdk/Adjust;->getGoogleAdId(Landroid/content/Context;Lcom/adjust/sdk/OnGoogleAdIdReadListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public getLastDeeplink(Lcom/facebook/react/bridge/Callback;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/adjust/nativemodule/Adjust$l;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/adjust/nativemodule/Adjust$l;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/adjust/sdk/Adjust;->getLastDeeplink(Landroid/content/Context;Lcom/adjust/sdk/OnLastDeeplinkReadListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Adjust"

    .line 2
    .line 3
    return-object v0
.end method

.method public getSdkVersion(Ljava/lang/String;Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    new-instance v0, Lcom/adjust/nativemodule/Adjust$m;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p1}, Lcom/adjust/nativemodule/Adjust$m;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->getSdkVersion(Lcom/adjust/sdk/OnSdkVersionReadListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public initSdk(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 9
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "logLevel"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "SUPPRESS"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v1, v3

    .line 28
    :goto_0
    const-string v4, "appToken"

    .line 29
    .line 30
    invoke-direct {p0, p1, v4}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v5, :cond_2

    .line 36
    .line 37
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v4, v6

    .line 43
    :goto_1
    const-string v5, "environment"

    .line 44
    .line 45
    invoke-direct {p0, p1, v5}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_3

    .line 50
    .line 51
    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move-object v5, v6

    .line 57
    :goto_2
    new-instance v7, Lcom/adjust/sdk/AdjustConfig;

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-direct {v7, v8, v4, v5, v1}, Lcom/adjust/sdk/AdjustConfig;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_b

    .line 71
    .line 72
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "VERBOSE"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    sget-object v0, Lcom/adjust/sdk/LogLevel;->VERBOSE:Lcom/adjust/sdk/LogLevel;

    .line 85
    .line 86
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    const-string v1, "DEBUG"

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    sget-object v0, Lcom/adjust/sdk/LogLevel;->DEBUG:Lcom/adjust/sdk/LogLevel;

    .line 99
    .line 100
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    const-string v1, "INFO"

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    sget-object v0, Lcom/adjust/sdk/LogLevel;->INFO:Lcom/adjust/sdk/LogLevel;

    .line 113
    .line 114
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const-string v1, "WARN"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    sget-object v0, Lcom/adjust/sdk/LogLevel;->WARN:Lcom/adjust/sdk/LogLevel;

    .line 127
    .line 128
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    const-string v1, "ERROR"

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_8

    .line 139
    .line 140
    sget-object v0, Lcom/adjust/sdk/LogLevel;->ERROR:Lcom/adjust/sdk/LogLevel;

    .line 141
    .line 142
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    const-string v1, "ASSERT"

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_9

    .line 153
    .line 154
    sget-object v0, Lcom/adjust/sdk/LogLevel;->ASSERT:Lcom/adjust/sdk/LogLevel;

    .line 155
    .line 156
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_a

    .line 165
    .line 166
    sget-object v0, Lcom/adjust/sdk/LogLevel;->SUPPRESS:Lcom/adjust/sdk/LogLevel;

    .line 167
    .line 168
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_a
    sget-object v0, Lcom/adjust/sdk/LogLevel;->INFO:Lcom/adjust/sdk/LogLevel;

    .line 173
    .line 174
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 175
    .line 176
    .line 177
    :cond_b
    :goto_3
    const-string v0, "sdkPrefix"

    .line 178
    .line 179
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_c

    .line 184
    .line 185
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setSdkPrefix(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_c
    const-string v0, "processName"

    .line 193
    .line 194
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_d

    .line 199
    .line 200
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setProcessName(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_d
    const-string v0, "defaultTracker"

    .line 208
    .line 209
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_e

    .line 214
    .line 215
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setDefaultTracker(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    :cond_e
    const-string v0, "externalDeviceId"

    .line 223
    .line 224
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-eqz v1, :cond_f

    .line 229
    .line 230
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setExternalDeviceId(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_f
    const-string v0, "urlStrategyDomains"

    .line 238
    .line 239
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_11

    .line 244
    .line 245
    const-string v1, "useSubdomains"

    .line 246
    .line 247
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_11

    .line 252
    .line 253
    const-string v2, "isDataResidency"

    .line 254
    .line 255
    invoke-direct {p0, p1, v2}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_11

    .line 260
    .line 261
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-eqz v0, :cond_11

    .line 270
    .line 271
    new-instance v4, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 274
    .line 275
    .line 276
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    if-ge v3, v5, :cond_10

    .line 281
    .line 282
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    add-int/lit8 v3, v3, 0x1

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_10
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    invoke-virtual {v7, v4, v0, v1}, Lcom/adjust/sdk/AdjustConfig;->setUrlStrategy(Ljava/util/List;ZZ)V

    .line 305
    .line 306
    .line 307
    :cond_11
    const-string v0, "preinstallFilePath"

    .line 308
    .line 309
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-eqz v1, :cond_12

    .line 314
    .line 315
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setPreinstallFilePath(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :cond_12
    const-string v0, "fbAppId"

    .line 323
    .line 324
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_13

    .line 329
    .line 330
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v7, v0}, Lcom/adjust/sdk/AdjustConfig;->setFbAppId(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :cond_13
    const-string v0, "isSendingInBackgroundEnabled"

    .line 338
    .line 339
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_14

    .line 344
    .line 345
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_14

    .line 350
    .line 351
    invoke-virtual {v7}, Lcom/adjust/sdk/AdjustConfig;->enableSendingInBackground()V

    .line 352
    .line 353
    .line 354
    :cond_14
    const-string v0, "isPreinstallTrackingEnabled"

    .line 355
    .line 356
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_15

    .line 361
    .line 362
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_15

    .line 367
    .line 368
    invoke-virtual {v7}, Lcom/adjust/sdk/AdjustConfig;->enablePreinstallTracking()V

    .line 369
    .line 370
    .line 371
    :cond_15
    const-string v0, "isCostDataInAttributionEnabled"

    .line 372
    .line 373
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    if-eqz v1, :cond_16

    .line 378
    .line 379
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-eqz v0, :cond_16

    .line 384
    .line 385
    invoke-virtual {v7}, Lcom/adjust/sdk/AdjustConfig;->enableCostDataInAttribution()V

    .line 386
    .line 387
    .line 388
    :cond_16
    const-string v0, "isPlayStoreKidsComplianceEnabled"

    .line 389
    .line 390
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-eqz v1, :cond_17

    .line 395
    .line 396
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_17

    .line 401
    .line 402
    invoke-virtual {v7}, Lcom/adjust/sdk/AdjustConfig;->enablePlayStoreKidsCompliance()V

    .line 403
    .line 404
    .line 405
    :cond_17
    const-string v0, "isDeferredDeeplinkOpeningEnabled"

    .line 406
    .line 407
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    if-eqz v1, :cond_18

    .line 412
    .line 413
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isDeferredDeeplinkOpeningEnabled:Z

    .line 418
    .line 419
    :cond_18
    const-string v0, "isCoppaComplianceEnabled"

    .line 420
    .line 421
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    if-eqz v1, :cond_19

    .line 426
    .line 427
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-eqz v0, :cond_19

    .line 432
    .line 433
    invoke-virtual {v7}, Lcom/adjust/sdk/AdjustConfig;->enableCoppaCompliance()V

    .line 434
    .line 435
    .line 436
    :cond_19
    const-string v0, "isDeviceIdsReadingOnceEnabled"

    .line 437
    .line 438
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_1a

    .line 443
    .line 444
    const-string v0, "isDeviceIdsReadingOnceEnabled"

    .line 445
    .line 446
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_1a

    .line 451
    .line 452
    invoke-virtual {v7}, Lcom/adjust/sdk/AdjustConfig;->enableDeviceIdsReadingOnce()V

    .line 453
    .line 454
    .line 455
    :cond_1a
    const-string v0, "isFirstSessionDelayEnabled"

    .line 456
    .line 457
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_1b

    .line 462
    .line 463
    const-string v0, "isFirstSessionDelayEnabled"

    .line 464
    .line 465
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_1b

    .line 470
    .line 471
    invoke-virtual {v7}, Lcom/adjust/sdk/AdjustConfig;->enableFirstSessionDelay()V

    .line 472
    .line 473
    .line 474
    :cond_1b
    const-string v0, "isAppSetIdReadingEnabled"

    .line 475
    .line 476
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-eqz v0, :cond_1c

    .line 481
    .line 482
    const-string v0, "isAppSetIdReadingEnabled"

    .line 483
    .line 484
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-nez v0, :cond_1c

    .line 489
    .line 490
    invoke-virtual {v7}, Lcom/adjust/sdk/AdjustConfig;->disableAppSetIdReading()V

    .line 491
    .line 492
    .line 493
    :cond_1c
    const-string v0, "storeInfo"

    .line 494
    .line 495
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    if-eqz v0, :cond_1e

    .line 500
    .line 501
    const-string v0, "storeInfo"

    .line 502
    .line 503
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    new-instance v1, Lorg/json/JSONObject;

    .line 512
    .line 513
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    const-string v0, "storeName"

    .line 517
    .line 518
    invoke-virtual {v1, v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->e(Ljava/lang/String;)Z

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    if-eqz v2, :cond_1e

    .line 527
    .line 528
    new-instance v2, Lcom/adjust/sdk/AdjustStoreInfo;

    .line 529
    .line 530
    invoke-direct {v2, v0}, Lcom/adjust/sdk/AdjustStoreInfo;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    const-string v0, "storeAppId"

    .line 534
    .line 535
    invoke-virtual {v1, v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->e(Ljava/lang/String;)Z

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    if-eqz v1, :cond_1d

    .line 544
    .line 545
    invoke-virtual {v2, v0}, Lcom/adjust/sdk/AdjustStoreInfo;->setStoreAppId(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    :cond_1d
    invoke-virtual {v7, v2}, Lcom/adjust/sdk/AdjustConfig;->setStoreInfo(Lcom/adjust/sdk/AdjustStoreInfo;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 549
    .line 550
    .line 551
    :catch_0
    :cond_1e
    const-string v0, "eventDeduplicationIdsMaxSize"

    .line 552
    .line 553
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    if-eqz v0, :cond_1f

    .line 558
    .line 559
    const-string v0, "eventDeduplicationIdsMaxSize"

    .line 560
    .line 561
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 562
    .line 563
    .line 564
    move-result p1

    .line 565
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    invoke-virtual {v7, p1}, Lcom/adjust/sdk/AdjustConfig;->setEventDeduplicationIdsMaxSize(Ljava/lang/Integer;)V

    .line 570
    .line 571
    .line 572
    :cond_1f
    iget-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isAttributionCallbackImplemented:Z

    .line 573
    .line 574
    if-eqz p1, :cond_20

    .line 575
    .line 576
    invoke-virtual {v7, p0}, Lcom/adjust/sdk/AdjustConfig;->setOnAttributionChangedListener(Lcom/adjust/sdk/OnAttributionChangedListener;)V

    .line 577
    .line 578
    .line 579
    :cond_20
    iget-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isEventTrackingSucceededCallbackImplemented:Z

    .line 580
    .line 581
    if-eqz p1, :cond_21

    .line 582
    .line 583
    invoke-virtual {v7, p0}, Lcom/adjust/sdk/AdjustConfig;->setOnEventTrackingSucceededListener(Lcom/adjust/sdk/OnEventTrackingSucceededListener;)V

    .line 584
    .line 585
    .line 586
    :cond_21
    iget-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isEventTrackingFailedCallbackImplemented:Z

    .line 587
    .line 588
    if-eqz p1, :cond_22

    .line 589
    .line 590
    invoke-virtual {v7, p0}, Lcom/adjust/sdk/AdjustConfig;->setOnEventTrackingFailedListener(Lcom/adjust/sdk/OnEventTrackingFailedListener;)V

    .line 591
    .line 592
    .line 593
    :cond_22
    iget-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isSessionTrackingSucceededCallbackImplemented:Z

    .line 594
    .line 595
    if-eqz p1, :cond_23

    .line 596
    .line 597
    invoke-virtual {v7, p0}, Lcom/adjust/sdk/AdjustConfig;->setOnSessionTrackingSucceededListener(Lcom/adjust/sdk/OnSessionTrackingSucceededListener;)V

    .line 598
    .line 599
    .line 600
    :cond_23
    iget-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isSessionTrackingFailedCallbackImplemented:Z

    .line 601
    .line 602
    if-eqz p1, :cond_24

    .line 603
    .line 604
    invoke-virtual {v7, p0}, Lcom/adjust/sdk/AdjustConfig;->setOnSessionTrackingFailedListener(Lcom/adjust/sdk/OnSessionTrackingFailedListener;)V

    .line 605
    .line 606
    .line 607
    :cond_24
    iget-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isDeferredDeeplinkCallbackImplemented:Z

    .line 608
    .line 609
    if-eqz p1, :cond_25

    .line 610
    .line 611
    invoke-virtual {v7, p0}, Lcom/adjust/sdk/AdjustConfig;->setOnDeferredDeeplinkResponseListener(Lcom/adjust/sdk/OnDeferredDeeplinkResponseListener;)V

    .line 612
    .line 613
    .line 614
    :cond_25
    iget-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isRemoteTriggerCallbackImplemented:Z

    .line 615
    .line 616
    if-eqz p1, :cond_26

    .line 617
    .line 618
    invoke-virtual {v7, p0}, Lcom/adjust/sdk/AdjustConfig;->setOnRemoteTriggerListener(Lcom/adjust/sdk/OnRemoteTriggerListener;)V

    .line 619
    .line 620
    .line 621
    :cond_26
    invoke-static {v7}, Lcom/adjust/sdk/Adjust;->initSdk(Lcom/adjust/sdk/AdjustConfig;)V

    .line 622
    .line 623
    .line 624
    return-void
.end method

.method public isEnabled(Lcom/facebook/react/bridge/Callback;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/adjust/nativemodule/Adjust$g;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/adjust/nativemodule/Adjust$g;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/adjust/sdk/Adjust;->isEnabled(Landroid/content/Context;Lcom/adjust/sdk/OnIsEnabledListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public launchReceivedDeeplink(Landroid/net/Uri;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "adjust_deferredDeeplinkReceived"

    .line 6
    .line 7
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->b(Landroid/net/Uri;)Lcom/facebook/react/bridge/WritableMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/adjust/nativemodule/Adjust;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 12
    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/adjust/nativemodule/Adjust;->isDeferredDeeplinkOpeningEnabled:Z

    .line 15
    .line 16
    return p1
.end method

.method public onAttributionChanged(Lcom/adjust/sdk/AdjustAttribution;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "adjust_attributionChanged"

    .line 6
    .line 7
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->a(Lcom/adjust/sdk/AdjustAttribution;)Lcom/facebook/react/bridge/WritableMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/adjust/nativemodule/Adjust;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onEventTrackingFailed(Lcom/adjust/sdk/AdjustEventFailure;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "adjust_eventTrackingFailed"

    .line 6
    .line 7
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->c(Lcom/adjust/sdk/AdjustEventFailure;)Lcom/facebook/react/bridge/WritableMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/adjust/nativemodule/Adjust;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onEventTrackingSucceeded(Lcom/adjust/sdk/AdjustEventSuccess;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "adjust_eventTrackingSucceeded"

    .line 6
    .line 7
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->d(Lcom/adjust/sdk/AdjustEventSuccess;)Lcom/facebook/react/bridge/WritableMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/adjust/nativemodule/Adjust;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onPause()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->onPause()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onRemoteTrigger(Lcom/adjust/sdk/AdjustRemoteTrigger;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "adjust_remoteTriggerReceived"

    .line 6
    .line 7
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->f(Lcom/adjust/sdk/AdjustRemoteTrigger;)Lcom/facebook/react/bridge/WritableMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/adjust/nativemodule/Adjust;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onResume()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->onResume()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onSessionTrackingFailed(Lcom/adjust/sdk/AdjustSessionFailure;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "adjust_sessionTrackingFailed"

    .line 6
    .line 7
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->g(Lcom/adjust/sdk/AdjustSessionFailure;)Lcom/facebook/react/bridge/WritableMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/adjust/nativemodule/Adjust;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onSessionTrackingSucceeded(Lcom/adjust/sdk/AdjustSessionSuccess;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "adjust_sessionTrackingSucceeded"

    .line 6
    .line 7
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->h(Lcom/adjust/sdk/AdjustSessionSuccess;)Lcom/facebook/react/bridge/WritableMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/adjust/nativemodule/Adjust;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public processAndResolveDeeplink(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string v1, "deeplink"

    .line 15
    .line 16
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :cond_2
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Lcom/adjust/sdk/AdjustDeeplink;

    .line 37
    .line 38
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {v1, v0}, Lcom/adjust/sdk/AdjustDeeplink;-><init>(Landroid/net/Uri;)V

    .line 43
    .line 44
    .line 45
    const-string v0, "referrer"

    .line 46
    .line 47
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v1, p1}, Lcom/adjust/sdk/AdjustDeeplink;->setReferrer(Landroid/net/Uri;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v0, Lcom/adjust/nativemodule/Adjust$e;

    .line 69
    .line 70
    invoke-direct {v0, p0, p2}, Lcom/adjust/nativemodule/Adjust$e;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v1, p1, v0}, Lcom/adjust/sdk/Adjust;->processAndResolveDeeplink(Lcom/adjust/sdk/AdjustDeeplink;Landroid/content/Context;Lcom/adjust/sdk/OnDeeplinkResolvedListener;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public processDeeplink(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "deeplink"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/adjust/sdk/AdjustDeeplink;

    .line 18
    .line 19
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {v1, v0}, Lcom/adjust/sdk/AdjustDeeplink;-><init>(Landroid/net/Uri;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "referrer"

    .line 27
    .line 28
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, Lcom/adjust/sdk/AdjustDeeplink;->setReferrer(Landroid/net/Uri;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v1, p1}, Lcom/adjust/sdk/Adjust;->processDeeplink(Lcom/adjust/sdk/AdjustDeeplink;Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public removeGlobalCallbackParameter(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/adjust/sdk/Adjust;->removeGlobalCallbackParameter(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public removeGlobalCallbackParameters()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->removeGlobalCallbackParameters()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public removeGlobalPartnerParameter(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/adjust/sdk/Adjust;->removeGlobalPartnerParameter(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public removeGlobalPartnerParameters()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->removeGlobalPartnerParameters()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public removeListeners(D)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    return-void
.end method

.method public resolveLinkWithUrl(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :cond_1
    if-eqz p2, :cond_3

    .line 15
    .line 16
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-lez v1, :cond_3

    .line 21
    .line 22
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-array v1, v0, [Ljava/lang/String;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-ge v2, v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    aput-object v3, v1, v2

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v0, v1

    .line 41
    :cond_3
    new-instance p2, Lcom/adjust/nativemodule/Adjust$f;

    .line 42
    .line 43
    invoke-direct {p2, p0, p3}, Lcom/adjust/nativemodule/Adjust$f;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v0, p2}, Lcom/adjust/sdk/AdjustLinkResolution;->resolveLink(Ljava/lang/String;[Ljava/lang/String;Lcom/adjust/sdk/AdjustLinkResolution$AdjustLinkResolutionCallback;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public setAttributionCallbackImplemented()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isAttributionCallbackImplemented:Z

    .line 3
    .line 4
    return-void
.end method

.method public setDeferredDeeplinkCallbackImplemented()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isDeferredDeeplinkCallbackImplemented:Z

    .line 3
    .line 4
    return-void
.end method

.method public setEventTrackingFailedCallbackImplemented()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isEventTrackingFailedCallbackImplemented:Z

    .line 3
    .line 4
    return-void
.end method

.method public setEventTrackingSucceededCallbackImplemented()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isEventTrackingSucceededCallbackImplemented:Z

    .line 3
    .line 4
    return-void
.end method

.method public setExternalDeviceIdInDelay(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/adjust/sdk/Adjust;->setExternalDeviceIdInDelay(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setPushToken(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lcom/adjust/sdk/Adjust;->setPushToken(Ljava/lang/String;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setRemoteTriggerCallbackImplemented()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isRemoteTriggerCallbackImplemented:Z

    .line 3
    .line 4
    return-void
.end method

.method public setSessionTrackingFailedCallbackImplemented()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isSessionTrackingFailedCallbackImplemented:Z

    .line 3
    .line 4
    return-void
.end method

.method public setSessionTrackingSucceededCallbackImplemented()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isSessionTrackingSucceededCallbackImplemented:Z

    .line 3
    .line 4
    return-void
.end method

.method public setTestOptions(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/adjust/sdk/AdjustTestOptions;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/adjust/sdk/AdjustTestOptions;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "baseUrl"

    .line 10
    .line 11
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->baseUrl:Ljava/lang/String;

    .line 22
    .line 23
    :cond_1
    const-string v1, "gdprUrl"

    .line 24
    .line 25
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->gdprUrl:Ljava/lang/String;

    .line 36
    .line 37
    :cond_2
    const-string v1, "subscriptionUrl"

    .line 38
    .line 39
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->subscriptionUrl:Ljava/lang/String;

    .line 50
    .line 51
    :cond_3
    const-string v1, "purchaseVerificationUrl"

    .line 52
    .line 53
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->purchaseVerificationUrl:Ljava/lang/String;

    .line 64
    .line 65
    :cond_4
    const-string v1, "basePath"

    .line 66
    .line 67
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->basePath:Ljava/lang/String;

    .line 78
    .line 79
    :cond_5
    const-string v1, "gdprPath"

    .line 80
    .line 81
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_6

    .line 86
    .line 87
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->gdprPath:Ljava/lang/String;

    .line 92
    .line 93
    :cond_6
    const-string v1, "subscriptionPath"

    .line 94
    .line 95
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->subscriptionPath:Ljava/lang/String;

    .line 106
    .line 107
    :cond_7
    const-string v1, "purchaseVerificationPath"

    .line 108
    .line 109
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_8

    .line 114
    .line 115
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->purchaseVerificationPath:Ljava/lang/String;

    .line 120
    .line 121
    :cond_8
    const-string v1, "timerIntervalInMilliseconds"

    .line 122
    .line 123
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    const-string v3, "Can\'t format number"

    .line 128
    .line 129
    if-eqz v2, :cond_9

    .line 130
    .line 131
    :try_start_0
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 136
    .line 137
    .line 138
    move-result-wide v1

    .line 139
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->timerIntervalInMilliseconds:Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :catch_0
    move-exception v1

    .line 147
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 148
    .line 149
    .line 150
    sget-object v1, Lcom/adjust/nativemodule/Adjust;->TAG:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_9
    :goto_0
    const-string v1, "timerStartInMilliseconds"

    .line 156
    .line 157
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_a

    .line 162
    .line 163
    :try_start_1
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v1

    .line 171
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->timerStartInMilliseconds:Ljava/lang/Long;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :catch_1
    move-exception v1

    .line 179
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 180
    .line 181
    .line 182
    sget-object v1, Lcom/adjust/nativemodule/Adjust;->TAG:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    :cond_a
    :goto_1
    const-string v1, "sessionIntervalInMilliseconds"

    .line 188
    .line 189
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_b

    .line 194
    .line 195
    :try_start_2
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v1

    .line 203
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->sessionIntervalInMilliseconds:Ljava/lang/Long;
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :catch_2
    move-exception v1

    .line 211
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 212
    .line 213
    .line 214
    sget-object v1, Lcom/adjust/nativemodule/Adjust;->TAG:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    :cond_b
    :goto_2
    const-string v1, "subsessionIntervalInMilliseconds"

    .line 220
    .line 221
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_c

    .line 226
    .line 227
    :try_start_3
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 232
    .line 233
    .line 234
    move-result-wide v1

    .line 235
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->subsessionIntervalInMilliseconds:Ljava/lang/Long;
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :catch_3
    move-exception v1

    .line 243
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 244
    .line 245
    .line 246
    sget-object v1, Lcom/adjust/nativemodule/Adjust;->TAG:Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 249
    .line 250
    .line 251
    :cond_c
    :goto_3
    const-string v1, "noBackoffWait"

    .line 252
    .line 253
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_d

    .line 258
    .line 259
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->noBackoffWait:Ljava/lang/Boolean;

    .line 268
    .line 269
    :cond_d
    const-string v1, "teardown"

    .line 270
    .line 271
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-eqz v2, :cond_e

    .line 276
    .line 277
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->teardown:Ljava/lang/Boolean;

    .line 286
    .line 287
    :cond_e
    const-string v1, "deleteState"

    .line 288
    .line 289
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-eqz v2, :cond_f

    .line 294
    .line 295
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    const/4 v2, 0x1

    .line 300
    if-ne v1, v2, :cond_f

    .line 301
    .line 302
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    iput-object v1, v0, Lcom/adjust/sdk/AdjustTestOptions;->context:Landroid/content/Context;

    .line 307
    .line 308
    :cond_f
    const-string v1, "ignoreSystemLifecycleBootstrap"

    .line 309
    .line 310
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_10

    .line 315
    .line 316
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    iput-object p1, v0, Lcom/adjust/sdk/AdjustTestOptions;->ignoreSystemLifecycleBootstrap:Ljava/lang/Boolean;

    .line 325
    .line 326
    :cond_10
    invoke-static {v0}, Lcom/adjust/sdk/Adjust;->setTestOptions(Lcom/adjust/sdk/AdjustTestOptions;)V

    .line 327
    .line 328
    .line 329
    return-void
.end method

.method public switchBackToOnlineMode()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->switchBackToOnlineMode()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public switchToOfflineMode()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/adjust/sdk/Adjust;->switchToOfflineMode()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public teardown()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isAttributionCallbackImplemented:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isEventTrackingSucceededCallbackImplemented:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isEventTrackingFailedCallbackImplemented:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isSessionTrackingSucceededCallbackImplemented:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isSessionTrackingFailedCallbackImplemented:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isDeferredDeeplinkCallbackImplemented:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/adjust/nativemodule/Adjust;->isRemoteTriggerCallbackImplemented:Z

    .line 15
    .line 16
    return-void
.end method

.method public trackAdRevenue(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "source"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    :goto_0
    new-instance v1, Lcom/adjust/sdk/AdjustAdRevenue;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lcom/adjust/sdk/AdjustAdRevenue;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "revenue"

    .line 24
    .line 25
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "currency"

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    invoke-direct {p0, p1, v3}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    :cond_2
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2, v0}, Lcom/adjust/sdk/AdjustAdRevenue;->setRevenue(Ljava/lang/Double;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    const-string v0, "adImpressionsCount"

    .line 55
    .line 56
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustAdRevenue;->setAdImpressionsCount(Ljava/lang/Integer;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    const-string v0, "adRevenueNetwork"

    .line 74
    .line 75
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustAdRevenue;->setAdRevenueNetwork(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    const-string v0, "adRevenueUnit"

    .line 91
    .line 92
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustAdRevenue;->setAdRevenueUnit(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    const-string v0, "adRevenuePlacement"

    .line 108
    .line 109
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_7

    .line 114
    .line 115
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustAdRevenue;->setAdRevenuePlacement(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_7
    const-string v0, "callbackParameters"

    .line 125
    .line 126
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    const/4 v3, 0x0

    .line 131
    if-eqz v2, :cond_8

    .line 132
    .line 133
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    move v2, v3

    .line 144
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-ge v2, v4, :cond_8

    .line 149
    .line 150
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    add-int/lit8 v5, v2, 0x1

    .line 159
    .line 160
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-virtual {v1, v4, v5}, Lcom/adjust/sdk/AdjustAdRevenue;->addCallbackParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    add-int/lit8 v2, v2, 0x2

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_8
    const-string v0, "partnerParameters"

    .line 175
    .line 176
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_9

    .line 181
    .line 182
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-eqz p1, :cond_9

    .line 191
    .line 192
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-ge v3, v0, :cond_9

    .line 197
    .line 198
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    add-int/lit8 v2, v3, 0x1

    .line 207
    .line 208
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v1, v0, v2}, Lcom/adjust/sdk/AdjustAdRevenue;->addPartnerParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    add-int/lit8 v3, v3, 0x2

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_9
    invoke-static {v1}, Lcom/adjust/sdk/Adjust;->trackAdRevenue(Lcom/adjust/sdk/AdjustAdRevenue;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public trackEvent(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "eventToken"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    :goto_0
    new-instance v1, Lcom/adjust/sdk/AdjustEvent;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lcom/adjust/sdk/AdjustEvent;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "revenue"

    .line 24
    .line 25
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "currency"

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    invoke-direct {p0, p1, v3}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    :cond_2
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v4, v5, v0}, Lcom/adjust/sdk/AdjustEvent;->setRevenue(DLjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    const-string v0, "callbackParameters"

    .line 51
    .line 52
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    const/4 v3, 0x0

    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    move v2, v3

    .line 70
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-ge v2, v4, :cond_4

    .line 75
    .line 76
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    add-int/lit8 v5, v2, 0x1

    .line 85
    .line 86
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v1, v4, v5}, Lcom/adjust/sdk/AdjustEvent;->addCallbackParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const-string v0, "partnerParameters"

    .line 101
    .line 102
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-ge v3, v2, :cond_5

    .line 123
    .line 124
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    add-int/lit8 v4, v3, 0x1

    .line 133
    .line 134
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v1, v2, v4}, Lcom/adjust/sdk/AdjustEvent;->addPartnerParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    add-int/lit8 v3, v3, 0x2

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_5
    const-string v0, "transactionId"

    .line 149
    .line 150
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustEvent;->setOrderId(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    const-string v0, "callbackId"

    .line 166
    .line 167
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_7

    .line 172
    .line 173
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_7

    .line 178
    .line 179
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustEvent;->setCallbackId(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :cond_7
    const-string v0, "productId"

    .line 183
    .line 184
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_8

    .line 189
    .line 190
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_8

    .line 195
    .line 196
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustEvent;->setProductId(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    const-string v0, "purchaseToken"

    .line 200
    .line 201
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_9

    .line 206
    .line 207
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-eqz v0, :cond_9

    .line 212
    .line 213
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustEvent;->setPurchaseToken(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_9
    const-string v0, "deduplicationId"

    .line 217
    .line 218
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_a

    .line 223
    .line 224
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    if-eqz p1, :cond_a

    .line 229
    .line 230
    invoke-virtual {v1, p1}, Lcom/adjust/sdk/AdjustEvent;->setDeduplicationId(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :cond_a
    invoke-static {v1}, Lcom/adjust/sdk/Adjust;->trackEvent(Lcom/adjust/sdk/AdjustEvent;)V

    .line 234
    .line 235
    .line 236
    return-void
.end method

.method public trackMeasurementConsent(Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/adjust/sdk/Adjust;->trackMeasurementConsent(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public trackPlayStoreSubscription(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 12
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "price"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, -0x1

    .line 18
    :goto_0
    const-string v1, "currency"

    .line 19
    .line 20
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v7, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object v7, v3

    .line 34
    :goto_1
    const-string v1, "sku"

    .line 35
    .line 36
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    move-object v8, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move-object v8, v3

    .line 49
    :goto_2
    const-string v1, "orderId"

    .line 50
    .line 51
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v9, v1

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move-object v9, v3

    .line 64
    :goto_3
    const-string v1, "signature"

    .line 65
    .line 66
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    move-object v10, v1

    .line 77
    goto :goto_4

    .line 78
    :cond_5
    move-object v10, v3

    .line 79
    :goto_4
    const-string v1, "purchaseToken"

    .line 80
    .line 81
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_6

    .line 86
    .line 87
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :cond_6
    move-object v11, v3

    .line 92
    new-instance v4, Lcom/adjust/sdk/AdjustPlayStoreSubscription;

    .line 93
    .line 94
    int-to-long v5, v0

    .line 95
    invoke-direct/range {v4 .. v11}, Lcom/adjust/sdk/AdjustPlayStoreSubscription;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v0, "purchaseTime"

    .line 99
    .line 100
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_7

    .line 105
    .line 106
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    int-to-long v0, v0

    .line 111
    invoke-virtual {v4, v0, v1}, Lcom/adjust/sdk/AdjustPlayStoreSubscription;->setPurchaseTime(J)V

    .line 112
    .line 113
    .line 114
    :cond_7
    const-string v0, "callbackParameters"

    .line 115
    .line 116
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/4 v2, 0x0

    .line 121
    if-eqz v1, :cond_8

    .line 122
    .line 123
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    move v1, v2

    .line 134
    :goto_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-ge v1, v3, :cond_8

    .line 139
    .line 140
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    add-int/lit8 v5, v1, 0x1

    .line 149
    .line 150
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v4, v3, v5}, Lcom/adjust/sdk/AdjustPlayStoreSubscription;->addCallbackParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v1, v1, 0x2

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_8
    const-string v0, "partnerParameters"

    .line 165
    .line 166
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-eqz p1, :cond_9

    .line 181
    .line 182
    :goto_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-ge v2, v0, :cond_9

    .line 187
    .line 188
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    add-int/lit8 v1, v2, 0x1

    .line 197
    .line 198
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v4, v0, v1}, Lcom/adjust/sdk/AdjustPlayStoreSubscription;->addPartnerParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    add-int/lit8 v2, v2, 0x2

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_9
    invoke-static {v4}, Lcom/adjust/sdk/Adjust;->trackPlayStoreSubscription(Lcom/adjust/sdk/AdjustPlayStoreSubscription;)V

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public trackThirdPartySharing(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "isEnabled"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    new-instance v1, Lcom/adjust/sdk/AdjustThirdPartySharing;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lcom/adjust/sdk/AdjustThirdPartySharing;-><init>(Ljava/lang/Boolean;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "granularOptions"

    .line 28
    .line 29
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    move v2, v3

    .line 47
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-ge v2, v4, :cond_2

    .line 52
    .line 53
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    add-int/lit8 v5, v2, 0x1

    .line 62
    .line 63
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    add-int/lit8 v6, v2, 0x2

    .line 72
    .line 73
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v1, v4, v5, v6}, Lcom/adjust/sdk/AdjustThirdPartySharing;->addGranularOption(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const-string v0, "partnerSharingSettings"

    .line 88
    .line 89
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_3

    .line 104
    .line 105
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-ge v3, v0, :cond_3

    .line 110
    .line 111
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    add-int/lit8 v2, v3, 0x1

    .line 120
    .line 121
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    add-int/lit8 v4, v3, 0x2

    .line 130
    .line 131
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    invoke-virtual {v1, v0, v2, v4}, Lcom/adjust/sdk/AdjustThirdPartySharing;->addPartnerSharingSetting(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v3, v3, 0x3

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_3
    invoke-static {v1}, Lcom/adjust/sdk/Adjust;->trackThirdPartySharing(Lcom/adjust/sdk/AdjustThirdPartySharing;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public verifyAndTrackPlayStorePurchase(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    const-string v0, "eventToken"

    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_0
    new-instance v1, Lcom/adjust/sdk/AdjustEvent;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lcom/adjust/sdk/AdjustEvent;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "revenue"

    .line 37
    .line 38
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v3, "currency"

    .line 43
    .line 44
    if-nez v2, :cond_3

    .line 45
    .line 46
    invoke-direct {p0, p1, v3}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    :cond_3
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v1, v4, v5, v0}, Lcom/adjust/sdk/AdjustEvent;->setRevenue(DLjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    const-string v0, "callbackParameters"

    .line 64
    .line 65
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/4 v3, 0x0

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    move v2, v3

    .line 83
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v2, v4, :cond_5

    .line 88
    .line 89
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    add-int/lit8 v5, v2, 0x1

    .line 98
    .line 99
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v1, v4, v5}, Lcom/adjust/sdk/AdjustEvent;->addCallbackParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v2, v2, 0x2

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    const-string v0, "partnerParameters"

    .line 114
    .line 115
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lcom/adjust/nativemodule/a;->i(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-ge v3, v2, :cond_6

    .line 136
    .line 137
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    add-int/lit8 v4, v3, 0x1

    .line 146
    .line 147
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {v1, v2, v4}, Lcom/adjust/sdk/AdjustEvent;->addPartnerParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v3, v3, 0x2

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_6
    const-string v0, "transactionId"

    .line 162
    .line 163
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_7

    .line 168
    .line 169
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_7

    .line 174
    .line 175
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustEvent;->setOrderId(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    const-string v0, "callbackId"

    .line 179
    .line 180
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_8

    .line 185
    .line 186
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_8

    .line 191
    .line 192
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustEvent;->setCallbackId(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_8
    const-string v0, "productId"

    .line 196
    .line 197
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_9

    .line 202
    .line 203
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-eqz v0, :cond_9

    .line 208
    .line 209
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustEvent;->setProductId(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :cond_9
    const-string v0, "purchaseToken"

    .line 213
    .line 214
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_a

    .line 219
    .line 220
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-eqz v0, :cond_a

    .line 225
    .line 226
    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustEvent;->setPurchaseToken(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :cond_a
    const-string v0, "deduplicationId"

    .line 230
    .line 231
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-eqz v2, :cond_b

    .line 236
    .line 237
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    if-eqz p1, :cond_b

    .line 242
    .line 243
    invoke-virtual {v1, p1}, Lcom/adjust/sdk/AdjustEvent;->setDeduplicationId(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :cond_b
    new-instance p1, Lcom/adjust/nativemodule/Adjust$b;

    .line 247
    .line 248
    invoke-direct {p1, p0, p2}, Lcom/adjust/nativemodule/Adjust$b;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v1, p1}, Lcom/adjust/sdk/Adjust;->verifyAndTrackPlayStorePurchase(Lcom/adjust/sdk/AdjustEvent;Lcom/adjust/sdk/OnPurchaseVerificationFinishedListener;)V

    .line 252
    .line 253
    .line 254
    return-void
.end method

.method public verifyPlayStorePurchase(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    const-string v0, "productId"

    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move-object v0, v2

    .line 32
    :goto_0
    const-string v1, "purchaseToken"

    .line 33
    .line 34
    invoke-direct {p0, p1, v1}, Lcom/adjust/nativemodule/Adjust;->checkKey(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :cond_3
    new-instance p1, Lcom/adjust/sdk/AdjustPlayStorePurchase;

    .line 45
    .line 46
    invoke-direct {p1, v0, v2}, Lcom/adjust/sdk/AdjustPlayStorePurchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lcom/adjust/nativemodule/Adjust$a;

    .line 50
    .line 51
    invoke-direct {v0, p0, p2}, Lcom/adjust/nativemodule/Adjust$a;-><init>(Lcom/adjust/nativemodule/Adjust;Lcom/facebook/react/bridge/Callback;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0}, Lcom/adjust/sdk/Adjust;->verifyPlayStorePurchase(Lcom/adjust/sdk/AdjustPlayStorePurchase;Lcom/adjust/sdk/OnPurchaseVerificationFinishedListener;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
