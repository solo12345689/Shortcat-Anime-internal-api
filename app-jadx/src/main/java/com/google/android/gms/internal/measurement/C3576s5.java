package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3576s5 extends AbstractC3602v4 implements RandomAccess, InterfaceC3487i5, L5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f39986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C3576s5 f39987e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f39988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39989c;

    static {
        long[] jArr = new long[0];
        f39986d = jArr;
        f39987e = new C3576s5(jArr, 0, false);
    }

    private C3576s5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f39988b = jArr;
        this.f39989c = i10;
    }

    public static C3576s5 c() {
        return f39987e;
    }

    private static int f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f39989c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private final String l(int i10) {
        return C3619x4.a(this.f39989c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3496j5
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3487i5 M0(int i10) {
        if (i10 >= this.f39989c) {
            return new C3576s5(i10 == 0 ? f39986d : Arrays.copyOf(this.f39988b, i10), this.f39989c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f39989c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f39988b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[f(length)];
            System.arraycopy(this.f39988b, 0, jArr2, 0, i10);
            System.arraycopy(this.f39988b, i10, jArr2, i12, this.f39989c - i10);
            this.f39988b = jArr2;
        }
        this.f39988b[i10] = jLongValue;
        this.f39989c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = AbstractC3505k5.f39813b;
        collection.getClass();
        if (!(collection instanceof C3576s5)) {
            return super.addAll(collection);
        }
        C3576s5 c3576s5 = (C3576s5) collection;
        int i10 = c3576s5.f39989c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39989c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f39988b;
        if (i12 > jArr.length) {
            this.f39988b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c3576s5.f39988b, 0, this.f39988b, this.f39989c, c3576s5.f39989c);
        this.f39989c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j10) {
        b();
        int i10 = this.f39989c;
        int length = this.f39988b.length;
        if (i10 == length) {
            long[] jArr = new long[f(length)];
            System.arraycopy(this.f39988b, 0, jArr, 0, this.f39989c);
            this.f39988b = jArr;
        }
        long[] jArr2 = this.f39988b;
        int i11 = this.f39989c;
        this.f39989c = i11 + 1;
        jArr2[i11] = j10;
    }

    final void e(int i10) {
        int length = this.f39988b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f39988b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = f(length);
        }
        this.f39988b = Arrays.copyOf(this.f39988b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3576s5)) {
            return super.equals(obj);
        }
        C3576s5 c3576s5 = (C3576s5) obj;
        if (this.f39989c != c3576s5.f39989c) {
            return false;
        }
        long[] jArr = c3576s5.f39988b;
        for (int i10 = 0; i10 < this.f39989c; i10++) {
            if (this.f39988b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        i(i10);
        return Long.valueOf(this.f39988b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f39989c; i11++) {
            long j10 = this.f39988b[i11];
            byte[] bArr = AbstractC3505k5.f39813b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f39989c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f39988b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3487i5
    public final long p0(int i10) {
        i(i10);
        return this.f39988b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3602v4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        i(i10);
        long[] jArr = this.f39988b;
        long j10 = jArr[i10];
        if (i10 < this.f39989c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f39989c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f39988b;
        System.arraycopy(jArr, i11, jArr, i10, this.f39989c - i11);
        this.f39989c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        i(i10);
        long[] jArr = this.f39988b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39989c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
