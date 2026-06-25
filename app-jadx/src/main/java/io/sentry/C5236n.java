package io.sentry;

import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5236n implements InterfaceC5211i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f50862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5322z3 f50863g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5288a f50857a = new C5288a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Timer f50858b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f50859c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f50864h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f50865i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f50860d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f50861e = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = C5236n.this.f50860d.iterator();
            while (it.hasNext()) {
                ((W) it.next()).c();
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.n$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f50867a;

        b(List list) {
            this.f50867a = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C5236n.this.f50865i <= 10) {
                return;
            }
            this.f50867a.clear();
            C5236n.this.f50865i = jCurrentTimeMillis;
            C5248p1 c5248p1 = new C5248p1(C5236n.this.f50863g.getDateProvider().now().m());
            Iterator it = C5236n.this.f50860d.iterator();
            while (it.hasNext()) {
                ((W) it.next()).d(c5248p1);
            }
            for (c cVar : C5236n.this.f50859c.values()) {
                if (cVar.c(c5248p1) && cVar.f50870b != null) {
                    this.f50867a.add(cVar.f50870b);
                }
            }
            Iterator it2 = this.f50867a.iterator();
            while (it2.hasNext()) {
                C5236n.this.d((InterfaceC5217j0) it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.n$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f50869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC5217j0 f50870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f50871c;

        /* synthetic */ c(C5236n c5236n, InterfaceC5217j0 interfaceC5217j0, a aVar) {
            this(interfaceC5217j0);
        }

        boolean c(C5248p1 c5248p1) {
            this.f50869a.add(c5248p1);
            return this.f50870b != null && C5236n.this.f50863g.getDateProvider().now().m() > this.f50871c + TimeUnit.MILLISECONDS.toNanos(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
        }

        private c(InterfaceC5217j0 interfaceC5217j0) {
            this.f50869a = new ArrayList();
            this.f50870b = interfaceC5217j0;
            this.f50871c = C5236n.this.f50863g.getDateProvider().now().m();
        }
    }

    public C5236n(C5322z3 c5322z3) {
        boolean z10 = false;
        this.f50863g = (C5322z3) io.sentry.util.w.c(c5322z3, "The options object is required.");
        for (U u10 : c5322z3.getPerformanceCollectors()) {
            if (u10 instanceof W) {
                this.f50860d.add((W) u10);
            }
            if (u10 instanceof V) {
                this.f50861e.add((V) u10);
            }
        }
        if (this.f50860d.isEmpty() && this.f50861e.isEmpty()) {
            z10 = true;
        }
        this.f50862f = z10;
    }

    @Override // io.sentry.InterfaceC5211i
    public void a(InterfaceC5207h0 interfaceC5207h0) {
        Iterator it = this.f50861e.iterator();
        while (it.hasNext()) {
            ((V) it.next()).a(interfaceC5207h0);
        }
    }

    @Override // io.sentry.InterfaceC5211i
    public void b(InterfaceC5207h0 interfaceC5207h0) {
        Iterator it = this.f50861e.iterator();
        while (it.hasNext()) {
            ((V) it.next()).b(interfaceC5207h0);
        }
    }

    @Override // io.sentry.InterfaceC5211i
    public List c(String str) {
        c cVar = (c) this.f50859c.remove(str);
        this.f50863g.getLogger().c(EnumC5215i3.DEBUG, "stop collecting performance info for " + str, new Object[0]);
        if (this.f50859c.isEmpty()) {
            close();
        }
        if (cVar != null) {
            return cVar.f50869a;
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5211i
    public void close() {
        this.f50863g.getLogger().c(EnumC5215i3.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f50859c.clear();
        Iterator it = this.f50861e.iterator();
        while (it.hasNext()) {
            ((V) it.next()).clear();
        }
        if (this.f50864h.getAndSet(false)) {
            InterfaceC5192e0 interfaceC5192e0A = this.f50857a.a();
            try {
                if (this.f50858b != null) {
                    this.f50858b.cancel();
                    this.f50858b = null;
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

    @Override // io.sentry.InterfaceC5211i
    public List d(InterfaceC5217j0 interfaceC5217j0) {
        this.f50863g.getLogger().c(EnumC5215i3.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC5217j0.getName(), interfaceC5217j0.q().p().toString());
        Iterator it = this.f50861e.iterator();
        while (it.hasNext()) {
            ((V) it.next()).a(interfaceC5217j0);
        }
        return c(interfaceC5217j0.f().toString());
    }

    @Override // io.sentry.InterfaceC5211i
    public void e(InterfaceC5217j0 interfaceC5217j0) {
        if (this.f50862f) {
            this.f50863g.getLogger().c(EnumC5215i3.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f50861e.iterator();
        while (it.hasNext()) {
            ((V) it.next()).b(interfaceC5217j0);
        }
        String string = interfaceC5217j0.f().toString();
        if (!this.f50859c.containsKey(string)) {
            this.f50859c.put(string, new c(this, interfaceC5217j0, null));
        }
        f(string);
    }

    @Override // io.sentry.InterfaceC5211i
    public void f(String str) {
        if (this.f50862f) {
            this.f50863g.getLogger().c(EnumC5215i3.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f50859c.containsKey(str)) {
            this.f50859c.put(str, new c(this, null, 0 == true ? 1 : 0));
        }
        if (this.f50864h.getAndSet(true)) {
            return;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f50857a.a();
        try {
            if (this.f50858b == null) {
                this.f50858b = new Timer(true);
            }
            this.f50858b.schedule(new a(), 0L);
            this.f50858b.scheduleAtFixedRate(new b(new ArrayList()), 100L, 100L);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } finally {
        }
    }
}
