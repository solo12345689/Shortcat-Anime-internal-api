package e0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: e0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C4638c implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f45773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f45774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45775c;

    public C4638c(Object obj, Map map) {
        this.f45773a = obj;
        this.f45774b = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f45775c < this.f45774b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        b();
        Object obj = this.f45773a;
        this.f45775c++;
        Object obj2 = this.f45774b.get(obj);
        if (obj2 != null) {
            this.f45773a = ((C4636a) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
