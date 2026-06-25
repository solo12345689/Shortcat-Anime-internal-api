package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3398v1 extends AbstractList implements RandomAccess, J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J0 f39314a;

    public C3398v1(J0 j02) {
        this.f39314a = j02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((I0) this.f39314a).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C3395u1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C3392t1(this, i10);
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List o() {
        return this.f39314a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39314a.size();
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 m() {
        return this;
    }
}
