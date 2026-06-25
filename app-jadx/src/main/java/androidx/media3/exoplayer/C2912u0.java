package androidx.media3.exoplayer;

import B2.InterfaceC1021a;
import M2.D;
import P9.AbstractC2011u;
import android.util.Pair;
import androidx.media3.exoplayer.C2906r0;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.List;
import q2.Y;
import t2.AbstractC6614a;
import t2.InterfaceC6631s;

/* JADX INFO: renamed from: androidx.media3.exoplayer.u0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2912u0 {

    /* JADX INFO: renamed from: c */
    private final InterfaceC1021a f31237c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6631s f31238d;

    /* JADX INFO: renamed from: e */
    private final C2906r0.a f31239e;

    /* JADX INFO: renamed from: f */
    private long f31240f;

    /* JADX INFO: renamed from: g */
    private int f31241g;

    /* JADX INFO: renamed from: h */
    private boolean f31242h;

    /* JADX INFO: renamed from: i */
    private ExoPlayer.c f31243i;

    /* JADX INFO: renamed from: j */
    private C2906r0 f31244j;

    /* JADX INFO: renamed from: k */
    private C2906r0 f31245k;

    /* JADX INFO: renamed from: l */
    private C2906r0 f31246l;

    /* JADX INFO: renamed from: m */
    private C2906r0 f31247m;

    /* JADX INFO: renamed from: n */
    private C2906r0 f31248n;

    /* JADX INFO: renamed from: o */
    private int f31249o;

    /* JADX INFO: renamed from: p */
    private Object f31250p;

    /* JADX INFO: renamed from: q */
    private long f31251q;

    /* JADX INFO: renamed from: a */
    private final Y.b f31235a = new Y.b();

    /* JADX INFO: renamed from: b */
    private final Y.d f31236b = new Y.d();

    /* JADX INFO: renamed from: r */
    private List f31252r = new ArrayList();

    public C2912u0(InterfaceC1021a interfaceC1021a, InterfaceC6631s interfaceC6631s, C2906r0.a aVar, ExoPlayer.c cVar) {
        this.f31237c = interfaceC1021a;
        this.f31238d = interfaceC6631s;
        this.f31239e = aVar;
        this.f31243i = cVar;
    }

    private boolean A(Object obj, q2.Y y10) {
        int iD = y10.l(obj, this.f31235a).d();
        int iP = this.f31235a.p();
        if (iD <= 0 || !this.f31235a.s(iP)) {
            return false;
        }
        return iD > 1 || this.f31235a.g(iP) != Long.MIN_VALUE;
    }

    private boolean C(D.b bVar) {
        return !bVar.b() && bVar.f11666e == -1;
    }

    private boolean D(q2.Y y10, D.b bVar, boolean z10) {
        int iF = y10.f(bVar.f11662a);
        return !y10.r(y10.j(iF, this.f31235a).f56653c, this.f31236b).f56686i && y10.v(iF, this.f31235a, this.f31236b, this.f31241g, this.f31242h) && z10;
    }

    private boolean E(q2.Y y10, D.b bVar) {
        if (C(bVar)) {
            return y10.r(y10.l(bVar.f11662a, this.f31235a).f56653c, this.f31236b).f56692o == y10.f(bVar.f11662a);
        }
        return false;
    }

    private static boolean H(Y.b bVar) {
        int iD = bVar.d();
        if (iD != 0 && ((iD != 1 || !bVar.r(0)) && bVar.s(bVar.p()))) {
            long j10 = 0;
            if (bVar.f(0L) == -1) {
                if (bVar.f56654d == 0) {
                    return true;
                }
                int i10 = iD - (bVar.r(iD + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    j10 += bVar.j(i11);
                }
                if (bVar.f56654d <= j10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        final AbstractC2011u.a aVarT = AbstractC2011u.t();
        for (C2906r0 c2906r0K = this.f31244j; c2906r0K != null; c2906r0K = c2906r0K.k()) {
            aVarT.a(c2906r0K.f31202h.f31219a);
        }
        C2906r0 c2906r0 = this.f31245k;
        final D.b bVar = c2906r0 == null ? null : c2906r0.f31202h.f31219a;
        this.f31238d.i(new Runnable() { // from class: androidx.media3.exoplayer.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f31231a.f31237c.N(aVarT.k(), bVar);
            }
        });
    }

    private void L(List list) {
        for (int i10 = 0; i10 < this.f31252r.size(); i10++) {
            ((C2906r0) this.f31252r.get(i10)).x();
        }
        this.f31252r = list;
        this.f31248n = null;
        I();
    }

    private C2906r0 O(C2908s0 c2908s0) {
        for (int i10 = 0; i10 < this.f31252r.size(); i10++) {
            if (((C2906r0) this.f31252r.get(i10)).d(c2908s0)) {
                return (C2906r0) this.f31252r.remove(i10);
            }
        }
        return null;
    }

    private static D.b P(q2.Y y10, Object obj, long j10, long j11, Y.d dVar, Y.b bVar) {
        y10.l(obj, bVar);
        y10.r(bVar.f56653c, dVar);
        for (int iF = y10.f(obj); H(bVar) && iF <= dVar.f56692o; iF++) {
            y10.k(iF, bVar, true);
            obj = AbstractC6614a.e(bVar.f56652b);
        }
        y10.l(obj, bVar);
        int iF2 = bVar.f(j10);
        return iF2 == -1 ? new D.b(obj, j11, bVar.e(j10)) : new D.b(obj, iF2, bVar.l(iF2), j11);
    }

    private long R(q2.Y y10, Object obj) {
        int iF;
        int i10 = y10.l(obj, this.f31235a).f56653c;
        Object obj2 = this.f31250p;
        if (obj2 != null && (iF = y10.f(obj2)) != -1 && y10.j(iF, this.f31235a).f56653c == i10) {
            return this.f31251q;
        }
        for (C2906r0 c2906r0K = this.f31244j; c2906r0K != null; c2906r0K = c2906r0K.k()) {
            if (c2906r0K.f31196b.equals(obj)) {
                return c2906r0K.f31202h.f31219a.f11665d;
            }
        }
        for (C2906r0 c2906r0K2 = this.f31244j; c2906r0K2 != null; c2906r0K2 = c2906r0K2.k()) {
            int iF2 = y10.f(c2906r0K2.f31196b);
            if (iF2 != -1 && y10.j(iF2, this.f31235a).f56653c == i10) {
                return c2906r0K2.f31202h.f31219a.f11665d;
            }
        }
        long jS = S(obj);
        if (jS != -1) {
            return jS;
        }
        long j10 = this.f31240f;
        this.f31240f = 1 + j10;
        if (this.f31244j == null) {
            this.f31250p = obj;
            this.f31251q = j10;
        }
        return j10;
    }

    private long S(Object obj) {
        for (int i10 = 0; i10 < this.f31252r.size(); i10++) {
            C2906r0 c2906r0 = (C2906r0) this.f31252r.get(i10);
            if (c2906r0.f31196b.equals(obj)) {
                return c2906r0.f31202h.f31219a.f11665d;
            }
        }
        return -1L;
    }

    private int U(q2.Y y10) {
        q2.Y y11;
        C2906r0 c2906r0K = this.f31244j;
        if (c2906r0K == null) {
            return 0;
        }
        int iF = y10.f(c2906r0K.f31196b);
        while (true) {
            y11 = y10;
            iF = y11.h(iF, this.f31235a, this.f31236b, this.f31241g, this.f31242h);
            while (((C2906r0) AbstractC6614a.e(c2906r0K)).k() != null && !c2906r0K.f31202h.f31226h) {
                c2906r0K = c2906r0K.k();
            }
            C2906r0 c2906r0K2 = c2906r0K.k();
            if (iF == -1 || c2906r0K2 == null || y11.f(c2906r0K2.f31196b) != iF) {
                break;
            }
            c2906r0K = c2906r0K2;
            y10 = y11;
        }
        int iN = N(c2906r0K);
        c2906r0K.f31202h = z(y11, c2906r0K.f31202h);
        return iN;
    }

    static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean f(C2908s0 c2908s0, C2908s0 c2908s02) {
        return c2908s0.f31220b == c2908s02.f31220b && c2908s0.f31219a.equals(c2908s02.f31219a);
    }

    private Pair i(q2.Y y10, Object obj, long j10) {
        int i10 = y10.i(y10.l(obj, this.f31235a).f56653c, this.f31241g, this.f31242h);
        if (i10 != -1) {
            return y10.o(this.f31236b, this.f31235a, i10, -9223372036854775807L, j10);
        }
        return null;
    }

    private C2908s0 j(K0 k02) {
        return o(k02.f30413a, k02.f30414b, k02.f30415c, k02.f30431s);
    }

    private C2908s0 k(q2.Y y10, C2906r0 c2906r0, long j10) {
        Object obj;
        long j11;
        C2908s0 c2908s0 = c2906r0.f31202h;
        int iH = y10.h(y10.f(c2908s0.f31219a.f11662a), this.f31235a, this.f31236b, this.f31241g, this.f31242h);
        if (iH == -1) {
            return null;
        }
        int i10 = y10.k(iH, this.f31235a, true).f56653c;
        Object objE = AbstractC6614a.e(this.f31235a.f56652b);
        long j12 = c2908s0.f31219a.f11665d;
        long j13 = 0;
        if (y10.r(i10, this.f31236b).f56691n == iH) {
            Pair pairO = y10.o(this.f31236b, this.f31235a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairO == null) {
                return null;
            }
            Object obj2 = pairO.first;
            long jLongValue = ((Long) pairO.second).longValue();
            C2906r0 c2906r0K = c2906r0.k();
            if (c2906r0K == null || !c2906r0K.f31196b.equals(obj2)) {
                long jS = S(obj2);
                if (jS == -1) {
                    jS = this.f31240f;
                    this.f31240f = 1 + jS;
                }
                j12 = jS;
            } else {
                j12 = c2906r0K.f31202h.f31219a.f11665d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objE;
            j11 = 0;
        }
        D.b bVarP = P(y10, obj, j11, j12, this.f31236b, this.f31235a);
        if (j13 != -9223372036854775807L && c2908s0.f31221c != -9223372036854775807L) {
            boolean zA = A(c2908s0.f31219a.f11662a, y10);
            if (bVarP.b() && zA) {
                j13 = c2908s0.f31221c;
            } else if (zA) {
                j11 = c2908s0.f31221c;
            }
        }
        return o(y10, bVarP, j13, j11);
    }

    private C2908s0 l(q2.Y y10, C2906r0 c2906r0, long j10) {
        C2908s0 c2908s0 = c2906r0.f31202h;
        long jM = (c2906r0.m() + c2908s0.f31223e) - j10;
        return c2908s0.f31226h ? k(y10, c2906r0, jM) : m(y10, c2906r0, jM);
    }

    private C2908s0 m(q2.Y y10, C2906r0 c2906r0, long j10) {
        C2908s0 c2908s0 = c2906r0.f31202h;
        D.b bVar = c2908s0.f31219a;
        y10.l(bVar.f11662a, this.f31235a);
        boolean z10 = c2908s0.f31225g;
        if (!bVar.b()) {
            int i10 = bVar.f11666e;
            if (i10 != -1 && this.f31235a.r(i10)) {
                return k(y10, c2906r0, j10);
            }
            int iL = this.f31235a.l(bVar.f11666e);
            boolean z11 = this.f31235a.s(bVar.f11666e) && this.f31235a.i(bVar.f11666e, iL) == 3;
            if (iL == this.f31235a.b(bVar.f11666e) || z11) {
                return q(y10, bVar.f11662a, s(y10, bVar.f11662a, bVar.f11666e), c2908s0.f31223e, bVar.f11665d, false);
            }
            return p(y10, bVar.f11662a, bVar.f11666e, iL, c2908s0.f31223e, bVar.f11665d, z10);
        }
        int i11 = bVar.f11663b;
        int iB = this.f31235a.b(i11);
        if (iB == -1) {
            return null;
        }
        int iM = this.f31235a.m(i11, bVar.f11664c);
        if (iM < iB) {
            return p(y10, bVar.f11662a, i11, iM, c2908s0.f31221c, bVar.f11665d, z10);
        }
        long jLongValue = c2908s0.f31221c;
        if (jLongValue == -9223372036854775807L) {
            Y.d dVar = this.f31236b;
            Y.b bVar2 = this.f31235a;
            Pair pairO = y10.o(dVar, bVar2, bVar2.f56653c, -9223372036854775807L, Math.max(0L, j10));
            if (pairO == null) {
                return null;
            }
            jLongValue = ((Long) pairO.second).longValue();
        }
        return q(y10, bVar.f11662a, Math.max(s(y10, bVar.f11662a, bVar.f11663b), jLongValue), c2908s0.f31221c, bVar.f11665d, z10);
    }

    private C2908s0 o(q2.Y y10, D.b bVar, long j10, long j11) {
        y10.l(bVar.f11662a, this.f31235a);
        return bVar.b() ? p(y10, bVar.f11662a, bVar.f11663b, bVar.f11664c, j10, bVar.f11665d, false) : q(y10, bVar.f11662a, j11, j10, bVar.f11665d, false);
    }

    private C2908s0 p(q2.Y y10, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        D.b bVar = new D.b(obj, i10, i11, j11);
        long jC = y10.l(bVar.f11662a, this.f31235a).c(bVar.f11663b, bVar.f11664c);
        long jH = i11 == this.f31235a.l(i10) ? this.f31235a.h() : 0L;
        boolean zS = this.f31235a.s(bVar.f11663b);
        if (jC != -9223372036854775807L && jH >= jC) {
            jH = Math.max(0L, jC - 1);
        }
        return new C2908s0(bVar, jH, j10, -9223372036854775807L, jC, z10, zS, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private androidx.media3.exoplayer.C2908s0 q(q2.Y r26, java.lang.Object r27, long r28, long r30, long r32, boolean r34) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2912u0.q(q2.Y, java.lang.Object, long, long, long, boolean):androidx.media3.exoplayer.s0");
    }

    private C2908s0 r(q2.Y y10, Object obj, long j10, long j11) {
        D.b bVarP = P(y10, obj, j10, j11, this.f31236b, this.f31235a);
        return bVarP.b() ? p(y10, bVarP.f11662a, bVarP.f11663b, bVarP.f11664c, j10, bVarP.f11665d, false) : q(y10, bVarP.f11662a, j10, -9223372036854775807L, bVarP.f11665d, false);
    }

    private long s(q2.Y y10, Object obj, int i10) {
        y10.l(obj, this.f31235a);
        long jG = this.f31235a.g(i10);
        return jG == Long.MIN_VALUE ? this.f31235a.f56654d : jG + this.f31235a.j(i10);
    }

    public void B(q2.Y y10) {
        C2906r0 c2906r0;
        if (this.f31243i.f30366a == -9223372036854775807L || (c2906r0 = this.f31247m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair pairI = i(y10, c2906r0.f31202h.f31219a.f11662a, 0L);
        if (pairI != null && !y10.r(y10.l(pairI.first, this.f31235a).f56653c, this.f31236b).g()) {
            long jS = S(pairI.first);
            if (jS == -1) {
                jS = this.f31240f;
                this.f31240f = 1 + jS;
            }
            C2908s0 c2908s0R = r(y10, pairI.first, ((Long) pairI.second).longValue(), jS);
            C2906r0 c2906r0O = O(c2908s0R);
            if (c2906r0O == null) {
                c2906r0O = this.f31239e.a(c2908s0R, (c2906r0.m() + c2906r0.f31202h.f31223e) - c2908s0R.f31220b);
            }
            arrayList.add(c2906r0O);
        }
        L(arrayList);
    }

    public boolean F(M2.C c10) {
        C2906r0 c2906r0 = this.f31247m;
        return c2906r0 != null && c2906r0.f31195a == c10;
    }

    public boolean G(M2.C c10) {
        C2906r0 c2906r0 = this.f31248n;
        return c2906r0 != null && c2906r0.f31195a == c10;
    }

    public void I() {
        C2906r0 c2906r0 = this.f31248n;
        if (c2906r0 == null || c2906r0.t()) {
            this.f31248n = null;
            for (int i10 = 0; i10 < this.f31252r.size(); i10++) {
                C2906r0 c2906r02 = (C2906r0) this.f31252r.get(i10);
                if (!c2906r02.t()) {
                    this.f31248n = c2906r02;
                    return;
                }
            }
        }
    }

    public void K(long j10) {
        C2906r0 c2906r0 = this.f31247m;
        if (c2906r0 != null) {
            c2906r0.w(j10);
        }
    }

    public void M() {
        if (this.f31252r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(C2906r0 c2906r0) {
        AbstractC6614a.i(c2906r0);
        int i10 = 0;
        if (c2906r0.equals(this.f31247m)) {
            return 0;
        }
        this.f31247m = c2906r0;
        while (c2906r0.k() != null) {
            c2906r0 = (C2906r0) AbstractC6614a.e(c2906r0.k());
            if (c2906r0 == this.f31245k) {
                C2906r0 c2906r02 = this.f31244j;
                this.f31245k = c2906r02;
                this.f31246l = c2906r02;
                i10 = 3;
            }
            if (c2906r0 == this.f31246l) {
                this.f31246l = this.f31245k;
                i10 |= 2;
            }
            c2906r0.x();
            this.f31249o--;
        }
        ((C2906r0) AbstractC6614a.e(this.f31247m)).A(null);
        J();
        return i10;
    }

    public D.b Q(q2.Y y10, Object obj, long j10) {
        long jR = R(y10, obj);
        y10.l(obj, this.f31235a);
        y10.r(this.f31235a.f56653c, this.f31236b);
        boolean z10 = false;
        for (int iF = y10.f(obj); iF >= this.f31236b.f56691n; iF--) {
            y10.k(iF, this.f31235a, true);
            boolean z11 = this.f31235a.d() > 0;
            z10 |= z11;
            Y.b bVar = this.f31235a;
            if (bVar.f(bVar.f56654d) != -1) {
                obj = AbstractC6614a.e(this.f31235a.f56652b);
            }
            if (z10 && (!z11 || this.f31235a.f56654d != 0)) {
                break;
            }
        }
        return P(y10, obj, j10, jR, this.f31236b, this.f31235a);
    }

    public boolean T() {
        C2906r0 c2906r0 = this.f31247m;
        if (c2906r0 != null) {
            return !c2906r0.f31202h.f31228j && c2906r0.s() && this.f31247m.f31202h.f31223e != -9223372036854775807L && this.f31249o < 100;
        }
        return true;
    }

    public void V(q2.Y y10, ExoPlayer.c cVar) {
        this.f31243i = cVar;
        B(y10);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int W(q2.Y r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.media3.exoplayer.r0 r2 = r0.f31244j
            r3 = 0
        L7:
            if (r2 == 0) goto Lb6
            androidx.media3.exoplayer.s0 r5 = r2.f31202h
            if (r3 != 0) goto L14
            androidx.media3.exoplayer.s0 r3 = r0.z(r1, r5)
            r6 = r19
            goto L25
        L14:
            r6 = r19
            androidx.media3.exoplayer.s0 r8 = r0.l(r1, r3, r6)
            if (r8 == 0) goto Lb1
            boolean r9 = r0.f(r5, r8)
            if (r9 != 0) goto L24
            goto Lb1
        L24:
            r3 = r8
        L25:
            long r8 = r5.f31221c
            androidx.media3.exoplayer.s0 r8 = r3.a(r8)
            r2.f31202h = r8
            long r8 = r5.f31223e
            long r10 = r3.f31223e
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto La6
            r2.E()
            long r6 = r3.f31223e
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L49
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L4d
        L49:
            long r6 = r2.D(r6)
        L4d:
            androidx.media3.exoplayer.r0 r1 = r0.f31245k
            r10 = 1
            r11 = -9223372036854775808
            if (r2 != r1) goto L64
            androidx.media3.exoplayer.s0 r1 = r2.f31202h
            boolean r1 = r1.f31225g
            if (r1 != 0) goto L64
            int r1 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r1 == 0) goto L62
            int r1 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r1 < 0) goto L64
        L62:
            r1 = r10
            goto L65
        L64:
            r1 = 0
        L65:
            androidx.media3.exoplayer.r0 r13 = r0.f31246l
            if (r2 != r13) goto L73
            int r13 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r13 == 0) goto L71
            int r6 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r6 < 0) goto L73
        L71:
            r6 = r10
            goto L74
        L73:
            r6 = 0
        L74:
            int r2 = r0.N(r2)
            if (r2 == 0) goto L7b
            return r2
        L7b:
            long r13 = r5.f31223e
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            r15 = 0
            if (r2 != 0) goto L94
            long r4 = r5.f31222d
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 != 0) goto L94
            long r2 = r3.f31222d
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L94
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto L94
            r2 = r10
            goto L95
        L94:
            r2 = r15
        L95:
            if (r1 == 0) goto L9f
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 != 0) goto L9d
            if (r2 == 0) goto L9f
        L9d:
            r4 = r10
            goto La0
        L9f:
            r4 = r15
        La0:
            if (r6 == 0) goto La5
            r1 = r4 | 2
            return r1
        La5:
            return r4
        La6:
            androidx.media3.exoplayer.r0 r3 = r2.k()
            r16 = r3
            r3 = r2
            r2 = r16
            goto L7
        Lb1:
            int r1 = r0.N(r3)
            return r1
        Lb6:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2912u0.W(q2.Y, long, long, long):int");
    }

    public int X(q2.Y y10, int i10) {
        this.f31241g = i10;
        return U(y10);
    }

    public int Y(q2.Y y10, boolean z10) {
        this.f31242h = z10;
        return U(y10);
    }

    public C2906r0 b() {
        C2906r0 c2906r0 = this.f31244j;
        if (c2906r0 == null) {
            return null;
        }
        if (c2906r0 == this.f31245k) {
            this.f31245k = c2906r0.k();
        }
        C2906r0 c2906r02 = this.f31244j;
        if (c2906r02 == this.f31246l) {
            this.f31246l = c2906r02.k();
        }
        this.f31244j.x();
        int i10 = this.f31249o - 1;
        this.f31249o = i10;
        if (i10 == 0) {
            this.f31247m = null;
            C2906r0 c2906r03 = this.f31244j;
            this.f31250p = c2906r03.f31196b;
            this.f31251q = c2906r03.f31202h.f31219a.f11665d;
        }
        this.f31244j = this.f31244j.k();
        J();
        return this.f31244j;
    }

    public C2906r0 c() {
        this.f31246l = ((C2906r0) AbstractC6614a.i(this.f31246l)).k();
        J();
        return (C2906r0) AbstractC6614a.i(this.f31246l);
    }

    public C2906r0 d() {
        C2906r0 c2906r0 = this.f31246l;
        C2906r0 c2906r02 = this.f31245k;
        if (c2906r0 == c2906r02) {
            this.f31246l = ((C2906r0) AbstractC6614a.i(c2906r02)).k();
        }
        this.f31245k = ((C2906r0) AbstractC6614a.i(this.f31245k)).k();
        J();
        return (C2906r0) AbstractC6614a.i(this.f31245k);
    }

    public void g() {
        if (this.f31249o == 0) {
            return;
        }
        C2906r0 c2906r0K = (C2906r0) AbstractC6614a.i(this.f31244j);
        this.f31250p = c2906r0K.f31196b;
        this.f31251q = c2906r0K.f31202h.f31219a.f11665d;
        while (c2906r0K != null) {
            c2906r0K.x();
            c2906r0K = c2906r0K.k();
        }
        this.f31244j = null;
        this.f31247m = null;
        this.f31245k = null;
        this.f31246l = null;
        this.f31249o = 0;
        J();
    }

    public C2906r0 h(C2908s0 c2908s0) {
        C2906r0 c2906r0 = this.f31247m;
        long jM = c2906r0 == null ? 1000000000000L : (c2906r0.m() + this.f31247m.f31202h.f31223e) - c2908s0.f31220b;
        C2906r0 c2906r0O = O(c2908s0);
        if (c2906r0O == null) {
            c2906r0O = this.f31239e.a(c2908s0, jM);
        } else {
            c2906r0O.f31202h = c2908s0;
            c2906r0O.B(jM);
        }
        C2906r0 c2906r02 = this.f31247m;
        if (c2906r02 != null) {
            c2906r02.A(c2906r0O);
        } else {
            this.f31244j = c2906r0O;
            this.f31245k = c2906r0O;
            this.f31246l = c2906r0O;
        }
        this.f31250p = null;
        this.f31247m = c2906r0O;
        this.f31249o++;
        J();
        return c2906r0O;
    }

    public C2906r0 n() {
        return this.f31247m;
    }

    public C2908s0 t(long j10, K0 k02) {
        C2906r0 c2906r0 = this.f31247m;
        return c2906r0 == null ? j(k02) : l(k02.f30413a, c2906r0, j10);
    }

    public C2906r0 u() {
        return this.f31244j;
    }

    public C2906r0 v(M2.C c10) {
        for (int i10 = 0; i10 < this.f31252r.size(); i10++) {
            C2906r0 c2906r0 = (C2906r0) this.f31252r.get(i10);
            if (c2906r0.f31195a == c10) {
                return c2906r0;
            }
        }
        return null;
    }

    public C2906r0 w() {
        return this.f31248n;
    }

    public C2906r0 x() {
        return this.f31246l;
    }

    public C2906r0 y() {
        return this.f31245k;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.media3.exoplayer.C2908s0 z(q2.Y r18, androidx.media3.exoplayer.C2908s0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            M2.D$b r3 = r2.f31219a
            boolean r13 = r0.C(r3)
            boolean r14 = r0.E(r1, r3)
            boolean r15 = r0.D(r1, r3, r13)
            M2.D$b r4 = r2.f31219a
            java.lang.Object r4 = r4.f11662a
            q2.Y$b r5 = r0.f31235a
            r1.l(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f11666e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            q2.Y$b r7 = r0.f31235a
            long r7 = r7.g(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            q2.Y$b r1 = r0.f31235a
            int r4 = r3.f11663b
            int r5 = r3.f11664c
            long r4 = r1.c(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            q2.Y$b r1 = r0.f31235a
            long r4 = r1.k()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            q2.Y$b r1 = r0.f31235a
            int r4 = r3.f11663b
            boolean r1 = r1.s(r4)
        L6a:
            r12 = r1
            goto L7c
        L6c:
            int r1 = r3.f11666e
            if (r1 == r6) goto L7a
            q2.Y$b r4 = r0.f31235a
            boolean r1 = r4.s(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            androidx.media3.exoplayer.s0 r1 = new androidx.media3.exoplayer.s0
            r5 = r3
            long r3 = r2.f31220b
            r11 = r5
            long r5 = r2.f31221c
            boolean r2 = r2.f31224f
            r16 = r11
            r11 = r2
            r2 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2912u0.z(q2.Y, androidx.media3.exoplayer.s0):androidx.media3.exoplayer.s0");
    }
}
