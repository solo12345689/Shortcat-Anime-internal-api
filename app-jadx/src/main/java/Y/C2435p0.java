package Y;

import Gf.AbstractC1617k;
import Gf.L;
import Zd.i;
import k0.C5418h;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Y.p0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2435p0 implements InterfaceC2453v1, Gf.L {

    /* JADX INFO: renamed from: a */
    private final Zd.i f22463a;

    /* JADX INFO: renamed from: b */
    private final Function2 f22464b;

    /* JADX INFO: renamed from: c */
    private final Gf.O f22465c;

    /* JADX INFO: renamed from: d */
    private Gf.C0 f22466d;

    public C2435p0(Zd.i iVar, Function2 function2) {
        this.f22463a = iVar;
        this.f22464b = function2;
        this.f22465c = Gf.P.a(iVar.w(iVar.l(C5418h.f51976b) != null ? this : Zd.j.f23275a));
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return L.a.c(this, cVar);
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
        Gf.C0 c02 = this.f22466d;
        if (c02 != null) {
            Gf.G0.e(c02, "Old job was still running!", null, 2, null);
        }
        this.f22466d = AbstractC1617k.d(this.f22465c, null, null, this.f22464b, 3, null);
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
        Gf.C0 c02 = this.f22466d;
        if (c02 != null) {
            c02.k(new C2440r0());
        }
        this.f22466d = null;
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        Gf.C0 c02 = this.f22466d;
        if (c02 != null) {
            c02.k(new C2440r0());
        }
        this.f22466d = null;
    }

    @Override // Zd.i.b
    public i.c getKey() {
        return Gf.L.f7522J;
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return L.a.b(this, cVar);
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return L.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return L.a.a(this, obj, function2);
    }

    @Override // Gf.L
    public void z(Zd.i iVar, Throwable th2) throws Throwable {
        C5418h c5418h = (C5418h) iVar.l(C5418h.f51976b);
        if (c5418h != null) {
            c5418h.a(th2, this);
        }
        Gf.L l10 = (Gf.L) this.f22463a.l(Gf.L.f7522J);
        if (l10 == null) {
            throw th2;
        }
        l10.z(iVar, th2);
    }
}
