package io.sentry.backpressure;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5192e0;
import io.sentry.util.C5288a;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f50536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5114a0 f50537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50538c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Future f50539d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5288a f50540e = new C5288a();

    public a(C5322z3 c5322z3, InterfaceC5114a0 interfaceC5114a0) {
        this.f50536a = c5322z3;
        this.f50537b = interfaceC5114a0;
    }

    private boolean c() {
        return this.f50537b.f();
    }

    private void d(int i10) {
        InterfaceC5187d0 executorService = this.f50536a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f50540e.a();
        try {
            try {
                this.f50539d = executorService.schedule(this, i10);
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
        } catch (RejectedExecutionException e10) {
            this.f50536a.getLogger().b(EnumC5215i3.WARNING, "Backpressure monitor reschedule task rejected", e10);
        }
        if (interfaceC5192e0A != null) {
            interfaceC5192e0A.close();
        }
    }

    @Override // io.sentry.backpressure.b
    public int a() {
        return this.f50538c;
    }

    void b() {
        if (c()) {
            if (this.f50538c > 0) {
                this.f50536a.getLogger().c(EnumC5215i3.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f50538c = 0;
        } else {
            int i10 = this.f50538c;
            if (i10 < 10) {
                this.f50538c = i10 + 1;
                this.f50536a.getLogger().c(EnumC5215i3.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f50538c));
            }
        }
    }

    @Override // io.sentry.backpressure.b
    public void close() {
        Future future = this.f50539d;
        if (future != null) {
            InterfaceC5192e0 interfaceC5192e0A = this.f50540e.a();
            try {
                future.cancel(true);
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
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
        d(ColorExtractionConstants.MAX_PIXEL_SAMPLES);
    }

    @Override // io.sentry.backpressure.b
    public void start() {
        d(500);
    }
}
