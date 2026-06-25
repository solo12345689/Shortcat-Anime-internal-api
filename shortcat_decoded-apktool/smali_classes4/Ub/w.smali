.class public abstract LUb/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lcom/facebook/react/bridge/ReactContext;)Lexpo/modules/adapters/react/NativeModulesProxy;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const-string v0, "NativeUnimoduleProxy"

    .line 20
    .line 21
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/CatalystInstance;->getNativeModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p0, v1

    .line 27
    :goto_0
    instance-of v0, p0, Lexpo/modules/adapters/react/NativeModulesProxy;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    check-cast p0, Lexpo/modules/adapters/react/NativeModulesProxy;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    return-object v1

    .line 35
    :cond_2
    check-cast p0, Lcom/facebook/react/uimanager/b0;

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/b0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModules()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_5

    .line 46
    .line 47
    check-cast p0, Ljava/lang/Iterable;

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v2, v0

    .line 64
    check-cast v2, Lcom/facebook/react/bridge/NativeModule;

    .line 65
    .line 66
    instance-of v2, v2, Lexpo/modules/adapters/react/NativeModulesProxy;

    .line 67
    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    move-object v0, v1

    .line 72
    :goto_1
    check-cast v0, Lcom/facebook/react/bridge/NativeModule;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    move-object v0, v1

    .line 76
    :goto_2
    instance-of p0, v0, Lexpo/modules/adapters/react/NativeModulesProxy;

    .line 77
    .line 78
    if-eqz p0, :cond_6

    .line 79
    .line 80
    check-cast v0, Lexpo/modules/adapters/react/NativeModulesProxy;

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_6
    return-object v1
.end method
