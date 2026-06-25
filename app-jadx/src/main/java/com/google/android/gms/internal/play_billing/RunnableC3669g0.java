package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3669g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractC3689k0 f40459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final G0 f40460b;

    RunnableC3669g0(AbstractC3689k0 abstractC3689k0, G0 g02) {
        this.f40459a = abstractC3689k0;
        this.f40460b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f40459a.f40539a != this) {
            return;
        }
        if (AbstractC3719q0.i(this.f40459a, this, AbstractC3689k0.t(this.f40460b))) {
            AbstractC3689k0.w(this.f40459a, false);
        }
    }
}
