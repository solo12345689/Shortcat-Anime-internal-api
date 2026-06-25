package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class M extends N {

    /* JADX INFO: renamed from: d */
    final transient int f40225d;

    /* JADX INFO: renamed from: e */
    final transient int f40226e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ N f40227f;

    M(N n10, int i10, int i11) {
        Objects.requireNonNull(n10);
        this.f40227f = n10;
        this.f40225d = i10;
        this.f40226e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final int c() {
        return this.f40227f.d() + this.f40225d + this.f40226e;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final int d() {
        return this.f40227f.d() + this.f40225d;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        A.a(i10, this.f40226e, "index");
        return this.f40227f.get(i10 + this.f40225d);
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final Object[] i() {
        return this.f40227f.i();
    }

    @Override // com.google.android.gms.internal.play_billing.N
    /* JADX INFO: renamed from: l */
    public final N subList(int i10, int i11) {
        A.d(i10, i11, this.f40226e);
        int i12 = this.f40225d;
        return this.f40227f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40226e;
    }

    @Override // com.google.android.gms.internal.play_billing.N, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
