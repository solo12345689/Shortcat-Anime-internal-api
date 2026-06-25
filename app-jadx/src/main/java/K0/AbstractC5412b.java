package k0;

import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.AbstractC2460y;
import Y.C2392b;
import Y.C2442s;
import Y.D1;
import Y.E1;
import Y.H1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.L;

/* JADX INFO: renamed from: k0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5412b {
    public static final List a(D1 d12) {
        if (d12.i() || d12.x() == 0) {
            return AbstractC2279u.m();
        }
        C5431u c5431u = new C5431u(d12);
        int iU = d12.u();
        Object objValueOf = Integer.valueOf(d12.y());
        while (iU >= 0) {
            c5431u.f(d12.z().L(iU), objValueOf);
            objValueOf = d12.a(iU);
            iU = d12.Q(iU);
        }
        return c5431u.i();
    }

    public static final List b(H1 h12, Object obj, int i10, Integer num) {
        if (h12.Y() || h12.b0() == 0) {
            return AbstractC2279u.m();
        }
        C5435y c5435y = new C5435y(h12);
        int iIntValue = num != null ? num.intValue() : h12.a0() < 0 ? h12.C0(i10) : h12.a0();
        if (obj == null) {
            obj = Integer.valueOf(h12.i0(i10));
        }
        while (i10 >= 0) {
            c5435y.f(h12.b1(i10), obj);
            obj = h12.B(i10);
            if (iIntValue >= 0) {
                int i11 = iIntValue;
                iIntValue = h12.C0(iIntValue);
                i10 = i11;
            } else {
                i10 = iIntValue;
            }
        }
        return c5435y.i();
    }

    public static /* synthetic */ List c(H1 h12, Object obj, int i10, Integer num, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            i10 = h12.Z();
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        return b(h12, obj, i10, num);
    }

    public static final C5427q d(E1 e12, Function1 function1) {
        D1 d1F = e12.F();
        try {
            L l10 = new L();
            while (l10.f52257a < e12.u()) {
                if (d1F.K(l10.f52257a) && ((Boolean) function1.invoke(d1F.M(l10.f52257a))).booleanValue()) {
                    return new C5427q(l10.f52257a, null);
                }
                int iV = d1F.V(l10.f52257a);
                for (int i10 = 0; i10 < iV; i10++) {
                    if (((Boolean) function1.invoke(d1F.C(l10.f52257a, i10))).booleanValue()) {
                        return new C5427q(l10.f52257a, Integer.valueOf(i10));
                    }
                }
                l10.f52257a++;
            }
            Td.L l11 = Td.L.f17438a;
            return null;
        } finally {
            d1F.d();
        }
    }

    public static final Integer e(E1 e12, AbstractC2460y abstractC2460y) {
        D1 d1F = e12.F();
        try {
            return f(d1F, abstractC2460y, 0, d1F.x());
        } finally {
            d1F.d();
        }
    }

    private static final Integer f(D1 d12, AbstractC2460y abstractC2460y, int i10, int i11) {
        Integer numF;
        while (true) {
            if (i10 >= i11) {
                return null;
            }
            int iF = d12.F(i10) + i10;
            if (d12.G(i10) && d12.D(i10) == 206 && AbstractC5504s.c(d12.E(i10), AbstractC2454w.H())) {
                Object objC = d12.C(i10, 0);
                C2442s.a aVar = objC instanceof C2442s.a ? (C2442s.a) objC : null;
                if (aVar != null && AbstractC5504s.c(aVar.a(), abstractC2460y)) {
                    return Integer.valueOf(i10);
                }
            }
            if (d12.e(i10) && (numF = f(d12, abstractC2460y, i10 + 1, iF)) != null) {
                return Integer.valueOf(numF.intValue());
            }
            i10 = iF;
        }
    }

    public static final List g(D1 d12, int i10, Object obj) {
        C5431u c5431u = new C5431u(d12);
        int iQ = d12.Q(i10);
        C2392b c2392bA = d12.a(i10);
        while (i10 >= 0) {
            c5431u.f(d12.z().L(i10), obj);
            if (iQ >= 0) {
                C2392b c2392b = c2392bA;
                c2392bA = d12.a(iQ);
                i10 = iQ;
                iQ = d12.Q(iQ);
                obj = c2392b;
            } else {
                i10 = iQ;
                obj = c2392bA;
            }
        }
        return c5431u.i();
    }
}
