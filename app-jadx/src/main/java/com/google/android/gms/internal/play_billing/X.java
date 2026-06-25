package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X extends N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y f40417d;

    X(Y y10) {
        Objects.requireNonNull(y10);
        this.f40417d = y10;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        Y y10 = this.f40417d;
        A.a(i10, y10.f40423e, "index");
        int i11 = i10 + i10;
        Object obj = y10.f40422d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = y10.f40422d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40417d.f40423e;
    }
}
