package h7;

/* JADX INFO: renamed from: h7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4922j extends AbstractC4917e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f47778a = true;

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBridgelessArchitecture() {
        return this.f47778a;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        return this.f47778a;
    }

    @Override // h7.AbstractC4917e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        return this.f47778a || super.useNativeViewConfigsInBridgelessMode();
    }

    @Override // h7.AbstractC4917e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        return this.f47778a || super.useTurboModuleInterop();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        return this.f47778a;
    }
}
