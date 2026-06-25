package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3374n0 extends AbstractC3371m0 {

    /* JADX INFO: renamed from: e */
    protected final byte[] f39278e;

    C3374n0(byte[] bArr) {
        bArr.getClass();
        this.f39278e = bArr;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3383q0
    public byte b(int i10) {
        return this.f39278e[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3383q0
    byte c(int i10) {
        return this.f39278e[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3383q0
    public int d() {
        return this.f39278e.length;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3383q0
    protected final int e(int i10, int i11, int i12) {
        return G0.b(i10, this.f39278e, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3383q0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3383q0) || d() != ((AbstractC3383q0) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof C3374n0)) {
            return obj.equals(this);
        }
        C3374n0 c3374n0 = (C3374n0) obj;
        int iS = s();
        int iS2 = c3374n0.s();
        if (iS != 0 && iS2 != 0 && iS != iS2) {
            return false;
        }
        int iD = d();
        if (iD > c3374n0.d()) {
            throw new IllegalArgumentException("Length too large: " + iD + d());
        }
        if (iD > c3374n0.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iD + ", " + c3374n0.d());
        }
        byte[] bArr = this.f39278e;
        byte[] bArr2 = c3374n0.f39278e;
        c3374n0.v();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iD) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3383q0
    public final AbstractC3383q0 f(int i10, int i11) {
        int iP = AbstractC3383q0.p(0, i11, d());
        return iP == 0 ? AbstractC3383q0.f39290b : new C3362j0(this.f39278e, 0, iP);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3383q0
    protected final String i(Charset charset) {
        return new String(this.f39278e, 0, d(), charset);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC3383q0
    public final boolean l() {
        return E1.c(this.f39278e, 0, d());
    }

    protected int v() {
        return 0;
    }
}
