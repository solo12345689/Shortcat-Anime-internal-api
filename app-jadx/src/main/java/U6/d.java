package U6;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f19365a = new d("EXPERIMENTAL", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f19366b = new d("CANARY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f19367c = new d("STABLE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d[] f19368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19369e;

    static {
        d[] dVarArrA = a();
        f19368d = dVarArrA;
        f19369e = AbstractC3048a.a(dVarArrA);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f19365a, f19366b, f19367c};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f19368d.clone();
    }
}
