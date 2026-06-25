package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class R3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f40934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f40935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f40936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f40937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f40938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f40939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f40940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f40941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ C3937x4 f40942i;

    R3(C3937x4 c3937x4, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f40934a = str;
        this.f40935b = str2;
        this.f40936c = j10;
        this.f40937d = bundle;
        this.f40938e = z10;
        this.f40939f = z11;
        this.f40940g = z12;
        this.f40941h = str3;
        Objects.requireNonNull(c3937x4);
        this.f40942i = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40942i.v(this.f40934a, this.f40935b, this.f40936c, this.f40937d, this.f40938e, this.f40939f, this.f40940g, this.f40941h);
    }
}
