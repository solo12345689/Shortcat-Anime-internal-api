package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3706n2 extends AbstractC3645b1 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f40508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C3706n2 f40509e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f40510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40511c;

    static {
        Object[] objArr = new Object[0];
        f40508d = objArr;
        f40509e = new C3706n2(objArr, 0, false);
    }

    private C3706n2(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f40510b = objArr;
        this.f40511c = i10;
    }

    public static C3706n2 c() {
        return f40509e;
    }

    private static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f40511c;
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f40511c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final /* bridge */ /* synthetic */ O1 a(int i10) {
        if (i10 >= this.f40511c) {
            return new C3706n2(i10 == 0 ? f40508d : Arrays.copyOf(this.f40510b, i10), this.f40511c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f40511c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f40510b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.f40510b, 0, objArr2, 0, i10);
            System.arraycopy(this.f40510b, i10, objArr2, i12, this.f40511c - i10);
            this.f40510b = objArr2;
        }
        this.f40510b[i10] = obj;
        this.f40511c++;
        ((AbstractList) this).modCount++;
    }

    final void d(int i10) {
        int length = this.f40510b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f40510b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = e(length);
        }
        this.f40510b = Arrays.copyOf(this.f40510b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return this.f40510b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3645b1, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        i(i10);
        Object[] objArr = this.f40510b;
        Object obj = objArr[i10];
        if (i10 < this.f40511c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f40511c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        i(i10);
        Object[] objArr = this.f40510b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40511c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f40511c;
        int length = this.f40510b.length;
        if (i10 == length) {
            this.f40510b = Arrays.copyOf(this.f40510b, e(length));
        }
        Object[] objArr = this.f40510b;
        int i11 = this.f40511c;
        this.f40511c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
