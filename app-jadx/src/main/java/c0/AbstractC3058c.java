package c0;

import Ud.AbstractC2263d;
import b0.InterfaceC2966c;
import b0.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3058c extends AbstractC2263d implements b0.e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    @Override // java.util.Collection, java.util.List, b0.e
    public b0.e addAll(Collection collection) {
        e.a aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // Ud.AbstractC2261b, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // Ud.AbstractC2263d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, b0.e
    public b0.e remove(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? h0(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, b0.e
    public b0.e removeAll(final Collection collection) {
        return t1(new Function1() { // from class: c0.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractC3058c.i(collection, obj));
            }
        });
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public InterfaceC2966c subList(int i10, int i11) {
        return super.subList(i10, i11);
    }
}
