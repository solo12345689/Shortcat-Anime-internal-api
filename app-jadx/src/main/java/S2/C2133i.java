package S2;

import java.util.Arrays;

/* JADX INFO: renamed from: S2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2133i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15683d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15685f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f15680a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f15681b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f15684e = -9223372036854775807L;

    /* JADX INFO: renamed from: S2.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f15686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f15687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f15688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f15689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f15690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f15691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f15692g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f15693h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f15690e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f15691f / j10;
        }

        public long b() {
            return this.f15691f;
        }

        public boolean d() {
            long j10 = this.f15689d;
            if (j10 == 0) {
                return false;
            }
            return this.f15692g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f15689d > 15 && this.f15693h == 0;
        }

        public void f(long j10) {
            long j11 = this.f15689d;
            if (j11 == 0) {
                this.f15686a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f15686a;
                this.f15687b = j12;
                this.f15691f = j12;
                this.f15690e = 1L;
            } else {
                long j13 = j10 - this.f15688c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f15687b) <= 1000000) {
                    this.f15690e++;
                    this.f15691f += j13;
                    boolean[] zArr = this.f15692g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f15693h--;
                    }
                } else {
                    boolean[] zArr2 = this.f15692g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f15693h++;
                    }
                }
            }
            this.f15689d++;
            this.f15688c = j10;
        }

        public void g() {
            this.f15689d = 0L;
            this.f15690e = 0L;
            this.f15691f = 0L;
            this.f15693h = 0;
            Arrays.fill(this.f15692g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f15680a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f15680a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f15685f;
    }

    public long d() {
        if (e()) {
            return this.f15680a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f15680a.e();
    }

    public void f(long j10) {
        this.f15680a.f(j10);
        if (this.f15680a.e() && !this.f15683d) {
            this.f15682c = false;
        } else if (this.f15684e != -9223372036854775807L) {
            if (!this.f15682c || this.f15681b.d()) {
                this.f15681b.g();
                this.f15681b.f(this.f15684e);
            }
            this.f15682c = true;
            this.f15681b.f(j10);
        }
        if (this.f15682c && this.f15681b.e()) {
            a aVar = this.f15680a;
            this.f15680a = this.f15681b;
            this.f15681b = aVar;
            this.f15682c = false;
            this.f15683d = false;
        }
        this.f15684e = j10;
        this.f15685f = this.f15680a.e() ? 0 : this.f15685f + 1;
    }

    public void g() {
        this.f15680a.g();
        this.f15681b.g();
        this.f15682c = false;
        this.f15684e = -9223372036854775807L;
        this.f15685f = 0;
    }
}
