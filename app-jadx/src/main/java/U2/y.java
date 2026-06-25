package U2;

import java.util.Collections;
import java.util.List;
import q2.C6078J;
import q2.C6109x;
import t2.C6608H;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f19107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f19108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C6078J f19109l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f19110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f19111b;

        public a(long[] jArr, long[] jArr2) {
            this.f19110a = jArr;
            this.f19111b = jArr2;
        }
    }

    public y(byte[] bArr, int i10) {
        C6608H c6608h = new C6608H(bArr);
        c6608h.p(i10 * 8);
        this.f19098a = c6608h.h(16);
        this.f19099b = c6608h.h(16);
        this.f19100c = c6608h.h(24);
        this.f19101d = c6608h.h(24);
        int iH = c6608h.h(20);
        this.f19102e = iH;
        this.f19103f = j(iH);
        this.f19104g = c6608h.h(3) + 1;
        int iH2 = c6608h.h(5) + 1;
        this.f19105h = iH2;
        this.f19106i = e(iH2);
        this.f19107j = c6608h.j(36);
        this.f19108k = null;
        this.f19109l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List list) {
        return new y(this.f19098a, this.f19099b, this.f19100c, this.f19101d, this.f19102e, this.f19104g, this.f19105h, this.f19107j, this.f19108k, h(new C6078J(list)));
    }

    public y b(a aVar) {
        return new y(this.f19098a, this.f19099b, this.f19100c, this.f19101d, this.f19102e, this.f19104g, this.f19105h, this.f19107j, aVar, this.f19109l);
    }

    public y c(List list) {
        return new y(this.f19098a, this.f19099b, this.f19100c, this.f19101d, this.f19102e, this.f19104g, this.f19105h, this.f19107j, this.f19108k, h(S.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f19101d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f19100c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f19098a;
            j10 = ((((i11 != this.f19099b || i11 <= 0) ? 4096L : i11) * ((long) this.f19104g)) * ((long) this.f19105h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f19107j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f19102e);
    }

    public C6109x g(byte[] bArr, C6078J c6078j) {
        bArr[4] = -128;
        int i10 = this.f19101d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new C6109x.b().y0("audio/flac").o0(i10).T(this.f19104g).z0(this.f19102e).s0(a0.l0(this.f19105h)).k0(Collections.singletonList(bArr)).r0(h(c6078j)).P();
    }

    public C6078J h(C6078J c6078j) {
        C6078J c6078j2 = this.f19109l;
        return c6078j2 == null ? c6078j : c6078j2.b(c6078j);
    }

    public long i(long j10) {
        return a0.s((j10 * ((long) this.f19102e)) / 1000000, 0L, this.f19107j - 1);
    }

    private y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, C6078J c6078j) {
        this.f19098a = i10;
        this.f19099b = i11;
        this.f19100c = i12;
        this.f19101d = i13;
        this.f19102e = i14;
        this.f19103f = j(i14);
        this.f19104g = i15;
        this.f19105h = i16;
        this.f19106i = e(i16);
        this.f19107j = j10;
        this.f19108k = aVar;
        this.f19109l = c6078j;
    }
}
