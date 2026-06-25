package zg;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
class K0 extends P0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f66347e = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f66348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66349d;

    K0(InputStream inputStream, int i10, int i11) {
        super(inputStream, i11);
        if (i10 <= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            b(true);
        }
        this.f66348c = i10;
        this.f66349d = i10;
    }

    int g() {
        return this.f66349d;
    }

    void h(byte[] bArr) throws IOException {
        int i10 = this.f66349d;
        if (i10 != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i10 == 0) {
            return;
        }
        int iA = a();
        int i11 = this.f66349d;
        if (i11 >= iA) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f66349d + " >= " + iA);
        }
        int iD = i11 - Qh.a.d(this.f66364a, bArr, 0, bArr.length);
        this.f66349d = iD;
        if (iD == 0) {
            b(true);
            return;
        }
        throw new EOFException("DEF length " + this.f66348c + " object truncated by " + this.f66349d);
    }

    byte[] j() throws IOException {
        if (this.f66349d == 0) {
            return f66347e;
        }
        int iA = a();
        int i10 = this.f66349d;
        if (i10 >= iA) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f66349d + " >= " + iA);
        }
        byte[] bArr = new byte[i10];
        int iD = i10 - Qh.a.d(this.f66364a, bArr, 0, i10);
        this.f66349d = iD;
        if (iD == 0) {
            b(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f66348c + " object truncated by " + this.f66349d);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f66349d == 0) {
            return -1;
        }
        int i10 = this.f66364a.read();
        if (i10 >= 0) {
            int i11 = this.f66349d - 1;
            this.f66349d = i11;
            if (i11 == 0) {
                b(true);
            }
            return i10;
        }
        throw new EOFException("DEF length " + this.f66348c + " object truncated by " + this.f66349d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f66349d;
        if (i12 == 0) {
            return -1;
        }
        int i13 = this.f66364a.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            int i14 = this.f66349d - i13;
            this.f66349d = i14;
            if (i14 == 0) {
                b(true);
            }
            return i13;
        }
        throw new EOFException("DEF length " + this.f66348c + " object truncated by " + this.f66349d);
    }
}
