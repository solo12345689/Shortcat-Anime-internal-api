package zg;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
class M0 extends P0 {

    /* JADX INFO: renamed from: c */
    private int f66351c;

    /* JADX INFO: renamed from: d */
    private int f66352d;

    /* JADX INFO: renamed from: e */
    private boolean f66353e;

    /* JADX INFO: renamed from: f */
    private boolean f66354f;

    M0(InputStream inputStream, int i10) throws IOException {
        super(inputStream, i10);
        this.f66353e = false;
        this.f66354f = true;
        this.f66351c = inputStream.read();
        int i11 = inputStream.read();
        this.f66352d = i11;
        if (i11 < 0) {
            throw new EOFException();
        }
        g();
    }

    private boolean g() {
        if (!this.f66353e && this.f66354f && this.f66351c == 0 && this.f66352d == 0) {
            this.f66353e = true;
            b(true);
        }
        return this.f66353e;
    }

    void h(boolean z10) {
        this.f66354f = z10;
        g();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (g()) {
            return -1;
        }
        int i10 = this.f66364a.read();
        if (i10 < 0) {
            throw new EOFException();
        }
        int i11 = this.f66351c;
        this.f66351c = this.f66352d;
        this.f66352d = i10;
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f66354f || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this.f66353e) {
            return -1;
        }
        int i12 = this.f66364a.read(bArr, i10 + 2, i11 - 2);
        if (i12 < 0) {
            throw new EOFException();
        }
        bArr[i10] = (byte) this.f66351c;
        bArr[i10 + 1] = (byte) this.f66352d;
        this.f66351c = this.f66364a.read();
        int i13 = this.f66364a.read();
        this.f66352d = i13;
        if (i13 >= 0) {
            return i12 + 2;
        }
        throw new EOFException();
    }
}
