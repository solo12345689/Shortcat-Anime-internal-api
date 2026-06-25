package y7;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f64912a = new n();

    public final n a() {
        return this.f64912a;
    }

    public final void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void d(Object obj) {
        if (!g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public final boolean e() {
        return this.f64912a.E();
    }

    public final boolean f(Exception exc) {
        return this.f64912a.F(exc);
    }

    public final boolean g(Object obj) {
        return this.f64912a.G(obj);
    }
}
