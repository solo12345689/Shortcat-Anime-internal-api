package C2;

import java.nio.ByteBuffer;
import r2.o;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends r2.q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f2711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short f2712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f2713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f2714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f2715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f2719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f2721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2722t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2723u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f2724v;

    public d0() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private void A(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        AbstractC6614a.a(this.f2723u >= i10);
        if (i11 == 2) {
            int i12 = this.f2722t;
            int i13 = this.f2723u;
            int i14 = i12 + i13;
            byte[] bArr = this.f2721s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f2724v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f2724v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f2724v, 0, i15);
                    System.arraycopy(this.f2721s, 0, this.f2724v, i15, length);
                }
            }
        } else {
            int i16 = this.f2722t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f2721s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f2724v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f2724v, 0, length2);
                System.arraycopy(this.f2721s, 0, this.f2724v, length2, i10 - length2);
            }
        }
        AbstractC6614a.b(i10 % this.f2716n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        AbstractC6614a.g(this.f2722t < this.f2721s.length);
        y(this.f2724v, i10, i11);
    }

    private void B(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f2721s.length));
        int iS = s(byteBuffer);
        if (iS == byteBuffer.position()) {
            this.f2718p = 1;
        } else {
            byteBuffer.limit(Math.min(iS, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void C(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = 127;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = -128;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void E(ByteBuffer byteBuffer) {
        int length;
        int i10;
        AbstractC6614a.g(this.f2722t < this.f2721s.length);
        int iLimit = byteBuffer.limit();
        int iT = t(byteBuffer);
        int iPosition = iT - byteBuffer.position();
        int i11 = this.f2722t;
        int i12 = this.f2723u;
        int i13 = i11 + i12;
        byte[] bArr = this.f2721s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iT < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f2721s, i10, iMin);
        int i14 = this.f2723u + iMin;
        this.f2723u = i14;
        AbstractC6614a.g(i14 <= this.f2721s.length);
        boolean z11 = z10 && iPosition < length;
        z(z11);
        if (z11) {
            this.f2718p = 0;
            this.f2720r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int F(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int m(float f10) {
        return n((int) f10);
    }

    private int n(int i10) {
        int i11 = this.f2716n;
        return (i10 / i11) * i11;
    }

    private int o(int i10, int i11) {
        int i12 = this.f2713k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int p(int i10, int i11) {
        return (((this.f2713k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int q(int i10) {
        int iR = ((r(this.f2715m) - this.f2720r) * this.f2716n) - (this.f2721s.length / 2);
        AbstractC6614a.g(iR >= 0);
        return m(Math.min((i10 * this.f2711i) + 0.5f, iR));
    }

    private int r(long j10) {
        return (int) ((j10 * ((long) this.f58448b.f58443a)) / 1000000);
    }

    private int s(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (v(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f2716n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int t(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (v(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f2716n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean v(byte b10, byte b11) {
        return Math.abs(F(b10, b11)) > this.f2712j;
    }

    private void w(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            C(bArr, i12, (F(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? p(i12, i10 - 1) : i11 == 2 ? o(i12, i10 - 1) : this.f2713k)) / 100);
        }
    }

    private void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void y(byte[] bArr, int i10, int i11) {
        AbstractC6614a.b(i10 % this.f2716n == 0, "byteOutput size is not aligned to frame size " + i10);
        w(bArr, i10, i11);
        l(i10).put(bArr, 0, i10).flip();
    }

    private void z(boolean z10) {
        int length;
        int iQ;
        int i10 = this.f2723u;
        byte[] bArr = this.f2721s;
        if (i10 == bArr.length || z10) {
            if (this.f2720r == 0) {
                if (z10) {
                    A(i10, 3);
                    length = i10;
                } else {
                    AbstractC6614a.g(i10 >= bArr.length / 2);
                    length = this.f2721s.length / 2;
                    A(length, 0);
                }
                iQ = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iQ2 = q(length2) + (this.f2721s.length / 2);
                A(iQ2, 2);
                iQ = iQ2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iQ = q(length);
                A(iQ, 1);
            }
            AbstractC6614a.h(length % this.f2716n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            AbstractC6614a.g(i10 >= iQ);
            this.f2723u -= length;
            int i11 = this.f2722t + length;
            this.f2722t = i11;
            this.f2722t = i11 % this.f2721s.length;
            int i12 = this.f2720r;
            int i13 = this.f2716n;
            this.f2720r = i12 + (iQ / i13);
            this.f2719q += (long) ((length - iQ) / i13);
        }
    }

    public void D(boolean z10) {
        this.f2717o = z10;
    }

    @Override // r2.q, r2.o
    public boolean b() {
        return super.b() && this.f2717o;
    }

    @Override // r2.o
    public void c(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f2718p;
            if (i10 == 0) {
                B(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                E(byteBuffer);
            }
        }
    }

    @Override // r2.q
    protected o.a h(o.a aVar) throws o.b {
        if (aVar.f58445c == 2) {
            return aVar.f58443a == -1 ? o.a.f58442e : aVar;
        }
        throw new o.b(aVar);
    }

    @Override // r2.q
    public void i() {
        if (b()) {
            this.f2716n = this.f58448b.f58444b * 2;
            int iN = n(r(this.f2714l) / 2) * 2;
            if (this.f2721s.length != iN) {
                this.f2721s = new byte[iN];
                this.f2724v = new byte[iN];
            }
        }
        this.f2718p = 0;
        this.f2719q = 0L;
        this.f2720r = 0;
        this.f2722t = 0;
        this.f2723u = 0;
    }

    @Override // r2.q
    public void j() {
        if (this.f2723u > 0) {
            z(true);
            this.f2720r = 0;
        }
    }

    @Override // r2.q
    public void k() {
        this.f2717o = false;
        byte[] bArr = t2.a0.f60567f;
        this.f2721s = bArr;
        this.f2724v = bArr;
    }

    public long u() {
        return this.f2719q;
    }

    public d0(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f2720r = 0;
        this.f2722t = 0;
        this.f2723u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        AbstractC6614a.a(z10);
        this.f2714l = j10;
        this.f2711i = f10;
        this.f2715m = j11;
        this.f2713k = i10;
        this.f2712j = s10;
        byte[] bArr = t2.a0.f60567f;
        this.f2721s = bArr;
        this.f2724v = bArr;
    }
}
