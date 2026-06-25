package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class K1 extends AbstractC3645b1 implements RandomAccess, N1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f40216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K1 f40217e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f40218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40219c;

    static {
        int[] iArr = new int[0];
        f40216d = iArr;
        f40217e = new K1(iArr, 0, false);
    }

    private K1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f40218b = iArr;
        this.f40219c = i10;
    }

    public static K1 d() {
        return f40217e;
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f40219c;
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f40219c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final /* bridge */ /* synthetic */ O1 a(int i10) {
        if (i10 >= this.f40219c) {
            return new K1(i10 == 0 ? f40216d : Arrays.copyOf(this.f40218b, i10), this.f40219c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f40219c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f40218b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[i(length)];
            System.arraycopy(this.f40218b, 0, iArr2, 0, i10);
            System.arraycopy(this.f40218b, i10, iArr2, i12, this.f40219c - i10);
            this.f40218b = iArr2;
        }
        this.f40218b[i10] = iIntValue;
        this.f40219c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3645b1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = P1.f40250b;
        collection.getClass();
        if (!(collection instanceof K1)) {
            return super.addAll(collection);
        }
        K1 k12 = (K1) collection;
        int i10 = k12.f40219c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f40219c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f40218b;
        if (i12 > iArr.length) {
            this.f40218b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(k12.f40218b, 0, this.f40218b, this.f40219c, k12.f40219c);
        this.f40219c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i10) {
        n(i10);
        return this.f40218b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i10) {
        b();
        int i11 = this.f40219c;
        int length = this.f40218b.length;
        if (i11 == length) {
            int[] iArr = new int[i(length)];
            System.arraycopy(this.f40218b, 0, iArr, 0, this.f40219c);
            this.f40218b = iArr;
        }
        int[] iArr2 = this.f40218b;
        int i12 = this.f40219c;
        this.f40219c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3645b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K1)) {
            return super.equals(obj);
        }
        K1 k12 = (K1) obj;
        if (this.f40219c != k12.f40219c) {
            return false;
        }
        int[] iArr = k12.f40218b;
        for (int i10 = 0; i10 < this.f40219c; i10++) {
            if (this.f40218b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    final void f(int i10) {
        int length = this.f40218b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f40218b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = i(length);
        }
        this.f40218b = Arrays.copyOf(this.f40218b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Integer.valueOf(this.f40218b[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3645b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f40219c; i11++) {
            i10 = (i10 * 31) + this.f40218b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f40219c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f40218b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3645b1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        n(i10);
        int[] iArr = this.f40218b;
        int i11 = iArr[i10];
        if (i10 < this.f40219c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f40219c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f40218b;
        System.arraycopy(iArr, i11, iArr, i10, this.f40219c - i11);
        this.f40219c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        n(i10);
        int[] iArr = this.f40218b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40219c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
