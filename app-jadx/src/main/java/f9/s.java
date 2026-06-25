package f9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f46983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46984b = 2;

    protected s() {
    }

    protected abstract Object b();

    protected final Object c() {
        this.f46984b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        z.a(this.f46984b != 4);
        int i10 = this.f46984b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f46984b = 4;
            this.f46983a = b();
            if (this.f46984b != 3) {
                this.f46984b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f46984b = 2;
        Object obj = this.f46983a;
        this.f46983a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
