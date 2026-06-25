package K0;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class D0 extends TreeSet {
    public D0(Comparator comparator) {
        super(comparator);
    }

    public /* bridge */ int c() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
