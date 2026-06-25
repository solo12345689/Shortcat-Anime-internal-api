package S2;

import P9.AbstractC2011u;
import S2.L;
import S2.q;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import q2.C6097l;
import q2.C6109x;
import q2.InterfaceC6100o;
import q2.i0;
import q2.j0;
import q2.k0;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6611K;
import t2.InterfaceC6623j;
import t2.InterfaceC6631s;
import t2.N;
import t2.a0;
import t2.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements k0.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Executor f15780A = new Executor() { // from class: S2.o
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            q.a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0.a f15782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f15783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L f15785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L.b f15786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC6623j f15787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet f15788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private N f15789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C6109x f15790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i0 f15791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AbstractC2011u f15792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC6631s f15793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f15794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f15797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f15798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Pair f15799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f15800t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15801u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f15802v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f15803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f15804x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f15805y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f15806z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements L.b {
        a() {
        }

        @Override // S2.L.b
        public void a(long j10) {
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC6614a.i(null));
            throw null;
        }

        @Override // S2.L.b
        public void b() {
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC6614a.i(null));
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f15808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f15809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private k0.a f15810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f15811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InterfaceC6623j f15812e = InterfaceC6623j.f60596a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f15814g;

        public b(Context context, v vVar) {
            this.f15808a = context.getApplicationContext();
            this.f15809b = vVar;
        }

        public q f() {
            AbstractC6614a.g(!this.f15813f);
            if (this.f15810c == null) {
                this.f15810c = new f(this.f15814g);
            }
            q qVar = new q(this, null);
            this.f15813f = true;
            return qVar;
        }

        public b g(InterfaceC6623j interfaceC6623j) {
            this.f15812e = interfaceC6623j;
            return this;
        }

        public b h(boolean z10) {
            this.f15811d = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements L, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f15816b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C6109x f15818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f15819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f15820f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f15824j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f15825k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AbstractC2011u f15817c = AbstractC2011u.A();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f15821g = -9223372036854775807L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private L.a f15822h = L.a.f15661a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Executor f15823i = q.f15780A;

        public c(Context context, int i10) {
            this.f15816b = i10;
            this.f15815a = a0.i0(context);
        }

        private void b(C6109x c6109x) {
            c6109x.b().V(q.this.C(c6109x.f56995E)).P();
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC6614a.e(null));
            throw null;
        }

        @Override // S2.L
        public void A(L.a aVar, Executor executor) {
            this.f15822h = aVar;
            this.f15823i = executor;
        }

        @Override // S2.L
        public void a() {
            q.this.L();
        }

        @Override // S2.L
        public boolean d() {
            return e() && q.this.E();
        }

        @Override // S2.L
        public boolean e() {
            return this.f15825k;
        }

        @Override // S2.L
        public void g(long j10, long j11) {
            q.this.M(j10 + this.f15820f, j11);
        }

        @Override // S2.L
        public void h(long j10) {
            this.f15820f = j10;
        }

        @Override // S2.L
        public void i() {
            q.this.f15803w = this.f15821g;
            if (q.this.f15802v >= q.this.f15803w) {
                q.this.T();
            }
        }

        @Override // S2.L
        public void j(Surface surface, C6611K c6611k) {
            q.this.O(surface, c6611k);
        }

        @Override // S2.L
        public void k(List list) {
            if (this.f15817c.equals(list)) {
                return;
            }
            this.f15817c = AbstractC2011u.w(list);
            C6109x c6109x = this.f15818d;
            if (c6109x != null) {
                b(c6109x);
            }
        }

        @Override // S2.L
        public boolean l(boolean z10) {
            return q.this.G(z10 && e());
        }

        @Override // S2.L
        public void m() {
            if (e()) {
                long unused = q.this.f15802v;
                q.this.B(false);
                q.v(q.this);
                android.support.v4.media.session.b.a(AbstractC6614a.e(null));
                throw null;
            }
        }

        @Override // S2.L
        public void n() {
            if (q.this.f15789i.l() == 0) {
                q.this.z();
                return;
            }
            N n10 = new N();
            boolean z10 = true;
            while (q.this.f15789i.l() > 0) {
                g gVar = (g) AbstractC6614a.e((g) q.this.f15789i.i());
                if (z10) {
                    int i10 = gVar.f15831b;
                    if (i10 == 0 || i10 == 1) {
                        gVar = new g(gVar.f15830a, 0, gVar.f15832c);
                    } else {
                        q.this.z();
                    }
                    z10 = false;
                }
                n10.a(gVar.f15832c, gVar);
            }
            q.this.f15789i = n10;
        }

        @Override // S2.L
        public Surface o() {
            AbstractC6614a.g(e());
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC6614a.e(null));
            throw null;
        }

        @Override // S2.L
        public boolean p(C6109x c6109x) throws L.c {
            AbstractC6614a.g(!e());
            boolean zK = q.this.K(c6109x, this.f15816b);
            this.f15825k = zK;
            return zK;
        }

        @Override // S2.L
        public void q() {
            if (q.this.f15784d) {
                q.this.V();
            }
        }

        @Override // S2.L
        public void r() {
            if (q.this.f15784d) {
                q.this.U();
            }
        }

        @Override // S2.L
        public boolean s(long j10, L.b bVar) {
            AbstractC6614a.g(e());
            if (!q.this.S()) {
                return false;
            }
            q.v(q.this);
            android.support.v4.media.session.b.a(AbstractC6614a.e(null));
            throw null;
        }

        @Override // S2.L
        public void t(float f10) {
            if (this.f15816b == 0) {
                q.this.P(f10);
            }
        }

        @Override // S2.L
        public void u(int i10) {
            if (this.f15816b == 0) {
                q.this.N(i10);
            }
        }

        @Override // S2.L
        public void v() {
            q.this.A();
        }

        @Override // S2.L
        public void w(boolean z10) {
            if (e()) {
                q.v(q.this);
                android.support.v4.media.session.b.a(AbstractC6614a.e(null));
                throw null;
            }
            this.f15821g = -9223372036854775807L;
            q.this.B(z10);
            this.f15824j = false;
        }

        @Override // S2.L
        public void x(int i10, C6109x c6109x, long j10, int i11, List list) {
            AbstractC6614a.g(e());
            this.f15817c = AbstractC2011u.w(list);
            this.f15819e = i10;
            this.f15818d = c6109x;
            q.this.f15803w = -9223372036854775807L;
            q.this.f15804x = false;
            b(c6109x);
            boolean z10 = this.f15821g == -9223372036854775807L;
            if (q.this.f15784d || (this.f15816b == 0 && z10)) {
                long j11 = z10 ? -4611686018427387904L : this.f15821g + 1;
                q.this.f15789i.a(j11, new g(this.f15820f + j10, i11, j11));
            }
        }

        @Override // S2.L
        public void y(u uVar) {
            if (this.f15816b == 0) {
                q.this.R(uVar);
            }
        }

        @Override // S2.L
        public void z(boolean z10) {
            if (q.this.f15784d) {
                q.this.H(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e implements j0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final O9.t f15827b = O9.u.a(new O9.t() { // from class: S2.r
            @Override // O9.t
            public final Object get() {
                return q.e.a();
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f15828a;

        public e(boolean z10) {
            this.f15828a = z10;
        }

        public static /* synthetic */ Class a() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f implements k0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j0.b f15829a;

        public f(boolean z10) {
            this.f15829a = new e(z10);
        }

        @Override // q2.k0.a
        public k0 a(Context context, C6097l c6097l, InterfaceC6100o interfaceC6100o, k0.b bVar, Executor executor, long j10, boolean z10) {
            try {
                ((k0.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(j0.b.class).newInstance(this.f15829a)).a(context, c6097l, interfaceC6100o, bVar, executor, j10, z10);
                return null;
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f15832c;

        public g(long j10, int i10, long j11) {
            this.f15830a = j10;
            this.f15831b = i10;
            this.f15832c = j11;
        }
    }

    /* synthetic */ q(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z10) {
        if (F()) {
            this.f15800t++;
            this.f15785e.w(z10);
            while (this.f15789i.l() > 1) {
                this.f15789i.i();
            }
            if (this.f15789i.l() == 1) {
                g gVar = (g) AbstractC6614a.e((g) this.f15789i.i());
                this.f15797q = gVar.f15830a;
                this.f15798r = gVar.f15831b;
                J();
            }
            this.f15802v = -9223372036854775807L;
            this.f15803w = -9223372036854775807L;
            this.f15804x = false;
            ((InterfaceC6631s) AbstractC6614a.i(this.f15793m)).i(new Runnable() { // from class: S2.n
                @Override // java.lang.Runnable
                public final void run() {
                    q.b(this.f15778a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6097l C(C6097l c6097l) {
        return (c6097l == null || !c6097l.h() || this.f15796p) ? C6097l.f56898h : c6097l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E() {
        return this.f15800t == 0 && this.f15804x && this.f15785e.d();
    }

    private boolean F() {
        return this.f15801u == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G(boolean z10) {
        return this.f15785e.l(z10 && this.f15800t == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(boolean z10) {
        this.f15785e.z(z10);
    }

    private void J() {
        this.f15785e.x(1, this.f15790j, this.f15797q, this.f15798r, AbstractC2011u.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K(C6109x c6109x, int i10) throws L.c {
        if (i10 != 0) {
            if (!F()) {
                return false;
            }
            android.support.v4.media.session.b.a(AbstractC6614a.e(null));
            throw null;
        }
        AbstractC6614a.g(this.f15801u == 0);
        C6097l c6097lC = C(c6109x.f56995E);
        try {
            if (this.f15795o) {
                c6097lC = C6097l.f56898h;
            } else if (c6097lC.f56908c == 7 && Build.VERSION.SDK_INT < 34 && t2.r.j()) {
                c6097lC = c6097lC.a().e(6).a();
            } else if (!t2.r.k(c6097lC.f56908c) && Build.VERSION.SDK_INT >= 29) {
                AbstractC6635w.i("PlaybackVidGraphWrapper", a0.I("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(c6097lC.f56908c)));
                c6097lC = C6097l.f56898h;
            }
            C6097l c6097l = c6097lC;
            final InterfaceC6631s interfaceC6631sE = this.f15787g.e((Looper) AbstractC6614a.i(Looper.myLooper()), null);
            this.f15793m = interfaceC6631sE;
            k0.a aVar = this.f15782b;
            Context context = this.f15781a;
            InterfaceC6100o interfaceC6100o = InterfaceC6100o.f56927a;
            Objects.requireNonNull(interfaceC6631sE);
            aVar.a(context, c6097l, interfaceC6100o, this, new Executor() { // from class: S2.p
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC6631sE.i(runnable);
                }
            }, 0L, false);
            throw null;
        } catch (r.a e10) {
            throw new L.c(e10, c6109x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j10, long j11) {
        this.f15785e.g(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i10) {
        this.f15785e.u(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(float f10) {
        this.f15785e.t(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(u uVar) {
        this.f15794n = uVar;
        this.f15785e.y(uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S() {
        int i10 = this.f15805y;
        return i10 != -1 && i10 == this.f15806z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.f15785e.i();
        this.f15804x = true;
    }

    public static /* synthetic */ void b(q qVar) {
        qVar.f15800t--;
    }

    static /* synthetic */ k0 v(q qVar) {
        qVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        this.f15785e.n();
    }

    public void A() {
        C6611K c6611k = C6611K.f60536c;
        I(null, c6611k.b(), c6611k.a());
        this.f15799s = null;
    }

    public L D(int i10) {
        if (a0.t(this.f15783c, i10)) {
            return (L) this.f15783c.get(i10);
        }
        c cVar = new c(this.f15781a, i10);
        if (i10 == 0) {
            y(cVar);
        }
        this.f15783c.put(i10, cVar);
        return cVar;
    }

    public void L() {
        if (this.f15801u == 2) {
            return;
        }
        InterfaceC6631s interfaceC6631s = this.f15793m;
        if (interfaceC6631s != null) {
            interfaceC6631s.f(null);
        }
        this.f15799s = null;
        this.f15801u = 2;
    }

    public void O(Surface surface, C6611K c6611k) {
        Pair pair = this.f15799s;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C6611K) this.f15799s.second).equals(c6611k)) {
            return;
        }
        this.f15799s = Pair.create(surface, c6611k);
        I(surface, c6611k.b(), c6611k.a());
    }

    public void Q(int i10) {
        this.f15805y = i10;
    }

    public void U() {
        this.f15785e.r();
    }

    public void V() {
        this.f15785e.q();
    }

    public void y(d dVar) {
        this.f15788h.add(dVar);
    }

    private q(b bVar) {
        this.f15781a = bVar.f15808a;
        this.f15789i = new N();
        this.f15782b = (k0.a) AbstractC6614a.i(bVar.f15810c);
        this.f15783c = new SparseArray();
        this.f15792l = AbstractC2011u.A();
        this.f15791k = i0.f56889a;
        this.f15784d = bVar.f15811d;
        InterfaceC6623j interfaceC6623j = bVar.f15812e;
        this.f15787g = interfaceC6623j;
        this.f15785e = new C2129e(bVar.f15809b, interfaceC6623j);
        this.f15786f = new a();
        this.f15788h = new CopyOnWriteArraySet();
        this.f15790j = new C6109x.b().P();
        this.f15797q = -9223372036854775807L;
        this.f15802v = -9223372036854775807L;
        this.f15803w = -9223372036854775807L;
        this.f15805y = -1;
        this.f15801u = 0;
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    private void I(Surface surface, int i10, int i11) {
    }
}
