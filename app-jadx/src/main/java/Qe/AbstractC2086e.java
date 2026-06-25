package Qe;

import Qe.A;
import Qe.x;
import Se.c;
import Ud.AbstractC2279u;
import Ve.a;
import We.d;
import Xe.b;
import Ze.i;
import be.AbstractC3048a;
import gf.C4881d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.EnumC5673d;
import mf.InterfaceC5677h;
import mf.N;
import ue.C6768a;
import ye.h0;

/* JADX INFO: renamed from: Qe.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2086e implements InterfaceC5677h {

    /* JADX INFO: renamed from: b */
    public static final b f14841b = new b(null);

    /* JADX INFO: renamed from: a */
    private final v f14842a;

    /* JADX INFO: renamed from: Qe.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public abstract Map a();
    }

    /* JADX INFO: renamed from: Qe.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(N container, boolean z10, boolean z11, Boolean bool, boolean z12, v kotlinClassFinder, Ue.c metadataVersion) {
            N.a aVarH;
            AbstractC5504s.h(container, "container");
            AbstractC5504s.h(kotlinClassFinder, "kotlinClassFinder");
            AbstractC5504s.h(metadataVersion, "metadataVersion");
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof N.a) {
                    N.a aVar = (N.a) container;
                    if (aVar.g() == c.EnumC0282c.INTERFACE) {
                        Xe.b bVarE = aVar.e();
                        Xe.f fVarM = Xe.f.m("DefaultImpls");
                        AbstractC5504s.g(fVarM, "identifier(...)");
                        return w.b(kotlinClassFinder, bVarE.d(fVarM), metadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof N.b)) {
                    h0 h0VarC = container.c();
                    r rVar = h0VarC instanceof r ? (r) h0VarC : null;
                    C4881d c4881dF = rVar != null ? rVar.f() : null;
                    if (c4881dF != null) {
                        b.a aVar2 = Xe.b.f21759d;
                        String strF = c4881dF.f();
                        AbstractC5504s.g(strF, "getInternalName(...)");
                        return w.b(kotlinClassFinder, aVar2.c(new Xe.c(Df.r.J(strF, '/', com.amazon.a.a.o.c.a.b.f34706a, false, 4, null))), metadataVersion);
                    }
                }
            }
            if (z11 && (container instanceof N.a)) {
                N.a aVar3 = (N.a) container;
                if (aVar3.g() == c.EnumC0282c.COMPANION_OBJECT && (aVarH = aVar3.h()) != null && (aVarH.g() == c.EnumC0282c.CLASS || aVarH.g() == c.EnumC0282c.ENUM_CLASS || (z12 && (aVarH.g() == c.EnumC0282c.INTERFACE || aVarH.g() == c.EnumC0282c.ANNOTATION_CLASS)))) {
                    h0 h0VarC2 = aVarH.c();
                    z zVar = h0VarC2 instanceof z ? (z) h0VarC2 : null;
                    if (zVar != null) {
                        return zVar.d();
                    }
                    return null;
                }
            }
            if (!(container instanceof N.b) || !(container.c() instanceof r)) {
                return null;
            }
            h0 h0VarC3 = container.c();
            AbstractC5504s.f(h0VarC3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            r rVar2 = (r) h0VarC3;
            x xVarG = rVar2.g();
            return xVarG == null ? w.b(kotlinClassFinder, rVar2.d(), metadataVersion) : xVarG;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: Qe.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends Enum {

        /* JADX INFO: renamed from: a */
        public static final c f14843a = new c("PROPERTY", 0);

        /* JADX INFO: renamed from: b */
        public static final c f14844b = new c("BACKING_FIELD", 1);

        /* JADX INFO: renamed from: c */
        public static final c f14845c = new c("DELEGATE_FIELD", 2);

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ c[] f14846d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ EnumEntries f14847e;

        static {
            c[] cVarArrA = a();
            f14846d = cVarArrA;
            f14847e = AbstractC3048a.a(cVarArrA);
        }

        private c(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f14843a, f14844b, f14845c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f14846d.clone();
        }
    }

    /* JADX INFO: renamed from: Qe.e$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14848a;

        static {
            int[] iArr = new int[EnumC5673d.values().length];
            try {
                iArr[EnumC5673d.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5673d.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5673d.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14848a = iArr;
        }
    }

    public AbstractC2086e(v kotlinClassFinder) {
        AbstractC5504s.h(kotlinClassFinder, "kotlinClassFinder");
        this.f14842a = kotlinClassFinder;
    }

    private final x A(N.a aVar) {
        h0 h0VarC = aVar.c();
        z zVar = h0VarC instanceof z ? (z) h0VarC : null;
        if (zVar != null) {
            return zVar.d();
        }
        return null;
    }

    private final int m(N n10, Ze.p pVar) {
        if (pVar instanceof Se.j) {
            return Ue.g.g((Se.j) pVar) ? 1 : 0;
        }
        if (pVar instanceof Se.o) {
            return Ue.g.h((Se.o) pVar) ? 1 : 0;
        }
        if (!(pVar instanceof Se.e)) {
            throw new UnsupportedOperationException("Unsupported message: " + pVar.getClass());
        }
        AbstractC5504s.f(n10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        N.a aVar = (N.a) n10;
        if (aVar.g() == c.EnumC0282c.ENUM_CLASS) {
            return 2;
        }
        return aVar.i() ? 1 : 0;
    }

    private final List n(N n10, A a10, boolean z10, boolean z11, Boolean bool, boolean z12) {
        x xVarP = p(n10, f14841b.a(n10, z10, z11, bool, z12, this.f14842a, v()));
        if (xVarP == null) {
            return AbstractC2279u.m();
        }
        List list = (List) q(xVarP).a().get(a10);
        return list == null ? AbstractC2279u.m() : list;
    }

    static /* synthetic */ List o(AbstractC2086e abstractC2086e, N n10, A a10, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        }
        return abstractC2086e.n(n10, a10, z10, z11, bool, z12);
    }

    public static /* synthetic */ A t(AbstractC2086e abstractC2086e, Ze.p pVar, Ue.d dVar, Ue.h hVar, EnumC5673d enumC5673d, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractC2086e.s(pVar, dVar, hVar, enumC5673d, z10);
    }

    private final List z(N n10, Se.o oVar, c cVar) {
        Boolean boolD = Ue.b.f19530B.d(oVar.f0());
        AbstractC5504s.g(boolD, "get(...)");
        boolD.booleanValue();
        boolean zF = We.h.f(oVar);
        if (cVar == c.f14843a) {
            A aB = AbstractC2087f.b(oVar, n10.b(), n10.d(), false, true, false, 40, null);
            return aB == null ? AbstractC2279u.m() : o(this, n10, aB, true, false, boolD, zF, 8, null);
        }
        A aB2 = AbstractC2087f.b(oVar, n10.b(), n10.d(), true, false, false, 48, null);
        if (aB2 == null) {
            return AbstractC2279u.m();
        }
        return Df.r.W(aB2.a(), "$delegate", false, 2, null) != (cVar == c.f14845c) ? AbstractC2279u.m() : n(n10, aB2, true, true, boolD, zF);
    }

    @Override // mf.InterfaceC5677h
    public List a(Se.t proto, Ue.d nameResolver) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        Object objV = proto.v(Ve.a.f20035h);
        AbstractC5504s.g(objV, "getExtension(...)");
        Iterable<Se.b> iterable = (Iterable) objV;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(iterable, 10));
        for (Se.b bVar : iterable) {
            AbstractC5504s.e(bVar);
            arrayList.add(d(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List b(N container, Se.h proto) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        return o(this, container, A.f14801b.a(container.b().getString(proto.G()), We.b.b(((N.a) container).e().b())), false, false, null, false, 60, null);
    }

    @Override // mf.InterfaceC5677h
    public List c(N container, Ze.p proto, EnumC5673d kind) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(kind, "kind");
        A aT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return aT != null ? o(this, container, A.f14801b.e(aT, 0), false, false, null, false, 60, null) : AbstractC2279u.m();
    }

    @Override // mf.InterfaceC5677h
    public abstract Object d(Se.b bVar, Ue.d dVar);

    @Override // mf.InterfaceC5677h
    public List e(N container, Ze.p callableProto, EnumC5673d kind, int i10, Se.v proto) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(callableProto, "callableProto");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(proto, "proto");
        A aT = t(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (aT == null) {
            return AbstractC2279u.m();
        }
        return o(this, container, A.f14801b.e(aT, i10 + m(container, callableProto)), false, false, null, false, 60, null);
    }

    @Override // mf.InterfaceC5677h
    public List f(N container, Se.o proto) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        return z(container, proto, c.f14844b);
    }

    @Override // mf.InterfaceC5677h
    public List g(N container, Se.o proto) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        return z(container, proto, c.f14845c);
    }

    @Override // mf.InterfaceC5677h
    public List h(N container, Ze.p proto, EnumC5673d kind) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(kind, "kind");
        if (kind == EnumC5673d.PROPERTY) {
            return z(container, (Se.o) proto, c.f14843a);
        }
        A aT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return aT == null ? AbstractC2279u.m() : o(this, container, aT, false, false, null, false, 60, null);
    }

    @Override // mf.InterfaceC5677h
    public List i(Se.r proto, Ue.d nameResolver) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        Object objV = proto.v(Ve.a.f20033f);
        AbstractC5504s.g(objV, "getExtension(...)");
        Iterable<Se.b> iterable = (Iterable) objV;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(iterable, 10));
        for (Se.b bVar : iterable) {
            AbstractC5504s.e(bVar);
            arrayList.add(d(bVar, nameResolver));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List j(N.a container) {
        AbstractC5504s.h(container, "container");
        x xVarA = A(container);
        if (xVarA != null) {
            ArrayList arrayList = new ArrayList(1);
            xVarA.b(new C0249e(arrayList), r(xVarA));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    protected final x p(N container, x xVar) {
        AbstractC5504s.h(container, "container");
        if (xVar != null) {
            return xVar;
        }
        if (container instanceof N.a) {
            return A((N.a) container);
        }
        return null;
    }

    protected abstract a q(x xVar);

    protected byte[] r(x kotlinClass) {
        AbstractC5504s.h(kotlinClass, "kotlinClass");
        return null;
    }

    protected final A s(Ze.p proto, Ue.d nameResolver, Ue.h typeTable, EnumC5673d kind, boolean z10) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        AbstractC5504s.h(kind, "kind");
        if (proto instanceof Se.e) {
            A.a aVar = A.f14801b;
            d.b bVarB = We.h.f20878a.b((Se.e) proto, nameResolver, typeTable);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (proto instanceof Se.j) {
            A.a aVar2 = A.f14801b;
            d.b bVarE = We.h.f20878a.e((Se.j) proto, nameResolver, typeTable);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (proto instanceof Se.o) {
            i.f propertySignature = Ve.a.f20031d;
            AbstractC5504s.g(propertySignature, "propertySignature");
            a.d dVar = (a.d) Ue.f.a((i.d) proto, propertySignature);
            if (dVar == null) {
                return null;
            }
            int i10 = d.f14848a[kind.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return AbstractC2087f.a((Se.o) proto, nameResolver, typeTable, true, true, z10);
                }
                if (!dVar.I()) {
                    return null;
                }
                A.a aVar3 = A.f14801b;
                a.c cVarD = dVar.D();
                AbstractC5504s.g(cVarD, "getSetter(...)");
                return aVar3.c(nameResolver, cVarD);
            }
            if (dVar.H()) {
                A.a aVar4 = A.f14801b;
                a.c cVarC = dVar.C();
                AbstractC5504s.g(cVarC, "getGetter(...)");
                return aVar4.c(nameResolver, cVarC);
            }
        }
        return null;
    }

    protected final v u() {
        return this.f14842a;
    }

    public abstract Ue.c v();

    protected final boolean w(Xe.b classId) {
        x xVarB;
        AbstractC5504s.h(classId, "classId");
        return classId.e() != null && AbstractC5504s.c(classId.h().b(), "Container") && (xVarB = w.b(this.f14842a, classId, v())) != null && C6768a.f61506a.c(xVarB);
    }

    protected abstract x.a x(Xe.b bVar, h0 h0Var, List list);

    protected final x.a y(Xe.b annotationClassId, h0 source, List result) {
        AbstractC5504s.h(annotationClassId, "annotationClassId");
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(result, "result");
        if (C6768a.f61506a.b().contains(annotationClassId)) {
            return null;
        }
        return x(annotationClassId, source, result);
    }

    /* JADX INFO: renamed from: Qe.e$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0249e implements x.c {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f14850b;

        C0249e(ArrayList arrayList) {
            this.f14850b = arrayList;
        }

        @Override // Qe.x.c
        public x.a b(Xe.b classId, h0 source) {
            AbstractC5504s.h(classId, "classId");
            AbstractC5504s.h(source, "source");
            return AbstractC2086e.this.y(classId, source, this.f14850b);
        }

        @Override // Qe.x.c
        public void a() {
        }
    }
}
