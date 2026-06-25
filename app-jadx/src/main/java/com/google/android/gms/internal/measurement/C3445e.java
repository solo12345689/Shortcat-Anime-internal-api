package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3445e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3454f f39741b;

    C3445e(C3454f c3454f) {
        Objects.requireNonNull(c3454f);
        this.f39741b = c3454f;
        this.f39740a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39740a < this.f39741b.t();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C3454f c3454f = this.f39741b;
        if (this.f39740a < c3454f.t()) {
            int i10 = this.f39740a;
            this.f39740a = i10 + 1;
            return c3454f.v(i10);
        }
        int i11 = this.f39740a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
