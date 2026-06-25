package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3508l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f39815a;

    C3508l(Iterator it) {
        this.f39815a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39815a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C3588u((String) this.f39815a.next());
    }
}
