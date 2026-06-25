.class public Lio/sentry/react/r;
.super Lcom/facebook/react/X;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/X;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Ljava/util/Map;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v8, 0x1

    .line 10
    const-string v2, "RNSentry"

    .line 11
    .line 12
    const-string v3, "RNSentry"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x1

    .line 17
    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "RNSentry"

    .line 21
    .line 22
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    new-instance v3, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v10, 0x1

    .line 29
    const-string v4, "RNSentryReplayMask"

    .line 30
    .line 31
    const-string v5, "RNSentryReplayMask"

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    invoke-direct/range {v3 .. v10}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 36
    .line 37
    .line 38
    const-string v1, "RNSentryReplayMask"

    .line 39
    .line 40
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    new-instance v4, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x1

    .line 47
    const-string v5, "RNSentryReplayUnmask"

    .line 48
    .line 49
    const-string v6, "RNSentryReplayUnmask"

    .line 50
    .line 51
    invoke-direct/range {v4 .. v11}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 52
    .line 53
    .line 54
    const-string v1, "RNSentryReplayUnmask"

    .line 55
    .line 56
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method private b(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    const-string v0, "RNSentryReplayMask"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lio/sentry/react/replay/RNSentryReplayMaskManager;

    .line 10
    .line 11
    invoke-direct {p1}, Lio/sentry/react/replay/RNSentryReplayMaskManager;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    const-string v0, "RNSentryReplayUnmask"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Lio/sentry/react/replay/RNSentryReplayUnmaskManager;

    .line 24
    .line 25
    invoke-direct {p1}, Lio/sentry/react/replay/RNSentryReplayUnmaskManager;-><init>()V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return-object p1
.end method


# virtual methods
.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/react/RNSentryOnDrawReporterManager;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lio/sentry/react/RNSentryOnDrawReporterManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lio/sentry/react/replay/RNSentryReplayMaskManager;

    .line 7
    .line 8
    invoke-direct {p1}, Lio/sentry/react/replay/RNSentryReplayMaskManager;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lio/sentry/react/replay/RNSentryReplayUnmaskManager;

    .line 12
    .line 13
    invoke-direct {v1}, Lio/sentry/react/replay/RNSentryReplayUnmaskManager;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p1, v1}, Lio/sentry/react/p;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    const-string v0, "RNSentry"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lio/sentry/react/RNSentryModule;

    .line 10
    .line 11
    invoke-direct {p1, p2}, Lio/sentry/react/RNSentryModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lio/sentry/react/r;->b(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public getReactModuleInfoProvider()Ll7/a;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/react/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/react/q;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
