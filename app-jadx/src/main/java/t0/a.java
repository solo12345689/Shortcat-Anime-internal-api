package T0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16755a = new a("On", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16756b = new a("Off", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16757c = new a("Indeterminate", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f16758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16759e;

    static {
        a[] aVarArrA = a();
        f16758d = aVarArrA;
        f16759e = AbstractC3048a.a(aVarArrA);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f16755a, f16756b, f16757c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16758d.clone();
    }
}
