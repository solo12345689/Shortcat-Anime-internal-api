package x4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f63904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63905b = 1073741824;

    public k(InputStream inputStream) {
        this.f63904a = inputStream;
    }

    private final int a(int i10) {
        if (i10 == -1) {
            this.f63905b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f63905b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63904a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.f63904a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f63904a.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return a(this.f63904a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return a(this.f63904a.read(bArr, i10, i11));
    }
}
