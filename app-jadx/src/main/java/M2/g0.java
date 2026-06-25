package M2;

import M2.C;
import M2.L;
import Q2.k;
import Q2.m;
import androidx.media3.exoplayer.C2905q0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import q2.AbstractC6079K;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import w2.C6930D;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g0 implements C, m.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2.o f11935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6940g.a f11936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6932F f11937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q2.k f11938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L.a f11939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0 f11940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f11941g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f11942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Q2.m f11943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final C6109x f11944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f11945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f11946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte[] f11947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f11948n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11950b;

        private b() {
        }

        private void a() {
            if (this.f11950b) {
                return;
            }
            g0.this.f11939e.j(AbstractC6079K.k(g0.this.f11944j.f57022o), g0.this.f11944j, 0, null, 0L);
            this.f11950b = true;
        }

        @Override // M2.c0
        public void b() throws IOException {
            g0 g0Var = g0.this;
            if (g0Var.f11945k) {
                return;
            }
            g0Var.f11943i.b();
        }

        public void c() {
            if (this.f11949a == 2) {
                this.f11949a = 1;
            }
        }

        @Override // M2.c0
        public int e(long j10) {
            a();
            if (j10 <= 0 || this.f11949a == 2) {
                return 0;
            }
            this.f11949a = 2;
            return 1;
        }

        @Override // M2.c0
        public boolean isReady() {
            return g0.this.f11946l;
        }

        @Override // M2.c0
        public int p(A2.J j10, z2.f fVar, int i10) {
            a();
            g0 g0Var = g0.this;
            boolean z10 = g0Var.f11946l;
            if (z10 && g0Var.f11947m == null) {
                this.f11949a = 2;
            }
            int i11 = this.f11949a;
            if (i11 == 2) {
                fVar.k(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                j10.f142b = g0Var.f11944j;
                this.f11949a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            AbstractC6614a.e(g0Var.f11947m);
            fVar.k(1);
            fVar.f65557f = 0L;
            if ((i10 & 4) == 0) {
                fVar.x(g0.this.f11948n);
                ByteBuffer byteBuffer = fVar.f65555d;
                g0 g0Var2 = g0.this;
                byteBuffer.put(g0Var2.f11947m, 0, g0Var2.f11948n);
            }
            if ((i10 & 1) == 0) {
                this.f11949a = 2;
            }
            return -4;
        }
    }

    public g0(w2.o oVar, InterfaceC6940g.a aVar, InterfaceC6932F interfaceC6932F, C6109x c6109x, long j10, Q2.k kVar, L.a aVar2, boolean z10, R2.a aVar3) {
        this.f11935a = oVar;
        this.f11936b = aVar;
        this.f11937c = interfaceC6932F;
        this.f11944j = c6109x;
        this.f11942h = j10;
        this.f11938d = kVar;
        this.f11939e = aVar2;
        this.f11945k = z10;
        this.f11940f = new n0(new q2.a0(c6109x));
        this.f11943i = aVar3 != null ? new Q2.m(aVar3) : new Q2.m("SingleSampleMediaPeriod");
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        if (this.f11946l || this.f11943i.j() || this.f11943i.i()) {
            return false;
        }
        InterfaceC6940g interfaceC6940gA = this.f11936b.a();
        InterfaceC6932F interfaceC6932F = this.f11937c;
        if (interfaceC6932F != null) {
            interfaceC6940gA.i(interfaceC6932F);
        }
        this.f11943i.n(new c(this.f11935a, interfaceC6940gA), this, this.f11938d.a(1));
        return true;
    }

    @Override // M2.C, M2.d0
    public long c() {
        return (this.f11946l || this.f11943i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void h(c cVar, long j10, long j11, boolean z10) {
        C6930D c6930d = cVar.f11954c;
        C1934y c1934y = new C1934y(cVar.f11952a, cVar.f11953b, c6930d.q(), c6930d.r(), j10, j11, c6930d.p());
        this.f11938d.d(cVar.f11952a);
        this.f11939e.m(c1934y, 1, -1, null, 0, null, 0L, this.f11942h);
    }

    @Override // M2.C, M2.d0
    public long f() {
        return this.f11946l ? Long.MIN_VALUE : 0L;
    }

    @Override // M2.C
    public long i(long j10) {
        for (int i10 = 0; i10 < this.f11941g.size(); i10++) {
            ((b) this.f11941g.get(i10)).c();
        }
        return j10;
    }

    @Override // M2.C
    public long k() {
        return -9223372036854775807L;
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        aVar.b(this);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(c cVar, long j10, long j11) {
        this.f11948n = (int) cVar.f11954c.p();
        this.f11947m = (byte[]) AbstractC6614a.e(cVar.f11955d);
        this.f11946l = true;
        C6930D c6930d = cVar.f11954c;
        C1934y c1934y = new C1934y(cVar.f11952a, cVar.f11953b, c6930d.q(), c6930d.r(), j10, j11, this.f11948n);
        this.f11938d.d(cVar.f11952a);
        this.f11939e.p(c1934y, 1, -1, this.f11944j, 0, null, 0L, this.f11942h);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public m.c n(c cVar, long j10, long j11, IOException iOException, int i10) {
        m.c cVarH;
        C6930D c6930d = cVar.f11954c;
        C1934y c1934y = new C1934y(cVar.f11952a, cVar.f11953b, c6930d.q(), c6930d.r(), j10, j11, c6930d.p());
        long jC = this.f11938d.c(new k.c(c1934y, new B(1, -1, this.f11944j, 0, null, 0L, t2.a0.F1(this.f11942h)), iOException, i10));
        boolean z10 = jC == -9223372036854775807L || i10 >= this.f11938d.a(1);
        if (this.f11945k && z10) {
            AbstractC6635w.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f11946l = true;
            cVarH = Q2.m.f14327f;
        } else {
            cVarH = jC != -9223372036854775807L ? Q2.m.h(false, jC) : Q2.m.f14328g;
        }
        m.c cVar2 = cVarH;
        boolean zC = cVar2.c();
        this.f11939e.r(c1934y, 1, -1, this.f11944j, 0, null, 0L, this.f11942h, iOException, !zC);
        if (!zC) {
            this.f11938d.d(cVar.f11952a);
        }
        return cVar2;
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        return this.f11943i.j();
    }

    @Override // M2.C
    public long r(P2.A[] aArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < aArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if (c0Var != null && (aArr[i10] == null || !zArr[i10])) {
                this.f11941g.remove(c0Var);
                c0VarArr[i10] = null;
            }
            if (c0VarArr[i10] == null && aArr[i10] != null) {
                b bVar = new b();
                this.f11941g.add(bVar);
                c0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // M2.C
    public n0 s() {
        return this.f11940f;
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void v(c cVar, long j10, long j11, int i10) {
        C6930D c6930d = cVar.f11954c;
        this.f11939e.v(i10 == 0 ? new C1934y(cVar.f11952a, cVar.f11953b, j10) : new C1934y(cVar.f11952a, cVar.f11953b, c6930d.q(), c6930d.r(), j10, j11, c6930d.p()), 1, -1, this.f11944j, 0, null, 0L, this.f11942h, i10);
    }

    public void w() {
        this.f11943i.l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f11952a = C1934y.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w2.o f11953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C6930D f11954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f11955d;

        public c(w2.o oVar, InterfaceC6940g interfaceC6940g) {
            this.f11953b = oVar;
            this.f11954c = new C6930D(interfaceC6940g);
        }

        @Override // Q2.m.e
        public void a() {
            this.f11954c.s();
            try {
                this.f11954c.a(this.f11953b);
                int i10 = 0;
                while (i10 != -1) {
                    int iP = (int) this.f11954c.p();
                    byte[] bArr = this.f11955d;
                    if (bArr == null) {
                        this.f11955d = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    } else if (iP == bArr.length) {
                        this.f11955d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C6930D c6930d = this.f11954c;
                    byte[] bArr2 = this.f11955d;
                    i10 = c6930d.read(bArr2, iP, bArr2.length - iP);
                }
                w2.n.a(this.f11954c);
            } catch (Throwable th2) {
                w2.n.a(this.f11954c);
                throw th2;
            }
        }

        @Override // Q2.m.e
        public void c() {
        }
    }

    @Override // M2.C
    public void o() {
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
    }

    @Override // M2.C
    public long d(long j10, A2.Q q10) {
        return j10;
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
    }
}
