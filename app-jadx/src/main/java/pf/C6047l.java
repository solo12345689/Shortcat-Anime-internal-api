package pf;

/* JADX INFO: renamed from: pf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class C6047l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f56072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f56073b = Thread.currentThread();

    C6047l(Object obj) {
        this.f56072a = obj;
    }

    public Object a() {
        if (b()) {
            return this.f56072a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f56073b == Thread.currentThread();
    }
}
