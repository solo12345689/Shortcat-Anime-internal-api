package U2;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import q2.AbstractC6076H;
import q2.InterfaceC6098m;
import t2.a0;

/* JADX INFO: renamed from: U2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2249j implements InterfaceC2256q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6098m f19047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19049d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19052g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f19050e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f19046a = new byte[4096];

    static {
        AbstractC6076H.a("media3.extractor");
    }

    public C2249j(InterfaceC6098m interfaceC6098m, long j10, long j11) {
        this.f19047b = interfaceC6098m;
        this.f19049d = j10;
        this.f19048c = j11;
    }

    private void p(int i10) {
        if (i10 != -1) {
            this.f19049d += (long) i10;
        }
    }

    private void q(int i10) {
        int i11 = this.f19051f + i10;
        byte[] bArr = this.f19050e;
        if (i11 > bArr.length) {
            this.f19050e = Arrays.copyOf(this.f19050e, a0.r(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int r(byte[] bArr, int i10, int i11) {
        int i12 = this.f19052g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f19050e, 0, bArr, i10, iMin);
        u(iMin);
        return iMin;
    }

    private int s(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f19047b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int t(int i10) {
        int iMin = Math.min(this.f19052g, i10);
        u(iMin);
        return iMin;
    }

    private void u(int i10) {
        int i11 = this.f19052g - i10;
        this.f19052g = i11;
        this.f19051f = 0;
        byte[] bArr = this.f19050e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f19050e = bArr2;
    }

    @Override // U2.InterfaceC2256q
    public int b(int i10) throws EOFException, InterruptedIOException {
        int iT = t(i10);
        if (iT == 0) {
            byte[] bArr = this.f19046a;
            iT = s(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        p(iT);
        return iT;
    }

    @Override // U2.InterfaceC2256q
    public boolean d(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iT = t(i10);
        while (iT < i10 && iT != -1) {
            iT = s(this.f19046a, -iT, Math.min(i10, this.f19046a.length + iT), iT, z10);
        }
        p(iT);
        return iT != -1;
    }

    @Override // U2.InterfaceC2256q
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) {
        if (!n(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f19050e, this.f19051f - i11, bArr, i10, i11);
        return true;
    }

    @Override // U2.InterfaceC2256q
    public void g() {
        this.f19051f = 0;
    }

    @Override // U2.InterfaceC2256q
    public long getLength() {
        return this.f19048c;
    }

    @Override // U2.InterfaceC2256q
    public long getPosition() {
        return this.f19049d;
    }

    @Override // U2.InterfaceC2256q
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iR = r(bArr, i10, i11);
        while (iR < i11 && iR != -1) {
            iR = s(bArr, i10, i11, iR, z10);
        }
        p(iR);
        return iR != -1;
    }

    @Override // U2.InterfaceC2256q
    public long j() {
        return this.f19049d + ((long) this.f19051f);
    }

    @Override // U2.InterfaceC2256q
    public void k(int i10) throws EOFException, InterruptedIOException {
        n(i10, false);
    }

    @Override // U2.InterfaceC2256q
    public int l(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        C2249j c2249j;
        int iMin;
        q(i11);
        int i12 = this.f19052g;
        int i13 = this.f19051f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c2249j = this;
            iMin = c2249j.s(this.f19050e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c2249j.f19052g += iMin;
        } else {
            c2249j = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(c2249j.f19050e, c2249j.f19051f, bArr, i10, iMin);
        c2249j.f19051f += iMin;
        return iMin;
    }

    @Override // U2.InterfaceC2256q
    public void m(int i10) throws EOFException, InterruptedIOException {
        d(i10, false);
    }

    @Override // U2.InterfaceC2256q
    public boolean n(int i10, boolean z10) throws EOFException, InterruptedIOException {
        q(i10);
        int iS = this.f19052g - this.f19051f;
        while (iS < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iS = s(this.f19050e, this.f19051f, i11, iS, z11);
            if (iS == -1) {
                return false;
            }
            this.f19052g = this.f19051f + iS;
            i10 = i11;
            z10 = z11;
        }
        this.f19051f += i10;
        return true;
    }

    @Override // U2.InterfaceC2256q
    public void o(byte[] bArr, int i10, int i11) {
        e(bArr, i10, i11, false);
    }

    @Override // U2.InterfaceC2256q, q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iR = r(bArr, i10, i11);
        if (iR == 0) {
            iR = s(bArr, i10, i11, 0, true);
        }
        p(iR);
        return iR;
    }

    @Override // U2.InterfaceC2256q
    public void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h(bArr, i10, i11, false);
    }
}
