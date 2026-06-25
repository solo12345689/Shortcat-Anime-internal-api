package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5192e0;
import io.sentry.protocol.C5261k;
import io.sentry.util.C5288a;
import io.sentry.util.p;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.android.core.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5134i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.util.p f49747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f49748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f49749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f49750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N0 f49751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C5288a f49752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.util.p f49753g;

    /* JADX INFO: renamed from: io.sentry.android.core.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f49754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f49755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f49756c;

        private b(int i10, int i11, int i12) {
            this.f49754a = i10;
            this.f49755b = i11;
            this.f49756c = i12;
        }
    }

    public C5134i(io.sentry.util.s sVar, SentryAndroidOptions sentryAndroidOptions, N0 n02) {
        this.f49749c = new ConcurrentHashMap();
        this.f49750d = new WeakHashMap();
        this.f49752f = new C5288a();
        this.f49753g = sVar.e("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger());
        this.f49747a = new io.sentry.util.p(new p.a() { // from class: io.sentry.android.core.d
            @Override // io.sentry.util.p.a
            public final Object a() {
                return C5134i.e();
            }
        });
        this.f49748b = sentryAndroidOptions;
        this.f49751e = n02;
    }

    public static /* synthetic */ void c(C5134i c5134i, Runnable runnable, String str) {
        c5134i.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                c5134i.f49748b.getLogger().c(EnumC5215i3.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public static /* synthetic */ FrameMetricsAggregator e() {
        return new FrameMetricsAggregator();
    }

    private b g() {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!i() || !((Boolean) this.f49753g.a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrB = ((FrameMetricsAggregator) this.f49747a.a()).b();
        int i12 = 0;
        if (sparseIntArrayArrB == null || sparseIntArrayArrB.length <= 0 || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                } else if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new b(i12, i10, i11);
    }

    private b h(Activity activity) {
        b bVarG;
        b bVar = (b) this.f49750d.remove(activity);
        if (bVar == null || (bVarG = g()) == null) {
            return null;
        }
        return new b(bVarG.f49754a - bVar.f49754a, bVarG.f49755b - bVar.f49755b, bVarG.f49756c - bVar.f49756c);
    }

    private void j(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.l.e().a()) {
                runnable.run();
            } else {
                this.f49751e.b(new Runnable() { // from class: io.sentry.android.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5134i.c(this.f49741a, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f49748b.getLogger().c(EnumC5215i3.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void l(Activity activity) {
        b bVarG = g();
        if (bVarG != null) {
            this.f49750d.put(activity, bVarG);
        }
    }

    public void f(final Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49752f.a();
        try {
            if (!i()) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } else {
                j(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((FrameMetricsAggregator) this.f49718a.f49747a.a()).a(activity);
                    }
                }, "FrameMetricsAggregator.add");
                l(activity);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
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

    public boolean i() {
        return ((Boolean) this.f49753g.a()).booleanValue() && this.f49748b.isEnableFramesTracking() && !this.f49748b.isEnablePerformanceV2();
    }

    public void k(final Activity activity, io.sentry.protocol.x xVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49752f.a();
        try {
            if (!i()) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            j(new Runnable() { // from class: io.sentry.android.core.h
                @Override // java.lang.Runnable
                public final void run() {
                    ((FrameMetricsAggregator) this.f49745a.f49747a.a()).c(activity);
                }
            }, null);
            b bVarH = h(activity);
            if (bVarH != null && (bVarH.f49754a != 0 || bVarH.f49755b != 0 || bVarH.f49756c != 0)) {
                C5261k c5261k = new C5261k(Integer.valueOf(bVarH.f49754a), "none");
                C5261k c5261k2 = new C5261k(Integer.valueOf(bVarH.f49755b), "none");
                C5261k c5261k3 = new C5261k(Integer.valueOf(bVarH.f49756c), "none");
                HashMap map = new HashMap();
                map.put("frames_total", c5261k);
                map.put("frames_slow", c5261k2);
                map.put("frames_frozen", c5261k3);
                this.f49749c.put(xVar, map);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
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

    public void m() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49752f.a();
        try {
            if (i()) {
                j(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((FrameMetricsAggregator) this.f49728a.f49747a.a()).e();
                    }
                }, "FrameMetricsAggregator.stop");
                ((FrameMetricsAggregator) this.f49747a.a()).d();
            }
            this.f49749c.clear();
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

    public Map n(io.sentry.protocol.x xVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49752f.a();
        try {
            if (!i()) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return null;
            }
            Map map = (Map) this.f49749c.get(xVar);
            this.f49749c.remove(xVar);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return map;
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

    public C5134i(io.sentry.util.s sVar, SentryAndroidOptions sentryAndroidOptions) {
        this(sVar, sentryAndroidOptions, new N0());
    }
}
