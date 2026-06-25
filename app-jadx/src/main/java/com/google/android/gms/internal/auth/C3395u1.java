package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3395u1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f39308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3398v1 f39309b;

    C3395u1(C3398v1 c3398v1) {
        this.f39309b = c3398v1;
        this.f39308a = c3398v1.f39314a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39308a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f39308a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
