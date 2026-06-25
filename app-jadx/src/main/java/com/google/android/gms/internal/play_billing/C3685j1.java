package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3685j1 extends C3700m1 {

    /* JADX INFO: renamed from: d */
    private final int f40490d;

    C3685j1(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC3710o1.l(0, i11, bArr.length);
        this.f40490d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.C3700m1, com.google.android.gms.internal.play_billing.AbstractC3710o1
    public final byte b(int i10) {
        int i11 = this.f40490d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f40503c[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.play_billing.C3700m1, com.google.android.gms.internal.play_billing.AbstractC3710o1
    final byte c(int i10) {
        return this.f40503c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.C3700m1, com.google.android.gms.internal.play_billing.AbstractC3710o1
    public final int d() {
        return this.f40490d;
    }

    @Override // com.google.android.gms.internal.play_billing.C3700m1
    protected final int t() {
        return 0;
    }
}
