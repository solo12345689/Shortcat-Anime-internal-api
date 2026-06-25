package h7;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: h7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4914b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4914b f47687a = new C4914b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static InterfaceC5082a f47688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static InterfaceC4915c f47689c;

    static {
        InterfaceC5082a interfaceC5082a = new InterfaceC5082a() { // from class: h7.a
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C4914b.b();
            }
        };
        f47688b = interfaceC5082a;
        f47689c = (InterfaceC4915c) interfaceC5082a.invoke();
    }

    private C4914b() {
    }

    public static final boolean A() {
        return f47689c.enableVirtualViewContainerStateExperimental();
    }

    public static final boolean B() {
        return f47689c.enableVirtualViewDebugFeatures();
    }

    public static final boolean C() {
        return f47689c.enableVirtualViewRenderState();
    }

    public static final boolean D() {
        return f47689c.enableVirtualViewWindowFocusDetection();
    }

    public static final void E(ReactNativeFeatureFlagsProvider provider) {
        AbstractC5504s.h(provider, "provider");
        f47689c.a(provider);
    }

    public static final boolean F() {
        return f47689c.overrideBySynchronousMountPropsAtMountingAndroid();
    }

    public static final boolean G() {
        return f47689c.perfMonitorV2Enabled();
    }

    public static final boolean H() {
        return f47689c.shouldTriggerResponderTransferOnScrollAndroid();
    }

    public static final boolean I() {
        return f47689c.skipActivityIdentityAssertionOnHostPause();
    }

    public static final boolean J() {
        return f47689c.sweepActiveTouchOnChildNativeGesturesAndroid();
    }

    public static final boolean K() {
        return f47689c.useFabricInterop();
    }

    public static final boolean L() {
        return f47689c.useNativeEqualsInNativeReadableArrayAndroid();
    }

    public static final boolean M() {
        return f47689c.useNativeTransformHelperAndroid();
    }

    public static final boolean N() {
        return f47689c.useNativeViewConfigsInBridgelessMode();
    }

    public static final boolean O() {
        return f47689c.useOptimizedEventBatchingOnAndroid();
    }

    public static final boolean P() {
        return f47689c.useTraitHiddenOnAndroid();
    }

    public static final boolean Q() {
        return f47689c.useTurboModuleInterop();
    }

    public static final boolean R() {
        return f47689c.useTurboModules();
    }

    public static final double S() {
        return f47689c.virtualViewHysteresisRatio();
    }

    public static final double T() {
        return f47689c.virtualViewPrerenderRatio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4916d b() {
        return new C4916d();
    }

    public static final boolean c() {
        return f47689c.cxxNativeAnimatedEnabled();
    }

    public static final boolean d() {
        return f47689c.disableEarlyViewCommandExecution();
    }

    public static final boolean e() {
        return f47689c.disableOldAndroidAttachmentMetricsWorkarounds();
    }

    public static final boolean f() {
        return f47689c.enableAccessibilityOrder();
    }

    public static final boolean g() {
        return f47689c.enableAndroidLinearText();
    }

    public static final boolean h() {
        return f47689c.enableAndroidTextMeasurementOptimizations();
    }

    public static final boolean i() {
        return f47689c.enableBridgelessArchitecture();
    }

    public static final boolean j() {
        return f47689c.enableCustomFocusSearchOnClippedElementsAndroid();
    }

    public static final boolean k() {
        return f47689c.enableEagerRootViewAttachment();
    }

    public static final boolean l() {
        return f47689c.enableFabricLogs();
    }

    public static final boolean m() {
        return f47689c.enableFabricRenderer();
    }

    public static final boolean n() {
        return f47689c.enableFontScaleChangesUpdatingLayout();
    }

    public static final boolean o() {
        return f47689c.enableImagePrefetchingAndroid();
    }

    public static final boolean p() {
        return f47689c.enableImagePrefetchingOnUiThreadAndroid();
    }

    public static final boolean q() {
        return f47689c.enableImperativeFocus();
    }

    public static final boolean r() {
        return f47689c.enableNetworkEventReporting();
    }

    public static final boolean s() {
        return f47689c.enablePreparedTextLayout();
    }

    public static final boolean t() {
        return f47689c.enablePropsUpdateReconciliationAndroid();
    }

    public static final boolean u() {
        return f47689c.enableViewCulling();
    }

    public static final boolean v() {
        return f47689c.enableViewRecycling();
    }

    public static final boolean w() {
        return f47689c.enableViewRecyclingForScrollView();
    }

    public static final boolean x() {
        return f47689c.enableViewRecyclingForText();
    }

    public static final boolean y() {
        return f47689c.enableViewRecyclingForView();
    }

    public static final boolean z() {
        return f47689c.enableVirtualViewClippingWithoutScrollViewClipping();
    }
}
