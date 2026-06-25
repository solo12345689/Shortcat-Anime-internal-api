package P9;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: P9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1993b extends X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f13637a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f13638b;

    /* JADX INFO: renamed from: P9.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC1993b() {
    }

    private boolean d() {
        this.f13637a = a.FAILED;
        this.f13638b = b();
        if (this.f13637a == a.DONE) {
            return false;
        }
        this.f13637a = a.READY;
        return true;
    }

    protected abstract Object b();

    protected final Object c() {
        this.f13637a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        O9.n.p(this.f13637a != a.FAILED);
        int iOrdinal = this.f13637a.ordinal();
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
        this.f13637a = a.NOT_READY;
        Object objA = I.a(this.f13638b);
        this.f13638b = null;
        return objA;
    }
}
