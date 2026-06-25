package b5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class V extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f33126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V4.b f33131f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public V(InputStream inputStream, V4.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f33129d;
        if (i10 != -1) {
            int i11 = this.f33130e - i10;
            int i12 = this.f33128c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f33127b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f33131f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f33126a = bArr2;
                    this.f33131f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f33130e - this.f33129d;
                this.f33130e = i13;
                this.f33129d = 0;
                this.f33127b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f33130e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f33127b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f33129d = -1;
            this.f33130e = 0;
            this.f33127b = i16;
        }
        return i16;
    }

    private static IOException h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f33126a == null || inputStream == null) {
            throw h();
        }
        return (this.f33127b - this.f33130e) + inputStream.available();
    }

    public synchronized void b() {
        this.f33128c = this.f33126a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f33126a != null) {
            this.f33131f.put(this.f33126a);
            this.f33126a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void g() {
        if (this.f33126a != null) {
            this.f33131f.put(this.f33126a);
            this.f33126a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f33128c = Math.max(this.f33128c, i10);
        this.f33129d = this.f33130e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f33126a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw h();
        }
        if (this.f33130e >= this.f33127b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f33126a && (bArr = this.f33126a) == null) {
            throw h();
        }
        int i10 = this.f33127b;
        int i11 = this.f33130e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f33130e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f33126a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f33129d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f33130e + " markLimit: " + this.f33128c);
        }
        this.f33130e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f33126a;
        if (bArr == null) {
            throw h();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw h();
        }
        int i10 = this.f33127b;
        int i11 = this.f33130e;
        if (i10 - i11 >= j10) {
            this.f33130e = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f33130e = i10;
        if (this.f33129d == -1 || j10 > this.f33128c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f33129d = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f33127b;
        int i13 = this.f33130e;
        if (i12 - i13 >= j10 - j11) {
            this.f33130e = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f33130e = i12;
        return j12;
    }

    V(InputStream inputStream, V4.b bVar, int i10) {
        super(inputStream);
        this.f33129d = -1;
        this.f33131f = bVar;
        this.f33126a = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f33126a;
        if (bArr2 == null) {
            throw h();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f33130e;
            int i15 = this.f33127b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f33130e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f33129d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f33126a && (bArr2 = this.f33126a) == null) {
                        throw h();
                    }
                    int i17 = this.f33127b;
                    int i18 = this.f33130e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f33130e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw h();
        }
    }
}
