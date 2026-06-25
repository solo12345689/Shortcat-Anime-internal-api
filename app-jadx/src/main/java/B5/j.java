package B5;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h f1575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1577c;

    public j(h hVar) {
        y5.k.b(Boolean.valueOf(!hVar.isClosed()));
        this.f1575a = (h) y5.k.g(hVar);
        this.f1576b = 0;
        this.f1577c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f1575a.size() - this.f1576b;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f1577c = this.f1576b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f1575a;
        int i10 = this.f1576b;
        this.f1576b = i10 + 1;
        return hVar.G(i10) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f1576b = this.f1577c;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        y5.k.b(Boolean.valueOf(j10 >= 0));
        int iMin = Math.min((int) j10, available());
        this.f1576b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i11 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i11);
            this.f1575a.u(this.f1576b, bArr, i10, iMin);
            this.f1576b += iMin;
            return iMin;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
