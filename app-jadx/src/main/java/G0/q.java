package g0;

import Td.L;
import Y.C2406f1;
import Y.C2456w1;
import Y.InterfaceC2413i;
import Y.InterfaceC2450u1;
import Y.InterfaceC2453v1;
import Y.g2;
import a0.C2507c;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import k0.InterfaceC5416f;
import t.C6550P;
import t.Q;
import t.d0;
import t.e0;
import t.f0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements InterfaceC2450u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set f47199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5416f f47200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2507c f47201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Q f47202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2507c f47203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2507c f47204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2507c f47205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Q f47206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C6550P f47207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f47208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e0 f47209k;

    public q() {
        C2507c c2507c = new C2507c(new C2456w1[16], 0);
        this.f47201c = c2507c;
        this.f47202d = f0.b();
        this.f47203e = c2507c;
        this.f47204f = new C2507c(new Object[16], 0);
        this.f47205g = new C2507c(new InterfaceC5082a[16], 0);
    }

    private final void l(C2507c c2507c) {
        Set set = this.f47199a;
        if (set == null) {
            return;
        }
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i10 = 0; i10 < iP; i10++) {
            C2456w1 c2456w1 = (C2456w1) objArr[i10];
            InterfaceC2453v1 interfaceC2453v1B = c2456w1.b();
            set.remove(interfaceC2453v1B);
            try {
                interfaceC2453v1B.c();
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                InterfaceC5416f interfaceC5416f = this.f47200b;
                if (interfaceC5416f != null) {
                    interfaceC5416f.a(th2, c2456w1);
                }
                throw th2;
            }
        }
    }

    private static final boolean p(C2456w1 c2456w1, C2507c c2507c) {
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i10 = 0; i10 < iP; i10++) {
            InterfaceC2453v1 interfaceC2453v1B = ((C2456w1) objArr[i10]).b();
            if (interfaceC2453v1B instanceof l) {
                C2507c c2507cA = ((l) interfaceC2453v1B).a();
                if (c2507cA.w(c2456w1) || p(c2456w1, c2507cA)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void s(Object obj) {
        this.f47204f.c(obj);
    }

    @Override // Y.InterfaceC2450u1
    public void a(C2456w1 c2456w1) {
        if (this.f47202d.a(c2456w1)) {
            this.f47202d.y(c2456w1);
            if (!this.f47203e.w(c2456w1) && !this.f47201c.w(c2456w1)) {
                p(c2456w1, this.f47201c);
            }
            Set set = this.f47199a;
            if (set == null) {
                return;
            } else {
                set.add(c2456w1.b());
            }
        }
        e0 e0Var = this.f47209k;
        if (e0Var == null || !e0Var.a(c2456w1)) {
            s(c2456w1);
        }
    }

    @Override // Y.InterfaceC2450u1
    public void b(InterfaceC2413i interfaceC2413i) {
        Q qB = this.f47206h;
        if (qB == null) {
            qB = f0.b();
            this.f47206h = qB;
        }
        qB.w(interfaceC2413i);
        s(interfaceC2413i);
    }

    @Override // Y.InterfaceC2450u1
    public void c(C2456w1 c2456w1) {
        this.f47203e.c(c2456w1);
        this.f47202d.h(c2456w1);
    }

    @Override // Y.InterfaceC2450u1
    public void d(InterfaceC2413i interfaceC2413i) {
        s(interfaceC2413i);
    }

    @Override // Y.InterfaceC2450u1
    public void e(C2406f1 c2406f1) {
        C6550P c6550p = this.f47207i;
        l lVar = c6550p != null ? (l) c6550p.e(c2406f1) : null;
        if (lVar != null) {
            ArrayList arrayListC = this.f47208j;
            if (arrayListC == null) {
                arrayListC = g2.c(null, 1, null);
                this.f47208j = arrayListC;
            }
            g2.j(arrayListC, this.f47203e);
            this.f47203e = lVar.a();
        }
    }

    @Override // Y.InterfaceC2450u1
    public void f(C2406f1 c2406f1) {
        Set set = this.f47199a;
        if (set == null) {
            return;
        }
        l lVar = new l(set);
        C6550P c6550pB = this.f47207i;
        if (c6550pB == null) {
            c6550pB = d0.b();
            this.f47207i = c6550pB;
        }
        c6550pB.x(c2406f1, lVar);
        this.f47203e.c(new C2456w1(lVar, null));
    }

    @Override // Y.InterfaceC2450u1
    public void g(InterfaceC5082a interfaceC5082a) {
        this.f47205g.c(interfaceC5082a);
    }

    @Override // Y.InterfaceC2450u1
    public void h(C2406f1 c2406f1) {
        C2507c c2507c;
        C6550P c6550p = this.f47207i;
        if (c6550p == null || ((l) c6550p.e(c2406f1)) == null) {
            return;
        }
        ArrayList arrayList = this.f47208j;
        if (arrayList != null && (c2507c = (C2507c) g2.i(arrayList)) != null) {
            this.f47203e = c2507c;
        }
        c6550p.u(c2406f1);
    }

    public final void i() {
        this.f47199a = null;
        this.f47200b = null;
        this.f47201c.i();
        this.f47202d.m();
        this.f47203e = this.f47201c;
        this.f47204f.i();
        this.f47205g.i();
        this.f47206h = null;
        this.f47207i = null;
        this.f47208j = null;
    }

    public final void j() {
        Set set = this.f47199a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objA = x.f47218a.a("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC2453v1 interfaceC2453v1 = (InterfaceC2453v1) it.next();
                it.remove();
                interfaceC2453v1.d();
            }
            L l10 = L.f17438a;
            x.f47218a.b(objA);
        } catch (Throwable th2) {
            x.f47218a.b(objA);
            throw th2;
        }
    }

    public final void k(InterfaceC2413i interfaceC2413i) {
        if (this.f47204f.w(interfaceC2413i)) {
            interfaceC2413i.h();
        }
    }

    public final void m() {
        Object objA;
        Set set = this.f47199a;
        if (set == null) {
            return;
        }
        this.f47209k = null;
        if (this.f47204f.p() != 0) {
            objA = x.f47218a.a("Compose:onForgotten");
            try {
                Q q10 = this.f47206h;
                int iP = this.f47204f.p();
                while (true) {
                    iP--;
                    if (-1 >= iP) {
                        break;
                    }
                    Object obj = this.f47204f.f23496a[iP];
                    try {
                        if (obj instanceof C2456w1) {
                            InterfaceC2453v1 interfaceC2453v1B = ((C2456w1) obj).b();
                            set.remove(interfaceC2453v1B);
                            interfaceC2453v1B.e();
                        }
                        if (obj instanceof InterfaceC2413i) {
                            if (q10 == null || !q10.a(obj)) {
                                ((InterfaceC2413i) obj).h();
                            } else {
                                ((InterfaceC2413i) obj).a();
                            }
                        }
                        L l10 = L.f17438a;
                    } catch (Throwable th2) {
                        InterfaceC5416f interfaceC5416f = this.f47200b;
                        if (interfaceC5416f != null) {
                            interfaceC5416f.a(th2, obj);
                        }
                        throw th2;
                    }
                }
                L l11 = L.f17438a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f47201c.p() != 0) {
            x xVar = x.f47218a;
            objA = xVar.a("Compose:onRemembered");
            try {
                l(this.f47201c);
                L l12 = L.f17438a;
                xVar.b(objA);
            } finally {
                x.f47218a.b(objA);
            }
        }
    }

    public final void n() {
        if (this.f47205g.p() != 0) {
            Object objA = x.f47218a.a("Compose:sideeffects");
            try {
                C2507c c2507c = this.f47205g;
                Object[] objArr = c2507c.f23496a;
                int iP = c2507c.p();
                for (int i10 = 0; i10 < iP; i10++) {
                    ((InterfaceC5082a) objArr[i10]).invoke();
                }
                this.f47205g.i();
                L l10 = L.f17438a;
                x.f47218a.b(objA);
            } catch (Throwable th2) {
                x.f47218a.b(objA);
                throw th2;
            }
        }
    }

    public final e0 o() {
        if (!this.f47202d.e()) {
            return null;
        }
        Q q10 = this.f47202d;
        this.f47202d = f0.b();
        this.f47201c.i();
        return q10;
    }

    public final void q(e0 e0Var) {
        this.f47209k = e0Var;
    }

    public final void r(Set set, InterfaceC5416f interfaceC5416f) {
        i();
        this.f47199a = set;
        this.f47200b = interfaceC5416f;
    }
}
