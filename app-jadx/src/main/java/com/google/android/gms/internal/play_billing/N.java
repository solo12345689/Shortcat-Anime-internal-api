package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N extends K implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3659e0 f40230b = new L(W.f40414f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f40231c = 0;

    N() {
    }

    static N p(Object[] objArr, int i10) {
        return i10 == 0 ? W.f40414f : new W(objArr, i10);
    }

    public static N s(Collection collection) {
        if (!(collection instanceof K)) {
            Object[] array = collection.toArray();
            int length = array.length;
            U.a(array, length);
            return p(array, length);
        }
        N nE = ((K) collection).e();
        if (!nE.f()) {
            return nE;
        }
        Object[] array2 = nE.toArray();
        return p(array2, array2.length);
    }

    public static N t() {
        return W.f40414f;
    }

    public static N u(Object obj) {
        Object[] objArr = {"inapp"};
        U.a(objArr, 1);
        return p(objArr, 1);
    }

    public static N v(Object obj, Object obj2) {
        Object[] objArr = {"subs", "inapp"};
        U.a(objArr, 2);
        return p(objArr, 2);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.K
    int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.K, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!AbstractC3758z.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC3758z.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public N subList(int i10, int i11) {
        A.d(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? W.f40414f : new M(this, i10, i12);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final AbstractC3659e0 listIterator(int i10) {
        A.b(i10, size(), "index");
        return isEmpty() ? f40230b : new L(this, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.K
    public final N e() {
        return this;
    }
}
