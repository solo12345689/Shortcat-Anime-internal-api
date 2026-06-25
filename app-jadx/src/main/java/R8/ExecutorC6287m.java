package r8;

import java.util.concurrent.Executor;
import v8.AbstractC6852a;

/* JADX INFO: renamed from: r8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class ExecutorC6287m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f58703a;

    /* JADX INFO: renamed from: r8.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f58704a;

        a(Runnable runnable) {
            this.f58704a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f58704a.run();
            } catch (Exception e10) {
                AbstractC6852a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    ExecutorC6287m(Executor executor) {
        this.f58703a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f58703a.execute(new a(runnable));
    }
}
