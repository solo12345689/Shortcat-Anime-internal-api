package androidx.media3.exoplayer.hls;

import A2.J;
import A2.Q;
import F2.t;
import F2.u;
import M2.B;
import M2.C1934y;
import M2.L;
import M2.b0;
import M2.c0;
import M2.d0;
import M2.n0;
import P2.F;
import P9.AbstractC2011u;
import P9.AbstractC2014x;
import Q2.k;
import Q2.m;
import U2.C2253n;
import U2.O;
import U2.r;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.exoplayer.C2905q0;
import androidx.media3.exoplayer.hls.c;
import f3.C4768a;
import f3.C4769b;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import q2.AbstractC6079K;
import q2.C6078J;
import q2.C6080L;
import q2.C6102q;
import q2.C6109x;
import q2.InterfaceC6098m;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;
import w2.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements m.b, m.f, d0, r, b0.d {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final Set f30933x0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f30934A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f30935B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f30936C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f30937D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f30938E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private C6109x f30939F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private C6109x f30940G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f30941H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private n0 f30942I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Set f30943X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int[] f30944Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f30945Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f30948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.hls.c f30949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q2.b f30950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C6109x f30951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f30952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t.a f30953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q2.k f30954i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final L.a f30956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f30957l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f30958l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean[] f30960m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f30961n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean[] f30962n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f30963o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private long f30964o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f30965p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long f30966p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f30967q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f30968q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f30969r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f30970r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList f30971s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f30972s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f30973t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f30974t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private N2.e f30975u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private long f30976u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d[] f30977v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private C6102q f30978v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private e f30980w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set f30981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SparseIntArray f30982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private O f30983z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f30955j = new m("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c.b f30959m = new c.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f30979w = new int[0];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b extends d0.a {
        void e();

        void m(Uri uri);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements O {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final C6109x f30984g = new C6109x.b().y0("application/id3").P();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final C6109x f30985h = new C6109x.b().y0("application/x-emsg").P();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4769b f30986a = new C4769b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O f30987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C6109x f30988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C6109x f30989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f30990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f30991f;

        public c(O o10, int i10) {
            this.f30987b = o10;
            if (i10 == 1) {
                this.f30988c = f30984g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                this.f30988c = f30985h;
            }
            this.f30990e = new byte[0];
            this.f30991f = 0;
        }

        private boolean h(C4768a c4768a) {
            C6109x c6109xA = c4768a.a();
            return c6109xA != null && Objects.equals(this.f30988c.f57022o, c6109xA.f57022o);
        }

        private void i(int i10) {
            byte[] bArr = this.f30990e;
            if (bArr.length < i10) {
                this.f30990e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private C6609I j(int i10, int i11) {
            int i12 = this.f30991f - i11;
            C6609I c6609i = new C6609I(Arrays.copyOfRange(this.f30990e, i12 - i10, i12));
            byte[] bArr = this.f30990e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f30991f = i11;
            return c6609i;
        }

        @Override // U2.O
        public void a(long j10, int i10, int i11, int i12, O.a aVar) {
            AbstractC6614a.e(this.f30989d);
            C6609I c6609iJ = j(i11, i12);
            if (!Objects.equals(this.f30989d.f57022o, this.f30988c.f57022o)) {
                if (!"application/x-emsg".equals(this.f30989d.f57022o)) {
                    AbstractC6635w.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f30989d.f57022o);
                    return;
                }
                C4768a c4768aC = this.f30986a.c(c6609iJ);
                if (!h(c4768aC)) {
                    AbstractC6635w.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f30988c.f57022o, c4768aC.a()));
                    return;
                }
                c6609iJ = new C6609I((byte[]) AbstractC6614a.e(c4768aC.c()));
            }
            int iA = c6609iJ.a();
            this.f30987b.f(c6609iJ, iA);
            this.f30987b.a(j10, i10, iA, 0, aVar);
        }

        @Override // U2.O
        public int b(InterfaceC6098m interfaceC6098m, int i10, boolean z10, int i11) throws EOFException {
            i(this.f30991f + i10);
            int i12 = interfaceC6098m.read(this.f30990e, this.f30991f, i10);
            if (i12 != -1) {
                this.f30991f += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // U2.O
        public void c(C6109x c6109x) {
            this.f30989d = c6109x;
            this.f30987b.c(this.f30988c);
        }

        @Override // U2.O
        public void g(C6609I c6609i, int i10, int i11) {
            i(this.f30991f + i10);
            c6609i.q(this.f30990e, this.f30991f, i10);
            this.f30991f += i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d extends b0 {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final Map f30992H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private C6102q f30993I;

        private C6078J j0(C6078J c6078j) {
            if (c6078j == null) {
                return null;
            }
            int iE = c6078j.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iE) {
                    i11 = -1;
                    break;
                }
                C6078J.a aVarD = c6078j.d(i11);
                if ((aVarD instanceof i3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((i3.m) aVarD).f48630b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return c6078j;
            }
            if (iE == 1) {
                return null;
            }
            C6078J.a[] aVarArr = new C6078J.a[iE - 1];
            while (i10 < iE) {
                if (i10 != i11) {
                    aVarArr[i10 < i11 ? i10 : i10 - 1] = c6078j.d(i10);
                }
                i10++;
            }
            return new C6078J(aVarArr);
        }

        @Override // M2.b0, U2.O
        public void a(long j10, int i10, int i11, int i12, O.a aVar) {
            super.a(j10, i10, i11, i12, aVar);
        }

        public void k0(C6102q c6102q) {
            this.f30993I = c6102q;
            L();
        }

        public void l0(e eVar) {
            h0(eVar.f30883k);
        }

        @Override // M2.b0
        public C6109x z(C6109x c6109x) {
            C6102q c6102q;
            C6102q c6102q2 = this.f30993I;
            if (c6102q2 == null) {
                c6102q2 = c6109x.f57026s;
            }
            if (c6102q2 != null && (c6102q = (C6102q) this.f30992H.get(c6102q2.f56943c)) != null) {
                c6102q2 = c6102q;
            }
            C6078J c6078jJ0 = j0(c6109x.f57019l);
            if (c6102q2 != c6109x.f57026s || c6078jJ0 != c6109x.f57019l) {
                c6109x = c6109x.b().c0(c6102q2).r0(c6078jJ0).P();
            }
            return super.z(c6109x);
        }

        private d(Q2.b bVar, u uVar, t.a aVar, Map map) {
            super(bVar, uVar, aVar);
            this.f30992H = map;
        }
    }

    public l(String str, int i10, b bVar, androidx.media3.exoplayer.hls.c cVar, Map map, Q2.b bVar2, long j10, C6109x c6109x, u uVar, t.a aVar, Q2.k kVar, L.a aVar2, int i11) {
        this.f30946a = str;
        this.f30947b = i10;
        this.f30948c = bVar;
        this.f30949d = cVar;
        this.f30973t = map;
        this.f30950e = bVar2;
        this.f30951f = c6109x;
        this.f30952g = uVar;
        this.f30953h = aVar;
        this.f30954i = kVar;
        this.f30956k = aVar2;
        this.f30957l = i11;
        Set set = f30933x0;
        this.f30981x = new HashSet(set.size());
        this.f30982y = new SparseIntArray(set.size());
        this.f30977v = new d[0];
        this.f30962n0 = new boolean[0];
        this.f30960m0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f30961n = arrayList;
        this.f30963o = Collections.unmodifiableList(arrayList);
        this.f30971s = new ArrayList();
        this.f30965p = new Runnable() { // from class: androidx.media3.exoplayer.hls.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f30931a.W();
            }
        };
        this.f30967q = new Runnable() { // from class: androidx.media3.exoplayer.hls.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f30932a.g0();
            }
        };
        this.f30969r = a0.C();
        this.f30964o0 = j10;
        this.f30966p0 = j10;
    }

    private void B() {
        C6109x c6109x;
        int length = this.f30977v.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = ((C6109x) AbstractC6614a.i(this.f30977v[i12].I())).f57022o;
            int i13 = AbstractC6079K.t(str) ? 2 : AbstractC6079K.o(str) ? 1 : AbstractC6079K.s(str) ? 3 : -2;
            if (O(i13) > O(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        q2.a0 a0VarL = this.f30949d.l();
        int i14 = a0VarL.f56702a;
        this.f30945Z = -1;
        this.f30944Y = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.f30944Y[i15] = i15;
        }
        q2.a0[] a0VarArr = new q2.a0[length];
        int i16 = 0;
        while (i16 < length) {
            C6109x c6109x2 = (C6109x) AbstractC6614a.i(this.f30977v[i16].I());
            if (i16 == i11) {
                C6109x[] c6109xArr = new C6109x[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    C6109x c6109xC = a0VarL.c(i17);
                    if (i10 == 1 && (c6109x = this.f30951f) != null) {
                        c6109xC = c6109xC.m(c6109x);
                    }
                    c6109xArr[i17] = i14 == 1 ? c6109x2.m(c6109xC) : H(c6109xC, c6109x2, true);
                }
                a0VarArr[i16] = new q2.a0(this.f30946a, c6109xArr);
                this.f30945Z = i16;
            } else {
                C6109x c6109x3 = (i10 == 2 && AbstractC6079K.o(c6109x2.f57022o)) ? this.f30951f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f30946a);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                a0VarArr[i16] = new q2.a0(sb2.toString(), H(c6109x3, c6109x2, false));
            }
            i16++;
        }
        this.f30942I = G(a0VarArr);
        AbstractC6614a.g(this.f30943X == null);
        this.f30943X = Collections.EMPTY_SET;
    }

    private boolean C(int i10) {
        for (int i11 = i10; i11 < this.f30961n.size(); i11++) {
            if (((e) this.f30961n.get(i11)).x()) {
                return false;
            }
        }
        e eVar = (e) this.f30961n.get(i10);
        for (int i12 = 0; i12 < this.f30977v.length; i12++) {
            if (this.f30977v[i12].F() > eVar.n(i12)) {
                return false;
            }
        }
        return true;
    }

    private static C2253n E(int i10, int i11) {
        AbstractC6635w.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new C2253n();
    }

    private b0 F(int i10, int i11) {
        int length = this.f30977v.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f30950e, this.f30952g, this.f30953h, this.f30973t);
        dVar.d0(this.f30964o0);
        if (z10) {
            dVar.k0(this.f30978v0);
        }
        dVar.c0(this.f30976u0);
        e eVar = this.f30980w0;
        if (eVar != null) {
            dVar.l0(eVar);
        }
        dVar.f0(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f30979w, i12);
        this.f30979w = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f30977v = (d[]) a0.Z0(this.f30977v, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.f30962n0, i12);
        this.f30962n0 = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.f30958l0 |= z10;
        this.f30981x.add(Integer.valueOf(i11));
        this.f30982y.append(i11, length);
        if (O(i11) > O(this.f30934A)) {
            this.f30935B = length;
            this.f30934A = i11;
        }
        this.f30960m0 = Arrays.copyOf(this.f30960m0, i12);
        return dVar;
    }

    private n0 G(q2.a0[] a0VarArr) {
        for (int i10 = 0; i10 < a0VarArr.length; i10++) {
            q2.a0 a0Var = a0VarArr[i10];
            C6109x[] c6109xArr = new C6109x[a0Var.f56702a];
            for (int i11 = 0; i11 < a0Var.f56702a; i11++) {
                C6109x c6109xC = a0Var.c(i11);
                c6109xArr[i11] = c6109xC.c(this.f30952g.b(c6109xC));
            }
            a0VarArr[i10] = new q2.a0(a0Var.f56703b, c6109xArr);
        }
        return new n0(a0VarArr);
    }

    private static C6109x H(C6109x c6109x, C6109x c6109x2, boolean z10) {
        String strD;
        String strG;
        if (c6109x == null) {
            return c6109x2;
        }
        int iK = AbstractC6079K.k(c6109x2.f57022o);
        if (a0.T(c6109x.f57018k, iK) == 1) {
            strD = a0.U(c6109x.f57018k, iK);
            strG = AbstractC6079K.g(strD);
        } else {
            strD = AbstractC6079K.d(c6109x.f57018k, c6109x2.f57022o);
            strG = c6109x2.f57022o;
        }
        C6109x.b bVarU = c6109x2.b().j0(c6109x.f57008a).l0(c6109x.f57009b).m0(c6109x.f57010c).n0(c6109x.f57011d).A0(c6109x.f57012e).w0(c6109x.f57013f).S(z10 ? c6109x.f57015h : -1).t0(z10 ? c6109x.f57016i : -1).U(strD);
        if (iK == 2) {
            bVarU.F0(c6109x.f57029v).h0(c6109x.f57030w).f0(c6109x.f57033z);
        }
        if (strG != null) {
            bVarU.y0(strG);
        }
        int i10 = c6109x.f56997G;
        if (i10 != -1 && iK == 1) {
            bVarU.T(i10);
        }
        C6078J c6078jB = c6109x.f57019l;
        if (c6078jB != null) {
            C6078J c6078j = c6109x2.f57019l;
            if (c6078j != null) {
                c6078jB = c6078j.b(c6078jB);
            }
            bVarU.r0(c6078jB);
        }
        return bVarU.P();
    }

    private void I(int i10) {
        AbstractC6614a.g(!this.f30955j.j());
        while (true) {
            if (i10 >= this.f30961n.size()) {
                i10 = -1;
                break;
            } else if (C(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = M().f12612h;
        e eVarJ = J(i10);
        if (this.f30961n.isEmpty()) {
            this.f30966p0 = this.f30964o0;
        } else {
            ((e) AbstractC2014x.d(this.f30961n)).q();
        }
        this.f30972s0 = false;
        this.f30956k.y(this.f30934A, eVarJ.f12611g, j10);
    }

    private e J(int i10) {
        e eVar = (e) this.f30961n.get(i10);
        ArrayList arrayList = this.f30961n;
        a0.k1(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f30977v.length; i11++) {
            this.f30977v[i11].w(eVar.n(i11));
        }
        return eVar;
    }

    private boolean K(e eVar) {
        int i10 = eVar.f30883k;
        int length = this.f30977v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f30960m0[i11] && this.f30977v[i11].S() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean L(C6109x c6109x, C6109x c6109x2) {
        String str = c6109x.f57022o;
        String str2 = c6109x2.f57022o;
        int iK = AbstractC6079K.k(str);
        if (iK != 3) {
            return iK == AbstractC6079K.k(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c6109x.f57002L == c6109x2.f57002L;
        }
        return false;
    }

    private e M() {
        return (e) this.f30961n.get(r0.size() - 1);
    }

    private O N(int i10, int i11) {
        AbstractC6614a.a(f30933x0.contains(Integer.valueOf(i11)));
        int i12 = this.f30982y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f30981x.add(Integer.valueOf(i11))) {
            this.f30979w[i12] = i10;
        }
        return this.f30979w[i12] == i10 ? this.f30977v[i12] : E(i10, i11);
    }

    private static int O(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void P(e eVar) {
        this.f30980w0 = eVar;
        this.f30939F = eVar.f12608d;
        this.f30966p0 = -9223372036854775807L;
        this.f30961n.add(eVar);
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        for (d dVar : this.f30977v) {
            aVarT.a(Integer.valueOf(dVar.J()));
        }
        eVar.p(this, aVarT.k());
        for (d dVar2 : this.f30977v) {
            dVar2.l0(eVar);
            if (eVar.x()) {
                dVar2.i0();
            }
        }
    }

    private static boolean Q(N2.e eVar) {
        return eVar instanceof e;
    }

    private boolean R() {
        return this.f30966p0 != -9223372036854775807L;
    }

    private void U() {
        int i10 = this.f30942I.f12003a;
        int[] iArr = new int[i10];
        this.f30944Y = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f30977v;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (L((C6109x) AbstractC6614a.i(dVarArr[i12].I()), this.f30942I.b(i11).c(0))) {
                    this.f30944Y[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator it = this.f30971s.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
    }

    private void V(e eVar) {
        if (this.f30961n.isEmpty()) {
            return;
        }
        if (!M().r()) {
            I(this.f30961n.size() - 1);
        }
        if (eVar.f30886n && eVar.x()) {
            for (int size = this.f30961n.size() - 1; size >= 0; size--) {
                long j10 = ((e) this.f30961n.get(size)).f12611g;
                long j11 = eVar.f12611g;
                if (j10 < j11) {
                    return;
                }
                if (j10 == j11 && C(size)) {
                    I(size);
                    eVar.j();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        if (!this.f30941H && this.f30944Y == null && this.f30936C) {
            for (d dVar : this.f30977v) {
                if (dVar.I() == null) {
                    return;
                }
            }
            if (this.f30942I != null) {
                U();
                return;
            }
            B();
            p0();
            this.f30948c.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        this.f30936C = true;
        W();
    }

    private void k0() {
        for (d dVar : this.f30977v) {
            dVar.Y(this.f30968q0);
        }
        this.f30968q0 = false;
    }

    private boolean l0(long j10, e eVar) throws Throwable {
        boolean zB0;
        int length = this.f30977v.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            d dVar = this.f30977v[i10];
            if (eVar != null) {
                zB0 = dVar.a0(eVar.n(i10));
            } else {
                long jC = c();
                if (jC != Long.MIN_VALUE && j10 >= jC) {
                    z10 = false;
                }
                zB0 = dVar.b0(j10, z10);
            }
            if (!zB0 && (this.f30962n0[i10] || !this.f30958l0)) {
                break;
            }
            i10++;
        }
        return false;
    }

    private void p0() {
        this.f30937D = true;
    }

    private void u0(c0[] c0VarArr) {
        this.f30971s.clear();
        for (c0 c0Var : c0VarArr) {
            if (c0Var != null) {
                this.f30971s.add((h) c0Var);
            }
        }
    }

    private void z() {
        AbstractC6614a.g(this.f30937D);
        AbstractC6614a.e(this.f30942I);
        AbstractC6614a.e(this.f30943X);
    }

    public int A(int i10) {
        z();
        AbstractC6614a.e(this.f30944Y);
        int i11 = this.f30944Y[i10];
        if (i11 == -1) {
            return this.f30943X.contains(this.f30942I.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.f30960m0;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public void D() {
        if (this.f30937D) {
            return;
        }
        a(new C2905q0.b().f(this.f30964o0).d());
    }

    public boolean S(int i10) {
        return !R() && this.f30977v[i10].N(this.f30972s0);
    }

    public boolean T() {
        return this.f30934A == 2;
    }

    public void X() {
        this.f30955j.b();
        this.f30949d.r();
    }

    public void Y(int i10) {
        X();
        this.f30977v[i10].P();
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void h(N2.e eVar, long j10, long j11, boolean z10) {
        this.f30975u = null;
        C1934y c1934y = new C1934y(eVar.f12605a, eVar.f12606b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f30954i.d(eVar.f12605a);
        this.f30956k.m(c1934y, eVar.f12607c, this.f30947b, eVar.f12608d, eVar.f12609e, eVar.f12610f, eVar.f12611g, eVar.f12612h);
        if (z10) {
            return;
        }
        if (R() || this.f30938E == 0) {
            k0();
        }
        if (this.f30938E > 0) {
            this.f30948c.j(this);
        }
    }

    @Override // M2.d0
    public boolean a(C2905q0 c2905q0) {
        List list;
        long j10;
        long j11;
        if (this.f30972s0 || this.f30955j.j() || this.f30955j.i()) {
            return false;
        }
        if (R()) {
            List list2 = Collections.EMPTY_LIST;
            long j12 = this.f30966p0;
            for (d dVar : this.f30977v) {
                dVar.d0(this.f30966p0);
            }
            list = list2;
            j10 = j12;
            j11 = j10;
        } else {
            List list3 = this.f30963o;
            e eVarM = M();
            long jO = (eVarM.h() && eVarM.r()) ? eVarM.o() : Math.max(this.f30964o0, eVarM.f12611g);
            long jMax = this.f30964o0;
            if (this.f30936C) {
                for (d dVar2 : this.f30977v) {
                    jMax = Math.max(jMax, dVar2.D());
                }
            }
            list = list3;
            j10 = jO;
            j11 = jMax;
        }
        this.f30959m.a();
        this.f30949d.f(c2905q0, j10, j11, list, this.f30937D || !list.isEmpty(), this.f30959m);
        c.b bVar = this.f30959m;
        boolean z10 = bVar.f30856b;
        N2.e eVar = bVar.f30855a;
        Uri uri = bVar.f30857c;
        if (z10) {
            this.f30966p0 = -9223372036854775807L;
            this.f30972s0 = true;
            return true;
        }
        if (eVar == null) {
            if (uri != null) {
                this.f30948c.m(uri);
            }
            return false;
        }
        if (Q(eVar)) {
            e eVar2 = (e) eVar;
            V(eVar2);
            P(eVar2);
        }
        this.f30975u = eVar;
        this.f30955j.n(eVar, this, this.f30954i.a(eVar.f12607c));
        return true;
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void j(N2.e eVar, long j10, long j11) {
        this.f30975u = null;
        this.f30949d.t(eVar);
        C1934y c1934y = new C1934y(eVar.f12605a, eVar.f12606b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f30954i.d(eVar.f12605a);
        this.f30956k.p(c1934y, eVar.f12607c, this.f30947b, eVar.f12608d, eVar.f12609e, eVar.f12610f, eVar.f12611g, eVar.f12612h);
        if (this.f30937D) {
            this.f30948c.j(this);
        } else {
            a(new C2905q0.b().f(this.f30964o0).d());
        }
    }

    @Override // M2.b0.d
    public void b(C6109x c6109x) {
        this.f30969r.post(this.f30965p);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m.c n(N2.e eVar, long j10, long j11, IOException iOException, int i10) {
        m.c cVarH;
        int i11;
        boolean zQ = Q(eVar);
        if (zQ && !((e) eVar).r() && (iOException instanceof x) && ((i11 = ((x) iOException).f62894d) == 410 || i11 == 404)) {
            return m.f14325d;
        }
        long jB = eVar.b();
        C1934y c1934y = new C1934y(eVar.f12605a, eVar.f12606b, eVar.f(), eVar.e(), j10, j11, jB);
        k.c cVar = new k.c(c1934y, new B(eVar.f12607c, this.f30947b, eVar.f12608d, eVar.f12609e, eVar.f12610f, a0.F1(eVar.f12611g), a0.F1(eVar.f12612h)), iOException, i10);
        k.b bVarB = this.f30954i.b(F.c(this.f30949d.m()), cVar);
        boolean zQ2 = (bVarB == null || bVarB.f14319a != 2) ? false : this.f30949d.q(eVar, bVarB.f14320b);
        if (zQ2) {
            if (zQ && jB == 0) {
                ArrayList arrayList = this.f30961n;
                AbstractC6614a.g(((e) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (this.f30961n.isEmpty()) {
                    this.f30966p0 = this.f30964o0;
                } else {
                    ((e) AbstractC2014x.d(this.f30961n)).q();
                }
            }
            cVarH = m.f14327f;
        } else {
            long jC = this.f30954i.c(cVar);
            cVarH = jC != -9223372036854775807L ? m.h(false, jC) : m.f14328g;
        }
        m.c cVar2 = cVarH;
        boolean zC = cVar2.c();
        this.f30956k.r(c1934y, eVar.f12607c, this.f30947b, eVar.f12608d, eVar.f12609e, eVar.f12610f, eVar.f12611g, eVar.f12612h, iOException, !zC);
        if (!zC) {
            this.f30975u = null;
            this.f30954i.d(eVar.f12605a);
        }
        if (zQ2) {
            if (!this.f30937D) {
                a(new C2905q0.b().f(this.f30964o0).d());
                return cVar2;
            }
            this.f30948c.j(this);
        }
        return cVar2;
    }

    @Override // M2.d0
    public long c() {
        if (R()) {
            return this.f30966p0;
        }
        if (this.f30972s0) {
            return Long.MIN_VALUE;
        }
        return M().f12612h;
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void v(N2.e eVar, long j10, long j11, int i10) {
        this.f30956k.v(i10 == 0 ? new C1934y(eVar.f12605a, eVar.f12606b, j10) : new C1934y(eVar.f12605a, eVar.f12606b, eVar.f(), eVar.e(), j10, j11, eVar.b()), eVar.f12607c, this.f30947b, eVar.f12608d, eVar.f12609e, eVar.f12610f, eVar.f12611g, eVar.f12612h, i10);
    }

    public long d(long j10, Q q10) {
        return this.f30949d.c(j10, q10);
    }

    public void d0() {
        this.f30981x.clear();
    }

    @Override // U2.r
    public O e(int i10, int i11) {
        O oF;
        if (!f30933x0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                O[] oArr = this.f30977v;
                if (i12 >= oArr.length) {
                    oF = null;
                    break;
                }
                if (this.f30979w[i12] == i10) {
                    oF = oArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            oF = N(i10, i11);
        }
        if (oF == null) {
            if (this.f30974t0) {
                return E(i10, i11);
            }
            oF = F(i10, i11);
        }
        if (i11 != 5) {
            return oF;
        }
        if (this.f30983z == null) {
            this.f30983z = new c(oF, this.f30957l);
        }
        return this.f30983z;
    }

    public boolean e0(Uri uri, k.c cVar, boolean z10) {
        k.b bVarB;
        if (this.f30949d.s(uri)) {
            return this.f30949d.u(uri, (z10 || (bVarB = this.f30954i.b(F.c(this.f30949d.m()), cVar)) == null || bVarB.f14319a != 2) ? -9223372036854775807L : bVarB.f14320b);
        }
        return true;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // M2.d0
    public long f() {
        /*
            r7 = this;
            boolean r0 = r7.f30972s0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.R()
            if (r0 == 0) goto L10
            long r0 = r7.f30966p0
            return r0
        L10:
            long r0 = r7.f30964o0
            androidx.media3.exoplayer.hls.e r2 = r7.M()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r7.f30961n
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r7.f30961n
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            androidx.media3.exoplayer.hls.e r2 = (androidx.media3.exoplayer.hls.e) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f12612h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f30936C
            if (r2 == 0) goto L55
            androidx.media3.exoplayer.hls.l$d[] r2 = r7.f30977v
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.C()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.l.f():long");
    }

    public void f0() {
        if (this.f30961n.isEmpty()) {
            return;
        }
        final e eVar = (e) AbstractC2014x.d(this.f30961n);
        int iD = this.f30949d.d(eVar);
        if (iD == 1) {
            if (eVar.r()) {
                return;
            }
            eVar.w(this.f30949d.j(eVar));
        } else if (iD == 0) {
            this.f30969r.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30929a.f30948c.m(eVar.f30885m);
                }
            });
        } else if (iD == 2 && !this.f30972s0 && this.f30955j.j()) {
            this.f30955j.f();
        }
    }

    @Override // M2.d0
    public void g(long j10) {
        if (this.f30955j.i() || R()) {
            return;
        }
        if (this.f30955j.j()) {
            AbstractC6614a.e(this.f30975u);
            if (this.f30949d.z(j10, this.f30975u, this.f30963o)) {
                this.f30955j.f();
                return;
            }
            return;
        }
        int size = this.f30963o.size();
        while (size > 0 && this.f30949d.d((e) this.f30963o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f30963o.size()) {
            I(size);
        }
        int i10 = this.f30949d.i(j10, this.f30963o);
        if (i10 < this.f30961n.size()) {
            I(i10);
        }
    }

    public void h0(q2.a0[] a0VarArr, int i10, int... iArr) {
        this.f30942I = G(a0VarArr);
        this.f30943X = new HashSet();
        for (int i11 : iArr) {
            this.f30943X.add(this.f30942I.b(i11));
        }
        this.f30945Z = i10;
        Handler handler = this.f30969r;
        final b bVar = this.f30948c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: G2.g
            @Override // java.lang.Runnable
            public final void run() {
                bVar.e();
            }
        });
        p0();
    }

    public int i0(int i10, J j10, z2.f fVar, int i11) {
        if (R()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f30961n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f30961n.size() - 1 && K((e) this.f30961n.get(i13))) {
                i13++;
            }
            a0.k1(this.f30961n, 0, i13);
            e eVar = (e) this.f30961n.get(0);
            C6109x c6109x = eVar.f12608d;
            if (!c6109x.equals(this.f30940G)) {
                this.f30956k.j(this.f30947b, c6109x, eVar.f12609e, eVar.f12610f, eVar.f12611g);
            }
            this.f30940G = c6109x;
        }
        if (!this.f30961n.isEmpty() && !((e) this.f30961n.get(0)).r()) {
            return -3;
        }
        int iU = this.f30977v[i10].U(j10, fVar, i11, this.f30972s0);
        if (iU == -5) {
            C6109x c6109xM = (C6109x) AbstractC6614a.e(j10.f142b);
            if (i10 == this.f30935B) {
                int iE = S9.f.e(this.f30977v[i10].S());
                while (i12 < this.f30961n.size() && ((e) this.f30961n.get(i12)).f30883k != iE) {
                    i12++;
                }
                c6109xM = c6109xM.m(i12 < this.f30961n.size() ? ((e) this.f30961n.get(i12)).f12608d : (C6109x) AbstractC6614a.e(this.f30939F));
            }
            j10.f142b = c6109xM;
        }
        return iU;
    }

    public void j0() {
        if (this.f30937D) {
            for (d dVar : this.f30977v) {
                dVar.T();
            }
        }
        this.f30949d.v();
        this.f30955j.m(this);
        this.f30969r.removeCallbacksAndMessages(null);
        this.f30941H = true;
        this.f30971s.clear();
    }

    @Override // Q2.m.f
    public void m() {
        for (d dVar : this.f30977v) {
            dVar.V();
        }
    }

    public boolean m0(long j10, boolean z10) {
        e eVar;
        this.f30964o0 = j10;
        if (R()) {
            this.f30966p0 = j10;
            return true;
        }
        if (this.f30949d.n()) {
            for (int i10 = 0; i10 < this.f30961n.size(); i10++) {
                eVar = (e) this.f30961n.get(i10);
                if (eVar.f12611g == j10) {
                    break;
                }
            }
            eVar = null;
        } else {
            eVar = null;
        }
        if (this.f30936C && !z10 && !this.f30961n.isEmpty() && l0(j10, eVar)) {
            return false;
        }
        this.f30966p0 = j10;
        this.f30972s0 = false;
        this.f30961n.clear();
        if (this.f30955j.j()) {
            if (this.f30936C) {
                for (d dVar : this.f30977v) {
                    dVar.s();
                }
            }
            this.f30955j.f();
        } else {
            this.f30955j.g();
            k0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n0(P2.A[] r14, boolean[] r15, M2.c0[] r16, boolean[] r17, long r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.l.n0(P2.A[], boolean[], M2.c0[], boolean[], long, boolean):boolean");
    }

    public void o() throws C6080L {
        X();
        if (this.f30972s0 && !this.f30937D) {
            throw C6080L.a("Loading finished before preparation is complete.", null);
        }
    }

    public void o0(C6102q c6102q) {
        if (Objects.equals(this.f30978v0, c6102q)) {
            return;
        }
        this.f30978v0 = c6102q;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f30977v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.f30962n0[i10]) {
                dVarArr[i10].k0(c6102q);
            }
            i10++;
        }
    }

    @Override // U2.r
    public void p() {
        this.f30974t0 = true;
        this.f30969r.post(this.f30967q);
    }

    @Override // M2.d0
    public boolean q() {
        return this.f30955j.j();
    }

    public void q0(boolean z10) {
        this.f30949d.x(z10);
    }

    public void r0(long j10) {
        if (this.f30976u0 != j10) {
            this.f30976u0 = j10;
            for (d dVar : this.f30977v) {
                dVar.c0(j10);
            }
        }
    }

    public n0 s() {
        z();
        return this.f30942I;
    }

    public int s0(int i10, long j10) throws Throwable {
        if (R()) {
            return 0;
        }
        d dVar = this.f30977v[i10];
        int iH = dVar.H(j10, this.f30972s0);
        e eVar = (e) AbstractC2014x.e(this.f30961n, null);
        if (eVar != null && !eVar.r()) {
            iH = Math.min(iH, eVar.n(i10) - dVar.F());
        }
        dVar.g0(iH);
        return iH;
    }

    public void t0(int i10) {
        z();
        AbstractC6614a.e(this.f30944Y);
        int i11 = this.f30944Y[i10];
        AbstractC6614a.g(this.f30960m0[i11]);
        this.f30960m0[i11] = false;
    }

    public void u(long j10, boolean z10) {
        if (!this.f30936C || R()) {
            return;
        }
        int length = this.f30977v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f30977v[i10].r(j10, z10, this.f30960m0[i10]);
        }
    }

    @Override // U2.r
    public void t(U2.J j10) {
    }
}
