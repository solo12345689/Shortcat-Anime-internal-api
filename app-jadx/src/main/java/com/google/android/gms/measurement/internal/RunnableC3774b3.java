package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3774b3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f41102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f41105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41106e;

    RunnableC3774b3(BinderC3950z3 binderC3950z3, String str, String str2, String str3, long j10) {
        this.f41102a = str;
        this.f41103b = str2;
        this.f41104c = str3;
        this.f41105d = j10;
        Objects.requireNonNull(binderC3950z3);
        this.f41106e = binderC3950z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f41102a;
        if (str == null) {
            BinderC3950z3 binderC3950z3 = this.f41106e;
            binderC3950z3.L3().t0(this.f41103b, null);
        } else {
            E4 e42 = new E4(this.f41104c, str, this.f41105d);
            BinderC3950z3 binderC3950z32 = this.f41106e;
            binderC3950z32.L3().t0(this.f41103b, e42);
        }
    }
}
