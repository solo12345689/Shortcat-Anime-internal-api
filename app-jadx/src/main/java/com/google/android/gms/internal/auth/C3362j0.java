package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3362j0 extends C3374n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f39252f;

    C3362j0(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC3383q0.p(0, i11, bArr.length);
        this.f39252f = i11;
    }

    @Override // com.google.android.gms.internal.auth.C3374n0, com.google.android.gms.internal.auth.AbstractC3383q0
    public final byte b(int i10) {
        int i11 = this.f39252f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f39278e[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.auth.C3374n0, com.google.android.gms.internal.auth.AbstractC3383q0
    final byte c(int i10) {
        return this.f39278e[i10];
    }

    @Override // com.google.android.gms.internal.auth.C3374n0, com.google.android.gms.internal.auth.AbstractC3383q0
    public final int d() {
        return this.f39252f;
    }

    @Override // com.google.android.gms.internal.auth.C3374n0
    protected final int v() {
        return 0;
    }
}
