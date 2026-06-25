package androidx.core.view;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class W implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f28992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f28993b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f28994c;

    public W(Iterator it, Function1 function1) {
        this.f28992a = function1;
        this.f28994c = it;
    }

    private final void b(Object obj) {
        Iterator it = (Iterator) this.f28992a.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f28993b.add(this.f28994c);
            this.f28994c = it;
        } else {
            while (!this.f28994c.hasNext() && !this.f28993b.isEmpty()) {
                this.f28994c = (Iterator) AbstractC2279u.y0(this.f28993b);
                AbstractC2279u.M(this.f28993b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28994c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f28994c.next();
        b(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
