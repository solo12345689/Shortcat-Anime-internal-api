package io.sentry.metrics;

import io.sentry.C5250p3;
import io.sentry.C5266q3;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5182c0;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5192e0;
import io.sentry.Z2;
import io.sentry.transport.A;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C5322z3 f50846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5182c0 f50847b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5187d0 f50849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Future f50850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5288a f50851f = new C5288a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f50852g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f50853h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A f50854i = new A();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f50848c = new ConcurrentLinkedQueue();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.g();
        }
    }

    public g(C5322z3 c5322z3, InterfaceC5182c0 interfaceC5182c0) {
        this.f50846a = c5322z3;
        this.f50847b = interfaceC5182c0;
        this.f50849d = new Z2(c5322z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        i();
        InterfaceC5192e0 interfaceC5192e0A = this.f50851f.a();
        try {
            if (this.f50848c.isEmpty()) {
                this.f50852g = false;
            } else {
                j(true, false);
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

    private void h() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            C5250p3 c5250p3 = (C5250p3) this.f50848c.poll();
            if (c5250p3 != null) {
                arrayList.add(c5250p3);
            }
            if (this.f50848c.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f50847b.h(new C5266q3(arrayList));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f50854i.a();
        }
    }

    private void i() {
        do {
            h();
        } while (this.f50848c.size() >= 1000);
    }

    private void j(boolean z10, boolean z11) {
        if (!this.f50852g || z10) {
            InterfaceC5192e0 interfaceC5192e0A = this.f50851f.a();
            try {
                Future future = this.f50850e;
                if (z10 || future == null || future.isDone() || future.isCancelled()) {
                    this.f50852g = true;
                    try {
                        this.f50850e = this.f50849d.schedule(new b(), z11 ? 0 : 5000);
                    } catch (RejectedExecutionException e10) {
                        this.f50852g = false;
                        this.f50846a.getLogger().b(EnumC5215i3.WARNING, "Metrics batch processor flush task rejected", e10);
                    }
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
    }

    @Override // io.sentry.metrics.c
    public void c(boolean z10) {
        this.f50853h = true;
        if (z10) {
            j(true, true);
            this.f50849d.submit(new Runnable() { // from class: io.sentry.metrics.f
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar = this.f50845a;
                    gVar.f50849d.a(gVar.f50846a.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.f50849d.a(this.f50846a.getShutdownTimeoutMillis());
            while (!this.f50848c.isEmpty()) {
                h();
            }
        }
    }

    @Override // io.sentry.metrics.c
    public void d(long j10) {
        j(true, true);
        try {
            this.f50854i.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f50846a.getLogger().b(EnumC5215i3.ERROR, "Failed to flush metrics events", e10);
            Thread.currentThread().interrupt();
        }
    }
}
