package o5;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5828e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f54534a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f54535b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Executor f54536c = new c();

    /* JADX INFO: renamed from: o5.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.w(runnable);
        }
    }

    /* JADX INFO: renamed from: o5.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.v(runnable);
        }
    }

    /* JADX INFO: renamed from: o5.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Executor {
        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f54536c;
    }

    public static Executor b() {
        return f54534a;
    }
}
