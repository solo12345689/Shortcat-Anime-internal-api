package Ud;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B extends A {
    public static boolean C(Collection collection, Cf.i elements) {
        AbstractC5504s.h(collection, "<this>");
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean D(Collection collection, Iterable elements) {
        AbstractC5504s.h(collection, "<this>");
        AbstractC5504s.h(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean E(Collection collection, Object[] elements) {
        AbstractC5504s.h(collection, "<this>");
        AbstractC5504s.h(elements, "elements");
        return collection.addAll(AbstractC2276q.e(elements));
    }

    public static final Collection F(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : F.b1(iterable);
    }

    private static final boolean G(Iterable iterable, Function1 function1, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final boolean H(List list, Function1 function1, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            AbstractC5504s.f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return G(kotlin.jvm.internal.V.b(list), function1, z10);
        }
        int iO = AbstractC2281w.o(list);
        if (iO >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) function1.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iO2 = AbstractC2281w.o(list);
        if (i10 > iO2) {
            return true;
        }
        while (true) {
            list.remove(iO2);
            if (iO2 == i10) {
                return true;
            }
            iO2--;
        }
    }

    public static boolean I(Iterable iterable, Function1 predicate) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return G(iterable, predicate, true);
    }

    public static final boolean J(Collection collection, Iterable elements) {
        AbstractC5504s.h(collection, "<this>");
        AbstractC5504s.h(elements, "elements");
        return collection.removeAll(F(elements));
    }

    public static boolean K(List list, Function1 predicate) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return H(list, predicate, true);
    }

    public static Object L(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object M(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC2281w.o(list));
    }

    public static Object N(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(AbstractC2281w.o(list));
    }

    public static boolean O(Iterable iterable, Function1 predicate) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return G(iterable, predicate, false);
    }

    public static final boolean P(Collection collection, Iterable elements) {
        AbstractC5504s.h(collection, "<this>");
        AbstractC5504s.h(elements, "elements");
        return collection.retainAll(F(elements));
    }

    public static boolean Q(List list, Function1 predicate) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return H(list, predicate, false);
    }
}
