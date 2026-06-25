package B5;

import java.io.IOException;
import java.io.InputStream;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f1569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f1570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5.h f1571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1572d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1573e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1574f = false;

    public g(InputStream inputStream, byte[] bArr, C5.h hVar) {
        this.f1569a = (InputStream) y5.k.g(inputStream);
        this.f1570b = (byte[]) y5.k.g(bArr);
        this.f1571c = (C5.h) y5.k.g(hVar);
    }

    private boolean a() throws IOException {
        if (this.f1573e < this.f1572d) {
            return true;
        }
        int i10 = this.f1569a.read(this.f1570b);
        if (i10 <= 0) {
            return false;
        }
        this.f1572d = i10;
        this.f1573e = 0;
        return true;
    }

    private void b() throws IOException {
        if (this.f1574f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        y5.k.i(this.f1573e <= this.f1572d);
        b();
        return (this.f1572d - this.f1573e) + this.f1569a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f1574f) {
            return;
        }
        this.f1574f = true;
        this.f1571c.a(this.f1570b);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f1574f) {
            AbstractC7283a.m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        y5.k.i(this.f1573e <= this.f1572d);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f1570b;
        int i10 = this.f1573e;
        this.f1573e = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        y5.k.i(this.f1573e <= this.f1572d);
        b();
        int i10 = this.f1572d;
        int i11 = this.f1573e;
        long j11 = i10 - i11;
        if (j11 >= j10) {
            this.f1573e = (int) (((long) i11) + j10);
            return j10;
        }
        this.f1573e = i10;
        return j11 + this.f1569a.skip(j10 - j11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        y5.k.i(this.f1573e <= this.f1572d);
        b();
        if (!a()) {
            return -1;
        }
        int iMin = Math.min(this.f1572d - this.f1573e, i11);
        System.arraycopy(this.f1570b, this.f1573e, bArr, i10, iMin);
        this.f1573e += iMin;
        return iMin;
    }
}
