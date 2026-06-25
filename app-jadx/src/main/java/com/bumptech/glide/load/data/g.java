package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f35702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f35703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f35704e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f35705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35706b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f35702c = bArr;
        int length = bArr.length;
        f35703d = length;
        f35704e = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f35705a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f35706b;
        int i12 = (i11 < 2 || i11 > (i10 = f35704e)) ? super.read() : i11 == i10 ? this.f35705a : f35702c[i11 - 2] & 255;
        if (i12 != -1) {
            this.f35706b++;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f35706b = (int) (((long) this.f35706b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f35706b;
        int i14 = f35704e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f35705a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f35702c, this.f35706b - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f35706b += i12;
        }
        return i12;
    }
}
