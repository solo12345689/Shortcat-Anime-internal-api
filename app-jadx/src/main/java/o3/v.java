package o3;

import U2.InterfaceC2256q;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5812c f54426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f54427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f54428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54431f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f54437l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f54439n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f54441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f54442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f54443r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f54432g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f54433h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f54434i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f54435j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f54436k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f54438m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C6609I f54440o = new C6609I();

    public void a(InterfaceC2256q interfaceC2256q) {
        interfaceC2256q.readFully(this.f54440o.f(), 0, this.f54440o.j());
        this.f54440o.b0(0);
        this.f54441p = false;
    }

    public void b(C6609I c6609i) {
        c6609i.q(this.f54440o.f(), 0, this.f54440o.j());
        this.f54440o.b0(0);
        this.f54441p = false;
    }

    public long c(int i10) {
        return this.f54435j[i10];
    }

    public void d(int i10) {
        this.f54440o.X(i10);
        this.f54437l = true;
        this.f54441p = true;
    }

    public void e(int i10, int i11) {
        this.f54430e = i10;
        this.f54431f = i11;
        if (this.f54433h.length < i10) {
            this.f54432g = new long[i10];
            this.f54433h = new int[i10];
        }
        if (this.f54434i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f54434i = new int[i12];
            this.f54435j = new long[i12];
            this.f54436k = new boolean[i12];
            this.f54438m = new boolean[i12];
        }
    }

    public void f() {
        this.f54430e = 0;
        this.f54442q = 0L;
        this.f54443r = false;
        this.f54437l = false;
        this.f54441p = false;
        this.f54439n = null;
    }

    public boolean g(int i10) {
        return this.f54437l && this.f54438m[i10];
    }
}
