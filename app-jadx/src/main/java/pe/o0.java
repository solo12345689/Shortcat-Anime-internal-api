package Pe;

import He.C1657d;
import He.EnumC1656c;
import Le.C1878j;
import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.J0;
import qf.L0;
import ye.InterfaceC7227e;
import ze.InterfaceC7367a;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class o0 extends AbstractC2019d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7367a f13919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ke.k f13921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC1656c f13922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13923e;

    public /* synthetic */ o0(InterfaceC7367a interfaceC7367a, boolean z10, Ke.k kVar, EnumC1656c enumC1656c, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7367a, z10, kVar, enumC1656c, (i10 & 16) != 0 ? false : z11);
    }

    @Override // Pe.AbstractC2019d
    public boolean B(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return ve.i.e0((qf.S) iVar);
    }

    @Override // Pe.AbstractC2019d
    public boolean C() {
        return this.f13920b;
    }

    @Override // Pe.AbstractC2019d
    public boolean D(uf.i iVar, uf.i other) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(other, "other");
        return this.f13921c.a().k().c((qf.S) iVar, (qf.S) other);
    }

    @Override // Pe.AbstractC2019d
    public boolean E(uf.q qVar) {
        AbstractC5504s.h(qVar, "<this>");
        return qVar instanceof Le.c0;
    }

    @Override // Pe.AbstractC2019d
    public boolean F(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return ((qf.S) iVar).Q0() instanceof C2025j;
    }

    @Override // Pe.AbstractC2019d
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public boolean l(InterfaceC7369c interfaceC7369c, uf.i iVar) {
        AbstractC5504s.h(interfaceC7369c, "<this>");
        if ((interfaceC7369c instanceof Je.g) && ((Je.g) interfaceC7369c).d()) {
            return true;
        }
        if ((interfaceC7369c instanceof C1878j) && !u() && (((C1878j) interfaceC7369c).m() || q() == EnumC1656c.f8551f)) {
            return true;
        }
        return iVar != null && ve.i.r0((qf.S) iVar) && m().p(interfaceC7369c) && !this.f13921c.a().q().d();
    }

    @Override // Pe.AbstractC2019d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public C1657d m() {
        return this.f13921c.a().a();
    }

    @Override // Pe.AbstractC2019d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public qf.S v(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return L0.a((qf.S) iVar);
    }

    @Override // Pe.AbstractC2019d
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public uf.t A() {
        return rf.s.f58800a;
    }

    @Override // Pe.AbstractC2019d
    public Iterable n(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return ((qf.S) iVar).getAnnotations();
    }

    @Override // Pe.AbstractC2019d
    public Iterable p() {
        InterfaceC7374h annotations;
        InterfaceC7367a interfaceC7367a = this.f13919a;
        return (interfaceC7367a == null || (annotations = interfaceC7367a.getAnnotations()) == null) ? AbstractC2279u.m() : annotations;
    }

    @Override // Pe.AbstractC2019d
    public EnumC1656c q() {
        return this.f13922d;
    }

    @Override // Pe.AbstractC2019d
    public He.E r() {
        return this.f13921c.b();
    }

    @Override // Pe.AbstractC2019d
    public boolean s() {
        InterfaceC7367a interfaceC7367a = this.f13919a;
        return (interfaceC7367a instanceof ye.t0) && ((ye.t0) interfaceC7367a).v0() != null;
    }

    @Override // Pe.AbstractC2019d
    protected C2027l t(C2027l c2027l, He.w wVar) {
        C2027l c2027lB;
        if (c2027l != null && (c2027lB = C2027l.b(c2027l, EnumC2026k.f13900c, false, 2, null)) != null) {
            return c2027lB;
        }
        if (wVar != null) {
            return wVar.d();
        }
        return null;
    }

    @Override // Pe.AbstractC2019d
    public boolean u() {
        return this.f13921c.a().q().c();
    }

    @Override // Pe.AbstractC2019d
    public Xe.d x(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        InterfaceC7227e interfaceC7227eF = J0.f((qf.S) iVar);
        if (interfaceC7227eF != null) {
            return bf.i.m(interfaceC7227eF);
        }
        return null;
    }

    @Override // Pe.AbstractC2019d
    public boolean z() {
        return this.f13923e;
    }

    public o0(InterfaceC7367a interfaceC7367a, boolean z10, Ke.k containerContext, EnumC1656c containerApplicabilityType, boolean z11) {
        AbstractC5504s.h(containerContext, "containerContext");
        AbstractC5504s.h(containerApplicabilityType, "containerApplicabilityType");
        this.f13919a = interfaceC7367a;
        this.f13920b = z10;
        this.f13921c = containerContext;
        this.f13922d = containerApplicabilityType;
        this.f13923e = z11;
    }
}
