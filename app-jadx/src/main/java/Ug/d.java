package ug;

import Ud.AbstractC2279u;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.C6686k;
import tg.P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a */
    private static final C6686k f61524a;

    /* JADX INFO: renamed from: b */
    private static final C6686k f61525b;

    /* JADX INFO: renamed from: c */
    private static final C6686k f61526c;

    /* JADX INFO: renamed from: d */
    private static final C6686k f61527d;

    /* JADX INFO: renamed from: e */
    private static final C6686k f61528e;

    static {
        C6686k.a aVar = C6686k.f61044d;
        f61524a = aVar.g("/");
        f61525b = aVar.g("\\");
        f61526c = aVar.g("/\\");
        f61527d = aVar.g(".");
        f61528e = aVar.g("..");
    }

    public static final P j(P p10, P child, boolean z10) {
        AbstractC5504s.h(p10, "<this>");
        AbstractC5504s.h(child, "child");
        if (child.isAbsolute() || child.u() != null) {
            return child;
        }
        C6686k c6686kM = m(p10);
        if (c6686kM == null && (c6686kM = m(child)) == null) {
            c6686kM = s(P.f60969c);
        }
        C6683h c6683h = new C6683h();
        c6683h.A0(p10.b());
        if (c6683h.size() > 0) {
            c6683h.A0(c6686kM);
        }
        c6683h.A0(child.b());
        return q(c6683h, z10);
    }

    public static final P k(String str, boolean z10) {
        AbstractC5504s.h(str, "<this>");
        return q(new C6683h().s0(str), z10);
    }

    public static final int l(P p10) {
        int iC = C6686k.C(p10.b(), f61524a, 0, 2, null);
        return iC != -1 ? iC : C6686k.C(p10.b(), f61525b, 0, 2, null);
    }

    public static final C6686k m(P p10) {
        C6686k c6686kB = p10.b();
        C6686k c6686k = f61524a;
        if (C6686k.x(c6686kB, c6686k, 0, 2, null) != -1) {
            return c6686k;
        }
        C6686k c6686kB2 = p10.b();
        C6686k c6686k2 = f61525b;
        if (C6686k.x(c6686kB2, c6686k2, 0, 2, null) != -1) {
            return c6686k2;
        }
        return null;
    }

    public static final boolean n(P p10) {
        return p10.b().k(f61528e) && (p10.b().K() == 2 || p10.b().E(p10.b().K() + (-3), f61524a, 0, 1) || p10.b().E(p10.b().K() + (-3), f61525b, 0, 1));
    }

    public static final int o(P p10) {
        if (p10.b().K() == 0) {
            return -1;
        }
        if (p10.b().m(0) == 47) {
            return 1;
        }
        if (p10.b().m(0) == 92) {
            if (p10.b().K() <= 2 || p10.b().m(1) != 92) {
                return 1;
            }
            int iV = p10.b().v(f61525b, 2);
            return iV == -1 ? p10.b().K() : iV;
        }
        if (p10.b().K() > 2 && p10.b().m(1) == 58 && p10.b().m(2) == 92) {
            char cM = (char) p10.b().m(0);
            if ('a' <= cM && cM < '{') {
                return 3;
            }
            if ('A' <= cM && cM < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(C6683h c6683h, C6686k c6686k) {
        if (!AbstractC5504s.c(c6686k, f61525b) || c6683h.size() < 2 || c6683h.D(1L) != 58) {
            return false;
        }
        char cD = (char) c6683h.D(0L);
        if ('a' > cD || cD >= '{') {
            return 'A' <= cD && cD < '[';
        }
        return true;
    }

    public static final P q(C6683h c6683h, boolean z10) throws EOFException {
        C6686k c6686k;
        C6686k c6686kY0;
        AbstractC5504s.h(c6683h, "<this>");
        C6683h c6683h2 = new C6683h();
        C6686k c6686kR = null;
        int i10 = 0;
        while (true) {
            if (!c6683h.Q1(0L, f61524a)) {
                c6686k = f61525b;
                if (!c6683h.Q1(0L, c6686k)) {
                    break;
                }
            }
            byte b10 = c6683h.readByte();
            if (c6686kR == null) {
                c6686kR = r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && AbstractC5504s.c(c6686kR, c6686k);
        if (z11) {
            AbstractC5504s.e(c6686kR);
            c6683h2.A0(c6686kR);
            c6683h2.A0(c6686kR);
        } else if (i10 > 0) {
            AbstractC5504s.e(c6686kR);
            c6683h2.A0(c6686kR);
        } else {
            long jO = c6683h.O(f61526c);
            if (c6686kR == null) {
                c6686kR = jO == -1 ? s(P.f60969c) : r(c6683h.D(jO));
            }
            if (p(c6683h, c6686kR)) {
                if (jO == 2) {
                    c6683h2.t0(c6683h, 3L);
                } else {
                    c6683h2.t0(c6683h, 2L);
                }
            }
        }
        boolean z12 = c6683h2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c6683h.f1()) {
            long jO2 = c6683h.O(f61526c);
            if (jO2 == -1) {
                c6686kY0 = c6683h.p0();
            } else {
                c6686kY0 = c6683h.Y0(jO2);
                c6683h.readByte();
            }
            C6686k c6686k2 = f61528e;
            if (AbstractC5504s.c(c6686kY0, c6686k2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || AbstractC5504s.c(AbstractC2279u.y0(arrayList), c6686k2)))) {
                        arrayList.add(c6686kY0);
                    } else if (!z11 || arrayList.size() != 1) {
                        AbstractC2279u.N(arrayList);
                    }
                }
            } else if (!AbstractC5504s.c(c6686kY0, f61527d) && !AbstractC5504s.c(c6686kY0, C6686k.f61045e)) {
                arrayList.add(c6686kY0);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c6683h2.A0(c6686kR);
            }
            c6683h2.A0((C6686k) arrayList.get(i11));
        }
        if (c6683h2.size() == 0) {
            c6683h2.A0(f61527d);
        }
        return new P(c6683h2.p0());
    }

    private static final C6686k r(byte b10) {
        if (b10 == 47) {
            return f61524a;
        }
        if (b10 == 92) {
            return f61525b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    public static final C6686k s(String str) {
        if (AbstractC5504s.c(str, "/")) {
            return f61524a;
        }
        if (AbstractC5504s.c(str, "\\")) {
            return f61525b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
