package O9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f13071a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f13072b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean d() {
        this.f13071a = a.FAILED;
        this.f13072b = b();
        if (this.f13071a == a.DONE) {
            return false;
        }
        this.f13071a = a.READY;
        return true;
    }

    protected abstract Object b();

    protected final Object c() {
        this.f13071a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n.p(this.f13071a != a.FAILED);
        int iOrdinal = this.f13071a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return d();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f13071a = a.NOT_READY;
        Object objA = i.a(this.f13072b);
        this.f13072b = null;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
