package h6;

import android.os.SystemClock;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: h6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4909c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j6.b f47669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f47671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f47672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f47674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f47675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f47677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f47679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47680l;

    public C4909c(j6.b frameScheduler) {
        AbstractC5504s.h(frameScheduler, "frameScheduler");
        this.f47669a = frameScheduler;
        this.f47671c = 8L;
        this.f47678j = -1;
        this.f47679k = -1;
    }

    private final long d() {
        return SystemClock.uptimeMillis();
    }

    public final int a() {
        long jD = this.f47670b ? (d() - this.f47674f) + this.f47672d : Math.max(this.f47676h, 0L);
        int iB = this.f47669a.b(jD, this.f47676h);
        this.f47676h = jD;
        return iB;
    }

    public final boolean b() {
        return this.f47670b;
    }

    public final long c() {
        if (!this.f47670b) {
            return -1L;
        }
        long jA = this.f47669a.a(d() - this.f47674f);
        if (jA == -1) {
            this.f47670b = false;
            return -1L;
        }
        long j10 = jA + this.f47671c;
        this.f47675g = this.f47674f + j10;
        return j10;
    }

    public final void e() {
        this.f47680l++;
    }

    public final void f(int i10) {
        this.f47678j = i10;
    }

    public final void g(boolean z10) {
        this.f47670b = z10;
    }

    public final boolean h() {
        return this.f47678j != -1 && d() >= this.f47675g;
    }

    public final void i() {
        if (this.f47670b) {
            return;
        }
        long jD = d();
        long j10 = jD - this.f47673e;
        this.f47674f = j10;
        this.f47675g = j10;
        this.f47676h = jD - this.f47677i;
        this.f47678j = this.f47679k;
        this.f47670b = true;
    }

    public final void j() {
        if (this.f47670b) {
            long jD = d();
            this.f47673e = jD - this.f47674f;
            this.f47677i = jD - this.f47676h;
            this.f47674f = 0L;
            this.f47675g = 0L;
            this.f47676h = -1L;
            this.f47678j = -1;
            this.f47670b = false;
        }
    }
}
