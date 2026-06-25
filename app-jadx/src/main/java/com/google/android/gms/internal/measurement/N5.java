package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class N5 extends AbstractC3602v4 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f39514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final N5 f39515e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f39516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39517c;

    static {
        Object[] objArr = new Object[0];
        f39514d = objArr;
        f39515e = new N5(objArr, 0, false);
    }

    private N5(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f39516b = objArr;
        this.f39517c = i10;
    }

    public static N5 c() {
        return f39515e;
    }

    private static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f39517c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private final String i(int i10) {
        return C3619x4.a(this.f39517c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3496j5
    public final /* bridge */ /* synthetic */ InterfaceC3496j5 M0(int i10) {
        if (i10 >= this.f39517c) {
            return new N5(i10 == 0 ? f39514d : Arrays.copyOf(this.f39516b, i10), this.f39517c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f39517c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f39516b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.f39516b, 0, objArr2, 0, i10);
            System.arraycopy(this.f39516b, i10, objArr2, i12, this.f39517c - i10);
            this.f39516b = objArr2;
        }
        this.f39516b[i10] = obj;
        this.f39517c++;
        ((AbstractList) this).modCount++;
    }

    final void d(int i10) {
        int length = this.f39516b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f39516b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = e(length);
        }
        this.f39516b = Arrays.copyOf(this.f39516b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        f(i10);
        return this.f39516b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        f(i10);
        Object[] objArr = this.f39516b;
        Object obj = objArr[i10];
        if (i10 < this.f39517c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f39517c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        f(i10);
        Object[] objArr = this.f39516b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39517c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f39517c;
        int length = this.f39516b.length;
        if (i10 == length) {
            this.f39516b = Arrays.copyOf(this.f39516b, e(length));
        }
        Object[] objArr = this.f39516b;
        int i11 = this.f39517c;
        this.f39517c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
