package x3;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f63853e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f63859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f63860l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f63863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f63864p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C7050b f63866r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f63868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f63869u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63854f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63855g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63856h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63857i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f63858j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f63861m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f63862n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f63865q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f63867s = Float.MAX_VALUE;

    private g t(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f63851c && gVar.f63851c) {
                z(gVar.f63850b);
            }
            if (this.f63856h == -1) {
                this.f63856h = gVar.f63856h;
            }
            if (this.f63857i == -1) {
                this.f63857i = gVar.f63857i;
            }
            if (this.f63849a == null && (str = gVar.f63849a) != null) {
                this.f63849a = str;
            }
            if (this.f63854f == -1) {
                this.f63854f = gVar.f63854f;
            }
            if (this.f63855g == -1) {
                this.f63855g = gVar.f63855g;
            }
            if (this.f63862n == -1) {
                this.f63862n = gVar.f63862n;
            }
            if (this.f63863o == null && (alignment2 = gVar.f63863o) != null) {
                this.f63863o = alignment2;
            }
            if (this.f63864p == null && (alignment = gVar.f63864p) != null) {
                this.f63864p = alignment;
            }
            if (this.f63865q == -1) {
                this.f63865q = gVar.f63865q;
            }
            if (this.f63858j == -1) {
                this.f63858j = gVar.f63858j;
                this.f63859k = gVar.f63859k;
            }
            if (this.f63866r == null) {
                this.f63866r = gVar.f63866r;
            }
            if (this.f63867s == Float.MAX_VALUE) {
                this.f63867s = gVar.f63867s;
            }
            if (this.f63868t == null) {
                this.f63868t = gVar.f63868t;
            }
            if (this.f63869u == null) {
                this.f63869u = gVar.f63869u;
            }
            if (z10 && !this.f63853e && gVar.f63853e) {
                w(gVar.f63852d);
            }
            if (z10 && this.f63861m == -1 && (i10 = gVar.f63861m) != -1) {
                this.f63861m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f63849a = str;
        return this;
    }

    public g B(float f10) {
        this.f63859k = f10;
        return this;
    }

    public g C(int i10) {
        this.f63858j = i10;
        return this;
    }

    public g D(String str) {
        this.f63860l = str;
        return this;
    }

    public g E(boolean z10) {
        this.f63857i = z10 ? 1 : 0;
        return this;
    }

    public g F(boolean z10) {
        this.f63854f = z10 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f63864p = alignment;
        return this;
    }

    public g H(String str) {
        this.f63868t = str;
        return this;
    }

    public g I(int i10) {
        this.f63862n = i10;
        return this;
    }

    public g J(int i10) {
        this.f63861m = i10;
        return this;
    }

    public g K(float f10) {
        this.f63867s = f10;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f63863o = alignment;
        return this;
    }

    public g M(boolean z10) {
        this.f63865q = z10 ? 1 : 0;
        return this;
    }

    public g N(C7050b c7050b) {
        this.f63866r = c7050b;
        return this;
    }

    public g O(boolean z10) {
        this.f63855g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f63853e) {
            return this.f63852d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f63869u;
    }

    public int d() {
        if (this.f63851c) {
            return this.f63850b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f63849a;
    }

    public float f() {
        return this.f63859k;
    }

    public int g() {
        return this.f63858j;
    }

    public String h() {
        return this.f63860l;
    }

    public Layout.Alignment i() {
        return this.f63864p;
    }

    public String j() {
        return this.f63868t;
    }

    public int k() {
        return this.f63862n;
    }

    public int l() {
        return this.f63861m;
    }

    public float m() {
        return this.f63867s;
    }

    public int n() {
        int i10 = this.f63856h;
        if (i10 == -1 && this.f63857i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f63857i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f63863o;
    }

    public boolean p() {
        return this.f63865q == 1;
    }

    public C7050b q() {
        return this.f63866r;
    }

    public boolean r() {
        return this.f63853e;
    }

    public boolean s() {
        return this.f63851c;
    }

    public boolean u() {
        return this.f63854f == 1;
    }

    public boolean v() {
        return this.f63855g == 1;
    }

    public g w(int i10) {
        this.f63852d = i10;
        this.f63853e = true;
        return this;
    }

    public g x(boolean z10) {
        this.f63856h = z10 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f63869u = str;
        return this;
    }

    public g z(int i10) {
        this.f63850b = i10;
        this.f63851c = true;
        return this;
    }
}
