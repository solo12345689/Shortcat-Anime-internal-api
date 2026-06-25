package B3;

import java.util.Arrays;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f1459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1460e;

    public w(int i10, int i11) {
        this.f1456a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f1459d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f1457b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f1459d;
            int length = bArr2.length;
            int i13 = this.f1460e;
            if (length < i13 + i12) {
                this.f1459d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f1459d, this.f1460e, i12);
            this.f1460e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f1457b) {
            return false;
        }
        this.f1460e -= i10;
        this.f1457b = false;
        this.f1458c = true;
        return true;
    }

    public boolean c() {
        return this.f1458c;
    }

    public void d() {
        this.f1457b = false;
        this.f1458c = false;
    }

    public void e(int i10) {
        AbstractC6614a.g(!this.f1457b);
        boolean z10 = i10 == this.f1456a;
        this.f1457b = z10;
        if (z10) {
            this.f1460e = 3;
            this.f1458c = false;
        }
    }
}
