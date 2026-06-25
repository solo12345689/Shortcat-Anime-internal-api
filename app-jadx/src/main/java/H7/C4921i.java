package h7;

/* JADX INFO: renamed from: h7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4921i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4921i f47777a = new C4921i();

    private C4921i() {
    }

    public static final boolean a() {
        if (!Y6.a.f22864f) {
            return C4914b.i();
        }
        Q6.a.b(C4914b.i(), "ReactNativeFeatureFlags.enableBridgelessArchitecture() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean b() {
        if (!Y6.a.f22864f) {
            return C4914b.m();
        }
        Q6.a.b(C4914b.m(), "ReactNativeFeatureFlags.enableFabricRenderer() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean c() {
        if (!Y6.a.f22864f) {
            return C4914b.K();
        }
        Q6.a.b(!C4914b.K(), "ReactNativeFeatureFlags.useFabricInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean d() {
        if (!Y6.a.f22864f) {
            return C4914b.Q();
        }
        Q6.a.b(!C4914b.Q(), "ReactNativeFeatureFlags.useTurboModuleInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean e() {
        if (!Y6.a.f22864f) {
            return C4914b.R();
        }
        Q6.a.b(C4914b.R(), "ReactNativeFeatureFlags.useTurboModules() should be set to TRUE when Strict Mode is enabled");
        return true;
    }
}
