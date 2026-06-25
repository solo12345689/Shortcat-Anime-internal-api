package t;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6559i implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f60076c;

    public AbstractC6559i(int i10) {
        this.f60074a = i10;
    }

    protected abstract Object b(int i10);

    protected abstract void d(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f60075b < this.f60074a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objB = b(this.f60075b);
        this.f60075b++;
        this.f60076c = true;
        return objB;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f60076c) {
            AbstractC6705d.b("Call next() before removing an element.");
        }
        int i10 = this.f60075b - 1;
        this.f60075b = i10;
        d(i10);
        this.f60074a--;
        this.f60076c = false;
    }
}
