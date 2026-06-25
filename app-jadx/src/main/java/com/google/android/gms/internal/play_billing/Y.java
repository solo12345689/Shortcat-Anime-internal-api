package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient Q f40421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f40422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f40423e;

    Y(Q q10, Object[] objArr, int i10, int i11) {
        this.f40421c = q10;
        this.f40422d = objArr;
        this.f40423e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    final int b(Object[] objArr, int i10) {
        return e().b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.K, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f40421c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.S
    final N l() {
        return new X(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40423e;
    }
}
