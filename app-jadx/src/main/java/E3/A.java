package E3;

import E3.A;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import q2.AbstractC6076H;
import q2.C6071C;
import q2.C6077I;
import q2.C6082N;
import q2.C6083O;
import q2.C6088c;
import q2.C6101p;
import q2.InterfaceC6084P;
import q2.Y;
import s2.C6407e;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.InterfaceC6621h;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class A implements InterfaceC6084P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y.d f4300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f4302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c f4303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Handler f4304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f4305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final b f4308i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f4309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Y6 f4310b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC6621h f4314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f4315g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f4311c = Bundle.EMPTY;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f4312d = new C0048a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Looper f4313e = t2.a0.Z();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f4316h = 100;

        /* JADX INFO: renamed from: E3.A$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0048a implements c {
            C0048a() {
            }
        }

        public a(Context context, Y6 y62) {
            this.f4309a = (Context) AbstractC6614a.e(context);
            this.f4310b = (Y6) AbstractC6614a.e(y62);
        }

        public com.google.common.util.concurrent.p b() {
            final D d10 = new D(this.f4313e);
            if (this.f4310b.j() && this.f4314f == null) {
                this.f4314f = new C1315a(new w2.k(this.f4309a));
            }
            final A a10 = new A(this.f4309a, this.f4310b, this.f4311c, this.f4312d, this.f4313e, d10, this.f4314f, this.f4315g, this.f4316h);
            t2.a0.g1(new Handler(this.f4313e), new Runnable() { // from class: E3.z
                @Override // java.lang.Runnable
                public final void run() {
                    d10.N(a10);
                }
            });
            return d10;
        }

        public a c(Looper looper) {
            this.f4313e = (Looper) AbstractC6614a.e(looper);
            return this;
        }

        public a d(Bundle bundle) {
            this.f4311c = new Bundle((Bundle) AbstractC6614a.e(bundle));
            return this;
        }

        public a e(c cVar) {
            this.f4312d = (c) AbstractC6614a.e(cVar);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface d {
        boolean A();

        boolean A0();

        void B(Surface surface);

        int B0();

        void C(C6077I c6077i);

        void C0(int i10, C6071C c6071c);

        boolean D();

        void D0(List list, int i10, long j10);

        long E();

        void E0(int i10);

        void F(boolean z10, int i10);

        long F0();

        void G();

        long G0();

        void H(InterfaceC6084P.d dVar);

        void H0(int i10, List list);

        int I();

        long I0();

        void J();

        C6077I J0();

        void K();

        int K0();

        void L(List list, boolean z10);

        void L0(SurfaceView surfaceView);

        void M();

        void M0(int i10, int i11);

        void N(int i10);

        void N0(int i10, int i11, int i12);

        void O(SurfaceView surfaceView);

        void O0(List list);

        void P(q2.d0 d0Var);

        boolean P0();

        void Q(int i10, int i11, List list);

        boolean Q0();

        void R(int i10);

        long R0();

        void S();

        void S0(int i10);

        void T(int i10, int i11);

        void T0();

        void U();

        void U0();

        void V(boolean z10);

        C6077I V0();

        void W();

        void W0(C6088c c6088c, boolean z10);

        void X(int i10);

        long X0();

        q2.h0 Y();

        U6 Y0();

        boolean Z();

        com.google.common.util.concurrent.p Z0(T6 t62, Bundle bundle);

        void a();

        void a0(InterfaceC6084P.d dVar);

        Bundle a1();

        C6407e b0();

        C6083O c();

        int c0();

        void d0(C6071C c6071c, boolean z10);

        void e(C6083O c6083o);

        void e0(boolean z10);

        void f0(C6071C c6071c, long j10);

        int g0();

        long getCurrentPosition();

        C6101p getDeviceInfo();

        long getDuration();

        q2.Y h0();

        void i0();

        boolean isPlaying();

        q2.d0 j0();

        void k0();

        void l0(TextureView textureView);

        int m0();

        long n0();

        void o0(int i10, long j10);

        int p();

        InterfaceC6084P.b p0();

        void pause();

        boolean q();

        boolean q0();

        void r0(boolean z10);

        void s();

        long s0();

        void stop();

        void t(float f10);

        long t0();

        void u();

        int u0();

        void v(int i10);

        void v0(TextureView textureView);

        void w(float f10);

        q2.l0 w0();

        int x();

        float x0();

        C6082N y();

        C6088c y0();

        void z(long j10);

        void z0(int i10, int i11);
    }

    A(Context context, Y6 y62, Bundle bundle, c cVar, Looper looper, b bVar, InterfaceC6621h interfaceC6621h, int i10, long j10) {
        AbstractC6614a.f(context, "context must not be null");
        AbstractC6614a.f(y62, "token must not be null");
        AbstractC6635w.g("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + t2.a0.f60566e + "]");
        this.f4300a = new Y.d();
        this.f4305f = -9223372036854775807L;
        this.f4303d = cVar;
        this.f4304e = new Handler(looper);
        this.f4308i = bVar;
        this.f4307h = i10;
        d dVarB1 = b1(context, y62, bundle, looper, interfaceC6621h, j10);
        this.f4302c = dVarB1;
        dVarB1.S();
    }

    public static /* synthetic */ void Z0(A a10, c cVar) {
        a10.getClass();
        cVar.o0(a10);
    }

    private static com.google.common.util.concurrent.p a1() {
        return com.google.common.util.concurrent.j.d(new X6(-100));
    }

    public static void j1(Future future) {
        if (future.cancel(false)) {
            return;
        }
        try {
            ((A) com.google.common.util.concurrent.j.b(future)).a();
        } catch (CancellationException | ExecutionException e10) {
            AbstractC6635w.j("MediaController", "MediaController future failed (so we couldn't release it)", e10);
        }
    }

    private void m1() {
        AbstractC6614a.h(Looper.myLooper() == m(), "MediaController method is called from a wrong thread. See javadoc of MediaController for details.");
    }

    @Override // q2.InterfaceC6084P
    public final boolean A0() {
        m1();
        return g1() && this.f4302c.A0();
    }

    @Override // q2.InterfaceC6084P
    public final void B(Surface surface) {
        m1();
        if (g1()) {
            this.f4302c.B(surface);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final int B0() {
        m1();
        if (g1()) {
            return this.f4302c.B0();
        }
        return -1;
    }

    @Override // q2.InterfaceC6084P
    public final void C(C6077I c6077i) {
        m1();
        AbstractC6614a.f(c6077i, "playlistMetadata must not be null");
        if (g1()) {
            this.f4302c.C(c6077i);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void C0(int i10, C6071C c6071c) {
        m1();
        if (g1()) {
            this.f4302c.C0(i10, c6071c);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final boolean D() {
        m1();
        return g1() && this.f4302c.D();
    }

    @Override // q2.InterfaceC6084P
    public final void D0(List list, int i10, long j10) {
        m1();
        AbstractC6614a.f(list, "mediaItems must not be null");
        for (int i11 = 0; i11 < list.size(); i11++) {
            AbstractC6614a.b(list.get(i11) != null, "items must not contain null, index=" + i11);
        }
        if (g1()) {
            this.f4302c.D0(list, i10, j10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final long E() {
        m1();
        if (g1()) {
            return this.f4302c.E();
        }
        return 0L;
    }

    @Override // q2.InterfaceC6084P
    public final void E0(int i10) {
        m1();
        if (g1()) {
            this.f4302c.E0(i10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void F(boolean z10, int i10) {
        m1();
        if (g1()) {
            this.f4302c.F(z10, i10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final long F0() {
        m1();
        if (g1()) {
            return this.f4302c.F0();
        }
        return 0L;
    }

    @Override // q2.InterfaceC6084P
    public final void G() {
        m1();
        if (g1()) {
            this.f4302c.G();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final long G0() {
        m1();
        if (g1()) {
            return this.f4302c.G0();
        }
        return 0L;
    }

    @Override // q2.InterfaceC6084P
    public final void H(InterfaceC6084P.d dVar) {
        m1();
        AbstractC6614a.f(dVar, "listener must not be null");
        this.f4302c.H(dVar);
    }

    @Override // q2.InterfaceC6084P
    public final void H0(int i10, List list) {
        m1();
        if (g1()) {
            this.f4302c.H0(i10, list);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final int I() {
        m1();
        if (g1()) {
            return this.f4302c.I();
        }
        return 0;
    }

    @Override // q2.InterfaceC6084P
    public final long I0() {
        m1();
        if (g1()) {
            return this.f4302c.I0();
        }
        return 0L;
    }

    @Override // q2.InterfaceC6084P
    public final void J() {
        m1();
        if (g1()) {
            this.f4302c.J();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final C6077I J0() {
        m1();
        return g1() ? this.f4302c.J0() : C6077I.f56472K;
    }

    @Override // q2.InterfaceC6084P
    public final void K() {
        m1();
        if (g1()) {
            this.f4302c.K();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final int K0() {
        m1();
        if (g1()) {
            return this.f4302c.K0();
        }
        return -1;
    }

    @Override // q2.InterfaceC6084P
    public final void L(List list, boolean z10) {
        m1();
        AbstractC6614a.f(list, "mediaItems must not be null");
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC6614a.b(list.get(i10) != null, "items must not contain null, index=" + i10);
        }
        if (g1()) {
            this.f4302c.L(list, z10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void L0(SurfaceView surfaceView) {
        m1();
        if (g1()) {
            this.f4302c.L0(surfaceView);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring clearVideoSurfaceView().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void M() {
        m1();
        if (g1()) {
            this.f4302c.M();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void M0(int i10, int i11) {
        m1();
        if (g1()) {
            this.f4302c.M0(i10, i11);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void N(int i10) {
        m1();
        if (g1()) {
            this.f4302c.N(i10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void N0(int i10, int i11, int i12) {
        m1();
        if (g1()) {
            this.f4302c.N0(i10, i11, i12);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void O(SurfaceView surfaceView) {
        m1();
        if (g1()) {
            this.f4302c.O(surfaceView);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setVideoSurfaceView().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void O0(List list) {
        m1();
        if (g1()) {
            this.f4302c.O0(list);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void P(q2.d0 d0Var) {
        m1();
        if (!g1()) {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        this.f4302c.P(d0Var);
    }

    @Override // q2.InterfaceC6084P
    public final boolean P0() {
        m1();
        if (g1()) {
            return this.f4302c.P0();
        }
        return false;
    }

    @Override // q2.InterfaceC6084P
    public final void Q(int i10, int i11, List list) {
        m1();
        if (g1()) {
            this.f4302c.Q(i10, i11, list);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final boolean Q0() {
        m1();
        return g1() && this.f4302c.Q0();
    }

    @Override // q2.InterfaceC6084P
    public final void R(int i10) {
        m1();
        if (g1()) {
            this.f4302c.R(i10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final long R0() {
        m1();
        if (g1()) {
            return this.f4302c.R0();
        }
        return 0L;
    }

    @Override // q2.InterfaceC6084P
    public final void S0(int i10) {
        m1();
        if (g1()) {
            this.f4302c.S0(i10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void T(int i10, int i11) {
        m1();
        if (g1()) {
            this.f4302c.T(i10, i11);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void T0() {
        m1();
        if (g1()) {
            this.f4302c.T0();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void U() {
        m1();
        if (g1()) {
            this.f4302c.U();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void U0() {
        m1();
        if (g1()) {
            this.f4302c.U0();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void V(boolean z10) {
        m1();
        if (g1()) {
            this.f4302c.V(z10);
        }
    }

    @Override // q2.InterfaceC6084P
    public final C6077I V0() {
        m1();
        return g1() ? this.f4302c.V0() : C6077I.f56472K;
    }

    @Override // q2.InterfaceC6084P
    public final void W() {
        m1();
        if (g1()) {
            this.f4302c.W();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void W0(C6088c c6088c, boolean z10) {
        m1();
        if (g1()) {
            this.f4302c.W0(c6088c, z10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void X(int i10) {
        m1();
        if (g1()) {
            this.f4302c.X(i10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final long X0() {
        m1();
        if (g1()) {
            return this.f4302c.X0();
        }
        return 0L;
    }

    @Override // q2.InterfaceC6084P
    public final q2.h0 Y() {
        m1();
        return g1() ? this.f4302c.Y() : q2.h0.f56877b;
    }

    @Override // q2.InterfaceC6084P
    public final boolean Y0() {
        m1();
        q2.Y yH0 = h0();
        return !yH0.u() && yH0.r(K0(), this.f4300a).g();
    }

    @Override // q2.InterfaceC6084P
    public final boolean Z() {
        m1();
        return g1() && this.f4302c.Z();
    }

    public final void a() {
        m1();
        if (this.f4301b) {
            return;
        }
        AbstractC6635w.g("MediaController", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + t2.a0.f60566e + "] [" + AbstractC6076H.b() + "]");
        this.f4301b = true;
        this.f4304e.removeCallbacksAndMessages(null);
        try {
            this.f4302c.a();
        } catch (Exception e10) {
            AbstractC6635w.c("MediaController", "Exception while releasing impl", e10);
        }
        if (this.f4306g) {
            i1(new InterfaceC6627n() { // from class: E3.y
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    A.Z0(this.f5602a, (A.c) obj);
                }
            });
        } else {
            this.f4306g = true;
            this.f4308i.a();
        }
    }

    @Override // q2.InterfaceC6084P
    public final void a0(InterfaceC6084P.d dVar) {
        AbstractC6614a.f(dVar, "listener must not be null");
        this.f4302c.a0(dVar);
    }

    @Override // q2.InterfaceC6084P
    public final C6071C b() {
        q2.Y yH0 = h0();
        if (yH0.u()) {
            return null;
        }
        return yH0.r(K0(), this.f4300a).f56680c;
    }

    @Override // q2.InterfaceC6084P
    public final C6407e b0() {
        m1();
        return g1() ? this.f4302c.b0() : C6407e.f59083d;
    }

    d b1(Context context, Y6 y62, Bundle bundle, Looper looper, InterfaceC6621h interfaceC6621h, long j10) {
        return y62.j() ? new B2(context, this, y62, bundle, looper, (InterfaceC6621h) AbstractC6614a.e(interfaceC6621h), j10) : new S1(context, this, y62, bundle, looper);
    }

    @Override // q2.InterfaceC6084P
    public final C6083O c() {
        m1();
        return g1() ? this.f4302c.c() : C6083O.f56598d;
    }

    @Override // q2.InterfaceC6084P
    public final int c0() {
        m1();
        if (g1()) {
            return this.f4302c.c0();
        }
        return -1;
    }

    public final U6 c1() {
        m1();
        return !g1() ? U6.f4986b : this.f4302c.Y0();
    }

    @Override // q2.InterfaceC6084P
    public final void d0(C6071C c6071c, boolean z10) {
        m1();
        AbstractC6614a.f(c6071c, "mediaItems must not be null");
        if (g1()) {
            this.f4302c.d0(c6071c, z10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    Bundle d1() {
        return this.f4302c.a1();
    }

    @Override // q2.InterfaceC6084P
    public final void e(C6083O c6083o) {
        m1();
        AbstractC6614a.f(c6083o, "playbackParameters must not be null");
        if (g1()) {
            this.f4302c.e(c6083o);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void e0(boolean z10) {
        m1();
        if (g1()) {
            this.f4302c.e0(z10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    int e1() {
        return this.f4307h;
    }

    @Override // q2.InterfaceC6084P
    public final void f0(C6071C c6071c, long j10) {
        m1();
        AbstractC6614a.f(c6071c, "mediaItems must not be null");
        if (g1()) {
            this.f4302c.f0(c6071c, j10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    final long f1() {
        return this.f4305f;
    }

    @Override // q2.InterfaceC6084P
    public final boolean g() {
        return false;
    }

    @Override // q2.InterfaceC6084P
    public final int g0() {
        m1();
        if (g1()) {
            return this.f4302c.g0();
        }
        return 0;
    }

    public final boolean g1() {
        return this.f4302c.A();
    }

    @Override // q2.InterfaceC6084P
    public final long getCurrentPosition() {
        m1();
        if (g1()) {
            return this.f4302c.getCurrentPosition();
        }
        return 0L;
    }

    @Override // q2.InterfaceC6084P
    public final C6101p getDeviceInfo() {
        m1();
        return !g1() ? C6101p.f56928e : this.f4302c.getDeviceInfo();
    }

    @Override // q2.InterfaceC6084P
    public final long getDuration() {
        m1();
        if (g1()) {
            return this.f4302c.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // q2.InterfaceC6084P
    public final q2.Y h0() {
        m1();
        return g1() ? this.f4302c.h0() : q2.Y.f56642a;
    }

    final void h1() {
        AbstractC6614a.g(Looper.myLooper() == m());
        AbstractC6614a.g(!this.f4306g);
        this.f4306g = true;
        this.f4308i.b();
    }

    @Override // q2.InterfaceC6084P
    public final void i0() {
        m1();
        if (g1()) {
            this.f4302c.i0();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i1(InterfaceC6627n interfaceC6627n) {
        AbstractC6614a.g(Looper.myLooper() == m());
        interfaceC6627n.accept(this.f4303d);
    }

    @Override // q2.InterfaceC6084P
    public final boolean isPlaying() {
        m1();
        return g1() && this.f4302c.isPlaying();
    }

    @Override // q2.InterfaceC6084P
    public final q2.d0 j0() {
        m1();
        return !g1() ? q2.d0.f56766F : this.f4302c.j0();
    }

    @Override // q2.InterfaceC6084P
    public final boolean k(int i10) {
        return p0().c(i10);
    }

    @Override // q2.InterfaceC6084P
    public final void k0() {
        m1();
        if (g1()) {
            this.f4302c.k0();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    final void k1(Runnable runnable) {
        t2.a0.g1(this.f4304e, runnable);
    }

    @Override // q2.InterfaceC6084P
    public final boolean l() {
        m1();
        q2.Y yH0 = h0();
        return !yH0.u() && yH0.r(K0(), this.f4300a).f56686i;
    }

    @Override // q2.InterfaceC6084P
    public final void l0(TextureView textureView) {
        m1();
        if (g1()) {
            this.f4302c.l0(textureView);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setVideoTextureView().");
        }
    }

    public final com.google.common.util.concurrent.p l1(T6 t62, Bundle bundle) {
        m1();
        AbstractC6614a.f(t62, "command must not be null");
        AbstractC6614a.b(t62.f4974a == 0, "command must be a custom command");
        return g1() ? this.f4302c.Z0(t62, bundle) : a1();
    }

    @Override // q2.InterfaceC6084P
    public final Looper m() {
        return this.f4304e.getLooper();
    }

    @Override // q2.InterfaceC6084P
    public final int m0() {
        m1();
        if (g1()) {
            return this.f4302c.m0();
        }
        return 0;
    }

    @Override // q2.InterfaceC6084P
    public final long n0() {
        m1();
        if (g1()) {
            return this.f4302c.n0();
        }
        return -9223372036854775807L;
    }

    @Override // q2.InterfaceC6084P
    public final void o0(int i10, long j10) {
        m1();
        if (g1()) {
            this.f4302c.o0(i10, j10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final int p() {
        m1();
        if (g1()) {
            return this.f4302c.p();
        }
        return 1;
    }

    @Override // q2.InterfaceC6084P
    public final InterfaceC6084P.b p0() {
        m1();
        return !g1() ? InterfaceC6084P.b.f56604b : this.f4302c.p0();
    }

    @Override // q2.InterfaceC6084P
    public final void pause() {
        m1();
        if (g1()) {
            this.f4302c.pause();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final boolean q() {
        m1();
        return g1() && this.f4302c.q();
    }

    @Override // q2.InterfaceC6084P
    public final boolean q0() {
        m1();
        return g1() && this.f4302c.q0();
    }

    @Override // q2.InterfaceC6084P
    public final boolean r() {
        m1();
        q2.Y yH0 = h0();
        return !yH0.u() && yH0.r(K0(), this.f4300a).f56685h;
    }

    @Override // q2.InterfaceC6084P
    public final void r0(boolean z10) {
        m1();
        if (g1()) {
            this.f4302c.r0(z10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void s() {
        m1();
        if (g1()) {
            this.f4302c.s();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final long s0() {
        m1();
        if (g1()) {
            return this.f4302c.s0();
        }
        return 0L;
    }

    @Override // q2.InterfaceC6084P
    public final void stop() {
        m1();
        if (g1()) {
            this.f4302c.stop();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void t(float f10) {
        m1();
        if (g1()) {
            this.f4302c.t(f10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final long t0() {
        m1();
        if (g1()) {
            return this.f4302c.t0();
        }
        return -9223372036854775807L;
    }

    @Override // q2.InterfaceC6084P
    public final void u() {
        m1();
        if (g1()) {
            this.f4302c.u();
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final int u0() {
        m1();
        if (g1()) {
            return this.f4302c.u0();
        }
        return -1;
    }

    @Override // q2.InterfaceC6084P
    public final void v(int i10) {
        m1();
        if (g1()) {
            this.f4302c.v(i10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void v0(TextureView textureView) {
        m1();
        if (g1()) {
            this.f4302c.v0(textureView);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring clearVideoTextureView().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void w(float f10) {
        m1();
        AbstractC6614a.b(f10 >= 0.0f && f10 <= 1.0f, "volume must be between 0 and 1");
        if (g1()) {
            this.f4302c.w(f10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final q2.l0 w0() {
        m1();
        return g1() ? this.f4302c.w0() : q2.l0.f56919e;
    }

    @Override // q2.InterfaceC6084P
    public final int x() {
        m1();
        if (g1()) {
            return this.f4302c.x();
        }
        return 0;
    }

    @Override // q2.InterfaceC6084P
    public final float x0() {
        m1();
        if (g1()) {
            return this.f4302c.x0();
        }
        return 1.0f;
    }

    @Override // q2.InterfaceC6084P
    public final C6082N y() {
        m1();
        if (g1()) {
            return this.f4302c.y();
        }
        return null;
    }

    @Override // q2.InterfaceC6084P
    public final C6088c y0() {
        m1();
        return !g1() ? C6088c.f56745h : this.f4302c.y0();
    }

    @Override // q2.InterfaceC6084P
    public final void z(long j10) {
        m1();
        if (g1()) {
            this.f4302c.z(j10);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // q2.InterfaceC6084P
    public final void z0(int i10, int i11) {
        m1();
        if (g1()) {
            this.f4302c.z0(i10, i11);
        } else {
            AbstractC6635w.i("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        default com.google.common.util.concurrent.p O(A a10, List list) {
            return com.google.common.util.concurrent.j.d(new X6(-6));
        }

        default com.google.common.util.concurrent.p q0(A a10, T6 t62, Bundle bundle) {
            return com.google.common.util.concurrent.j.d(new X6(-6));
        }

        default void o0(A a10) {
        }

        default void G(A a10, List list) {
        }

        default void K(A a10, List list) {
        }

        default void U(A a10, V6 v62) {
        }

        default void a0(A a10, Bundle bundle) {
        }

        default void i0(A a10, U6 u62) {
        }

        default void j0(A a10, PendingIntent pendingIntent) {
        }
    }
}
