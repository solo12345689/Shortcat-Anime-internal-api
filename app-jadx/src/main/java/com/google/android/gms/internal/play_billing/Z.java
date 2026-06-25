package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Z extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient Q f40432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient N f40433d;

    Z(Q q10, N n10) {
        this.f40432c = q10;
        this.f40433d = n10;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final int b(Object[] objArr, int i10) {
        return this.f40433d.b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.K, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f40432c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.S, com.google.android.gms.internal.play_billing.K
    public final N e() {
        return this.f40433d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f40433d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40432c.size();
    }
}
