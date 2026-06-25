package Gf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Q extends Enum {

    /* JADX INFO: renamed from: a */
    public static final Q f7529a = new Q("DEFAULT", 0);

    /* JADX INFO: renamed from: b */
    public static final Q f7530b = new Q("LAZY", 1);

    /* JADX INFO: renamed from: c */
    public static final Q f7531c = new Q("ATOMIC", 2);

    /* JADX INFO: renamed from: d */
    public static final Q f7532d = new Q("UNDISPATCHED", 3);

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ Q[] f7533e;

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ EnumEntries f7534f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7535a;

        static {
            int[] iArr = new int[Q.values().length];
            try {
                iArr[Q.f7529a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q.f7531c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q.f7532d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Q.f7530b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7535a = iArr;
        }
    }

    static {
        Q[] qArrA = a();
        f7533e = qArrA;
        f7534f = AbstractC3048a.a(qArrA);
    }

    private Q(String str, int i10) {
        super(str, i10);
    }

    private static final /* synthetic */ Q[] a() {
        return new Q[]{f7529a, f7530b, f7531c, f7532d};
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) f7533e.clone();
    }

    public final void b(Function2 function2, Object obj, Zd.e eVar) {
        int i10 = a.f7535a[ordinal()];
        if (i10 == 1) {
            Mf.a.c(function2, obj, eVar);
            return;
        }
        if (i10 == 2) {
            Zd.g.b(function2, obj, eVar);
        } else if (i10 == 3) {
            Mf.b.c(function2, obj, eVar);
        } else if (i10 != 4) {
            throw new Td.r();
        }
    }

    public final boolean c() {
        return this == f7530b;
    }
}
