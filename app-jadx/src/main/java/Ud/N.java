package Ud;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class N implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f19491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19492b;

    public N(Iterator iterator) {
        AbstractC5504s.h(iterator, "iterator");
        this.f19491a = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final L next() {
        int i10 = this.f19492b;
        this.f19492b = i10 + 1;
        if (i10 < 0) {
            AbstractC2281w.w();
        }
        return new L(i10, this.f19491a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19491a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
