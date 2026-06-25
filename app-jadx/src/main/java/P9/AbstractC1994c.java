package P9;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: P9.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1994c extends AbstractC1995d implements z {
    protected AbstractC1994c(Map map) {
        super(map);
    }

    @Override // P9.AbstractC1995d
    Collection A(Object obj, Collection collection) {
        return B(obj, (List) collection, null);
    }

    @Override // P9.AbstractC1995d, P9.D
    /* JADX INFO: renamed from: C */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // P9.AbstractC1997f, P9.D
    public Map asMap() {
        return super.asMap();
    }

    @Override // P9.AbstractC1997f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // P9.AbstractC1995d, P9.D
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // P9.AbstractC1995d
    Collection z(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }
}
