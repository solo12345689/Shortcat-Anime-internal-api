package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class F4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f40756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f40757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ E4 f40758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f40759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f40760e;

    F4(M4 m42, Bundle bundle, E4 e42, E4 e43, long j10) {
        this.f40756a = bundle;
        this.f40757b = e42;
        this.f40758c = e43;
        this.f40759d = j10;
        Objects.requireNonNull(m42);
        this.f40760e = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40760e.A(this.f40756a, this.f40757b, this.f40758c, this.f40759d);
    }
}
