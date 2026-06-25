package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class H4 extends G4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f39362c;

    H4(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f39362c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public byte b(int i10) {
        return this.f39362c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.I4
    byte c(int i10) {
        return this.f39362c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public int d() {
        return this.f39362c.length;
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public final I4 e(int i10, int i11) {
        int iS = I4.s(0, i11, d());
        return iS == 0 ? I4.f39386b : new D4(this.f39362c, 0, iS);
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I4) || d() != ((I4) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof H4)) {
            return obj.equals(this);
        }
        H4 h42 = (H4) obj;
        int iP = p();
        int iP2 = h42.p();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        int iD = d();
        if (iD > h42.d()) {
            int iD2 = d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length());
            sb2.append("Length too large: ");
            sb2.append(iD);
            sb2.append(iD2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iD > h42.d()) {
            int iD3 = h42.d();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iD);
            sb3.append(", ");
            sb3.append(iD3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f39362c;
        byte[] bArr2 = h42.f39362c;
        h42.t();
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

    @Override // com.google.android.gms.internal.measurement.I4
    final void f(AbstractC3635z4 abstractC3635z4) throws M4 {
        ((L4) abstractC3635z4).F(this.f39362c, 0, d());
    }

    @Override // com.google.android.gms.internal.measurement.I4
    protected final int i(int i10, int i11, int i12) {
        return AbstractC3505k5.c(i10, this.f39362c, 0, i12);
    }

    protected int t() {
        return 0;
    }
}
