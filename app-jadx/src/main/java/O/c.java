package o;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f54183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f54184d = new Executor() { // from class: o.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f54185e = new Executor() { // from class: o.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f54186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f54187b;

    private c() {
        d dVar = new d();
        this.f54187b = dVar;
        this.f54186a = dVar;
    }

    public static Executor f() {
        return f54185e;
    }

    public static c g() {
        if (f54183c != null) {
            return f54183c;
        }
        synchronized (c.class) {
            try {
                if (f54183c == null) {
                    f54183c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f54183c;
    }

    @Override // o.e
    public void a(Runnable runnable) {
        this.f54186a.a(runnable);
    }

    @Override // o.e
    public boolean b() {
        return this.f54186a.b();
    }

    @Override // o.e
    public void c(Runnable runnable) {
        this.f54186a.c(runnable);
    }
}
