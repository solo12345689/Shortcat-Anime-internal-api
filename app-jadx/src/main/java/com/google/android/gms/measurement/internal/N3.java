package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class N3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3937x4 f40870a;

    N3(C3937x4 c3937x4) {
        Objects.requireNonNull(c3937x4);
        this.f40870a = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40870a.f41764r.a();
    }
}
