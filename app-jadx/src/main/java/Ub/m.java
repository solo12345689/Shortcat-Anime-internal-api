package Ub;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f19431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f19432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f19433c;

    public m(Iterator iterator, l filter) {
        AbstractC5504s.h(iterator, "iterator");
        AbstractC5504s.h(filter, "filter");
        this.f19431a = iterator;
        this.f19432b = filter;
        b();
    }

    private final void b() {
        while (this.f19431a.hasNext()) {
            Object next = this.f19431a.next();
            this.f19433c = next;
            if (this.f19432b.apply(next)) {
                return;
            }
        }
        this.f19433c = null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19433c != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f19433c;
        AbstractC5504s.e(obj);
        b();
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
