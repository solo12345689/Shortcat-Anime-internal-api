package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C5209h2;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5222k0;
import io.sentry.Z2;
import io.sentry.g4;
import io.sentry.h4;
import io.sentry.util.C5288a;
import io.sentry.util.runtime.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryPerformanceProvider extends A0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f49600f = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f49601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f49602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5131g0 f49603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5288a f49604e = new C5288a();

    public SentryPerformanceProvider() {
        C5174z c5174z = new C5174z();
        this.f49602c = c5174z;
        this.f49603d = new C5131g0(c5174z);
    }

    private void b(Context context, C5209h2 c5209h2, io.sentry.android.core.performance.h hVar) {
        if (!c5209h2.f()) {
            this.f49602c.c(EnumC5215i3.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C5166v c5166v = new C5166v(this.f49603d, new io.sentry.android.core.internal.util.G(context.getApplicationContext(), this.f49602c, this.f49603d), this.f49602c, c5209h2.c(), c5209h2.d(), new Z2());
        hVar.x(null);
        hVar.w(c5166v);
        this.f49602c.c(EnumC5215i3.DEBUG, "App start continuous profiling started.", new Object[0]);
        C5322z3 c5322z3Empty = C5322z3.empty();
        c5322z3Empty.setProfileSessionSampleRate(Double.valueOf(c5209h2.f() ? 1.0d : 0.0d));
        c5166v.d(c5209h2.a(), new g4(c5322z3Empty));
    }

    private void c(Context context, C5209h2 c5209h2, io.sentry.android.core.performance.h hVar) {
        h4 h4Var = new h4(Boolean.valueOf(c5209h2.l()), c5209h2.e(), Boolean.valueOf(c5209h2.i()), c5209h2.b());
        hVar.y(h4Var);
        if (!h4Var.b().booleanValue() || !h4Var.e().booleanValue()) {
            this.f49602c.c(EnumC5215i3.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        P p10 = new P(context, this.f49603d, new io.sentry.android.core.internal.util.G(context, this.f49602c, this.f49603d), this.f49602c, c5209h2.c(), c5209h2.j(), c5209h2.d(), new Z2());
        hVar.w(null);
        hVar.x(p10);
        this.f49602c.c(EnumC5215i3.DEBUG, "App start profiling started.", new Object[0]);
        p10.start();
    }

    private void d(io.sentry.android.core.performance.h hVar) {
        final Context context = getContext();
        if (context == null) {
            this.f49602c.c(EnumC5215i3.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File((File) new io.sentry.android.core.internal.util.j().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.b1
            @Override // io.sentry.util.runtime.a.InterfaceC0806a
            public final Object run() {
                return K.f(context);
            }
        }), "app_start_profiling_config");
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    C5209h2 c5209h2 = (C5209h2) new io.sentry.C0(C5322z3.empty()).c(bufferedReader, C5209h2.class);
                    if (c5209h2 == null) {
                        this.f49602c.c(EnumC5215i3.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (c5209h2.g() && c5209h2.k()) {
                        b(context, c5209h2, hVar);
                    } else if (!c5209h2.j()) {
                        this.f49602c.c(EnumC5215i3.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (c5209h2.h()) {
                        c(context, c5209h2, hVar);
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (FileNotFoundException e10) {
                this.f49602c.b(EnumC5215i3.ERROR, "App start profiling config file not found. ", e10);
            } catch (Throwable th2) {
                this.f49602c.b(EnumC5215i3.ERROR, "Error reading app start profiling config file. ", th2);
            }
        }
    }

    private void e(Context context, io.sentry.android.core.performance.h hVar) {
        hVar.r().x(f49600f);
        if (this.f49603d.d() >= 24) {
            hVar.l().x(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.f49601b = (Application) context;
        }
        Application application = this.f49601b;
        if (application == null) {
            return;
        }
        hVar.v(application);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        e(getContext(), hVarQ);
        d(hVarQ);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        InterfaceC5192e0 interfaceC5192e0A = io.sentry.android.core.performance.h.f49978q.a();
        try {
            InterfaceC5222k0 interfaceC5222k0J = io.sentry.android.core.performance.h.q().j();
            if (interfaceC5222k0J != null) {
                interfaceC5222k0J.close();
            }
            io.sentry.N nI = io.sentry.android.core.performance.h.q().i();
            if (nI != null) {
                nI.c(true);
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
