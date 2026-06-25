package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 extends AbstractC3341c0 implements RandomAccess, J0 {

    /* JADX INFO: renamed from: c */
    private static final I0 f39076c;

    /* JADX INFO: renamed from: d */
    public static final J0 f39077d;

    /* JADX INFO: renamed from: b */
    private final List f39078b;

    static {
        I0 i02 = new I0(false);
        f39076c = i02;
        f39077d = i02;
    }

    public I0(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f39078b = arrayList;
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC3383q0 ? ((AbstractC3383q0) obj).u(G0.f39064b) : G0.d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 a(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f39078b);
        return new I0(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        b();
        this.f39078b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3341c0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof J0) {
            collection = ((J0) collection).o();
        }
        boolean zAddAll = this.f39078b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c */
    public final String get(int i10) {
        Object obj = this.f39078b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3383q0) {
            AbstractC3383q0 abstractC3383q0 = (AbstractC3383q0) obj;
            String strU = abstractC3383q0.u(G0.f39064b);
            if (abstractC3383q0.l()) {
                this.f39078b.set(i10, strU);
            }
            return strU;
        }
        byte[] bArr = (byte[]) obj;
        String strD = G0.d(bArr);
        if (E1.b(bArr)) {
            this.f39078b.set(i10, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3341c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f39078b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 m() {
        return k() ? new C3398v1(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List o() {
        return Collections.unmodifiableList(this.f39078b);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3341c0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        Object objRemove = this.f39078b.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        b();
        return d(this.f39078b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39078b.size();
    }

    private I0(ArrayList arrayList) {
        super(true);
        this.f39078b = arrayList;
    }

    private I0(boolean z10) {
        super(false);
        this.f39078b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3341c0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
