package androidx.media3.exoplayer;

import android.os.SystemClock;
import q2.C6071C;

/* JADX INFO: renamed from: androidx.media3.exoplayer.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2888i implements A2.K {

    /* JADX INFO: renamed from: a */
    private final float f30994a;

    /* JADX INFO: renamed from: b */
    private final float f30995b;

    /* JADX INFO: renamed from: c */
    private final long f30996c;

    /* JADX INFO: renamed from: d */
    private final float f30997d;

    /* JADX INFO: renamed from: e */
    private final long f30998e;

    /* JADX INFO: renamed from: f */
    private final long f30999f;

    /* JADX INFO: renamed from: g */
    private final float f31000g;

    /* JADX INFO: renamed from: h */
    private long f31001h;

    /* JADX INFO: renamed from: i */
    private long f31002i;

    /* JADX INFO: renamed from: j */
    private long f31003j;

    /* JADX INFO: renamed from: k */
    private long f31004k;

    /* JADX INFO: renamed from: l */
    private long f31005l;

    /* JADX INFO: renamed from: m */
    private long f31006m;

    /* JADX INFO: renamed from: n */
    private float f31007n;

    /* JADX INFO: renamed from: o */
    private float f31008o;

    /* JADX INFO: renamed from: p */
    private float f31009p;

    /* JADX INFO: renamed from: q */
    private long f31010q;

    /* JADX INFO: renamed from: r */
    private long f31011r;

    /* JADX INFO: renamed from: s */
    private long f31012s;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private float f31013a = 0.97f;

        /* JADX INFO: renamed from: b */
        private float f31014b = 1.03f;

        /* JADX INFO: renamed from: c */
        private long f31015c = 1000;

        /* JADX INFO: renamed from: d */
        private float f31016d = 1.0E-7f;

        /* JADX INFO: renamed from: e */
        private long f31017e = t2.a0.V0(20);

        /* JADX INFO: renamed from: f */
        private long f31018f = t2.a0.V0(500);

        /* JADX INFO: renamed from: g */
        private float f31019g = 0.999f;

        public C2888i a() {
            return new C2888i(this.f31013a, this.f31014b, this.f31015c, this.f31016d, this.f31017e, this.f31018f, this.f31019g);
        }
    }

    /* synthetic */ C2888i(float f10, float f11, long j10, float f12, long j11, long j12, float f13, a aVar) {
        this(f10, f11, j10, f12, j11, j12, f13);
    }

    private void f(long j10) {
        long j11 = this.f31011r + (this.f31012s * 3);
        if (this.f31006m > j11) {
            float fV0 = t2.a0.V0(this.f30996c);
            this.f31006m = S9.h.d(j11, this.f31003j, this.f31006m - (((long) ((this.f31009p - 1.0f) * fV0)) + ((long) ((this.f31007n - 1.0f) * fV0))));
            return;
        }
        long jS = t2.a0.s(j10 - ((long) (Math.max(0.0f, this.f31009p - 1.0f) / this.f30997d)), this.f31006m, j11);
        this.f31006m = jS;
        long j12 = this.f31005l;
        if (j12 == -9223372036854775807L || jS <= j12) {
            return;
        }
        this.f31006m = j12;
    }

    private void g() {
        long j10;
        long j11 = this.f31001h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f31002i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f31004k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f31005l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f31003j == j10) {
            return;
        }
        this.f31003j = j10;
        this.f31006m = j10;
        this.f31011r = -9223372036854775807L;
        this.f31012s = -9223372036854775807L;
        this.f31010q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f31011r;
        if (j13 == -9223372036854775807L) {
            this.f31011r = j12;
            this.f31012s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f31000g));
            this.f31011r = jMax;
            this.f31012s = h(this.f31012s, Math.abs(j12 - jMax), this.f31000g);
        }
    }

    @Override // A2.K
    public void a(C6071C.g gVar) {
        this.f31001h = t2.a0.V0(gVar.f56411a);
        this.f31004k = t2.a0.V0(gVar.f56412b);
        this.f31005l = t2.a0.V0(gVar.f56413c);
        float f10 = gVar.f56414d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f30994a;
        }
        this.f31008o = f10;
        float f11 = gVar.f56415e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f30995b;
        }
        this.f31007n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f31001h = -9223372036854775807L;
        }
        g();
    }

    @Override // A2.K
    public float b(long j10, long j11) {
        if (this.f31001h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f31010q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f31010q < this.f30996c) {
            return this.f31009p;
        }
        this.f31010q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f31006m;
        if (Math.abs(j12) < this.f30998e) {
            this.f31009p = 1.0f;
        } else {
            this.f31009p = t2.a0.q((this.f30997d * j12) + 1.0f, this.f31008o, this.f31007n);
        }
        return this.f31009p;
    }

    @Override // A2.K
    public long c() {
        return this.f31006m;
    }

    @Override // A2.K
    public void d() {
        long j10 = this.f31006m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f30999f;
        this.f31006m = j11;
        long j12 = this.f31005l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f31006m = j12;
        }
        this.f31010q = -9223372036854775807L;
    }

    @Override // A2.K
    public void e(long j10) {
        this.f31002i = j10;
        g();
    }

    private C2888i(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f30994a = f10;
        this.f30995b = f11;
        this.f30996c = j10;
        this.f30997d = f12;
        this.f30998e = j11;
        this.f30999f = j12;
        this.f31000g = f13;
        this.f31001h = -9223372036854775807L;
        this.f31002i = -9223372036854775807L;
        this.f31004k = -9223372036854775807L;
        this.f31005l = -9223372036854775807L;
        this.f31008o = f10;
        this.f31007n = f11;
        this.f31009p = 1.0f;
        this.f31010q = -9223372036854775807L;
        this.f31003j = -9223372036854775807L;
        this.f31006m = -9223372036854775807L;
        this.f31011r = -9223372036854775807L;
        this.f31012s = -9223372036854775807L;
    }
}
