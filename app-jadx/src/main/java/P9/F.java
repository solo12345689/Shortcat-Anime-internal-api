package P9;

import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class F {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AbstractC1994c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient O9.t f13590g;

        a(Map map, O9.t tVar) {
            super(map);
            this.f13590g = (O9.t) O9.n.j(tVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // P9.AbstractC1995d
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public List t() {
            return (List) this.f13590g.get();
        }

        @Override // P9.AbstractC1997f
        Map d() {
            return v();
        }

        @Override // P9.AbstractC1997f
        Set f() {
            return w();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class b extends AbstractCollection {
        b() {
        }

        abstract D b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().b(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b().size();
        }
    }

    static boolean a(D d10, Object obj) {
        if (obj == d10) {
            return true;
        }
        if (obj instanceof D) {
            return d10.asMap().equals(((D) obj).asMap());
        }
        return false;
    }

    public static z b(Map map, O9.t tVar) {
        return new a(map, tVar);
    }
}
