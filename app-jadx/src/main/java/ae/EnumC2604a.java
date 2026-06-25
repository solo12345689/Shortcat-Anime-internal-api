package ae;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: ae.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2604a extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC2604a f23932a = new EnumC2604a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC2604a f23933b = new EnumC2604a("UNDECIDED", 1);

    /* JADX INFO: renamed from: c */
    public static final EnumC2604a f23934c = new EnumC2604a("RESUMED", 2);

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ EnumC2604a[] f23935d;

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ EnumEntries f23936e;

    static {
        EnumC2604a[] enumC2604aArrA = a();
        f23935d = enumC2604aArrA;
        f23936e = AbstractC3048a.a(enumC2604aArrA);
    }

    private EnumC2604a(String str, int i10) {
        super(str, i10);
    }

    private static final /* synthetic */ EnumC2604a[] a() {
        return new EnumC2604a[]{f23932a, f23933b, f23934c};
    }

    public static EnumC2604a valueOf(String str) {
        return (EnumC2604a) Enum.valueOf(EnumC2604a.class, str);
    }

    public static EnumC2604a[] values() {
        return (EnumC2604a[]) f23935d.clone();
    }
}
