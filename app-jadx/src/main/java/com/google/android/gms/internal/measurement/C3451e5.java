package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3451e5 extends AbstractC3602v4 implements RandomAccess, InterfaceC3478h5, L5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f39747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C3451e5 f39748e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f39749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39750c;

    static {
        int[] iArr = new int[0];
        f39747d = iArr;
        f39748e = new C3451e5(iArr, 0, false);
    }

    private C3451e5(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f39749b = iArr;
        this.f39750c = i10;
    }

    public static C3451e5 c() {
        return f39748e;
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f39750c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private final String n(int i10) {
        return C3619x4.a(this.f39750c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3496j5
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3478h5 M0(int i10) {
        if (i10 >= this.f39750c) {
            return new C3451e5(i10 == 0 ? f39747d : Arrays.copyOf(this.f39749b, i10), this.f39750c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f39750c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f39749b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[i(length)];
            System.arraycopy(this.f39749b, 0, iArr2, 0, i10);
            System.arraycopy(this.f39749b, i10, iArr2, i12, this.f39750c - i10);
            this.f39749b = iArr2;
        }
        this.f39749b[i10] = iIntValue;
        this.f39750c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = AbstractC3505k5.f39813b;
        collection.getClass();
        if (!(collection instanceof C3451e5)) {
            return super.addAll(collection);
        }
        C3451e5 c3451e5 = (C3451e5) collection;
        int i10 = c3451e5.f39750c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39750c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f39749b;
        if (i12 > iArr.length) {
            this.f39749b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c3451e5.f39749b, 0, this.f39749b, this.f39750c, c3451e5.f39750c);
        this.f39750c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        l(i10);
        return this.f39749b[i10];
    }

    public final void e(int i10) {
        b();
        int i11 = this.f39750c;
        int length = this.f39749b.length;
        if (i11 == length) {
            int[] iArr = new int[i(length)];
            System.arraycopy(this.f39749b, 0, iArr, 0, this.f39750c);
            this.f39749b = iArr;
        }
        int[] iArr2 = this.f39749b;
        int i12 = this.f39750c;
        this.f39750c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3451e5)) {
            return super.equals(obj);
        }
        C3451e5 c3451e5 = (C3451e5) obj;
        if (this.f39750c != c3451e5.f39750c) {
            return false;
        }
        int[] iArr = c3451e5.f39749b;
        for (int i10 = 0; i10 < this.f39750c; i10++) {
            if (this.f39749b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    final void f(int i10) {
        int length = this.f39749b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f39749b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = i(length);
        }
        this.f39749b = Arrays.copyOf(this.f39749b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Integer.valueOf(this.f39749b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f39750c; i11++) {
            i10 = (i10 * 31) + this.f39749b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f39750c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f39749b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        l(i10);
        int[] iArr = this.f39749b;
        int i11 = iArr[i10];
        if (i10 < this.f39750c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f39750c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f39749b;
        System.arraycopy(iArr, i11, iArr, i10, this.f39750c - i11);
        this.f39750c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        l(i10);
        int[] iArr = this.f39749b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39750c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
