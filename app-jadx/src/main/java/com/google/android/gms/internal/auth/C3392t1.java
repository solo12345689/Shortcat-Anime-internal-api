package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3392t1 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f39304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f39305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3398v1 f39306c;

    C3392t1(C3398v1 c3398v1, int i10) {
        this.f39306c = c3398v1;
        this.f39305b = i10;
        this.f39304a = c3398v1.f39314a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f39304a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f39304a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f39304a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39304a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f39304a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39304a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
