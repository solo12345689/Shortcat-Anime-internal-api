package G;

import Gf.O;
import Ud.AbstractC2279u;
import i1.AbstractC5026s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements n, I0.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z.q f6947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f6950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f6951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1591e f6952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1591e f6953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f6955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f6956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final A.k f6957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f6958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f6959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f6960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final O f6961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ I0.C f6962t;

    public u(List list, int i10, int i11, int i12, z.q qVar, int i13, int i14, boolean z10, int i15, C1591e c1591e, C1591e c1591e2, float f10, int i16, boolean z11, A.k kVar, I0.C c10, boolean z12, List list2, List list3, O o10) {
        this.f6943a = list;
        this.f6944b = i10;
        this.f6945c = i11;
        this.f6946d = i12;
        this.f6947e = qVar;
        this.f6948f = i13;
        this.f6949g = i14;
        this.f6950h = z10;
        this.f6951i = i15;
        this.f6952j = c1591e;
        this.f6953k = c1591e2;
        this.f6954l = f10;
        this.f6955m = i16;
        this.f6956n = z11;
        this.f6957o = kVar;
        this.f6958p = z12;
        this.f6959q = list2;
        this.f6960r = list3;
        this.f6961s = o10;
        this.f6962t = c10;
    }

    @Override // I0.C
    public void A() {
        this.f6962t.A();
    }

    @Override // I0.C
    public Function1 B() {
        return this.f6962t.B();
    }

    @Override // G.n
    public z.q a() {
        return this.f6947e;
    }

    @Override // G.n
    public long b() {
        return AbstractC5026s.a(getWidth(), getHeight());
    }

    @Override // G.n
    public int c() {
        return this.f6946d;
    }

    @Override // G.n
    public int d() {
        return this.f6949g;
    }

    @Override // G.n
    public int e() {
        return -f();
    }

    @Override // G.n
    public int f() {
        return this.f6948f;
    }

    @Override // G.n
    public boolean g() {
        return this.f6950h;
    }

    @Override // I0.C
    public int getHeight() {
        return this.f6962t.getHeight();
    }

    @Override // I0.C
    public int getWidth() {
        return this.f6962t.getWidth();
    }

    @Override // G.n
    public int h() {
        return this.f6944b;
    }

    @Override // G.n
    public List i() {
        return this.f6943a;
    }

    @Override // G.n
    public int j() {
        return this.f6945c;
    }

    @Override // G.n
    public int k() {
        return this.f6951i;
    }

    @Override // G.n
    public A.k l() {
        return this.f6957o;
    }

    public final boolean m() {
        C1591e c1591e = this.f6952j;
        return ((c1591e != null ? c1591e.getIndex() : 0) == 0 && this.f6955m == 0) ? false : true;
    }

    public final boolean n() {
        return this.f6956n;
    }

    public final C1591e o() {
        return this.f6953k;
    }

    public final float p() {
        return this.f6954l;
    }

    public final C1591e q() {
        return this.f6952j;
    }

    public final int r() {
        return this.f6955m;
    }

    public final boolean s(int i10) {
        int i11;
        int iH = h() + j();
        if (!this.f6958p && !i().isEmpty() && this.f6952j != null && (i11 = this.f6955m - i10) >= 0 && i11 < iH) {
            float f10 = iH != 0 ? i10 / iH : 0.0f;
            float f11 = this.f6954l - f10;
            if (this.f6953k != null && f11 < 0.5f && f11 > -0.5f) {
                C1591e c1591e = (C1591e) AbstractC2279u.m0(i());
                C1591e c1591e2 = (C1591e) AbstractC2279u.y0(i());
                if (i10 >= 0 ? Math.min(f() - c1591e.getOffset(), d() - c1591e2.getOffset()) > i10 : Math.min((c1591e.getOffset() + iH) - f(), (c1591e2.getOffset() + iH) - d()) > (-i10)) {
                    this.f6954l -= f10;
                    this.f6955m -= i10;
                    List listI = i();
                    int size = listI.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((C1591e) listI.get(i12)).a(i10);
                    }
                    List list = this.f6959q;
                    int size2 = list.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        ((C1591e) list.get(i13)).a(i10);
                    }
                    List list2 = this.f6960r;
                    int size3 = list2.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        ((C1591e) list2.get(i14)).a(i10);
                    }
                    if (!this.f6956n && i10 > 0) {
                        this.f6956n = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // I0.C
    public Map z() {
        return this.f6962t.z();
    }

    public /* synthetic */ u(List list, int i10, int i11, int i12, z.q qVar, int i13, int i14, boolean z10, int i15, C1591e c1591e, C1591e c1591e2, float f10, int i16, boolean z11, A.k kVar, I0.C c10, boolean z12, List list2, List list3, O o10, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i10, i11, i12, qVar, i13, i14, z10, i15, c1591e, c1591e2, f10, i16, z11, kVar, c10, z12, (i17 & 131072) != 0 ? AbstractC2279u.m() : list2, (i17 & 262144) != 0 ? AbstractC2279u.m() : list3, o10);
    }
}
