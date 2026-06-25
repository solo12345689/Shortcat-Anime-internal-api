package Ze;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f23345a;

    public l(Iterator it) {
        this.f23345a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f23345a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23345a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f23345a.remove();
    }
}
