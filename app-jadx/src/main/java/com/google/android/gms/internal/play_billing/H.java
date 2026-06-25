package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class H extends AbstractC3659e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40211b;

    protected H(int i10, int i11) {
        A.b(i11, i10, "index");
        this.f40210a = i10;
        this.f40211b = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40211b < this.f40210a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40211b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f40211b;
        this.f40211b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40211b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f40211b - 1;
        this.f40211b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40211b - 1;
    }
}
