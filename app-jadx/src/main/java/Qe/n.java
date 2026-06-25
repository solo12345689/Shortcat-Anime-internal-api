package Qe;

import Re.a;
import Ud.AbstractC2279u;
import Ud.a0;
import java.util.Collection;
import java.util.Set;
import jf.InterfaceC5387k;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C5678i;
import mf.C5683n;
import mf.C5693y;
import of.M;
import ye.InterfaceC7227e;
import ye.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14883b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f14884c = a0.c(a.EnumC0265a.f15479e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f14885d = a0.h(a.EnumC0265a.f15480f, a.EnumC0265a.f15483i);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Ue.c f14886e = new Ue.c(1, 1, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Ue.c f14887f = new Ue.c(1, 1, 11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Ue.c f14888g = new Ue.c(1, 1, 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5683n f14889a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ue.c a() {
            return n.f14888g;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d() {
        return AbstractC2279u.m();
    }

    private final of.r e(x xVar) {
        return f().g().e() ? of.r.f55511a : xVar.d().j() ? of.r.f55512b : of.r.f55511a;
    }

    private final C5693y g(x xVar) {
        if (i() || xVar.d().d().h(h())) {
            return null;
        }
        return new C5693y(xVar.d().d(), Ue.c.f19575i, h(), h().k(xVar.d().d().j()), xVar.a(), xVar.g());
    }

    private final Ue.c h() {
        return f().g().d();
    }

    private final boolean i() {
        return f().g().f();
    }

    private final boolean j(x xVar) {
        return !f().g().b() && xVar.d().i() && AbstractC5504s.c(xVar.d().d(), f14887f);
    }

    private final boolean k(x xVar) {
        return (f().g().g() && (xVar.d().i() || AbstractC5504s.c(xVar.d().d(), f14886e))) || j(xVar);
    }

    private final String[] m(x xVar, Set set) {
        Re.a aVarD = xVar.d();
        String[] strArrA = aVarD.a();
        if (strArrA == null) {
            strArrA = aVarD.b();
        }
        if (strArrA == null || !set.contains(aVarD.c())) {
            return null;
        }
        return strArrA;
    }

    public final InterfaceC5387k c(N descriptor, x kotlinClass) {
        String[] strArrG;
        Pair pairM;
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f14885d);
        if (strArrM == null || (strArrG = kotlinClass.d().g()) == null) {
            return null;
        }
        try {
            try {
                pairM = We.h.m(strArrM, strArrG);
            } catch (Ze.k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e10);
            }
        } catch (Throwable th2) {
            if (i() || kotlinClass.d().d().h(h())) {
                throw th2;
            }
            pairM = null;
        }
        if (pairM == null) {
            return null;
        }
        We.e eVar = (We.e) pairM.getFirst();
        Se.m mVar = (Se.m) pairM.getSecond();
        r rVar = new r(kotlinClass, mVar, eVar, g(kotlinClass), k(kotlinClass), e(kotlinClass));
        return new M(descriptor, mVar, eVar, kotlinClass.d().d(), rVar, f(), "scope for " + rVar + " in " + descriptor, m.f14882a);
    }

    public final C5683n f() {
        C5683n c5683n = this.f14889a;
        if (c5683n != null) {
            return c5683n;
        }
        AbstractC5504s.u("components");
        return null;
    }

    public final C5678i l(x kotlinClass) {
        String[] strArrG;
        Pair pairI;
        AbstractC5504s.h(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f14884c);
        if (strArrM == null || (strArrG = kotlinClass.d().g()) == null) {
            return null;
        }
        try {
            try {
                pairI = We.h.i(strArrM, strArrG);
            } catch (Ze.k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e10);
            }
        } catch (Throwable th2) {
            if (i() || kotlinClass.d().d().h(h())) {
                throw th2;
            }
            pairI = null;
        }
        if (pairI == null) {
            return null;
        }
        return new C5678i((We.e) pairI.getFirst(), (Se.c) pairI.getSecond(), kotlinClass.d().d(), new z(kotlinClass, g(kotlinClass), k(kotlinClass), e(kotlinClass)));
    }

    public final InterfaceC7227e n(x kotlinClass) {
        AbstractC5504s.h(kotlinClass, "kotlinClass");
        C5678i c5678iL = l(kotlinClass);
        if (c5678iL == null) {
            return null;
        }
        return f().f().e(kotlinClass.g(), c5678iL);
    }

    public final void o(k components) {
        AbstractC5504s.h(components, "components");
        p(components.a());
    }

    public final void p(C5683n c5683n) {
        AbstractC5504s.h(c5683n, "<set-?>");
        this.f14889a = c5683n;
    }
}
