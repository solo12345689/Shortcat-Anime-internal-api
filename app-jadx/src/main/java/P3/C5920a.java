package p3;

import U2.AbstractC2257s;
import U2.InterfaceC2256q;
import U2.J;
import U2.K;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import q2.C6080L;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: p3.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5920a implements InterfaceC5926g {

    /* JADX INFO: renamed from: a */
    private final C5925f f55734a;

    /* JADX INFO: renamed from: b */
    private final long f55735b;

    /* JADX INFO: renamed from: c */
    private final long f55736c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5928i f55737d;

    /* JADX INFO: renamed from: e */
    private int f55738e;

    /* JADX INFO: renamed from: f */
    private long f55739f;

    /* JADX INFO: renamed from: g */
    private long f55740g;

    /* JADX INFO: renamed from: h */
    private long f55741h;

    /* JADX INFO: renamed from: i */
    private long f55742i;

    /* JADX INFO: renamed from: j */
    private long f55743j;

    /* JADX INFO: renamed from: k */
    private long f55744k;

    /* JADX INFO: renamed from: l */
    private long f55745l;

    /* JADX INFO: renamed from: p3.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements J {
        private b() {
        }

        @Override // U2.J
        public J.a g(long j10) {
            return new J.a(new K(j10, a0.s((C5920a.this.f55735b + BigInteger.valueOf(C5920a.this.f55737d.c(j10)).multiply(BigInteger.valueOf(C5920a.this.f55736c - C5920a.this.f55735b)).divide(BigInteger.valueOf(C5920a.this.f55739f)).longValue()) - HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, C5920a.this.f55735b, C5920a.this.f55736c - 1)));
        }

        @Override // U2.J
        public boolean k() {
            return true;
        }

        @Override // U2.J
        public long n() {
            return C5920a.this.f55737d.b(C5920a.this.f55739f);
        }

        /* synthetic */ b(C5920a c5920a, C0856a c0856a) {
            this();
        }
    }

    public C5920a(AbstractC5928i abstractC5928i, long j10, long j11, long j12, long j13, boolean z10) {
        AbstractC6614a.a(j10 >= 0 && j11 > j10);
        this.f55737d = abstractC5928i;
        this.f55735b = j10;
        this.f55736c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f55739f = j13;
            this.f55738e = 4;
        } else {
            this.f55738e = 0;
        }
        this.f55734a = new C5925f();
    }

    private long i(InterfaceC2256q interfaceC2256q) throws IOException {
        if (this.f55742i == this.f55743j) {
            return -1L;
        }
        long position = interfaceC2256q.getPosition();
        if (!this.f55734a.d(interfaceC2256q, this.f55743j)) {
            long j10 = this.f55742i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f55734a.a(interfaceC2256q, false);
        interfaceC2256q.g();
        long j11 = this.f55741h;
        C5925f c5925f = this.f55734a;
        long j12 = c5925f.f55764c;
        long j13 = j11 - j12;
        int i10 = c5925f.f55769h + c5925f.f55770i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f55743j = position;
            this.f55745l = j12;
        } else {
            this.f55742i = interfaceC2256q.getPosition() + ((long) i10);
            this.f55744k = this.f55734a.f55764c;
        }
        long j14 = this.f55743j;
        long j15 = this.f55742i;
        if (j14 - j15 < 100000) {
            this.f55743j = j15;
            return j15;
        }
        long position2 = interfaceC2256q.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f55743j;
        long j17 = this.f55742i;
        return a0.s(position2 + ((j13 * (j16 - j17)) / (this.f55745l - this.f55744k)), j17, j16 - 1);
    }

    private void k(InterfaceC2256q interfaceC2256q) throws C6080L {
        while (true) {
            this.f55734a.c(interfaceC2256q);
            this.f55734a.a(interfaceC2256q, false);
            C5925f c5925f = this.f55734a;
            if (c5925f.f55764c > this.f55741h) {
                interfaceC2256q.g();
                return;
            } else {
                interfaceC2256q.m(c5925f.f55769h + c5925f.f55770i);
                this.f55742i = interfaceC2256q.getPosition();
                this.f55744k = this.f55734a.f55764c;
            }
        }
    }

    @Override // p3.InterfaceC5926g
    public long b(InterfaceC2256q interfaceC2256q) throws IOException {
        int i10 = this.f55738e;
        if (i10 == 0) {
            long position = interfaceC2256q.getPosition();
            this.f55740g = position;
            this.f55738e = 1;
            long j10 = this.f55736c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(interfaceC2256q);
                if (jI != -1) {
                    return jI;
                }
                this.f55738e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC2256q);
            this.f55738e = 4;
            return -(this.f55744k + 2);
        }
        this.f55739f = j(interfaceC2256q);
        this.f55738e = 4;
        return this.f55740g;
    }

    @Override // p3.InterfaceC5926g
    public void c(long j10) {
        this.f55741h = a0.s(j10, 0L, this.f55739f - 1);
        this.f55738e = 2;
        this.f55742i = this.f55735b;
        this.f55743j = this.f55736c;
        this.f55744k = 0L;
        this.f55745l = this.f55739f;
    }

    @Override // p3.InterfaceC5926g
    /* JADX INFO: renamed from: h */
    public b a() {
        if (this.f55739f != 0) {
            return new b();
        }
        return null;
    }

    long j(InterfaceC2256q interfaceC2256q) throws C6080L, EOFException {
        this.f55734a.b();
        if (!this.f55734a.c(interfaceC2256q)) {
            throw new EOFException();
        }
        this.f55734a.a(interfaceC2256q, false);
        C5925f c5925f = this.f55734a;
        interfaceC2256q.m(c5925f.f55769h + c5925f.f55770i);
        long j10 = this.f55734a.f55764c;
        while (true) {
            C5925f c5925f2 = this.f55734a;
            if ((c5925f2.f55763b & 4) == 4 || !c5925f2.c(interfaceC2256q) || interfaceC2256q.getPosition() >= this.f55736c || !this.f55734a.a(interfaceC2256q, true)) {
                break;
            }
            C5925f c5925f3 = this.f55734a;
            if (!AbstractC2257s.f(interfaceC2256q, c5925f3.f55769h + c5925f3.f55770i)) {
                break;
            }
            j10 = this.f55734a.f55764c;
        }
        return j10;
    }
}
