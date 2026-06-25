package io.sentry.android.core;

import io.sentry.AbstractC5226l;
import io.sentry.AbstractC5244o2;
import io.sentry.C5188d1;
import io.sentry.C5198f1;
import io.sentry.C5270r3;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5207h0;
import io.sentry.InterfaceC5217j0;
import io.sentry.android.core.internal.util.G;
import io.sentry.util.C5288a;
import java.util.Comparator;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class d1 implements io.sentry.V, G.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f49702h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C5270r3 f49703i = new C5270r3(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f49704a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.G f49706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f49707d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C5288a f49705b = new C5288a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SortedSet f49708e = new TreeSet(new Comparator() { // from class: io.sentry.android.core.c1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d1.f((InterfaceC5207h0) obj, (InterfaceC5207h0) obj2);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentSkipListSet f49709f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f49710g = 16666666;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f49711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f49712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f49713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f49714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f49715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f49716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f49717g;

        a(long j10) {
            this(j10, j10, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f49712b, aVar.f49712b);
        }

        a(long j10, long j11, long j12, long j13, boolean z10, boolean z11, long j14) {
            this.f49711a = j10;
            this.f49712b = j11;
            this.f49713c = j12;
            this.f49714d = j13;
            this.f49715e = z10;
            this.f49716f = z11;
            this.f49717g = j14;
        }
    }

    public d1(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.G g10) {
        this.f49706c = g10;
        this.f49704a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static /* synthetic */ int f(InterfaceC5207h0 interfaceC5207h0, InterfaceC5207h0 interfaceC5207h02) {
        if (interfaceC5207h0 == interfaceC5207h02) {
            return 0;
        }
        int iCompareTo = interfaceC5207h0.t().compareTo(interfaceC5207h02.t());
        return iCompareTo != 0 ? iCompareTo : interfaceC5207h0.q().m().toString().compareTo(interfaceC5207h02.q().m().toString());
    }

    private static int g(a1 a1Var, long j10, long j11, long j12) {
        long jMax = Math.max(0L, j11 - j12);
        if (!io.sentry.android.core.internal.util.G.j(jMax, j10)) {
            return 0;
        }
        a1Var.a(jMax, Math.max(0L, jMax - j10), true, io.sentry.android.core.internal.util.G.i(jMax));
        return 1;
    }

    private void h(InterfaceC5207h0 interfaceC5207h0) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49705b.a();
        try {
            if (!this.f49708e.remove(interfaceC5207h0)) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            AbstractC5244o2 abstractC5244o2R = interfaceC5207h0.r();
            if (abstractC5244o2R == null) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            long j10 = j(interfaceC5207h0.t());
            long j11 = j(abstractC5244o2R);
            long j12 = j11 - j10;
            long j13 = 0;
            if (j12 <= 0) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            a1 a1Var = new a1();
            long j14 = this.f49710g;
            if (!this.f49709f.isEmpty()) {
                for (a aVar : this.f49709f.tailSet(new a(j10))) {
                    if (aVar.f49711a > j11) {
                        break;
                    }
                    if (aVar.f49711a >= j10 && aVar.f49712b <= j11) {
                        a1Var.a(aVar.f49713c, aVar.f49714d, aVar.f49715e, aVar.f49716f);
                    } else if ((j10 > aVar.f49711a && j10 < aVar.f49712b) || (j11 > aVar.f49711a && j11 < aVar.f49712b)) {
                        long jMin = Math.min(aVar.f49714d - Math.max(j13, Math.max(j13, j10 - aVar.f49711a) - aVar.f49717g), j12);
                        long jMin2 = Math.min(j11, aVar.f49712b) - Math.max(j10, aVar.f49711a);
                        a1Var.a(jMin2, jMin, io.sentry.android.core.internal.util.G.j(jMin2, aVar.f49717g), io.sentry.android.core.internal.util.G.i(jMin2));
                    }
                    j14 = aVar.f49717g;
                    j13 = 0;
                }
            }
            long j15 = j14;
            int iF = a1Var.f();
            long jH = this.f49706c.h();
            if (jH != -1) {
                iF = iF + g(a1Var, j15, j11, jH) + i(a1Var, j15, j12);
            }
            double dE = (a1Var.e() + a1Var.c()) / 1.0E9d;
            interfaceC5207h0.i("frames.total", Integer.valueOf(iF));
            interfaceC5207h0.i("frames.slow", Integer.valueOf(a1Var.d()));
            interfaceC5207h0.i("frames.frozen", Integer.valueOf(a1Var.b()));
            interfaceC5207h0.i("frames.delay", Double.valueOf(dE));
            if (interfaceC5207h0 instanceof InterfaceC5217j0) {
                interfaceC5207h0.g("frames_total", Integer.valueOf(iF));
                interfaceC5207h0.g("frames_slow", Integer.valueOf(a1Var.d()));
                interfaceC5207h0.g("frames_frozen", Integer.valueOf(a1Var.b()));
                interfaceC5207h0.g("frames_delay", Double.valueOf(dE));
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A == null) {
                throw th2;
            }
            try {
                interfaceC5192e0A.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static int i(a1 a1Var, long j10, long j11) {
        long jG = j11 - a1Var.g();
        if (jG > 0) {
            return (int) Math.ceil(jG / j10);
        }
        return 0;
    }

    private static long j(AbstractC5244o2 abstractC5244o2) {
        if (abstractC5244o2 instanceof C5270r3) {
            return abstractC5244o2.b(f49703i);
        }
        return System.nanoTime() - (AbstractC5226l.i(System.currentTimeMillis()) - abstractC5244o2.m());
    }

    @Override // io.sentry.V
    public void a(InterfaceC5207h0 interfaceC5207h0) {
        if (!this.f49704a || (interfaceC5207h0 instanceof C5188d1) || (interfaceC5207h0 instanceof C5198f1)) {
            return;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f49705b.a();
        try {
            if (!this.f49708e.contains(interfaceC5207h0)) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            h(interfaceC5207h0);
            interfaceC5192e0A = this.f49705b.a();
            try {
                if (this.f49708e.isEmpty()) {
                    clear();
                } else {
                    this.f49709f.headSet(new a(j(((InterfaceC5207h0) this.f49708e.first()).t()))).clear();
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
        }
    }

    @Override // io.sentry.V
    public void b(InterfaceC5207h0 interfaceC5207h0) {
        if (!this.f49704a || (interfaceC5207h0 instanceof C5188d1) || (interfaceC5207h0 instanceof C5198f1)) {
            return;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f49705b.a();
        try {
            this.f49708e.add(interfaceC5207h0);
            if (this.f49707d == null) {
                this.f49707d = this.f49706c.l(this);
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

    @Override // io.sentry.V
    public void clear() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49705b.a();
        try {
            if (this.f49707d != null) {
                this.f49706c.m(this.f49707d);
                this.f49707d = null;
            }
            this.f49709f.clear();
            this.f49708e.clear();
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

    @Override // io.sentry.android.core.internal.util.G.b
    public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
        if (this.f49709f.size() > 3600) {
            return;
        }
        long j14 = (long) (f49702h / ((double) f10));
        this.f49710g = j14;
        if (z10 || z11) {
            this.f49709f.add(new a(j10, j11, j12, j13, z10, z11, j14));
        }
    }
}
