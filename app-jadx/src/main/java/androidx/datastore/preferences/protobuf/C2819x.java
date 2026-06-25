package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2819x implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f29524a;

    public C2819x(Iterator it) {
        this.f29524a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f29524a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f29524a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f29524a.remove();
    }
}
