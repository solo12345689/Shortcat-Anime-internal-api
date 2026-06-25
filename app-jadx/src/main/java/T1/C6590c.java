package t1;

import java.util.ArrayList;
import t1.C6592e;

/* JADX INFO: renamed from: t1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6590c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected C6592e f60275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C6592e f60276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected C6592e f60277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C6592e f60278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected C6592e f60279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C6592e f60280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected C6592e f60281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f60282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f60283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f60284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f60285k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f60286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f60287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f60288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f60289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f60290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f60291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f60292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f60293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f60294t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f60295u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f60296v;

    public C6590c(C6592e c6592e, int i10, boolean z10) {
        this.f60275a = c6592e;
        this.f60290p = i10;
        this.f60291q = z10;
    }

    private void b() {
        int i10 = this.f60290p * 2;
        C6592e c6592e = this.f60275a;
        this.f60289o = true;
        C6592e c6592e2 = c6592e;
        boolean z10 = false;
        while (!z10) {
            this.f60283i++;
            C6592e[] c6592eArr = c6592e.f60328F0;
            int i11 = this.f60290p;
            C6592e c6592e3 = null;
            c6592eArr[i11] = null;
            c6592e.f60326E0[i11] = null;
            if (c6592e.U() != 8) {
                this.f60286l++;
                C6592e.b bVarU = c6592e.u(this.f60290p);
                C6592e.b bVar = C6592e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f60287m += c6592e.F(this.f60290p);
                }
                int iF = this.f60287m + c6592e.f60349W[i10].f();
                this.f60287m = iF;
                int i12 = i10 + 1;
                this.f60287m = iF + c6592e.f60349W[i12].f();
                int iF2 = this.f60288n + c6592e.f60349W[i10].f();
                this.f60288n = iF2;
                this.f60288n = iF2 + c6592e.f60349W[i12].f();
                if (this.f60276b == null) {
                    this.f60276b = c6592e;
                }
                this.f60278d = c6592e;
                C6592e.b[] bVarArr = c6592e.f60352Z;
                int i13 = this.f60290p;
                if (bVarArr[i13] == bVar) {
                    int i14 = c6592e.f60401y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f60284j++;
                        float f10 = c6592e.f60324D0[i13];
                        if (f10 > 0.0f) {
                            this.f60285k += f10;
                        }
                        if (c(c6592e, i13)) {
                            if (f10 < 0.0f) {
                                this.f60292r = true;
                            } else {
                                this.f60293s = true;
                            }
                            if (this.f60282h == null) {
                                this.f60282h = new ArrayList();
                            }
                            this.f60282h.add(c6592e);
                        }
                        if (this.f60280f == null) {
                            this.f60280f = c6592e;
                        }
                        C6592e c6592e4 = this.f60281g;
                        if (c6592e4 != null) {
                            c6592e4.f60326E0[this.f60290p] = c6592e;
                        }
                        this.f60281g = c6592e;
                    }
                    if (this.f60290p == 0) {
                        if (c6592e.f60397w != 0 || c6592e.f60403z != 0 || c6592e.f60317A != 0) {
                            this.f60289o = false;
                        }
                    } else if (c6592e.f60399x != 0 || c6592e.f60321C != 0 || c6592e.f60323D != 0) {
                        this.f60289o = false;
                    }
                    if (c6592e.f60360d0 != 0.0f) {
                        this.f60289o = false;
                        this.f60295u = true;
                    }
                }
            }
            if (c6592e2 != c6592e) {
                c6592e2.f60328F0[this.f60290p] = c6592e;
            }
            C6591d c6591d = c6592e.f60349W[i10 + 1].f60302f;
            if (c6591d != null) {
                C6592e c6592e5 = c6591d.f60300d;
                C6591d c6591d2 = c6592e5.f60349W[i10].f60302f;
                if (c6591d2 != null && c6591d2.f60300d == c6592e) {
                    c6592e3 = c6592e5;
                }
            }
            if (c6592e3 == null) {
                c6592e3 = c6592e;
                z10 = true;
            }
            c6592e2 = c6592e;
            c6592e = c6592e3;
        }
        C6592e c6592e6 = this.f60276b;
        if (c6592e6 != null) {
            this.f60287m -= c6592e6.f60349W[i10].f();
        }
        C6592e c6592e7 = this.f60278d;
        if (c6592e7 != null) {
            this.f60287m -= c6592e7.f60349W[i10 + 1].f();
        }
        this.f60277c = c6592e;
        if (this.f60290p == 0 && this.f60291q) {
            this.f60279e = c6592e;
        } else {
            this.f60279e = this.f60275a;
        }
        this.f60294t = this.f60293s && this.f60292r;
    }

    private static boolean c(C6592e c6592e, int i10) {
        if (c6592e.U() == 8 || c6592e.f60352Z[i10] != C6592e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = c6592e.f60401y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f60296v) {
            b();
        }
        this.f60296v = true;
    }
}
