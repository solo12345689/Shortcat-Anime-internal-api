package of;

import Ud.AbstractC2279u;
import Ud.a0;
import ie.InterfaceC5082a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC5388l;
import jf.C5380d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import mf.C5685p;
import oe.AbstractC5874j;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6042g;
import pf.InterfaceC6043h;
import pf.InterfaceC6044i;
import pf.InterfaceC6045j;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.Z;
import ye.g0;
import ye.l0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w extends AbstractC5388l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f55517f = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(w.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(w.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5685p f55518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f55519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6044i f55520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6045j f55521e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface a {
        Collection a(Xe.f fVar, Ge.b bVar);

        Set b();

        Collection c(Xe.f fVar, Ge.b bVar);

        Set d();

        Set e();

        l0 f(Xe.f fVar);

        void g(Collection collection, C5380d c5380d, Function1 function1, Ge.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b implements a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final /* synthetic */ InterfaceC6023m[] f55522o = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f55523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f55524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f55525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6044i f55526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC6044i f55527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InterfaceC6044i f55528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InterfaceC6044i f55529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InterfaceC6044i f55530h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final InterfaceC6044i f55531i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final InterfaceC6044i f55532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final InterfaceC6044i f55533k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final InterfaceC6044i f55534l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final InterfaceC6044i f55535m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w f55536n;

        public b(w wVar, List functionList, List propertyList, List typeAliasList) {
            AbstractC5504s.h(functionList, "functionList");
            AbstractC5504s.h(propertyList, "propertyList");
            AbstractC5504s.h(typeAliasList, "typeAliasList");
            this.f55536n = wVar;
            this.f55523a = functionList;
            this.f55524b = propertyList;
            this.f55525c = wVar.s().c().g().c() ? typeAliasList : AbstractC2279u.m();
            this.f55526d = wVar.s().h().c(new x(this));
            this.f55527e = wVar.s().h().c(new y(this));
            this.f55528f = wVar.s().h().c(new z(this));
            this.f55529g = wVar.s().h().c(new C5877A(this));
            this.f55530h = wVar.s().h().c(new B(this));
            this.f55531i = wVar.s().h().c(new C(this));
            this.f55532j = wVar.s().h().c(new D(this));
            this.f55533k = wVar.s().h().c(new E(this));
            this.f55534l = wVar.s().h().c(new F(this, wVar));
            this.f55535m = wVar.s().h().c(new G(this, wVar));
        }

        private final List A() {
            List list = this.f55525c;
            w wVar = this.f55536n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l0 l0VarZ = wVar.s().f().z((Se.s) ((Ze.p) it.next()));
                if (l0VarZ != null) {
                    arrayList.add(l0VarZ);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set D(b bVar, w wVar) {
            List list = bVar.f55523a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f55536n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(mf.L.b(wVar2.s().g(), ((Se.j) ((Ze.p) it.next())).i0()));
            }
            return a0.l(linkedHashSet, wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map E(b bVar) {
            List listF = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listF) {
                Xe.f name = ((g0) obj).getName();
                AbstractC5504s.g(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List F() {
            return (List) AbstractC6048m.a(this.f55529g, this, f55522o[3]);
        }

        private final List G() {
            return (List) AbstractC6048m.a(this.f55530h, this, f55522o[4]);
        }

        private final List H() {
            return (List) AbstractC6048m.a(this.f55528f, this, f55522o[2]);
        }

        private final List I() {
            return (List) AbstractC6048m.a(this.f55526d, this, f55522o[0]);
        }

        private final List J() {
            return (List) AbstractC6048m.a(this.f55527e, this, f55522o[1]);
        }

        private final Map K() {
            return (Map) AbstractC6048m.a(this.f55532j, this, f55522o[6]);
        }

        private final Map L() {
            return (Map) AbstractC6048m.a(this.f55533k, this, f55522o[7]);
        }

        private final Map M() {
            return (Map) AbstractC6048m.a(this.f55531i, this, f55522o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map N(b bVar) {
            List listG = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listG) {
                Xe.f name = ((Z) obj).getName();
                AbstractC5504s.g(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map O(b bVar) {
            List listH = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(listH, 10)), 16));
            for (Object obj : listH) {
                Xe.f name = ((l0) obj).getName();
                AbstractC5504s.g(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set P(b bVar, w wVar) {
            List list = bVar.f55524b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f55536n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(mf.L.b(wVar2.s().g(), ((Se.o) ((Ze.p) it.next())).h0()));
            }
            return a0.l(linkedHashSet, wVar.x());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List r(b bVar) {
            return AbstractC2279u.I0(bVar.I(), bVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List s(b bVar) {
            return AbstractC2279u.I0(bVar.J(), bVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List u() {
            Set setW = this.f55536n.w();
            ArrayList arrayList = new ArrayList();
            Iterator it = setW.iterator();
            while (it.hasNext()) {
                AbstractC2279u.D(arrayList, x((Xe.f) it.next()));
            }
            return arrayList;
        }

        private final List v() {
            Set setX = this.f55536n.x();
            ArrayList arrayList = new ArrayList();
            Iterator it = setX.iterator();
            while (it.hasNext()) {
                AbstractC2279u.D(arrayList, y((Xe.f) it.next()));
            }
            return arrayList;
        }

        private final List w() {
            List list = this.f55523a;
            w wVar = this.f55536n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g0 g0VarS = wVar.s().f().s((Se.j) ((Ze.p) it.next()));
                if (!wVar.A(g0VarS)) {
                    g0VarS = null;
                }
                if (g0VarS != null) {
                    arrayList.add(g0VarS);
                }
            }
            return arrayList;
        }

        private final List x(Xe.f fVar) {
            List listI = I();
            w wVar = this.f55536n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (AbstractC5504s.c(((InterfaceC7235m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.n(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List y(Xe.f fVar) {
            List listJ = J();
            w wVar = this.f55536n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (AbstractC5504s.c(((InterfaceC7235m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List z() {
            List list = this.f55524b;
            w wVar = this.f55536n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Z zU = wVar.s().f().u((Se.o) ((Ze.p) it.next()));
                if (zU != null) {
                    arrayList.add(zU);
                }
            }
            return arrayList;
        }

        @Override // of.w.a
        public Collection a(Xe.f name, Ge.b location) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(location, "location");
            if (!d().contains(name)) {
                return AbstractC2279u.m();
            }
            Collection collection = (Collection) L().get(name);
            return collection == null ? AbstractC2279u.m() : collection;
        }

        @Override // of.w.a
        public Set b() {
            return (Set) AbstractC6048m.a(this.f55534l, this, f55522o[8]);
        }

        @Override // of.w.a
        public Collection c(Xe.f name, Ge.b location) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(location, "location");
            if (!b().contains(name)) {
                return AbstractC2279u.m();
            }
            Collection collection = (Collection) K().get(name);
            return collection == null ? AbstractC2279u.m() : collection;
        }

        @Override // of.w.a
        public Set d() {
            return (Set) AbstractC6048m.a(this.f55535m, this, f55522o[9]);
        }

        @Override // of.w.a
        public Set e() {
            List list = this.f55525c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar = this.f55536n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(mf.L.b(wVar.s().g(), ((Se.s) ((Ze.p) it.next())).b0()));
            }
            return linkedHashSet;
        }

        @Override // of.w.a
        public l0 f(Xe.f name) {
            AbstractC5504s.h(name, "name");
            return (l0) M().get(name);
        }

        @Override // of.w.a
        public void g(Collection result, C5380d kindFilter, Function1 nameFilter, Ge.b location) {
            AbstractC5504s.h(result, "result");
            AbstractC5504s.h(kindFilter, "kindFilter");
            AbstractC5504s.h(nameFilter, "nameFilter");
            AbstractC5504s.h(location, "location");
            if (kindFilter.a(C5380d.f51759c.i())) {
                for (Object obj : G()) {
                    Xe.f name = ((Z) obj).getName();
                    AbstractC5504s.g(name, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(C5380d.f51759c.d())) {
                for (Object obj2 : F()) {
                    Xe.f name2 = ((g0) obj2).getName();
                    AbstractC5504s.g(name2, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ InterfaceC6023m[] f55537j = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(c.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(c.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f55538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f55539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f55540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6042g f55541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC6042g f55542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InterfaceC6043h f55543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InterfaceC6044i f55544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InterfaceC6044i f55545h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w f55546i;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ze.r f55547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f55548b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w f55549c;

            public a(Ze.r rVar, ByteArrayInputStream byteArrayInputStream, w wVar) {
                this.f55547a = rVar;
                this.f55548b = byteArrayInputStream;
                this.f55549c = wVar;
            }

            @Override // ie.InterfaceC5082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Ze.p invoke() {
                return (Ze.p) this.f55547a.a(this.f55548b, this.f55549c.s().c().k());
            }
        }

        public c(w wVar, List functionList, List propertyList, List typeAliasList) throws IOException {
            Map mapI;
            AbstractC5504s.h(functionList, "functionList");
            AbstractC5504s.h(propertyList, "propertyList");
            AbstractC5504s.h(typeAliasList, "typeAliasList");
            this.f55546i = wVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Xe.f fVarB = mf.L.b(wVar.s().g(), ((Se.j) ((Ze.p) obj)).i0());
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f55538a = r(linkedHashMap);
            w wVar2 = this.f55546i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                Xe.f fVarB2 = mf.L.b(wVar2.s().g(), ((Se.o) ((Ze.p) obj2)).h0());
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f55539b = r(linkedHashMap2);
            if (this.f55546i.s().c().g().c()) {
                w wVar3 = this.f55546i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    Xe.f fVarB3 = mf.L.b(wVar3.s().g(), ((Se.s) ((Ze.p) obj3)).b0());
                    Object arrayList3 = linkedHashMap3.get(fVarB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(fVarB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapI = r(linkedHashMap3);
            } else {
                mapI = Ud.S.i();
            }
            this.f55540c = mapI;
            this.f55541d = this.f55546i.s().h().h(new H(this));
            this.f55542e = this.f55546i.s().h().h(new I(this));
            this.f55543f = this.f55546i.s().h().d(new J(this));
            this.f55544g = this.f55546i.s().h().c(new K(this, this.f55546i));
            this.f55545h = this.f55546i.s().h().c(new L(this, this.f55546i));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Collection m(Xe.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f55538a
                Ze.r r1 = Se.j.f16326x
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.AbstractC5504s.g(r1, r2)
                of.w r2 = r5.f55546i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                of.w r3 = r5.f55546i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                of.w$c$a r0 = new of.w$c$a
                r0.<init>(r1, r4, r3)
                Cf.i r0 = Cf.l.n(r0)
                java.util.List r0 = Cf.l.T(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = Ud.AbstractC2279u.m()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L64
                java.lang.Object r3 = r0.next()
                Se.j r3 = (Se.j) r3
                mf.p r4 = r2.s()
                mf.K r4 = r4.f()
                kotlin.jvm.internal.AbstractC5504s.e(r3)
                ye.g0 r3 = r4.s(r3)
                boolean r4 = r2.A(r3)
                if (r4 == 0) goto L5d
                goto L5e
            L5d:
                r3 = 0
            L5e:
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L64:
                r2.n(r6, r1)
                java.util.List r6 = Af.a.c(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: of.w.c.m(Xe.f):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Collection n(Xe.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f55539b
                Ze.r r1 = Se.o.f16410x
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.AbstractC5504s.g(r1, r2)
                of.w r2 = r5.f55546i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                of.w r3 = r5.f55546i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                of.w$c$a r0 = new of.w$c$a
                r0.<init>(r1, r4, r3)
                Cf.i r0 = Cf.l.n(r0)
                java.util.List r0 = Cf.l.T(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = Ud.AbstractC2279u.m()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5c
                java.lang.Object r3 = r0.next()
                Se.o r3 = (Se.o) r3
                mf.p r4 = r2.s()
                mf.K r4 = r4.f()
                kotlin.jvm.internal.AbstractC5504s.e(r3)
                ye.Z r3 = r4.u(r3)
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L5c:
                r2.o(r6, r1)
                java.util.List r6 = Af.a.c(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: of.w.c.n(Xe.f):java.util.Collection");
        }

        private final l0 o(Xe.f fVar) {
            Se.s sVarS0;
            byte[] bArr = (byte[]) this.f55540c.get(fVar);
            if (bArr == null || (sVarS0 = Se.s.s0(new ByteArrayInputStream(bArr), this.f55546i.s().c().k())) == null) {
                return null;
            }
            return this.f55546i.s().f().z(sVarS0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set p(c cVar, w wVar) {
            return a0.l(cVar.f55538a.keySet(), wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection q(c cVar, Xe.f it) {
            AbstractC5504s.h(it, "it");
            return cVar.m(it);
        }

        private final Map r(Map map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(Ud.S.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((Ze.a) it.next()).h(byteArrayOutputStream);
                    arrayList.add(Td.L.f17438a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection s(c cVar, Xe.f it) {
            AbstractC5504s.h(it, "it");
            return cVar.n(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l0 t(c cVar, Xe.f it) {
            AbstractC5504s.h(it, "it");
            return cVar.o(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set u(c cVar, w wVar) {
            return a0.l(cVar.f55539b.keySet(), wVar.x());
        }

        @Override // of.w.a
        public Collection a(Xe.f name, Ge.b location) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(location, "location");
            return !d().contains(name) ? AbstractC2279u.m() : (Collection) this.f55542e.invoke(name);
        }

        @Override // of.w.a
        public Set b() {
            return (Set) AbstractC6048m.a(this.f55544g, this, f55537j[0]);
        }

        @Override // of.w.a
        public Collection c(Xe.f name, Ge.b location) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(location, "location");
            return !b().contains(name) ? AbstractC2279u.m() : (Collection) this.f55541d.invoke(name);
        }

        @Override // of.w.a
        public Set d() {
            return (Set) AbstractC6048m.a(this.f55545h, this, f55537j[1]);
        }

        @Override // of.w.a
        public Set e() {
            return this.f55540c.keySet();
        }

        @Override // of.w.a
        public l0 f(Xe.f name) {
            AbstractC5504s.h(name, "name");
            return (l0) this.f55543f.invoke(name);
        }

        @Override // of.w.a
        public void g(Collection result, C5380d kindFilter, Function1 nameFilter, Ge.b location) {
            AbstractC5504s.h(result, "result");
            AbstractC5504s.h(kindFilter, "kindFilter");
            AbstractC5504s.h(nameFilter, "nameFilter");
            AbstractC5504s.h(location, "location");
            if (kindFilter.a(C5380d.f51759c.i())) {
                Set<Xe.f> setD = d();
                ArrayList arrayList = new ArrayList();
                for (Xe.f fVar : setD) {
                    if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                        arrayList.addAll(a(fVar, location));
                    }
                }
                bf.l INSTANCE = bf.l.f33310a;
                AbstractC5504s.g(INSTANCE, "INSTANCE");
                AbstractC2279u.B(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(C5380d.f51759c.d())) {
                Set<Xe.f> setB = b();
                ArrayList arrayList2 = new ArrayList();
                for (Xe.f fVar2 : setB) {
                    if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                        arrayList2.addAll(c(fVar2, location));
                    }
                }
                bf.l INSTANCE2 = bf.l.f33310a;
                AbstractC5504s.g(INSTANCE2, "INSTANCE");
                AbstractC2279u.B(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }
    }

    protected w(C5685p c10, List functionList, List propertyList, List typeAliasList, InterfaceC5082a classNames) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(functionList, "functionList");
        AbstractC5504s.h(propertyList, "propertyList");
        AbstractC5504s.h(typeAliasList, "typeAliasList");
        AbstractC5504s.h(classNames, "classNames");
        this.f55518b = c10;
        this.f55519c = q(functionList, propertyList, typeAliasList);
        this.f55520d = c10.h().c(new u(classNames));
        this.f55521e = c10.h().g(new v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(InterfaceC5082a interfaceC5082a) {
        return AbstractC2279u.f1((Iterable) interfaceC5082a.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set l(w wVar) {
        Set setV = wVar.v();
        if (setV == null) {
            return null;
        }
        return a0.l(a0.l(wVar.t(), wVar.f55519c.e()), setV);
    }

    private final a q(List list, List list2, List list3) {
        return this.f55518b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final InterfaceC7227e r(Xe.f fVar) {
        return this.f55518b.c().b(p(fVar));
    }

    private final Set u() {
        return (Set) AbstractC6048m.b(this.f55521e, this, f55517f[1]);
    }

    private final l0 y(Xe.f fVar) {
        return this.f55519c.f(fVar);
    }

    protected boolean A(g0 function) {
        AbstractC5504s.h(function, "function");
        return true;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return this.f55519c.a(name, location);
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set b() {
        return this.f55519c.b();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return this.f55519c.c(name, location);
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set d() {
        return this.f55519c.d();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        if (z(name)) {
            return r(name);
        }
        if (this.f55519c.e().contains(name)) {
            return y(name);
        }
        return null;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set f() {
        return u();
    }

    protected abstract void j(Collection collection, Function1 function1);

    protected final Collection m(C5380d kindFilter, Function1 nameFilter, Ge.b location) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        AbstractC5504s.h(location, "location");
        ArrayList arrayList = new ArrayList(0);
        C5380d.a aVar = C5380d.f51759c;
        if (kindFilter.a(aVar.g())) {
            j(arrayList, nameFilter);
        }
        this.f55519c.g(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (Xe.f fVar : t()) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    Af.a.a(arrayList, r(fVar));
                }
            }
        }
        if (kindFilter.a(C5380d.f51759c.h())) {
            for (Xe.f fVar2 : this.f55519c.e()) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    Af.a.a(arrayList, this.f55519c.f(fVar2));
                }
            }
        }
        return Af.a.c(arrayList);
    }

    protected void n(Xe.f name, List functions) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(functions, "functions");
    }

    protected void o(Xe.f name, List descriptors) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(descriptors, "descriptors");
    }

    protected abstract Xe.b p(Xe.f fVar);

    protected final C5685p s() {
        return this.f55518b;
    }

    public final Set t() {
        return (Set) AbstractC6048m.a(this.f55520d, this, f55517f[0]);
    }

    protected abstract Set v();

    protected abstract Set w();

    protected abstract Set x();

    protected boolean z(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return t().contains(name);
    }
}
