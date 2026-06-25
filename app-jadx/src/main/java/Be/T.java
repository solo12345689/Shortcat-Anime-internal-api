package Be;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.InterfaceC5474f;
import kf.InterfaceC5475g;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6023m;
import pf.InterfaceC6045j;
import qf.AbstractC6183d0;
import qf.AbstractC6191h0;
import qf.G0;
import qf.N0;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.c0;
import ye.h0;
import ye.l0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class T extends AbstractC1123s implements Q {

    /* JADX INFO: renamed from: E */
    private final pf.n f1744E;

    /* JADX INFO: renamed from: F */
    private final l0 f1745F;

    /* JADX INFO: renamed from: G */
    private final InterfaceC6045j f1746G;

    /* JADX INFO: renamed from: H */
    private InterfaceC7226d f1747H;

    /* JADX INFO: renamed from: X */
    static final /* synthetic */ InterfaceC6023m[] f1743X = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(T.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};

    /* JADX INFO: renamed from: I */
    public static final a f1742I = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G0 c(l0 l0Var) {
            if (l0Var.u() == null) {
                return null;
            }
            return G0.f(l0Var.G());
        }

        public final Q b(pf.n storageManager, l0 typeAliasDescriptor, InterfaceC7226d constructor) {
            InterfaceC7226d interfaceC7226dC;
            List listM;
            AbstractC5504s.h(storageManager, "storageManager");
            AbstractC5504s.h(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC5504s.h(constructor, "constructor");
            G0 g0C = c(typeAliasDescriptor);
            if (g0C == null || (interfaceC7226dC = constructor.c(g0C)) == null) {
                return null;
            }
            InterfaceC7374h annotations = constructor.getAnnotations();
            InterfaceC7224b.a aVarH = constructor.h();
            AbstractC5504s.g(aVarH, "getKind(...)");
            h0 h0VarK = typeAliasDescriptor.k();
            AbstractC5504s.g(h0VarK, "getSource(...)");
            T t10 = new T(storageManager, typeAliasDescriptor, interfaceC7226dC, null, annotations, aVarH, h0VarK, null);
            List listO0 = AbstractC1123s.O0(t10, constructor.j(), g0C);
            if (listO0 == null) {
                return null;
            }
            AbstractC6183d0 abstractC6183d0C = qf.L.c(interfaceC7226dC.getReturnType().Q0());
            AbstractC6183d0 abstractC6183d0P = typeAliasDescriptor.p();
            AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
            AbstractC6183d0 abstractC6183d0J = AbstractC6191h0.j(abstractC6183d0C, abstractC6183d0P);
            c0 c0VarK = constructor.K();
            c0 c0VarI = c0VarK != null ? bf.h.i(t10, g0C.n(c0VarK.getType(), N0.f57999e), InterfaceC7374h.f66223k0.b()) : null;
            InterfaceC7227e interfaceC7227eU = typeAliasDescriptor.u();
            if (interfaceC7227eU != null) {
                List listY0 = constructor.y0();
                AbstractC5504s.g(listY0, "getContextReceiverParameters(...)");
                listM = new ArrayList(AbstractC2279u.x(listY0, 10));
                int i10 = 0;
                for (Object obj : listY0) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC2279u.w();
                    }
                    c0 c0Var = (c0) obj;
                    qf.S sN = g0C.n(c0Var.getType(), N0.f57999e);
                    InterfaceC5475g value = c0Var.getValue();
                    AbstractC5504s.f(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listM.add(bf.h.c(interfaceC7227eU, sN, ((InterfaceC5474f) value).a(), InterfaceC7374h.f66223k0.b(), i10));
                    i10 = i11;
                }
            } else {
                listM = AbstractC2279u.m();
            }
            t10.R0(c0VarI, null, listM, typeAliasDescriptor.q(), listO0, abstractC6183d0J, ye.E.f65060b, typeAliasDescriptor.getVisibility());
            return t10;
        }

        private a() {
        }
    }

    public /* synthetic */ T(pf.n nVar, l0 l0Var, InterfaceC7226d interfaceC7226d, Q q10, InterfaceC7374h interfaceC7374h, InterfaceC7224b.a aVar, h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, l0Var, interfaceC7226d, q10, interfaceC7374h, aVar, h0Var);
    }

    public static final T r1(T t10, InterfaceC7226d interfaceC7226d) {
        pf.n nVar = t10.f1744E;
        l0 l0VarP1 = t10.p1();
        InterfaceC7374h annotations = interfaceC7226d.getAnnotations();
        InterfaceC7224b.a aVarH = interfaceC7226d.h();
        AbstractC5504s.g(aVarH, "getKind(...)");
        h0 h0VarK = t10.p1().k();
        AbstractC5504s.g(h0VarK, "getSource(...)");
        T t11 = new T(nVar, l0VarP1, interfaceC7226d, t10, annotations, aVarH, h0VarK);
        G0 g0C = f1742I.c(t10.p1());
        if (g0C == null) {
            return null;
        }
        c0 c0VarK = interfaceC7226d.K();
        c0 c0VarC = c0VarK != null ? c0VarK.c(g0C) : null;
        List listY0 = interfaceC7226d.y0();
        AbstractC5504s.g(listY0, "getContextReceiverParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listY0, 10));
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            arrayList.add(((c0) it.next()).c(g0C));
        }
        t11.R0(null, c0VarC, arrayList, t10.p1().q(), t10.j(), t10.getReturnType(), ye.E.f65060b, t10.p1().getVisibility());
        return t11;
    }

    @Override // Be.Q
    public InterfaceC7226d R() {
        return this.f1747H;
    }

    @Override // ye.InterfaceC7234l
    public boolean e0() {
        return R().e0();
    }

    @Override // ye.InterfaceC7234l
    public InterfaceC7227e f0() {
        InterfaceC7227e interfaceC7227eF0 = R().f0();
        AbstractC5504s.g(interfaceC7227eF0, "getConstructedClass(...)");
        return interfaceC7227eF0;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7223a
    public qf.S getReturnType() {
        qf.S returnType = super.getReturnType();
        AbstractC5504s.e(returnType);
        return returnType;
    }

    @Override // ye.InterfaceC7224b
    /* JADX INFO: renamed from: l1 */
    public Q l0(InterfaceC7235m newOwner, ye.E modality, AbstractC7242u visibility, InterfaceC7224b.a kind, boolean z10) {
        AbstractC5504s.h(newOwner, "newOwner");
        AbstractC5504s.h(modality, "modality");
        AbstractC5504s.h(visibility, "visibility");
        AbstractC5504s.h(kind, "kind");
        InterfaceC7247z interfaceC7247zBuild = v().n(newOwner).g(modality).h(visibility).i(kind).m(z10).build();
        AbstractC5504s.f(interfaceC7247zBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) interfaceC7247zBuild;
    }

    @Override // Be.AbstractC1123s
    /* JADX INFO: renamed from: m1 */
    public T L0(InterfaceC7235m newOwner, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a kind, Xe.f fVar, InterfaceC7374h annotations, h0 source) {
        AbstractC5504s.h(newOwner, "newOwner");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(source, "source");
        InterfaceC7224b.a aVar = InterfaceC7224b.a.DECLARATION;
        if (kind != aVar) {
            InterfaceC7224b.a aVar2 = InterfaceC7224b.a.SYNTHESIZED;
        }
        return new T(this.f1744E, p1(), R(), this, annotations, aVar, source);
    }

    @Override // Be.AbstractC1119n, ye.InterfaceC7235m
    /* JADX INFO: renamed from: n1 */
    public l0 b() {
        return p1();
    }

    @Override // Be.AbstractC1123s, Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    /* JADX INFO: renamed from: o1 */
    public Q a() {
        InterfaceC7247z interfaceC7247zA = super.a();
        AbstractC5504s.f(interfaceC7247zA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) interfaceC7247zA;
    }

    public l0 p1() {
        return this.f1745F;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z, ye.j0
    /* JADX INFO: renamed from: q1 */
    public Q c(G0 substitutor) {
        AbstractC5504s.h(substitutor, "substitutor");
        InterfaceC7247z interfaceC7247zC = super.c(substitutor);
        AbstractC5504s.f(interfaceC7247zC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        T t10 = (T) interfaceC7247zC;
        G0 g0F = G0.f(t10.getReturnType());
        AbstractC5504s.g(g0F, "create(...)");
        InterfaceC7226d interfaceC7226dC = R().a().c(g0F);
        if (interfaceC7226dC == null) {
            return null;
        }
        t10.f1747H = interfaceC7226dC;
        return t10;
    }

    private T(pf.n nVar, l0 l0Var, InterfaceC7226d interfaceC7226d, Q q10, InterfaceC7374h interfaceC7374h, InterfaceC7224b.a aVar, h0 h0Var) {
        super(l0Var, q10, interfaceC7374h, Xe.h.f21789j, aVar, h0Var);
        this.f1744E = nVar;
        this.f1745F = l0Var;
        V0(p1().Y());
        this.f1746G = nVar.g(new S(this, interfaceC7226d));
        this.f1747H = interfaceC7226d;
    }
}
