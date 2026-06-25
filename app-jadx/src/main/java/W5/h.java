package w5;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicInteger f62927a = new AtomicInteger(0);

    public void a() {
        if (this.f62927a.compareAndSet(0, 2)) {
            d();
        }
    }

    protected abstract void b(Object obj);

    protected abstract Object c();

    protected abstract void d();

    protected abstract void e(Exception exc);

    protected abstract void f(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f62927a.compareAndSet(0, 1)) {
            try {
                Object objC = c();
                this.f62927a.set(3);
                try {
                    f(objC);
                } finally {
                    b(objC);
                }
            } catch (Exception e10) {
                this.f62927a.set(4);
                e(e10);
            }
        }
    }
}
