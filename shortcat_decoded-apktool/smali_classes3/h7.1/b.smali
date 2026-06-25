.class public final Lh7/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lh7/b;

.field private static b:Lie/a;

.field private static c:Lh7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh7/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lh7/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh7/b;->a:Lh7/b;

    .line 7
    .line 8
    new-instance v0, Lh7/a;

    .line 9
    .line 10
    invoke-direct {v0}, Lh7/a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lh7/b;->b:Lie/a;

    .line 14
    .line 15
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lh7/c;

    .line 20
    .line 21
    sput-object v0, Lh7/b;->c:Lh7/c;

    .line 22
    .line 23
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final A()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableVirtualViewContainerStateExperimental()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final B()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableVirtualViewDebugFeatures()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final C()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableVirtualViewRenderState()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final D()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableVirtualViewWindowFocusDetection()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final E(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 7
    .line 8
    invoke-interface {v0, p0}, Lh7/c;->a(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final F()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->overrideBySynchronousMountPropsAtMountingAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final G()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->perfMonitorV2Enabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final H()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->shouldTriggerResponderTransferOnScrollAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final I()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->skipActivityIdentityAssertionOnHostPause()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final J()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->sweepActiveTouchOnChildNativeGesturesAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final K()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->useFabricInterop()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final L()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->useNativeEqualsInNativeReadableArrayAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final M()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->useNativeTransformHelperAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final N()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->useNativeViewConfigsInBridgelessMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final O()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->useOptimizedEventBatchingOnAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final P()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->useTraitHiddenOnAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final Q()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->useTurboModuleInterop()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final R()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->useTurboModules()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final S()D
    .locals 2

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->virtualViewHysteresisRatio()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public static final T()D
    .locals 2

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->virtualViewPrerenderRatio()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public static synthetic a()Lh7/d;
    .locals 1

    .line 1
    invoke-static {}, Lh7/b;->b()Lh7/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final b()Lh7/d;
    .locals 1

    .line 1
    new-instance v0, Lh7/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lh7/d;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final c()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->cxxNativeAnimatedEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final d()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->disableEarlyViewCommandExecution()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final e()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->disableOldAndroidAttachmentMetricsWorkarounds()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final f()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableAccessibilityOrder()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final g()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableAndroidLinearText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final h()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableAndroidTextMeasurementOptimizations()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final i()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableBridgelessArchitecture()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final j()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableCustomFocusSearchOnClippedElementsAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final k()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableEagerRootViewAttachment()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final l()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableFabricLogs()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final m()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableFabricRenderer()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final n()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableFontScaleChangesUpdatingLayout()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final o()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableImagePrefetchingAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final p()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableImagePrefetchingOnUiThreadAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final q()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableImperativeFocus()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final r()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableNetworkEventReporting()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final s()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enablePreparedTextLayout()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final t()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enablePropsUpdateReconciliationAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final u()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableViewCulling()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final v()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableViewRecycling()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final w()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableViewRecyclingForScrollView()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final x()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableViewRecyclingForText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final y()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableViewRecyclingForView()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final z()Z
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->c:Lh7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/c;->enableVirtualViewClippingWithoutScrollViewClipping()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
