package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class D implements Iterator {

    /* JADX INFO: renamed from: a */
    final Iterator f40696a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ E f40697b;

    D(E e10) {
        Objects.requireNonNull(e10);
        this.f40697b = e10;
        this.f40696a = e10.r().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b */
    public final String next() {
        return (String) this.f40696a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40696a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
