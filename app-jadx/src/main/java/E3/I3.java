package E3;

import E3.C1375h3;
import E3.I3;
import E3.M6;
import E3.S6;
import F3.n;
import F3.q;
import P9.AbstractC2011u;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import q2.AbstractC6076H;
import q2.C6071C;
import q2.C6077I;
import q2.C6082N;
import q2.C6083O;
import q2.C6088c;
import q2.C6101p;
import q2.InterfaceC6084P;
import s2.C6407e;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.InterfaceC6621h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class I3 {

    /* JADX INFO: renamed from: G */
    private static final X6 f4479G = new X6(1);

    /* JADX INFO: renamed from: A */
    private long f4480A;

    /* JADX INFO: renamed from: B */
    private boolean f4481B;

    /* JADX INFO: renamed from: C */
    private AbstractC2011u f4482C;

    /* JADX INFO: renamed from: D */
    private AbstractC2011u f4483D;

    /* JADX INFO: renamed from: E */
    private Bundle f4484E;

    /* JADX INFO: renamed from: F */
    private C6082N f4485F;

    /* JADX INFO: renamed from: a */
    private final Object f4486a = new Object();

    /* JADX INFO: renamed from: b */
    private final Uri f4487b;

    /* JADX INFO: renamed from: c */
    private final c f4488c;

    /* JADX INFO: renamed from: d */
    private final b f4489d;

    /* JADX INFO: renamed from: e */
    private final C1375h3.d f4490e;

    /* JADX INFO: renamed from: f */
    private final Context f4491f;

    /* JADX INFO: renamed from: g */
    private final I6 f4492g;

    /* JADX INFO: renamed from: h */
    private final M4 f4493h;

    /* JADX INFO: renamed from: i */
    private final String f4494i;

    /* JADX INFO: renamed from: j */
    private final Y6 f4495j;

    /* JADX INFO: renamed from: k */
    private final C1375h3 f4496k;

    /* JADX INFO: renamed from: l */
    private final Handler f4497l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC6621h f4498m;

    /* JADX INFO: renamed from: n */
    private final Runnable f4499n;

    /* JADX INFO: renamed from: o */
    private final Handler f4500o;

    /* JADX INFO: renamed from: p */
    private final boolean f4501p;

    /* JADX INFO: renamed from: q */
    private final boolean f4502q;

    /* JADX INFO: renamed from: r */
    private final AbstractC2011u f4503r;

    /* JADX INFO: renamed from: s */
    private M6 f4504s;

    /* JADX INFO: renamed from: t */
    private N6 f4505t;

    /* JADX INFO: renamed from: u */
    private PendingIntent f4506u;

    /* JADX INFO: renamed from: v */
    private d f4507v;

    /* JADX INFO: renamed from: w */
    private C1375h3.h f4508w;

    /* JADX INFO: renamed from: x */
    private C1375h3.g f4509x;

    /* JADX INFO: renamed from: y */
    private ServiceC1321a5 f4510y;

    /* JADX INFO: renamed from: z */
    private boolean f4511z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1375h3.g f4512a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f4513b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC6084P.b f4514c;

        a(C1375h3.g gVar, boolean z10, InterfaceC6084P.b bVar) {
            this.f4512a = gVar;
            this.f4513b = z10;
            this.f4514c = bVar;
        }

        public static /* synthetic */ void b(a aVar, C1375h3.i iVar, boolean z10, C1375h3.g gVar, InterfaceC6084P.b bVar) {
            L6.i(I3.this.f4505t, iVar);
            t2.a0.B0(I3.this.f4505t);
            if (z10) {
                I3.this.F0(gVar, bVar);
            }
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            if (th2 instanceof UnsupportedOperationException) {
                AbstractC6635w.j("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
            } else {
                AbstractC6635w.e("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
            }
            t2.a0.B0(I3.this.f4505t);
            if (this.f4513b) {
                I3.this.F0(this.f4512a, this.f4514c);
            }
        }

        @Override // com.google.common.util.concurrent.i
        /* JADX INFO: renamed from: c */
        public void onSuccess(final C1375h3.i iVar) {
            I3 i32 = I3.this;
            final C1375h3.g gVar = this.f4512a;
            final boolean z10 = this.f4513b;
            final InterfaceC6084P.b bVar = this.f4514c;
            i32.L(gVar, new Runnable() { // from class: E3.H3
                @Override // java.lang.Runnable
                public final void run() {
                    I3.a.b(this.f4461a, iVar, z10, gVar, bVar);
                }
            }).run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends Handler {

        /* JADX INFO: renamed from: a */
        private Runnable f4516a;

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ void a(b bVar, C1375h3.g gVar, KeyEvent keyEvent) {
            if (I3.this.r0(gVar)) {
                I3.this.K(keyEvent, false, false);
            } else {
                I3.this.f4493h.L0((q.b) AbstractC6614a.e(gVar.g()));
            }
            bVar.f4516a = null;
        }

        public Runnable b() {
            Runnable runnable = this.f4516a;
            if (runnable == null) {
                return null;
            }
            removeCallbacks(runnable);
            Runnable runnable2 = this.f4516a;
            this.f4516a = null;
            return runnable2;
        }

        public void c() {
            Runnable runnableB = b();
            if (runnableB != null) {
                t2.a0.g1(this, runnableB);
            }
        }

        public boolean d() {
            return this.f4516a != null;
        }

        public void e(final C1375h3.g gVar, final KeyEvent keyEvent) {
            Runnable runnable = new Runnable() { // from class: E3.J3
                @Override // java.lang.Runnable
                public final void run() {
                    I3.b.a(this.f4543a, gVar, keyEvent);
                }
            };
            this.f4516a = runnable;
            postDelayed(runnable, ViewConfiguration.getDoubleTapTimeout());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends Handler {

        /* JADX INFO: renamed from: a */
        private boolean f4518a;

        /* JADX INFO: renamed from: b */
        private boolean f4519b;

        public c(Looper looper) {
            super(looper);
            this.f4518a = true;
            this.f4519b = true;
        }

        public boolean a() {
            return hasMessages(1);
        }

        public void b(boolean z10, boolean z11) {
            boolean z12 = false;
            this.f4518a = this.f4518a && z10;
            if (this.f4519b && z11) {
                z12 = true;
            }
            this.f4519b = z12;
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                throw new IllegalStateException("Invalid message what=" + message.what);
            }
            I3 i32 = I3.this;
            i32.f4504s = i32.f4504s.w(I3.this.j0().g1(), I3.this.j0().c1(), I3.this.f4504s.f4676k);
            I3 i33 = I3.this;
            i33.S(i33.f4504s, this.f4518a, this.f4519b);
            this.f4518a = true;
            this.f4519b = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d implements InterfaceC6084P.d {

        /* JADX INFO: renamed from: a */
        private final WeakReference f4521a;

        /* JADX INFO: renamed from: b */
        private final WeakReference f4522b;

        public d(I3 i32, N6 n62) {
            this.f4521a = new WeakReference(i32);
            this.f4522b = new WeakReference(n62);
        }

        private I3 J0() {
            return (I3) this.f4521a.get();
        }

        @Override // q2.InterfaceC6084P.d
        public void C(final int i10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.j(i3J0.f4504s.f4685t, i3J0.f4504s.f4686u, i10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.f4
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i11) {
                    fVar.A(i11, i10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void E(final C6071C c6071c, final int i10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.h(i10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.a4
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i11) {
                    fVar.k(i11, c6071c, i10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void F(final int i10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.p(i10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.T3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i11) {
                    fVar.h(i11, i10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void H(final C6082N c6082n) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.m(c6082n);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.d4
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.i(i10, c6082n);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void I(InterfaceC6084P.b bVar) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.o0(bVar);
        }

        @Override // q2.InterfaceC6084P.d
        public void J(final int i10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            final N6 n62 = (N6) this.f4522b.get();
            if (n62 == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.l(i10, n62.y());
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.O3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i11) {
                    fVar.g(i11, i10, n62.y());
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void M(final boolean z10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.t(z10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.L3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.p(i10, z10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void P(final int i10, final boolean z10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.d(i10, z10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.b4
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i11) {
                    fVar.n(i11, i10, z10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void R(final long j10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.q(j10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.W3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.t(i10, j10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void S(final q2.Y y10, final int i10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            N6 n62 = (N6) this.f4522b.get();
            if (n62 == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.w(y10, n62.c1(), i10);
            i3J0.f4488c.b(false, true);
            i3J0.U(new e() { // from class: E3.P3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i11) {
                    fVar.r(i11, y10, i10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void T() {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            C1363g c1363gF5 = i3J0.f4492g.f5();
            AbstractC2011u abstractC2011uJ = c1363gF5.j();
            for (int i10 = 0; i10 < abstractC2011uJ.size(); i10++) {
                C1375h3.g gVar = (C1375h3.g) abstractC2011uJ.get(i10);
                if (c1363gF5.l(gVar) == null) {
                    i3J0.V(gVar, new e() { // from class: E3.Z3
                        @Override // E3.I3.e
                        public final void a(C1375h3.f fVar, int i11) {
                            fVar.d(i11);
                        }
                    });
                }
            }
        }

        @Override // q2.InterfaceC6084P.d
        public void V(final C6077I c6077i) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.i(c6077i);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.U3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.c(i10, c6077i);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void Z(final q2.d0 d0Var) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.x(d0Var);
            i3J0.f4488c.b(true, true);
            i3J0.W(new e() { // from class: E3.g4
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.x(i10, d0Var);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void b(final q2.l0 l0Var) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            i3J0.f4504s = i3J0.f4504s.y(l0Var);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.X3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.C(i10, l0Var);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void b0(final boolean z10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.e(z10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.h4
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.G(i10, z10);
                }
            });
            i3J0.N0();
        }

        @Override // q2.InterfaceC6084P.d
        public void c0(final C6077I c6077i) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            i3J0.f4504s = i3J0.f4504s.n(c6077i);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.K3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.w(i10, c6077i);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void d0(final float f10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            i3J0.f4504s = i3J0.f4504s.z(f10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.R3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.y(i10, f10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void e0(final C6088c c6088c) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.a(c6088c);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.Q3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.E(i10, c6088c);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void g0(final q2.h0 h0Var) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.b(h0Var);
            i3J0.f4488c.b(true, false);
            i3J0.W(new e() { // from class: E3.N3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.B(i10, h0Var);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void l0(final long j10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.r(j10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.Y3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.e(i10, j10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void m0(final InterfaceC6084P.e eVar, final InterfaceC6084P.e eVar2, final int i10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.o(eVar, eVar2, i10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.c4
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i11) {
                    fVar.f(i11, eVar, eVar2, i10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void n(final C6083O c6083o) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.k(c6083o);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.S3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.j(i10, c6083o);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void n0(final C6101p c6101p) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.c(c6101p);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.M3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.u(i10, c6101p);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void r0(long j10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.g(j10);
            i3J0.f4488c.b(true, true);
        }

        @Override // q2.InterfaceC6084P.d
        public void s0(final boolean z10, final int i10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.j(z10, i10, i3J0.f4504s.f4689x);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.e4
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i11) {
                    fVar.m(i11, z10, i10);
                }
            });
        }

        @Override // q2.InterfaceC6084P.d
        public void t(C6407e c6407e) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = new M6.b(i3J0.f4504s).c(c6407e).a();
            i3J0.f4488c.b(true, true);
        }

        @Override // q2.InterfaceC6084P.d
        public void y0(final boolean z10) {
            I3 i3J0 = J0();
            if (i3J0 == null) {
                return;
            }
            i3J0.U0();
            if (((N6) this.f4522b.get()) == null) {
                return;
            }
            i3J0.f4504s = i3J0.f4504s.f(z10);
            i3J0.f4488c.b(true, true);
            i3J0.U(new e() { // from class: E3.V3
                @Override // E3.I3.e
                public final void a(C1375h3.f fVar, int i10) {
                    fVar.q(i10, z10);
                }
            });
            i3J0.N0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface e {
        void a(C1375h3.f fVar, int i10);
    }

    public I3(C1375h3 c1375h3, Context context, String str, InterfaceC6084P interfaceC6084P, PendingIntent pendingIntent, AbstractC2011u abstractC2011u, AbstractC2011u abstractC2011u2, AbstractC2011u abstractC2011u3, C1375h3.d dVar, Bundle bundle, Bundle bundle2, InterfaceC6621h interfaceC6621h, boolean z10, boolean z11) {
        AbstractC6635w.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + t2.a0.f60566e + "]");
        this.f4496k = c1375h3;
        this.f4491f = context;
        this.f4494i = str;
        this.f4506u = pendingIntent;
        this.f4482C = abstractC2011u;
        this.f4483D = abstractC2011u2;
        this.f4503r = abstractC2011u3;
        this.f4490e = dVar;
        this.f4484E = bundle2;
        this.f4498m = interfaceC6621h;
        this.f4501p = z10;
        this.f4502q = z11;
        I6 i62 = new I6(this);
        this.f4492g = i62;
        this.f4500o = new Handler(Looper.getMainLooper());
        Looper looperM = interfaceC6084P.m();
        Handler handler = new Handler(looperM);
        this.f4497l = handler;
        this.f4504s = M6.f4628F;
        this.f4488c = new c(looperM);
        this.f4489d = new b(looperM);
        Uri uriBuild = new Uri.Builder().scheme(I3.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f4487b = uriBuild;
        C1375h3.e eVarA = new C1375h3.e.a(c1375h3).a();
        M4 m42 = new M4(this, uriBuild, handler, bundle, z10, abstractC2011u, abstractC2011u2, eVarA.f5319b, eVarA.f5320c, bundle2);
        this.f4493h = m42;
        this.f4495j = new Y6(Process.myUid(), 0, 1008000300, 5, context.getPackageName(), i62, bundle, m42.K0().e().e());
        final N6 n62 = new N6(interfaceC6084P);
        this.f4505t = n62;
        t2.a0.g1(handler, new Runnable() { // from class: E3.u3
            @Override // java.lang.Runnable
            public final void run() {
                this.f5541a.Q0(null, n62);
            }
        });
        this.f4480A = 3000L;
        this.f4499n = new Runnable() { // from class: E3.z3
            @Override // java.lang.Runnable
            public final void run() {
                this.f5618a.v0();
            }
        };
        t2.a0.g1(handler, new Runnable() { // from class: E3.A3
            @Override // java.lang.Runnable
            public final void run() {
                this.f4322a.N0();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(android.view.KeyEvent r3, boolean r4, final boolean r5) {
        /*
            r2 = this;
            E3.h3 r0 = r2.f4496k
            E3.h3$g r0 = r0.h()
            java.lang.Object r0 = t2.AbstractC6614a.e(r0)
            E3.h3$g r0 = (E3.C1375h3.g) r0
            int r3 = r3.getKeyCode()
            r1 = 85
            if (r3 == r1) goto L18
            r1 = 79
            if (r3 != r1) goto L1c
        L18:
            if (r4 == 0) goto L1c
            r3 = 87
        L1c:
            r4 = 126(0x7e, float:1.77E-43)
            if (r3 == r4) goto L6b
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 == r4) goto L65
            r4 = 272(0x110, float:3.81E-43)
            if (r3 == r4) goto L5f
            r4 = 273(0x111, float:3.83E-43)
            if (r3 == r4) goto L59
            switch(r3) {
                case 85: goto L43;
                case 86: goto L3d;
                case 87: goto L5f;
                case 88: goto L59;
                case 89: goto L37;
                case 90: goto L31;
                default: goto L2f;
            }
        L2f:
            r3 = 0
            return r3
        L31:
            E3.l3 r3 = new E3.l3
            r3.<init>()
            goto L70
        L37:
            E3.m3 r3 = new E3.m3
            r3.<init>()
            goto L70
        L3d:
            E3.n3 r3 = new E3.n3
            r3.<init>()
            goto L70
        L43:
            E3.N6 r3 = r2.j0()
            boolean r3 = r3.q0()
            if (r3 == 0) goto L53
            E3.C3 r3 = new E3.C3
            r3.<init>()
            goto L70
        L53:
            E3.D3 r3 = new E3.D3
            r3.<init>()
            goto L70
        L59:
            E3.k3 r3 = new E3.k3
            r3.<init>()
            goto L70
        L5f:
            E3.G3 r3 = new E3.G3
            r3.<init>()
            goto L70
        L65:
            E3.F3 r3 = new E3.F3
            r3.<init>()
            goto L70
        L6b:
            E3.E3 r3 = new E3.E3
            r3.<init>()
        L70:
            android.os.Handler r4 = r2.X()
            E3.o3 r1 = new E3.o3
            r1.<init>()
            t2.a0.g1(r4, r1)
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.I3.K(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public void K0(Runnable runnable) {
        t2.a0.g1(X(), runnable);
    }

    public void N0() {
        this.f4497l.removeCallbacks(this.f4499n);
        if (!this.f4502q || this.f4480A <= 0) {
            return;
        }
        if (this.f4505t.isPlaying() || this.f4505t.q()) {
            this.f4497l.postDelayed(this.f4499n, this.f4480A);
        }
    }

    static InterfaceC6084P.b P(InterfaceC6084P.b bVar) {
        if (bVar == null) {
            return null;
        }
        InterfaceC6084P.b.a aVarB = InterfaceC6084P.b.f56604b.b();
        if (bVar.c(16)) {
            aVarB.a(16);
        }
        if (bVar.c(17)) {
            aVarB.a(17);
        }
        if (bVar.c(18)) {
            aVarB.a(18);
        }
        if (bVar.c(21)) {
            aVarB.a(21);
        }
        if (bVar.c(22)) {
            aVarB.a(22);
        }
        if (bVar.c(23)) {
            aVarB.a(23);
        }
        if (bVar.c(30)) {
            aVarB.a(30);
        }
        if (bVar.c(32)) {
            aVarB.a(32);
        }
        return aVarB.f();
    }

    static M6 Q(M6 m62, C6082N c6082n) {
        M6 m6L = m62.l(1, c6082n);
        W6 w62 = m62.f4668c;
        return m6L.s(new W6(w62.f5042a, w62.f5043b, w62.f5044c, w62.f5045d, 0L, 0, 0L, w62.f5049h, w62.f5050i, 0L));
    }

    public void Q0(final N6 n62, final N6 n63) {
        this.f4505t = n63;
        if (n62 != null) {
            n62.H((InterfaceC6084P.d) AbstractC6614a.i(this.f4507v));
        }
        d dVar = new d(this, n63);
        n63.a0(dVar);
        this.f4507v = dVar;
        U(new e() { // from class: E3.q3
            @Override // E3.I3.e
            public final void a(C1375h3.f fVar, int i10) {
                fVar.D(i10, n62, n63);
            }
        });
        if (n62 == null) {
            this.f4493h.b1();
        }
        this.f4504s = n63.a1();
        o0(n63.p0());
    }

    private void R(final W6 w62) {
        C1363g c1363gF5 = this.f4492g.f5();
        AbstractC2011u abstractC2011uJ = c1363gF5.j();
        for (int i10 = 0; i10 < abstractC2011uJ.size(); i10++) {
            final C1375h3.g gVar = (C1375h3.g) abstractC2011uJ.get(i10);
            if (c1363gF5.l(gVar) == null) {
                final boolean zQ = c1363gF5.q(gVar, 16);
                final boolean zQ2 = c1363gF5.q(gVar, 17);
                V(gVar, new e() { // from class: E3.r3
                    @Override // E3.I3.e
                    public final void a(C1375h3.f fVar, int i11) {
                        fVar.a(i11, w62, zQ, zQ2, gVar.e());
                    }
                });
            }
        }
        try {
            this.f4493h.H0().a(0, w62, true, true, 0);
        } catch (RemoteException e10) {
            AbstractC6635w.e("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public void S(M6 m62, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int iC;
        M6 m6D5 = this.f4492g.d5(m62);
        AbstractC2011u abstractC2011uJ = this.f4492g.f5().j();
        int i10 = 0;
        while (i10 < abstractC2011uJ.size()) {
            C1375h3.g gVar = (C1375h3.g) abstractC2011uJ.get(i10);
            try {
                C1363g c1363gF5 = this.f4492g.f5();
                S6 s6N = c1363gF5.n(gVar);
                if (s6N != null) {
                    iC = s6N.c();
                } else if (!q0(gVar)) {
                    return;
                } else {
                    iC = 0;
                }
                M6 m6M = c1363gF5.m(gVar);
                if (m6M != null) {
                    z12 = z10;
                    z13 = z11;
                } else {
                    C6082N c6082nL = c1363gF5.l(gVar);
                    if (c6082nL != null) {
                        m6M = Q(m6D5, c6082nL);
                        c1363gF5.w(gVar, m6M);
                    }
                    z12 = z10;
                    z13 = z11;
                    try {
                        ((C1375h3.f) AbstractC6614a.i(gVar.c())).z(iC, m6M == null ? m6D5 : m6M, L6.f(c1363gF5.i(gVar), j0().p0()), z12, z13);
                    } catch (DeadObjectException unused) {
                        z0(gVar);
                    } catch (RemoteException e10) {
                        e = e10;
                        AbstractC6635w.j("MediaSessionImpl", "Exception in " + gVar, e);
                    }
                }
            } catch (DeadObjectException unused2) {
                z12 = z10;
                z13 = z11;
            } catch (RemoteException e11) {
                e = e11;
                z12 = z10;
                z13 = z11;
            }
            i10++;
            z10 = z12;
            z11 = z13;
        }
    }

    private com.google.common.util.concurrent.p T(C1375h3.g gVar, e eVar) {
        int iL;
        com.google.common.util.concurrent.p pVarD;
        try {
            S6 s6N = this.f4492g.f5().n(gVar);
            if (s6N != null) {
                S6.a aVarA = s6N.a(f4479G);
                iL = aVarA.L();
                pVarD = aVarA;
            } else {
                if (!q0(gVar)) {
                    return com.google.common.util.concurrent.j.d(new X6(-100));
                }
                iL = 0;
                pVarD = com.google.common.util.concurrent.j.d(new X6(0));
            }
            C1375h3.f fVarC = gVar.c();
            if (fVarC != null) {
                eVar.a(fVarC, iL);
            }
            return pVarD;
        } catch (DeadObjectException unused) {
            z0(gVar);
            return com.google.common.util.concurrent.j.d(new X6(-100));
        } catch (RemoteException e10) {
            AbstractC6635w.j("MediaSessionImpl", "Exception in " + gVar, e10);
            return com.google.common.util.concurrent.j.d(new X6(-1));
        }
    }

    public void U(e eVar) {
        try {
            eVar.a(this.f4493h.H0(), 0);
        } catch (RemoteException e10) {
            AbstractC6635w.e("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public void U0() {
        if (Looper.myLooper() != this.f4497l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }

    public static /* synthetic */ void f(I3 i32, boolean z10, C1375h3.g gVar, Runnable runnable) {
        i32.getClass();
        if (z10) {
            Bundle bundle = Bundle.EMPTY;
            i32.O0(gVar, new T6("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", bundle), bundle);
        }
        runnable.run();
        i32.f4492g.f5().h(gVar);
    }

    public static /* synthetic */ void i(I3 i32) {
        d dVar = i32.f4507v;
        if (dVar != null) {
            i32.f4505t.H(dVar);
        }
    }

    public static /* synthetic */ void l(I3 i32) {
        C1375h3.h hVar = i32.f4508w;
        if (hVar != null) {
            hVar.a(i32.f4496k);
        }
    }

    public void o0(final InterfaceC6084P.b bVar) {
        this.f4488c.b(false, false);
        W(new e() { // from class: E3.s3
            @Override // E3.I3.e
            public final void a(C1375h3.f fVar, int i10) {
                fVar.s(i10, bVar);
            }
        });
        U(new e() { // from class: E3.t3
            @Override // E3.I3.e
            public final void a(C1375h3.f fVar, int i10) {
                fVar.u(i10, this.f5533a.f4504s.f4682q);
            }
        });
    }

    public static /* synthetic */ void s(I3 i32, C1375h3.g gVar, Runnable runnable) {
        i32.f4509x = gVar;
        runnable.run();
        i32.f4509x = null;
    }

    public void v0() {
        synchronized (this.f4486a) {
            try {
                if (this.f4511z) {
                    return;
                }
                W6 w6C1 = this.f4505t.c1();
                if (!this.f4488c.a() && L6.b(w6C1, this.f4504s.f4668c)) {
                    R(w6C1);
                }
                N0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void z0(C1375h3.g gVar) {
        this.f4492g.f5().t(gVar);
    }

    public void A0(C1375h3.g gVar) {
        if (this.f4481B) {
            if (u0(gVar)) {
                return;
            }
            if (r0(gVar)) {
                this.f4481B = false;
            }
        }
        this.f4490e.l(this.f4496k, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean B0(E3.C1375h3.g r9, android.content.Intent r10) {
        /*
            r8 = this;
            android.view.KeyEvent r0 = E3.C1419n.c(r10)
            android.content.ComponentName r1 = r10.getComponent()
            java.lang.String r2 = r10.getAction()
            java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
            boolean r2 = java.util.Objects.equals(r2, r3)
            r3 = 0
            if (r2 == 0) goto Lba
            if (r1 == 0) goto L27
            java.lang.String r1 = r1.getPackageName()
            android.content.Context r2 = r8.f4491f
            java.lang.String r2 = r2.getPackageName()
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto Lba
        L27:
            if (r0 == 0) goto Lba
            int r1 = r0.getAction()
            if (r1 == 0) goto L31
            goto Lba
        L31:
            r8.U0()
            E3.h3$d r1 = r8.f4490e
            E3.h3 r2 = r8.f4496k
            boolean r1 = r1.a(r2, r9, r10)
            r2 = 1
            if (r1 == 0) goto L40
            return r2
        L40:
            int r1 = r0.getKeyCode()
            android.content.Context r4 = r8.f4491f
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r5 = "android.software.leanback"
            boolean r4 = r4.hasSystemFeature(r5)
            r5 = 85
            r6 = 79
            if (r1 == r6) goto L5e
            if (r1 == r5) goto L5e
            E3.I3$b r4 = r8.f4489d
            r4.c()
            goto L87
        L5e:
            if (r4 != 0) goto L82
            int r4 = r9.d()
            if (r4 != 0) goto L82
            int r4 = r0.getRepeatCount()
            if (r4 == 0) goto L6d
            goto L82
        L6d:
            E3.I3$b r4 = r8.f4489d
            boolean r4 = r4.d()
            if (r4 == 0) goto L7c
            E3.I3$b r4 = r8.f4489d
            r4.b()
            r4 = r2
            goto L88
        L7c:
            E3.I3$b r10 = r8.f4489d
            r10.e(r9, r0)
            return r2
        L82:
            E3.I3$b r4 = r8.f4489d
            r4.c()
        L87:
            r4 = r3
        L88:
            boolean r7 = r8.s0()
            if (r7 != 0) goto Laf
            if (r1 == r5) goto L92
            if (r1 != r6) goto L9a
        L92:
            if (r4 == 0) goto L9a
            E3.M4 r9 = r8.f4493h
            r9.z()
            return r2
        L9a:
            int r9 = r9.d()
            if (r9 == 0) goto Lae
            E3.M4 r9 = r8.f4493h
            F3.n r9 = r9.K0()
            F3.j r9 = r9.b()
            r9.c(r0)
            return r2
        Lae:
            return r3
        Laf:
            java.lang.String r9 = "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"
            boolean r9 = r10.getBooleanExtra(r9, r3)
            boolean r9 = r8.K(r0, r4, r9)
            return r9
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.I3.B0(E3.h3$g, android.content.Intent):boolean");
    }

    void C0() {
        t2.a0.g1(this.f4500o, new Runnable() { // from class: E3.w3
            @Override // java.lang.Runnable
            public final void run() {
                I3.l(this.f5580a);
            }
        });
    }

    boolean D0() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C1375h3.h hVar = this.f4508w;
            if (hVar != null) {
                return hVar.b(this.f4496k);
            }
            return true;
        }
        final com.google.common.util.concurrent.w wVarJ = com.google.common.util.concurrent.w.J();
        this.f4500o.post(new Runnable() { // from class: E3.y3
            @Override // java.lang.Runnable
            public final void run() {
                wVarJ.F(Boolean.valueOf(this.f5608a.D0()));
            }
        });
        try {
            return ((Boolean) wVarJ.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public int E0(C1375h3.g gVar, int i10) {
        return this.f4490e.e(this.f4496k, M0(gVar), i10);
    }

    protected void F0(C1375h3.g gVar, InterfaceC6084P.b bVar) {
        this.f4490e.b(this.f4496k, M0(gVar), bVar);
    }

    public void G0(C1375h3.g gVar) {
        if (this.f4481B && u0(gVar)) {
            return;
        }
        this.f4490e.c(this.f4496k, gVar);
    }

    public com.google.common.util.concurrent.p H0(C1375h3.g gVar, List list, int i10, long j10) {
        return (com.google.common.util.concurrent.p) AbstractC6614a.f(this.f4490e.m(this.f4496k, M0(gVar), list, i10, j10), "Callback.onSetMediaItems must return a non-null future");
    }

    public com.google.common.util.concurrent.p I0(C1375h3.g gVar, String str, q2.S s10) {
        return (com.google.common.util.concurrent.p) AbstractC6614a.f(this.f4490e.k(this.f4496k, M0(gVar), str, s10), "Callback.onSetRating must return non-null future");
    }

    public com.google.common.util.concurrent.p J0(C1375h3.g gVar, q2.S s10) {
        return (com.google.common.util.concurrent.p) AbstractC6614a.f(this.f4490e.h(this.f4496k, M0(gVar), s10), "Callback.onSetRating must return non-null future");
    }

    public Runnable L(final C1375h3.g gVar, final Runnable runnable) {
        return new Runnable() { // from class: E3.x3
            @Override // java.lang.Runnable
            public final void run() {
                I3.s(this.f5593a, gVar, runnable);
            }
        };
    }

    public void L0() {
        AbstractC6635w.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + t2.a0.f60566e + "] [" + AbstractC6076H.b() + "]");
        synchronized (this.f4486a) {
            try {
                if (this.f4511z) {
                    return;
                }
                this.f4511z = true;
                this.f4489d.b();
                this.f4497l.removeCallbacksAndMessages(null);
                try {
                    t2.a0.g1(this.f4497l, new Runnable() { // from class: E3.j3
                        @Override // java.lang.Runnable
                        public final void run() {
                            I3.i(this.f5361a);
                        }
                    });
                } catch (Exception e10) {
                    AbstractC6635w.j("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                this.f4493h.S0();
                this.f4492g.o5();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void M() {
        this.f4508w = null;
    }

    protected C1375h3.g M0(C1375h3.g gVar) {
        return (this.f4481B && u0(gVar)) ? (C1375h3.g) AbstractC6614a.e(f0()) : gVar;
    }

    public void N(InterfaceC1443q interfaceC1443q, C1375h3.g gVar) {
        this.f4492g.Z4(interfaceC1443q, gVar);
    }

    protected ServiceC1321a5 O(n.j jVar) {
        ServiceC1321a5 serviceC1321a5 = new ServiceC1321a5(this);
        serviceC1321a5.v(jVar);
        return serviceC1321a5;
    }

    public com.google.common.util.concurrent.p O0(C1375h3.g gVar, final T6 t62, final Bundle bundle) {
        return T(gVar, new e() { // from class: E3.p3
            @Override // E3.I3.e
            public final void a(C1375h3.f fVar, int i10) {
                fVar.F(i10, t62, bundle);
            }
        });
    }

    void P0(C1375h3.h hVar) {
        this.f4508w = hVar;
    }

    public void R0(final Bundle bundle) {
        this.f4484E = bundle;
        W(new e() { // from class: E3.B3
            @Override // E3.I3.e
            public final void a(C1375h3.f fVar, int i10) {
                fVar.o(i10, bundle);
            }
        });
    }

    public boolean S0() {
        return this.f4501p;
    }

    void T0() {
        this.f4488c.b(true, true);
    }

    protected void V(C1375h3.g gVar, e eVar) {
        int iC;
        try {
            S6 s6N = this.f4492g.f5().n(gVar);
            if (s6N != null) {
                iC = s6N.c();
            } else if (!q0(gVar)) {
                return;
            } else {
                iC = 0;
            }
            C1375h3.f fVarC = gVar.c();
            if (fVarC != null) {
                eVar.a(fVarC, iC);
            }
        } catch (DeadObjectException unused) {
            z0(gVar);
        } catch (RemoteException e10) {
            AbstractC6635w.j("MediaSessionImpl", "Exception in " + gVar, e10);
        }
    }

    protected void W(e eVar) {
        AbstractC2011u abstractC2011uJ = this.f4492g.f5().j();
        for (int i10 = 0; i10 < abstractC2011uJ.size(); i10++) {
            V((C1375h3.g) abstractC2011uJ.get(i10), eVar);
        }
        try {
            eVar.a(this.f4493h.H0(), 0);
        } catch (RemoteException e10) {
            AbstractC6635w.e("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    protected Handler X() {
        return this.f4497l;
    }

    public InterfaceC6621h Y() {
        return this.f4498m;
    }

    public AbstractC2011u Z() {
        return this.f4503r;
    }

    protected Context a0() {
        return this.f4491f;
    }

    public AbstractC2011u b0() {
        return this.f4482C;
    }

    public String c0() {
        return this.f4494i;
    }

    protected IBinder d0() {
        ServiceC1321a5 serviceC1321a5;
        synchronized (this.f4486a) {
            try {
                if (this.f4510y == null) {
                    this.f4510y = O(this.f4493h.K0().e());
                }
                serviceC1321a5 = this.f4510y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serviceC1321a5.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    public AbstractC2011u e0() {
        return this.f4483D;
    }

    public C1375h3.g f0() {
        AbstractC2011u abstractC2011uJ = this.f4492g.f5().j();
        for (int i10 = 0; i10 < abstractC2011uJ.size(); i10++) {
            C1375h3.g gVar = (C1375h3.g) abstractC2011uJ.get(i10);
            if (r0(gVar)) {
                return gVar;
            }
        }
        return null;
    }

    public MediaSession.Token g0() {
        return this.f4493h.K0().e().e();
    }

    public C6082N h0() {
        return this.f4485F;
    }

    public M6 i0() {
        return this.f4504s;
    }

    public N6 j0() {
        return this.f4505t;
    }

    protected PendingIntent k0() {
        return this.f4506u;
    }

    public Bundle l0() {
        return this.f4484E;
    }

    public Y6 m0() {
        return this.f4495j;
    }

    public Uri n0() {
        return this.f4487b;
    }

    public void p0(C1375h3.g gVar, boolean z10) {
        if (D0()) {
            boolean z11 = this.f4505t.k(16) && this.f4505t.b() != null;
            boolean z12 = this.f4505t.k(31) || this.f4505t.k(20);
            C1375h3.g gVarM0 = M0(gVar);
            InterfaceC6084P.b bVarF = new InterfaceC6084P.b.a().a(1).f();
            if (!z11 && z12) {
                com.google.common.util.concurrent.j.a((com.google.common.util.concurrent.p) AbstractC6614a.f(this.f4490e.g(this.f4496k, gVarM0), "Callback.onPlaybackResumption must return a non-null future"), new a(gVarM0, z10, bVarF), new Executor() { // from class: E3.v3
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        this.f5556a.K0(runnable);
                    }
                });
                return;
            }
            if (!z11) {
                AbstractC6635w.i("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            t2.a0.B0(this.f4505t);
            if (z10) {
                F0(gVarM0, bVarF);
            }
        }
    }

    public boolean q0(C1375h3.g gVar) {
        return this.f4492g.f5().p(gVar) || this.f4493h.G0().p(gVar);
    }

    public boolean r0(C1375h3.g gVar) {
        return Objects.equals(gVar.f(), this.f4491f.getPackageName()) && gVar.d() != 0 && gVar.b().getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    protected boolean s0() {
        return this.f4481B;
    }

    protected boolean t0() {
        boolean z10;
        synchronized (this.f4486a) {
            z10 = this.f4511z;
        }
        return z10;
    }

    protected boolean u0(C1375h3.g gVar) {
        return gVar != null && Objects.equals(gVar.f(), "com.android.systemui");
    }

    public com.google.common.util.concurrent.p w0(C1375h3.g gVar, List list) {
        return (com.google.common.util.concurrent.p) AbstractC6614a.f(this.f4490e.d(this.f4496k, M0(gVar), list), "Callback.onAddMediaItems must return a non-null future");
    }

    public C1375h3.e x0(C1375h3.g gVar) {
        if (this.f4481B && u0(gVar)) {
            return this.f4493h.I0(this.f4496k);
        }
        C1375h3.e eVar = (C1375h3.e) AbstractC6614a.f(this.f4490e.j(this.f4496k, gVar), "Callback.onConnect must return non-null future");
        if (r0(gVar) && eVar.f5318a) {
            this.f4481B = true;
            AbstractC2011u abstractC2011uG = eVar.f5322e;
            if (abstractC2011uG == null) {
                abstractC2011uG = this.f4496k.g();
            }
            if (abstractC2011uG.isEmpty()) {
                M4 m42 = this.f4493h;
                AbstractC2011u abstractC2011uC = eVar.f5321d;
                if (abstractC2011uC == null) {
                    abstractC2011uC = this.f4496k.c();
                }
                m42.X0(abstractC2011uC);
            } else {
                this.f4493h.Y0(abstractC2011uG);
            }
            this.f4493h.U0(eVar.f5319b, eVar.f5320c);
        }
        return eVar;
    }

    public com.google.common.util.concurrent.p y0(C1375h3.g gVar, T6 t62, Bundle bundle) {
        return (com.google.common.util.concurrent.p) AbstractC6614a.f(this.f4490e.f(this.f4496k, M0(gVar), t62, bundle), "Callback.onCustomCommandOnHandler must return non-null future");
    }
}
