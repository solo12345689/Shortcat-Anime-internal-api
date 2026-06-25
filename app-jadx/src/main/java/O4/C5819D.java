package o4;

import java.util.HashMap;
import java.util.Map;
import n4.C5737m;

/* JADX INFO: renamed from: o4.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5819D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f54475e = i4.i.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i4.q f54476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f54477b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f54478c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f54479d = new Object();

    /* JADX INFO: renamed from: o4.D$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(C5737m c5737m);
    }

    /* JADX INFO: renamed from: o4.D$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5819D f54480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C5737m f54481b;

        b(C5819D c5819d, C5737m c5737m) {
            this.f54480a = c5819d;
            this.f54481b = c5737m;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f54480a.f54479d) {
                try {
                    if (((b) this.f54480a.f54477b.remove(this.f54481b)) != null) {
                        a aVar = (a) this.f54480a.f54478c.remove(this.f54481b);
                        if (aVar != null) {
                            aVar.a(this.f54481b);
                        }
                    } else {
                        i4.i.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f54481b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C5819D(i4.q qVar) {
        this.f54476a = qVar;
    }

    public void a(C5737m c5737m, long j10, a aVar) {
        synchronized (this.f54479d) {
            i4.i.e().a(f54475e, "Starting timer for " + c5737m);
            b(c5737m);
            b bVar = new b(this, c5737m);
            this.f54477b.put(c5737m, bVar);
            this.f54478c.put(c5737m, aVar);
            this.f54476a.b(j10, bVar);
        }
    }

    public void b(C5737m c5737m) {
        synchronized (this.f54479d) {
            try {
                if (((b) this.f54477b.remove(c5737m)) != null) {
                    i4.i.e().a(f54475e, "Stopping timer for " + c5737m);
                    this.f54478c.remove(c5737m);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
