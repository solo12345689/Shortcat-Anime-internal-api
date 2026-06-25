package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5192e0;
import io.sentry.util.C5288a;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.c0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5123c0 implements Closeable {

    /* JADX INFO: renamed from: e */
    private static C5123c0 f49682e = new C5123c0();

    /* JADX INFO: renamed from: b */
    private volatile b f49684b;

    /* JADX INFO: renamed from: a */
    private final C5288a f49683a = new C5288a();

    /* JADX INFO: renamed from: c */
    private N0 f49685c = new N0();

    /* JADX INFO: renamed from: d */
    private volatile Boolean f49686d = null;

    /* JADX INFO: renamed from: io.sentry.android.core.c0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: io.sentry.android.core.c0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a */
        final List f49687a = new a();

        /* JADX INFO: renamed from: io.sentry.android.core.c0$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends CopyOnWriteArrayList {
            a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            /* JADX INFO: renamed from: c */
            public boolean add(a aVar) {
                boolean zAdd = super.add(aVar);
                if (Boolean.FALSE.equals(C5123c0.this.f49686d)) {
                    aVar.a();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(C5123c0.this.f49686d)) {
                    aVar.b();
                }
                return zAdd;
            }
        }

        public b() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(androidx.lifecycle.r rVar) {
            C5123c0.this.z(false);
            Iterator it = this.f49687a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(androidx.lifecycle.r rVar) {
            C5123c0.this.z(true);
            Iterator it = this.f49687a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
        }
    }

    private C5123c0() {
    }

    public void j(ILogger iLogger) {
        b bVar = this.f49684b;
        if (bVar != null) {
            try {
                ProcessLifecycleOwner.l().getLifecycle().addObserver(bVar);
            } catch (Throwable th2) {
                this.f49684b = null;
                iLogger.b(EnumC5215i3.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    private void k(final ILogger iLogger) {
        if (this.f49684b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
            this.f49684b = new b();
            if (io.sentry.android.core.internal.util.l.e().a()) {
                j(iLogger);
            } else {
                this.f49685c.b(new Runnable() { // from class: io.sentry.android.core.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49659a.j(iLogger);
                    }
                });
            }
        } catch (ClassNotFoundException unused) {
            iLogger.c(EnumC5215i3.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    public static C5123c0 l() {
        return f49682e;
    }

    public void w(b bVar) {
        if (bVar != null) {
            ProcessLifecycleOwner.l().getLifecycle().removeObserver(bVar);
        }
    }

    public void C() {
        if (this.f49684b == null) {
            return;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f49683a.a();
        try {
            final b bVar = this.f49684b;
            this.f49684b.f49687a.clear();
            this.f49684b = null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            if (io.sentry.android.core.internal.util.l.e().a()) {
                w(bVar);
            } else {
                this.f49685c.b(new Runnable() { // from class: io.sentry.android.core.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49668a.w(bVar);
                    }
                });
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C();
    }

    public void h(a aVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49683a.a();
        try {
            k(io.sentry.N0.e());
            if (this.f49684b != null) {
                this.f49684b.f49687a.add(aVar);
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

    public Boolean m() {
        return this.f49686d;
    }

    public void o(C5322z3 c5322z3) {
        if (this.f49684b != null) {
            return;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f49683a.a();
        try {
            k(c5322z3 != null ? c5322z3.getLogger() : io.sentry.N0.e());
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

    public void q(a aVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49683a.a();
        try {
            if (this.f49684b != null) {
                this.f49684b.f49687a.remove(aVar);
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

    void z(boolean z10) {
        this.f49686d = Boolean.valueOf(z10);
    }
}
