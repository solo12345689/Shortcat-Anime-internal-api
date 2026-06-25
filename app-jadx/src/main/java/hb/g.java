package Hb;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f8375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f8376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f8377c;

    public g(long[] timings, int[] amplitudes, long[] oldSDKPattern) {
        AbstractC5504s.h(timings, "timings");
        AbstractC5504s.h(amplitudes, "amplitudes");
        AbstractC5504s.h(oldSDKPattern, "oldSDKPattern");
        this.f8375a = timings;
        this.f8376b = amplitudes;
        this.f8377c = oldSDKPattern;
    }

    public final int[] a() {
        return this.f8376b;
    }

    public final long[] b() {
        return this.f8377c;
    }

    public final long[] c() {
        return this.f8375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type expo.modules.haptics.arguments.HapticsVibrationType");
        g gVar = (g) obj;
        return Arrays.equals(this.f8375a, gVar.f8375a) && Arrays.equals(this.f8376b, gVar.f8376b) && Arrays.equals(this.f8377c, gVar.f8377c);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f8375a) * 31) + Arrays.hashCode(this.f8376b)) * 31) + Arrays.hashCode(this.f8377c);
    }

    public String toString() {
        return "HapticsVibrationType(timings=" + Arrays.toString(this.f8375a) + ", amplitudes=" + Arrays.toString(this.f8376b) + ", oldSDKPattern=" + Arrays.toString(this.f8377c) + ")";
    }
}
