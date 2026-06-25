package G1;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f6976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f6977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6978d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f6978d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f6975a) {
                    return;
                }
                this.f6975a = true;
                this.f6978d = true;
                a aVar = this.f6976b;
                Object obj = this.f6977c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f6978d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f6978d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f6977c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f6977c = cancellationSignal;
                    if (this.f6975a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f6977c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f6976b == aVar) {
                    return;
                }
                this.f6976b = aVar;
                if (this.f6975a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }
}
