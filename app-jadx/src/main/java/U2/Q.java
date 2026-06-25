package U2;

import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f18945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18948d;

    public Q(byte[] bArr) {
        this.f18945a = bArr;
        this.f18946b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f18947c;
        AbstractC6614a.g(i11 >= 0 && (i11 < (i10 = this.f18946b) || (i11 == i10 && this.f18948d == 0)));
    }

    public int b() {
        return (this.f18947c * 8) + this.f18948d;
    }

    public boolean c() {
        boolean z10 = (((this.f18945a[this.f18947c] & 255) >> this.f18948d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f18947c;
        int iMin = Math.min(i10, 8 - this.f18948d);
        int i12 = i11 + 1;
        int i13 = ((this.f18945a[i11] & 255) >> this.f18948d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f18945a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f18947c + i11;
        this.f18947c = i12;
        int i13 = this.f18948d + (i10 - (i11 * 8));
        this.f18948d = i13;
        if (i13 > 7) {
            this.f18947c = i12 + 1;
            this.f18948d = i13 - 8;
        }
        a();
    }
}
