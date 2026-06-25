package io.sentry;

import io.sentry.E1;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5257g;
import io.sentry.util.AbstractC5293f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5206h implements Y {

    /* JADX INFO: renamed from: a */
    private final Y f50711a;

    /* JADX INFO: renamed from: b */
    private final Y f50712b;

    /* JADX INFO: renamed from: c */
    private final Y f50713c;

    /* JADX INFO: renamed from: io.sentry.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f50714a;

        static {
            int[] iArr = new int[I1.values().length];
            f50714a = iArr;
            try {
                iArr[I1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50714a[I1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50714a[I1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50714a[I1.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C5206h(Y y10, Y y11, Y y12) {
        this.f50711a = y10;
        this.f50712b = y11;
        this.f50713c = y12;
    }

    private Y S() {
        return T(null);
    }

    @Override // io.sentry.Y
    public String A() {
        String strA = this.f50713c.A();
        if (strA != null) {
            return strA;
        }
        String strA2 = this.f50712b.A();
        return strA2 != null ? strA2 : this.f50711a.A();
    }

    @Override // io.sentry.Y
    public void B() {
        S().B();
    }

    @Override // io.sentry.Y
    public io.sentry.featureflags.b C() {
        return io.sentry.featureflags.a.c(h(), this.f50711a.C(), this.f50712b.C(), this.f50713c.C());
    }

    @Override // io.sentry.Y
    public void D(InterfaceC5182c0 interfaceC5182c0) {
        S().D(interfaceC5182c0);
    }

    @Override // io.sentry.Y
    public void E(String str) {
        S().E(str);
    }

    @Override // io.sentry.Y
    public O3 F() {
        O3 o3F = this.f50713c.F();
        if (o3F != null) {
            return o3F;
        }
        O3 o3F2 = this.f50712b.F();
        return o3F2 != null ? o3F2 : this.f50711a.F();
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.x G() {
        io.sentry.protocol.x xVarG = this.f50713c.G();
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        if (!xVar.equals(xVarG)) {
            return xVarG;
        }
        io.sentry.protocol.x xVarG2 = this.f50712b.G();
        return !xVar.equals(xVarG2) ? xVarG2 : this.f50711a.G();
    }

    @Override // io.sentry.Y
    public C5310x1 H() {
        return S().H();
    }

    @Override // io.sentry.Y
    public void I(String str) {
        S().I(str);
    }

    @Override // io.sentry.Y
    public InterfaceC5182c0 J() {
        InterfaceC5182c0 interfaceC5182c0J = this.f50713c.J();
        if (!(interfaceC5182c0J instanceof X0)) {
            return interfaceC5182c0J;
        }
        InterfaceC5182c0 interfaceC5182c0J2 = this.f50712b.J();
        return !(interfaceC5182c0J2 instanceof X0) ? interfaceC5182c0J2 : this.f50711a.J();
    }

    @Override // io.sentry.Y
    public List K() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f50711a.K());
        copyOnWriteArrayList.addAll(this.f50712b.K());
        copyOnWriteArrayList.addAll(this.f50713c.K());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.Y
    public void L(V2 v22) {
        this.f50711a.L(v22);
    }

    @Override // io.sentry.Y
    public void M() {
        S().M();
    }

    @Override // io.sentry.Y
    public C5310x1 N(E1.a aVar) {
        return S().N(aVar);
    }

    @Override // io.sentry.Y
    public void O(E1.c cVar) {
        S().O(cVar);
    }

    @Override // io.sentry.Y
    public void P(io.sentry.protocol.x xVar) {
        this.f50711a.P(xVar);
        this.f50712b.P(xVar);
        this.f50713c.P(xVar);
    }

    @Override // io.sentry.Y
    public List Q() {
        return AbstractC5293f.a(u());
    }

    @Override // io.sentry.Y
    public void R(C5310x1 c5310x1) {
        S().R(c5310x1);
    }

    Y T(I1 i12) {
        if (i12 != null) {
            int i10 = a.f50714a[i12.ordinal()];
            if (i10 == 1) {
                return this.f50713c;
            }
            if (i10 == 2) {
                return this.f50712b;
            }
            if (i10 == 3) {
                return this.f50711a;
            }
            if (i10 == 4) {
                return this;
            }
        }
        int i11 = a.f50714a[h().getDefaultScopeType().ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? this.f50713c : this.f50711a : this.f50712b : this.f50713c;
    }

    @Override // io.sentry.Y
    public void a(C5191e c5191e) {
        S().a(c5191e);
    }

    @Override // io.sentry.Y
    public void b(String str, String str2) {
        S().b(str, str2);
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.o c() {
        io.sentry.protocol.o oVarC = this.f50713c.c();
        if (oVarC != null) {
            return oVarC;
        }
        io.sentry.protocol.o oVarC2 = this.f50712b.c();
        return oVarC2 != null ? oVarC2 : this.f50711a.c();
    }

    @Override // io.sentry.Y
    public void clear() {
        S().clear();
    }

    @Override // io.sentry.Y
    public void d(String str, String str2) {
        S().d(str, str2);
    }

    @Override // io.sentry.Y
    public void e(C5191e c5191e, H h10) {
        S().e(c5191e, h10);
    }

    @Override // io.sentry.Y
    public InterfaceC5207h0 f() {
        InterfaceC5207h0 interfaceC5207h0F = this.f50713c.f();
        if (interfaceC5207h0F != null) {
            return interfaceC5207h0F;
        }
        InterfaceC5207h0 interfaceC5207h0F2 = this.f50712b.f();
        return interfaceC5207h0F2 != null ? interfaceC5207h0F2 : this.f50711a.f();
    }

    @Override // io.sentry.Y
    public void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str) {
        this.f50711a.g(th2, interfaceC5207h0, str);
    }

    @Override // io.sentry.Y
    public Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f50711a.getExtras());
        concurrentHashMap.putAll(this.f50712b.getExtras());
        concurrentHashMap.putAll(this.f50713c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.Y
    public Map getTags() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f50711a.getTags());
        concurrentHashMap.putAll(this.f50712b.getTags());
        concurrentHashMap.putAll(this.f50713c.getTags());
        return concurrentHashMap;
    }

    @Override // io.sentry.Y
    public C5322z3 h() {
        return this.f50711a.h();
    }

    @Override // io.sentry.Y
    public void i(io.sentry.protocol.I i10) {
        S().i(i10);
    }

    @Override // io.sentry.Y
    public InterfaceC5217j0 j() {
        InterfaceC5217j0 interfaceC5217j0J = this.f50713c.j();
        if (interfaceC5217j0J != null) {
            return interfaceC5217j0J;
        }
        InterfaceC5217j0 interfaceC5217j0J2 = this.f50712b.j();
        return interfaceC5217j0J2 != null ? interfaceC5217j0J2 : this.f50711a.j();
    }

    @Override // io.sentry.Y
    public String k() {
        String strK = this.f50713c.k();
        if (strK != null) {
            return strK;
        }
        String strK2 = this.f50712b.k();
        return strK2 != null ? strK2 : this.f50711a.k();
    }

    @Override // io.sentry.Y
    public O3 l() {
        return S().l();
    }

    @Override // io.sentry.Y
    public EnumC5215i3 m() {
        EnumC5215i3 enumC5215i3M = this.f50713c.m();
        if (enumC5215i3M != null) {
            return enumC5215i3M;
        }
        EnumC5215i3 enumC5215i3M2 = this.f50712b.m();
        return enumC5215i3M2 != null ? enumC5215i3M2 : this.f50711a.m();
    }

    @Override // io.sentry.Y
    public C5257g n() {
        return C().n();
    }

    @Override // io.sentry.Y
    public void o(io.sentry.protocol.x xVar) {
        S().o(xVar);
    }

    @Override // io.sentry.Y
    public E1.d p() {
        return S().p();
    }

    @Override // io.sentry.Y
    public void q(C5322z3 c5322z3) {
        this.f50711a.q(c5322z3);
    }

    @Override // io.sentry.Y
    public Queue r() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f50711a.r());
        arrayList.addAll(this.f50712b.r());
        arrayList.addAll(this.f50713c.r());
        Collections.sort(arrayList);
        Queue queueT = E1.T(this.f50713c.h().getMaxBreadcrumbs());
        queueT.addAll(arrayList);
        return queueT;
    }

    @Override // io.sentry.Y
    public O3 s(E1.b bVar) {
        return S().s(bVar);
    }

    @Override // io.sentry.Y
    public void t() {
        S().t();
    }

    @Override // io.sentry.Y
    public List u() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f50711a.u());
        copyOnWriteArrayList.addAll(this.f50712b.u());
        copyOnWriteArrayList.addAll(this.f50713c.u());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.Y
    public C5253c v() {
        return new C5201g(this.f50711a.v(), this.f50712b.v(), this.f50713c.v(), h().getDefaultScopeType());
    }

    @Override // io.sentry.Y
    public void w(String str, Object obj) {
        S().w(str, obj);
    }

    @Override // io.sentry.Y
    public void x(InterfaceC5217j0 interfaceC5217j0) {
        S().x(interfaceC5217j0);
    }

    @Override // io.sentry.Y
    public List y() {
        List listY = this.f50713c.y();
        if (!listY.isEmpty()) {
            return listY;
        }
        List listY2 = this.f50712b.y();
        return !listY2.isEmpty() ? listY2 : this.f50711a.y();
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.I z() {
        io.sentry.protocol.I iZ = this.f50713c.z();
        if (iZ != null) {
            return iZ;
        }
        io.sentry.protocol.I iZ2 = this.f50712b.z();
        return iZ2 != null ? iZ2 : this.f50711a.z();
    }

    @Override // io.sentry.Y
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Y m962clone() {
        return new C5206h(this.f50711a, this.f50712b.m962clone(), this.f50713c.m962clone());
    }
}
