package P;

import K.I;
import P.c;
import Td.L;
import U0.AbstractC2238z;
import U0.C2197e;
import U0.C2215n;
import U0.C2221q;
import U0.InterfaceC2230v;
import U0.InterfaceC2236y;
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
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a */
    private String f13210a;

    /* JADX INFO: renamed from: b */
    private Y0 f13211b;

    /* JADX INFO: renamed from: c */
    private AbstractC2485u.b f13212c;

    /* JADX INFO: renamed from: d */
    private int f13213d;

    /* JADX INFO: renamed from: e */
    private boolean f13214e;

    /* JADX INFO: renamed from: f */
    private int f13215f;

    /* JADX INFO: renamed from: g */
    private int f13216g;

    /* JADX INFO: renamed from: h */
    private long f13217h;

    /* JADX INFO: renamed from: i */
    private InterfaceC5011d f13218i;

    /* JADX INFO: renamed from: j */
    private InterfaceC2230v f13219j;

    /* JADX INFO: renamed from: k */
    private boolean f13220k;

    /* JADX INFO: renamed from: l */
    private long f13221l;

    /* JADX INFO: renamed from: m */
    private c f13222m;

    /* JADX INFO: renamed from: n */
    private InterfaceC2236y f13223n;

    /* JADX INFO: renamed from: o */
    private EnumC5027t f13224o;

    /* JADX INFO: renamed from: p */
    private long f13225p;

    /* JADX INFO: renamed from: q */
    private int f13226q;

    /* JADX INFO: renamed from: r */
    private int f13227r;

    public /* synthetic */ f(String str, Y0 y02, AbstractC2485u.b bVar, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y02, bVar, i10, z10, i11, i12);
    }

    private final InterfaceC2230v g(long j10, EnumC5027t enumC5027t) {
        InterfaceC2236y interfaceC2236yN = n(enumC5027t);
        long jA = b.a(j10, this.f13214e, this.f13213d, interfaceC2236yN.d());
        int iB = b.b(this.f13214e, this.f13213d, this.f13215f);
        v.g(this.f13213d, v.f47323a.b());
        return d1.g.a(interfaceC2236yN, iB, v.g(iB.f13213d, v.f47323a.b()) ? v.f47323a.b() : v.f47323a.a(), jA);
    }

    private final void i() {
        this.f13219j = null;
        this.f13223n = null;
        this.f13224o = null;
        this.f13226q = -1;
        this.f13227r = -1;
        this.f13225p = C5009b.f48540b.c(0, 0);
        this.f13221l = AbstractC5026s.a(0, 0);
        this.f13220k = false;
    }

    private final boolean l(long j10, EnumC5027t enumC5027t) {
        InterfaceC2236y interfaceC2236y;
        InterfaceC2230v interfaceC2230v = this.f13219j;
        if (interfaceC2230v == null || (interfaceC2236y = this.f13223n) == null || interfaceC2236y.a() || enumC5027t != this.f13224o) {
            return true;
        }
        if (C5009b.f(j10, this.f13225p)) {
            return false;
        }
        return C5009b.l(j10) != C5009b.l(this.f13225p) || ((float) C5009b.k(j10)) < interfaceC2230v.getHeight() || interfaceC2230v.r();
    }

    private final InterfaceC2236y n(EnumC5027t enumC5027t) {
        InterfaceC2236y interfaceC2236yC = this.f13223n;
        if (interfaceC2236yC == null || enumC5027t != this.f13224o || interfaceC2236yC.a()) {
            this.f13224o = enumC5027t;
            String str = this.f13210a;
            Y0 y0D = Z0.d(this.f13211b, enumC5027t);
            InterfaceC5011d interfaceC5011d = this.f13218i;
            AbstractC5504s.e(interfaceC5011d);
            interfaceC2236yC = AbstractC2238z.c(str, y0D, null, null, interfaceC5011d, this.f13212c, 12, null);
        }
        this.f13223n = interfaceC2236yC;
        return interfaceC2236yC;
    }

    public final InterfaceC5011d a() {
        return this.f13218i;
    }

    public final boolean b() {
        return this.f13220k;
    }

    public final long c() {
        return this.f13221l;
    }

    public final L d() {
        InterfaceC2236y interfaceC2236y = this.f13223n;
        if (interfaceC2236y != null) {
            interfaceC2236y.a();
        }
        return L.f17438a;
    }

    public final InterfaceC2230v e() {
        return this.f13219j;
    }

    public final int f(int i10, EnumC5027t enumC5027t) {
        int i11 = this.f13226q;
        int i12 = this.f13227r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iA = I.a(g(AbstractC5010c.a(0, i10, 0, Integer.MAX_VALUE), enumC5027t).getHeight());
        this.f13226q = i10;
        this.f13227r = iA;
        return iA;
    }

    public final boolean h(long j10, EnumC5027t enumC5027t) {
        EnumC5027t enumC5027t2;
        boolean z10 = true;
        if (this.f13216g > 1) {
            c.a aVar = c.f13182h;
            c cVar = this.f13222m;
            Y0 y02 = this.f13211b;
            InterfaceC5011d interfaceC5011d = this.f13218i;
            AbstractC5504s.e(interfaceC5011d);
            enumC5027t2 = enumC5027t;
            c cVarA = aVar.a(cVar, enumC5027t2, y02, interfaceC5011d, this.f13212c);
            this.f13222m = cVarA;
            j10 = cVarA.c(j10, this.f13216g);
        } else {
            enumC5027t2 = enumC5027t;
        }
        boolean z11 = false;
        if (l(j10, enumC5027t2)) {
            InterfaceC2230v interfaceC2230vG = g(j10, enumC5027t2);
            this.f13225p = j10;
            this.f13221l = AbstractC5010c.d(j10, AbstractC5026s.a(I.a(interfaceC2230vG.getWidth()), I.a(interfaceC2230vG.getHeight())));
            if (!v.g(this.f13213d, v.f47323a.e()) && (C5025r.g(r9) < interfaceC2230vG.getWidth() || C5025r.f(r9) < interfaceC2230vG.getHeight())) {
                z11 = true;
            }
            this.f13220k = z11;
            this.f13219j = interfaceC2230vG;
            return true;
        }
        if (!C5009b.f(j10, this.f13225p)) {
            InterfaceC2230v interfaceC2230v = this.f13219j;
            AbstractC5504s.e(interfaceC2230v);
            this.f13221l = AbstractC5010c.d(j10, AbstractC5026s.a(I.a(Math.min(interfaceC2230v.d(), interfaceC2230v.getWidth())), I.a(interfaceC2230v.getHeight())));
            if (v.g(this.f13213d, v.f47323a.e()) || (C5025r.g(r2) >= interfaceC2230v.getWidth() && C5025r.f(r2) >= interfaceC2230v.getHeight())) {
                z10 = false;
            }
            this.f13220k = z10;
            this.f13225p = j10;
        }
        return false;
    }

    public final int j(EnumC5027t enumC5027t) {
        return I.a(n(enumC5027t).d());
    }

    public final int k(EnumC5027t enumC5027t) {
        return I.a(n(enumC5027t).f());
    }

    public final void m(InterfaceC5011d interfaceC5011d) {
        InterfaceC5011d interfaceC5011d2 = this.f13218i;
        long jD = interfaceC5011d != null ? a.d(interfaceC5011d) : a.f13180a.a();
        if (interfaceC5011d2 == null) {
            this.f13218i = interfaceC5011d;
            this.f13217h = jD;
        } else if (interfaceC5011d == null || !a.e(this.f13217h, jD)) {
            this.f13218i = interfaceC5011d;
            this.f13217h = jD;
            i();
        }
    }

    public final T0 o(Y0 y02) {
        InterfaceC5011d interfaceC5011d;
        EnumC5027t enumC5027t = this.f13224o;
        if (enumC5027t == null || (interfaceC5011d = this.f13218i) == null) {
            return null;
        }
        C2197e c2197e = new C2197e(this.f13210a, null, null, 6, null);
        if (this.f13219j == null || this.f13223n == null) {
            return null;
        }
        long jD = C5009b.d(this.f13225p, 0, 0, 0, 0, 10, null);
        return new T0(new S0(c2197e, y02, AbstractC2279u.m(), this.f13215f, this.f13214e, this.f13213d, interfaceC5011d, enumC5027t, this.f13212c, jD, (DefaultConstructorMarker) null), new C2215n(new C2221q(c2197e, y02, AbstractC2279u.m(), interfaceC5011d, this.f13212c), jD, this.f13215f, v.g(this.f13213d, v.f47323a.b()), (DefaultConstructorMarker) null), this.f13221l, null);
    }

    public final void p(String str, Y0 y02, AbstractC2485u.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f13210a = str;
        this.f13211b = y02;
        this.f13212c = bVar;
        this.f13213d = i10;
        this.f13214e = z10;
        this.f13215f = i11;
        this.f13216g = i12;
        i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f13219j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.h(this.f13217h));
        sb2.append(')');
        return sb2.toString();
    }

    private f(String str, Y0 y02, AbstractC2485u.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f13210a = str;
        this.f13211b = y02;
        this.f13212c = bVar;
        this.f13213d = i10;
        this.f13214e = z10;
        this.f13215f = i11;
        this.f13216g = i12;
        this.f13217h = a.f13180a.a();
        this.f13221l = AbstractC5026s.a(0, 0);
        this.f13225p = C5009b.f48540b.c(0, 0);
        this.f13226q = -1;
        this.f13227r = -1;
    }
}
