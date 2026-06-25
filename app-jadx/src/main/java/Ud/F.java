package Ud;

import ie.InterfaceC5082a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class F extends D {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Cf.i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Iterable f19483a;

        public a(Iterable iterable) {
            this.f19483a = iterable;
        }

        @Override // Cf.i
        public Iterator iterator() {
            return this.f19483a.iterator();
        }
    }

    public static Object A0(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List B0(Iterable iterable, Function1 transform) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(transform, "transform");
        ArrayList arrayList = new ArrayList(AbstractC2282x.x(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static Comparable C0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable D0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List E0(Iterable iterable, Iterable elements) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(elements, "elements");
        Collection collectionF = B.F(elements);
        if (collectionF.isEmpty()) {
            return b1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionF.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List F0(Iterable iterable, Object obj) {
        AbstractC5504s.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC2282x.x(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && AbstractC5504s.c(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List G0(Iterable iterable, Iterable elements) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(elements, "elements");
        if (iterable instanceof Collection) {
            return I0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        B.D(arrayList, iterable);
        B.D(arrayList, elements);
        return arrayList;
    }

    public static List H0(Iterable iterable, Object obj) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return J0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        B.D(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List I0(Collection collection, Iterable elements) {
        AbstractC5504s.h(collection, "<this>");
        AbstractC5504s.h(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            B.D(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List J0(Collection collection, Object obj) {
        AbstractC5504s.h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List K0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return b1(iterable);
        }
        List listC1 = c1(iterable);
        D.Z(listC1);
        return listC1;
    }

    public static Object L0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return M0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object M0(List list) {
        AbstractC5504s.h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object N0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object O0(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List P0(List list, C5870f indices) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(indices, "indices");
        return indices.isEmpty() ? AbstractC2281w.m() : b1(list.subList(indices.b().intValue(), indices.e().intValue() + 1));
    }

    public static List Q0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listC1 = c1(iterable);
            A.A(listC1);
            return listC1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return b1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC2276q.H((Comparable[]) array);
        return AbstractC2276q.e(array);
    }

    public static List R0(Iterable iterable, Comparator comparator) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listC1 = c1(iterable);
            A.B(listC1, comparator);
            return listC1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return b1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC2276q.I(array, comparator);
        return AbstractC2276q.e(array);
    }

    public static double S0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static List T0(Iterable iterable, int i10) {
        AbstractC5504s.h(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC2281w.m();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return b1(iterable);
            }
            if (i10 == 1) {
                return AbstractC2280v.e(l0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return AbstractC2281w.t(arrayList);
    }

    public static List U0(List list, int i10) {
        AbstractC5504s.h(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC2281w.m();
        }
        int size = list.size();
        if (i10 >= size) {
            return b1(list);
        }
        if (i10 == 1) {
            return AbstractC2280v.e(y0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] V0(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    public static final Collection W0(Iterable iterable, Collection destination) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static double[] X0(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = ((Number) it.next()).doubleValue();
            i10++;
        }
        return dArr;
    }

    public static float[] Y0(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static HashSet Z0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        return (HashSet) W0(iterable, new HashSet(U.e(AbstractC2282x.x(iterable, 12))));
    }

    public static int[] a1(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static boolean b0(Iterable iterable, Function1 predicate) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static List b1(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC2281w.t(c1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC2281w.m();
        }
        if (size != 1) {
            return d1(collection);
        }
        return AbstractC2280v.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static Cf.i c0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        return new a(iterable);
    }

    public static final List c1(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        return iterable instanceof Collection ? d1((Collection) iterable) : (List) W0(iterable, new ArrayList());
    }

    public static double d0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i10++;
            if (i10 < 0) {
                AbstractC2281w.v();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    public static List d1(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        return new ArrayList(collection);
    }

    public static boolean e0(Iterable iterable, Object obj) {
        AbstractC5504s.h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : q0(iterable, obj) >= 0;
    }

    public static Set e1(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) W0(iterable, new LinkedHashSet());
    }

    public static List f0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        return b1(e1(iterable));
    }

    public static Set f1(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return c0.g((Set) W0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return c0.d();
        }
        if (size != 1) {
            return (Set) W0(iterable, new LinkedHashSet(U.e(collection.size())));
        }
        return b0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List g0(Iterable iterable, int i10) {
        ArrayList arrayList;
        AbstractC5504s.h(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return b1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return AbstractC2281w.m();
            }
            if (size == 1) {
                return AbstractC2280v.e(x0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return AbstractC2281w.t(arrayList);
    }

    public static Set g1(Iterable iterable, Iterable other) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(other, "other");
        Set setE1 = e1(iterable);
        B.D(setE1, other);
        return setE1;
    }

    public static List h0(List list, int i10) {
        AbstractC5504s.h(list, "<this>");
        if (i10 >= 0) {
            return T0(list, AbstractC5874j.e(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static Iterable h1(final Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        return new M(new InterfaceC5082a() { // from class: Ud.E
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return F.i1(iterable);
            }
        });
    }

    public static List i0(Iterable iterable, Function1 predicate) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Iterator i1(Iterable iterable) {
        return iterable.iterator();
    }

    public static List j0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        return (List) k0(iterable, new ArrayList());
    }

    public static List j1(Iterable iterable, Iterable other) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2282x.x(iterable, 10), AbstractC2282x.x(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(Td.z.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Collection k0(Iterable iterable, Collection destination) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object l0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return m0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object m0(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object n0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object o0(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object p0(List list, int i10) {
        AbstractC5504s.h(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final int q0(Iterable iterable, Object obj) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC2281w.w();
            }
            if (AbstractC5504s.c(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int r0(List list, Object obj) {
        AbstractC5504s.h(list, "<this>");
        return list.indexOf(obj);
    }

    public static Set s0(Iterable iterable, Iterable other) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(other, "other");
        Set setE1 = e1(iterable);
        B.P(setE1, other);
        return setE1;
    }

    public static final Appendable t0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(buffer, "buffer");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Df.r.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String v0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        return ((StringBuilder) t0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String w0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return v0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static Object x0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof List) {
            return y0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object y0(List list) {
        AbstractC5504s.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC2281w.o(list));
    }

    public static Object z0(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
