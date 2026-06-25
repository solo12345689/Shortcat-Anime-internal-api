package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3867n3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f41461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41463c;

    RunnableC3867n3(BinderC3950z3 binderC3950z3, G g10, String str) {
        this.f41461a = g10;
        this.f41462b = str;
        Objects.requireNonNull(binderC3950z3);
        this.f41463c = binderC3950z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3950z3 binderC3950z3 = this.f41463c;
        binderC3950z3.L3().E();
        binderC3950z3.L3().i(this.f41461a, this.f41462b);
    }
}
