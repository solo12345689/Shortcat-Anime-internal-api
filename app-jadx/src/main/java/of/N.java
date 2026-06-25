package of;

import kotlin.jvm.internal.AbstractC5504s;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.Z;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class N extends Be.K implements InterfaceC5879b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Se.o f55434C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Ue.d f55435D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Ue.h f55436E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Ue.i f55437F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final InterfaceC5895s f55438G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC7235m containingDeclaration, Z z10, InterfaceC7374h annotations, ye.E modality, AbstractC7242u visibility, boolean z11, Xe.f name, InterfaceC7224b.a kind, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Se.o proto, Ue.d nameResolver, Ue.h typeTable, Ue.i versionRequirementTable, InterfaceC5895s interfaceC5895s) {
        super(containingDeclaration, z10, annotations, modality, visibility, z11, name, kind, h0.f65112a, z12, z13, z16, false, z14, z15);
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(modality, "modality");
        AbstractC5504s.h(visibility, "visibility");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        AbstractC5504s.h(versionRequirementTable, "versionRequirementTable");
        this.f55434C = proto;
        this.f55435D = nameResolver;
        this.f55436E = typeTable;
        this.f55437F = versionRequirementTable;
        this.f55438G = interfaceC5895s;
    }

    @Override // of.InterfaceC5896t
    public Ue.h E() {
        return this.f55436E;
    }

    @Override // of.InterfaceC5896t
    public Ue.d I() {
        return this.f55435D;
    }

    @Override // of.InterfaceC5896t
    public InterfaceC5895s J() {
        return this.f55438G;
    }

    @Override // Be.K
    protected Be.K P0(InterfaceC7235m newOwner, ye.E newModality, AbstractC7242u newVisibility, Z z10, InterfaceC7224b.a kind, Xe.f newName, h0 source) {
        AbstractC5504s.h(newOwner, "newOwner");
        AbstractC5504s.h(newModality, "newModality");
        AbstractC5504s.h(newVisibility, "newVisibility");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(newName, "newName");
        AbstractC5504s.h(source, "source");
        return new N(newOwner, z10, getAnnotations(), newModality, newVisibility, N(), newName, kind, z0(), d0(), isExternal(), B(), m0(), h0(), I(), E(), g1(), J());
    }

    @Override // of.InterfaceC5896t
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public Se.o h0() {
        return this.f55434C;
    }

    public Ue.i g1() {
        return this.f55437F;
    }

    @Override // Be.K, ye.D
    public boolean isExternal() {
        Boolean boolD = Ue.b.f19533E.d(h0().f0());
        AbstractC5504s.g(boolD, "get(...)");
        return boolD.booleanValue();
    }
}
