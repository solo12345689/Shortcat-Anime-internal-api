package Be;

import Be.T;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;
import pf.InterfaceC6044i;
import qf.AbstractC6183d0;
import qf.J0;
import qf.v0;
import rf.AbstractC6317g;
import ye.AbstractC7242u;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.InterfaceC7238p;
import ye.h0;
import ye.l0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1112g extends AbstractC1119n implements l0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f1775j = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(AbstractC1112g.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pf.n f1776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC7242u f1777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC6044i f1778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f1779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f1780i;

    /* JADX INFO: renamed from: Be.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements v0 {
        a() {
        }

        @Override // qf.v0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l0 p() {
            return AbstractC1112g.this;
        }

        @Override // qf.v0
        public List getParameters() {
            return AbstractC1112g.this.R0();
        }

        @Override // qf.v0
        public Collection k() {
            Collection collectionK = p().u0().N0().k();
            AbstractC5504s.g(collectionK, "getSupertypes(...)");
            return collectionK;
        }

        @Override // qf.v0
        public ve.i n() {
            return ff.e.m(p());
        }

        @Override // qf.v0
        public v0 o(AbstractC6317g kotlinTypeRefiner) {
            AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // qf.v0
        public boolean q() {
            return true;
        }

        public String toString() {
            return "[typealias " + p().getName().b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1112g(pf.n storageManager, InterfaceC7235m containingDeclaration, InterfaceC7374h annotations, Xe.f name, h0 sourceElement, AbstractC7242u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(sourceElement, "sourceElement");
        AbstractC5504s.h(visibilityImpl, "visibilityImpl");
        this.f1776e = storageManager;
        this.f1777f = visibilityImpl;
        this.f1778g = storageManager.c(new C1109d(this));
        this.f1780i = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6183d0 N0(AbstractC1112g abstractC1112g, AbstractC6317g abstractC6317g) {
        InterfaceC7230h interfaceC7230hF = abstractC6317g.f(abstractC1112g);
        if (interfaceC7230hF != null) {
            return interfaceC7230hF.p();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection O0(AbstractC1112g abstractC1112g) {
        return abstractC1112g.Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean T0(Be.AbstractC1112g r1, qf.M0 r2) {
        /*
            kotlin.jvm.internal.AbstractC5504s.e(r2)
            boolean r0 = qf.W.a(r2)
            if (r0 != 0) goto L23
            qf.v0 r2 = r2.N0()
            ye.h r2 = r2.p()
            boolean r0 = r2 instanceof ye.m0
            if (r0 == 0) goto L23
            ye.m0 r2 = (ye.m0) r2
            ye.m r2 = r2.b()
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r2, r1)
            if (r1 != 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.AbstractC1112g.T0(Be.g, qf.M0):java.lang.Boolean");
    }

    @Override // ye.InterfaceC7231i
    public boolean A() {
        return J0.c(u0(), new C1110e(this));
    }

    protected final pf.n M() {
        return this.f1776e;
    }

    protected final AbstractC6183d0 M0() {
        InterfaceC5387k interfaceC5387kX;
        InterfaceC7227e interfaceC7227eU = u();
        if (interfaceC7227eU == null || (interfaceC5387kX = interfaceC7227eU.X()) == null) {
            interfaceC5387kX = InterfaceC5387k.b.f51800b;
        }
        AbstractC6183d0 abstractC6183d0V = J0.v(this, interfaceC5387kX, new C1111f(this));
        AbstractC5504s.g(abstractC6183d0V, "makeUnsubstitutedType(...)");
        return abstractC6183d0V;
    }

    @Override // Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public l0 a() {
        InterfaceC7238p interfaceC7238pA = super.a();
        AbstractC5504s.f(interfaceC7238pA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (l0) interfaceC7238pA;
    }

    public final Collection Q0() {
        InterfaceC7227e interfaceC7227eU = u();
        if (interfaceC7227eU == null) {
            return AbstractC2279u.m();
        }
        Collection<InterfaceC7226d> collectionI = interfaceC7227eU.i();
        AbstractC5504s.g(collectionI, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7226d interfaceC7226d : collectionI) {
            T.a aVar = T.f1742I;
            pf.n nVar = this.f1776e;
            AbstractC5504s.e(interfaceC7226d);
            Q qB = aVar.b(nVar, this, interfaceC7226d);
            if (qB != null) {
                arrayList.add(qB);
            }
        }
        return arrayList;
    }

    protected abstract List R0();

    public final void S0(List declaredTypeParameters) {
        AbstractC5504s.h(declaredTypeParameters, "declaredTypeParameters");
        this.f1779h = declaredTypeParameters;
    }

    @Override // ye.D
    public boolean Y() {
        return false;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o visitor, Object obj) {
        AbstractC5504s.h(visitor, "visitor");
        return visitor.e(this, obj);
    }

    @Override // ye.D, ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        return this.f1777f;
    }

    @Override // ye.D
    public boolean isExternal() {
        return false;
    }

    @Override // ye.InterfaceC7230h
    public v0 l() {
        return this.f1780i;
    }

    @Override // ye.D
    public boolean m0() {
        return false;
    }

    @Override // ye.InterfaceC7231i
    public List q() {
        List list = this.f1779h;
        if (list != null) {
            return list;
        }
        AbstractC5504s.u("declaredTypeParametersImpl");
        return null;
    }

    @Override // Be.AbstractC1118m
    public String toString() {
        return "typealias " + getName().b();
    }
}
