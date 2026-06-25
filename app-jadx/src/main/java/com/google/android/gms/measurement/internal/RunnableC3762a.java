package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3762a implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f41085a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f41086b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0 f41087c;

    RunnableC3762a(C0 c02, String str, long j10) {
        this.f41085a = str;
        this.f41086b = j10;
        Objects.requireNonNull(c02);
        this.f41087c = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41087c.l(this.f41085a, this.f41086b);
    }
}
