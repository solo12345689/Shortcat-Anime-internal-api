package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3675h1 extends AbstractC3680i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3710o1 f40469c;

    C3675h1(AbstractC3710o1 abstractC3710o1) {
        Objects.requireNonNull(abstractC3710o1);
        this.f40469c = abstractC3710o1;
        this.f40467a = 0;
        this.f40468b = abstractC3710o1.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40467a < this.f40468b;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3690k1
    public final byte zza() {
        int i10 = this.f40467a;
        if (i10 >= this.f40468b) {
            throw new NoSuchElementException();
        }
        this.f40467a = i10 + 1;
        return this.f40469c.c(i10);
    }
}
