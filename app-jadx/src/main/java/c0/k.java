package c0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC3056a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f33409c;

    public k(Object obj, int i10) {
        super(i10, 1);
        this.f33409c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        g(e() + 1);
        return this.f33409c;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        d();
        g(e() - 1);
        return this.f33409c;
    }
}
