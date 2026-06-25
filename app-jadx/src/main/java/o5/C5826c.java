package o5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5826c extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f54529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54530b;

    private C5826c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f54529a = j10;
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f54530b += i10;
            return i10;
        }
        if (this.f54529a - ((long) this.f54530b) <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f54529a + ", but read: " + this.f54530b);
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new C5826c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f54529a - ((long) this.f54530b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
