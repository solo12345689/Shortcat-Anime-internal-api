package androidx.media3.exoplayer;

import A2.C1004b;
import A2.C1005c;
import B2.G1;
import B2.InterfaceC1021a;
import B2.InterfaceC1024b;
import B2.K1;
import C2.InterfaceC1176y;
import C2.InterfaceC1177z;
import M2.D;
import M2.e0;
import P9.AbstractC2011u;
import P9.AbstractC2013w;
import T2.l;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.C2878d;
import androidx.media3.exoplayer.C2901o0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.J0;
import androidx.media3.exoplayer.L0;
import androidx.media3.exoplayer.Y;
import androidx.media3.exoplayer.e1;
import androidx.media3.exoplayer.g1;
import androidx.media3.exoplayer.image.ImageOutput;
import com.adjust.sdk.network.ErrorCodes;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import q2.AbstractC6076H;
import q2.AbstractC6093h;
import q2.C6071C;
import q2.C6077I;
import q2.C6078J;
import q2.C6083O;
import q2.C6088c;
import q2.C6101p;
import q2.C6105t;
import q2.C6109x;
import q2.InterfaceC6084P;
import q2.Y;
import q2.d0;
import s2.C6407e;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6611K;
import t2.C6620g;
import t2.C6626m;
import t2.C6634v;
import t2.InterfaceC6623j;
import t2.InterfaceC6631s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class Y extends AbstractC6093h implements ExoPlayer {

    /* JADX INFO: renamed from: A */
    private final d f30486A;

    /* JADX INFO: renamed from: B */
    private final C2878d f30487B;

    /* JADX INFO: renamed from: C */
    private final e1 f30488C;

    /* JADX INFO: renamed from: D */
    private final j1 f30489D;

    /* JADX INFO: renamed from: E */
    private final m1 f30490E;

    /* JADX INFO: renamed from: F */
    private final long f30491F;

    /* JADX INFO: renamed from: G */
    private final g1 f30492G;

    /* JADX INFO: renamed from: H */
    private final C6620g f30493H;

    /* JADX INFO: renamed from: I */
    private int f30494I;

    /* JADX INFO: renamed from: J */
    private boolean f30495J;

    /* JADX INFO: renamed from: K */
    private int f30496K;

    /* JADX INFO: renamed from: L */
    private int f30497L;

    /* JADX INFO: renamed from: M */
    private boolean f30498M;

    /* JADX INFO: renamed from: N */
    private boolean f30499N;

    /* JADX INFO: renamed from: O */
    private AbstractC2013w f30500O;

    /* JADX INFO: renamed from: P */
    private A2.P f30501P;

    /* JADX INFO: renamed from: Q */
    private A2.Q f30502Q;

    /* JADX INFO: renamed from: R */
    private M2.e0 f30503R;

    /* JADX INFO: renamed from: S */
    private ExoPlayer.c f30504S;

    /* JADX INFO: renamed from: T */
    private boolean f30505T;

    /* JADX INFO: renamed from: U */
    private InterfaceC6084P.b f30506U;

    /* JADX INFO: renamed from: V */
    private C6077I f30507V;

    /* JADX INFO: renamed from: W */
    private C6077I f30508W;

    /* JADX INFO: renamed from: X */
    private C6109x f30509X;

    /* JADX INFO: renamed from: Y */
    private C6109x f30510Y;

    /* JADX INFO: renamed from: Z */
    private Object f30511Z;

    /* JADX INFO: renamed from: a0 */
    private Surface f30512a0;

    /* JADX INFO: renamed from: b */
    final P2.H f30513b;

    /* JADX INFO: renamed from: b0 */
    private SurfaceHolder f30514b0;

    /* JADX INFO: renamed from: c */
    final InterfaceC6084P.b f30515c;

    /* JADX INFO: renamed from: c0 */
    private T2.l f30516c0;

    /* JADX INFO: renamed from: d */
    private final C6626m f30517d = new C6626m();

    /* JADX INFO: renamed from: d0 */
    private boolean f30518d0;

    /* JADX INFO: renamed from: e */
    private final Context f30519e;

    /* JADX INFO: renamed from: e0 */
    private TextureView f30520e0;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6084P f30521f;

    /* JADX INFO: renamed from: f0 */
    private int f30522f0;

    /* JADX INFO: renamed from: g */
    private final N0[] f30523g;

    /* JADX INFO: renamed from: g0 */
    private int f30524g0;

    /* JADX INFO: renamed from: h */
    private final N0[] f30525h;

    /* JADX INFO: renamed from: h0 */
    private C6611K f30526h0;

    /* JADX INFO: renamed from: i */
    private final P2.G f30527i;

    /* JADX INFO: renamed from: i0 */
    private C1004b f30528i0;

    /* JADX INFO: renamed from: j */
    private final InterfaceC6631s f30529j;

    /* JADX INFO: renamed from: j0 */
    private C1004b f30530j0;

    /* JADX INFO: renamed from: k */
    private final C2901o0.f f30531k;

    /* JADX INFO: renamed from: k0 */
    private C6088c f30532k0;

    /* JADX INFO: renamed from: l */
    private final C2901o0 f30533l;

    /* JADX INFO: renamed from: l0 */
    private float f30534l0;

    /* JADX INFO: renamed from: m */
    private final C6634v f30535m;

    /* JADX INFO: renamed from: m0 */
    private boolean f30536m0;

    /* JADX INFO: renamed from: n */
    private final CopyOnWriteArraySet f30537n;

    /* JADX INFO: renamed from: n0 */
    private C6407e f30538n0;

    /* JADX INFO: renamed from: o */
    private final Y.b f30539o;

    /* JADX INFO: renamed from: o0 */
    private boolean f30540o0;

    /* JADX INFO: renamed from: p */
    private final List f30541p;

    /* JADX INFO: renamed from: p0 */
    private boolean f30542p0;

    /* JADX INFO: renamed from: q */
    private final boolean f30543q;

    /* JADX INFO: renamed from: q0 */
    private int f30544q0;

    /* JADX INFO: renamed from: r */
    private final D.a f30545r;

    /* JADX INFO: renamed from: r0 */
    private boolean f30546r0;

    /* JADX INFO: renamed from: s */
    private final InterfaceC1021a f30547s;

    /* JADX INFO: renamed from: s0 */
    private boolean f30548s0;

    /* JADX INFO: renamed from: t */
    private final Looper f30549t;

    /* JADX INFO: renamed from: t0 */
    private C6101p f30550t0;

    /* JADX INFO: renamed from: u */
    private final Q2.d f30551u;

    /* JADX INFO: renamed from: u0 */
    private q2.l0 f30552u0;

    /* JADX INFO: renamed from: v */
    private final long f30553v;

    /* JADX INFO: renamed from: v0 */
    private C6077I f30554v0;

    /* JADX INFO: renamed from: w */
    private final long f30555w;

    /* JADX INFO: renamed from: w0 */
    private K0 f30556w0;

    /* JADX INFO: renamed from: x */
    private final long f30557x;

    /* JADX INFO: renamed from: x0 */
    private int f30558x0;

    /* JADX INFO: renamed from: y */
    private final InterfaceC6623j f30559y;

    /* JADX INFO: renamed from: y0 */
    private int f30560y0;

    /* JADX INFO: renamed from: z */
    private final c f30561z;

    /* JADX INFO: renamed from: z0 */
    private long f30562z0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {
        public static /* synthetic */ void a(Context context, boolean z10, Y y10, K1 k12) {
            G1 g1J0 = G1.J0(context);
            if (g1J0 == null) {
                AbstractC6635w.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z10) {
                y10.A(g1J0);
            }
            k12.b(g1J0.Q0());
        }

        public static void b(final Context context, final Y y10, final boolean z10, final K1 k12) {
            y10.F2().e(y10.K2(), null).i(new Runnable() { // from class: androidx.media3.exoplayer.Z
                @Override // java.lang.Runnable
                public final void run() {
                    Y.b.a(context, z10, y10, k12);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c implements S2.K, InterfaceC1176y, O2.h, K2.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, C2878d.b, e1.b, ExoPlayer.a {
        private c() {
        }

        @Override // C2.InterfaceC1176y
        public void A(int i10, long j10, long j11) {
            Y.this.f30547s.A(i10, j10, j11);
        }

        @Override // S2.K
        public void B(long j10, int i10) {
            Y.this.f30547s.B(j10, i10);
        }

        @Override // T2.l.b
        public void C(Surface surface) {
            Y.this.j3(null);
        }

        @Override // T2.l.b
        public void E(Surface surface) {
            Y.this.j3(surface);
        }

        @Override // androidx.media3.exoplayer.e1.b
        public void F(final int i10, final boolean z10) {
            Y.this.f30535m.k(30, new C6634v.a() { // from class: androidx.media3.exoplayer.h0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).P(i10, z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public void G(boolean z10) {
            Y.this.r3();
        }

        @Override // androidx.media3.exoplayer.e1.b
        public void a(int i10) {
            final C6101p c6101pA2 = Y.A2(Y.this.f30488C);
            if (c6101pA2.equals(Y.this.f30550t0)) {
                return;
            }
            Y.this.f30550t0 = c6101pA2;
            Y.this.f30535m.k(29, new C6634v.a() { // from class: androidx.media3.exoplayer.g0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).n0(c6101pA2);
                }
            });
        }

        @Override // S2.K
        public void b(final q2.l0 l0Var) {
            Y.this.f30552u0 = l0Var;
            Y.this.f30535m.k(25, new C6634v.a() { // from class: androidx.media3.exoplayer.f0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).b(l0Var);
                }
            });
        }

        @Override // C2.InterfaceC1176y
        public void c(InterfaceC1177z.a aVar) {
            Y.this.f30547s.c(aVar);
        }

        @Override // C2.InterfaceC1176y
        public void d(final int i10) {
            Y.this.f30493H.h(new O9.f() { // from class: androidx.media3.exoplayer.j0
                @Override // O9.f
                public final Object apply(Object obj) {
                    return Integer.valueOf(i10);
                }
            }, new O9.f() { // from class: androidx.media3.exoplayer.b0
                @Override // O9.f
                public final Object apply(Object obj) {
                    return Integer.valueOf(i10);
                }
            });
        }

        @Override // C2.InterfaceC1176y
        public void e(InterfaceC1177z.a aVar) {
            Y.this.f30547s.e(aVar);
        }

        @Override // C2.InterfaceC1176y
        public void f(final boolean z10) {
            if (Y.this.f30536m0 == z10) {
                return;
            }
            Y.this.f30536m0 = z10;
            Y.this.f30535m.k(23, new C6634v.a() { // from class: androidx.media3.exoplayer.i0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).f(z10);
                }
            });
        }

        @Override // C2.InterfaceC1176y
        public void g(Exception exc) {
            Y.this.f30547s.g(exc);
        }

        @Override // S2.K
        public void h(String str) {
            Y.this.f30547s.h(str);
        }

        @Override // S2.K
        public void i(String str, long j10, long j11) {
            Y.this.f30547s.i(str, j10, j11);
        }

        @Override // C2.InterfaceC1176y
        public void j(String str) {
            Y.this.f30547s.j(str);
        }

        @Override // C2.InterfaceC1176y
        public void k(String str, long j10, long j11) {
            Y.this.f30547s.k(str, j10, j11);
        }

        @Override // C2.InterfaceC1176y
        public void l(C6109x c6109x, C1005c c1005c) {
            Y.this.f30510Y = c6109x;
            Y.this.f30547s.l(c6109x, c1005c);
        }

        @Override // S2.K
        public void m(C6109x c6109x, C1005c c1005c) {
            Y.this.f30509X = c6109x;
            Y.this.f30547s.m(c6109x, c1005c);
        }

        @Override // androidx.media3.exoplayer.C2878d.b
        public void n() {
            Y.this.o3(false, 3);
        }

        @Override // S2.K
        public void o(C1004b c1004b) {
            Y.this.f30547s.o(c1004b);
            Y.this.f30509X = null;
            Y.this.f30528i0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            Y.this.i3(surfaceTexture);
            Y.this.T2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Y.this.j3(null);
            Y.this.T2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            Y.this.T2(i10, i11);
        }

        @Override // O2.h
        public void p(final List list) {
            Y.this.f30535m.k(27, new C6634v.a() { // from class: androidx.media3.exoplayer.e0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).p(list);
                }
            });
        }

        @Override // C2.InterfaceC1176y
        public void q(long j10) {
            Y.this.f30547s.q(j10);
        }

        @Override // S2.K
        public void r(Exception exc) {
            Y.this.f30547s.r(exc);
        }

        @Override // S2.K
        public void s(C1004b c1004b) {
            Y.this.f30528i0 = c1004b;
            Y.this.f30547s.s(c1004b);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            Y.this.T2(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (Y.this.f30518d0) {
                Y.this.j3(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (Y.this.f30518d0) {
                Y.this.j3(null);
            }
            Y.this.T2(0, 0);
        }

        @Override // O2.h
        public void t(final C6407e c6407e) {
            Y.this.f30538n0 = c6407e;
            Y.this.f30535m.k(27, new C6634v.a() { // from class: androidx.media3.exoplayer.a0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).t(c6407e);
                }
            });
        }

        @Override // C2.InterfaceC1176y
        public void u(C1004b c1004b) {
            Y.this.f30530j0 = c1004b;
            Y.this.f30547s.u(c1004b);
        }

        @Override // S2.K
        public void v(int i10, long j10) {
            Y.this.f30547s.v(i10, j10);
        }

        @Override // C2.InterfaceC1176y
        public void w(C1004b c1004b) {
            Y.this.f30547s.w(c1004b);
            Y.this.f30510Y = null;
            Y.this.f30530j0 = null;
        }

        @Override // S2.K
        public void x(Object obj, long j10) {
            Y.this.f30547s.x(obj, j10);
            if (Y.this.f30511Z == obj) {
                Y.this.f30535m.k(26, new A2.H());
            }
        }

        @Override // C2.InterfaceC1176y
        public void y(Exception exc) {
            Y.this.f30547s.y(exc);
        }

        @Override // K2.b
        public void z(final C6078J c6078j) {
            Y y10 = Y.this;
            y10.f30554v0 = y10.f30554v0.a().N(c6078j).J();
            C6077I c6077iV2 = Y.this.v2();
            if (!c6077iV2.equals(Y.this.f30507V)) {
                Y.this.f30507V = c6077iV2;
                Y.this.f30535m.h(14, new C6634v.a() { // from class: androidx.media3.exoplayer.c0
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).V(Y.this.f30507V);
                    }
                });
            }
            Y.this.f30535m.h(28, new C6634v.a() { // from class: androidx.media3.exoplayer.d0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).z(c6078j);
                }
            });
            Y.this.f30535m.f();
        }

        /* synthetic */ c(Y y10, a aVar) {
            this();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements S2.u, T2.a, L0.b {

        /* JADX INFO: renamed from: a */
        private S2.u f30564a;

        /* JADX INFO: renamed from: b */
        private T2.a f30565b;

        /* JADX INFO: renamed from: c */
        private S2.u f30566c;

        /* JADX INFO: renamed from: d */
        private T2.a f30567d;

        private d() {
        }

        @Override // T2.a
        public void b(long j10, float[] fArr) {
            T2.a aVar = this.f30567d;
            if (aVar != null) {
                aVar.b(j10, fArr);
            }
            T2.a aVar2 = this.f30565b;
            if (aVar2 != null) {
                aVar2.b(j10, fArr);
            }
        }

        @Override // T2.a
        public void c() {
            T2.a aVar = this.f30567d;
            if (aVar != null) {
                aVar.c();
            }
            T2.a aVar2 = this.f30565b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // S2.u
        public void h(long j10, long j11, C6109x c6109x, MediaFormat mediaFormat) {
            long j12;
            long j13;
            C6109x c6109x2;
            MediaFormat mediaFormat2;
            S2.u uVar = this.f30566c;
            if (uVar != null) {
                uVar.h(j10, j11, c6109x, mediaFormat);
                mediaFormat2 = mediaFormat;
                c6109x2 = c6109x;
                j13 = j11;
                j12 = j10;
            } else {
                j12 = j10;
                j13 = j11;
                c6109x2 = c6109x;
                mediaFormat2 = mediaFormat;
            }
            S2.u uVar2 = this.f30564a;
            if (uVar2 != null) {
                uVar2.h(j12, j13, c6109x2, mediaFormat2);
            }
        }

        @Override // androidx.media3.exoplayer.L0.b
        public void v(int i10, Object obj) {
            if (i10 == 7) {
                this.f30564a = (S2.u) obj;
                return;
            }
            if (i10 == 8) {
                this.f30565b = (T2.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            T2.l lVar = (T2.l) obj;
            if (lVar == null) {
                this.f30566c = null;
                this.f30567d = null;
            } else {
                this.f30566c = lVar.getVideoFrameMetadataListener();
                this.f30567d = lVar.getCameraMotionListener();
            }
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e implements InterfaceC2914v0 {

        /* JADX INFO: renamed from: a */
        private final Object f30568a;

        /* JADX INFO: renamed from: b */
        private final M2.D f30569b;

        /* JADX INFO: renamed from: c */
        private q2.Y f30570c;

        public e(Object obj, M2.A a10) {
            this.f30568a = obj;
            this.f30569b = a10;
            this.f30570c = a10.W();
        }

        @Override // androidx.media3.exoplayer.InterfaceC2914v0
        public q2.Y a() {
            return this.f30570c;
        }

        public void c(q2.Y y10) {
            this.f30570c = y10;
        }

        @Override // androidx.media3.exoplayer.InterfaceC2914v0
        public Object s() {
            return this.f30568a;
        }
    }

    static {
        AbstractC6076H.a("media3.exoplayer");
    }

    public Y(ExoPlayer.b bVar, InterfaceC6084P interfaceC6084P) {
        Looper looper;
        InterfaceC6623j interfaceC6623j;
        try {
            AbstractC6635w.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + t2.a0.f60566e + "]");
            this.f30519e = bVar.f30339a.getApplicationContext();
            this.f30547s = (InterfaceC1021a) bVar.f30347i.apply(bVar.f30340b);
            this.f30544q0 = bVar.f30349k;
            this.f30532k0 = bVar.f30350l;
            this.f30522f0 = bVar.f30356r;
            this.f30524g0 = bVar.f30357s;
            this.f30536m0 = bVar.f30354p;
            this.f30491F = bVar.f30330B;
            c cVar = new c();
            this.f30561z = cVar;
            this.f30486A = new d();
            Handler handler = new Handler(bVar.f30348j);
            A2.O o10 = (A2.O) bVar.f30342d.get();
            N0[] n0ArrB = o10.b(handler, cVar, cVar, cVar, cVar);
            this.f30523g = n0ArrB;
            AbstractC6614a.g(n0ArrB.length > 0);
            this.f30525h = new N0[n0ArrB.length];
            int i10 = 0;
            while (true) {
                N0[] n0Arr = this.f30525h;
                if (i10 >= n0Arr.length) {
                    break;
                }
                N0 n02 = this.f30523g[i10];
                c cVar2 = this.f30561z;
                A2.O o11 = o10;
                n0Arr[i10] = o11.a(n02, handler, cVar2, cVar2, cVar2, cVar2);
                i10++;
                o10 = o11;
            }
            P2.G g10 = (P2.G) bVar.f30344f.get();
            this.f30527i = g10;
            this.f30545r = (D.a) bVar.f30343e.get();
            Q2.d dVar = (Q2.d) bVar.f30346h.get();
            this.f30551u = dVar;
            this.f30543q = bVar.f30358t;
            this.f30502Q = bVar.f30359u;
            this.f30553v = bVar.f30361w;
            this.f30555w = bVar.f30362x;
            this.f30557x = bVar.f30363y;
            this.f30501P = bVar.f30360v;
            this.f30505T = bVar.f30331C;
            Looper looper2 = bVar.f30348j;
            this.f30549t = looper2;
            InterfaceC6623j interfaceC6623j2 = bVar.f30340b;
            this.f30559y = interfaceC6623j2;
            InterfaceC6084P interfaceC6084P2 = interfaceC6084P == null ? this : interfaceC6084P;
            this.f30521f = interfaceC6084P2;
            this.f30535m = new C6634v(looper2, interfaceC6623j2, new C6634v.b() { // from class: androidx.media3.exoplayer.D
                @Override // t2.C6634v.b
                public final void a(Object obj, C6105t c6105t) {
                    ((InterfaceC6084P.d) obj).X(this.f30321a.f30521f, new InterfaceC6084P.c(c6105t));
                }
            });
            this.f30537n = new CopyOnWriteArraySet();
            this.f30541p = new ArrayList();
            this.f30503R = new e0.a(0);
            this.f30504S = ExoPlayer.c.f30365b;
            N0[] n0Arr2 = this.f30523g;
            P2.H h10 = new P2.H(new A2.N[n0Arr2.length], new P2.A[n0Arr2.length], q2.h0.f56877b, null);
            this.f30513b = h10;
            this.f30539o = new Y.b();
            InterfaceC6084P.b bVarF = new InterfaceC6084P.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).e(29, g10.h()).e(23, bVar.f30355q).e(25, bVar.f30355q).e(33, bVar.f30355q).e(26, bVar.f30355q).e(34, bVar.f30355q).f();
            this.f30515c = bVarF;
            this.f30506U = new InterfaceC6084P.b.a().b(bVarF).a(4).a(10).f();
            this.f30529j = interfaceC6623j2.e(looper2, null);
            C2901o0.f fVar = new C2901o0.f() { // from class: androidx.media3.exoplayer.F
                @Override // androidx.media3.exoplayer.C2901o0.f
                public final void a(C2901o0.e eVar) {
                    Y y10 = this.f30367a;
                    y10.f30529j.i(new Runnable() { // from class: androidx.media3.exoplayer.K
                        @Override // java.lang.Runnable
                        public final void run() {
                            y10.O2(eVar);
                        }
                    });
                }
            };
            this.f30531k = fVar;
            this.f30556w0 = K0.k(h10);
            this.f30547s.p0(interfaceC6084P2, looper2);
            K1 k12 = new K1(bVar.f30336H);
            C2901o0 c2901o0 = new C2901o0(this.f30519e, this.f30523g, this.f30525h, g10, h10, (InterfaceC2903p0) bVar.f30345g.get(), dVar, this.f30494I, this.f30495J, this.f30547s, this.f30502Q, bVar.f30364z, bVar.f30329A, this.f30505T, bVar.f30337I, looper2, interfaceC6623j2, fVar, k12, bVar.f30333E, this.f30504S, this.f30486A);
            this.f30533l = c2901o0;
            Looper looperQ = c2901o0.Q();
            this.f30534l0 = 1.0f;
            this.f30494I = 0;
            C6077I c6077i = C6077I.f56472K;
            this.f30507V = c6077i;
            this.f30508W = c6077i;
            this.f30554v0 = c6077i;
            this.f30558x0 = -1;
            this.f30538n0 = C6407e.f59083d;
            this.f30540o0 = true;
            a0(this.f30547s);
            dVar.i(new Handler(looper2), this.f30547s);
            q2(this.f30561z);
            long j10 = bVar.f30341c;
            if (j10 > 0) {
                c2901o0.J(j10);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.b(this.f30519e, this, bVar.f30332D, k12);
            }
            C6620g c6620g = new C6620g(0, looperQ, looper2, interfaceC6623j2, new C6620g.a() { // from class: androidx.media3.exoplayer.G
                @Override // t2.C6620g.a
                public final void a(Object obj, Object obj2) {
                    this.f30371a.V2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.f30493H = c6620g;
            c6620g.e(new Runnable() { // from class: androidx.media3.exoplayer.H
                @Override // java.lang.Runnable
                public final void run() {
                    Y y10 = this.f30377a;
                    y10.f30493H.g(Integer.valueOf(t2.a0.L(y10.f30519e)));
                }
            });
            C2878d c2878d = new C2878d(bVar.f30339a, looperQ, bVar.f30348j, this.f30561z, interfaceC6623j2);
            InterfaceC6623j interfaceC6623j3 = interfaceC6623j2;
            this.f30487B = c2878d;
            c2878d.d(bVar.f30353o);
            if (bVar.f30335G) {
                g1 g1Var = bVar.f30338J;
                this.f30492G = g1Var;
                g1Var.a(new g1.a() { // from class: androidx.media3.exoplayer.I
                    @Override // androidx.media3.exoplayer.g1.a
                    public final void a(boolean z10) {
                        this.f30384a.W2(z10);
                    }
                }, this.f30519e, looper2, looperQ, interfaceC6623j3);
                interfaceC6623j3 = interfaceC6623j3;
            } else {
                this.f30492G = null;
            }
            if (bVar.f30355q) {
                InterfaceC6623j interfaceC6623j4 = interfaceC6623j3;
                e1 e1Var = new e1(bVar.f30339a, this.f30561z, this.f30532k0.c(), looperQ, looper2, interfaceC6623j4);
                looper = looperQ;
                interfaceC6623j = interfaceC6623j4;
                this.f30488C = e1Var;
            } else {
                looper = looperQ;
                interfaceC6623j = interfaceC6623j3;
                this.f30488C = null;
            }
            j1 j1Var = new j1(bVar.f30339a, looper, interfaceC6623j);
            this.f30489D = j1Var;
            j1Var.c(bVar.f30352n != 0);
            m1 m1Var = new m1(bVar.f30339a, looper, interfaceC6623j);
            this.f30490E = m1Var;
            m1Var.c(bVar.f30352n == 2);
            this.f30550t0 = C6101p.f56928e;
            this.f30552u0 = q2.l0.f56919e;
            this.f30526h0 = C6611K.f60536c;
            c2901o0.C1(this.f30501P);
            c2901o0.l1(this.f30532k0, bVar.f30351m);
            b3(1, 3, this.f30532k0);
            b3(2, 4, Integer.valueOf(this.f30522f0));
            b3(2, 5, Integer.valueOf(this.f30524g0));
            b3(1, 9, Boolean.valueOf(this.f30536m0));
            b3(6, 8, this.f30486A);
            c3(16, Integer.valueOf(this.f30544q0));
            this.f30517d.f();
        } catch (Throwable th2) {
            this.f30517d.f();
            throw th2;
        }
    }

    public static C6101p A2(e1 e1Var) {
        return new C6101p.b(0).g(e1Var != null ? e1Var.u() : 0).f(e1Var != null ? e1Var.t() : 0).e();
    }

    private q2.Y B2() {
        return new M0(this.f30541p, this.f30503R);
    }

    private List C2(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f30545r.e((C6071C) list.get(i10)));
        }
        return arrayList;
    }

    private L0 D2(L0.b bVar) {
        int iI2 = I2(this.f30556w0);
        C2901o0 c2901o0 = this.f30533l;
        q2.Y y10 = this.f30556w0.f30413a;
        if (iI2 == -1) {
            iI2 = 0;
        }
        return new L0(c2901o0, bVar, y10, iI2, this.f30559y, c2901o0.Q());
    }

    private Pair E2(K0 k02, K0 k03, boolean z10, int i10, boolean z11, boolean z12) {
        q2.Y y10 = k03.f30413a;
        q2.Y y11 = k02.f30413a;
        if (y11.u() && y10.u()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (y11.u() != y10.u()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (y10.r(y10.l(k03.f30414b.f11662a, this.f30539o).f56653c, this.f56876a).f56678a.equals(y11.r(y11.l(k02.f30414b.f11662a, this.f30539o).f56653c, this.f56876a).f56678a)) {
            return (z10 && i10 == 0 && k03.f30414b.f11665d < k02.f30414b.f11665d) ? new Pair(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i11));
    }

    private long G2(K0 k02) {
        if (!k02.f30414b.b()) {
            return t2.a0.F1(H2(k02));
        }
        k02.f30413a.l(k02.f30414b.f11662a, this.f30539o);
        return k02.f30415c == -9223372036854775807L ? k02.f30413a.r(I2(k02), this.f56876a).c() : this.f30539o.n() + t2.a0.F1(k02.f30415c);
    }

    private long H2(K0 k02) {
        if (k02.f30413a.u()) {
            return t2.a0.V0(this.f30562z0);
        }
        long jM = k02.f30428p ? k02.m() : k02.f30431s;
        return k02.f30414b.b() ? jM : X2(k02.f30413a, k02.f30414b, jM);
    }

    public static /* synthetic */ void I1(int i10, InterfaceC6084P.e eVar, InterfaceC6084P.e eVar2, InterfaceC6084P.d dVar) {
        dVar.Y(i10);
        dVar.m0(eVar, eVar2, i10);
    }

    private int I2(K0 k02) {
        return k02.f30413a.u() ? this.f30558x0 : k02.f30413a.l(k02.f30414b.f11662a, this.f30539o).f56653c;
    }

    private Pair J2(q2.Y y10, q2.Y y11, int i10, long j10) {
        if (y10.u() || y11.u()) {
            boolean z10 = !y10.u() && y11.u();
            return S2(y11, z10 ? -1 : i10, z10 ? -9223372036854775807L : j10);
        }
        Pair pairN = y10.n(this.f56876a, this.f30539o, i10, t2.a0.V0(j10));
        Object obj = ((Pair) t2.a0.l(pairN)).first;
        if (y11.f(obj) != -1) {
            return pairN;
        }
        int iA1 = C2901o0.a1(this.f56876a, this.f30539o, this.f30494I, this.f30495J, obj, y10, y11);
        return iA1 != -1 ? S2(y11, iA1, y11.r(iA1, this.f56876a).c()) : S2(y11, -1, -9223372036854775807L);
    }

    private InterfaceC6084P.e L2(long j10) {
        Object obj;
        int iF;
        C6071C c6071c;
        Object obj2;
        int iK0 = K0();
        if (this.f30556w0.f30413a.u()) {
            obj = null;
            iF = -1;
            c6071c = null;
            obj2 = null;
        } else {
            K0 k02 = this.f30556w0;
            Object obj3 = k02.f30414b.f11662a;
            k02.f30413a.l(obj3, this.f30539o);
            iF = this.f30556w0.f30413a.f(obj3);
            obj2 = obj3;
            obj = this.f30556w0.f30413a.r(iK0, this.f56876a).f56678a;
            c6071c = this.f56876a.f56680c;
        }
        int i10 = iF;
        long jF1 = t2.a0.F1(j10);
        long jF12 = this.f30556w0.f30414b.b() ? t2.a0.F1(N2(this.f30556w0)) : jF1;
        D.b bVar = this.f30556w0.f30414b;
        return new InterfaceC6084P.e(obj, iK0, c6071c, obj2, i10, jF1, jF12, bVar.f11663b, bVar.f11664c);
    }

    private InterfaceC6084P.e M2(int i10, K0 k02, int i11) {
        int i12;
        Object obj;
        C6071C c6071c;
        Object obj2;
        int i13;
        long jN2;
        long jN22;
        Y.b bVar = new Y.b();
        if (k02.f30413a.u()) {
            i12 = i11;
            obj = null;
            c6071c = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = k02.f30414b.f11662a;
            k02.f30413a.l(obj3, bVar);
            int i14 = bVar.f56653c;
            int iF = k02.f30413a.f(obj3);
            Object obj4 = k02.f30413a.r(i14, this.f56876a).f56678a;
            c6071c = this.f56876a.f56680c;
            obj2 = obj3;
            i13 = iF;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (k02.f30414b.b()) {
                D.b bVar2 = k02.f30414b;
                jN2 = bVar.c(bVar2.f11663b, bVar2.f11664c);
                jN22 = N2(k02);
            } else {
                jN2 = k02.f30414b.f11666e != -1 ? N2(this.f30556w0) : bVar.f56655e + bVar.f56654d;
                jN22 = jN2;
            }
        } else if (k02.f30414b.b()) {
            jN2 = k02.f30431s;
            jN22 = N2(k02);
        } else {
            jN2 = bVar.f56655e + k02.f30431s;
            jN22 = jN2;
        }
        long jF1 = t2.a0.F1(jN2);
        long jF12 = t2.a0.F1(jN22);
        D.b bVar3 = k02.f30414b;
        return new InterfaceC6084P.e(obj, i12, c6071c, obj2, i13, jF1, jF12, bVar3.f11663b, bVar3.f11664c);
    }

    private static long N2(K0 k02) {
        Y.d dVar = new Y.d();
        Y.b bVar = new Y.b();
        k02.f30413a.l(k02.f30414b.f11662a, bVar);
        return k02.f30415c == -9223372036854775807L ? k02.f30413a.r(bVar.f56653c, dVar).d() : bVar.o() + k02.f30415c;
    }

    public void O2(C2901o0.e eVar) {
        boolean z10;
        long jX2;
        int i10 = this.f30496K - eVar.f31163c;
        this.f30496K = i10;
        boolean z11 = true;
        if (eVar.f31164d) {
            this.f30497L = eVar.f31165e;
            this.f30498M = true;
        }
        if (i10 == 0) {
            q2.Y y10 = eVar.f31162b.f30413a;
            if (!this.f30556w0.f30413a.u() && y10.u()) {
                this.f30558x0 = -1;
                this.f30562z0 = 0L;
                this.f30560y0 = 0;
            }
            if (!y10.u()) {
                List listK = ((M0) y10).K();
                AbstractC6614a.g(listK.size() == this.f30541p.size());
                for (int i11 = 0; i11 < listK.size(); i11++) {
                    ((e) this.f30541p.get(i11)).c((q2.Y) listK.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.f30498M) {
                if (eVar.f31162b.f30414b.equals(this.f30556w0.f30414b) && eVar.f31162b.f30416d == this.f30556w0.f30431s) {
                    z11 = false;
                }
                if (z11) {
                    if (y10.u() || eVar.f31162b.f30414b.b()) {
                        jX2 = eVar.f31162b.f30416d;
                    } else {
                        K0 k02 = eVar.f31162b;
                        jX2 = X2(y10, k02.f30414b, k02.f30416d);
                    }
                    j10 = jX2;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.f30498M = false;
            p3(eVar.f31162b, 1, z10, this.f30497L, j10, -1, false);
        }
    }

    private static K0 Q2(K0 k02, int i10) {
        K0 k0H = k02.h(i10);
        return (i10 == 1 || i10 == 4) ? k0H.b(false) : k0H;
    }

    private K0 R2(K0 k02, q2.Y y10, Pair pair) {
        AbstractC6614a.a(y10.u() || pair != null);
        q2.Y y11 = k02.f30413a;
        long jG2 = G2(k02);
        K0 k0J = k02.j(y10);
        if (y10.u()) {
            D.b bVarL = K0.l();
            long jV0 = t2.a0.V0(this.f30562z0);
            K0 k0C = k0J.d(bVarL, jV0, jV0, jV0, 0L, M2.n0.f12001d, this.f30513b, AbstractC2011u.A()).c(bVarL);
            k0C.f30429q = k0C.f30431s;
            return k0C;
        }
        Object obj = k0J.f30414b.f11662a;
        boolean zEquals = obj.equals(((Pair) t2.a0.l(pair)).first);
        D.b bVar = !zEquals ? new D.b(pair.first) : k0J.f30414b;
        long jLongValue = ((Long) pair.second).longValue();
        long jV02 = t2.a0.V0(jG2);
        if (!y11.u()) {
            jV02 -= y11.l(obj, this.f30539o).o();
        }
        if (!zEquals || jLongValue < jV02) {
            D.b bVar2 = bVar;
            AbstractC6614a.g(!bVar2.b());
            K0 k0C2 = k0J.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? M2.n0.f12001d : k0J.f30420h, !zEquals ? this.f30513b : k0J.f30421i, !zEquals ? AbstractC2011u.A() : k0J.f30422j).c(bVar2);
            k0C2.f30429q = jLongValue;
            return k0C2;
        }
        if (jLongValue != jV02) {
            D.b bVar3 = bVar;
            AbstractC6614a.g(!bVar3.b());
            long jMax = Math.max(0L, k0J.f30430r - (jLongValue - jV02));
            long j10 = k0J.f30429q;
            if (k0J.f30423k.equals(k0J.f30414b)) {
                j10 = jLongValue + jMax;
            }
            K0 k0D = k0J.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, k0J.f30420h, k0J.f30421i, k0J.f30422j);
            k0D.f30429q = j10;
            return k0D;
        }
        int iF = y10.f(k0J.f30423k.f11662a);
        if (iF != -1 && y10.j(iF, this.f30539o).f56653c == y10.l(bVar.f11662a, this.f30539o).f56653c) {
            return k0J;
        }
        y10.l(bVar.f11662a, this.f30539o);
        long jC = bVar.b() ? this.f30539o.c(bVar.f11663b, bVar.f11664c) : this.f30539o.f56654d;
        D.b bVar4 = bVar;
        K0 k0C3 = k0J.d(bVar4, k0J.f30431s, k0J.f30431s, k0J.f30416d, jC - k0J.f30431s, k0J.f30420h, k0J.f30421i, k0J.f30422j).c(bVar4);
        k0C3.f30429q = jC;
        return k0C3;
    }

    private Pair S2(q2.Y y10, int i10, long j10) {
        if (y10.u()) {
            this.f30558x0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f30562z0 = j10;
            this.f30560y0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= y10.t()) {
            i10 = y10.e(this.f30495J);
            j10 = y10.r(i10, this.f56876a).c();
        }
        return y10.n(this.f56876a, this.f30539o, i10, t2.a0.V0(j10));
    }

    public void T2(final int i10, final int i11) {
        if (i10 == this.f30526h0.b() && i11 == this.f30526h0.a()) {
            return;
        }
        this.f30526h0 = new C6611K(i10, i11);
        this.f30535m.k(24, new C6634v.a() { // from class: androidx.media3.exoplayer.z
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC6084P.d) obj).W(i10, i11);
            }
        });
        b3(2, 14, new C6611K(i10, i11));
    }

    private void U2() {
        K0 k02 = this.f30556w0;
        o3(k02.f30424l, k02.f30425m);
    }

    public void V2(int i10, final int i11) {
        s3();
        b3(1, 10, Integer.valueOf(i11));
        b3(2, 10, Integer.valueOf(i11));
        this.f30535m.k(21, new C6634v.a() { // from class: androidx.media3.exoplayer.N
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC6084P.d) obj).d(i11);
            }
        });
    }

    public void W2(boolean z10) {
        if (this.f30548s0) {
            return;
        }
        if (!z10) {
            U2();
        } else if (this.f30556w0.f30426n == 3) {
            U2();
        }
    }

    private long X2(q2.Y y10, D.b bVar, long j10) {
        y10.l(bVar.f11662a, this.f30539o);
        return j10 + this.f30539o.o();
    }

    private K0 Y2(K0 k02, int i10, int i11) {
        int iI2 = I2(k02);
        long jG2 = G2(k02);
        q2.Y y10 = k02.f30413a;
        int size = this.f30541p.size();
        this.f30496K++;
        Z2(i10, i11);
        q2.Y yB2 = B2();
        K0 k0R2 = R2(k02, yB2, J2(y10, yB2, iI2, jG2));
        int i12 = k0R2.f30417e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && iI2 >= k0R2.f30413a.t()) {
            k0R2 = Q2(k0R2, 4);
        }
        this.f30533l.P0(i10, i11, this.f30503R);
        return k0R2;
    }

    private void Z2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f30541p.remove(i12);
        }
        this.f30503R = this.f30503R.a(i10, i11);
    }

    private void a3() {
        if (this.f30516c0 != null) {
            D2(this.f30486A).m(ColorExtractionConstants.MAX_PIXEL_SAMPLES).l(null).k();
            this.f30516c0.g(this.f30561z);
            this.f30516c0 = null;
        }
        TextureView textureView = this.f30520e0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f30561z) {
                AbstractC6635w.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f30520e0.setSurfaceTextureListener(null);
            }
            this.f30520e0 = null;
        }
        SurfaceHolder surfaceHolder = this.f30514b0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f30561z);
            this.f30514b0 = null;
        }
    }

    private void b3(int i10, int i11, Object obj) {
        for (N0 n02 : this.f30523g) {
            if (i10 == -1 || n02.f() == i10) {
                D2(n02).m(i11).l(obj).k();
            }
        }
        for (N0 n03 : this.f30525h) {
            if (n03 != null && (i10 == -1 || n03.f() == i10)) {
                D2(n03).m(i11).l(obj).k();
            }
        }
    }

    private void c3(int i10, Object obj) {
        b3(-1, i10, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g3(java.util.List r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r1 = r16
            androidx.media3.exoplayer.K0 r2 = r14.f30556w0
            int r2 = r14.I2(r2)
            long r3 = r14.getCurrentPosition()
            int r5 = r14.f30496K
            r6 = 1
            int r5 = r5 + r6
            r14.f30496K = r5
            java.util.List r5 = r14.f30541p
            boolean r5 = r5.isEmpty()
            r7 = 0
            if (r5 != 0) goto L24
            java.util.List r5 = r14.f30541p
            int r5 = r5.size()
            r14.Z2(r7, r5)
        L24:
            java.util.List r9 = r14.s2(r7, r15)
            q2.Y r5 = r14.B2()
            boolean r8 = r5.u()
            if (r8 != 0) goto L38
            int r8 = r5.t()
            if (r1 >= r8) goto L3b
        L38:
            r10 = r17
            goto L43
        L3b:
            q2.A r2 = new q2.A
            r10 = r17
            r2.<init>(r5, r1, r10)
            throw r2
        L43:
            r8 = -1
            if (r19 == 0) goto L53
            boolean r1 = r14.f30495J
            int r1 = r5.e(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L51:
            r10 = r1
            goto L5a
        L53:
            if (r1 != r8) goto L58
            r10 = r2
            r2 = r3
            goto L5a
        L58:
            r2 = r10
            goto L51
        L5a:
            androidx.media3.exoplayer.K0 r1 = r14.f30556w0
            android.util.Pair r4 = r14.S2(r5, r10, r2)
            androidx.media3.exoplayer.K0 r1 = r14.R2(r1, r5, r4)
            int r4 = r1.f30417e
            if (r10 == r8) goto L7a
            if (r4 == r6) goto L7a
            boolean r4 = r5.u()
            if (r4 != 0) goto L79
            int r4 = r5.t()
            if (r10 < r4) goto L77
            goto L79
        L77:
            r4 = 2
            goto L7a
        L79:
            r4 = 4
        L7a:
            androidx.media3.exoplayer.K0 r1 = Q2(r1, r4)
            androidx.media3.exoplayer.o0 r8 = r14.f30533l
            long r11 = t2.a0.V0(r2)
            M2.e0 r13 = r14.f30503R
            r8.q1(r9, r10, r11, r13)
            androidx.media3.exoplayer.K0 r2 = r14.f30556w0
            M2.D$b r2 = r2.f30414b
            java.lang.Object r2 = r2.f11662a
            M2.D$b r3 = r1.f30414b
            java.lang.Object r3 = r3.f11662a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La5
            androidx.media3.exoplayer.K0 r2 = r14.f30556w0
            q2.Y r2 = r2.f30413a
            boolean r2 = r2.u()
            if (r2 != 0) goto La5
            r3 = r6
            goto La6
        La5:
            r3 = r7
        La6:
            long r5 = r14.H2(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r14
            r0.p3(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.Y.g3(java.util.List, int, long, boolean):void");
    }

    private void h3(SurfaceHolder surfaceHolder) {
        this.f30518d0 = false;
        this.f30514b0 = surfaceHolder;
        surfaceHolder.addCallback(this.f30561z);
        Surface surface = this.f30514b0.getSurface();
        if (surface == null || !surface.isValid()) {
            T2(0, 0);
        } else {
            Rect surfaceFrame = this.f30514b0.getSurfaceFrame();
            T2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public void i3(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        j3(surface);
        this.f30512a0 = surface;
    }

    public void j3(Object obj) {
        Object obj2 = this.f30511Z;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zL1 = this.f30533l.L1(obj, z10 ? this.f30491F : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.f30511Z;
            Surface surface = this.f30512a0;
            if (obj3 == surface) {
                surface.release();
                this.f30512a0 = null;
            }
        }
        this.f30511Z = obj;
        if (zL1) {
            return;
        }
        l3(C2907s.k(new A2.I(3), ErrorCodes.MALFORMED_URL_EXCEPTION));
    }

    private void l3(C2907s c2907s) {
        K0 k02 = this.f30556w0;
        K0 k0C = k02.c(k02.f30414b);
        k0C.f30429q = k0C.f30431s;
        k0C.f30430r = 0L;
        K0 k0Q2 = Q2(k0C, 1);
        if (c2907s != null) {
            k0Q2 = k0Q2.f(c2907s);
        }
        this.f30496K++;
        this.f30533l.V1();
        p3(k0Q2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public static /* synthetic */ void m1(K0 k02, InterfaceC6084P.d dVar) {
        dVar.D(k02.f30419g);
        dVar.b0(k02.f30419g);
    }

    private void m3() {
        InterfaceC6084P.b bVar = this.f30506U;
        InterfaceC6084P.b bVarQ = t2.a0.Q(this.f30521f, this.f30515c);
        this.f30506U = bVarQ;
        if (bVarQ.equals(bVar)) {
            return;
        }
        this.f30535m.h(13, new C6634v.a() { // from class: androidx.media3.exoplayer.L
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC6084P.d) obj).I(this.f30433a.f30506U);
            }
        });
    }

    private void n3(int i10, int i11, List list) {
        this.f30496K++;
        this.f30533l.a2(i10, i11, list);
        for (int i12 = i10; i12 < i11; i12++) {
            e eVar = (e) this.f30541p.get(i12);
            eVar.c(new M2.k0(eVar.a(), (C6071C) list.get(i12 - i10)));
        }
        p3(this.f30556w0.j(B2()), 0, false, 4, -9223372036854775807L, -1, false);
    }

    public void o3(boolean z10, int i10) {
        int iZ2 = z2(z10);
        K0 k0A = this.f30556w0;
        if (k0A.f30424l == z10 && k0A.f30426n == iZ2 && k0A.f30425m == i10) {
            return;
        }
        this.f30496K++;
        if (k0A.f30428p) {
            k0A = k0A.a();
        }
        K0 k0E = k0A.e(z10, i10, iZ2);
        this.f30533l.t1(z10, i10, iZ2);
        p3(k0E, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void p3(final K0 k02, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        K0 k03 = this.f30556w0;
        this.f30556w0 = k02;
        boolean zEquals = k03.f30413a.equals(k02.f30413a);
        Pair pairE2 = E2(k02, k03, z10, i11, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairE2.first).booleanValue();
        final int iIntValue = ((Integer) pairE2.second).intValue();
        if (zBooleanValue) {
            c6071c = k02.f30413a.u() ? null : k02.f30413a.r(k02.f30413a.l(k02.f30414b.f11662a, this.f30539o).f56653c, this.f56876a).f56680c;
            this.f30554v0 = C6077I.f56472K;
        }
        if (zBooleanValue || !k03.f30422j.equals(k02.f30422j)) {
            this.f30554v0 = this.f30554v0.a().M(k02.f30422j).J();
        }
        C6077I c6077iV2 = v2();
        boolean zEquals2 = c6077iV2.equals(this.f30507V);
        this.f30507V = c6077iV2;
        boolean z12 = k03.f30424l != k02.f30424l;
        boolean z13 = k03.f30417e != k02.f30417e;
        if (z13 || z12) {
            r3();
        }
        boolean z14 = k03.f30419g;
        boolean z15 = k02.f30419g;
        boolean z16 = z14 != z15;
        if (z16) {
            q3(z15);
        }
        if (!zEquals) {
            this.f30535m.h(0, new C6634v.a() { // from class: androidx.media3.exoplayer.t
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                    dVar.S(k02.f30413a, i10);
                }
            });
        }
        if (z10) {
            final InterfaceC6084P.e eVarM2 = M2(i11, k03, i12);
            final InterfaceC6084P.e eVarL2 = L2(j10);
            this.f30535m.h(11, new C6634v.a() { // from class: androidx.media3.exoplayer.T
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    Y.I1(i11, eVarM2, eVarL2, (InterfaceC6084P.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f30535m.h(1, new C6634v.a() { // from class: androidx.media3.exoplayer.U
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).E(c6071c, iIntValue);
                }
            });
        }
        if (k03.f30418f != k02.f30418f) {
            this.f30535m.h(10, new C6634v.a() { // from class: androidx.media3.exoplayer.V
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).t0(k02.f30418f);
                }
            });
            if (k02.f30418f != null) {
                this.f30535m.h(10, new C6634v.a() { // from class: androidx.media3.exoplayer.W
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).H(k02.f30418f);
                    }
                });
            }
        }
        P2.H h10 = k03.f30421i;
        P2.H h11 = k02.f30421i;
        if (h10 != h11) {
            this.f30527i.i(h11.f13280e);
            this.f30535m.h(2, new C6634v.a() { // from class: androidx.media3.exoplayer.X
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).g0(k02.f30421i.f13279d);
                }
            });
        }
        if (!zEquals2) {
            final C6077I c6077i = this.f30507V;
            this.f30535m.h(14, new C6634v.a() { // from class: androidx.media3.exoplayer.u
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).V(c6077i);
                }
            });
        }
        if (z16) {
            this.f30535m.h(3, new C6634v.a() { // from class: androidx.media3.exoplayer.v
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    Y.m1(k02, (InterfaceC6084P.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f30535m.h(-1, new C6634v.a() { // from class: androidx.media3.exoplayer.w
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    K0 k04 = k02;
                    ((InterfaceC6084P.d) obj).k0(k04.f30424l, k04.f30417e);
                }
            });
        }
        if (z13) {
            this.f30535m.h(4, new C6634v.a() { // from class: androidx.media3.exoplayer.x
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).J(k02.f30417e);
                }
            });
        }
        if (z12 || k03.f30425m != k02.f30425m) {
            this.f30535m.h(5, new C6634v.a() { // from class: androidx.media3.exoplayer.E
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    K0 k04 = k02;
                    ((InterfaceC6084P.d) obj).s0(k04.f30424l, k04.f30425m);
                }
            });
        }
        if (k03.f30426n != k02.f30426n) {
            this.f30535m.h(6, new C6634v.a() { // from class: androidx.media3.exoplayer.P
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).C(k02.f30426n);
                }
            });
        }
        if (k03.n() != k02.n()) {
            this.f30535m.h(7, new C6634v.a() { // from class: androidx.media3.exoplayer.Q
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).y0(k02.n());
                }
            });
        }
        if (!k03.f30427o.equals(k02.f30427o)) {
            this.f30535m.h(12, new C6634v.a() { // from class: androidx.media3.exoplayer.S
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).n(k02.f30427o);
                }
            });
        }
        m3();
        this.f30535m.f();
        if (k03.f30428p != k02.f30428p) {
            Iterator it = this.f30537n.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.a) it.next()).G(k02.f30428p);
            }
        }
    }

    private static q2.d0 r2(q2.d0 d0Var, AbstractC2013w abstractC2013w) {
        d0.c cVarI = d0Var.I();
        P9.X it = abstractC2013w.iterator();
        while (it.hasNext()) {
            cVarI.V(((Integer) it.next()).intValue(), true);
        }
        return cVarI.G();
    }

    public void r3() {
        int iP = p();
        boolean z10 = false;
        if (iP != 1) {
            if (iP == 2 || iP == 3) {
                boolean zP2 = P2();
                j1 j1Var = this.f30489D;
                if (q0() && !zP2) {
                    z10 = true;
                }
                j1Var.d(z10);
                this.f30490E.d(q0());
                return;
            }
            if (iP != 4) {
                throw new IllegalStateException();
            }
        }
        this.f30489D.d(false);
        this.f30490E.d(false);
    }

    private List s2(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            J0.c cVar = new J0.c((M2.D) list.get(i11), this.f30543q);
            arrayList.add(cVar);
            this.f30541p.add(i11 + i10, new e(cVar.f30406b, cVar.f30405a));
        }
        this.f30503R = this.f30503R.g(i10, arrayList.size());
        return arrayList;
    }

    private void s3() {
        this.f30517d.b();
        if (Thread.currentThread() != m().getThread()) {
            String strI = t2.a0.I("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), m().getThread().getName());
            if (this.f30540o0) {
                throw new IllegalStateException(strI);
            }
            AbstractC6635w.j("ExoPlayerImpl", strI, this.f30542p0 ? null : new IllegalStateException());
            this.f30542p0 = true;
        }
    }

    private K0 u2(K0 k02, int i10, List list) {
        q2.Y y10 = k02.f30413a;
        this.f30496K++;
        List listS2 = s2(i10, list);
        q2.Y yB2 = B2();
        K0 k0R2 = R2(k02, yB2, J2(y10, yB2, I2(k02), G2(k02)));
        this.f30533l.v(i10, listS2, this.f30503R);
        return k0R2;
    }

    public C6077I v2() {
        q2.Y yH0 = h0();
        if (yH0.u()) {
            return this.f30554v0;
        }
        return this.f30554v0.a().L(yH0.r(K0(), this.f56876a).f56680c.f56331e).J();
    }

    private boolean w2(int i10, int i11, List list) {
        if (i11 - i10 != list.size()) {
            return false;
        }
        for (int i12 = i10; i12 < i11; i12++) {
            if (!((e) this.f30541p.get(i12)).f30569b.e((C6071C) list.get(i12 - i10))) {
                return false;
            }
        }
        return true;
    }

    private int z2(boolean z10) {
        if (this.f30499N) {
            return 4;
        }
        g1 g1Var = this.f30492G;
        if (g1Var == null || g1Var.b()) {
            return (this.f30556w0.f30426n != 1 || z10) ? 0 : 1;
        }
        return 3;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void A(InterfaceC1024b interfaceC1024b) {
        this.f30547s.f0((InterfaceC1024b) AbstractC6614a.e(interfaceC1024b));
    }

    @Override // q2.InterfaceC6084P
    public void B(Surface surface) {
        s3();
        a3();
        j3(surface);
        int i10 = surface == null ? 0 : -1;
        T2(i10, i10);
    }

    @Override // q2.InterfaceC6084P
    public int B0() {
        s3();
        if (D()) {
            return this.f30556w0.f30414b.f11664c;
        }
        return -1;
    }

    @Override // q2.InterfaceC6084P
    public void C(C6077I c6077i) {
        s3();
        AbstractC6614a.e(c6077i);
        if (c6077i.equals(this.f30508W)) {
            return;
        }
        this.f30508W = c6077i;
        this.f30535m.k(15, new C6634v.a() { // from class: androidx.media3.exoplayer.M
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC6084P.d) obj).c0(this.f30448a.f30508W);
            }
        });
    }

    @Override // q2.InterfaceC6084P
    public boolean D() {
        s3();
        return this.f30556w0.f30414b.b();
    }

    @Override // q2.InterfaceC6084P
    public void D0(List list, int i10, long j10) {
        s3();
        e3(C2(list), i10, j10);
    }

    @Override // q2.InterfaceC6084P
    public long E() {
        s3();
        return t2.a0.F1(this.f30556w0.f30430r);
    }

    @Override // q2.InterfaceC6084P
    public void F(boolean z10, int i10) {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.A(z10, i10);
        }
    }

    @Override // q2.InterfaceC6084P
    public long F0() {
        s3();
        return this.f30555w;
    }

    public InterfaceC6623j F2() {
        return this.f30559y;
    }

    @Override // q2.InterfaceC6084P
    public long G0() {
        s3();
        return G2(this.f30556w0);
    }

    @Override // q2.InterfaceC6084P
    public void H(InterfaceC6084P.d dVar) {
        s3();
        this.f30535m.j((InterfaceC6084P.d) AbstractC6614a.e(dVar));
    }

    @Override // q2.InterfaceC6084P
    public void H0(int i10, List list) {
        s3();
        t2(i10, C2(list));
    }

    @Override // q2.InterfaceC6084P
    public long I0() {
        s3();
        if (!D()) {
            return R0();
        }
        K0 k02 = this.f30556w0;
        return k02.f30423k.equals(k02.f30414b) ? t2.a0.F1(this.f30556w0.f30429q) : getDuration();
    }

    @Override // q2.InterfaceC6084P
    public C6077I J0() {
        s3();
        return this.f30508W;
    }

    @Override // q2.InterfaceC6084P
    public int K0() {
        s3();
        int iI2 = I2(this.f30556w0);
        if (iI2 == -1) {
            return 0;
        }
        return iI2;
    }

    public Looper K2() {
        return this.f30533l.Q();
    }

    @Override // q2.InterfaceC6084P
    public void L(List list, boolean z10) {
        s3();
        f3(C2(list), z10);
    }

    @Override // q2.InterfaceC6084P
    public void L0(SurfaceView surfaceView) {
        s3();
        y2(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // q2.InterfaceC6084P
    public void M() {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.r(1);
        }
    }

    @Override // q2.InterfaceC6084P
    public void N(int i10) {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.w(i10);
        }
    }

    @Override // q2.InterfaceC6084P
    public void N0(int i10, int i11, int i12) {
        s3();
        AbstractC6614a.a(i10 >= 0 && i10 <= i11 && i12 >= 0);
        int size = this.f30541p.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 >= size || i10 == iMin || i10 == iMin2) {
            return;
        }
        q2.Y yH0 = h0();
        this.f30496K++;
        t2.a0.U0(this.f30541p, i10, iMin, iMin2);
        this.f30503R = this.f30503R.h(i10, iMin, iMin2);
        q2.Y yB2 = B2();
        K0 k02 = this.f30556w0;
        K0 k0R2 = R2(k02, yB2, J2(yH0, yB2, I2(k02), G2(this.f30556w0)));
        this.f30533l.E0(i10, iMin, iMin2, this.f30503R);
        p3(k0R2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // q2.InterfaceC6084P
    public void O(SurfaceView surfaceView) {
        s3();
        if (surfaceView instanceof S2.t) {
            a3();
            j3(surfaceView);
            h3(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof T2.l)) {
                k3(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            a3();
            this.f30516c0 = (T2.l) surfaceView;
            D2(this.f30486A).m(ColorExtractionConstants.MAX_PIXEL_SAMPLES).l(this.f30516c0).k();
            this.f30516c0.d(this.f30561z);
            j3(this.f30516c0.getVideoSurface());
            h3(surfaceView.getHolder());
        }
    }

    @Override // q2.InterfaceC6084P
    public void P(final q2.d0 d0Var) {
        q2.d0 d0VarR2;
        s3();
        if (this.f30527i.h()) {
            q2.d0 d0VarJ0 = j0();
            if (this.f30499N) {
                this.f30500O = d0Var.f56806E;
                d0VarR2 = r2(d0Var, this.f30501P.f151a);
            } else {
                d0VarR2 = d0Var;
            }
            if (!d0VarR2.equals(this.f30527i.c())) {
                this.f30527i.m(d0VarR2);
            }
            if (d0VarJ0.equals(d0Var)) {
                return;
            }
            this.f30535m.k(19, new C6634v.a() { // from class: androidx.media3.exoplayer.J
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).Z(d0Var);
                }
            });
        }
    }

    @Override // q2.InterfaceC6084P
    public boolean P0() {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            return e1Var.x();
        }
        return false;
    }

    public boolean P2() {
        s3();
        return this.f30556w0.f30428p;
    }

    @Override // q2.InterfaceC6084P
    public void Q(int i10, int i11, List list) {
        s3();
        AbstractC6614a.a(i10 >= 0 && i11 >= i10);
        int size = this.f30541p.size();
        if (i10 > size) {
            return;
        }
        int iMin = Math.min(i11, size);
        if (w2(i10, iMin, list)) {
            n3(i10, iMin, list);
            return;
        }
        List listC2 = C2(list);
        if (this.f30541p.isEmpty()) {
            f3(listC2, this.f30558x0 == -1);
        } else {
            K0 k0Y2 = Y2(u2(this.f30556w0, iMin, listC2), i10, iMin);
            p3(k0Y2, 0, !k0Y2.f30414b.f11662a.equals(this.f30556w0.f30414b.f11662a), 4, H2(k0Y2), -1, false);
        }
    }

    @Override // q2.InterfaceC6084P
    public boolean Q0() {
        s3();
        return this.f30495J;
    }

    @Override // q2.InterfaceC6084P
    public long R0() {
        s3();
        if (this.f30556w0.f30413a.u()) {
            return this.f30562z0;
        }
        K0 k02 = this.f30556w0;
        if (k02.f30423k.f11665d != k02.f30414b.f11665d) {
            return k02.f30413a.r(K0(), this.f56876a).e();
        }
        long j10 = k02.f30429q;
        if (this.f30556w0.f30423k.b()) {
            K0 k03 = this.f30556w0;
            Y.b bVarL = k03.f30413a.l(k03.f30423k.f11662a, this.f30539o);
            long jG = bVarL.g(this.f30556w0.f30423k.f11663b);
            j10 = jG == Long.MIN_VALUE ? bVarL.f56654d : jG;
        }
        K0 k04 = this.f30556w0;
        return t2.a0.F1(X2(k04.f30413a, k04.f30423k, j10));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void S(M2.D d10) {
        s3();
        d3(Collections.singletonList(d10));
    }

    @Override // q2.InterfaceC6084P
    public void S0(int i10) {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.C(i10, 1);
        }
    }

    @Override // q2.InterfaceC6084P
    public void T(int i10, int i11) {
        s3();
        AbstractC6614a.a(i10 >= 0 && i11 >= i10);
        int size = this.f30541p.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        K0 k0Y2 = Y2(this.f30556w0, i10, iMin);
        p3(k0Y2, 0, !k0Y2.f30414b.f11662a.equals(this.f30556w0.f30414b.f11662a), 4, H2(k0Y2), -1, false);
    }

    @Override // q2.InterfaceC6084P
    public void V(boolean z10) {
        s3();
        o3(z10, 1);
    }

    @Override // q2.InterfaceC6084P
    public C6077I V0() {
        s3();
        return this.f30507V;
    }

    @Override // q2.InterfaceC6084P
    public void W0(final C6088c c6088c, boolean z10) {
        s3();
        if (this.f30548s0) {
            return;
        }
        if (!Objects.equals(this.f30532k0, c6088c)) {
            this.f30532k0 = c6088c;
            b3(1, 3, c6088c);
            e1 e1Var = this.f30488C;
            if (e1Var != null) {
                e1Var.B(c6088c.c());
            }
            this.f30535m.h(20, new C6634v.a() { // from class: androidx.media3.exoplayer.O
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).e0(c6088c);
                }
            });
        }
        this.f30533l.l1(this.f30532k0, z10);
        this.f30535m.f();
    }

    @Override // q2.InterfaceC6084P
    public void X(int i10) {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.r(i10);
        }
    }

    @Override // q2.InterfaceC6084P
    public long X0() {
        s3();
        return this.f30553v;
    }

    @Override // q2.InterfaceC6084P
    public q2.h0 Y() {
        s3();
        return this.f30556w0.f30421i.f13279d;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void a() {
        AbstractC6635w.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + t2.a0.f60566e + "] [" + AbstractC6076H.b() + "]");
        s3();
        this.f30487B.d(false);
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.z();
        }
        this.f30489D.d(false);
        this.f30490E.d(false);
        g1 g1Var = this.f30492G;
        if (g1Var != null) {
            g1Var.disable();
        }
        if (!this.f30533l.L0()) {
            this.f30535m.k(10, new C6634v.a() { // from class: androidx.media3.exoplayer.A
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).H(C2907s.k(new A2.I(1), ErrorCodes.MALFORMED_URL_EXCEPTION));
                }
            });
        }
        this.f30535m.i();
        this.f30529j.f(null);
        this.f30551u.f(this.f30547s);
        K0 k02 = this.f30556w0;
        if (k02.f30428p) {
            this.f30556w0 = k02.a();
        }
        K0 k0Q2 = Q2(this.f30556w0, 1);
        this.f30556w0 = k0Q2;
        K0 k0C = k0Q2.c(k0Q2.f30414b);
        this.f30556w0 = k0C;
        k0C.f30429q = k0C.f30431s;
        this.f30556w0.f30430r = 0L;
        this.f30547s.a();
        a3();
        Surface surface = this.f30512a0;
        if (surface != null) {
            surface.release();
            this.f30512a0 = null;
        }
        if (this.f30546r0) {
            android.support.v4.media.session.b.a(AbstractC6614a.e(null));
            throw null;
        }
        this.f30538n0 = C6407e.f59083d;
        this.f30548s0 = true;
    }

    @Override // q2.InterfaceC6084P
    public void a0(InterfaceC6084P.d dVar) {
        this.f30535m.c((InterfaceC6084P.d) AbstractC6614a.e(dVar));
    }

    @Override // q2.InterfaceC6084P
    public C6407e b0() {
        s3();
        return this.f30538n0;
    }

    @Override // q2.InterfaceC6084P
    public C6083O c() {
        s3();
        return this.f30556w0.f30427o;
    }

    @Override // q2.InterfaceC6084P
    public int c0() {
        s3();
        if (D()) {
            return this.f30556w0.f30414b.f11663b;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void d(A2.Q q10) {
        s3();
        if (q10 == null) {
            q10 = A2.Q.f170g;
        }
        if (this.f30502Q.equals(q10)) {
            return;
        }
        this.f30502Q = q10;
        this.f30533l.E1(q10);
    }

    public void d3(List list) {
        s3();
        f3(list, true);
    }

    @Override // q2.InterfaceC6084P
    public void e(C6083O c6083o) {
        s3();
        if (c6083o == null) {
            c6083o = C6083O.f56598d;
        }
        if (this.f30556w0.f30427o.equals(c6083o)) {
            return;
        }
        K0 k0G = this.f30556w0.g(c6083o);
        this.f30496K++;
        this.f30533l.v1(c6083o);
        p3(k0G, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // q2.InterfaceC6084P
    public void e0(boolean z10) {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.A(z10, 1);
        }
    }

    @Override // q2.AbstractC6093h
    protected void e1(int i10, long j10, int i11, boolean z10) {
        s3();
        if (i10 == -1) {
            return;
        }
        AbstractC6614a.a(i10 >= 0);
        q2.Y y10 = this.f30556w0.f30413a;
        if (y10.u() || i10 < y10.t()) {
            this.f30547s.L();
            this.f30496K++;
            if (D()) {
                AbstractC6635w.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C2901o0.e eVar = new C2901o0.e(this.f30556w0);
                eVar.b(1);
                this.f30531k.a(eVar);
                return;
            }
            K0 k0Q2 = this.f30556w0;
            int i12 = k0Q2.f30417e;
            if (i12 == 3 || (i12 == 4 && !y10.u())) {
                k0Q2 = Q2(this.f30556w0, 2);
            }
            int iK0 = K0();
            K0 k0R2 = R2(k0Q2, y10, S2(y10, i10, j10));
            this.f30533l.c1(y10, i10, t2.a0.V0(j10));
            p3(k0R2, 0, true, 1, H2(k0R2), iK0, z10);
        }
    }

    public void e3(List list, int i10, long j10) {
        s3();
        g3(list, i10, j10, false);
    }

    @Override // q2.InterfaceC6084P
    public C6611K f() {
        s3();
        return this.f30526h0;
    }

    public void f3(List list, boolean z10) {
        s3();
        g3(list, -1, -9223372036854775807L, z10);
    }

    @Override // q2.InterfaceC6084P
    public int g0() {
        s3();
        return this.f30556w0.f30426n;
    }

    @Override // q2.InterfaceC6084P
    public long getCurrentPosition() {
        s3();
        return t2.a0.F1(H2(this.f30556w0));
    }

    @Override // q2.InterfaceC6084P
    public C6101p getDeviceInfo() {
        s3();
        return this.f30550t0;
    }

    @Override // q2.InterfaceC6084P
    public long getDuration() {
        s3();
        if (!D()) {
            return t0();
        }
        K0 k02 = this.f30556w0;
        D.b bVar = k02.f30414b;
        k02.f30413a.l(bVar.f11662a, this.f30539o);
        return t2.a0.F1(this.f30539o.c(bVar.f11663b, bVar.f11664c));
    }

    @Override // q2.InterfaceC6084P
    public q2.Y h0() {
        s3();
        return this.f30556w0.f30413a;
    }

    @Override // q2.InterfaceC6084P
    public void i0() {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.w(1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isScrubbingModeEnabled() {
        s3();
        return this.f30499N;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public C6109x j() {
        s3();
        return this.f30509X;
    }

    @Override // q2.InterfaceC6084P
    public q2.d0 j0() {
        s3();
        q2.d0 d0VarC = this.f30527i.c();
        return this.f30499N ? d0VarC.I().N(this.f30500O).G() : d0VarC;
    }

    public void k3(SurfaceHolder surfaceHolder) {
        s3();
        if (surfaceHolder == null) {
            x2();
            return;
        }
        a3();
        this.f30518d0 = true;
        this.f30514b0 = surfaceHolder;
        surfaceHolder.addCallback(this.f30561z);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            j3(null);
            T2(0, 0);
        } else {
            j3(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            T2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // q2.InterfaceC6084P
    public void l0(TextureView textureView) {
        s3();
        if (textureView == null) {
            x2();
            return;
        }
        a3();
        this.f30520e0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            AbstractC6635w.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f30561z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            j3(null);
            T2(0, 0);
        } else {
            i3(surfaceTexture);
            T2(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // q2.InterfaceC6084P
    public Looper m() {
        return this.f30549t;
    }

    @Override // q2.InterfaceC6084P
    public int m0() {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            return e1Var.v();
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void n(A2.P p10) {
        s3();
        if (this.f30501P.equals(p10)) {
            return;
        }
        A2.P p11 = this.f30501P;
        this.f30501P = p10;
        this.f30533l.C1(p10);
        if (this.f30499N && this.f30527i.h() && !p11.f151a.equals(p10.f151a)) {
            q2.d0 d0VarR2 = r2(j0(), p10.f151a);
            if (d0VarR2.equals(this.f30527i.c())) {
                return;
            }
            this.f30527i.m(d0VarR2);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void o(InterfaceC1024b interfaceC1024b) {
        s3();
        this.f30547s.Q((InterfaceC1024b) AbstractC6614a.e(interfaceC1024b));
    }

    @Override // q2.InterfaceC6084P
    public int p() {
        s3();
        return this.f30556w0.f30417e;
    }

    @Override // q2.InterfaceC6084P
    public InterfaceC6084P.b p0() {
        s3();
        return this.f30506U;
    }

    @Override // q2.InterfaceC6084P
    public boolean q() {
        s3();
        return this.f30556w0.f30419g;
    }

    @Override // q2.InterfaceC6084P
    public boolean q0() {
        s3();
        return this.f30556w0.f30424l;
    }

    public void q2(ExoPlayer.a aVar) {
        this.f30537n.add(aVar);
    }

    @Override // q2.InterfaceC6084P
    public void r0(final boolean z10) {
        s3();
        if (this.f30495J != z10) {
            this.f30495J = z10;
            this.f30533l.G1(z10);
            this.f30535m.h(9, new C6634v.a() { // from class: androidx.media3.exoplayer.C
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).M(z10);
                }
            });
            m3();
            this.f30535m.f();
        }
    }

    @Override // q2.InterfaceC6084P
    public void s() {
        s3();
        K0 k02 = this.f30556w0;
        if (k02.f30417e != 1) {
            return;
        }
        K0 k0F = k02.f(null);
        K0 k0Q2 = Q2(k0F, k0F.f30413a.u() ? 4 : 2);
        this.f30496K++;
        this.f30533l.J0();
        p3(k0Q2, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // q2.InterfaceC6084P
    public long s0() {
        s3();
        return this.f30557x;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        s3();
        b3(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setScrubbingModeEnabled(boolean z10) {
        q2.d0 d0VarG;
        s3();
        if (z10 == this.f30499N) {
            return;
        }
        this.f30499N = z10;
        if (!this.f30501P.f151a.isEmpty() && this.f30527i.h()) {
            q2.d0 d0VarC = this.f30527i.c();
            if (z10) {
                this.f30500O = d0VarC.f56806E;
                d0VarG = r2(d0VarC, this.f30501P.f151a);
            } else {
                d0VarG = d0VarC.I().N(this.f30500O).G();
                this.f30500O = null;
            }
            if (!d0VarG.equals(d0VarC)) {
                this.f30527i.m(d0VarG);
            }
        }
        this.f30533l.A1(z10);
        U2();
    }

    @Override // q2.InterfaceC6084P
    public void stop() {
        s3();
        l3(null);
        this.f30538n0 = new C6407e(AbstractC2011u.A(), this.f30556w0.f30431s);
    }

    public void t2(int i10, List list) {
        s3();
        AbstractC6614a.a(i10 >= 0);
        int iMin = Math.min(i10, this.f30541p.size());
        if (this.f30541p.isEmpty()) {
            f3(list, this.f30558x0 == -1);
        } else {
            p3(u2(this.f30556w0, iMin, list), 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // q2.InterfaceC6084P
    public int u0() {
        s3();
        if (this.f30556w0.f30413a.u()) {
            return this.f30560y0;
        }
        K0 k02 = this.f30556w0;
        return k02.f30413a.f(k02.f30414b.f11662a);
    }

    @Override // q2.InterfaceC6084P
    public void v(final int i10) {
        s3();
        if (this.f30494I != i10) {
            this.f30494I = i10;
            this.f30533l.y1(i10);
            this.f30535m.h(8, new C6634v.a() { // from class: androidx.media3.exoplayer.B
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).F(i10);
                }
            });
            m3();
            this.f30535m.f();
        }
    }

    @Override // q2.InterfaceC6084P
    public void v0(TextureView textureView) {
        s3();
        if (textureView == null || textureView != this.f30520e0) {
            return;
        }
        x2();
    }

    @Override // q2.InterfaceC6084P
    public void w(float f10) {
        s3();
        final float fQ = t2.a0.q(f10, 0.0f, 1.0f);
        if (this.f30534l0 == fQ) {
            return;
        }
        this.f30534l0 = fQ;
        this.f30533l.N1(fQ);
        this.f30535m.k(22, new C6634v.a() { // from class: androidx.media3.exoplayer.y
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC6084P.d) obj).d0(fQ);
            }
        });
    }

    @Override // q2.InterfaceC6084P
    public q2.l0 w0() {
        s3();
        return this.f30552u0;
    }

    @Override // q2.InterfaceC6084P
    public int x() {
        s3();
        return this.f30494I;
    }

    @Override // q2.InterfaceC6084P
    public float x0() {
        s3();
        return this.f30534l0;
    }

    public void x2() {
        s3();
        a3();
        j3(null);
        T2(0, 0);
    }

    @Override // q2.InterfaceC6084P
    public C6088c y0() {
        s3();
        return this.f30532k0;
    }

    public void y2(SurfaceHolder surfaceHolder) {
        s3();
        if (surfaceHolder == null || surfaceHolder != this.f30514b0) {
            return;
        }
        x2();
    }

    @Override // q2.InterfaceC6084P
    public void z0(int i10, int i11) {
        s3();
        e1 e1Var = this.f30488C;
        if (e1Var != null) {
            e1Var.C(i10, i11);
        }
    }

    @Override // q2.InterfaceC6084P
    public C2907s y() {
        s3();
        return this.f30556w0.f30418f;
    }

    private void q3(boolean z10) {
    }
}
