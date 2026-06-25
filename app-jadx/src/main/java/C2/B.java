package C2;

import android.media.AudioTrack;
import android.os.Build;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.lang.reflect.Method;
import t2.AbstractC6614a;
import t2.InterfaceC6623j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f2510A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f2511B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f2512C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f2513D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f2514E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f2515F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f2516G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f2517H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private InterfaceC6623j f2518I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f2519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f2520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f2521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private A f2523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f2526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f2527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f2529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f2531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f2532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Method f2533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f2534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f2537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f2538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f2539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f2540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f2541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f2542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f2543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f2544z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public B(a aVar) {
        this.f2519a = (a) AbstractC6614a.e(aVar);
        try {
            this.f2533o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f2520b = new long[10];
        this.f2515F = -9223372036854775807L;
        this.f2514E = -9223372036854775807L;
        this.f2518I = InterfaceC6623j.f60596a;
    }

    private boolean b() {
        return this.f2525g && ((AudioTrack) AbstractC6614a.e(this.f2521c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        if (this.f2544z != -9223372036854775807L) {
            return Math.min(this.f2512C, g());
        }
        long jC = this.f2518I.c();
        if (jC - this.f2538t >= 5) {
            y(jC);
            this.f2538t = jC;
        }
        return this.f2539u + this.f2517H + (this.f2540v << 32);
    }

    private long e(long j10) {
        long jMax = Math.max(0L, (this.f2543y == 0 ? this.f2544z != -9223372036854775807L ? t2.a0.l1(g(), this.f2524f) : f() : t2.a0.j0(j10 + this.f2531m, this.f2527i)) - this.f2534p);
        return this.f2544z != -9223372036854775807L ? Math.min(t2.a0.l1(this.f2512C, this.f2524f), jMax) : jMax;
    }

    private long f() {
        return t2.a0.l1(d(), this.f2524f);
    }

    private long g() {
        if (((AudioTrack) AbstractC6614a.e(this.f2521c)).getPlayState() == 2) {
            return this.f2511B;
        }
        return this.f2511B + t2.a0.H(t2.a0.j0(t2.a0.V0(this.f2518I.c()) - this.f2544z, this.f2527i), this.f2524f);
    }

    private boolean i() {
        int underrunCount = ((AudioTrack) AbstractC6614a.e(this.f2521c)).getUnderrunCount();
        boolean z10 = underrunCount > this.f2530l;
        this.f2530l = underrunCount;
        return z10;
    }

    private void n() {
        long jB = this.f2518I.b() / 1000;
        if (jB - this.f2532n >= HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) {
            long jF = f();
            if (jF != 0) {
                this.f2520b[this.f2542x] = t2.a0.p0(jF, this.f2527i) - jB;
                this.f2542x = (this.f2542x + 1) % 10;
                int i10 = this.f2543y;
                if (i10 < 10) {
                    this.f2543y = i10 + 1;
                }
                this.f2532n = jB;
                this.f2531m = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f2543y;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f2531m += this.f2520b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f2525g) {
            return;
        }
        p(jB);
        ((A) AbstractC6614a.e(this.f2523e)).i(jB, this.f2527i, e(jB));
    }

    private void o(long j10) {
        if (this.f2513D) {
            long j11 = this.f2529k;
            if (j11 == -9223372036854775807L || j10 < j11) {
                return;
            }
            long jA = this.f2518I.a() - t2.a0.F1(t2.a0.p0(j10 - j11, this.f2527i));
            this.f2529k = -9223372036854775807L;
            this.f2519a.a(jA);
        }
    }

    private void p(long j10) {
        Method method;
        if (!this.f2536r || (method = this.f2533o) == null || j10 - this.f2537s < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) t2.a0.l((Integer) method.invoke(AbstractC6614a.e(this.f2521c), null))).intValue()) * 1000) - this.f2526h;
            this.f2534p = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f2534p = jMax;
            if (jMax > 5000000) {
                this.f2519a.c(jMax);
                this.f2534p = 0L;
            }
        } catch (Exception unused) {
            this.f2533o = null;
        }
        this.f2537s = j10;
    }

    private static boolean q(int i10) {
        return false;
    }

    private void t() {
        this.f2531m = 0L;
        this.f2543y = 0;
        this.f2542x = 0;
        this.f2532n = 0L;
        this.f2514E = -9223372036854775807L;
        this.f2515F = -9223372036854775807L;
        this.f2528j = false;
    }

    private void y(long j10) {
        AudioTrack audioTrack = (AudioTrack) AbstractC6614a.e(this.f2521c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f2525g) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f2541w = this.f2539u;
            }
            playbackHeadPosition += this.f2541w;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f2539u > 0 && playState == 3) {
                if (this.f2510A == -9223372036854775807L) {
                    this.f2510A = j10;
                    return;
                }
                return;
            }
            this.f2510A = -9223372036854775807L;
        }
        long j11 = this.f2539u;
        if (j11 > playbackHeadPosition) {
            if (this.f2516G) {
                this.f2517H += j11;
                this.f2516G = false;
            } else {
                this.f2540v++;
            }
        }
        this.f2539u = playbackHeadPosition;
    }

    public void a() {
        this.f2516G = true;
        A a10 = this.f2523e;
        if (a10 != null) {
            a10.d();
        }
    }

    public long c() {
        AudioTrack audioTrack = (AudioTrack) AbstractC6614a.e(this.f2521c);
        if (audioTrack.getPlayState() == 3) {
            n();
        }
        long jB = this.f2518I.b() / 1000;
        A a10 = (A) AbstractC6614a.e(this.f2523e);
        boolean zF = a10.f();
        long jE = zF ? a10.e(jB, this.f2527i) : e(jB);
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                o(jE);
            }
            return jE;
        }
        if (zF || !a10.h()) {
            o(jE);
        }
        long j10 = this.f2515F;
        if (j10 != -9223372036854775807L) {
            long j11 = jE - this.f2514E;
            long jJ0 = t2.a0.j0(jB - j10, this.f2527i);
            long j12 = this.f2514E + jJ0;
            long jAbs = Math.abs(j12 - jE);
            if (j11 != 0 && jAbs < 1000000) {
                long j13 = (jJ0 * 10) / 100;
                jE = t2.a0.s(jE, j12 - j13, j12 + j13);
            }
        }
        if (!this.f2513D && !this.f2528j) {
            long j14 = this.f2514E;
            if (j14 != -9223372036854775807L && jE > j14) {
                this.f2528j = true;
                this.f2519a.a(this.f2518I.a() - t2.a0.F1(t2.a0.p0(t2.a0.F1(jE - j14), this.f2527i)));
            }
        }
        this.f2515F = jB;
        this.f2514E = jE;
        return jE;
    }

    public void h(long j10) {
        this.f2511B = d();
        this.f2544z = t2.a0.V0(this.f2518I.c());
        this.f2512C = j10;
    }

    public boolean j(long j10) {
        return j10 > t2.a0.H(c(), this.f2524f) || b();
    }

    public boolean k() {
        return ((AudioTrack) AbstractC6614a.e(this.f2521c)).getPlayState() == 3;
    }

    public boolean l(long j10) {
        return this.f2510A != -9223372036854775807L && j10 > 0 && this.f2518I.c() - this.f2510A >= 200;
    }

    public boolean m(long j10) {
        int playState = ((AudioTrack) AbstractC6614a.e(this.f2521c)).getPlayState();
        if (this.f2525g) {
            if (playState == 2) {
                this.f2535q = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        if (i()) {
            this.f2519a.b(this.f2522d, t2.a0.F1(this.f2526h));
        }
        return true;
    }

    public void r() {
        t();
        if (this.f2544z == -9223372036854775807L) {
            ((A) AbstractC6614a.e(this.f2523e)).j();
        }
        this.f2511B = d();
    }

    public void s() {
        t();
        this.f2521c = null;
        this.f2523e = null;
    }

    public void u(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12, boolean z11) {
        this.f2521c = audioTrack;
        this.f2522d = i12;
        this.f2523e = new A(audioTrack, this.f2519a);
        this.f2524f = audioTrack.getSampleRate();
        this.f2525g = z10 && q(i10);
        boolean zL0 = t2.a0.L0(i10);
        this.f2536r = zL0;
        this.f2526h = zL0 ? t2.a0.l1(i12 / i11, this.f2524f) : -9223372036854775807L;
        this.f2539u = 0L;
        this.f2540v = 0L;
        this.f2516G = false;
        this.f2517H = 0L;
        this.f2541w = 0L;
        this.f2535q = false;
        this.f2544z = -9223372036854775807L;
        this.f2510A = -9223372036854775807L;
        this.f2537s = 0L;
        this.f2534p = 0L;
        this.f2527i = 1.0f;
        this.f2530l = 0;
        this.f2529k = -9223372036854775807L;
        this.f2513D = z11;
    }

    public void v(float f10) {
        this.f2527i = f10;
        A a10 = this.f2523e;
        if (a10 != null) {
            a10.j();
        }
        t();
    }

    public void w(InterfaceC6623j interfaceC6623j) {
        this.f2518I = interfaceC6623j;
    }

    public void x() {
        if (this.f2544z != -9223372036854775807L) {
            this.f2544z = t2.a0.V0(this.f2518I.c());
        }
        this.f2529k = f();
        ((A) AbstractC6614a.e(this.f2523e)).j();
    }
}
