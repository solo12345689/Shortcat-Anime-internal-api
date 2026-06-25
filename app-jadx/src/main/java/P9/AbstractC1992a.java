package P9;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: P9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1992a extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13636b;

    protected AbstractC1992a(int i10, int i11) {
        O9.n.m(i11, i10);
        this.f13635a = i10;
        this.f13636b = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13636b < this.f13635a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13636b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13636b;
        this.f13636b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13636b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13636b - 1;
        this.f13636b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13636b - 1;
    }
}
