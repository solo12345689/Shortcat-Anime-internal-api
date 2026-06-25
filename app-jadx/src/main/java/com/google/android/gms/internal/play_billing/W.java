package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class W extends N {

    /* JADX INFO: renamed from: f */
    static final N f40414f = new W(new Object[0], 0);

    /* JADX INFO: renamed from: d */
    final transient Object[] f40415d;

    /* JADX INFO: renamed from: e */
    private final transient int f40416e;

    W(Object[] objArr, int i10) {
        this.f40415d = objArr;
        this.f40416e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.N, com.google.android.gms.internal.play_billing.K
    final int b(Object[] objArr, int i10) {
        Object[] objArr2 = this.f40415d;
        int i11 = this.f40416e;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final int c() {
        return this.f40416e;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        A.a(i10, this.f40416e, "index");
        Object obj = this.f40415d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final Object[] i() {
        return this.f40415d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40416e;
    }
}
