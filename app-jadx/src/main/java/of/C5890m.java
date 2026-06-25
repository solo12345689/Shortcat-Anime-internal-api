package of;

import Be.AbstractC1106a;
import Be.AbstractC1123s;
import Be.C1114i;
import Be.C1122q;
import Se.c;
import Ud.AbstractC2279u;
import Ud.a0;
import Ue.i;
import bf.C3050a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC5388l;
import jf.C5380d;
import jf.C5393q;
import jf.InterfaceC5387k;
import jf.InterfaceC5390n;
import kf.C5470b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5487a;
import mf.C5683n;
import mf.C5685p;
import mf.InterfaceC5691w;
import mf.N;
import mf.X;
import oe.AbstractC5874j;
import pf.InterfaceC6043h;
import pf.InterfaceC6044i;
import pf.InterfaceC6045j;
import qf.AbstractC6178b;
import qf.AbstractC6183d0;
import qf.v0;
import rf.AbstractC6317g;
import ye.AbstractC7242u;
import ye.C7222A;
import ye.C7243v;
import ye.EnumC7228f;
import ye.InterfaceC7224b;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.M;
import ye.Z;
import ye.f0;
import ye.g0;
import ye.h0;
import ye.k0;
import ye.q0;
import ye.r0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: of.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5890m extends AbstractC1106a implements InterfaceC7235m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Se.c f55473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ue.a f55474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0 f55475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Xe.b f55476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ye.E f55477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC7242u f55478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final EnumC7228f f55479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C5685p f55480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f55481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AbstractC5388l f55482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b f55483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f0 f55484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f55485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC7235m f55486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC6045j f55487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC6044i f55488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceC6045j f55489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC6044i f55490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final InterfaceC6045j f55491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final N.a f55492y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final InterfaceC7374h f55493z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: of.m$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b extends AbstractC6178b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6044i f55499d;

        public b() {
            super(C5890m.this.d1().h());
            this.f55499d = C5890m.this.d1().h().c(new C5891n(C5890m.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List L(C5890m c5890m) {
            return q0.g(c5890m);
        }

        @Override // qf.AbstractC6211v, qf.v0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public C5890m p() {
            return C5890m.this;
        }

        @Override // qf.v0
        public List getParameters() {
            return (List) this.f55499d.invoke();
        }

        @Override // qf.v0
        public boolean q() {
            return true;
        }

        @Override // qf.AbstractC6206p
        protected Collection r() {
            String strB;
            Xe.c cVarA;
            List listO = Ue.g.o(C5890m.this.e1(), C5890m.this.d1().j());
            C5890m c5890m = C5890m.this;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(c5890m.d1().i().u((Se.r) it.next()));
            }
            List listI0 = AbstractC2279u.I0(arrayList, C5890m.this.d1().c().c().a(C5890m.this));
            ArrayList<M.b> arrayList2 = new ArrayList();
            Iterator it2 = listI0.iterator();
            while (it2.hasNext()) {
                InterfaceC7230h interfaceC7230hP = ((qf.S) it2.next()).N0().p();
                M.b bVar = interfaceC7230hP instanceof M.b ? (M.b) interfaceC7230hP : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC5691w interfaceC5691wJ = C5890m.this.d1().c().j();
                C5890m c5890m2 = C5890m.this;
                ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(arrayList2, 10));
                for (M.b bVar2 : arrayList2) {
                    Xe.b bVarN = ff.e.n(bVar2);
                    if (bVarN == null || (cVarA = bVarN.a()) == null || (strB = cVarA.a()) == null) {
                        strB = bVar2.getName().b();
                        AbstractC5504s.g(strB, "asString(...)");
                    }
                    arrayList3.add(strB);
                }
                interfaceC5691wJ.b(c5890m2, arrayList3);
            }
            return AbstractC2279u.b1(listI0);
        }

        public String toString() {
            String string = C5890m.this.getName().toString();
            AbstractC5504s.g(string, "toString(...)");
            return string;
        }

        @Override // qf.AbstractC6206p
        protected k0 v() {
            return k0.a.f65115a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: of.m$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f55501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC6043h f55502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC6044i f55503c;

        public c() {
            List listH0 = C5890m.this.e1().H0();
            AbstractC5504s.g(listH0, "getEnumEntryList(...)");
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(listH0, 10)), 16));
            for (Object obj : listH0) {
                linkedHashMap.put(mf.L.b(C5890m.this.d1().g(), ((Se.h) obj).G()), obj);
            }
            this.f55501a = linkedHashMap;
            this.f55502b = C5890m.this.d1().h().d(new C5892o(this, C5890m.this));
            this.f55503c = C5890m.this.d1().h().c(new C5893p(this));
        }

        private final Set e() {
            HashSet hashSet = new HashSet();
            Iterator it = C5890m.this.l().k().iterator();
            while (it.hasNext()) {
                for (InterfaceC7235m interfaceC7235m : InterfaceC5390n.a.a(((qf.S) it.next()).o(), null, null, 3, null)) {
                    if ((interfaceC7235m instanceof g0) || (interfaceC7235m instanceof Z)) {
                        hashSet.add(((InterfaceC7224b) interfaceC7235m).getName());
                    }
                }
            }
            List listM0 = C5890m.this.e1().M0();
            AbstractC5504s.g(listM0, "getFunctionList(...)");
            C5890m c5890m = C5890m.this;
            Iterator it2 = listM0.iterator();
            while (it2.hasNext()) {
                hashSet.add(mf.L.b(c5890m.d1().g(), ((Se.j) it2.next()).i0()));
            }
            List listA1 = C5890m.this.e1().a1();
            AbstractC5504s.g(listA1, "getPropertyList(...)");
            C5890m c5890m2 = C5890m.this;
            Iterator it3 = listA1.iterator();
            while (it3.hasNext()) {
                hashSet.add(mf.L.b(c5890m2.d1().g(), ((Se.o) it3.next()).h0()));
            }
            return a0.l(hashSet, hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC7227e f(c cVar, C5890m c5890m, Xe.f name) {
            AbstractC5504s.h(name, "name");
            Se.h hVar = (Se.h) cVar.f55501a.get(name);
            if (hVar != null) {
                return C1122q.L0(c5890m.d1().h(), c5890m, name, cVar.f55503c, new C5878a(c5890m.d1().h(), new C5894q(c5890m, hVar)), h0.f65112a);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(C5890m c5890m, Se.h hVar) {
            return AbstractC2279u.b1(c5890m.d1().c().d().b(c5890m.i1(), hVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set h(c cVar) {
            return cVar.e();
        }

        public final Collection d() {
            Set setKeySet = this.f55501a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                InterfaceC7227e interfaceC7227eI = i((Xe.f) it.next());
                if (interfaceC7227eI != null) {
                    arrayList.add(interfaceC7227eI);
                }
            }
            return arrayList;
        }

        public final InterfaceC7227e i(Xe.f name) {
            AbstractC5504s.h(name, "name");
            return (InterfaceC7227e) this.f55502b.invoke(name);
        }
    }

    /* JADX INFO: renamed from: of.m$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class d extends C5487a implements Function1 {
        d(Object obj) {
            super(1, obj, X.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC6183d0 invoke(Se.r p02) {
            AbstractC5504s.h(p02, "p0");
            return X.q((X) this.receiver, p02, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: of.m$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class e extends AbstractC5502p implements Function1 {
        e(Object obj) {
            super(1, obj, C5890m.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final AbstractC6183d0 invoke(Xe.f p02) {
            AbstractC5504s.h(p02, "p0");
            return ((C5890m) this.receiver).j1(p02);
        }
    }

    /* JADX INFO: renamed from: of.m$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class f extends AbstractC5502p implements Function1 {
        f(Object obj) {
            super(1, obj, a.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final a invoke(AbstractC6317g p02) {
            AbstractC5504s.h(p02, "p0");
            return new a((C5890m) this.receiver, p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5890m(C5685p outerContext, Se.c classProto, Ue.d nameResolver, Ue.a metadataVersion, h0 sourceElement) {
        AbstractC5388l c5393q;
        super(outerContext.h(), mf.L.a(nameResolver, classProto.J0()).h());
        AbstractC5504s.h(outerContext, "outerContext");
        AbstractC5504s.h(classProto, "classProto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        AbstractC5504s.h(sourceElement, "sourceElement");
        this.f55473f = classProto;
        this.f55474g = metadataVersion;
        this.f55475h = sourceElement;
        this.f55476i = mf.L.a(nameResolver, classProto.J0());
        mf.O o10 = mf.O.f53376a;
        this.f55477j = o10.b((Se.l) Ue.b.f19549e.d(classProto.I0()));
        this.f55478k = mf.P.a(o10, (Se.y) Ue.b.f19548d.d(classProto.I0()));
        EnumC7228f enumC7228fA = o10.a((c.EnumC0282c) Ue.b.f19550f.d(classProto.I0()));
        this.f55479l = enumC7228fA;
        List listL1 = classProto.l1();
        AbstractC5504s.g(listL1, "getTypeParameterList(...)");
        Se.u uVarM1 = classProto.m1();
        AbstractC5504s.g(uVarM1, "getTypeTable(...)");
        Ue.h hVar = new Ue.h(uVarM1);
        i.a aVar = Ue.i.f19583b;
        Se.x xVarO1 = classProto.o1();
        AbstractC5504s.g(xVarO1, "getVersionRequirementTable(...)");
        C5685p c5685pA = outerContext.a(this, listL1, nameResolver, hVar, aVar.a(xVarO1), metadataVersion);
        this.f55480m = c5685pA;
        Boolean boolD = Ue.b.f19557m.d(classProto.I0());
        AbstractC5504s.g(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        this.f55481n = zBooleanValue;
        EnumC7228f enumC7228f = EnumC7228f.f65099d;
        if (enumC7228fA == enumC7228f) {
            c5393q = new C5393q(c5685pA.h(), this, zBooleanValue || AbstractC5504s.c(c5685pA.c().i().a(), Boolean.TRUE));
        } else {
            c5393q = InterfaceC5387k.b.f51800b;
        }
        this.f55482o = c5393q;
        this.f55483p = new b();
        this.f55484q = f0.f65106e.a(this, c5685pA.h(), c5685pA.c().n().d(), new f(this));
        this.f55485r = enumC7228fA == enumC7228f ? new c() : null;
        InterfaceC7235m interfaceC7235mE = outerContext.e();
        this.f55486s = interfaceC7235mE;
        this.f55487t = c5685pA.h().g(new C5881d(this));
        this.f55488u = c5685pA.h().c(new C5882e(this));
        this.f55489v = c5685pA.h().g(new C5883f(this));
        this.f55490w = c5685pA.h().c(new C5884g(this));
        this.f55491x = c5685pA.h().g(new C5885h(this));
        Ue.d dVarG = c5685pA.g();
        Ue.h hVarJ = c5685pA.j();
        C5890m c5890m = interfaceC7235mE instanceof C5890m ? (C5890m) interfaceC7235mE : null;
        this.f55492y = new N.a(classProto, dVarG, hVarJ, sourceElement, c5890m != null ? c5890m.f55492y : null);
        this.f55493z = !Ue.b.f19547c.d(classProto.I0()).booleanValue() ? InterfaceC7374h.f66223k0.b() : new T(c5685pA.h(), new C5886i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U0(C5890m c5890m) {
        return AbstractC2279u.b1(c5890m.f55480m.c().d().j(c5890m.f55492y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7227e V0(C5890m c5890m) {
        return c5890m.W0();
    }

    private final InterfaceC7227e W0() {
        if (!this.f55473f.p1()) {
            return null;
        }
        InterfaceC7230h interfaceC7230hE = f1().e(mf.L.b(this.f55480m.g(), this.f55473f.t0()), Ge.d.f7472r);
        if (interfaceC7230hE instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hE;
        }
        return null;
    }

    private final Collection X0() {
        return AbstractC2279u.I0(AbstractC2279u.I0(Z0(), AbstractC2279u.q(D())), this.f55480m.c().c().d(this));
    }

    private final InterfaceC7226d Y0() {
        Object next;
        if (this.f55479l.b()) {
            C1114i c1114iL = bf.h.l(this, h0.f65112a);
            c1114iL.g1(p());
            return c1114iL;
        }
        List listY0 = this.f55473f.y0();
        AbstractC5504s.g(listY0, "getConstructorList(...)");
        Iterator it = listY0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!Ue.b.f19558n.d(((Se.e) next).O()).booleanValue()) {
                break;
            }
        }
        Se.e eVar = (Se.e) next;
        if (eVar != null) {
            return this.f55480m.f().r(eVar, true);
        }
        return null;
    }

    private final List Z0() {
        List listY0 = this.f55473f.y0();
        AbstractC5504s.g(listY0, "getConstructorList(...)");
        ArrayList<Se.e> arrayList = new ArrayList();
        for (Object obj : listY0) {
            Boolean boolD = Ue.b.f19558n.d(((Se.e) obj).O());
            AbstractC5504s.g(boolD, "get(...)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        for (Se.e eVar : arrayList) {
            mf.K kF = this.f55480m.f();
            AbstractC5504s.e(eVar);
            arrayList2.add(kF.r(eVar, false));
        }
        return arrayList2;
    }

    private final Collection a1() {
        if (this.f55477j != ye.E.f65061c) {
            return AbstractC2279u.m();
        }
        List<Integer> listB1 = this.f55473f.b1();
        AbstractC5504s.e(listB1);
        if (listB1.isEmpty()) {
            return C3050a.f33289a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listB1) {
            C5683n c5683nC = this.f55480m.c();
            Ue.d dVarG = this.f55480m.g();
            AbstractC5504s.e(num);
            InterfaceC7227e interfaceC7227eB = c5683nC.b(mf.L.a(dVarG, num.intValue()));
            if (interfaceC7227eB != null) {
                arrayList.add(interfaceC7227eB);
            }
        }
        return arrayList;
    }

    private final r0 b1() {
        if (!isInline() && !s()) {
            return null;
        }
        r0 r0VarB = mf.Z.b(this.f55473f, this.f55480m.g(), this.f55480m.j(), new d(this.f55480m.i()), new e(this));
        if (r0VarB != null) {
            return r0VarB;
        }
        if (this.f55474g.c(1, 5, 1)) {
            return null;
        }
        InterfaceC7226d interfaceC7226dD = D();
        if (interfaceC7226dD == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List listJ = interfaceC7226dD.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        Xe.f name = ((t0) AbstractC2279u.m0(listJ)).getName();
        AbstractC5504s.g(name, "getName(...)");
        AbstractC6183d0 abstractC6183d0J1 = j1(name);
        if (abstractC6183d0J1 != null) {
            return new C7222A(name, abstractC6183d0J1);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection c1(C5890m c5890m) {
        return c5890m.X0();
    }

    private final a f1() {
        return (a) this.f55484q.c(this.f55480m.c().n().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC6183d0 j1(Xe.f fVar) {
        Iterator it = f1().a(fVar, Ge.d.f7472r).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((Z) next).O() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        Z z11 = (Z) obj;
        return (AbstractC6183d0) (z11 != null ? z11.getType() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7226d l1(C5890m c5890m) {
        return c5890m.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection m1(C5890m c5890m) {
        return c5890m.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 n1(C5890m c5890m) {
        return c5890m.b1();
    }

    @Override // ye.InterfaceC7231i
    public boolean A() {
        Boolean boolD = Ue.b.f19551g.d(this.f55473f.I0());
        AbstractC5504s.g(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7226d D() {
        return (InterfaceC7226d) this.f55487t.invoke();
    }

    @Override // ye.InterfaceC7227e
    public boolean I0() {
        Boolean boolD = Ue.b.f19552h.d(this.f55473f.I0());
        AbstractC5504s.g(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // ye.InterfaceC7227e
    public r0 V() {
        return (r0) this.f55491x.invoke();
    }

    @Override // ye.D
    public boolean Y() {
        return false;
    }

    @Override // Be.AbstractC1106a, ye.InterfaceC7227e
    public List Z() {
        List listB = Ue.g.b(this.f55473f, this.f55480m.j());
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new Be.N(J0(), new C5470b(this, this.f55480m.i().u((Se.r) it.next()), null, null), InterfaceC7374h.f66223k0.b()));
        }
        return arrayList;
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7236n, ye.InterfaceC7235m
    public InterfaceC7235m b() {
        return this.f55486s;
    }

    @Override // ye.InterfaceC7227e
    public boolean c0() {
        return Ue.b.f19550f.d(this.f55473f.I0()) == c.EnumC0282c.COMPANION_OBJECT;
    }

    public final C5685p d1() {
        return this.f55480m;
    }

    public final Se.c e1() {
        return this.f55473f;
    }

    @Override // ye.InterfaceC7227e
    public boolean g0() {
        Boolean boolD = Ue.b.f19556l.d(this.f55473f.I0());
        AbstractC5504s.g(boolD, "get(...)");
        return boolD.booleanValue();
    }

    public final Ue.a g1() {
        return this.f55474g;
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        return this.f55493z;
    }

    @Override // ye.InterfaceC7227e, ye.D, ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        return this.f55478k;
    }

    @Override // ye.InterfaceC7227e
    public EnumC7228f h() {
        return this.f55479l;
    }

    @Override // ye.InterfaceC7227e
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public AbstractC5388l o0() {
        return this.f55482o;
    }

    @Override // ye.InterfaceC7227e
    public Collection i() {
        return (Collection) this.f55488u.invoke();
    }

    public final N.a i1() {
        return this.f55492y;
    }

    @Override // ye.D
    public boolean isExternal() {
        Boolean boolD = Ue.b.f19553i.d(this.f55473f.I0());
        AbstractC5504s.g(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // ye.InterfaceC7227e
    public boolean isInline() {
        return Ue.b.f19555k.d(this.f55473f.I0()).booleanValue() && this.f55474g.e(1, 4, 1);
    }

    @Override // Be.z
    protected InterfaceC5387k j0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f55484q.c(kotlinTypeRefiner);
    }

    @Override // ye.InterfaceC7238p
    public h0 k() {
        return this.f55475h;
    }

    public final boolean k1(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return f1().t().contains(name);
    }

    @Override // ye.InterfaceC7230h
    public v0 l() {
        return this.f55483p;
    }

    @Override // ye.D
    public boolean m0() {
        Boolean boolD = Ue.b.f19554j.d(this.f55473f.I0());
        AbstractC5504s.g(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7227e p0() {
        return (InterfaceC7227e) this.f55489v.invoke();
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7231i
    public List q() {
        return this.f55480m.i().m();
    }

    @Override // ye.InterfaceC7227e, ye.D
    public ye.E r() {
        return this.f55477j;
    }

    @Override // ye.InterfaceC7227e
    public boolean s() {
        return Ue.b.f19555k.d(this.f55473f.I0()).booleanValue() && this.f55474g.c(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(m0() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // ye.InterfaceC7227e
    public Collection z() {
        return (Collection) this.f55490w.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: of.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class a extends w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AbstractC6317g f55494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InterfaceC6044i f55495h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final InterfaceC6044i f55496i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5890m f55497j;

        /* JADX INFO: renamed from: of.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0850a extends bf.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f55498a;

            C0850a(List list) {
                this.f55498a = list;
            }

            @Override // bf.n
            public void a(InterfaceC7224b fakeOverride) {
                AbstractC5504s.h(fakeOverride, "fakeOverride");
                bf.o.K(fakeOverride, null);
                this.f55498a.add(fakeOverride);
            }

            @Override // bf.m
            protected void e(InterfaceC7224b fromSuper, InterfaceC7224b fromCurrent) {
                AbstractC5504s.h(fromSuper, "fromSuper");
                AbstractC5504s.h(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof AbstractC1123s) {
                    ((AbstractC1123s) fromCurrent).U0(C7243v.f65137a, fromSuper);
                }
            }
        }

        public a(C5890m c5890m, AbstractC6317g kotlinTypeRefiner) {
            AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f55497j = c5890m;
            C5685p c5685pD1 = c5890m.d1();
            List listM0 = c5890m.e1().M0();
            AbstractC5504s.g(listM0, "getFunctionList(...)");
            List listA1 = c5890m.e1().a1();
            AbstractC5504s.g(listA1, "getPropertyList(...)");
            List listI1 = c5890m.e1().i1();
            AbstractC5504s.g(listI1, "getTypeAliasList(...)");
            List listX0 = c5890m.e1().X0();
            AbstractC5504s.g(listX0, "getNestedClassNameList(...)");
            Ue.d dVarG = c5890m.d1().g();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listX0, 10));
            Iterator it = listX0.iterator();
            while (it.hasNext()) {
                arrayList.add(mf.L.b(dVarG, ((Number) it.next()).intValue()));
            }
            super(c5685pD1, listM0, listA1, listI1, new C5887j(arrayList));
            this.f55494g = kotlinTypeRefiner;
            this.f55495h = s().h().c(new C5888k(this));
            this.f55496i = s().h().c(new C5889l(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(a aVar) {
            return aVar.m(C5380d.f51771o, InterfaceC5387k.f51797a.c(), Ge.d.f7467m);
        }

        private final void G(Xe.f fVar, Collection collection, List list) {
            s().c().n().b().v(fVar, collection, new ArrayList(list), H(), new C0850a(list));
        }

        private final C5890m H() {
            return this.f55497j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection J(a aVar) {
            return aVar.f55494g.g(aVar.H());
        }

        @Override // of.w
        protected boolean A(g0 function) {
            AbstractC5504s.h(function, "function");
            return s().c().t().b(this.f55497j, function);
        }

        public void I(Xe.f name, Ge.b location) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(location, "location");
            Fe.a.a(s().c().p(), location, H(), name);
        }

        @Override // of.w, jf.AbstractC5388l, jf.InterfaceC5387k
        public Collection a(Xe.f name, Ge.b location) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(location, "location");
            I(name, location);
            return super.a(name, location);
        }

        @Override // of.w, jf.AbstractC5388l, jf.InterfaceC5387k
        public Collection c(Xe.f name, Ge.b location) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(location, "location");
            I(name, location);
            return super.c(name, location);
        }

        @Override // of.w, jf.AbstractC5388l, jf.InterfaceC5390n
        public InterfaceC7230h e(Xe.f name, Ge.b location) {
            InterfaceC7227e interfaceC7227eI;
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(location, "location");
            I(name, location);
            c cVar = H().f55485r;
            return (cVar == null || (interfaceC7227eI = cVar.i(name)) == null) ? super.e(name, location) : interfaceC7227eI;
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5390n
        public Collection g(C5380d kindFilter, Function1 nameFilter) {
            AbstractC5504s.h(kindFilter, "kindFilter");
            AbstractC5504s.h(nameFilter, "nameFilter");
            return (Collection) this.f55495h.invoke();
        }

        @Override // of.w
        protected void j(Collection result, Function1 nameFilter) {
            AbstractC5504s.h(result, "result");
            AbstractC5504s.h(nameFilter, "nameFilter");
            c cVar = H().f55485r;
            Collection collectionD = cVar != null ? cVar.d() : null;
            if (collectionD == null) {
                collectionD = AbstractC2279u.m();
            }
            result.addAll(collectionD);
        }

        @Override // of.w
        protected void n(Xe.f name, List functions) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f55496i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((qf.S) it.next()).o().c(name, Ge.d.f7466l));
            }
            functions.addAll(s().c().c().c(name, this.f55497j));
            G(name, arrayList, functions);
        }

        @Override // of.w
        protected void o(Xe.f name, List descriptors) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f55496i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((qf.S) it.next()).o().a(name, Ge.d.f7466l));
            }
            G(name, arrayList, descriptors);
        }

        @Override // of.w
        protected Xe.b p(Xe.f name) {
            AbstractC5504s.h(name, "name");
            return this.f55497j.f55476i.d(name);
        }

        @Override // of.w
        protected Set v() {
            List listK = H().f55483p.k();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                Set setF = ((qf.S) it.next()).o().f();
                if (setF == null) {
                    return null;
                }
                AbstractC2279u.D(linkedHashSet, setF);
            }
            return linkedHashSet;
        }

        @Override // of.w
        protected Set w() {
            List listK = H().f55483p.k();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                AbstractC2279u.D(linkedHashSet, ((qf.S) it.next()).o().b());
            }
            linkedHashSet.addAll(s().c().c().e(this.f55497j));
            return linkedHashSet;
        }

        @Override // of.w
        protected Set x() {
            List listK = H().f55483p.k();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                AbstractC2279u.D(linkedHashSet, ((qf.S) it.next()).o().d());
            }
            return linkedHashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(List list) {
            return list;
        }
    }
}
