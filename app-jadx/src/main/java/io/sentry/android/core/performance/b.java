package io.sentry.android.core.performance;

import android.os.Looper;
import android.os.SystemClock;
import io.sentry.AbstractC5244o2;
import io.sentry.EnumC5242o0;
import io.sentry.InterfaceC5207h0;
import io.sentry.a4;
import io.sentry.android.core.AbstractC5170x;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC5244o2 f49966b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC5244o2 f49967c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5207h0 f49968d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5207h0 f49969e = null;

    public b(String str) {
        this.f49965a = str;
    }

    private InterfaceC5207h0 d(InterfaceC5207h0 interfaceC5207h0, String str, AbstractC5244o2 abstractC5244o2) {
        InterfaceC5207h0 interfaceC5207h0K = interfaceC5207h0.k("activity.load", str, abstractC5244o2, EnumC5242o0.SENTRY);
        f(interfaceC5207h0K);
        return interfaceC5207h0K;
    }

    private void f(InterfaceC5207h0 interfaceC5207h0) {
        interfaceC5207h0.i("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        interfaceC5207h0.i("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        interfaceC5207h0.i("ui.contributes_to_ttid", bool);
        interfaceC5207h0.i("ui.contributes_to_ttfd", bool);
    }

    public void a() {
        InterfaceC5207h0 interfaceC5207h0 = this.f49968d;
        if (interfaceC5207h0 != null && !interfaceC5207h0.isFinished()) {
            this.f49968d.j(a4.CANCELLED);
        }
        this.f49968d = null;
        InterfaceC5207h0 interfaceC5207h02 = this.f49969e;
        if (interfaceC5207h02 != null && !interfaceC5207h02.isFinished()) {
            this.f49969e.j(a4.CANCELLED);
        }
        this.f49969e = null;
    }

    public void b(InterfaceC5207h0 interfaceC5207h0) {
        if (this.f49966b == null || interfaceC5207h0 == null) {
            return;
        }
        InterfaceC5207h0 interfaceC5207h0D = d(interfaceC5207h0, this.f49965a + ".onCreate", this.f49966b);
        this.f49968d = interfaceC5207h0D;
        interfaceC5207h0D.d();
    }

    public void c(InterfaceC5207h0 interfaceC5207h0) {
        if (this.f49967c == null || interfaceC5207h0 == null) {
            return;
        }
        InterfaceC5207h0 interfaceC5207h0D = d(interfaceC5207h0, this.f49965a + ".onStart", this.f49967c);
        this.f49969e = interfaceC5207h0D;
        interfaceC5207h0D.d();
    }

    public void e() {
        InterfaceC5207h0 interfaceC5207h0 = this.f49968d;
        if (interfaceC5207h0 == null || this.f49969e == null) {
            return;
        }
        AbstractC5244o2 abstractC5244o2R = interfaceC5207h0.r();
        AbstractC5244o2 abstractC5244o2R2 = this.f49969e.r();
        if (abstractC5244o2R == null || abstractC5244o2R2 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        AbstractC5244o2 abstractC5244o2A = AbstractC5170x.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(abstractC5244o2A.b(this.f49968d.t()));
        long millis2 = timeUnit.toMillis(abstractC5244o2A.b(abstractC5244o2R));
        long millis3 = timeUnit.toMillis(abstractC5244o2A.b(this.f49969e.t()));
        long millis4 = timeUnit.toMillis(abstractC5244o2A.b(abstractC5244o2R2));
        c cVar = new c();
        cVar.b().y(this.f49968d.getDescription(), timeUnit.toMillis(this.f49968d.t().m()), jUptimeMillis - millis, jUptimeMillis - millis2);
        cVar.c().y(this.f49969e.getDescription(), timeUnit.toMillis(this.f49969e.t().m()), jUptimeMillis - millis3, jUptimeMillis - millis4);
        h.q().e(cVar);
    }

    public void g(AbstractC5244o2 abstractC5244o2) {
        this.f49966b = abstractC5244o2;
    }

    public void h(AbstractC5244o2 abstractC5244o2) {
        this.f49967c = abstractC5244o2;
    }
}
