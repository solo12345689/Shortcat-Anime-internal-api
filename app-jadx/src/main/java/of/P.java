package of;

import Be.AbstractC1112g;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.F0;
import qf.G0;
import qf.N0;
import qf.W;
import ye.AbstractC7242u;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.h0;
import ye.l0;
import ye.q0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class P extends AbstractC1112g implements InterfaceC5896t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Se.s f55444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Ue.d f55445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Ue.h f55446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ue.i f55447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC5895s f55448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AbstractC6183d0 f55449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC6183d0 f55450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f55451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AbstractC6183d0 f55452s;

    /* JADX WARN: Illegal instructions before constructor call */
    public P(pf.n storageManager, InterfaceC7235m containingDeclaration, InterfaceC7374h annotations, Xe.f name, AbstractC7242u visibility, Se.s proto, Ue.d nameResolver, Ue.h typeTable, Ue.i versionRequirementTable, InterfaceC5895s interfaceC5895s) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(visibility, "visibility");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        AbstractC5504s.h(versionRequirementTable, "versionRequirementTable");
        h0 NO_SOURCE = h0.f65112a;
        AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f55444k = proto;
        this.f55445l = nameResolver;
        this.f55446m = typeTable;
        this.f55447n = versionRequirementTable;
        this.f55448o = interfaceC5895s;
    }

    @Override // of.InterfaceC5896t
    public Ue.h E() {
        return this.f55446m;
    }

    @Override // ye.l0
    public AbstractC6183d0 G() {
        AbstractC6183d0 abstractC6183d0 = this.f55450q;
        if (abstractC6183d0 != null) {
            return abstractC6183d0;
        }
        AbstractC5504s.u("expandedType");
        return null;
    }

    @Override // of.InterfaceC5896t
    public Ue.d I() {
        return this.f55445l;
    }

    @Override // of.InterfaceC5896t
    public InterfaceC5895s J() {
        return this.f55448o;
    }

    @Override // Be.AbstractC1112g
    protected List R0() {
        List list = this.f55451r;
        if (list != null) {
            return list;
        }
        AbstractC5504s.u("typeConstructorParameters");
        return null;
    }

    @Override // of.InterfaceC5896t
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public Se.s h0() {
        return this.f55444k;
    }

    public Ue.i V0() {
        return this.f55447n;
    }

    public final void W0(List declaredTypeParameters, AbstractC6183d0 underlyingType, AbstractC6183d0 expandedType) {
        AbstractC5504s.h(declaredTypeParameters, "declaredTypeParameters");
        AbstractC5504s.h(underlyingType, "underlyingType");
        AbstractC5504s.h(expandedType, "expandedType");
        S0(declaredTypeParameters);
        this.f55449p = underlyingType;
        this.f55450q = expandedType;
        this.f55451r = q0.g(this);
        this.f55452s = M0();
    }

    @Override // ye.j0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public l0 c(G0 substitutor) {
        AbstractC5504s.h(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        pf.n nVarM = M();
        InterfaceC7235m interfaceC7235mB = b();
        AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
        InterfaceC7374h annotations = getAnnotations();
        AbstractC5504s.g(annotations, "<get-annotations>(...)");
        Xe.f name = getName();
        AbstractC5504s.g(name, "getName(...)");
        P p10 = new P(nVarM, interfaceC7235mB, annotations, name, getVisibility(), h0(), I(), E(), V0(), J());
        List listQ = q();
        AbstractC6183d0 abstractC6183d0U0 = u0();
        N0 n02 = N0.f57999e;
        qf.S sN = substitutor.n(abstractC6183d0U0, n02);
        AbstractC5504s.g(sN, "safeSubstitute(...)");
        AbstractC6183d0 abstractC6183d0A = F0.a(sN);
        qf.S sN2 = substitutor.n(G(), n02);
        AbstractC5504s.g(sN2, "safeSubstitute(...)");
        p10.W0(listQ, abstractC6183d0A, F0.a(sN2));
        return p10;
    }

    @Override // ye.InterfaceC7230h
    public AbstractC6183d0 p() {
        AbstractC6183d0 abstractC6183d0 = this.f55452s;
        if (abstractC6183d0 != null) {
            return abstractC6183d0;
        }
        AbstractC5504s.u("defaultTypeImpl");
        return null;
    }

    @Override // ye.l0
    public InterfaceC7227e u() {
        if (W.a(G())) {
            return null;
        }
        InterfaceC7230h interfaceC7230hP = G().N0().p();
        if (interfaceC7230hP instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hP;
        }
        return null;
    }

    @Override // ye.l0
    public AbstractC6183d0 u0() {
        AbstractC6183d0 abstractC6183d0 = this.f55449p;
        if (abstractC6183d0 != null) {
            return abstractC6183d0;
        }
        AbstractC5504s.u("underlyingType");
        return null;
    }
}
