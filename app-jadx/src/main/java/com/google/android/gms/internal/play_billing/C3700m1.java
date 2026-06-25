package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3700m1 extends AbstractC3695l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f40503c;

    C3700m1(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f40503c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3710o1
    public byte b(int i10) {
        return this.f40503c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3710o1
    byte c(int i10) {
        return this.f40503c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3710o1
    public int d() {
        return this.f40503c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3710o1
    protected final int e(int i10, int i11, int i12) {
        return P1.b(i10, this.f40503c, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3710o1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3710o1) || d() != ((AbstractC3710o1) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof C3700m1)) {
            return obj.equals(this);
        }
        C3700m1 c3700m1 = (C3700m1) obj;
        int iP = p();
        int iP2 = c3700m1.p();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        int iD = d();
        if (iD > c3700m1.d()) {
            throw new IllegalArgumentException("Length too large: " + iD + d());
        }
        if (iD > c3700m1.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iD + ", " + c3700m1.d());
        }
        byte[] bArr = this.f40503c;
        byte[] bArr2 = c3700m1.f40503c;
        c3700m1.t();
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC3710o1
    public final AbstractC3710o1 f(int i10, int i11) {
        int iL = AbstractC3710o1.l(0, i11, d());
        return iL == 0 ? AbstractC3710o1.f40523b : new C3685j1(this.f40503c, 0, iL);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3710o1
    final void i(AbstractC3665f1 abstractC3665f1) throws C3734t1 {
        ((C3729s1) abstractC3665f1).A(this.f40503c, 0, d());
    }

    protected int t() {
        return 0;
    }
}
