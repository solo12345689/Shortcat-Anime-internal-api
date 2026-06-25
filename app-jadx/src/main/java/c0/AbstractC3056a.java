package c0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: c0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3056a implements ListIterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33386b;

    public AbstractC3056a(int i10, int i11) {
        this.f33385a = i10;
        this.f33386b = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int e() {
        return this.f33385a;
    }

    public final int f() {
        return this.f33386b;
    }

    public final void g(int i10) {
        this.f33385a = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f33385a < this.f33386b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f33385a > 0;
    }

    public final void i(int i10) {
        this.f33386b = i10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f33385a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f33385a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
