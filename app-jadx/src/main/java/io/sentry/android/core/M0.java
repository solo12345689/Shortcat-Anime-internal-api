package io.sentry.android.core;

import com.facebook.react.modules.appstate.AppStateModule;
import io.sentry.C5191e;
import io.sentry.EnumC5215i3;
import io.sentry.G1;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5192e0;
import io.sentry.O3;
import io.sentry.android.core.C5123c0;
import io.sentry.util.C5288a;
import io.sentry.util.p;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class M0 implements C5123c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f49531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f49532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimerTask f49533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.p f49534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5288a f49535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5114a0 f49536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f49537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f49538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.sentry.transport.o f49539i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (M0.this.f49537g) {
                M0.this.f49536f.l();
            }
            M0.this.f49536f.h().getReplayController().stop();
            M0.this.f49536f.h().getContinuousProfiler().c(false);
        }
    }

    M0(InterfaceC5114a0 interfaceC5114a0, long j10, boolean z10, boolean z11) {
        this(interfaceC5114a0, j10, z10, z11, io.sentry.transport.m.a());
    }

    public static /* synthetic */ void c(M0 m02, io.sentry.Y y10) {
        O3 o3F;
        if (m02.f49531a.get() != 0 || (o3F = y10.F()) == null || o3F.k() == null) {
            return;
        }
        m02.f49531a.set(o3F.k().getTime());
    }

    public static /* synthetic */ Timer d() {
        return new Timer(true);
    }

    private void g(String str) {
        if (this.f49538h) {
            C5191e c5191e = new C5191e();
            c5191e.H("navigation");
            c5191e.D("state", str);
            c5191e.C("app.lifecycle");
            c5191e.E(EnumC5215i3.INFO);
            this.f49536f.a(c5191e);
        }
    }

    private void h() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49535e.a();
        try {
            TimerTask timerTask = this.f49533c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f49533c = null;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void i() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49535e.a();
        try {
            h();
            this.f49533c = new a();
            ((Timer) this.f49534d.a()).schedule(this.f49533c, this.f49532b);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void j() {
        h();
        long currentTimeMillis = this.f49539i.getCurrentTimeMillis();
        this.f49536f.r(new G1() { // from class: io.sentry.android.core.L0
            @Override // io.sentry.G1
            public final void a(io.sentry.Y y10) {
                M0.c(this.f49505a, y10);
            }
        });
        long j10 = this.f49531a.get();
        if (j10 == 0 || j10 + this.f49532b <= currentTimeMillis) {
            if (this.f49537g) {
                this.f49536f.p();
            }
            this.f49536f.h().getReplayController().start();
        }
        this.f49536f.h().getReplayController().i();
        this.f49531a.set(currentTimeMillis);
    }

    @Override // io.sentry.android.core.C5123c0.a
    public void a() {
        j();
        g("foreground");
    }

    @Override // io.sentry.android.core.C5123c0.a
    public void b() {
        this.f49531a.set(this.f49539i.getCurrentTimeMillis());
        this.f49536f.h().getReplayController().pause();
        i();
        g(AppStateModule.APP_STATE_BACKGROUND);
    }

    M0(InterfaceC5114a0 interfaceC5114a0, long j10, boolean z10, boolean z11, io.sentry.transport.o oVar) {
        this.f49531a = new AtomicLong(0L);
        this.f49534d = new io.sentry.util.p(new p.a() { // from class: io.sentry.android.core.K0
            @Override // io.sentry.util.p.a
            public final Object a() {
                return M0.d();
            }
        });
        this.f49535e = new C5288a();
        this.f49532b = j10;
        this.f49537g = z10;
        this.f49538h = z11;
        this.f49536f = interfaceC5114a0;
        this.f49539i = oVar;
    }
}
