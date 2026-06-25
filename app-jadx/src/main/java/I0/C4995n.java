package i0;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4995n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f48504b = AbstractC4998q.b(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f48505c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f48506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48507e;

    public C4995n() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f48506d = iArr;
    }

    private final int b() {
        int length = this.f48506d.length;
        if (this.f48507e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            AbstractC2273n.p(this.f48506d, iArr, 0, 0, 0, 14, null);
            this.f48506d = iArr;
        }
        int i13 = this.f48507e;
        this.f48507e = this.f48506d[i13];
        return i13;
    }

    private final void c(int i10) {
        int length = this.f48504b.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        long[] jArrB = AbstractC4998q.b(i11);
        int[] iArr = new int[i11];
        AbstractC2273n.q(this.f48504b, jArrB, 0, 0, 0, 12, null);
        AbstractC2273n.p(this.f48505c, iArr, 0, 0, 0, 14, null);
        this.f48504b = jArrB;
        this.f48505c = iArr;
    }

    private final void d(int i10) {
        this.f48506d[i10] = this.f48507e;
        this.f48507e = i10;
    }

    private final void g(int i10) {
        long[] jArr = this.f48504b;
        int i11 = this.f48503a >> 1;
        while (i10 < i11) {
            int i12 = (i10 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 >= this.f48503a || AbstractC5504s.j(jArr[i12], jArr[i13]) >= 0) {
                if (AbstractC5504s.j(jArr[i13], jArr[i10]) >= 0) {
                    return;
                }
                i(i13, i10);
                i10 = i13;
            } else {
                if (AbstractC5504s.j(jArr[i12], jArr[i10]) >= 0) {
                    return;
                }
                i(i12, i10);
                i10 = i12;
            }
        }
    }

    private final void h(int i10) {
        long[] jArr = this.f48504b;
        long j10 = jArr[i10];
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (AbstractC5504s.j(jArr[i11], j10) <= 0) {
                return;
            }
            i(i11, i10);
            i10 = i11;
        }
    }

    private final void i(int i10, int i11) {
        long[] jArr = this.f48504b;
        int[] iArr = this.f48505c;
        int[] iArr2 = this.f48506d;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }

    public final int a(long j10) {
        c(this.f48503a + 1);
        int i10 = this.f48503a;
        this.f48503a = i10 + 1;
        int iB = b();
        this.f48504b[i10] = j10;
        this.f48505c[i10] = iB;
        this.f48506d[iB] = i10;
        h(i10);
        return iB;
    }

    public final long e(long j10) {
        return this.f48503a > 0 ? this.f48504b[0] : j10;
    }

    public final void f(int i10) {
        int i11 = this.f48506d[i10];
        i(i11, this.f48503a - 1);
        this.f48503a--;
        h(i11);
        g(i11);
        d(i10);
    }
}
