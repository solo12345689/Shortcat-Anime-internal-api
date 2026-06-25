package u4;

/* JADX INFO: renamed from: u4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6737g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6736f f61400a = new C6736f();

    public C6736f a() {
        return this.f61400a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(Object obj) {
        if (!g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f61400a.p();
    }

    public boolean f(Exception exc) {
        return this.f61400a.q(exc);
    }

    public boolean g(Object obj) {
        return this.f61400a.r(obj);
    }
}
