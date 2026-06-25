package P9;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: P9.x */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2014x {
    public static boolean a(Iterable iterable, O9.o oVar) {
        return AbstractC2015y.b(iterable.iterator(), oVar);
    }

    private static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : A.i(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object obj) {
        return AbstractC2015y.k(iterable.iterator(), obj);
    }

    public static Object d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return AbstractC2015y.i(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return f(list);
    }

    public static Object e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return f(A.a(iterable));
            }
        }
        return AbstractC2015y.j(iterable.iterator(), obj);
    }

    private static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static Object g(Iterable iterable) {
        return AbstractC2015y.l(iterable.iterator());
    }

    public static boolean h(Iterable iterable, O9.o oVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (O9.o) O9.n.j(oVar)) : AbstractC2015y.p(iterable.iterator(), oVar);
    }

    private static boolean i(List list, O9.o oVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!oVar.apply(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        j(list, oVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, oVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void j(List list, O9.o oVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (oVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] k(Iterable iterable) {
        return b(iterable).toArray();
    }
}
