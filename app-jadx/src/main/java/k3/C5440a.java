package k3;

import t2.C6609I;

/* JADX INFO: renamed from: k3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5440a extends AbstractC5441b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f52012c;

    private C5440a(long j10, byte[] bArr, long j11) {
        this.f52010a = j11;
        this.f52011b = j10;
        this.f52012c = bArr;
    }

    static C5440a d(C6609I c6609i, int i10, long j10) {
        long jO = c6609i.O();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        c6609i.q(bArr, 0, i11);
        return new C5440a(jO, bArr, j10);
    }

    @Override // k3.AbstractC5441b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f52010a + ", identifier= " + this.f52011b + " }";
    }
}
