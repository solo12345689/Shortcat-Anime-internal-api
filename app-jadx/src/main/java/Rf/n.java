package rf;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import cf.InterfaceC3100b;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.B0;
import qf.M0;
import qf.S;
import vf.AbstractC6867d;
import ye.InterfaceC7230h;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements InterfaceC3100b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B0 f58788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5082a f58789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f58790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0 f58791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f58792e;

    public n(B0 projection, InterfaceC5082a interfaceC5082a, n nVar, m0 m0Var) {
        AbstractC5504s.h(projection, "projection");
        this.f58788a = projection;
        this.f58789b = interfaceC5082a;
        this.f58790c = nVar;
        this.f58791d = m0Var;
        this.f58792e = AbstractC2163n.a(Td.q.f17462b, new C6320j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(n nVar) {
        InterfaceC5082a interfaceC5082a = nVar.f58789b;
        if (interfaceC5082a != null) {
            return (List) interfaceC5082a.invoke();
        }
        return null;
    }

    private final List i() {
        return (List) this.f58792e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(n nVar, AbstractC6317g abstractC6317g) {
        List listK = nVar.k();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(((M0) it.next()).X0(abstractC6317g));
        }
        return arrayList;
    }

    @Override // cf.InterfaceC3100b
    public B0 a() {
        return this.f58788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f58790c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f58790c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    @Override // qf.v0
    public List getParameters() {
        return AbstractC2279u.m();
    }

    @Override // qf.v0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List k() {
        List listI = i();
        return listI == null ? AbstractC2279u.m() : listI;
    }

    public int hashCode() {
        n nVar = this.f58790c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    public final void j(List supertypes) {
        AbstractC5504s.h(supertypes, "supertypes");
        this.f58789b = new C6322l(supertypes);
    }

    @Override // qf.v0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public n o(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0O = a().o(kotlinTypeRefiner);
        AbstractC5504s.g(b0O, "refine(...)");
        C6323m c6323m = this.f58789b != null ? new C6323m(this, kotlinTypeRefiner) : null;
        n nVar = this.f58790c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(b0O, c6323m, nVar, this.f58791d);
    }

    @Override // qf.v0
    public ve.i n() {
        S type = a().getType();
        AbstractC5504s.g(type, "getType(...)");
        return AbstractC6867d.n(type);
    }

    @Override // qf.v0
    public InterfaceC7230h p() {
        return null;
    }

    @Override // qf.v0
    public boolean q() {
        return false;
    }

    public String toString() {
        return "CapturedType(" + a() + ')';
    }

    public /* synthetic */ n(B0 b02, InterfaceC5082a interfaceC5082a, n nVar, m0 m0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, (i10 & 2) != 0 ? null : interfaceC5082a, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : m0Var);
    }

    public /* synthetic */ n(B0 b02, List list, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, list, (i10 & 4) != 0 ? null : nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(B0 projection, List supertypes, n nVar) {
        this(projection, new C6321k(supertypes), nVar, null, 8, null);
        AbstractC5504s.h(projection, "projection");
        AbstractC5504s.h(supertypes, "supertypes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(List list) {
        return list;
    }
}
