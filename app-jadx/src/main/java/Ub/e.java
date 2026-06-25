package Ub;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f19424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator f19425b;

    public e(Iterator first, Iterator second) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        this.f19424a = first;
        this.f19425b = second;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19424a.hasNext() || this.f19425b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f19424a.hasNext() ? this.f19424a.next() : this.f19425b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
