package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5114a0;
import io.sentry.V2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.android.core.f0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC5129f0 implements Runnable {

    /* JADX INFO: renamed from: f */
    static final long f49729f = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: a */
    private final Context f49730a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5114a0 f49731b;

    /* JADX INFO: renamed from: c */
    private final SentryAndroidOptions f49732c;

    /* JADX INFO: renamed from: d */
    private final a f49733d;

    /* JADX INFO: renamed from: e */
    private final long f49734e;

    /* JADX INFO: renamed from: io.sentry.android.core.f0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        Long a();

        String b();

        boolean c();

        b d(ApplicationExitInfo applicationExitInfo, boolean z10);

        int e();
    }

    /* JADX INFO: renamed from: io.sentry.android.core.f0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final V2 f49735a;

        /* JADX INFO: renamed from: b */
        private final io.sentry.H f49736b;

        /* JADX INFO: renamed from: c */
        private final io.sentry.hints.d f49737c;

        b(V2 v22, io.sentry.H h10, io.sentry.hints.d dVar) {
            this.f49735a = v22;
            this.f49736b = h10;
            this.f49737c = dVar;
        }

        public V2 a() {
            return this.f49735a;
        }

        public io.sentry.hints.d b() {
            return this.f49737c;
        }

        public io.sentry.H c() {
            return this.f49736b;
        }
    }

    RunnableC5129f0(Context context, InterfaceC5114a0 interfaceC5114a0, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.o oVar, a aVar) {
        this.f49730a = AbstractC5156p0.g(context);
        this.f49731b = interfaceC5114a0;
        this.f49732c = sentryAndroidOptions;
        this.f49733d = aVar;
        this.f49734e = oVar.getCurrentTimeMillis() - f49729f;
    }

    private ApplicationExitInfo a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = o4.f.a(it.next());
            if (applicationExitInfoA.getReason() == this.f49733d.e()) {
                it.remove();
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private void b(ApplicationExitInfo applicationExitInfo, boolean z10) {
        io.sentry.hints.d dVarB;
        b bVarD = this.f49733d.d(applicationExitInfo, z10);
        if (bVarD == null || this.f49731b.y(bVarD.a(), bVarD.c()).equals(io.sentry.protocol.x.f51153b) || (dVarB = bVarD.b()) == null || dVarB.g()) {
            return;
        }
        this.f49732c.getLogger().c(EnumC5215i3.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", this.f49733d.b(), bVarD.a().G());
    }

    private void c(List list, Long l10) {
        Collections.reverse(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = o4.f.a(it.next());
            if (applicationExitInfoA.getReason() == this.f49733d.e()) {
                if (applicationExitInfoA.getTimestamp() < this.f49734e) {
                    this.f49732c.getLogger().c(EnumC5215i3.DEBUG, "%s happened too long ago %s.", this.f49733d.b(), applicationExitInfoA);
                } else if (l10 == null || applicationExitInfoA.getTimestamp() > l10.longValue()) {
                    b(applicationExitInfoA, false);
                } else {
                    this.f49732c.getLogger().c(EnumC5215i3.DEBUG, "%s has already been reported %s.", this.f49733d.b(), applicationExitInfoA);
                }
            }
        }
    }

    private void d() {
        io.sentry.cache.g envelopeDiskCache = this.f49732c.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && this.f49732c.isEnableAutoSessionTracking()) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            if (fVar.L()) {
                return;
            }
            this.f49732c.getLogger().c(EnumC5215i3.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
            fVar.z();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ActivityManager activityManager = (ActivityManager) this.f49730a.getSystemService("activity");
        if (activityManager == null) {
            this.f49732c.getLogger().c(EnumC5215i3.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            this.f49732c.getLogger().c(EnumC5215i3.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        d();
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        Long lA = this.f49733d.a();
        ApplicationExitInfo applicationExitInfoA = a(arrayList);
        if (applicationExitInfoA == null) {
            this.f49732c.getLogger().c(EnumC5215i3.DEBUG, "No %ss have been found in the historical exit reasons list.", this.f49733d.b());
            return;
        }
        if (applicationExitInfoA.getTimestamp() < this.f49734e) {
            this.f49732c.getLogger().c(EnumC5215i3.DEBUG, "Latest %s happened too long ago, returning early.", this.f49733d.b());
            return;
        }
        if (lA != null && applicationExitInfoA.getTimestamp() <= lA.longValue()) {
            this.f49732c.getLogger().c(EnumC5215i3.DEBUG, "Latest %s has already been reported, returning early.", this.f49733d.b());
            return;
        }
        if (this.f49733d.c()) {
            c(arrayList, lA);
        }
        b(applicationExitInfoA, true);
    }
}
