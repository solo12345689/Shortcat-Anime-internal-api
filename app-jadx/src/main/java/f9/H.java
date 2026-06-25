package f9;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class H extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46964b;

    protected H(int i10, int i11) {
        z.c(i11, i10, "index");
        this.f46963a = i10;
        this.f46964b = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f46964b < this.f46963a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f46964b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f46964b;
        this.f46964b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f46964b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f46964b - 1;
        this.f46964b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f46964b - 1;
    }
}
