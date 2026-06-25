package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class B4 extends C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ I4 f39332c;

    B4(I4 i42) {
        Objects.requireNonNull(i42);
        this.f39332c = i42;
        this.f39330a = 0;
        this.f39331b = i42.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39330a < this.f39331b;
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public final byte zza() {
        int i10 = this.f39330a;
        if (i10 >= this.f39331b) {
            throw new NoSuchElementException();
        }
        this.f39330a = i10 + 1;
        return this.f39332c.c(i10);
    }
}
