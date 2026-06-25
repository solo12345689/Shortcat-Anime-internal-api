package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class L4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ M4 f40844a;

    L4(M4 m42) {
        Objects.requireNonNull(m42);
        this.f40844a = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40844a.E(null);
    }
}
