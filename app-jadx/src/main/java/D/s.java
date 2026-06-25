package D;

import Gf.O;
import Ud.AbstractC2279u;
import i1.AbstractC5026s;
import i1.InterfaceC5011d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements q, I0.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f3454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f3457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f3458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O f3460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC5011d f3461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f3462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f3463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f3464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f3465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f3466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f3467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z.q f3468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f3469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f3470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ I0.C f3471r;

    public /* synthetic */ s(t tVar, int i10, boolean z10, float f10, I0.C c10, float f11, boolean z11, O o10, InterfaceC5011d interfaceC5011d, long j10, List list, int i11, int i12, int i13, boolean z12, z.q qVar, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, i10, z10, f10, c10, f11, z11, o10, interfaceC5011d, j10, list, i11, i12, i13, z12, qVar, i14, i15);
    }

    @Override // I0.C
    public void A() {
        this.f3471r.A();
    }

    @Override // I0.C
    public Function1 B() {
        return this.f3471r.B();
    }

    @Override // D.q
    public z.q a() {
        return this.f3468o;
    }

    @Override // D.q
    public long b() {
        return AbstractC5026s.a(getWidth(), getHeight());
    }

    @Override // D.q
    public int c() {
        return this.f3469p;
    }

    @Override // D.q
    public int d() {
        return this.f3465l;
    }

    @Override // D.q
    public int e() {
        return -f();
    }

    @Override // D.q
    public int f() {
        return this.f3464k;
    }

    @Override // D.q
    public int g() {
        return this.f3466m;
    }

    @Override // I0.C
    public int getHeight() {
        return this.f3471r.getHeight();
    }

    @Override // I0.C
    public int getWidth() {
        return this.f3471r.getWidth();
    }

    @Override // D.q
    public int h() {
        return this.f3470q;
    }

    @Override // D.q
    public List i() {
        return this.f3463j;
    }

    public final boolean j() {
        t tVar = this.f3454a;
        return ((tVar != null ? tVar.getIndex() : 0) == 0 && this.f3455b == 0) ? false : true;
    }

    public final boolean k() {
        return this.f3456c;
    }

    public final long l() {
        return this.f3462i;
    }

    public final float m() {
        return this.f3457d;
    }

    public final O n() {
        return this.f3460g;
    }

    public final InterfaceC5011d o() {
        return this.f3461h;
    }

    public final t p() {
        return this.f3454a;
    }

    public final int q() {
        return this.f3455b;
    }

    public final float r() {
        return this.f3458e;
    }

    public final boolean s(int i10, boolean z10) {
        t tVar;
        if (!this.f3459f && !i().isEmpty() && (tVar = this.f3454a) != null) {
            int iL = tVar.l();
            int i11 = this.f3455b - i10;
            if (i11 >= 0 && i11 < iL) {
                t tVar2 = (t) AbstractC2279u.m0(i());
                t tVar3 = (t) AbstractC2279u.y0(i());
                if (!tVar2.e() && !tVar3.e() && (i10 >= 0 ? Math.min(f() - tVar2.getOffset(), d() - tVar3.getOffset()) > i10 : Math.min((tVar2.getOffset() + tVar2.l()) - f(), (tVar3.getOffset() + tVar3.l()) - d()) > (-i10))) {
                    this.f3455b -= i10;
                    List listI = i();
                    int size = listI.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((t) listI.get(i12)).a(i10, z10);
                    }
                    this.f3457d = i10;
                    if (!this.f3456c && i10 > 0) {
                        this.f3456c = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // I0.C
    public Map z() {
        return this.f3471r.z();
    }

    private s(t tVar, int i10, boolean z10, float f10, I0.C c10, float f11, boolean z11, O o10, InterfaceC5011d interfaceC5011d, long j10, List list, int i11, int i12, int i13, boolean z12, z.q qVar, int i14, int i15) {
        this.f3454a = tVar;
        this.f3455b = i10;
        this.f3456c = z10;
        this.f3457d = f10;
        this.f3458e = f11;
        this.f3459f = z11;
        this.f3460g = o10;
        this.f3461h = interfaceC5011d;
        this.f3462i = j10;
        this.f3463j = list;
        this.f3464k = i11;
        this.f3465l = i12;
        this.f3466m = i13;
        this.f3467n = z12;
        this.f3468o = qVar;
        this.f3469p = i14;
        this.f3470q = i15;
        this.f3471r = c10;
    }
}
