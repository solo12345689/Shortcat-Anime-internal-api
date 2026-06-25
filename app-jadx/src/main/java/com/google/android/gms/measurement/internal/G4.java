package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class G4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f40779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f40780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f40781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f40782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f40783e;

    G4(M4 m42, E4 e42, E4 e43, long j10, boolean z10) {
        this.f40779a = e42;
        this.f40780b = e43;
        this.f40781c = j10;
        this.f40782d = z10;
        Objects.requireNonNull(m42);
        this.f40783e = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40783e.B(this.f40779a, this.f40780b, this.f40781c, this.f40782d, null);
    }
}
