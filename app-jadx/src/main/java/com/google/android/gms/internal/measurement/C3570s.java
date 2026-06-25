package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3570s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3588u f39974b;

    C3570s(C3588u c3588u) {
        Objects.requireNonNull(c3588u);
        this.f39974b = c3588u;
        this.f39973a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39973a < this.f39974b.b().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strB = this.f39974b.b();
        int i10 = this.f39973a;
        if (i10 >= strB.length()) {
            throw new NoSuchElementException();
        }
        this.f39973a = i10 + 1;
        return new C3588u(String.valueOf(i10));
    }
}
