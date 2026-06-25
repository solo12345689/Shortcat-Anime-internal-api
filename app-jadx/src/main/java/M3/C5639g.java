package m3;

import U2.InterfaceC2256q;

/* JADX INFO: renamed from: m3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5639g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f53184d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f53185a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53187c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f53184d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f53184d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f53187c;
    }

    public long d(InterfaceC2256q interfaceC2256q, boolean z10, boolean z11, int i10) {
        if (this.f53186b == 0) {
            if (!interfaceC2256q.h(this.f53185a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f53185a[0] & 255);
            this.f53187c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f53186b = 1;
        }
        int i11 = this.f53187c;
        if (i11 > i10) {
            this.f53186b = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC2256q.readFully(this.f53185a, 1, i11 - 1);
        }
        this.f53186b = 0;
        return a(this.f53185a, this.f53187c, z11);
    }

    public void e() {
        this.f53186b = 0;
        this.f53187c = 0;
    }
}
