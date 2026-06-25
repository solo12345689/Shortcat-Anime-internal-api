package androidx.media3.exoplayer.dash;

import A2.J;
import M2.c0;
import f3.C4770c;
import q2.C6109x;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6109x f30722a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f30724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private E2.f f30726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30728g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4770c f30723b = new C4770c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f30729h = -9223372036854775807L;

    public e(E2.f fVar, C6109x c6109x, boolean z10) {
        this.f30722a = c6109x;
        this.f30726e = fVar;
        this.f30724c = fVar.f4240b;
        d(fVar, z10);
    }

    public String a() {
        return this.f30726e.a();
    }

    public void c(long j10) {
        int iG = a0.g(this.f30724c, j10, true, false);
        this.f30728g = iG;
        if (!this.f30725d || iG != this.f30724c.length) {
            j10 = -9223372036854775807L;
        }
        this.f30729h = j10;
    }

    public void d(E2.f fVar, boolean z10) {
        int i10 = this.f30728g;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f30724c[i10 - 1];
        this.f30725d = z10;
        this.f30726e = fVar;
        long[] jArr = fVar.f4240b;
        this.f30724c = jArr;
        long j11 = this.f30729h;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f30728g = a0.g(jArr, j10, false, false);
        }
    }

    @Override // M2.c0
    public int e(long j10) {
        int iMax = Math.max(this.f30728g, a0.g(this.f30724c, j10, true, false));
        int i10 = iMax - this.f30728g;
        this.f30728g = iMax;
        return i10;
    }

    @Override // M2.c0
    public boolean isReady() {
        return true;
    }

    @Override // M2.c0
    public int p(J j10, z2.f fVar, int i10) {
        int i11 = this.f30728g;
        boolean z10 = i11 == this.f30724c.length;
        if (z10 && !this.f30725d) {
            fVar.v(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f30727f) {
            j10.f142b = this.f30722a;
            this.f30727f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f30728g = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f30723b.a(this.f30726e.f4239a[i11]);
            fVar.x(bArrA.length);
            fVar.f65555d.put(bArrA);
        }
        fVar.f65557f = this.f30724c[i11];
        fVar.v(1);
        return -4;
    }

    @Override // M2.c0
    public void b() {
    }
}
