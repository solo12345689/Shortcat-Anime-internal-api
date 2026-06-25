package androidx.work;

import androidx.work.impl.C2954d;
import i4.h;
import i4.q;
import i4.v;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f32661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f32662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final v f32663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h f32664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final q f32665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final K1.a f32666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final K1.a f32667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f32668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f32669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f32670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f32671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f32672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f32673m;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class ThreadFactoryC0545a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f32674a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32675b;

        ThreadFactoryC0545a(boolean z10) {
            this.f32675b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f32675b ? "WM.task-" : "androidx.work-") + this.f32674a.incrementAndGet());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Executor f32677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        v f32678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        h f32679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Executor f32680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        q f32681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        K1.a f32682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        K1.a f32683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f32684h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f32685i = 4;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f32686j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f32687k = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f32688l = 20;

        public a a() {
            return new a(this);
        }
    }

    a(b bVar) {
        Executor executor = bVar.f32677a;
        if (executor == null) {
            this.f32661a = a(false);
        } else {
            this.f32661a = executor;
        }
        Executor executor2 = bVar.f32680d;
        if (executor2 == null) {
            this.f32673m = true;
            this.f32662b = a(true);
        } else {
            this.f32673m = false;
            this.f32662b = executor2;
        }
        v vVar = bVar.f32678b;
        if (vVar == null) {
            this.f32663c = v.c();
        } else {
            this.f32663c = vVar;
        }
        h hVar = bVar.f32679c;
        if (hVar == null) {
            this.f32664d = h.c();
        } else {
            this.f32664d = hVar;
        }
        q qVar = bVar.f32681e;
        if (qVar == null) {
            this.f32665e = new C2954d();
        } else {
            this.f32665e = qVar;
        }
        this.f32669i = bVar.f32685i;
        this.f32670j = bVar.f32686j;
        this.f32671k = bVar.f32687k;
        this.f32672l = bVar.f32688l;
        this.f32666f = bVar.f32682f;
        this.f32667g = bVar.f32683g;
        this.f32668h = bVar.f32684h;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new ThreadFactoryC0545a(z10);
    }

    public String c() {
        return this.f32668h;
    }

    public Executor d() {
        return this.f32661a;
    }

    public K1.a e() {
        return this.f32666f;
    }

    public h f() {
        return this.f32664d;
    }

    public int g() {
        return this.f32671k;
    }

    public int h() {
        return this.f32672l;
    }

    public int i() {
        return this.f32670j;
    }

    public int j() {
        return this.f32669i;
    }

    public q k() {
        return this.f32665e;
    }

    public K1.a l() {
        return this.f32667g;
    }

    public Executor m() {
        return this.f32662b;
    }

    public v n() {
        return this.f32663c;
    }
}
