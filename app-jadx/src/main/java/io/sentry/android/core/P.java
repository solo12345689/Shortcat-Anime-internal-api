package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import io.sentry.AbstractC5226l;
import io.sentry.C5300v1;
import io.sentry.C5305w1;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5217j0;
import io.sentry.InterfaceC5222k0;
import io.sentry.Q1;
import io.sentry.android.core.M;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class P implements InterfaceC5222k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f49562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f49564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f49565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5187d0 f49566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5131g0 f49567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f49569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.G f49570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile C5305w1 f49571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile M f49572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f49573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f49574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Date f49575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C5288a f49576p;

    public P(Context context, SentryAndroidOptions sentryAndroidOptions, C5131g0 c5131g0, io.sentry.android.core.internal.util.G g10) {
        this(context, c5131g0, g10, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void d() {
        if (this.f49568h) {
            return;
        }
        this.f49568h = true;
        if (!this.f49564d) {
            this.f49562b.c(EnumC5215i3.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f49563c;
        if (str == null) {
            this.f49562b.c(EnumC5215i3.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f49565e;
        if (i10 <= 0) {
            this.f49562b.c(EnumC5215i3.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f49572l = new M(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f49565e, this.f49570j, this.f49566f, this.f49562b);
        }
    }

    private boolean e() {
        M.c cVarJ;
        if (this.f49572l == null || (cVarJ = this.f49572l.j()) == null) {
            return false;
        }
        this.f49573m = cVarJ.f49528a;
        this.f49574n = cVarJ.f49529b;
        this.f49575o = cVarJ.f49530c;
        return true;
    }

    private C5300v1 f(String str, String str2, String str3, boolean z10, List list, C5322z3 c5322z3) {
        if (this.f49567g.d() < 22 || this.f49572l == null) {
            return null;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f49576p.a();
        try {
            C5305w1 c5305w1 = this.f49571k;
            if (c5305w1 == null || !c5305w1.h().equals(str2)) {
                this.f49562b.c(EnumC5215i3.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return null;
            }
            this.f49571k = null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            this.f49562b.c(EnumC5215i3.DEBUG, "Transaction %s (%s) finished.", str, str3);
            M.b bVarG = this.f49572l.g(false, list);
            this.f49569i.set(false);
            if (bVarG == null) {
                return null;
            }
            long j10 = bVarG.f49523a - this.f49573m;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(c5305w1);
            c5305w1.k(Long.valueOf(bVarG.f49523a), Long.valueOf(this.f49573m), Long.valueOf(bVarG.f49524b), Long.valueOf(this.f49574n));
            Long lS = c5322z3 instanceof SentryAndroidOptions ? C5175z0.k(this.f49561a, (SentryAndroidOptions) c5322z3).s() : null;
            String string = lS != null ? Long.toString(lS.longValue()) : "0";
            String[] strArr = Build.SUPPORTED_ABIS;
            return new C5300v1(bVarG.f49525c, this.f49575o, arrayList, str, str2, str3, Long.toString(j10), this.f49567g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[0], new Callable() { // from class: io.sentry.android.core.O
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return io.sentry.android.core.internal.util.o.a().c();
                }
            }, this.f49567g.b(), this.f49567g.c(), this.f49567g.e(), this.f49567g.f(), string, c5322z3.getProguardUuid(), c5322z3.getRelease(), c5322z3.getEnvironment(), (bVarG.f49527e || z10) ? "timeout" : Constants.NORMAL, bVarG.f49526d);
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC5222k0
    public void a(InterfaceC5217j0 interfaceC5217j0) {
        if (this.f49569i.get() && this.f49571k == null) {
            InterfaceC5192e0 interfaceC5192e0A = this.f49576p.a();
            try {
                if (this.f49569i.get() && this.f49571k == null) {
                    this.f49571k = new C5305w1(interfaceC5217j0, Long.valueOf(this.f49573m), Long.valueOf(this.f49574n));
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

    @Override // io.sentry.InterfaceC5222k0
    public C5300v1 b(InterfaceC5217j0 interfaceC5217j0, List list, C5322z3 c5322z3) {
        return f(interfaceC5217j0.getName(), interfaceC5217j0.f().toString(), interfaceC5217j0.q().p().toString(), false, list, c5322z3);
    }

    @Override // io.sentry.InterfaceC5222k0
    public void close() {
        P p10;
        C5305w1 c5305w1 = this.f49571k;
        if (c5305w1 != null) {
            p10 = this;
            p10.f(c5305w1.i(), c5305w1.h(), c5305w1.j(), true, null, Q1.b().h());
        } else {
            p10 = this;
        }
        p10.f49569i.set(false);
        if (p10.f49572l != null) {
            p10.f49572l.f();
        }
    }

    @Override // io.sentry.InterfaceC5222k0
    public boolean isRunning() {
        return this.f49569i.get();
    }

    @Override // io.sentry.InterfaceC5222k0
    public void start() {
        if (this.f49567g.d() >= 22 && !this.f49569i.getAndSet(true)) {
            d();
            if (e()) {
                this.f49562b.c(EnumC5215i3.DEBUG, "Profiler started.", new Object[0]);
                return;
            }
            if (this.f49572l != null && this.f49572l.h()) {
                this.f49562b.c(EnumC5215i3.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
                return;
            }
            InterfaceC5192e0 interfaceC5192e0A = this.f49576p.a();
            try {
                this.f49571k = null;
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                this.f49569i.set(false);
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

    public P(Context context, C5131g0 c5131g0, io.sentry.android.core.internal.util.G g10, ILogger iLogger, String str, boolean z10, int i10, InterfaceC5187d0 interfaceC5187d0) {
        this.f49568h = false;
        this.f49569i = new AtomicBoolean(false);
        this.f49572l = null;
        this.f49576p = new C5288a();
        this.f49561a = (Context) io.sentry.util.w.c(AbstractC5156p0.g(context), "The application context is required");
        this.f49562b = (ILogger) io.sentry.util.w.c(iLogger, "ILogger is required");
        this.f49570j = (io.sentry.android.core.internal.util.G) io.sentry.util.w.c(g10, "SentryFrameMetricsCollector is required");
        this.f49567g = (C5131g0) io.sentry.util.w.c(c5131g0, "The BuildInfoProvider is required.");
        this.f49563c = str;
        this.f49564d = z10;
        this.f49565e = i10;
        this.f49566f = (InterfaceC5187d0) io.sentry.util.w.c(interfaceC5187d0, "The ISentryExecutorService is required.");
        this.f49575o = AbstractC5226l.d();
    }
}
