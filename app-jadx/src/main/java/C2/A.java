package C2;

import C2.B;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: a */
    private final a f2494a;

    /* JADX INFO: renamed from: b */
    private final int f2495b;

    /* JADX INFO: renamed from: c */
    private final B.a f2496c;

    /* JADX INFO: renamed from: d */
    private int f2497d;

    /* JADX INFO: renamed from: e */
    private long f2498e;

    /* JADX INFO: renamed from: f */
    private long f2499f;

    /* JADX INFO: renamed from: g */
    private long f2500g;

    /* JADX INFO: renamed from: h */
    private long f2501h;

    /* JADX INFO: renamed from: i */
    private long f2502i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final AudioTrack f2503a;

        /* JADX INFO: renamed from: b */
        private final AudioTimestamp f2504b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        private long f2505c;

        /* JADX INFO: renamed from: d */
        private long f2506d;

        /* JADX INFO: renamed from: e */
        private long f2507e;

        /* JADX INFO: renamed from: f */
        private boolean f2508f;

        /* JADX INFO: renamed from: g */
        private long f2509g;

        public a(AudioTrack audioTrack) {
            this.f2503a = audioTrack;
        }

        public void a() {
            this.f2508f = true;
        }

        public long b() {
            return this.f2507e;
        }

        public long c() {
            return this.f2504b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f2503a.getTimestamp(this.f2504b);
            if (timestamp) {
                long j10 = this.f2504b.framePosition;
                long j11 = this.f2506d;
                if (j11 > j10) {
                    if (this.f2508f) {
                        this.f2509g += j11;
                        this.f2508f = false;
                    } else {
                        this.f2505c++;
                    }
                }
                this.f2506d = j10;
                this.f2507e = j10 + this.f2509g + (this.f2505c << 32);
            }
            return timestamp;
        }
    }

    public A(AudioTrack audioTrack, B.a aVar) {
        this.f2494a = new a(audioTrack);
        this.f2495b = audioTrack.getSampleRate();
        this.f2496c = aVar;
        j();
    }

    private void a(long j10, float f10, long j11) {
        long jC = this.f2494a.c();
        long jB = b(j10, f10);
        if (Math.abs(jC - j10) > 5000000) {
            this.f2496c.e(this.f2494a.b(), jC, j10, j11);
            k(4);
        } else if (Math.abs(jB - j11) > 5000000) {
            this.f2496c.d(this.f2494a.b(), jC, j10, j11);
            k(4);
        } else if (this.f2497d == 4) {
            j();
        }
    }

    private long b(long j10, float f10) {
        return c(this.f2494a.b(), this.f2494a.c(), j10, f10);
    }

    private long c(long j10, long j11, long j12, float f10) {
        return t2.a0.l1(j10, this.f2495b) + t2.a0.j0(j12 - j11, f10);
    }

    private boolean g(long j10, float f10) {
        long jB = this.f2494a.b();
        long j11 = this.f2501h;
        if (jB <= j11) {
            return false;
        }
        return Math.abs(b(j10, f10) - c(j11, this.f2502i, j10, f10)) < 1000;
    }

    private void k(int i10) {
        this.f2497d = i10;
        if (i10 == 0) {
            this.f2500g = 0L;
            this.f2501h = -1L;
            this.f2502i = -9223372036854775807L;
            this.f2498e = System.nanoTime() / 1000;
            this.f2499f = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f2499f = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f2499f = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f2499f = 500000L;
        }
    }

    public void d() {
        this.f2494a.a();
    }

    public long e(long j10, float f10) {
        return b(j10, f10);
    }

    public boolean f() {
        return this.f2497d == 2;
    }

    public boolean h() {
        int i10 = this.f2497d;
        return i10 == 0 || i10 == 1;
    }

    public void i(long j10, float f10, long j11) {
        if (j10 - this.f2500g < this.f2499f) {
            return;
        }
        this.f2500g = j10;
        boolean zD = this.f2494a.d();
        if (zD) {
            a(j10, f10, j11);
        }
        int i10 = this.f2497d;
        if (i10 == 0) {
            if (!zD) {
                if (j10 - this.f2498e > 500000) {
                    k(3);
                    return;
                }
                return;
            } else {
                if (this.f2494a.c() >= this.f2498e) {
                    this.f2501h = this.f2494a.b();
                    this.f2502i = this.f2494a.c();
                    k(1);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            if (!zD) {
                j();
                return;
            }
            if (g(j10, f10)) {
                k(2);
                return;
            } else if (j10 - this.f2498e > 2000000) {
                k(3);
                return;
            } else {
                this.f2501h = this.f2494a.b();
                this.f2502i = this.f2494a.c();
                return;
            }
        }
        if (i10 == 2) {
            if (zD) {
                return;
            }
            j();
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
        } else if (zD) {
            j();
        }
    }

    public void j() {
        k(0);
    }
}
