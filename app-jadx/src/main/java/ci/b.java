package ci;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class b implements Runnable, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f33705a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f33706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f33707c;

    b(c cVar) {
        this.f33706b = cVar;
    }

    @Override // ci.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            try {
                this.f33705a.a(jVarA);
                if (!this.f33707c) {
                    this.f33707c = true;
                    this.f33706b.d().execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVarC;
        while (true) {
            try {
                try {
                    jVarC = this.f33705a.c(1000);
                } catch (InterruptedException e10) {
                    this.f33706b.e().a(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e10);
                    this.f33707c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f33707c = false;
                throw th2;
            }
            if (jVarC == null) {
                synchronized (this) {
                    jVarC = this.f33705a.b();
                    if (jVarC == null) {
                        this.f33707c = false;
                        this.f33707c = false;
                        return;
                    }
                    this.f33707c = false;
                    throw th2;
                }
            }
            this.f33706b.g(jVarC);
        }
    }
}
