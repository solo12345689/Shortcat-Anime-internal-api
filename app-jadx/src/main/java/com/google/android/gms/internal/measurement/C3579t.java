package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3579t implements Iterator {

    /* JADX INFO: renamed from: a */
    private int f39992a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3588u f39993b;

    C3579t(C3588u c3588u) {
        Objects.requireNonNull(c3588u);
        this.f39993b = c3588u;
        this.f39992a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39992a < this.f39993b.b().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C3588u c3588u = this.f39993b;
        String strB = c3588u.b();
        int i10 = this.f39992a;
        if (i10 >= strB.length()) {
            throw new NoSuchElementException();
        }
        this.f39992a = i10 + 1;
        return new C3588u(String.valueOf(c3588u.b().charAt(i10)));
    }
}
