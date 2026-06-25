package K0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f10391a = new B("LookaheadMeasurement", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f10392b = new B("LookaheadPlacement", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f10393c = new B("Measurement", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f10394d = new B("Placement", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ B[] f10395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10396f;

    static {
        B[] bArrA = a();
        f10395e = bArrA;
        f10396f = AbstractC3048a.a(bArrA);
    }

    private B(String str, int i10) {
    }

    private static final /* synthetic */ B[] a() {
        return new B[]{f10391a, f10392b, f10393c, f10394d};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f10395e.clone();
    }
}
