package n3;

import U2.F;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.a f53883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f53884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f53885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f53888f;

    private i(F.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f53883a = new F.a(aVar);
        this.f53884b = j10;
        this.f53885c = j11;
        this.f53888f = jArr;
        this.f53886d = i10;
        this.f53887e = i11;
    }

    public static i b(F.a aVar, C6609I c6609i) {
        long[] jArr;
        int i10;
        int i11;
        int iV = c6609i.v();
        int iQ = (iV & 1) != 0 ? c6609i.Q() : -1;
        long jO = (iV & 2) != 0 ? c6609i.O() : -1L;
        if ((iV & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = c6609i.M();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iV & 8) != 0) {
            c6609i.c0(4);
        }
        if (c6609i.a() >= 24) {
            c6609i.c0(21);
            int iP = c6609i.P();
            i11 = iP & 4095;
            i10 = (16773120 & iP) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iQ, jO, jArr2, i10, i11);
    }

    public long a() {
        long j10 = this.f53884b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        F.a aVar = this.f53883a;
        return a0.l1((j10 * ((long) aVar.f18916g)) - 1, aVar.f18913d);
    }
}
