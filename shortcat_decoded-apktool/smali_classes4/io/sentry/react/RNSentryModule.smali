.class public Lio/sentry/react/RNSentryModule;
.super Lio/sentry/react/NativeRNSentrySpec;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final impl:Lio/sentry/react/n;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/react/NativeRNSentrySpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/react/n;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lio/sentry/react/n;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public addBreadcrumb(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->l(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addListener(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->m(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public captureEnvelope(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/react/n;->o(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public captureReplay(ZLcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->p(ZLcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public captureScreenshot(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->q(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clearBreadcrumbs()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/react/n;->s()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public closeNativeSdk(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->t(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public crash()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/react/n;->v()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public crashedLastRun(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->w(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public disableNativeFramesTracking()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/react/n;->y()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public enableNativeFramesTracking()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/react/n;->z()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public encodeToBase64(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->A(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public fetchModules(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->B(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public fetchNativeAppStart(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->C(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public fetchNativeDeviceContexts(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->E(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public fetchNativeFrames(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->G(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public fetchNativeLogAttributes(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->H(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public fetchNativePackageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/react/n;->J()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public fetchNativeRelease(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->K(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public fetchNativeSdkInfo(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->L(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public fetchNativeStackFramesBy(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/WritableMap;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public fetchViewHierarchy(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->M(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getCurrentReplayId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/react/n;->P()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getDataFromUri(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->Q(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNSentry"

    .line 2
    .line 3
    return-object v0
.end method

.method public getNewScreenTimeToDisplay(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->R(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public initNativeReactNavigationNewFrameTracking(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->b0(Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public initNativeSdk(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->c0(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public popTimeToDisplayFor(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->l0(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeListeners(D)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->n0(D)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setActiveSpanId(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->o0(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->p0(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAttributes(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->q0(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setContext(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->r0(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setExtra(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->u0(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTag(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->v0(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setUser(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/sentry/react/n;->w0(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public startProfiling(Z)Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/react/n;->x0(Z)Lcom/facebook/react/bridge/WritableMap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public stopProfiling()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/react/RNSentryModule;->impl:Lio/sentry/react/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/react/n;->y0()Lcom/facebook/react/bridge/WritableMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
