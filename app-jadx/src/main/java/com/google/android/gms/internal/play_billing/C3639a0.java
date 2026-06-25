package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3639a0 extends N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f40437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f40438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f40439f;

    C3639a0(Object[] objArr, int i10, int i11) {
        this.f40437d = objArr;
        this.f40438e = i10;
        this.f40439f = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        A.a(i10, this.f40439f, "index");
        Object obj = this.f40437d[i10 + i10 + this.f40438e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40439f;
    }
}
