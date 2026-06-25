package o4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p4.InterfaceExecutorC5930a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class t implements InterfaceExecutorC5930a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f54505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f54506c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f54504a = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f54507d = new Object();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t f54508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f54509b;

        a(t tVar, Runnable runnable) {
            this.f54508a = tVar;
            this.f54509b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f54509b.run();
                synchronized (this.f54508a.f54507d) {
                    this.f54508a.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f54508a.f54507d) {
                    this.f54508a.b();
                    throw th2;
                }
            }
        }
    }

    public t(Executor executor) {
        this.f54505b = executor;
    }

    void b() {
        Runnable runnable = (Runnable) this.f54504a.poll();
        this.f54506c = runnable;
        if (runnable != null) {
            this.f54505b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f54507d) {
            try {
                this.f54504a.add(new a(this, runnable));
                if (this.f54506c == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p4.InterfaceExecutorC5930a
    public boolean q1() {
        boolean z10;
        synchronized (this.f54507d) {
            z10 = !this.f54504a.isEmpty();
        }
        return z10;
    }
}
