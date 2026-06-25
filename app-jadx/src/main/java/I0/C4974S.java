package i0;

import java.util.Iterator;
import java.util.Map;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: i0.S, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4974S extends AbstractC4973Q implements Iterator, InterfaceC5371a {
    public C4974S(C4963G c4963g, Iterator it) {
        super(c4963g, it);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entryI = i();
        if (entryI == null) {
            throw new IllegalStateException();
        }
        e();
        return entryI.getKey();
    }
}
