package Pe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f13925a = new p0("FLEXIBLE_LOWER", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f13926b = new p0("FLEXIBLE_UPPER", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f13927c = new p0("INFLEXIBLE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ p0[] f13928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13929e;

    static {
        p0[] p0VarArrA = a();
        f13928d = p0VarArrA;
        f13929e = AbstractC3048a.a(p0VarArrA);
    }

    private p0(String str, int i10) {
    }

    private static final /* synthetic */ p0[] a() {
        return new p0[]{f13925a, f13926b, f13927c};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f13928d.clone();
    }
}
