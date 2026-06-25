package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class X5 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    private Object[] f39673a;

    /* JADX INFO: renamed from: b */
    private int f39674b;

    /* JADX INFO: renamed from: c */
    private Map f39675c;

    /* JADX INFO: renamed from: d */
    private boolean f39676d;

    /* JADX INFO: renamed from: e */
    private volatile W5 f39677e;

    /* JADX INFO: renamed from: f */
    private Map f39678f;

    /* synthetic */ X5(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f39675c = map;
        this.f39678f = map;
    }

    /* JADX INFO: renamed from: m */
    public final Object h(int i10) {
        i();
        Object value = ((U5) this.f39673a[i10]).getValue();
        Object[] objArr = this.f39673a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f39674b - i10) - 1);
        this.f39674b--;
        if (!this.f39675c.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            Object[] objArr2 = this.f39673a;
            int i11 = this.f39674b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new U5(this, (Comparable) entry.getKey(), entry.getValue());
            this.f39674b++;
            it.remove();
        }
        return value;
    }

    private final int n(Comparable comparable) {
        int i10 = this.f39674b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((U5) this.f39673a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((U5) this.f39673a[i13]).a());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: renamed from: o */
    public final void i() {
        if (this.f39676d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap p() {
        i();
        if (this.f39675c.isEmpty() && !(this.f39675c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f39675c = treeMap;
            this.f39678f = treeMap.descendingMap();
        }
        return (SortedMap) this.f39675c;
    }

    public void a() {
        if (this.f39676d) {
            return;
        }
        this.f39675c = this.f39675c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f39675c);
        this.f39678f = this.f39678f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f39678f);
        this.f39676d = true;
    }

    public final boolean b() {
        return this.f39676d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        if (this.f39674b != 0) {
            this.f39673a = null;
            this.f39674b = 0;
        }
        if (this.f39675c.isEmpty()) {
            return;
        }
        this.f39675c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f39675c.containsKey(comparable);
    }

    public final int d() {
        return this.f39674b;
    }

    public final Map.Entry e(int i10) {
        if (i10 < this.f39674b) {
            return (U5) this.f39673a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f39677e == null) {
            this.f39677e = new W5(this, null);
        }
        return this.f39677e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X5)) {
            return super.equals(obj);
        }
        X5 x52 = (X5) obj;
        int size = size();
        if (size != x52.size()) {
            return false;
        }
        int i10 = this.f39674b;
        if (i10 != x52.f39674b) {
            return entrySet().equals(x52.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!e(i11).equals(x52.e(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f39675c.equals(x52.f39675c);
        }
        return true;
    }

    public final Iterable f() {
        return this.f39675c.isEmpty() ? Collections.EMPTY_SET : this.f39675c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g */
    public final Object put(Comparable comparable, Object obj) {
        i();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((U5) this.f39673a[iN]).setValue(obj);
        }
        i();
        if (this.f39673a == null) {
            this.f39673a = new Object[16];
        }
        int i10 = -(iN + 1);
        if (i10 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.f39674b == 16) {
            U5 u52 = (U5) this.f39673a[15];
            this.f39674b = 15;
            p().put(u52.a(), u52.getValue());
        }
        Object[] objArr = this.f39673a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f39673a[i10] = new U5(this, comparable, obj);
        this.f39674b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((U5) this.f39673a[iN]).getValue() : this.f39675c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f39674b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f39673a[i11].hashCode();
        }
        return this.f39675c.size() > 0 ? iHashCode + this.f39675c.hashCode() : iHashCode;
    }

    final /* synthetic */ Object[] j() {
        return this.f39673a;
    }

    final /* synthetic */ int k() {
        return this.f39674b;
    }

    final /* synthetic */ Map l() {
        return this.f39675c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        if (iN >= 0) {
            return h(iN);
        }
        if (this.f39675c.isEmpty()) {
            return null;
        }
        return this.f39675c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f39674b + this.f39675c.size();
    }
}
