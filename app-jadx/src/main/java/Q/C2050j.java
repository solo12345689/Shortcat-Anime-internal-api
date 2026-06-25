package Q;

import Q.C2051k;
import U0.T0;
import g1.EnumC4829i;

/* JADX INFO: renamed from: Q.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2050j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f14129g = T0.f18773g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T0 f14135f;

    public C2050j(long j10, int i10, int i11, int i12, int i13, T0 t02) {
        this.f14130a = j10;
        this.f14131b = i10;
        this.f14132c = i11;
        this.f14133d = i12;
        this.f14134e = i13;
        this.f14135f = t02;
    }

    private final EnumC4829i b() {
        return x.b(this.f14135f, this.f14133d);
    }

    private final EnumC4829i j() {
        return x.b(this.f14135f, this.f14132c);
    }

    public final C2051k.a a(int i10) {
        return new C2051k.a(x.b(this.f14135f, i10), i10, this.f14130a);
    }

    public final String c() {
        return this.f14135f.l().j().j();
    }

    public final EnumC2045e d() {
        int i10 = this.f14132c;
        int i11 = this.f14133d;
        return i10 < i11 ? EnumC2045e.NOT_CROSSED : i10 > i11 ? EnumC2045e.CROSSED : EnumC2045e.COLLAPSED;
    }

    public final int e() {
        return this.f14133d;
    }

    public final int f() {
        return this.f14134e;
    }

    public final int g() {
        return this.f14132c;
    }

    public final long h() {
        return this.f14130a;
    }

    public final int i() {
        return this.f14131b;
    }

    public final T0 k() {
        return this.f14135f;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(C2050j c2050j) {
        return (this.f14130a == c2050j.f14130a && this.f14132c == c2050j.f14132c && this.f14133d == c2050j.f14133d) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.f14130a + ", range=(" + this.f14132c + '-' + j() + ',' + this.f14133d + '-' + b() + "), prevOffset=" + this.f14134e + ')';
    }
}
