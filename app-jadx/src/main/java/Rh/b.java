package Rh;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class b extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f15527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f15530d;

    public b(InputStream inputStream) {
        this(inputStream, 16384, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        k.a(this.f15530d);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f15529c >= this.f15528b) {
            byte[] bArr = this.f15527a;
            int i10 = read(bArr, 0, bArr.length);
            this.f15528b = i10;
            this.f15529c = 0;
            if (i10 == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.f15527a;
        int i11 = this.f15529c;
        this.f15529c = i11 + 1;
        return bArr2[i11] & 255;
    }

    public b(InputStream inputStream, int i10, byte[] bArr) throws IOException {
        k kVar = new k();
        this.f15530d = kVar;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i10);
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.f15527a = new byte[i10];
        this.f15528b = 0;
        this.f15529c = 0;
        try {
            k.c(kVar, inputStream);
            if (bArr != null) {
                e.s(kVar, bArr);
            }
        } catch (c e10) {
            throw new IOException("Brotli decoder initialization failed", e10);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Bad offset: " + i10);
        }
        if (i11 >= 0) {
            int i12 = i10 + i11;
            if (i12 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i12 + " > " + bArr.length);
            }
            if (i11 == 0) {
                return 0;
            }
            int iMax = Math.max(this.f15528b - this.f15529c, 0);
            if (iMax != 0) {
                iMax = Math.min(iMax, i11);
                System.arraycopy(this.f15527a, this.f15529c, bArr, i10, iMax);
                this.f15529c += iMax;
                i10 += iMax;
                i11 -= iMax;
                if (i11 == 0) {
                    return iMax;
                }
            }
            try {
                k kVar = this.f15530d;
                kVar.f15578Z = bArr;
                kVar.f15573U = i10;
                kVar.f15574V = i11;
                kVar.f15575W = 0;
                e.i(kVar);
                int i13 = this.f15530d.f15575W;
                if (i13 == 0) {
                    return -1;
                }
                return i13 + iMax;
            } catch (c e10) {
                throw new IOException("Brotli stream decoding failed", e10);
            }
        }
        throw new IllegalArgumentException("Bad length: " + i11);
    }
}
