package E;

import Gf.O;
import Ud.AbstractC2279u;
import i1.AbstractC5026s;
import i1.InterfaceC5011d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements s, I0.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f3964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f3967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f3968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O f3969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC5011d f3970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Function1 f3972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f3973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f3974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f3975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f3976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f3977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z.q f3978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f3979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f3980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ I0.C f3981r;

    public u(x xVar, int i10, boolean z10, float f10, I0.C c10, boolean z11, O o10, InterfaceC5011d interfaceC5011d, int i11, Function1 function1, List list, int i12, int i13, int i14, boolean z12, z.q qVar, int i15, int i16) {
        this.f3964a = xVar;
        this.f3965b = i10;
        this.f3966c = z10;
        this.f3967d = f10;
        this.f3968e = z11;
        this.f3969f = o10;
        this.f3970g = interfaceC5011d;
        this.f3971h = i11;
        this.f3972i = function1;
        this.f3973j = list;
        this.f3974k = i12;
        this.f3975l = i13;
        this.f3976m = i14;
        this.f3977n = z12;
        this.f3978o = qVar;
        this.f3979p = i15;
        this.f3980q = i16;
        this.f3981r = c10;
    }

    @Override // I0.C
    public void A() {
        this.f3981r.A();
    }

    @Override // I0.C
    public Function1 B() {
        return this.f3981r.B();
    }

    @Override // E.s
    public z.q a() {
        return this.f3978o;
    }

    @Override // E.s
    public long b() {
        return AbstractC5026s.a(getWidth(), getHeight());
    }

    @Override // E.s
    public int c() {
        return this.f3979p;
    }

    @Override // E.s
    public int d() {
        return this.f3975l;
    }

    @Override // E.s
    public int e() {
        return -f();
    }

    @Override // E.s
    public int f() {
        return this.f3974k;
    }

    @Override // E.s
    public int g() {
        return this.f3976m;
    }

    @Override // I0.C
    public int getHeight() {
        return this.f3981r.getHeight();
    }

    @Override // I0.C
    public int getWidth() {
        return this.f3981r.getWidth();
    }

    @Override // E.s
    public int h() {
        return this.f3980q;
    }

    @Override // E.s
    public List i() {
        return this.f3973j;
    }

    public final boolean j() {
        x xVar = this.f3964a;
        return ((xVar != null ? xVar.a() : 0) == 0 && this.f3965b == 0) ? false : true;
    }

    public final boolean k() {
        return this.f3966c;
    }

    public final float l() {
        return this.f3967d;
    }

    public final x m() {
        return this.f3964a;
    }

    public final int n() {
        return this.f3965b;
    }

    public final Function1 o() {
        return this.f3972i;
    }

    public final int p() {
        return this.f3971h;
    }

    public final boolean q(int i10) {
        x xVar;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (!this.f3968e && !i().isEmpty() && (xVar = this.f3964a) != null) {
            int iD = xVar.d();
            int i11 = this.f3965b - i10;
            if (i11 >= 0 && i11 < iD) {
                v vVar = (v) AbstractC2279u.m0(i());
                v vVar2 = (v) AbstractC2279u.y0(i());
                if (!vVar.r() && !vVar2.r() && (i10 >= 0 ? Math.min(f() - A.e.a(vVar, a()), d() - A.e.a(vVar2, a())) > i10 : Math.min((A.e.a(vVar, a()) + vVar.l()) - f(), (A.e.a(vVar2, a()) + vVar2.l()) - d()) > (-i10))) {
                    this.f3965b -= i10;
                    List listI = i();
                    int size = listI.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((v) listI.get(i12)).d(i10);
                    }
                    this.f3967d = i10;
                    z10 = true;
                    z10 = true;
                    z10 = true;
                    if (!this.f3966c && i10 > 0) {
                        this.f3966c = true;
                    }
                }
            }
        }
        return z10;
    }

    @Override // I0.C
    public Map z() {
        return this.f3981r.z();
    }
}
