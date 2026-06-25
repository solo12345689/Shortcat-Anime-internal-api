package androidx.media3.exoplayer;

import A2.C1006d;
import B2.C1078x0;
import B2.InterfaceC1024b;
import M2.D;
import U2.C2252m;
import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.C2888i;
import androidx.media3.exoplayer.C2890j;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import q2.C6088c;
import q2.C6109x;
import q2.InterfaceC6084P;
import t2.AbstractC6614a;
import t2.InterfaceC6623j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends InterfaceC6084P {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        long f30329A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        long f30330B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f30331C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        boolean f30332D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        A2.M f30333E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        boolean f30334F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        boolean f30335G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        String f30336H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        boolean f30337I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        g1 f30338J;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f30339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InterfaceC6623j f30340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f30341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        O9.t f30342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        O9.t f30343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        O9.t f30344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        O9.t f30345g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        O9.t f30346h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        O9.f f30347i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f30348j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f30349k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        C6088c f30350l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f30351m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f30352n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f30353o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f30354p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f30355q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f30356r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f30357s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f30358t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        A2.Q f30359u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        A2.P f30360v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f30361w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f30362x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f30363y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        A2.K f30364z;

        public b(final Context context) {
            this(context, new O9.t() { // from class: A2.z
                @Override // O9.t
                public final Object get() {
                    return ExoPlayer.b.a(context);
                }
            }, new O9.t() { // from class: A2.A
                @Override // O9.t
                public final Object get() {
                    return ExoPlayer.b.c(context);
                }
            });
        }

        public static /* synthetic */ A2.O a(Context context) {
            return new C1006d(context);
        }

        public static /* synthetic */ D.a b(Context context) {
            return new M2.r(context, new C2252m());
        }

        public static /* synthetic */ D.a c(Context context) {
            return new M2.r(context, new C2252m());
        }

        public static /* synthetic */ P2.G h(Context context) {
            return new P2.n(context);
        }

        public ExoPlayer i() {
            AbstractC6614a.g(!this.f30334F);
            this.f30334F = true;
            return new Y(this, null);
        }

        public b j(final InterfaceC2903p0 interfaceC2903p0) {
            AbstractC6614a.g(!this.f30334F);
            AbstractC6614a.e(interfaceC2903p0);
            this.f30345g = new O9.t() { // from class: A2.x
                @Override // O9.t
                public final Object get() {
                    return ExoPlayer.b.d(interfaceC2903p0);
                }
            };
            return this;
        }

        public b k(Looper looper) {
            AbstractC6614a.g(!this.f30334F);
            AbstractC6614a.e(looper);
            this.f30348j = looper;
            return this;
        }

        public b l(long j10) {
            AbstractC6614a.a(j10 > 0);
            AbstractC6614a.g(!this.f30334F);
            this.f30361w = j10;
            return this;
        }

        public b m(long j10) {
            AbstractC6614a.a(j10 > 0);
            AbstractC6614a.g(!this.f30334F);
            this.f30362x = j10;
            return this;
        }

        public b n(final P2.G g10) {
            AbstractC6614a.g(!this.f30334F);
            AbstractC6614a.e(g10);
            this.f30344f = new O9.t() { // from class: A2.y
                @Override // O9.t
                public final Object get() {
                    return ExoPlayer.b.f(g10);
                }
            };
            return this;
        }

        public b(final Context context, final A2.O o10) {
            this(context, new O9.t() { // from class: A2.B
                @Override // O9.t
                public final Object get() {
                    return ExoPlayer.b.g(o10);
                }
            }, new O9.t() { // from class: A2.C
                @Override // O9.t
                public final Object get() {
                    return ExoPlayer.b.b(context);
                }
            });
            AbstractC6614a.e(o10);
        }

        private b(final Context context, O9.t tVar, O9.t tVar2) {
            this(context, tVar, tVar2, new O9.t() { // from class: A2.D
                @Override // O9.t
                public final Object get() {
                    return ExoPlayer.b.h(context);
                }
            }, new O9.t() { // from class: A2.E
                @Override // O9.t
                public final Object get() {
                    return new C2890j();
                }
            }, new O9.t() { // from class: A2.F
                @Override // O9.t
                public final Object get() {
                    return Q2.i.n(context);
                }
            }, new O9.f() { // from class: A2.G
                @Override // O9.f
                public final Object apply(Object obj) {
                    return new C1078x0((InterfaceC6623j) obj);
                }
            });
        }

        private b(Context context, O9.t tVar, O9.t tVar2, O9.t tVar3, O9.t tVar4, O9.t tVar5, O9.f fVar) {
            this.f30339a = (Context) AbstractC6614a.e(context);
            this.f30342d = tVar;
            this.f30343e = tVar2;
            this.f30344f = tVar3;
            this.f30345g = tVar4;
            this.f30346h = tVar5;
            this.f30347i = fVar;
            this.f30348j = t2.a0.Z();
            this.f30350l = C6088c.f56745h;
            this.f30352n = 0;
            this.f30356r = 1;
            this.f30357s = 0;
            this.f30358t = true;
            this.f30359u = A2.Q.f170g;
            this.f30361w = HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;
            this.f30362x = 15000L;
            this.f30363y = 3000L;
            this.f30360v = A2.P.f150i;
            this.f30364z = new C2888i.b().a();
            this.f30340b = InterfaceC6623j.f60596a;
            this.f30329A = 500L;
            this.f30330B = 2000L;
            this.f30332D = true;
            this.f30336H = "";
            this.f30349k = -1000;
            this.f30338J = new C2894l();
        }

        public static /* synthetic */ InterfaceC2903p0 d(InterfaceC2903p0 interfaceC2903p0) {
            return interfaceC2903p0;
        }

        public static /* synthetic */ P2.G f(P2.G g10) {
            return g10;
        }

        public static /* synthetic */ A2.O g(A2.O o10) {
            return o10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f30365b = new c(-9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f30366a;

        public c(long j10) {
            this.f30366a = j10;
        }
    }

    void A(InterfaceC1024b interfaceC1024b);

    void S(M2.D d10);

    void a();

    void d(A2.Q q10);

    boolean isScrubbingModeEnabled();

    C6109x j();

    void n(A2.P p10);

    void o(InterfaceC1024b interfaceC1024b);

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z10);

    @Override // q2.InterfaceC6084P
    C2907s y();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void G(boolean z10);

        default void D(boolean z10) {
        }
    }
}
