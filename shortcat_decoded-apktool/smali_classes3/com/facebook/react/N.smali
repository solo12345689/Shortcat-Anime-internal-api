.class public abstract Lcom/facebook/react/N;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/app/Application;

.field private b:Lcom/facebook/react/H;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "ReactNativeHost"

    .line 2
    .line 3
    sget-object v1, LW6/a;->b:LW6/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LW6/b;->a(Ljava/lang/String;LW6/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method protected constructor <init>(Landroid/app/Application;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/N;->a:Landroid/app/Application;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public declared-synchronized c()Lcom/facebook/react/H;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/N;->b:Lcom/facebook/react/H;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->INIT_REACT_RUNTIME_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->GET_REACT_INSTANCE_MANAGER_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/react/N;->createReactInstanceManager()Lcom/facebook/react/H;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/facebook/react/N;->b:Lcom/facebook/react/H;

    .line 21
    .line 22
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->GET_REACT_INSTANCE_MANAGER_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

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
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/N;->b:Lcom/facebook/react/H;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-object v0

    .line 34
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v0
.end method

.method protected createReactInstanceManager()Lcom/facebook/react/H;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->BUILD_REACT_INSTANCE_MANAGER_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/N;->getBaseReactInstanceManagerBuilder()Lcom/facebook/react/K;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->BUILD_REACT_INSTANCE_MANAGER_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 11
    .line 12
    invoke-static {v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/K;->b()Lcom/facebook/react/H;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public e()LU6/h;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/N$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/N$a;-><init>(Lcom/facebook/react/N;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public abstract f()Z
.end method

.method public declared-synchronized g()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/N;->b:Lcom/facebook/react/H;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    monitor-exit p0

    .line 10
    return v0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
.end method

.method protected final getApplication()Landroid/app/Application;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/N;->a:Landroid/app/Application;

    .line 2
    .line 3
    return-object v0
.end method

.method protected getBaseReactInstanceManagerBuilder()Lcom/facebook/react/K;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/H;->u()Lcom/facebook/react/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/facebook/react/N;->a:Landroid/app/Application;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->d(Landroid/app/Application;)Lcom/facebook/react/K;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/N;->getJSMainModuleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->m(Ljava/lang/String;)Lcom/facebook/react/K;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Lcom/facebook/react/N;->f()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->v(Z)Lcom/facebook/react/K;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Lcom/facebook/react/N;->getDevSupportManagerFactory()Lcom/facebook/react/devsupport/b0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->h(Lcom/facebook/react/devsupport/b0;)Lcom/facebook/react/K;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0}, Lcom/facebook/react/N;->getDevLoadingViewManager()Lc7/d;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->g(Lc7/d;)Lcom/facebook/react/K;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0}, Lcom/facebook/react/N;->d()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->s(Z)Lcom/facebook/react/K;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0}, Lcom/facebook/react/N;->e()LU6/h;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->t(LU6/h;)Lcom/facebook/react/K;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0}, Lcom/facebook/react/N;->getJSExceptionHandler()Lcom/facebook/react/bridge/JSExceptionHandler;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->l(Lcom/facebook/react/bridge/JSExceptionHandler;)Lcom/facebook/react/K;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0}, Lcom/facebook/react/N;->b()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->o(Z)Lcom/facebook/react/K;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0}, Lcom/facebook/react/N;->getRedBoxHandler()Lc7/j;

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->r(Lc7/j;)Lcom/facebook/react/K;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0}, Lcom/facebook/react/N;->getJavaScriptExecutorFactory()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->n(Lcom/facebook/react/bridge/JavaScriptExecutorFactory;)Lcom/facebook/react/K;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0}, Lcom/facebook/react/N;->getUIManagerProvider()Lcom/facebook/react/bridge/UIManagerProvider;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->u(Lcom/facebook/react/bridge/UIManagerProvider;)Lcom/facebook/react/K;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sget-object v1, Lcom/facebook/react/common/LifecycleState;->a:Lcom/facebook/react/common/LifecycleState;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->i(Lcom/facebook/react/common/LifecycleState;)Lcom/facebook/react/K;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0}, Lcom/facebook/react/N;->getReactPackageTurboModuleManagerDelegateBuilder()Lcom/facebook/react/T$a;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->q(Lcom/facebook/react/T$a;)Lcom/facebook/react/K;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p0}, Lcom/facebook/react/N;->getChoreographerProvider()Lg7/b;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->f(Lg7/b;)Lcom/facebook/react/K;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {p0}, Lcom/facebook/react/N;->getPausedInDebuggerOverlayManager()Lc7/i;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->p(Lc7/i;)Lcom/facebook/react/K;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0}, Lcom/facebook/react/N;->getPackages()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_0

    .line 142
    .line 143
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Lcom/facebook/react/O;

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Lcom/facebook/react/K;->a(Lcom/facebook/react/O;)Lcom/facebook/react/K;

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/N;->getJSBundleFile()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    if-eqz v1, :cond_1

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->j(Ljava/lang/String;)Lcom/facebook/react/K;

    .line 160
    .line 161
    .line 162
    return-object v0

    .line 163
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/N;->getBundleAssetName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v1}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->e(Ljava/lang/String;)Lcom/facebook/react/K;

    .line 174
    .line 175
    .line 176
    return-object v0
.end method

.method protected getBundleAssetName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "index.android.bundle"

    .line 2
    .line 3
    return-object v0
.end method

.method protected getChoreographerProvider()Lg7/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected getDevLoadingViewManager()Lc7/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected getDevSupportManagerFactory()Lcom/facebook/react/devsupport/b0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected getJSBundleFile()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected getJSExceptionHandler()Lcom/facebook/react/bridge/JSExceptionHandler;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected getJSMainModuleName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "index.android"

    .line 2
    .line 3
    return-object v0
.end method

.method protected getJavaScriptExecutorFactory()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected abstract getPackages()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/react/O;",
            ">;"
        }
    .end annotation
.end method

.method protected getPausedInDebuggerOverlayManager()Lc7/i;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected getReactPackageTurboModuleManagerDelegateBuilder()Lcom/facebook/react/T$a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected getRedBoxHandler()Lc7/j;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected getUIManagerProvider()Lcom/facebook/react/bridge/UIManagerProvider;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/M;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/M;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
