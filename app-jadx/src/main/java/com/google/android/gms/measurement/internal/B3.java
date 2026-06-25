package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class B3 extends A3 {

    /* JADX INFO: renamed from: b */
    private boolean f40638b;

    B3(X2 x22) {
        super(x22);
        this.f40611a.k();
    }

    protected abstract boolean i();

    final boolean k() {
        return this.f40638b;
    }

    protected final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f40638b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f40611a.l();
        this.f40638b = true;
    }

    public final void n() {
        if (this.f40638b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f40611a.l();
        this.f40638b = true;
    }

    protected void j() {
    }
}
