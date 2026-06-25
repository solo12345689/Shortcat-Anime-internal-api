package Be;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jf.C5396t;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import pf.C6041f;
import qf.AbstractC6183d0;
import qf.C6210u;
import qf.C6213x;
import qf.E0;
import qf.G0;
import qf.J0;
import qf.N0;
import qf.v0;
import rf.AbstractC6317g;
import ye.AbstractC7242u;
import ye.EnumC7228f;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.c0;
import ye.h0;
import ye.m0;
import ye.r0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.y */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1129y extends z {

    /* JADX INFO: renamed from: b */
    private final z f1892b;

    /* JADX INFO: renamed from: c */
    private final G0 f1893c;

    /* JADX INFO: renamed from: d */
    private G0 f1894d;

    /* JADX INFO: renamed from: e */
    private List f1895e;

    /* JADX INFO: renamed from: f */
    private List f1896f;

    /* JADX INFO: renamed from: g */
    private v0 f1897g;

    /* JADX INFO: renamed from: Be.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Function1 {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public Boolean invoke(m0 m0Var) {
            return Boolean.valueOf(!m0Var.Q());
        }
    }

    /* JADX INFO: renamed from: Be.y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Function1 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public AbstractC6183d0 invoke(AbstractC6183d0 abstractC6183d0) {
            return C1129y.this.M0(abstractC6183d0);
        }
    }

    public C1129y(z zVar, G0 g02) {
        this.f1892b = zVar;
        this.f1893c = g02;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void F0(int r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.C1129y.F0(int):void");
    }

    private G0 K0() {
        if (this.f1894d == null) {
            if (this.f1893c.k()) {
                this.f1894d = this.f1893c;
            } else {
                List parameters = this.f1892b.l().getParameters();
                this.f1895e = new ArrayList(parameters.size());
                this.f1894d = qf.C.b(parameters, this.f1893c.j(), this, this.f1895e);
                this.f1896f = AbstractC2279u.i0(this.f1895e, new a());
            }
        }
        return this.f1894d;
    }

    public AbstractC6183d0 M0(AbstractC6183d0 abstractC6183d0) {
        return (abstractC6183d0 == null || this.f1893c.k()) ? abstractC6183d0 : (AbstractC6183d0) K0().p(abstractC6183d0, N0.f57999e);
    }

    @Override // ye.InterfaceC7231i
    public boolean A() {
        return this.f1892b.A();
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7226d D() {
        return this.f1892b.D();
    }

    @Override // ye.InterfaceC7227e
    public boolean I0() {
        return this.f1892b.I0();
    }

    @Override // ye.InterfaceC7227e
    public c0 J0() {
        throw new UnsupportedOperationException();
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k L(E0 e02) {
        if (e02 == null) {
            F0(10);
        }
        InterfaceC5387k interfaceC5387kT = T(e02, ff.e.r(bf.i.g(this)));
        if (interfaceC5387kT == null) {
            F0(11);
        }
        return interfaceC5387kT;
    }

    @Override // ye.j0
    /* JADX INFO: renamed from: L0 */
    public InterfaceC7227e c(G0 g02) {
        if (g02 == null) {
            F0(23);
        }
        return g02.k() ? this : new C1129y(this, G0.h(g02.j(), K0().j()));
    }

    @Override // Be.z
    public InterfaceC5387k T(E0 e02, AbstractC6317g abstractC6317g) {
        if (e02 == null) {
            F0(5);
        }
        if (abstractC6317g == null) {
            F0(6);
        }
        InterfaceC5387k interfaceC5387kT = this.f1892b.T(e02, abstractC6317g);
        if (!this.f1893c.k()) {
            return new C5396t(interfaceC5387kT, K0());
        }
        if (interfaceC5387kT == null) {
            F0(7);
        }
        return interfaceC5387kT;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k U() {
        InterfaceC5387k interfaceC5387kU = this.f1892b.U();
        if (interfaceC5387kU == null) {
            F0(28);
        }
        return interfaceC5387kU;
    }

    @Override // ye.InterfaceC7227e
    public r0 V() {
        r0 r0VarV = this.f1892b.V();
        if (r0VarV == null) {
            return null;
        }
        return r0VarV.b(new b());
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k X() {
        InterfaceC5387k interfaceC5387kJ0 = j0(ff.e.r(bf.i.g(this.f1892b)));
        if (interfaceC5387kJ0 == null) {
            F0(12);
        }
        return interfaceC5387kJ0;
    }

    @Override // ye.D
    public boolean Y() {
        return this.f1892b.Y();
    }

    @Override // ye.InterfaceC7227e
    public List Z() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F0(17);
        }
        return list;
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7236n, ye.InterfaceC7235m
    public InterfaceC7235m b() {
        InterfaceC7235m interfaceC7235mB = this.f1892b.b();
        if (interfaceC7235mB == null) {
            F0(22);
        }
        return interfaceC7235mB;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.l(this, obj);
    }

    @Override // ye.InterfaceC7227e
    public boolean c0() {
        return this.f1892b.c0();
    }

    @Override // ye.InterfaceC7227e
    public boolean g0() {
        return this.f1892b.g0();
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        InterfaceC7374h annotations = this.f1892b.getAnnotations();
        if (annotations == null) {
            F0(19);
        }
        return annotations;
    }

    @Override // ye.J
    public Xe.f getName() {
        Xe.f name = this.f1892b.getName();
        if (name == null) {
            F0(20);
        }
        return name;
    }

    @Override // ye.InterfaceC7227e, ye.D, ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u visibility = this.f1892b.getVisibility();
        if (visibility == null) {
            F0(27);
        }
        return visibility;
    }

    @Override // ye.InterfaceC7227e
    public EnumC7228f h() {
        EnumC7228f enumC7228fH = this.f1892b.h();
        if (enumC7228fH == null) {
            F0(25);
        }
        return enumC7228fH;
    }

    @Override // ye.InterfaceC7227e
    public Collection i() {
        Collection<InterfaceC7226d> collectionI = this.f1892b.i();
        ArrayList arrayList = new ArrayList(collectionI.size());
        for (InterfaceC7226d interfaceC7226d : collectionI) {
            arrayList.add(((InterfaceC7226d) interfaceC7226d.v().r(interfaceC7226d.a()).g(interfaceC7226d.r()).h(interfaceC7226d.getVisibility()).i(interfaceC7226d.h()).m(false).build()).c(K0()));
        }
        return arrayList;
    }

    @Override // ye.D
    public boolean isExternal() {
        return this.f1892b.isExternal();
    }

    @Override // ye.InterfaceC7227e
    public boolean isInline() {
        return this.f1892b.isInline();
    }

    @Override // Be.z
    public InterfaceC5387k j0(AbstractC6317g abstractC6317g) {
        if (abstractC6317g == null) {
            F0(13);
        }
        InterfaceC5387k interfaceC5387kJ0 = this.f1892b.j0(abstractC6317g);
        if (!this.f1893c.k()) {
            return new C5396t(interfaceC5387kJ0, K0());
        }
        if (interfaceC5387kJ0 == null) {
            F0(14);
        }
        return interfaceC5387kJ0;
    }

    @Override // ye.InterfaceC7238p
    public h0 k() {
        h0 h0Var = h0.f65112a;
        if (h0Var == null) {
            F0(29);
        }
        return h0Var;
    }

    @Override // ye.InterfaceC7230h
    public v0 l() {
        v0 v0VarL = this.f1892b.l();
        if (this.f1893c.k()) {
            if (v0VarL == null) {
                F0(0);
            }
            return v0VarL;
        }
        if (this.f1897g == null) {
            G0 g0K0 = K0();
            Collection collectionK = v0VarL.k();
            ArrayList arrayList = new ArrayList(collectionK.size());
            Iterator it = collectionK.iterator();
            while (it.hasNext()) {
                arrayList.add(g0K0.p((qf.S) it.next(), N0.f57999e));
            }
            this.f1897g = new C6210u(this, this.f1895e, arrayList, C6041f.f56045e);
        }
        v0 v0Var = this.f1897g;
        if (v0Var == null) {
            F0(1);
        }
        return v0Var;
    }

    @Override // ye.D
    public boolean m0() {
        return this.f1892b.m0();
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k o0() {
        InterfaceC5387k interfaceC5387kO0 = this.f1892b.o0();
        if (interfaceC5387kO0 == null) {
            F0(15);
        }
        return interfaceC5387kO0;
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7230h
    public AbstractC6183d0 p() {
        AbstractC6183d0 abstractC6183d0M = qf.V.m(C6213x.f58121a.a(getAnnotations(), null, null), l(), J0.g(l().getParameters()), false, X());
        if (abstractC6183d0M == null) {
            F0(16);
        }
        return abstractC6183d0M;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7227e p0() {
        return this.f1892b.p0();
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7231i
    public List q() {
        K0();
        List list = this.f1896f;
        if (list == null) {
            F0(30);
        }
        return list;
    }

    @Override // ye.InterfaceC7227e, ye.D
    public ye.E r() {
        ye.E eR = this.f1892b.r();
        if (eR == null) {
            F0(26);
        }
        return eR;
    }

    @Override // ye.InterfaceC7227e
    public boolean s() {
        return this.f1892b.s();
    }

    @Override // ye.InterfaceC7227e
    public Collection z() {
        Collection collectionZ = this.f1892b.z();
        if (collectionZ == null) {
            F0(31);
        }
        return collectionZ;
    }

    @Override // ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public InterfaceC7227e a() {
        InterfaceC7227e interfaceC7227eA = this.f1892b.a();
        if (interfaceC7227eA == null) {
            F0(21);
        }
        return interfaceC7227eA;
    }
}
