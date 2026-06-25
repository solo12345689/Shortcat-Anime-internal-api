package of;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f55511a = new r("STABLE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f55512b = new r("UNSTABLE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ r[] f55513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f55514d;

    static {
        r[] rVarArrA = a();
        f55513c = rVarArrA;
        f55514d = AbstractC3048a.a(rVarArrA);
    }

    private r(String str, int i10) {
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f55511a, f55512b};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f55513c.clone();
    }
}
