package n0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f53827a = new n("VIEW_APPEAR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f53828b = new n("VIEW_DISAPPEAR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ n[] f53829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f53830d;

    static {
        n[] nVarArrA = a();
        f53829c = nVarArrA;
        f53830d = AbstractC3048a.a(nVarArrA);
    }

    private n(String str, int i10) {
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f53827a, f53828b};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f53829c.clone();
    }
}
