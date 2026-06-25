package Ud;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: Ud.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2262c implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f19501b;

    private final boolean f() {
        this.f19500a = 3;
        b();
        return this.f19500a == 1;
    }

    protected abstract void b();

    protected final void d() {
        this.f19500a = 2;
    }

    protected final void e(Object obj) {
        this.f19501b = obj;
        this.f19500a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f19500a;
        if (i10 == 0) {
            return f();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f19500a;
        if (i10 == 1) {
            this.f19500a = 0;
            return this.f19501b;
        }
        if (i10 == 2 || !f()) {
            throw new NoSuchElementException();
        }
        this.f19500a = 0;
        return this.f19501b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
