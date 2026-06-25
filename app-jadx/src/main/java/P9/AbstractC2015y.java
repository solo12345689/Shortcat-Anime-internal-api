package P9;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: P9.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2015y {

    /* JADX INFO: renamed from: P9.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC1993b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f13744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ O9.o f13745d;

        a(Iterator it, O9.o oVar) {
            this.f13744c = it;
            this.f13745d = oVar;
        }

        @Override // P9.AbstractC1993b
        protected Object b() {
            while (this.f13744c.hasNext()) {
                Object next = this.f13744c.next();
                if (this.f13745d.apply(next)) {
                    return next;
                }
            }
            return c();
        }
    }

    /* JADX INFO: renamed from: P9.y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum b implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC1999h.c(false);
        }
    }

    /* JADX INFO: renamed from: P9.y$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f13748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f13749b;

        c(Object obj) {
            this.f13748a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f13749b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f13749b) {
                throw new NoSuchElementException();
            }
            this.f13749b = true;
            return this.f13748a;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        O9.n.j(collection);
        O9.n.j(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator it, O9.o oVar) {
        return m(it, oVar) != -1;
    }

    static void c(Iterator it) {
        O9.n.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !O9.j.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static Iterator f() {
        return b.INSTANCE;
    }

    public static X g(Iterator it, O9.o oVar) {
        O9.n.j(it);
        O9.n.j(oVar);
        return new a(it, oVar);
    }

    public static Object h(Iterator it, O9.o oVar) {
        O9.n.j(it);
        O9.n.j(oVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (oVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object i(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object j(Iterator it, Object obj) {
        return it.hasNext() ? i(it) : obj;
    }

    public static Object k(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object l(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int m(Iterator it, O9.o oVar) {
        O9.n.k(oVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static Object n(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean o(Iterator it, Collection collection) {
        O9.n.j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean p(Iterator it, O9.o oVar) {
        O9.n.j(oVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static X q(Object obj) {
        return new c(obj);
    }
}
