package d0;

import java.util.Iterator;
import java.util.Map;
import je.InterfaceC5371a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f44920a;

    public i(f fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f44920a = new g(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f44920a.next();
    }

    public final void d(Object obj, Object obj2) {
        this.f44920a.m(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f44920a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f44920a.remove();
    }
}
