package o3;

import P9.AbstractC2011u;
import U2.AbstractC2245f;
import U2.B;
import U2.C2246g;
import U2.C2247h;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.N;
import U2.O;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import f3.C4768a;
import f3.C4770c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import q2.C6078J;
import q2.C6080L;
import q2.C6102q;
import q2.C6109x;
import r3.r;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;
import u2.AbstractC6723e;
import u2.AbstractC6726h;
import u2.C6729k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class h implements InterfaceC2255p {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final U2.u f54294P = new U2.u() { // from class: o3.f
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return h.d();
        }
    };

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final byte[] f54295Q = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final C6109x f54296R = new C6109x.b().y0("application/x-emsg").P();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f54297A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f54298B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f54299C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private b f54300D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f54301E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f54302F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f54303G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f54304H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f54305I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private U2.r f54306J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private O[] f54307K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private O[] f54308L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f54309M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f54310N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f54311O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r.a f54312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f54314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f54315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f54316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C6609I f54317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C6609I f54318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C6609I f54319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f54320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C6609I f54321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t2.O f54322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C4770c f54323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C6609I f54324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f54325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque f54326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C6729k f54327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final O f54328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C2247h f54329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AbstractC2011u f54330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f54331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f54332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f54333v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f54334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C6609I f54335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f54336y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f54337z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f54338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f54339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54340c;

        public a(long j10, boolean z10, int i10) {
            this.f54338a = j10;
            this.f54339b = z10;
            this.f54340c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O f54341a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w f54344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C5812c f54345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f54346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f54347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f54348h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f54349i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final C6109x f54350j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f54353m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f54342b = new v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C6609I f54343c = new C6609I();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C6609I f54351k = new C6609I(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final C6609I f54352l = new C6609I();

        public b(O o10, w wVar, C5812c c5812c, C6109x c6109x) {
            this.f54341a = o10;
            this.f54344d = wVar;
            this.f54345e = c5812c;
            this.f54350j = c6109x;
            j(wVar, c5812c);
        }

        public int c() {
            int i10 = !this.f54353m ? this.f54344d.f54450g[this.f54346f] : this.f54342b.f54436k[this.f54346f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f54353m ? this.f54344d.f54446c[this.f54346f] : this.f54342b.f54432g[this.f54348h];
        }

        public long e() {
            return !this.f54353m ? this.f54344d.f54449f[this.f54346f] : this.f54342b.c(this.f54346f);
        }

        public int f() {
            return !this.f54353m ? this.f54344d.f54447d[this.f54346f] : this.f54342b.f54434i[this.f54346f];
        }

        public u g() {
            if (!this.f54353m) {
                return null;
            }
            int i10 = ((C5812c) a0.l(this.f54342b.f54426a)).f54281a;
            u uVarB = this.f54342b.f54439n;
            if (uVarB == null) {
                uVarB = this.f54344d.f54444a.b(i10);
            }
            if (uVarB == null || !uVarB.f54421a) {
                return null;
            }
            return uVarB;
        }

        public boolean h() {
            this.f54346f++;
            if (!this.f54353m) {
                return false;
            }
            int i10 = this.f54347g + 1;
            this.f54347g = i10;
            int[] iArr = this.f54342b.f54433h;
            int i11 = this.f54348h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f54348h = i11 + 1;
            this.f54347g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            C6609I c6609i;
            u uVarG = g();
            if (uVarG == null) {
                return 0;
            }
            int length = uVarG.f54424d;
            if (length != 0) {
                c6609i = this.f54342b.f54440o;
            } else {
                byte[] bArr = (byte[]) a0.l(uVarG.f54425e);
                this.f54352l.Z(bArr, bArr.length);
                C6609I c6609i2 = this.f54352l;
                length = bArr.length;
                c6609i = c6609i2;
            }
            boolean zG = this.f54342b.g(this.f54346f);
            boolean z10 = zG || i11 != 0;
            this.f54351k.f()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f54351k.b0(0);
            this.f54341a.g(this.f54351k, 1, 1);
            this.f54341a.g(c6609i, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f54343c.X(8);
                byte[] bArrF = this.f54343c.f();
                bArrF[0] = 0;
                bArrF[1] = 1;
                bArrF[2] = (byte) ((i11 >> 8) & 255);
                bArrF[3] = (byte) (i11 & 255);
                bArrF[4] = (byte) ((i10 >> 24) & 255);
                bArrF[5] = (byte) ((i10 >> 16) & 255);
                bArrF[6] = (byte) ((i10 >> 8) & 255);
                bArrF[7] = (byte) (i10 & 255);
                this.f54341a.g(this.f54343c, 8, 1);
                return length + 9;
            }
            C6609I c6609i3 = this.f54342b.f54440o;
            int iU = c6609i3.U();
            c6609i3.c0(-2);
            int i12 = (iU * 6) + 2;
            if (i11 != 0) {
                this.f54343c.X(i12);
                byte[] bArrF2 = this.f54343c.f();
                c6609i3.q(bArrF2, 0, i12);
                int i13 = (((bArrF2[2] & 255) << 8) | (bArrF2[3] & 255)) + i11;
                bArrF2[2] = (byte) ((i13 >> 8) & 255);
                bArrF2[3] = (byte) (i13 & 255);
                c6609i3 = this.f54343c;
            }
            this.f54341a.g(c6609i3, i12, 1);
            return length + 1 + i12;
        }

        public void j(w wVar, C5812c c5812c) {
            this.f54344d = wVar;
            this.f54345e = c5812c;
            this.f54341a.c(this.f54350j);
            k();
        }

        public void k() {
            this.f54342b.f();
            this.f54346f = 0;
            this.f54348h = 0;
            this.f54347g = 0;
            this.f54349i = 0;
            this.f54353m = false;
        }

        public void l(long j10) {
            int i10 = this.f54346f;
            while (true) {
                v vVar = this.f54342b;
                if (i10 >= vVar.f54431f || vVar.c(i10) > j10) {
                    return;
                }
                if (this.f54342b.f54436k[i10]) {
                    this.f54349i = i10;
                }
                i10++;
            }
        }

        public void m() {
            u uVarG = g();
            if (uVarG == null) {
                return;
            }
            C6609I c6609i = this.f54342b.f54440o;
            int i10 = uVarG.f54424d;
            if (i10 != 0) {
                c6609i.c0(i10);
            }
            if (this.f54342b.g(this.f54346f)) {
                c6609i.c0(c6609i.U() * 6);
            }
        }

        public void n(C6102q c6102q) {
            u uVarB = this.f54344d.f54444a.b(((C5812c) a0.l(this.f54342b.f54426a)).f54281a);
            this.f54341a.c(this.f54350j.b().c0(c6102q.c(uVarB != null ? uVarB.f54422b : null)).P());
        }
    }

    public h(r.a aVar, int i10) {
        this(aVar, i10, null, null, AbstractC2011u.A(), null);
    }

    private void A(long j10) {
        while (!this.f54326o.isEmpty()) {
            a aVar = (a) this.f54326o.removeFirst();
            this.f54337z -= aVar.f54340c;
            long jA = aVar.f54338a;
            if (aVar.f54339b) {
                jA += j10;
            }
            t2.O o10 = this.f54322k;
            if (o10 != null) {
                jA = o10.a(jA);
            }
            long j11 = jA;
            for (O o11 : this.f54307K) {
                o11.a(j11, 1, aVar.f54340c, this.f54337z, null);
            }
        }
    }

    private static long B(C6609I c6609i) {
        c6609i.b0(8);
        return AbstractC5811b.q(c6609i.v()) == 0 ? c6609i.O() : c6609i.T();
    }

    private static void C(AbstractC6723e.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws C6080L {
        int size = bVar.f61229d.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC6723e.b bVar2 = (AbstractC6723e.b) bVar.f61229d.get(i11);
            if (bVar2.f61226a == 1953653094) {
                L(bVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void D(C6609I c6609i, v vVar) throws C6080L {
        c6609i.b0(8);
        int iV = c6609i.v();
        if ((AbstractC5811b.p(iV) & 1) == 1) {
            c6609i.c0(8);
        }
        int iQ = c6609i.Q();
        if (iQ == 1) {
            vVar.f54429d += AbstractC5811b.q(iV) == 0 ? c6609i.O() : c6609i.T();
        } else {
            throw C6080L.a("Unexpected saio entry count: " + iQ, null);
        }
    }

    private static void E(u uVar, C6609I c6609i, v vVar) throws C6080L {
        int i10;
        int i11 = uVar.f54424d;
        c6609i.b0(8);
        if ((AbstractC5811b.p(c6609i.v()) & 1) == 1) {
            c6609i.c0(8);
        }
        int iM = c6609i.M();
        int iQ = c6609i.Q();
        if (iQ > vVar.f54431f) {
            throw C6080L.a("Saiz sample count " + iQ + " is greater than fragment sample count" + vVar.f54431f, null);
        }
        if (iM == 0) {
            boolean[] zArr = vVar.f54438m;
            i10 = 0;
            for (int i12 = 0; i12 < iQ; i12++) {
                int iM2 = c6609i.M();
                i10 += iM2;
                zArr[i12] = iM2 > i11;
            }
        } else {
            i10 = iM * iQ;
            Arrays.fill(vVar.f54438m, 0, iQ, iM > i11);
        }
        Arrays.fill(vVar.f54438m, iQ, vVar.f54431f, false);
        if (i10 > 0) {
            vVar.d(i10);
        }
    }

    private static void F(AbstractC6723e.b bVar, String str, v vVar) throws C6080L {
        byte[] bArr = null;
        C6609I c6609i = null;
        C6609I c6609i2 = null;
        for (int i10 = 0; i10 < bVar.f61228c.size(); i10++) {
            AbstractC6723e.c cVar = (AbstractC6723e.c) bVar.f61228c.get(i10);
            C6609I c6609i3 = cVar.f61230b;
            int i11 = cVar.f61226a;
            if (i11 == 1935828848) {
                c6609i3.b0(12);
                if (c6609i3.v() == 1936025959) {
                    c6609i = c6609i3;
                }
            } else if (i11 == 1936158820) {
                c6609i3.b0(12);
                if (c6609i3.v() == 1936025959) {
                    c6609i2 = c6609i3;
                }
            }
        }
        if (c6609i == null || c6609i2 == null) {
            return;
        }
        c6609i.b0(8);
        int iQ = AbstractC5811b.q(c6609i.v());
        c6609i.c0(4);
        if (iQ == 1) {
            c6609i.c0(4);
        }
        if (c6609i.v() != 1) {
            throw C6080L.d("Entry count in sbgp != 1 (unsupported).");
        }
        c6609i2.b0(8);
        int iQ2 = AbstractC5811b.q(c6609i2.v());
        c6609i2.c0(4);
        if (iQ2 == 1) {
            if (c6609i2.O() == 0) {
                throw C6080L.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (iQ2 >= 2) {
            c6609i2.c0(4);
        }
        if (c6609i2.O() != 1) {
            throw C6080L.d("Entry count in sgpd != 1 (unsupported).");
        }
        c6609i2.c0(1);
        int iM = c6609i2.M();
        int i12 = (iM & 240) >> 4;
        int i13 = iM & 15;
        boolean z10 = c6609i2.M() == 1;
        if (z10) {
            int iM2 = c6609i2.M();
            byte[] bArr2 = new byte[16];
            c6609i2.q(bArr2, 0, 16);
            if (iM2 == 0) {
                int iM3 = c6609i2.M();
                bArr = new byte[iM3];
                c6609i2.q(bArr, 0, iM3);
            }
            vVar.f54437l = true;
            vVar.f54439n = new u(z10, str, iM2, bArr2, i12, i13, bArr);
        }
    }

    private static void G(C6609I c6609i, int i10, v vVar) throws C6080L {
        c6609i.b0(i10 + 8);
        int iP = AbstractC5811b.p(c6609i.v());
        if ((iP & 1) != 0) {
            throw C6080L.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iP & 2) != 0;
        int iQ = c6609i.Q();
        if (iQ == 0) {
            Arrays.fill(vVar.f54438m, 0, vVar.f54431f, false);
            return;
        }
        if (iQ == vVar.f54431f) {
            Arrays.fill(vVar.f54438m, 0, iQ, z10);
            vVar.d(c6609i.a());
            vVar.b(c6609i);
        } else {
            throw C6080L.a("Senc sample count " + iQ + " is different from fragment sample count" + vVar.f54431f, null);
        }
    }

    private static void H(C6609I c6609i, v vVar) throws C6080L {
        G(c6609i, 0, vVar);
    }

    private static Pair I(C6609I c6609i, long j10) throws C6080L {
        long jT;
        long jT2;
        c6609i.b0(8);
        int iQ = AbstractC5811b.q(c6609i.v());
        c6609i.c0(4);
        long jO = c6609i.O();
        if (iQ == 0) {
            jT = c6609i.O();
            jT2 = c6609i.O();
        } else {
            jT = c6609i.T();
            jT2 = c6609i.T();
        }
        long j11 = j10 + jT2;
        long jM1 = a0.m1(jT, 1000000L, jO);
        c6609i.c0(2);
        int iU = c6609i.U();
        int[] iArr = new int[iU];
        long[] jArr = new long[iU];
        long[] jArr2 = new long[iU];
        long[] jArr3 = new long[iU];
        long j12 = j11;
        long jM12 = jM1;
        int i10 = 0;
        while (i10 < iU) {
            int iV = c6609i.v();
            if ((Integer.MIN_VALUE & iV) != 0) {
                throw C6080L.a("Unhandled indirect reference", null);
            }
            long jO2 = c6609i.O();
            iArr[i10] = iV & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = jM12;
            jT += jO2;
            long[] jArr4 = jArr3;
            jM12 = a0.m1(jT, 1000000L, jO);
            jArr2[i10] = jM12 - jArr4[i10];
            c6609i.c0(4);
            j12 += (long) iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jM1), new C2246g(iArr, jArr, jArr2, jArr3));
    }

    private static long J(C6609I c6609i) {
        c6609i.b0(8);
        return AbstractC5811b.q(c6609i.v()) == 1 ? c6609i.T() : c6609i.O();
    }

    private static b K(C6609I c6609i, SparseArray sparseArray, boolean z10) {
        c6609i.b0(8);
        int iP = AbstractC5811b.p(c6609i.v());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(c6609i.v()));
        if (bVar == null) {
            return null;
        }
        if ((iP & 1) != 0) {
            long jT = c6609i.T();
            v vVar = bVar.f54342b;
            vVar.f54428c = jT;
            vVar.f54429d = jT;
        }
        C5812c c5812c = bVar.f54345e;
        bVar.f54342b.f54426a = new C5812c((iP & 2) != 0 ? c6609i.v() - 1 : c5812c.f54281a, (iP & 8) != 0 ? c6609i.v() : c5812c.f54282b, (iP & 16) != 0 ? c6609i.v() : c5812c.f54283c, (iP & 32) != 0 ? c6609i.v() : c5812c.f54284d);
        return bVar;
    }

    private static void L(AbstractC6723e.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws C6080L {
        b bVarK = K(((AbstractC6723e.c) AbstractC6614a.e(bVar.e(1952868452))).f61230b, sparseArray, z10);
        if (bVarK == null) {
            return;
        }
        v vVar = bVarK.f54342b;
        long j10 = vVar.f54442q;
        boolean z11 = vVar.f54443r;
        bVarK.k();
        bVarK.f54353m = true;
        AbstractC6723e.c cVarE = bVar.e(1952867444);
        if (cVarE == null || (i10 & 2) != 0) {
            vVar.f54442q = j10;
            vVar.f54443r = z11;
        } else {
            vVar.f54442q = J(cVarE.f61230b);
            vVar.f54443r = true;
        }
        O(bVar, bVarK, i10);
        u uVarB = bVarK.f54344d.f54444a.b(((C5812c) AbstractC6614a.e(vVar.f54426a)).f54281a);
        AbstractC6723e.c cVarE2 = bVar.e(1935763834);
        if (cVarE2 != null) {
            E((u) AbstractC6614a.e(uVarB), cVarE2.f61230b, vVar);
        }
        AbstractC6723e.c cVarE3 = bVar.e(1935763823);
        if (cVarE3 != null) {
            D(cVarE3.f61230b, vVar);
        }
        AbstractC6723e.c cVarE4 = bVar.e(1936027235);
        if (cVarE4 != null) {
            H(cVarE4.f61230b, vVar);
        }
        F(bVar, uVarB != null ? uVarB.f54422b : null, vVar);
        int size = bVar.f61228c.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC6723e.c cVar = (AbstractC6723e.c) bVar.f61228c.get(i11);
            if (cVar.f61226a == 1970628964) {
                P(cVar.f61230b, vVar, bArr);
            }
        }
    }

    private static Pair M(C6609I c6609i) {
        c6609i.b0(12);
        return Pair.create(Integer.valueOf(c6609i.v()), new C5812c(c6609i.v() - 1, c6609i.v(), c6609i.v(), c6609i.v()));
    }

    private static int N(b bVar, int i10, int i11, C6609I c6609i, int i12) throws C6080L {
        boolean z10;
        int iV;
        int i13;
        int iV2;
        int i14;
        int iV3;
        int i15;
        int iV4;
        c6609i.b0(8);
        int iP = AbstractC5811b.p(c6609i.v());
        t tVar = bVar.f54344d.f54444a;
        v vVar = bVar.f54342b;
        C5812c c5812c = (C5812c) a0.l(vVar.f54426a);
        vVar.f54433h[i10] = c6609i.Q();
        long[] jArr = vVar.f54432g;
        long j10 = vVar.f54428c;
        jArr[i10] = j10;
        if ((iP & 1) != 0) {
            jArr[i10] = j10 + ((long) c6609i.v());
        }
        boolean z11 = (iP & 4) != 0;
        int iV5 = c5812c.f54284d;
        if (z11) {
            iV5 = c6609i.v();
        }
        boolean z12 = (iP & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        boolean z13 = (iP & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
        boolean z14 = (iP & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
        boolean z15 = (iP & 2048) != 0;
        long j11 = s(tVar) ? ((long[]) a0.l(tVar.f54418j))[0] : 0L;
        int[] iArr = vVar.f54434i;
        long[] jArr2 = vVar.f54435j;
        boolean[] zArr = vVar.f54436k;
        boolean z16 = z15;
        boolean z17 = tVar.f54410b == 2 && (i11 & 1) != 0;
        int i16 = i12 + vVar.f54433h[i10];
        boolean z18 = z11;
        long j12 = tVar.f54411c;
        long j13 = vVar.f54442q;
        int i17 = i12;
        while (i17 < i16) {
            if (z12) {
                iV = c6609i.v();
                z10 = z17;
            } else {
                z10 = z17;
                iV = c5812c.f54282b;
            }
            int iJ = j(iV);
            if (z13) {
                iV2 = c6609i.v();
                i13 = i16;
            } else {
                i13 = i16;
                iV2 = c5812c.f54283c;
            }
            int iJ2 = j(iV2);
            if (z14) {
                i14 = iJ2;
                iV3 = c6609i.v();
            } else if (i17 == 0 && z18) {
                i14 = iJ2;
                iV3 = iV5;
            } else {
                i14 = iJ2;
                iV3 = c5812c.f54284d;
            }
            if (z16) {
                i15 = iV3;
                iV4 = c6609i.v();
            } else {
                i15 = iV3;
                iV4 = 0;
            }
            int i18 = i17;
            long jM1 = a0.m1((((long) iV4) + j13) - j11, 1000000L, j12);
            jArr2[i18] = jM1;
            if (!vVar.f54443r) {
                jArr2[i18] = jM1 + bVar.f54344d.f54451h;
            }
            iArr[i18] = i14;
            zArr[i18] = ((i15 >> 16) & 1) == 0 && (!z10 || i18 == 0);
            j13 += (long) iJ;
            i17 = i18 + 1;
            i16 = i13;
            z17 = z10;
        }
        int i19 = i16;
        vVar.f54442q = j13;
        return i19;
    }

    private static void O(AbstractC6723e.b bVar, b bVar2, int i10) throws C6080L {
        List list = bVar.f61228c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC6723e.c cVar = (AbstractC6723e.c) list.get(i13);
            if (cVar.f61226a == 1953658222) {
                C6609I c6609i = cVar.f61230b;
                c6609i.b0(12);
                int iQ = c6609i.Q();
                if (iQ > 0) {
                    i12 += iQ;
                    i11++;
                }
            }
        }
        bVar2.f54348h = 0;
        bVar2.f54347g = 0;
        bVar2.f54346f = 0;
        bVar2.f54342b.e(i11, i12);
        int i14 = 0;
        int iN = 0;
        for (int i15 = 0; i15 < size; i15++) {
            AbstractC6723e.c cVar2 = (AbstractC6723e.c) list.get(i15);
            if (cVar2.f61226a == 1953658222) {
                iN = N(bVar2, i14, i10, cVar2.f61230b, iN);
                i14++;
            }
        }
    }

    private static void P(C6609I c6609i, v vVar, byte[] bArr) throws C6080L {
        c6609i.b0(8);
        c6609i.q(bArr, 0, 16);
        if (Arrays.equals(bArr, f54295Q)) {
            G(c6609i, 16, vVar);
        }
    }

    private void Q(long j10) throws C6080L {
        while (!this.f54325n.isEmpty() && ((AbstractC6723e.b) this.f54325n.peek()).f61227b == j10) {
            v((AbstractC6723e.b) this.f54325n.pop());
        }
        m();
    }

    private boolean R(InterfaceC2256q interfaceC2256q) throws C6080L {
        if (this.f54334w == 0) {
            if (!interfaceC2256q.h(this.f54324m.f(), 0, 8, true)) {
                return false;
            }
            this.f54334w = 8;
            this.f54324m.b0(0);
            this.f54333v = this.f54324m.O();
            this.f54332u = this.f54324m.v();
        }
        long j10 = this.f54333v;
        if (j10 == 1) {
            interfaceC2256q.readFully(this.f54324m.f(), 8, 8);
            this.f54334w += 8;
            this.f54333v = this.f54324m.T();
        } else if (j10 == 0) {
            long length = interfaceC2256q.getLength();
            if (length == -1 && !this.f54325n.isEmpty()) {
                length = ((AbstractC6723e.b) this.f54325n.peek()).f61227b;
            }
            if (length != -1) {
                this.f54333v = (length - interfaceC2256q.getPosition()) + ((long) this.f54334w);
            }
        }
        long j11 = this.f54333v;
        int i10 = this.f54334w;
        if (j11 < i10) {
            throw C6080L.d("Atom size less than header length (unsupported).");
        }
        if (this.f54311O != -1) {
            if (this.f54332u == 1936286840) {
                this.f54321j.X((int) j11);
                System.arraycopy(this.f54324m.f(), 0, this.f54321j.f(), 0, 8);
                interfaceC2256q.readFully(this.f54321j.f(), 8, (int) (this.f54333v - ((long) this.f54334w)));
                this.f54329r.a((C2246g) I(new AbstractC6723e.c(1936286840, this.f54321j).f61230b, interfaceC2256q.j()).second);
            } else {
                interfaceC2256q.d((int) (j11 - ((long) i10)), true);
            }
            m();
            return true;
        }
        long position = interfaceC2256q.getPosition() - ((long) this.f54334w);
        int i11 = this.f54332u;
        if ((i11 == 1836019558 || i11 == 1835295092) && !this.f54309M) {
            this.f54306J.t(new J.b(this.f54298B, position));
            this.f54309M = true;
        }
        if (this.f54332u == 1836019558) {
            int size = this.f54316e.size();
            for (int i12 = 0; i12 < size; i12++) {
                v vVar = ((b) this.f54316e.valueAt(i12)).f54342b;
                vVar.f54427b = position;
                vVar.f54429d = position;
                vVar.f54428c = position;
            }
        }
        int i13 = this.f54332u;
        if (i13 == 1835295092) {
            this.f54300D = null;
            this.f54336y = position + this.f54333v;
            this.f54331t = 2;
            return true;
        }
        if (V(i13)) {
            long position2 = interfaceC2256q.getPosition();
            long j12 = this.f54333v;
            long j13 = (position2 + j12) - 8;
            if (j12 != this.f54334w && this.f54332u == 1835365473) {
                t(interfaceC2256q);
            }
            this.f54325n.push(new AbstractC6723e.b(this.f54332u, j13));
            if (this.f54333v == this.f54334w) {
                Q(j13);
            } else {
                m();
            }
        } else if (W(this.f54332u)) {
            if (this.f54334w != 8) {
                throw C6080L.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f54333v > 2147483647L) {
                throw C6080L.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            C6609I c6609i = new C6609I((int) this.f54333v);
            System.arraycopy(this.f54324m.f(), 0, c6609i.f(), 0, 8);
            this.f54335x = c6609i;
            this.f54331t = 1;
        } else {
            if (this.f54333v > 2147483647L) {
                throw C6080L.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f54335x = null;
            this.f54331t = 1;
        }
        return true;
    }

    private void S(InterfaceC2256q interfaceC2256q) throws C6080L {
        int i10 = (int) (this.f54333v - ((long) this.f54334w));
        C6609I c6609i = this.f54335x;
        if (c6609i != null) {
            interfaceC2256q.readFully(c6609i.f(), 8, i10);
            x(new AbstractC6723e.c(this.f54332u, c6609i), interfaceC2256q);
        } else {
            interfaceC2256q.m(i10);
        }
        Q(interfaceC2256q.getPosition());
    }

    private void T(InterfaceC2256q interfaceC2256q) throws C6080L {
        int size = this.f54316e.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = ((b) this.f54316e.valueAt(i10)).f54342b;
            if (vVar.f54441p) {
                long j11 = vVar.f54429d;
                if (j11 < j10) {
                    bVar = (b) this.f54316e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f54331t = 3;
            return;
        }
        int position = (int) (j10 - interfaceC2256q.getPosition());
        if (position < 0) {
            throw C6080L.a("Offset to encryption data was negative.", null);
        }
        interfaceC2256q.m(position);
        bVar.f54342b.a(interfaceC2256q);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean U(U2.InterfaceC2256q r17) throws q2.C6080L {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.h.U(U2.q):boolean");
    }

    private static boolean V(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean W(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new h(r.a.f58521a, 32)};
    }

    private boolean g(C6109x c6109x) {
        return Objects.equals(c6109x.f57022o, "video/avc") ? (this.f54313b & 64) != 0 : Objects.equals(c6109x.f57022o, "video/hevc") && (this.f54313b & 128) != 0;
    }

    private static int j(int i10) throws C6080L {
        if (i10 >= 0) {
            return i10;
        }
        throw C6080L.a("Unexpected negative value: " + i10, null);
    }

    public static int k(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void m() {
        this.f54331t = 0;
        this.f54334w = 0;
    }

    private C5812c n(SparseArray sparseArray, int i10) {
        return sparseArray.size() == 1 ? (C5812c) sparseArray.valueAt(0) : (C5812c) AbstractC6614a.e((C5812c) sparseArray.get(i10));
    }

    private static C6102q o(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC6723e.c cVar = (AbstractC6723e.c) list.get(i10);
            if (cVar.f61226a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrF = cVar.f61230b.f();
                UUID uuidF = p.f(bArrF);
                if (uuidF == null) {
                    AbstractC6635w.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C6102q.b(uuidF, "video/mp4", bArrF));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C6102q(arrayList);
    }

    private static b p(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f54353m || bVar2.f54346f != bVar2.f54344d.f54445b) && (!bVar2.f54353m || bVar2.f54348h != bVar2.f54342b.f54430e)) {
                long jD = bVar2.d();
                if (jD < j10) {
                    bVar = bVar2;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    private void r() {
        int i10;
        O[] oArr = new O[2];
        this.f54307K = oArr;
        O o10 = this.f54328q;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f54313b & 4) != 0) {
            oArr[i10] = this.f54306J.e(100, 5);
            i12 = 101;
            i10++;
        }
        O[] oArr2 = (O[]) a0.b1(this.f54307K, i10);
        this.f54307K = oArr2;
        for (O o11 : oArr2) {
            o11.c(f54296R);
        }
        this.f54308L = new O[this.f54315d.size()];
        while (i11 < this.f54308L.length) {
            O oE = this.f54306J.e(i12, 3);
            oE.c((C6109x) this.f54315d.get(i11));
            this.f54308L[i11] = oE;
            i11++;
            i12++;
        }
    }

    private static boolean s(t tVar) {
        long[] jArr = tVar.f54417i;
        if (jArr != null && jArr.length == 1 && tVar.f54418j != null) {
            long j10 = jArr[0];
            if (j10 == 0 || a0.m1(j10, 1000000L, tVar.f54412d) + a0.m1(tVar.f54418j[0], 1000000L, tVar.f54411c) >= tVar.f54413e) {
                return true;
            }
        }
        return false;
    }

    private void t(InterfaceC2256q interfaceC2256q) {
        this.f54321j.X(8);
        interfaceC2256q.o(this.f54321j.f(), 0, 8);
        AbstractC5811b.g(this.f54321j);
        interfaceC2256q.m(this.f54321j.g());
        interfaceC2256q.g();
    }

    private void v(AbstractC6723e.b bVar) throws C6080L {
        int i10 = bVar.f61226a;
        if (i10 == 1836019574) {
            z(bVar);
        } else if (i10 == 1836019558) {
            y(bVar);
        } else {
            if (this.f54325n.isEmpty()) {
                return;
            }
            ((AbstractC6723e.b) this.f54325n.peek()).b(bVar);
        }
    }

    private void w(C6609I c6609i) {
        String str;
        String str2;
        long jM1;
        long jM12;
        long jO;
        long jA;
        if (this.f54307K.length == 0) {
            return;
        }
        c6609i.b0(8);
        int iQ = AbstractC5811b.q(c6609i.v());
        if (iQ == 0) {
            str = (String) AbstractC6614a.e(c6609i.G());
            str2 = (String) AbstractC6614a.e(c6609i.G());
            long jO2 = c6609i.O();
            jM1 = a0.m1(c6609i.O(), 1000000L, jO2);
            long j10 = this.f54299C;
            long j11 = j10 != -9223372036854775807L ? j10 + jM1 : -9223372036854775807L;
            jM12 = a0.m1(c6609i.O(), 1000L, jO2);
            jO = c6609i.O();
            jA = j11;
        } else {
            if (iQ != 1) {
                AbstractC6635w.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iQ);
                return;
            }
            long jO3 = c6609i.O();
            jA = a0.m1(c6609i.T(), 1000000L, jO3);
            long jM13 = a0.m1(c6609i.O(), 1000L, jO3);
            long jO4 = c6609i.O();
            str = (String) AbstractC6614a.e(c6609i.G());
            str2 = (String) AbstractC6614a.e(c6609i.G());
            jM12 = jM13;
            jO = jO4;
            jM1 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[c6609i.a()];
        c6609i.q(bArr, 0, c6609i.a());
        C6609I c6609i2 = new C6609I(this.f54323l.a(new C4768a(str3, str4, jM12, jO, bArr)));
        int iA = c6609i2.a();
        for (O o10 : this.f54307K) {
            c6609i2.b0(0);
            o10.f(c6609i2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f54326o.addLast(new a(jM1, true, iA));
            this.f54337z += iA;
            return;
        }
        if (!this.f54326o.isEmpty()) {
            this.f54326o.addLast(new a(jA, false, iA));
            this.f54337z += iA;
            return;
        }
        t2.O o11 = this.f54322k;
        if (o11 != null && !o11.g()) {
            this.f54326o.addLast(new a(jA, false, iA));
            this.f54337z += iA;
            return;
        }
        t2.O o12 = this.f54322k;
        if (o12 != null) {
            jA = o12.a(jA);
        }
        long j12 = jA;
        for (O o13 : this.f54307K) {
            o13.a(j12, 1, iA, 0, null);
        }
    }

    private void x(AbstractC6723e.c cVar, InterfaceC2256q interfaceC2256q) throws C6080L {
        if (!this.f54325n.isEmpty()) {
            ((AbstractC6723e.b) this.f54325n.peek()).c(cVar);
            return;
        }
        int i10 = cVar.f61226a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                w(cVar.f61230b);
                return;
            }
            return;
        }
        Pair pairI = I(cVar.f61230b, interfaceC2256q.getPosition());
        this.f54329r.a((C2246g) pairI.second);
        if (!this.f54309M) {
            this.f54299C = ((Long) pairI.first).longValue();
            this.f54306J.t((J) pairI.second);
            this.f54309M = true;
        } else {
            if ((this.f54313b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 || this.f54310N || this.f54329r.c() <= 1) {
                return;
            }
            this.f54311O = interfaceC2256q.getPosition();
        }
    }

    private void y(AbstractC6723e.b bVar) throws C6080L {
        C(bVar, this.f54316e, this.f54314c != null, this.f54313b, this.f54320i);
        C6102q c6102qO = o(bVar.f61228c);
        if (c6102qO != null) {
            int size = this.f54316e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f54316e.valueAt(i10)).n(c6102qO);
            }
        }
        if (this.f54297A != -9223372036854775807L) {
            int size2 = this.f54316e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f54316e.valueAt(i11)).l(this.f54297A);
            }
            this.f54297A = -9223372036854775807L;
        }
    }

    private void z(AbstractC6723e.b bVar) {
        long j10;
        boolean z10;
        int i10 = 0;
        AbstractC6614a.h(this.f54314c == null, "Unexpected moov box.");
        C6102q c6102qO = o(bVar.f61228c);
        AbstractC6723e.b bVar2 = (AbstractC6723e.b) AbstractC6614a.e(bVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = bVar2.f61228c.size();
        long jB = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC6723e.c cVar = (AbstractC6723e.c) bVar2.f61228c.get(i11);
            int i12 = cVar.f61226a;
            if (i12 == 1953654136) {
                Pair pairM = M(cVar.f61230b);
                sparseArray.put(((Integer) pairM.first).intValue(), (C5812c) pairM.second);
            } else if (i12 == 1835362404) {
                jB = B(cVar.f61230b);
            }
        }
        AbstractC6723e.b bVarD = bVar.d(1835365473);
        C6078J c6078jI = null;
        C6078J c6078jU = bVarD != null ? AbstractC5811b.u(bVarD) : null;
        B b10 = new B();
        AbstractC6723e.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            c6078jI = AbstractC5811b.I(cVarE);
            b10.c(c6078jI);
        }
        C6078J c6078j = c6078jI;
        C6078J c6078j2 = new C6078J(AbstractC5811b.w(((AbstractC6723e.c) AbstractC6614a.e(bVar.e(1836476516))).f61230b));
        if ((this.f54313b & 16) != 0) {
            j10 = jB;
            z10 = true;
        } else {
            j10 = jB;
            z10 = false;
        }
        List listH = AbstractC5811b.H(bVar, b10, j10, c6102qO, z10, false, new O9.f() { // from class: o3.e
            @Override // O9.f
            public final Object apply(Object obj) {
                return this.f54292a.u((t) obj);
            }
        });
        int size2 = listH.size();
        if (this.f54316e.size() != 0) {
            AbstractC6614a.g(this.f54316e.size() == size2);
            while (i10 < size2) {
                w wVar = (w) listH.get(i10);
                t tVar = wVar.f54444a;
                ((b) this.f54316e.get(tVar.f54409a)).j(wVar, n(sparseArray, tVar.f54409a));
                i10++;
            }
            return;
        }
        String strA = k.a(listH);
        while (i10 < size2) {
            w wVar2 = (w) listH.get(i10);
            t tVar2 = wVar2.f54444a;
            O oE = this.f54306J.e(i10, tVar2.f54410b);
            oE.d(tVar2.f54413e);
            C6109x.b bVarB = tVar2.f54415g.b();
            bVarB.W(strA);
            j.l(tVar2.f54410b, b10, bVarB);
            j.m(tVar2.f54410b, c6078jU, bVarB, tVar2.f54415g.f57019l, c6078j, c6078j2);
            this.f54316e.put(tVar2.f54409a, new b(oE, wVar2, n(sparseArray, tVar2.f54409a), bVarB.P()));
            this.f54298B = Math.max(this.f54298B, tVar2.f54413e);
            i10++;
            b10 = b10;
        }
        this.f54306J.p();
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        int size = this.f54316e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f54316e.valueAt(i10)).k();
        }
        this.f54326o.clear();
        this.f54337z = 0;
        this.f54327p.b();
        this.f54297A = j11;
        this.f54325n.clear();
        m();
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        if ((this.f54313b & 32) == 0) {
            rVar = new r3.s(rVar, this.f54312a);
        }
        this.f54306J = rVar;
        m();
        r();
        t tVar = this.f54314c;
        if (tVar != null) {
            C6109x.b bVarB = tVar.f54415g.b();
            bVarB.W(k.b(this.f54314c.f54415g));
            this.f54316e.put(0, new b(this.f54306J.e(0, this.f54314c.f54410b), new w(this.f54314c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C5812c(0, 0, 0, 0), bVarB.P()));
            this.f54306J.p();
        }
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        N nB = s.b(interfaceC2256q);
        this.f54330s = nB != null ? AbstractC2011u.B(nB) : AbstractC2011u.A();
        return nB == null;
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        while (true) {
            int i11 = this.f54331t;
            if (i11 != 0) {
                if (i11 == 1) {
                    S(interfaceC2256q);
                } else if (i11 == 2) {
                    T(interfaceC2256q);
                } else if (U(interfaceC2256q)) {
                    return 0;
                }
            } else if (!R(interfaceC2256q)) {
                long j10 = this.f54311O;
                if (j10 == -1) {
                    this.f54327p.d();
                    return -1;
                }
                i10.f18917a = j10;
                this.f54311O = -1L;
                this.f54306J.t(this.f54329r.b());
                this.f54310N = true;
                return 1;
            }
        }
    }

    @Override // U2.InterfaceC2255p
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC2011u l() {
        return this.f54330s;
    }

    public h(r.a aVar, int i10, t2.O o10, t tVar, List list, O o11) {
        this.f54312a = aVar;
        this.f54313b = i10;
        this.f54322k = o10;
        this.f54314c = tVar;
        this.f54315d = Collections.unmodifiableList(list);
        this.f54328q = o11;
        this.f54323l = new C4770c();
        this.f54324m = new C6609I(16);
        this.f54317f = new C6609I(AbstractC6726h.f61236a);
        this.f54318g = new C6609I(6);
        this.f54319h = new C6609I();
        byte[] bArr = new byte[16];
        this.f54320i = bArr;
        this.f54321j = new C6609I(bArr);
        this.f54325n = new ArrayDeque();
        this.f54326o = new ArrayDeque();
        this.f54316e = new SparseArray();
        this.f54330s = AbstractC2011u.A();
        this.f54298B = -9223372036854775807L;
        this.f54297A = -9223372036854775807L;
        this.f54299C = -9223372036854775807L;
        this.f54306J = U2.r.f19092P;
        this.f54307K = new O[0];
        this.f54308L = new O[0];
        this.f54327p = new C6729k(new C6729k.b() { // from class: o3.g
            @Override // u2.C6729k.b
            public final void a(long j10, C6609I c6609i) {
                AbstractC2245f.a(j10, c6609i, this.f54293a.f54308L);
            }
        });
        this.f54329r = new C2247h();
        this.f54311O = -1L;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }

    protected t u(t tVar) {
        return tVar;
    }
}
