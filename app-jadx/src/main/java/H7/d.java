package H7;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8029a = new d("Repeat", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f8030b = new d("Space", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f8031c = new d("Round", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f8032d = new d("NoRepeat", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ d[] f8033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8034f;

    static {
        d[] dVarArrA = a();
        f8033e = dVarArrA;
        f8034f = AbstractC3048a.a(dVarArrA);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f8029a, f8030b, f8031c, f8032d};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f8033e.clone();
    }
}
