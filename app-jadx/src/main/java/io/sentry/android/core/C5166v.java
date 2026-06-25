package io.sentry.android.core;

import io.sentry.AbstractC5204g2;
import io.sentry.AbstractC5244o2;
import io.sentry.C5268r1;
import io.sentry.C5270r3;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5221k;
import io.sentry.EnumC5278t1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5211i;
import io.sentry.M;
import io.sentry.android.core.M;
import io.sentry.g4;
import io.sentry.transport.z;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5166v implements io.sentry.N, z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f50022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5187d0 f50025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5131g0 f50026e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.G f50028g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC5114a0 f50031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Future f50032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC5211i f50033l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.x f50035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.sentry.protocol.x f50036o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f50037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC5244o2 f50038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile boolean f50039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f50040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f50041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f50042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C5288a f50043v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C5288a f50044w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f50027f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private M f50029h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50030i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f50034m = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.android.core.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50045a;

        static {
            int[] iArr = new int[EnumC5278t1.values().length];
            f50045a = iArr;
            try {
                iArr[EnumC5278t1.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50045a[EnumC5278t1.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5166v(C5131g0 c5131g0, io.sentry.android.core.internal.util.G g10, ILogger iLogger, String str, int i10, InterfaceC5187d0 interfaceC5187d0) {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        this.f50035n = xVar;
        this.f50036o = xVar;
        this.f50037p = new AtomicBoolean(false);
        this.f50038q = new C5270r3();
        this.f50039r = true;
        this.f50040s = false;
        this.f50041t = false;
        this.f50042u = 0;
        this.f50043v = new C5288a();
        this.f50044w = new C5288a();
        this.f50022a = iLogger;
        this.f50028g = g10;
        this.f50026e = c5131g0;
        this.f50023b = str;
        this.f50024c = i10;
        this.f50025d = interfaceC5187d0;
    }

    public static /* synthetic */ void b(C5166v c5166v, C5322z3 c5322z3, InterfaceC5114a0 interfaceC5114a0) {
        if (c5166v.f50037p.get()) {
            return;
        }
        ArrayList arrayList = new ArrayList(c5166v.f50034m.size());
        InterfaceC5192e0 interfaceC5192e0A = c5166v.f50044w.a();
        try {
            Iterator it = c5166v.f50034m.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5268r1.a) it.next()).a(c5322z3));
            }
            c5166v.f50034m.clear();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                interfaceC5114a0.w((C5268r1) it2.next());
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
        if (this.f50027f) {
            return;
        }
        this.f50027f = true;
        String str = this.f50023b;
        if (str == null) {
            this.f50022a.c(EnumC5215i3.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f50024c;
        if (i10 <= 0) {
            this.f50022a.c(EnumC5215i3.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f50029h = new M(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f50024c, this.f50028g, null, this.f50022a);
        }
    }

    private void j() {
        InterfaceC5114a0 interfaceC5114a0 = this.f50031j;
        if ((interfaceC5114a0 == null || interfaceC5114a0 == io.sentry.U0.i()) && AbstractC5204g2.r() != io.sentry.U0.i()) {
            this.f50031j = AbstractC5204g2.r();
            this.f50033l = AbstractC5204g2.r().h().getCompositePerformanceCollector();
            io.sentry.transport.z zVarN = this.f50031j.n();
            if (zVarN != null) {
                zVarN.j(this);
            }
        }
    }

    private void k(final InterfaceC5114a0 interfaceC5114a0, final C5322z3 c5322z3) {
        try {
            c5322z3.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.u
                @Override // java.lang.Runnable
                public final void run() {
                    C5166v.b(this.f50012a, c5322z3, interfaceC5114a0);
                }
            });
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.DEBUG, "Failed to send profile chunks.", th2);
        }
    }

    private void l() {
        j();
        if (this.f50026e.d() < 22) {
            return;
        }
        i();
        if (this.f50029h == null) {
            return;
        }
        InterfaceC5114a0 interfaceC5114a0 = this.f50031j;
        if (interfaceC5114a0 != null) {
            io.sentry.transport.z zVarN = interfaceC5114a0.n();
            if (zVarN != null && (zVarN.o(EnumC5221k.All) || zVarN.o(EnumC5221k.ProfileChunkUi))) {
                this.f50022a.c(EnumC5215i3.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                n(false);
                return;
            } else {
                if (this.f50031j.h().getConnectionStatusProvider().x0() == M.a.DISCONNECTED) {
                    this.f50022a.c(EnumC5215i3.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    n(false);
                    return;
                }
                this.f50038q = this.f50031j.h().getDateProvider().now();
            }
        } else {
            this.f50038q = new C5270r3();
        }
        if (this.f50029h.j() == null) {
            return;
        }
        this.f50030i = true;
        io.sentry.protocol.x xVar = this.f50035n;
        io.sentry.protocol.x xVar2 = io.sentry.protocol.x.f51153b;
        if (xVar.equals(xVar2)) {
            this.f50035n = new io.sentry.protocol.x();
        }
        if (this.f50036o.equals(xVar2)) {
            this.f50036o = new io.sentry.protocol.x();
        }
        InterfaceC5211i interfaceC5211i = this.f50033l;
        if (interfaceC5211i != null) {
            interfaceC5211i.f(this.f50036o.toString());
        }
        try {
            this.f50032k = this.f50025d.schedule(new Runnable() { // from class: io.sentry.android.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50010a.n(true);
                }
            }, 60000L);
        } catch (RejectedExecutionException e10) {
            this.f50022a.b(EnumC5215i3.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e10);
            this.f50040s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(boolean z10) {
        j();
        InterfaceC5192e0 interfaceC5192e0A = this.f50043v.a();
        try {
            Future future = this.f50032k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f50029h != null && this.f50030i) {
                if (this.f50026e.d() < 22) {
                    if (interfaceC5192e0A != null) {
                        interfaceC5192e0A.close();
                        return;
                    }
                    return;
                }
                InterfaceC5211i interfaceC5211i = this.f50033l;
                M.b bVarG = this.f50029h.g(false, interfaceC5211i != null ? interfaceC5211i.c(this.f50036o.toString()) : null);
                if (bVarG == null) {
                    this.f50022a.c(EnumC5215i3.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    interfaceC5192e0A = this.f50044w.a();
                    try {
                        this.f50034m.add(new C5268r1.a(this.f50035n, this.f50036o, bVarG.f49526d, bVarG.f49525c, this.f50038q, "android"));
                        if (interfaceC5192e0A != null) {
                            interfaceC5192e0A.close();
                        }
                    } finally {
                        if (interfaceC5192e0A == null) {
                            throw th;
                        }
                        try {
                            interfaceC5192e0A.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                this.f50030i = false;
                io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
                this.f50036o = xVar;
                InterfaceC5114a0 interfaceC5114a0 = this.f50031j;
                if (interfaceC5114a0 != null) {
                    k(interfaceC5114a0, interfaceC5114a0.h());
                }
                if (!z10 || this.f50040s) {
                    this.f50035n = xVar;
                    this.f50022a.c(EnumC5215i3.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    this.f50022a.c(EnumC5215i3.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    l();
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            io.sentry.protocol.x xVar2 = io.sentry.protocol.x.f51153b;
            this.f50035n = xVar2;
            this.f50036o = xVar2;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } finally {
        }
    }

    @Override // io.sentry.N
    public void c(boolean z10) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50043v.a();
        try {
            this.f50042u = 0;
            this.f50040s = true;
            if (z10) {
                n(false);
                this.f50037p.set(true);
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

    @Override // io.sentry.N
    public void d(EnumC5278t1 enumC5278t1, g4 g4Var) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50043v.a();
        try {
            if (this.f50039r) {
                this.f50041t = g4Var.c(io.sentry.util.B.a().c());
                this.f50039r = false;
            }
            if (!this.f50041t) {
                this.f50022a.c(EnumC5215i3.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            int i10 = a.f50045a[enumC5278t1.ordinal()];
            if (i10 == 1) {
                if (this.f50042u < 0) {
                    this.f50042u = 0;
                }
                this.f50042u++;
            } else if (i10 == 2 && isRunning()) {
                this.f50022a.c(EnumC5215i3.DEBUG, "Profiler is already running.", new Object[0]);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            if (!isRunning()) {
                this.f50022a.c(EnumC5215i3.DEBUG, "Started Profiler.", new Object[0]);
                l();
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

    @Override // io.sentry.N
    public void e() {
        this.f50039r = true;
    }

    @Override // io.sentry.N
    public io.sentry.protocol.x f() {
        return this.f50036o;
    }

    @Override // io.sentry.N
    public void g(EnumC5278t1 enumC5278t1) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50043v.a();
        try {
            int i10 = a.f50045a[enumC5278t1.ordinal()];
            if (i10 == 1) {
                int i11 = this.f50042u - 1;
                this.f50042u = i11;
                if (i11 > 0) {
                    if (interfaceC5192e0A != null) {
                        interfaceC5192e0A.close();
                        return;
                    }
                    return;
                } else {
                    if (i11 < 0) {
                        this.f50042u = 0;
                    }
                    this.f50040s = true;
                }
            } else if (i10 == 2) {
                this.f50040s = true;
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

    @Override // io.sentry.N
    public io.sentry.protocol.x h() {
        return this.f50035n;
    }

    @Override // io.sentry.N
    public boolean isRunning() {
        return this.f50030i;
    }

    @Override // io.sentry.transport.z.b
    public void m(io.sentry.transport.z zVar) {
        if (zVar.o(EnumC5221k.All) || zVar.o(EnumC5221k.ProfileChunkUi)) {
            this.f50022a.c(EnumC5215i3.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            n(false);
        }
    }
}
