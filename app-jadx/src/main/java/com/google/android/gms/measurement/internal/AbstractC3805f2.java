package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3805f2 extends E1 {

    /* JADX INFO: renamed from: b */
    private boolean f41286b;

    AbstractC3805f2(X2 x22) {
        super(x22);
        this.f40611a.k();
    }

    final boolean i() {
        return this.f41286b;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f41286b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.f40611a.l();
        this.f41286b = true;
    }

    public final void l() {
        if (this.f41286b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.f40611a.l();
        this.f41286b = true;
    }

    protected abstract boolean m();

    protected void n() {
    }
}
