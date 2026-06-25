package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC3562r0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3932x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Handler f41737d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3 f41738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f41739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f41740c;

    AbstractC3932x(C3 c32) {
        AbstractC2115p.l(c32);
        this.f41738a = c32;
        this.f41739b = new RunnableC3925w(this, c32);
    }

    private final Handler f() {
        Handler handler;
        if (f41737d != null) {
            return f41737d;
        }
        synchronized (AbstractC3932x.class) {
            try {
                if (f41737d == null) {
                    f41737d = new HandlerC3562r0(this.f41738a.d().getMainLooper());
                }
                handler = f41737d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            C3 c32 = this.f41738a;
            this.f41740c = c32.e().a();
            if (f().postDelayed(this.f41739b, j10)) {
                return;
            }
            c32.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f41740c != 0;
    }

    final void d() {
        this.f41740c = 0L;
        f().removeCallbacks(this.f41739b);
    }

    final /* synthetic */ void e(long j10) {
        this.f41740c = 0L;
    }
}
