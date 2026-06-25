package u4;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: u4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6732b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C6732b f61371d = new C6732b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f61372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f61373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f61374c;

    /* JADX INFO: renamed from: u4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class ExecutorC0917b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ThreadLocal f61375a;

        private ExecutorC0917b() {
            this.f61375a = new ThreadLocal();
        }

        private int b() {
            Integer num = (Integer) this.f61375a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f61375a.remove();
                return iIntValue;
            }
            this.f61375a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        private int c() {
            Integer num = (Integer) this.f61375a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f61375a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (c() <= 15) {
                    runnable.run();
                } else {
                    C6732b.a().execute(runnable);
                }
                b();
            } catch (Throwable th2) {
                b();
                throw th2;
            }
        }
    }

    private C6732b() {
        this.f61372a = !c() ? Executors.newCachedThreadPool() : C6731a.b();
        this.f61373b = Executors.newSingleThreadScheduledExecutor();
        this.f61374c = new ExecutorC0917b();
    }

    public static ExecutorService a() {
        return f61371d.f61372a;
    }

    static Executor b() {
        return f61371d.f61374c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
