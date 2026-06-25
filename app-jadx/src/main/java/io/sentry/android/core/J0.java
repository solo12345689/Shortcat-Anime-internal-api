package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.AbstractC5226l;
import io.sentry.C5265q2;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.G1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5197f0;
import io.sentry.O3;
import io.sentry.Q1;
import io.sentry.T2;
import io.sentry.V2;
import io.sentry.protocol.C5251a;
import io.sentry.util.runtime.a;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class J0 {
    public static /* synthetic */ void c(O3.b bVar, boolean z10, AtomicReference atomicReference, C5322z3 c5322z3, io.sentry.Y y10) {
        O3 o3F = y10.F();
        if (o3F == null) {
            c5322z3.getLogger().c(EnumC5215i3.INFO, "Session is null on updateSession", new Object[0]);
        } else if (o3F.q(bVar, null, z10, null)) {
            if (o3F.l() == O3.b.Crashed) {
                o3F.c();
                y10.M();
            }
            atomicReference.set(o3F);
        }
    }

    private static void e(io.sentry.android.core.performance.i iVar, List list) {
        if (iVar.s()) {
            Q1.b().h().getLogger().c(EnumC5215i3.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (iVar.t()) {
            Q1.b().h().getLogger().c(EnumC5215i3.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put(com.amazon.a.a.o.b.f34645c, iVar.b());
        map.put("start_timestamp_ms", Long.valueOf(iVar.p()));
        map.put("end_timestamp_ms", Long.valueOf(iVar.k()));
        list.add(map);
    }

    public static io.sentry.protocol.x f(byte[] bArr, boolean z10) {
        Q1 q1B = Q1.b();
        C5322z3 c5322z3H = q1B.h();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                InterfaceC5197f0 serializer = c5322z3H.getSerializer();
                C5265q2 c5265q2A = c5322z3H.getEnvelopeReader().a(byteArrayInputStream);
                if (c5265q2A == null) {
                    byteArrayInputStream.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                O3.b bVar = null;
                boolean z11 = false;
                for (T2 t22 : c5265q2A.c()) {
                    arrayList.add(t22);
                    V2 v2N = t22.N(serializer);
                    if (v2N != null) {
                        if (v2N.y0()) {
                            bVar = O3.b.Crashed;
                        }
                        if (v2N.y0() || v2N.z0()) {
                            z11 = true;
                        }
                    }
                }
                O3 o3L = l(q1B, c5322z3H, bVar, z11);
                if (o3L != null) {
                    arrayList.add(T2.K(serializer, o3L));
                    h(c5322z3H, (z10 && q1B.h().getThreadChecker().a()) ? false : true);
                    if (z10) {
                        q1B.p();
                    }
                }
                io.sentry.protocol.x xVarX = q1B.x(new C5265q2(c5265q2A.b(), arrayList));
                byteArrayInputStream.close();
                return xVarX;
            } finally {
            }
        } catch (Throwable th2) {
            c5322z3H.getLogger().b(EnumC5215i3.ERROR, "Failed to capture envelope", th2);
            return null;
        }
        c5322z3H.getLogger().b(EnumC5215i3.ERROR, "Failed to capture envelope", th2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(C5322z3 c5322z3) {
        String cacheDirPath = c5322z3.getCacheDirPath();
        if (cacheDirPath == null) {
            c5322z3.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
        } else if (!c5322z3.isEnableAutoSessionTracking()) {
            c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
        } else {
            if (io.sentry.cache.f.A(cacheDirPath).delete()) {
                return;
            }
            c5322z3.getLogger().c(EnumC5215i3.WARNING, "Failed to delete the current session file.", new Object[0]);
        }
    }

    private static void h(final C5322z3 c5322z3, boolean z10) {
        if (z10) {
            g(c5322z3);
            return;
        }
        try {
            c5322z3.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.I0
                @Override // java.lang.Runnable
                public final void run() {
                    J0.g(c5322z3);
                }
            });
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.WARNING, "Submission of deletion of the current session file rejected.", th2);
        }
    }

    public static Map i() {
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        ArrayList arrayList = new ArrayList();
        e(hVarQ.g(), arrayList);
        e(hVarQ.o(), arrayList);
        Iterator it = hVarQ.p().iterator();
        while (it.hasNext()) {
            e((io.sentry.android.core.performance.i) it.next(), arrayList);
        }
        for (io.sentry.android.core.performance.c cVar : hVarQ.h()) {
            e(cVar.b(), arrayList);
            e(cVar.c(), arrayList);
        }
        HashMap map = new HashMap();
        map.put("spans", arrayList);
        map.put("type", hVarQ.n().toString().toLowerCase(Locale.ROOT));
        if (hVarQ.l().u()) {
            map.put("app_start_timestamp_ms", Long.valueOf(hVarQ.l().p()));
        }
        return map;
    }

    public static io.sentry.Y j() {
        final AtomicReference atomicReference = new AtomicReference();
        Q1.b().t(I1.COMBINED, new G1() { // from class: io.sentry.android.core.G0
            @Override // io.sentry.G1
            public final void a(io.sentry.Y y10) {
                atomicReference.set(y10.m962clone());
            }
        });
        return (io.sentry.Y) atomicReference.get();
    }

    public static Map k(final Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.Y y10) {
        HashMap map = new HashMap();
        if (y10 != null) {
            try {
                ILogger logger = sentryAndroidOptions.getLogger();
                io.sentry.util.v vVar = new io.sentry.util.v(map);
                C5175z0 c5175z0K = C5175z0.k(context, sentryAndroidOptions);
                y10.v().q(c5175z0K.c(true, true));
                y10.v().u(c5175z0K.l());
                io.sentry.protocol.I iZ = y10.z();
                if (iZ == null) {
                    iZ = new io.sentry.protocol.I();
                    y10.i(iZ);
                }
                if (iZ.i() == null) {
                    try {
                        iZ.o((String) sentryAndroidOptions.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.F0
                            @Override // io.sentry.util.runtime.a.InterfaceC0806a
                            public final Object run() {
                                return E0.a(context);
                            }
                        }));
                    } catch (RuntimeException e10) {
                        logger.b(EnumC5215i3.ERROR, "Could not retrieve installation ID", e10);
                    }
                }
                C5251a c5251aD = y10.v().d();
                if (c5251aD == null) {
                    c5251aD = new C5251a();
                }
                c5251aD.o(AbstractC5156p0.i(context));
                io.sentry.android.core.performance.i iVarM = io.sentry.android.core.performance.h.q().m(sentryAndroidOptions);
                if (iVarM.u()) {
                    c5251aD.p(AbstractC5226l.o(iVarM.n()));
                }
                C5131g0 c5131g0 = new C5131g0(sentryAndroidOptions.getLogger());
                PackageInfo packageInfoO = AbstractC5156p0.o(context, 4096, sentryAndroidOptions.getLogger(), c5131g0);
                if (packageInfoO != null) {
                    AbstractC5156p0.x(packageInfoO, c5131g0, c5175z0K, c5251aD);
                }
                y10.v().o(c5251aD);
                vVar.e("user").j(logger, y10.z());
                vVar.e("contexts").j(logger, y10.v());
                vVar.e("tags").j(logger, y10.getTags());
                vVar.e("extras").j(logger, y10.getExtras());
                vVar.e("fingerprint").j(logger, y10.y());
                vVar.e("level").j(logger, y10.m());
                vVar.e("breadcrumbs").j(logger, y10.r());
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().b(EnumC5215i3.ERROR, "Could not serialize scope.", th2);
                return new HashMap();
            }
        }
        return map;
    }

    private static O3 l(InterfaceC5114a0 interfaceC5114a0, final C5322z3 c5322z3, final O3.b bVar, final boolean z10) {
        final AtomicReference atomicReference = new AtomicReference();
        interfaceC5114a0.r(new G1() { // from class: io.sentry.android.core.H0
            @Override // io.sentry.G1
            public final void a(io.sentry.Y y10) {
                J0.c(bVar, z10, atomicReference, c5322z3, y10);
            }
        });
        return (O3) atomicReference.get();
    }
}
