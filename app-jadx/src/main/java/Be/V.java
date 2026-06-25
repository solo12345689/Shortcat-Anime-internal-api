package Be;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import df.AbstractC4598g;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.G0;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.h0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class V extends X implements t0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f1751l = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f1753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f1754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f1755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qf.S f1756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t0 f1757k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V a(InterfaceC7223a containingDeclaration, t0 t0Var, int i10, InterfaceC7374h annotations, Xe.f name, qf.S outType, boolean z10, boolean z11, boolean z12, qf.S s10, h0 source, InterfaceC5082a interfaceC5082a) {
            AbstractC5504s.h(containingDeclaration, "containingDeclaration");
            AbstractC5504s.h(annotations, "annotations");
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(outType, "outType");
            AbstractC5504s.h(source, "source");
            return interfaceC5082a == null ? new V(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source) : new b(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source, interfaceC5082a);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends V {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Lazy f1758m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC7223a containingDeclaration, t0 t0Var, int i10, InterfaceC7374h annotations, Xe.f name, qf.S outType, boolean z10, boolean z11, boolean z12, qf.S s10, h0 source, InterfaceC5082a destructuringVariables) {
            super(containingDeclaration, t0Var, i10, annotations, name, outType, z10, z11, z12, s10, source);
            AbstractC5504s.h(containingDeclaration, "containingDeclaration");
            AbstractC5504s.h(annotations, "annotations");
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(outType, "outType");
            AbstractC5504s.h(source, "source");
            AbstractC5504s.h(destructuringVariables, "destructuringVariables");
            this.f1758m = AbstractC2163n.b(destructuringVariables);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List O0(b bVar) {
            return bVar.P0();
        }

        @Override // Be.V, ye.t0
        public t0 H(InterfaceC7223a newOwner, Xe.f newName, int i10) {
            AbstractC5504s.h(newOwner, "newOwner");
            AbstractC5504s.h(newName, "newName");
            InterfaceC7374h annotations = getAnnotations();
            AbstractC5504s.g(annotations, "<get-annotations>(...)");
            qf.S type = getType();
            AbstractC5504s.g(type, "getType(...)");
            boolean zB0 = B0();
            boolean zS0 = s0();
            boolean zR0 = r0();
            qf.S sV0 = v0();
            h0 NO_SOURCE = h0.f65112a;
            AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i10, annotations, newName, type, zB0, zS0, zR0, sV0, NO_SOURCE, new W(this));
        }

        public final List P0() {
            return (List) this.f1758m.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC7223a containingDeclaration, t0 t0Var, int i10, InterfaceC7374h annotations, Xe.f name, qf.S outType, boolean z10, boolean z11, boolean z12, qf.S s10, h0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(outType, "outType");
        AbstractC5504s.h(source, "source");
        this.f1752f = i10;
        this.f1753g = z10;
        this.f1754h = z11;
        this.f1755i = z12;
        this.f1756j = s10;
        this.f1757k = t0Var == null ? this : t0Var;
    }

    public static final V K0(InterfaceC7223a interfaceC7223a, t0 t0Var, int i10, InterfaceC7374h interfaceC7374h, Xe.f fVar, qf.S s10, boolean z10, boolean z11, boolean z12, qf.S s11, h0 h0Var, InterfaceC5082a interfaceC5082a) {
        return f1751l.a(interfaceC7223a, t0Var, i10, interfaceC7374h, fVar, s10, z10, z11, z12, s11, h0Var, interfaceC5082a);
    }

    @Override // ye.t0
    public boolean B0() {
        if (!this.f1753g) {
            return false;
        }
        InterfaceC7223a interfaceC7223aB = b();
        AbstractC5504s.f(interfaceC7223aB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((InterfaceC7224b) interfaceC7223aB).h().a();
    }

    @Override // ye.t0
    public t0 H(InterfaceC7223a newOwner, Xe.f newName, int i10) {
        AbstractC5504s.h(newOwner, "newOwner");
        AbstractC5504s.h(newName, "newName");
        InterfaceC7374h annotations = getAnnotations();
        AbstractC5504s.g(annotations, "<get-annotations>(...)");
        qf.S type = getType();
        AbstractC5504s.g(type, "getType(...)");
        boolean zB0 = B0();
        boolean zS0 = s0();
        boolean zR0 = r0();
        qf.S sV0 = v0();
        h0 NO_SOURCE = h0.f65112a;
        AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
        return new V(newOwner, null, i10, annotations, newName, type, zB0, zS0, zR0, sV0, NO_SOURCE);
    }

    public Void L0() {
        return null;
    }

    @Override // ye.j0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public t0 c(G0 substitutor) {
        AbstractC5504s.h(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // ye.u0
    public boolean N() {
        return false;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o visitor, Object obj) {
        AbstractC5504s.h(visitor, "visitor");
        return visitor.h(this, obj);
    }

    @Override // ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public Collection e() {
        Collection collectionE = b().e();
        AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
        Collection collection = collectionE;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((t0) ((InterfaceC7223a) it.next()).j().get(getIndex()));
        }
        return arrayList;
    }

    @Override // ye.t0
    public int getIndex() {
        return this.f1752f;
    }

    @Override // ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u LOCAL = AbstractC7241t.f65125f;
        AbstractC5504s.g(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // ye.u0
    public /* bridge */ /* synthetic */ AbstractC4598g q0() {
        return (AbstractC4598g) L0();
    }

    @Override // ye.t0
    public boolean r0() {
        return this.f1755i;
    }

    @Override // ye.t0
    public boolean s0() {
        return this.f1754h;
    }

    @Override // ye.t0
    public qf.S v0() {
        return this.f1756j;
    }

    @Override // Be.AbstractC1119n, ye.InterfaceC7235m
    public InterfaceC7223a b() {
        InterfaceC7235m interfaceC7235mB = super.b();
        AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC7223a) interfaceC7235mB;
    }

    @Override // Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public t0 a() {
        t0 t0Var = this.f1757k;
        return t0Var == this ? this : t0Var.a();
    }
}
