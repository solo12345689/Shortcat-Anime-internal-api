package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC5204g2;
import io.sentry.C5228l1;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.G1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5247p0;
import io.sentry.O3;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C5288a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f49653a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final C5288a f49654b = new C5288a();

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, io.sentry.Y y10) {
        O3 o3F = y10.F();
        if (o3F == null || o3F.k() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void c(ILogger iLogger, Context context, AbstractC5204g2.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        boolean z10;
        io.sentry.util.s sVar = new io.sentry.util.s();
        boolean zD = sVar.d("timber.log.Timber", sentryAndroidOptions);
        boolean z11 = true;
        if (sVar.d("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && sVar.d("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z10 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        boolean z12 = (zD && sVar.d("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions)) ? z10 : false;
        boolean zD2 = sVar.d("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        boolean zD3 = sVar.d("io.sentry.android.distribution.DistributionIntegration", sentryAndroidOptions);
        C5131g0 c5131g0 = new C5131g0(iLogger);
        io.sentry.util.s sVar2 = new io.sentry.util.s();
        C5134i c5134i = new C5134i(sVar2, sentryAndroidOptions);
        K.j(sentryAndroidOptions, context, iLogger, c5131g0);
        K.i(context, sentryAndroidOptions, c5131g0, sVar2, c5134i, z11, z12, zD2, zD3);
        boolean z13 = z12;
        boolean z14 = z11;
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(EnumC5215i3.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        if (sentryAndroidOptions.isEnablePerformanceV2() && c5131g0.d() >= 24) {
            io.sentry.android.core.performance.i iVarL = hVarQ.l();
            if (iVarL.s()) {
                iVarL.x(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            hVarQ.v((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.i iVarR = hVarQ.r();
        if (iVarR.s()) {
            iVarR.x(f49653a);
        }
        K.h(sentryAndroidOptions, context, c5131g0, sVar2, c5134i, zD2);
        d(sentryAndroidOptions, z14, z13);
    }

    private static void d(C5322z3 c5322z3, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC5247p0 interfaceC5247p0 : c5322z3.getIntegrations()) {
            if (z10 && (interfaceC5247p0 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC5247p0);
            }
            if (z11 && (interfaceC5247p0 instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC5247p0);
            }
            if (interfaceC5247p0 instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(interfaceC5247p0);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                c5322z3.getIntegrations().remove((InterfaceC5247p0) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                c5322z3.getIntegrations().remove((InterfaceC5247p0) arrayList.get(i11));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i12 = 0; i12 < arrayList3.size() - 1; i12++) {
                c5322z3.getIntegrations().remove((InterfaceC5247p0) arrayList3.get(i12));
            }
        }
    }

    public static void e(Context context, ILogger iLogger) {
        f(context, iLogger, new AbstractC5204g2.a() { // from class: io.sentry.android.core.V0
            @Override // io.sentry.AbstractC5204g2.a
            public final void a(C5322z3 c5322z3) {
                Y0.a((SentryAndroidOptions) c5322z3);
            }
        });
    }

    public static void f(final Context context, final ILogger iLogger, final AbstractC5204g2.a aVar) {
        try {
            InterfaceC5192e0 interfaceC5192e0A = f49654b.a();
            try {
                AbstractC5204g2.w(C5228l1.a(SentryAndroidOptions.class), new AbstractC5204g2.a() { // from class: io.sentry.android.core.W0
                    @Override // io.sentry.AbstractC5204g2.a
                    public final void a(C5322z3 c5322z3) {
                        Y0.c(iLogger, context, aVar, (SentryAndroidOptions) c5322z3);
                    }
                }, true);
                InterfaceC5114a0 interfaceC5114a0R = AbstractC5204g2.r();
                if (AbstractC5156p0.s()) {
                    if (interfaceC5114a0R.h().isEnableAutoSessionTracking()) {
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        interfaceC5114a0R.r(new G1() { // from class: io.sentry.android.core.X0
                            @Override // io.sentry.G1
                            public final void a(io.sentry.Y y10) {
                                Y0.b(atomicBoolean, y10);
                            }
                        });
                        if (!atomicBoolean.get()) {
                            interfaceC5114a0R.p();
                        }
                    }
                    interfaceC5114a0R.h().getReplayController().start();
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
        } catch (IllegalAccessException e10) {
            iLogger.b(EnumC5215i3.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InstantiationException e11) {
            iLogger.b(EnumC5215i3.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (NoSuchMethodException e12) {
            iLogger.b(EnumC5215i3.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (InvocationTargetException e13) {
            iLogger.b(EnumC5215i3.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        }
    }

    public static void g(Context context, AbstractC5204g2.a aVar) {
        f(context, new C5174z(), aVar);
    }

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
    }
}
