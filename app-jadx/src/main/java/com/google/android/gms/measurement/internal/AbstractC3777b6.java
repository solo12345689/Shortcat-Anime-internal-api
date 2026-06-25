package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b6 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3777b6 extends W5 {

    /* JADX INFO: renamed from: c */
    private boolean f41110c;

    AbstractC3777b6(q6 q6Var) {
        super(q6Var);
        this.f41010b.e0();
    }

    final boolean i() {
        return this.f41110c;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f41110c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f41010b.f0();
        this.f41110c = true;
    }

    protected abstract boolean l();
}
