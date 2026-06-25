package t2;

import android.os.Looper;

/* JADX INFO: renamed from: t2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6620g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6631s f60590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6631s f60591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f60592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f60593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f60594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f60595f;

    /* JADX INFO: renamed from: t2.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(Object obj, Object obj2);
    }

    public C6620g(Object obj, Looper looper, Looper looper2, InterfaceC6623j interfaceC6623j, a aVar) {
        this.f60590a = interfaceC6623j.e(looper, null);
        this.f60591b = interfaceC6623j.e(looper2, null);
        this.f60593d = obj;
        this.f60594e = obj;
        this.f60592c = aVar;
    }

    public static /* synthetic */ void a(final C6620g c6620g, O9.f fVar) {
        final Object objApply = fVar.apply(c6620g.f60594e);
        c6620g.f60594e = objApply;
        c6620g.f(new Runnable() { // from class: t2.f
            @Override // java.lang.Runnable
            public final void run() {
                C6620g.c(this.f60588a, objApply);
            }
        });
    }

    public static /* synthetic */ void b(C6620g c6620g, Object obj) {
        if (c6620g.f60595f == 0) {
            c6620g.i(obj);
        }
    }

    public static /* synthetic */ void c(C6620g c6620g, Object obj) {
        int i10 = c6620g.f60595f - 1;
        c6620g.f60595f = i10;
        if (i10 == 0) {
            c6620g.i(obj);
        }
    }

    private void f(Runnable runnable) {
        if (this.f60591b.g().getThread().isAlive()) {
            this.f60591b.i(runnable);
        }
    }

    private void i(Object obj) {
        Object obj2 = this.f60593d;
        this.f60593d = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f60592c.a(obj2, obj);
    }

    public Object d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f60591b.g()) {
            return this.f60593d;
        }
        AbstractC6614a.g(looperMyLooper == this.f60590a.g());
        return this.f60594e;
    }

    public void e(Runnable runnable) {
        if (this.f60590a.g().getThread().isAlive()) {
            this.f60590a.i(runnable);
        }
    }

    public void g(final Object obj) {
        this.f60594e = obj;
        f(new Runnable() { // from class: t2.d
            @Override // java.lang.Runnable
            public final void run() {
                C6620g.b(this.f60584a, obj);
            }
        });
    }

    public void h(O9.f fVar, final O9.f fVar2) {
        AbstractC6614a.g(Looper.myLooper() == this.f60591b.g());
        this.f60595f++;
        e(new Runnable() { // from class: t2.e
            @Override // java.lang.Runnable
            public final void run() {
                C6620g.a(this.f60586a, fVar2);
            }
        });
        i(fVar.apply(this.f60593d));
    }
}
