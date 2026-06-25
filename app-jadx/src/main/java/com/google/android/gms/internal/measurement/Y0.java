package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y0 extends A0 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f39684a;

    Y0(Z0 z02, Runnable runnable) {
        this.f39684a = runnable;
        Objects.requireNonNull(z02);
    }

    @Override // com.google.android.gms.internal.measurement.B0
    public final void m() {
        this.f39684a.run();
    }
}
