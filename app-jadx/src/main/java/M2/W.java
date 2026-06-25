package M2;

import F2.t;
import M2.C;
import M2.C1933x;
import M2.L;
import M2.b0;
import Q2.k;
import Q2.m;
import U2.C2253n;
import U2.J;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.C2905q0;
import h3.C4901b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q2.AbstractC6079K;
import q2.C6078J;
import q2.C6080L;
import q2.C6109x;
import q2.InterfaceC6098m;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.C6626m;
import w2.C6930D;
import w2.InterfaceC6940g;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class W implements C, U2.r, m.b, m.f, b0.d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Map f11729q0 = N();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final C6109x f11730r0 = new C6109x.b().j0("icy").y0("application/x-icy").P();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f11731A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private f f11732B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private U2.J f11733C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f11734D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f11735E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f11736F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f11737G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f11738H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f11739I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f11740X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f11741Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private long f11742Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f11743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6940g f11744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F2.u f11745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q2.k f11746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L.a f11747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t.a f11748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f11749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Q2.b f11750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f11751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f11752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f11753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C6109x f11754l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private long f11755l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f11756m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f11757m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Q2.m f11758n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f11759n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Q f11760o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f11761o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C6626m f11762p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f11763p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f11764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f11765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f11766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C.a f11767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C4901b f11768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b0[] f11769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e[] f11770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f11771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11773z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends U2.A {
        a(U2.J j10) {
            super(j10);
        }

        @Override // U2.A, U2.J
        public long n() {
            return W.this.f11734D;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b implements m.e, C1933x.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f11776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C6930D f11777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Q f11778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final U2.r f11779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C6626m f11780f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f11782h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f11784j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private U2.O f11786l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f11787m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final U2.I f11781g = new U2.I();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f11783i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f11775a = C1934y.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private w2.o f11785k = i(0);

        public b(Uri uri, InterfaceC6940g interfaceC6940g, Q q10, U2.r rVar, C6626m c6626m) {
            this.f11776b = uri;
            this.f11777c = new C6930D(interfaceC6940g);
            this.f11778d = q10;
            this.f11779e = rVar;
            this.f11780f = c6626m;
        }

        private w2.o i(long j10) {
            return new o.b().i(this.f11776b).h(j10).f(W.this.f11751i).b(6).e(W.f11729q0).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f11781g.f18917a = j10;
            this.f11784j = j11;
            this.f11783i = true;
            this.f11787m = false;
        }

        @Override // Q2.m.e
        public void a() {
            int iF = 0;
            while (iF == 0 && !this.f11782h) {
                try {
                    long j10 = this.f11781g.f18917a;
                    w2.o oVarI = i(j10);
                    this.f11785k = oVarI;
                    long jA = this.f11777c.a(oVarI);
                    if (this.f11782h) {
                        if (iF != 1 && this.f11778d.e() != -1) {
                            this.f11781g.f18917a = this.f11778d.e();
                        }
                        w2.n.a(this.f11777c);
                        return;
                    }
                    if (jA != -1) {
                        jA += j10;
                        W.this.Y();
                    }
                    long j11 = jA;
                    W.this.f11768u = C4901b.d(this.f11777c.f());
                    InterfaceC6098m c1933x = this.f11777c;
                    if (W.this.f11768u != null && W.this.f11768u.f47602f != -1) {
                        c1933x = new C1933x(this.f11777c, W.this.f11768u.f47602f, this);
                        U2.O oQ = W.this.Q();
                        this.f11786l = oQ;
                        oQ.c(W.f11730r0);
                    }
                    this.f11778d.c(c1933x, this.f11776b, this.f11777c.f(), j10, j11, this.f11779e);
                    if (W.this.f11768u != null) {
                        this.f11778d.d();
                    }
                    if (this.f11783i) {
                        this.f11778d.b(j10, this.f11784j);
                        this.f11783i = false;
                    }
                    while (iF == 0 && !this.f11782h) {
                        try {
                            this.f11780f.a();
                            iF = this.f11778d.f(this.f11781g);
                            long jE = this.f11778d.e();
                            if (jE > W.this.f11752j + j10) {
                                this.f11780f.d();
                                W.this.f11766s.post(W.this.f11765r);
                                j10 = jE;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iF == 1) {
                        iF = 0;
                    } else if (this.f11778d.e() != -1) {
                        this.f11781g.f18917a = this.f11778d.e();
                    }
                    w2.n.a(this.f11777c);
                } catch (Throwable th2) {
                    if (iF != 1 && this.f11778d.e() != -1) {
                        this.f11781g.f18917a = this.f11778d.e();
                    }
                    w2.n.a(this.f11777c);
                    throw th2;
                }
            }
        }

        @Override // M2.C1933x.a
        public void b(C6609I c6609i) {
            long jMax = !this.f11787m ? this.f11784j : Math.max(W.this.P(true), this.f11784j);
            int iA = c6609i.a();
            U2.O o10 = (U2.O) AbstractC6614a.e(this.f11786l);
            o10.f(c6609i, iA);
            o10.a(jMax, 1, iA, 0, null);
            this.f11787m = true;
        }

        @Override // Q2.m.e
        public void c() {
            this.f11782h = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface c {
        void g(long j10, U2.J j11, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11789a;

        public d(int i10) {
            this.f11789a = i10;
        }

        @Override // M2.c0
        public void b() throws IOException {
            W.this.X(this.f11789a);
        }

        @Override // M2.c0
        public int e(long j10) {
            return W.this.i0(this.f11789a, j10);
        }

        @Override // M2.c0
        public boolean isReady() {
            return W.this.S(this.f11789a);
        }

        @Override // M2.c0
        public int p(A2.J j10, z2.f fVar, int i10) {
            return W.this.e0(this.f11789a, j10, fVar, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11792b;

        public e(int i10, boolean z10) {
            this.f11791a = i10;
            this.f11792b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f11791a == eVar.f11791a && this.f11792b == eVar.f11792b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f11791a * 31) + (this.f11792b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0 f11793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f11794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f11795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f11796d;

        public f(n0 n0Var, boolean[] zArr) {
            this.f11793a = n0Var;
            this.f11794b = zArr;
            int i10 = n0Var.f12003a;
            this.f11795c = new boolean[i10];
            this.f11796d = new boolean[i10];
        }
    }

    public W(Uri uri, InterfaceC6940g interfaceC6940g, Q q10, F2.u uVar, t.a aVar, Q2.k kVar, L.a aVar2, c cVar, Q2.b bVar, String str, int i10, int i11, C6109x c6109x, long j10, R2.a aVar3) {
        this.f11743a = uri;
        this.f11744b = interfaceC6940g;
        this.f11745c = uVar;
        this.f11748f = aVar;
        this.f11746d = kVar;
        this.f11747e = aVar2;
        this.f11749g = cVar;
        this.f11750h = bVar;
        this.f11751i = str;
        this.f11752j = i10;
        this.f11753k = i11;
        this.f11754l = c6109x;
        this.f11758n = aVar3 != null ? new Q2.m(aVar3) : new Q2.m("ProgressiveMediaPeriod");
        this.f11760o = q10;
        this.f11756m = j10;
        this.f11762p = new C6626m();
        this.f11764q = new Runnable() { // from class: M2.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f11725a.T();
            }
        };
        this.f11765r = new Runnable() { // from class: M2.U
            @Override // java.lang.Runnable
            public final void run() {
                W.y(this.f11726a);
            }
        };
        this.f11766s = t2.a0.C();
        this.f11770w = new e[0];
        this.f11769v = new b0[0];
        this.f11755l0 = -9223372036854775807L;
        this.f11736F = 1;
    }

    private void L() {
        AbstractC6614a.g(this.f11772y);
        AbstractC6614a.e(this.f11732B);
        AbstractC6614a.e(this.f11733C);
    }

    private boolean M(b bVar, int i10) {
        U2.J j10;
        if (this.f11741Y || !((j10 = this.f11733C) == null || j10.n() == -9223372036854775807L)) {
            this.f11759n0 = i10;
            return true;
        }
        if (this.f11772y && !k0()) {
            this.f11757m0 = true;
            return false;
        }
        this.f11738H = this.f11772y;
        this.f11742Z = 0L;
        this.f11759n0 = 0;
        for (b0 b0Var : this.f11769v) {
            b0Var.X();
        }
        bVar.j(0L, 0L);
        return true;
    }

    private static Map N() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int O() {
        int iJ = 0;
        for (b0 b0Var : this.f11769v) {
            iJ += b0Var.J();
        }
        return iJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f11769v.length; i10++) {
            if (z10 || ((f) AbstractC6614a.e(this.f11732B)).f11795c[i10]) {
                jMax = Math.max(jMax, this.f11769v[i10].C());
            }
        }
        return jMax;
    }

    private boolean R() {
        return this.f11755l0 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f11763p0 || this.f11772y || !this.f11771x || this.f11733C == null) {
            return;
        }
        for (b0 b0Var : this.f11769v) {
            if (b0Var.I() == null) {
                return;
            }
        }
        this.f11762p.d();
        int length = this.f11769v.length;
        q2.a0[] a0VarArr = new q2.a0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            C6109x c6109xP = (C6109x) AbstractC6614a.e(this.f11769v[i10].I());
            String str = c6109xP.f57022o;
            boolean zO = AbstractC6079K.o(str);
            boolean z10 = zO || AbstractC6079K.t(str);
            zArr[i10] = z10;
            this.f11773z = z10 | this.f11773z;
            this.f11731A = this.f11756m != -9223372036854775807L && length == 1 && AbstractC6079K.q(str);
            C4901b c4901b = this.f11768u;
            if (c4901b != null) {
                if (zO || this.f11770w[i10].f11792b) {
                    C6078J c6078j = c6109xP.f57019l;
                    c6109xP = c6109xP.b().r0(c6078j == null ? new C6078J(c4901b) : c6078j.a(c4901b)).P();
                }
                if (zO && c6109xP.f57015h == -1 && c6109xP.f57016i == -1 && c4901b.f47597a != -1) {
                    c6109xP = c6109xP.b().S(c4901b.f47597a).P();
                }
            }
            C6109x c6109xC = c6109xP.c(this.f11745c.b(c6109xP));
            a0VarArr[i10] = new q2.a0(Integer.toString(i10), c6109xC);
            this.f11739I = c6109xC.f57028u | this.f11739I;
        }
        this.f11732B = new f(new n0(a0VarArr), zArr);
        if (this.f11731A && this.f11734D == -9223372036854775807L) {
            this.f11734D = this.f11756m;
            this.f11733C = new a(this.f11733C);
        }
        this.f11749g.g(this.f11734D, this.f11733C, this.f11735E);
        this.f11772y = true;
        ((C.a) AbstractC6614a.e(this.f11767t)).b(this);
    }

    private void U(int i10) {
        L();
        f fVar = this.f11732B;
        boolean[] zArr = fVar.f11796d;
        if (zArr[i10]) {
            return;
        }
        C6109x c6109xC = fVar.f11793a.b(i10).c(0);
        this.f11747e.j(AbstractC6079K.k(c6109xC.f57022o), c6109xC, 0, null, this.f11742Z);
        zArr[i10] = true;
    }

    private void V(int i10) {
        L();
        if (this.f11757m0) {
            if (!this.f11773z || this.f11732B.f11794b[i10]) {
                if (this.f11769v[i10].N(false)) {
                    return;
                }
                this.f11755l0 = 0L;
                this.f11757m0 = false;
                this.f11738H = true;
                this.f11742Z = 0L;
                this.f11759n0 = 0;
                for (b0 b0Var : this.f11769v) {
                    b0Var.X();
                }
                ((C.a) AbstractC6614a.e(this.f11767t)).j(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.f11766s.post(new Runnable() { // from class: M2.S
            @Override // java.lang.Runnable
            public final void run() {
                this.f11724a.f11741Y = true;
            }
        });
    }

    private U2.O d0(e eVar) {
        int length = this.f11769v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f11770w[i10])) {
                return this.f11769v[i10];
            }
        }
        if (this.f11771x) {
            AbstractC6635w.i("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f11791a + ") after finishing tracks.");
            return new C2253n();
        }
        b0 b0VarL = b0.l(this.f11750h, this.f11745c, this.f11748f);
        b0VarL.f0(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f11770w, i11);
        eVarArr[length] = eVar;
        this.f11770w = (e[]) t2.a0.m(eVarArr);
        b0[] b0VarArr = (b0[]) Arrays.copyOf(this.f11769v, i11);
        b0VarArr[length] = b0VarL;
        this.f11769v = (b0[]) t2.a0.m(b0VarArr);
        return b0VarL;
    }

    private boolean g0(boolean[] zArr, long j10, boolean z10) {
        int length = this.f11769v.length;
        for (int i10 = 0; i10 < length; i10++) {
            b0 b0Var = this.f11769v[i10];
            if (b0Var.F() != 0 || !z10) {
                if (!(this.f11731A ? b0Var.a0(b0Var.A()) : b0Var.b0(j10, this.f11761o0)) && (zArr[i10] || !this.f11773z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(U2.J j10) {
        this.f11733C = this.f11768u == null ? j10 : new J.b(-9223372036854775807L);
        this.f11734D = j10.n();
        boolean z10 = !this.f11741Y && j10.n() == -9223372036854775807L;
        this.f11735E = z10;
        this.f11736F = z10 ? 7 : 1;
        if (this.f11772y) {
            this.f11749g.g(this.f11734D, j10, z10);
        } else {
            T();
        }
    }

    private void j0() {
        b bVar = new b(this.f11743a, this.f11744b, this.f11760o, this, this.f11762p);
        if (this.f11772y) {
            AbstractC6614a.g(R());
            long j10 = this.f11734D;
            if (j10 != -9223372036854775807L && this.f11755l0 > j10) {
                this.f11761o0 = true;
                this.f11755l0 = -9223372036854775807L;
                return;
            }
            bVar.j(((U2.J) AbstractC6614a.e(this.f11733C)).g(this.f11755l0).f18918a.f18924b, this.f11755l0);
            for (b0 b0Var : this.f11769v) {
                b0Var.d0(this.f11755l0);
            }
            this.f11755l0 = -9223372036854775807L;
        }
        this.f11759n0 = O();
        this.f11758n.n(bVar, this, this.f11746d.a(this.f11736F));
    }

    private boolean k0() {
        return this.f11738H || R();
    }

    public static /* synthetic */ void y(W w10) {
        if (w10.f11763p0) {
            return;
        }
        ((C.a) AbstractC6614a.e(w10.f11767t)).j(w10);
    }

    U2.O Q() {
        return d0(new e(0, true));
    }

    boolean S(int i10) {
        return !k0() && this.f11769v[i10].N(this.f11761o0);
    }

    void W() throws IOException {
        this.f11758n.k(this.f11746d.a(this.f11736F));
    }

    void X(int i10) throws IOException {
        this.f11769v[i10].P();
        W();
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void h(b bVar, long j10, long j11, boolean z10) {
        C6930D c6930d = bVar.f11777c;
        C1934y c1934y = new C1934y(bVar.f11775a, bVar.f11785k, c6930d.q(), c6930d.r(), j10, j11, c6930d.p());
        this.f11746d.d(bVar.f11775a);
        this.f11747e.m(c1934y, 1, -1, null, 0, null, bVar.f11784j, this.f11734D);
        if (z10) {
            return;
        }
        for (b0 b0Var : this.f11769v) {
            b0Var.X();
        }
        if (this.f11740X > 0) {
            ((C.a) AbstractC6614a.e(this.f11767t)).j(this);
        }
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        if (this.f11761o0 || this.f11758n.i() || this.f11757m0) {
            return false;
        }
        if ((this.f11772y || this.f11754l != null) && this.f11740X == 0) {
            return false;
        }
        boolean zF = this.f11762p.f();
        if (this.f11758n.j()) {
            return zF;
        }
        j0();
        return true;
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void j(b bVar, long j10, long j11) {
        if (this.f11734D == -9223372036854775807L && this.f11733C != null) {
            long jP = P(true);
            long j12 = jP == Long.MIN_VALUE ? 0L : jP + 10000;
            this.f11734D = j12;
            this.f11749g.g(j12, this.f11733C, this.f11735E);
        }
        C6930D c6930d = bVar.f11777c;
        C1934y c1934y = new C1934y(bVar.f11775a, bVar.f11785k, c6930d.q(), c6930d.r(), j10, j11, c6930d.p());
        this.f11746d.d(bVar.f11775a);
        this.f11747e.p(c1934y, 1, -1, null, 0, null, bVar.f11784j, this.f11734D);
        this.f11761o0 = true;
        ((C.a) AbstractC6614a.e(this.f11767t)).j(this);
    }

    @Override // M2.b0.d
    public void b(C6109x c6109x) {
        this.f11766s.post(this.f11764q);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m.c n(b bVar, long j10, long j11, IOException iOException, int i10) {
        b bVar2;
        m.c cVarH;
        C6930D c6930d = bVar.f11777c;
        C1934y c1934y = new C1934y(bVar.f11775a, bVar.f11785k, c6930d.q(), c6930d.r(), j10, j11, c6930d.p());
        long jC = this.f11746d.c(new k.c(c1934y, new B(1, -1, null, 0, null, t2.a0.F1(bVar.f11784j), t2.a0.F1(this.f11734D)), iOException, i10));
        if (jC == -9223372036854775807L) {
            cVarH = Q2.m.f14328g;
            bVar2 = bVar;
        } else {
            int iO = O();
            bVar2 = bVar;
            cVarH = M(bVar2, iO) ? Q2.m.h(iO > this.f11759n0, jC) : Q2.m.f14327f;
        }
        boolean zC = cVarH.c();
        this.f11747e.r(c1934y, 1, -1, null, 0, null, bVar2.f11784j, this.f11734D, iOException, !zC);
        if (!zC) {
            this.f11746d.d(bVar2.f11775a);
        }
        return cVarH;
    }

    @Override // M2.C, M2.d0
    public long c() {
        return f();
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void v(b bVar, long j10, long j11, int i10) {
        C6930D c6930d = bVar.f11777c;
        this.f11747e.v(i10 == 0 ? new C1934y(bVar.f11775a, bVar.f11785k, j10) : new C1934y(bVar.f11775a, bVar.f11785k, c6930d.q(), c6930d.r(), j10, j11, c6930d.p()), 1, -1, null, 0, null, bVar.f11784j, this.f11734D, i10);
    }

    @Override // M2.C
    public long d(long j10, A2.Q q10) {
        L();
        if (!this.f11733C.k()) {
            return 0L;
        }
        J.a aVarG = this.f11733C.g(j10);
        return q10.a(j10, aVarG.f18918a.f18923a, aVarG.f18919b.f18923a);
    }

    @Override // U2.r
    public U2.O e(int i10, int i11) {
        return d0(new e(i10, false));
    }

    int e0(int i10, A2.J j10, z2.f fVar, int i11) {
        if (k0()) {
            return -3;
        }
        U(i10);
        int iU = this.f11769v[i10].U(j10, fVar, i11, this.f11761o0);
        if (iU == -3) {
            V(i10);
        }
        return iU;
    }

    @Override // M2.C, M2.d0
    public long f() {
        long jP;
        L();
        if (this.f11761o0 || this.f11740X == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f11755l0;
        }
        if (this.f11773z) {
            int length = this.f11769v.length;
            jP = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f11732B;
                if (fVar.f11794b[i10] && fVar.f11795c[i10] && !this.f11769v[i10].M()) {
                    jP = Math.min(jP, this.f11769v[i10].C());
                }
            }
        } else {
            jP = Long.MAX_VALUE;
        }
        if (jP == Long.MAX_VALUE) {
            jP = P(false);
        }
        return jP == Long.MIN_VALUE ? this.f11742Z : jP;
    }

    public void f0() {
        if (this.f11772y) {
            for (b0 b0Var : this.f11769v) {
                b0Var.T();
            }
        }
        this.f11758n.m(this);
        this.f11766s.removeCallbacksAndMessages(null);
        this.f11767t = null;
        this.f11763p0 = true;
    }

    @Override // M2.C
    public long i(long j10) {
        L();
        boolean[] zArr = this.f11732B.f11794b;
        if (!this.f11733C.k()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f11738H = false;
        boolean z10 = this.f11742Z == j10;
        this.f11742Z = j10;
        if (R()) {
            this.f11755l0 = j10;
            return j10;
        }
        if (this.f11736F == 7 || ((!this.f11761o0 && !this.f11758n.j()) || !g0(zArr, j10, z10))) {
            this.f11757m0 = false;
            this.f11755l0 = j10;
            this.f11761o0 = false;
            this.f11739I = false;
            if (this.f11758n.j()) {
                b0[] b0VarArr = this.f11769v;
                int length = b0VarArr.length;
                while (i10 < length) {
                    b0VarArr[i10].s();
                    i10++;
                }
                this.f11758n.f();
                return j10;
            }
            this.f11758n.g();
            b0[] b0VarArr2 = this.f11769v;
            int length2 = b0VarArr2.length;
            while (i10 < length2) {
                b0VarArr2[i10].X();
                i10++;
            }
        }
        return j10;
    }

    int i0(int i10, long j10) throws Throwable {
        if (k0()) {
            return 0;
        }
        U(i10);
        b0 b0Var = this.f11769v[i10];
        int iH = b0Var.H(j10, this.f11761o0);
        b0Var.g0(iH);
        if (iH == 0) {
            V(i10);
        }
        return iH;
    }

    @Override // M2.C
    public long k() {
        if (this.f11739I) {
            this.f11739I = false;
            return this.f11742Z;
        }
        if (!this.f11738H) {
            return -9223372036854775807L;
        }
        if (!this.f11761o0 && O() <= this.f11759n0) {
            return -9223372036854775807L;
        }
        this.f11738H = false;
        return this.f11742Z;
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        this.f11767t = aVar;
        if (this.f11754l == null) {
            this.f11762p.f();
            j0();
        } else {
            e(this.f11753k, 3).c(this.f11754l);
            h0(new U2.E(new long[]{0}, new long[]{0}, -9223372036854775807L));
            p();
            this.f11755l0 = j10;
        }
    }

    @Override // Q2.m.f
    public void m() {
        for (b0 b0Var : this.f11769v) {
            b0Var.V();
        }
        this.f11760o.a();
    }

    @Override // M2.C
    public void o() throws IOException {
        W();
        if (this.f11761o0 && !this.f11772y) {
            throw C6080L.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // U2.r
    public void p() {
        this.f11771x = true;
        this.f11766s.post(this.f11764q);
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        return this.f11758n.j() && this.f11762p.e();
    }

    @Override // M2.C
    public long r(P2.A[] aArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        P2.A a10;
        L();
        f fVar = this.f11732B;
        n0 n0Var = fVar.f11793a;
        boolean[] zArr3 = fVar.f11795c;
        int i10 = this.f11740X;
        int i11 = 0;
        for (int i12 = 0; i12 < aArr.length; i12++) {
            c0 c0Var = c0VarArr[i12];
            if (c0Var != null && (aArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) c0Var).f11789a;
                AbstractC6614a.g(zArr3[i13]);
                this.f11740X--;
                zArr3[i13] = false;
                c0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.f11737G ? j10 == 0 || this.f11731A : i10 != 0;
        for (int i14 = 0; i14 < aArr.length; i14++) {
            if (c0VarArr[i14] == null && (a10 = aArr[i14]) != null) {
                AbstractC6614a.g(a10.length() == 1);
                AbstractC6614a.g(a10.f(0) == 0);
                int iD = n0Var.d(a10.m());
                AbstractC6614a.g(!zArr3[iD]);
                this.f11740X++;
                zArr3[iD] = true;
                this.f11739I = a10.q().f57028u | this.f11739I;
                c0VarArr[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    b0 b0Var = this.f11769v[iD];
                    z10 = (b0Var.F() == 0 || b0Var.b0(j10, true)) ? false : true;
                }
            }
        }
        if (this.f11740X == 0) {
            this.f11757m0 = false;
            this.f11738H = false;
            this.f11739I = false;
            if (this.f11758n.j()) {
                b0[] b0VarArr = this.f11769v;
                int length = b0VarArr.length;
                while (i11 < length) {
                    b0VarArr[i11].s();
                    i11++;
                }
                this.f11758n.f();
            } else {
                this.f11761o0 = false;
                b0[] b0VarArr2 = this.f11769v;
                int length2 = b0VarArr2.length;
                while (i11 < length2) {
                    b0VarArr2[i11].X();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = i(j10);
            while (i11 < c0VarArr.length) {
                if (c0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f11737G = true;
        return j10;
    }

    @Override // M2.C
    public n0 s() {
        L();
        return this.f11732B.f11793a;
    }

    @Override // U2.r
    public void t(final U2.J j10) {
        this.f11766s.post(new Runnable() { // from class: M2.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f11727a.h0(j10);
            }
        });
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
        if (this.f11731A) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.f11732B.f11795c;
        int length = this.f11769v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f11769v[i10].r(j10, z10, zArr[i10]);
        }
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
    }
}
