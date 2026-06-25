package P;

import K.I;
import P.c;
import U0.C2197e;
import U0.C2215n;
import U0.C2221q;
import U0.S0;
import U0.T0;
import U0.Y0;
import U0.Z0;
import Ud.AbstractC2279u;
import Y0.AbstractC2485u;
import g1.v;
import i1.AbstractC5010c;
import i1.AbstractC5026s;
import i1.C5009b;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2197e f13194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y0 f13195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC2485u.b f13196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f13200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f13201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f13202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f13203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC5011d f13204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C2221q f13205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private EnumC5027t f13206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private T0 f13207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f13208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f13209p;

    public /* synthetic */ e(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, int i10, boolean z10, int i11, int i12, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, y02, bVar, i10, z10, i11, i12, list);
    }

    private final C2215n e(long j10, EnumC5027t enumC5027t) {
        C2221q c2221qL = l(enumC5027t);
        return new C2215n(c2221qL, b.a(j10, this.f13198e, this.f13197d, c2221qL.d()), b.b(this.f13198e, this.f13197d, this.f13199f), v.g(this.f13197d, v.f47323a.b()), (DefaultConstructorMarker) null);
    }

    private final void g() {
        this.f13205l = null;
        this.f13207n = null;
        this.f13209p = -1;
        this.f13208o = -1;
    }

    private final boolean j(T0 t02, long j10, EnumC5027t enumC5027t) {
        if (t02 == null || t02.w().m().a() || enumC5027t != t02.l().d()) {
            return true;
        }
        if (C5009b.f(j10, t02.l().a())) {
            return false;
        }
        return C5009b.l(j10) != C5009b.l(t02.l().a()) || ((float) C5009b.k(j10)) < t02.w().k() || t02.w().i();
    }

    private final C2221q l(EnumC5027t enumC5027t) {
        C2221q c2221q = this.f13205l;
        if (c2221q == null || enumC5027t != this.f13206m || c2221q.a()) {
            this.f13206m = enumC5027t;
            C2197e c2197e = this.f13194a;
            Y0 y0D = Z0.d(this.f13195b, enumC5027t);
            InterfaceC5011d interfaceC5011d = this.f13204k;
            AbstractC5504s.e(interfaceC5011d);
            AbstractC2485u.b bVar = this.f13196c;
            List listM = this.f13201h;
            if (listM == null) {
                listM = AbstractC2279u.m();
            }
            c2221q = new C2221q(c2197e, y0D, listM, interfaceC5011d, bVar);
        }
        this.f13205l = c2221q;
        return c2221q;
    }

    private final T0 m(EnumC5027t enumC5027t, long j10, C2215n c2215n) {
        float fMin = Math.min(c2215n.m().d(), c2215n.E());
        C2197e c2197e = this.f13194a;
        Y0 y02 = this.f13195b;
        List listM = this.f13201h;
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        int i10 = this.f13199f;
        boolean z10 = this.f13198e;
        int i11 = this.f13197d;
        InterfaceC5011d interfaceC5011d = this.f13204k;
        AbstractC5504s.e(interfaceC5011d);
        return new T0(new S0(c2197e, y02, listM, i10, z10, i11, interfaceC5011d, enumC5027t, this.f13196c, j10, (DefaultConstructorMarker) null), c2215n, AbstractC5010c.d(j10, AbstractC5026s.a(I.a(fMin), I.a(c2215n.k()))), null);
    }

    public final InterfaceC5011d a() {
        return this.f13204k;
    }

    public final T0 b() {
        return this.f13207n;
    }

    public final T0 c() {
        T0 t02 = this.f13207n;
        if (t02 != null) {
            return t02;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i10, EnumC5027t enumC5027t) {
        int i11 = this.f13208o;
        int i12 = this.f13209p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iA = I.a(e(AbstractC5010c.a(0, i10, 0, Integer.MAX_VALUE), enumC5027t).k());
        this.f13208o = i10;
        this.f13209p = iA;
        return iA;
    }

    public final boolean f(long j10, EnumC5027t enumC5027t) {
        EnumC5027t enumC5027t2;
        if (this.f13200g > 1) {
            c.a aVar = c.f13182h;
            c cVar = this.f13202i;
            Y0 y02 = this.f13195b;
            InterfaceC5011d interfaceC5011d = this.f13204k;
            AbstractC5504s.e(interfaceC5011d);
            enumC5027t2 = enumC5027t;
            c cVarA = aVar.a(cVar, enumC5027t2, y02, interfaceC5011d, this.f13196c);
            this.f13202i = cVarA;
            j10 = cVarA.c(j10, this.f13200g);
        } else {
            enumC5027t2 = enumC5027t;
        }
        if (j(this.f13207n, j10, enumC5027t2)) {
            this.f13207n = m(enumC5027t2, j10, e(j10, enumC5027t2));
            return true;
        }
        T0 t02 = this.f13207n;
        AbstractC5504s.e(t02);
        if (C5009b.f(j10, t02.l().a())) {
            return false;
        }
        T0 t03 = this.f13207n;
        AbstractC5504s.e(t03);
        this.f13207n = m(enumC5027t2, j10, t03.w());
        return true;
    }

    public final int h(EnumC5027t enumC5027t) {
        return I.a(l(enumC5027t).d());
    }

    public final int i(EnumC5027t enumC5027t) {
        return I.a(l(enumC5027t).f());
    }

    public final void k(InterfaceC5011d interfaceC5011d) {
        InterfaceC5011d interfaceC5011d2 = this.f13204k;
        long jD = interfaceC5011d != null ? a.d(interfaceC5011d) : a.f13180a.a();
        if (interfaceC5011d2 == null) {
            this.f13204k = interfaceC5011d;
            this.f13203j = jD;
        } else if (interfaceC5011d == null || !a.e(this.f13203j, jD)) {
            this.f13204k = interfaceC5011d;
            this.f13203j = jD;
            g();
        }
    }

    public final void n(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f13194a = c2197e;
        this.f13195b = y02;
        this.f13196c = bVar;
        this.f13197d = i10;
        this.f13198e = z10;
        this.f13199f = i11;
        this.f13200g = i12;
        this.f13201h = list;
        g();
    }

    private e(C2197e c2197e, Y0 y02, AbstractC2485u.b bVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f13194a = c2197e;
        this.f13195b = y02;
        this.f13196c = bVar;
        this.f13197d = i10;
        this.f13198e = z10;
        this.f13199f = i11;
        this.f13200g = i12;
        this.f13201h = list;
        this.f13203j = a.f13180a.a();
        this.f13208o = -1;
        this.f13209p = -1;
    }
}
