package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3353g0 extends AbstractC3359i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39177a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3383q0 f39179c;

    C3353g0(AbstractC3383q0 abstractC3383q0) {
        this.f39179c = abstractC3383q0;
        this.f39178b = abstractC3383q0.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39177a < this.f39178b;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3368l0
    public final byte zza() {
        int i10 = this.f39177a;
        if (i10 >= this.f39178b) {
            throw new NoSuchElementException();
        }
        this.f39177a = i10 + 1;
        return this.f39179c.c(i10);
    }
}
