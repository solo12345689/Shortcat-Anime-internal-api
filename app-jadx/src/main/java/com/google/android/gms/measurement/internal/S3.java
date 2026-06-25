package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class S3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f40954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f40955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f40956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f40957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3937x4 f40958e;

    S3(C3937x4 c3937x4, String str, String str2, Object obj, long j10) {
        this.f40954a = str;
        this.f40955b = str2;
        this.f40956c = obj;
        this.f40957d = j10;
        Objects.requireNonNull(c3937x4);
        this.f40958e = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40958e.B(this.f40954a, this.f40955b, this.f40956c, this.f40957d);
    }
}
