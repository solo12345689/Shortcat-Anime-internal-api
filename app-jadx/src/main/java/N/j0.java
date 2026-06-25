package N;

import I0.InterfaceC1690p;
import K.C1774y;
import U0.C2215n;
import U0.N0;
import U0.R0;
import U0.T0;
import U0.W0;
import U0.X0;
import a1.C2545m;
import a1.InterfaceC2541i;
import android.graphics.PointF;
import androidx.compose.ui.platform.A1;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC2541i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2541i[] f12496a;

        a(InterfaceC2541i[] interfaceC2541iArr) {
            this.f12496a = interfaceC2541iArr;
        }

        @Override // a1.InterfaceC2541i
        public void a(C2545m c2545m) {
            for (InterfaceC2541i interfaceC2541i : this.f12496a) {
                interfaceC2541i.a(c2545m);
            }
        }
    }

    private static final boolean A(int i10) {
        int type = Character.getType(i10);
        return type == 14 || type == 13 || i10 == 10;
    }

    private static final boolean B(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean C(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    private static final boolean D(int i10) {
        return C(i10) && !A(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long E(CharSequence charSequence, int i10) {
        int iCharCount = i10;
        while (iCharCount > 0) {
            int iC = AbstractC1941f.c(charSequence, iCharCount);
            if (!C(iC)) {
                break;
            }
            iCharCount -= Character.charCount(iC);
        }
        while (i10 < charSequence.length()) {
            int iB = AbstractC1941f.b(charSequence, i10);
            if (!C(iB)) {
                break;
            }
            i10 += AbstractC1941f.a(iB);
        }
        return X0.b(iCharCount, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long F(PointF pointF) {
        return AbstractC6225g.a(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10, CharSequence charSequence) {
        int iN = W0.n(j10);
        int i10 = W0.i(j10);
        int iCodePointBefore = iN > 0 ? Character.codePointBefore(charSequence, iN) : 10;
        int iCodePointAt = i10 < charSequence.length() ? Character.codePointAt(charSequence, i10) : 10;
        if (D(iCodePointBefore) && (C(iCodePointAt) || B(iCodePointAt))) {
            do {
                iN -= Character.charCount(iCodePointBefore);
                if (iN == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iN);
            } while (D(iCodePointBefore));
            return X0.b(iN, i10);
        }
        if (!D(iCodePointAt)) {
            return j10;
        }
        if (!C(iCodePointBefore) && !B(iCodePointBefore)) {
            return j10;
        }
        do {
            i10 += Character.charCount(iCodePointAt);
            if (i10 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, i10);
        } while (D(iCodePointAt));
        return X0.b(iN, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2541i n(InterfaceC2541i... interfaceC2541iArr) {
        return new a(interfaceC2541iArr);
    }

    private static final long o(long j10, long j11) {
        return X0.b(Math.min(W0.n(j10), W0.n(j10)), Math.max(W0.i(j11), W0.i(j11)));
    }

    private static final int p(C2215n c2215n, long j10, A1 a12) {
        float fH = a12 != null ? a12.h() : 0.0f;
        int iS = c2215n.s(C6224f.n(j10));
        if (C6224f.n(j10) < c2215n.w(iS) - fH || C6224f.n(j10) > c2215n.o(iS) + fH || C6224f.m(j10) < (-fH) || C6224f.m(j10) > c2215n.E() + fH) {
            return -1;
        }
        return iS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(C1774y c1774y, long j10, A1 a12) {
        T0 t0F;
        C2215n c2215nW;
        K.Z zJ = c1774y.j();
        if (zJ == null || (t0F = zJ.f()) == null || (c2215nW = t0F.w()) == null) {
            return -1;
        }
        return s(c2215nW, j10, c1774y.i(), a12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(w0 w0Var, long j10, A1 a12) {
        throw null;
    }

    private static final int s(C2215n c2215n, long j10, InterfaceC1690p interfaceC1690p, A1 a12) {
        long jQ;
        int iP;
        if (interfaceC1690p == null || (iP = p(c2215n, (jQ = interfaceC1690p.q(j10)), a12)) == -1) {
            return -1;
        }
        return c2215n.x(C6224f.g(jQ, 0.0f, (c2215n.w(iP) + c2215n.o(iP)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long t(T0 t02, long j10, long j11, InterfaceC1690p interfaceC1690p, A1 a12) {
        if (t02 == null || interfaceC1690p == null) {
            return W0.f18785b.a();
        }
        long jQ = interfaceC1690p.q(j10);
        long jQ2 = interfaceC1690p.q(j11);
        int iP = p(t02.w(), jQ, a12);
        int iP2 = p(t02.w(), jQ2, a12);
        if (iP != -1) {
            if (iP2 != -1) {
                iP = Math.min(iP, iP2);
            }
            iP2 = iP;
        } else if (iP2 == -1) {
            return W0.f18785b.a();
        }
        float fV = (t02.v(iP2) + t02.m(iP2)) / 2;
        return t02.w().D(new C6226h(Math.min(C6224f.m(jQ), C6224f.m(jQ2)), fV - 0.1f, Math.max(C6224f.m(jQ), C6224f.m(jQ2)), fV + 0.1f), N0.f18754a.a(), R0.f18757a.g());
    }

    private static final long u(C2215n c2215n, C6226h c6226h, InterfaceC1690p interfaceC1690p, int i10, R0 r02) {
        return (c2215n == null || interfaceC1690p == null) ? W0.f18785b.a() : c2215n.D(c6226h.t(interfaceC1690p.q(C6224f.f58329b.c())), i10, r02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(C1774y c1774y, C6226h c6226h, int i10, R0 r02) {
        T0 t0F;
        K.Z zJ = c1774y.j();
        return u((zJ == null || (t0F = zJ.f()) == null) ? null : t0F.w(), c6226h, c1774y.i(), i10, r02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(w0 w0Var, C6226h c6226h, int i10, R0 r02) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long x(C1774y c1774y, C6226h c6226h, C6226h c6226h2, int i10, R0 r02) {
        long jV = v(c1774y, c6226h, i10, r02);
        if (W0.h(jV)) {
            return W0.f18785b.a();
        }
        long jV2 = v(c1774y, c6226h2, i10, r02);
        return W0.h(jV2) ? W0.f18785b.a() : o(jV, jV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(w0 w0Var, C6226h c6226h, C6226h c6226h2, int i10, R0 r02) {
        long jW = w(w0Var, c6226h, i10, r02);
        if (W0.h(jW)) {
            return W0.f18785b.a();
        }
        long jW2 = w(w0Var, c6226h2, i10, r02);
        return W0.h(jW2) ? W0.f18785b.a() : o(jW, jW2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(T0 t02, int i10) {
        int iQ = t02.q(i10);
        return (i10 == t02.u(iQ) || i10 == T0.p(t02, iQ, false, 2, null)) ? t02.y(i10) != t02.c(i10) : t02.c(i10) != t02.c(i10 - 1);
    }
}
