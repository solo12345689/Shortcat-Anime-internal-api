package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X extends AbstractC3437d0 {

    /* JADX INFO: renamed from: a */
    private String f39612a;

    /* JADX INFO: renamed from: b */
    private byte f39613b;

    /* JADX INFO: renamed from: c */
    private int f39614c;

    /* JADX INFO: renamed from: d */
    private int f39615d;

    X() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3437d0
    public final AbstractC3437d0 a(boolean z10) {
        this.f39613b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3437d0
    public final AbstractC3455f0 b() {
        if (this.f39613b == 1 && this.f39612a != null && this.f39614c != 0 && this.f39615d != 0) {
            return new Y(this.f39612a, false, this.f39614c, null, null, this.f39615d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f39612a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f39613b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f39614c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f39615d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3437d0
    final AbstractC3437d0 c(int i10) {
        this.f39614c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3437d0
    public final AbstractC3437d0 d(int i10) {
        this.f39615d = 1;
        return this;
    }

    public final AbstractC3437d0 e(String str) {
        this.f39612a = "";
        return this;
    }
}
