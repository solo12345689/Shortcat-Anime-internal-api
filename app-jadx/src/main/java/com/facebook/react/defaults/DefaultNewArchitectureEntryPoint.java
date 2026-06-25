package com.facebook.react.defaults;

import Td.InterfaceC2154e;
import Td.r;
import Td.z;
import U6.d;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import h7.C4914b;
import h7.C4918f;
import h7.C4919g;
import h7.C4920h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\bJ#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\nJ-\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0003\u001a\u0004\b%\u0010#R\u001a\u0010)\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010#R\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010#¨\u0006,"}, d2 = {"Lcom/facebook/react/defaults/DefaultNewArchitectureEntryPoint;", "", "<init>", "()V", "LTd/L;", "load", "", "turboModulesEnabled", "(Z)V", "fabricEnabled", "(ZZ)V", "bridgelessEnabled", "(ZZZ)V", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "featureFlags", "loadWithFeatureFlags$ReactAndroid_release", "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V", "loadWithFeatureFlags", "Lkotlin/Pair;", "", "isConfigurationValid", "(ZZZ)Lkotlin/Pair;", "LU6/d;", "releaseLevel", "LU6/d;", "getReleaseLevel", "()LU6/d;", "setReleaseLevel", "(LU6/d;)V", "privateFabricEnabled", "Z", "privateTurboModulesEnabled", "privateConcurrentReactEnabled", "privateBridgelessEnabled", "getFabricEnabled", "()Z", "getFabricEnabled$annotations", "getTurboModulesEnabled", "getTurboModulesEnabled$annotations", "getConcurrentReactEnabled", "getConcurrentReactEnabled$annotations", "concurrentReactEnabled", "getBridgelessEnabled", "getBridgelessEnabled$annotations", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultNewArchitectureEntryPoint {
    private static boolean privateBridgelessEnabled;
    private static boolean privateConcurrentReactEnabled;
    private static boolean privateFabricEnabled;
    private static boolean privateTurboModulesEnabled;
    public static final DefaultNewArchitectureEntryPoint INSTANCE = new DefaultNewArchitectureEntryPoint();
    private static d releaseLevel = d.f19367c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36588a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f19365a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f19366b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f19367c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36588a = iArr;
        }
    }

    private DefaultNewArchitectureEntryPoint() {
    }

    public static final boolean getBridgelessEnabled() {
        return privateBridgelessEnabled;
    }

    public static final boolean getConcurrentReactEnabled() {
        return privateConcurrentReactEnabled;
    }

    public static final boolean getFabricEnabled() {
        return privateFabricEnabled;
    }

    public static final boolean getTurboModulesEnabled() {
        return privateTurboModulesEnabled;
    }

    public static final void load() {
        load(true, true, true);
    }

    public static /* synthetic */ void load$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        load(z10);
    }

    public static final void loadWithFeatureFlags$ReactAndroid_release(ReactNativeFeatureFlagsProvider featureFlags) {
        AbstractC5504s.h(featureFlags, "featureFlags");
        C4914b.E(featureFlags);
        privateFabricEnabled = featureFlags.enableFabricRenderer();
        privateTurboModulesEnabled = featureFlags.useTurboModules();
        privateConcurrentReactEnabled = featureFlags.enableFabricRenderer();
        boolean zEnableBridgelessArchitecture = featureFlags.enableBridgelessArchitecture();
        privateBridgelessEnabled = zEnableBridgelessArchitecture;
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(privateTurboModulesEnabled, privateFabricEnabled, zEnableBridgelessArchitecture);
        boolean zBooleanValue = ((Boolean) pairIsConfigurationValid.getFirst()).booleanValue();
        String str = (String) pairIsConfigurationValid.getSecond();
        if (!zBooleanValue) {
            throw new IllegalStateException(str.toString());
        }
        b.a();
    }

    public final d getReleaseLevel() {
        return releaseLevel;
    }

    public final Pair<Boolean, String> isConfigurationValid(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        if (turboModulesEnabled && fabricEnabled && bridgelessEnabled) {
            return z.a(Boolean.TRUE, "");
        }
        return z.a(Boolean.FALSE, "You cannot load React Native with the New Architecture disabled. Please use DefaultNewArchitectureEntryPoint.load() instead of DefaultNewArchitectureEntryPoint.load(turboModulesEnabled=" + turboModulesEnabled + ", fabricEnabled=" + fabricEnabled + ", bridgelessEnabled=" + bridgelessEnabled + ")");
    }

    public final void setReleaseLevel(d dVar) {
        AbstractC5504s.h(dVar, "<set-?>");
        releaseLevel = dVar;
    }

    @InterfaceC2154e
    public static final void load(boolean turboModulesEnabled) {
        load(turboModulesEnabled, true, true);
    }

    public static /* synthetic */ void load$default(boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        load(z10, z11);
    }

    @InterfaceC2154e
    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled) {
        load(turboModulesEnabled, fabricEnabled, true);
    }

    public static /* synthetic */ void load$default(boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        load(z10, z11, z12);
    }

    @InterfaceC2154e
    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(turboModulesEnabled, fabricEnabled, bridgelessEnabled);
        boolean zBooleanValue = ((Boolean) pairIsConfigurationValid.getFirst()).booleanValue();
        String str = (String) pairIsConfigurationValid.getSecond();
        if (zBooleanValue) {
            int i10 = a.f36588a[releaseLevel.ordinal()];
            if (i10 == 1) {
                C4914b.E(new C4919g());
            } else if (i10 == 2) {
                C4914b.E(new C4918f());
            } else if (i10 == 3) {
                C4914b.E(new C4920h());
            } else {
                throw new r();
            }
            privateFabricEnabled = fabricEnabled;
            privateTurboModulesEnabled = turboModulesEnabled;
            privateConcurrentReactEnabled = fabricEnabled;
            privateBridgelessEnabled = bridgelessEnabled;
            b.a();
            return;
        }
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ void getBridgelessEnabled$annotations() {
    }

    public static /* synthetic */ void getConcurrentReactEnabled$annotations() {
    }

    public static /* synthetic */ void getFabricEnabled$annotations() {
    }

    public static /* synthetic */ void getTurboModulesEnabled$annotations() {
    }
}
