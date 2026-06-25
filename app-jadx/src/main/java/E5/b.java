package E5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f5657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5659c;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f5657a = bArr;
    }

    private int a() {
        int i10 = this.f5658b;
        byte[] bArr = this.f5657a;
        if (i10 >= bArr.length) {
            return -1;
        }
        this.f5658b = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i10);
            this.f5659c = this.f5658b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        return i10 != -1 ? i10 : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f5658b = this.f5659c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i13 < i11) {
            int iA = a();
            if (iA == -1) {
                break;
            }
            bArr[i10 + i13] = (byte) iA;
            i13++;
        }
        if (i13 > 0) {
            return i13;
        }
        return -1;
    }
}
