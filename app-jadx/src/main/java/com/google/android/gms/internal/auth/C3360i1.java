package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3360i1 extends AbstractC3341c0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3360i1 f39248d = new C3360i1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f39249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39250c;

    private C3360i1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f39249b = objArr;
        this.f39250c = i10;
    }

    public static C3360i1 c() {
        return f39248d;
    }

    private final String d(int i10) {
        return "Index:" + i10 + ", Size:" + this.f39250c;
    }

    private final void e(int i10) {
        if (i10 < 0 || i10 >= this.f39250c) {
            throw new IndexOutOfBoundsException(d(i10));
        }
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 a(int i10) {
        if (i10 >= this.f39250c) {
            return new C3360i1(Arrays.copyOf(this.f39249b, i10), this.f39250c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f39250c)) {
            throw new IndexOutOfBoundsException(d(i10));
        }
        Object[] objArr = this.f39249b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f39249b, i10, objArr2, i10 + 1, this.f39250c - i10);
            this.f39249b = objArr2;
        }
        this.f39249b[i10] = obj;
        this.f39250c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f39249b[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3341c0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        e(i10);
        Object[] objArr = this.f39249b;
        Object obj = objArr[i10];
        if (i10 < this.f39250c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f39250c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        e(i10);
        Object[] objArr = this.f39249b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39250c;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3341c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f39250c;
        Object[] objArr = this.f39249b;
        if (i10 == objArr.length) {
            this.f39249b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f39249b;
        int i11 = this.f39250c;
        this.f39250c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
