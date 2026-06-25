package Y;

import a0.C2506b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6550P;

/* JADX INFO: renamed from: Y.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2454w {

    /* JADX INFO: renamed from: a */
    private static boolean f22554a;

    /* JADX INFO: renamed from: b */
    private static final Object f22555b = new I0("provider");

    /* JADX INFO: renamed from: c */
    private static final Object f22556c = new I0("provider");

    /* JADX INFO: renamed from: d */
    private static final Object f22557d = new I0("compositionLocalMap");

    /* JADX INFO: renamed from: e */
    private static final Object f22558e = new I0("providerValues");

    /* JADX INFO: renamed from: f */
    private static final Object f22559f = new I0("providers");

    /* JADX INFO: renamed from: g */
    private static final Object f22560g = new I0("reference");

    /* JADX INFO: renamed from: h */
    private static final Comparator f22561h = new Comparator() { // from class: Y.u
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC2454w.d((C2420k0) obj, (C2420k0) obj2);
        }
    };

    public static final C2420k0 A(List list, int i10, int i11) {
        int iY = y(list, i10);
        if (iY >= list.size()) {
            return null;
        }
        C2420k0 c2420k0 = (C2420k0) list.get(iY);
        if (c2420k0.b() < i11) {
            return c2420k0;
        }
        return null;
    }

    public static final boolean B() {
        return f22554a;
    }

    public static final Object C() {
        return f22557d;
    }

    public static final Object D() {
        return f22555b;
    }

    public static final Object E(C2429n0 c2429n0) {
        return c2429n0.d() != null ? new C2426m0(Integer.valueOf(c2429n0.a()), c2429n0.d()) : Integer.valueOf(c2429n0.a());
    }

    public static final Object F() {
        return f22556c;
    }

    public static final Object G() {
        return f22559f;
    }

    public static final Object H() {
        return f22560g;
    }

    public static final void I(List list, int i10, C2406f1 c2406f1, Object obj) {
        int iZ = z(list, i10);
        if (iZ < 0) {
            int i11 = -(iZ + 1);
            if (!(obj instanceof U)) {
                obj = null;
            }
            list.add(i11, new C2420k0(c2406f1, i10, obj));
            return;
        }
        C2420k0 c2420k0 = (C2420k0) list.get(iZ);
        if (!(obj instanceof U)) {
            c2420k0.e(null);
            return;
        }
        Object objA = c2420k0.a();
        if (objA == null) {
            c2420k0.e(obj);
        } else if (objA instanceof t.Q) {
            ((t.Q) objA).h(obj);
        } else {
            c2420k0.e(t.f0.c(objA, obj));
        }
    }

    public static final boolean J(D1 d12) {
        return d12.k() > d12.u() + 1;
    }

    public static final boolean K(H1 h12) {
        return h12.Z() > h12.a0() + 1;
    }

    public static final boolean L() {
        return false;
    }

    public static final C6550P M(int i10) {
        return C2506b.d(new C6550P(i10));
    }

    public static final int N(D1 d12, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (d12.Q(i10) == i11) {
                return i11;
            }
            if (d12.Q(i11) != i10) {
                if (d12.Q(i10) == d12.Q(i11)) {
                    return d12.Q(i10);
                }
                int iX = x(d12, i10, i12);
                int iX2 = x(d12, i11, i12);
                int i13 = iX - iX2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = d12.Q(i10);
                }
                int i15 = iX2 - iX;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = d12.Q(i11);
                }
                while (i10 != i11) {
                    i10 = d12.Q(i10);
                    i11 = d12.Q(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    public static final void O(H1 h12, final InterfaceC2450u1 interfaceC2450u1) {
        h12.W(h12.Z(), new Function2() { // from class: Y.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC2454w.P(interfaceC2450u1, ((Integer) obj).intValue(), obj2);
            }
        });
        h12.J0();
    }

    public static final Td.L P(InterfaceC2450u1 interfaceC2450u1, int i10, Object obj) {
        if (obj instanceof InterfaceC2413i) {
            interfaceC2450u1.b((InterfaceC2413i) obj);
        }
        if (obj instanceof C2456w1) {
            interfaceC2450u1.a((C2456w1) obj);
        }
        if (obj instanceof C2406f1) {
            ((C2406f1) obj).A();
        }
        return Td.L.f17438a;
    }

    private static final void Q(H1 h12, int i10, Object obj) {
        Object objH = h12.H(i10);
        if (obj == objH) {
            return;
        }
        t("Slot table is out of sync (expected " + obj + ", got " + objH + ')');
    }

    public static final C2420k0 R(List list, int i10) {
        int iZ = z(list, i10);
        if (iZ >= 0) {
            return (C2420k0) list.remove(iZ);
        }
        return null;
    }

    public static final void S(List list, int i10, int i11) {
        int iY = y(list, i10);
        while (iY < list.size() && ((C2420k0) list.get(iY)).b() < i11) {
        }
    }

    public static final int d(C2420k0 c2420k0, C2420k0 c2420k02) {
        return AbstractC5504s.i(c2420k0.b(), c2420k02.b());
    }

    public static final boolean p(int i10) {
        return i10 != 0;
    }

    public static final List r(E1 e12, C2392b c2392b) {
        ArrayList arrayList = new ArrayList();
        D1 d1F = e12.F();
        try {
            s(d1F, arrayList, e12.d(c2392b));
            Td.L l10 = Td.L.f17438a;
            return arrayList;
        } finally {
            d1F.d();
        }
    }

    private static final void s(D1 d12, List list, int i10) {
        if (d12.K(i10)) {
            list.add(d12.M(i10));
            return;
        }
        int iF = i10 + 1;
        int iF2 = i10 + d12.F(i10);
        while (iF < iF2) {
            s(d12, list, iF);
            iF += d12.F(iF);
        }
    }

    public static final void t(String str) {
        throw new C2419k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void u(String str) {
        throw new C2419k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void v(final H1 h12, final InterfaceC2450u1 interfaceC2450u1) {
        h12.W(h12.Z(), new Function2() { // from class: Y.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC2454w.w(interfaceC2450u1, h12, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    public static final Td.L w(InterfaceC2450u1 interfaceC2450u1, H1 h12, int i10, Object obj) {
        if (obj instanceof InterfaceC2413i) {
            interfaceC2450u1.d((InterfaceC2413i) obj);
        } else if (obj instanceof C2456w1) {
            C2456w1 c2456w1 = (C2456w1) obj;
            if (!(c2456w1.b() instanceof InterfaceC2465z1)) {
                Q(h12, i10, obj);
                interfaceC2450u1.a(c2456w1);
            }
        } else if (obj instanceof C2406f1) {
            Q(h12, i10, obj);
            ((C2406f1) obj).A();
        }
        return Td.L.f17438a;
    }

    private static final int x(D1 d12, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = d12.Q(i10);
            i12++;
        }
        return i12;
    }

    private static final int y(List list, int i10) {
        int iZ = z(list, i10);
        return iZ < 0 ? -(iZ + 1) : iZ;
    }

    private static final int z(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = AbstractC5504s.i(((C2420k0) list.get(i12)).b(), i10);
            if (i13 < 0) {
                i11 = i12 + 1;
            } else {
                if (i13 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void T() {
    }

    public static final int q(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static final void U(int i10, int i11, int i12, String str) {
    }
}
