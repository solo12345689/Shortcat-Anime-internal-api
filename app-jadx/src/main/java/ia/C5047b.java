package ia;

import java.io.OutputStream;

/* JADX INFO: renamed from: ia.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5047b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f48741a = 0;

    C5047b() {
    }

    long a() {
        return this.f48741a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f48741a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f48741a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f48741a += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
