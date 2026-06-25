package qf;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import pf.InterfaceC6044i;
import rf.AbstractC6317g;
import rf.AbstractC6318h;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: qf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6206p extends AbstractC6211v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6044i f58082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f58083c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: qf.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class a implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC6317g f58084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f58085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6206p f58086c;

        public a(AbstractC6206p abstractC6206p, AbstractC6317g kotlinTypeRefiner) {
            AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f58086c = abstractC6206p;
            this.f58084a = kotlinTypeRefiner;
            this.f58085b = AbstractC2163n.a(Td.q.f17462b, new C6204o(this, abstractC6206p));
        }

        private final List c() {
            return (List) this.f58085b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e(a aVar, AbstractC6206p abstractC6206p) {
            return AbstractC6318h.b(aVar.f58084a, abstractC6206p.k());
        }

        @Override // qf.v0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List k() {
            return c();
        }

        public boolean equals(Object obj) {
            return this.f58086c.equals(obj);
        }

        @Override // qf.v0
        public List getParameters() {
            List parameters = this.f58086c.getParameters();
            AbstractC5504s.g(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f58086c.hashCode();
        }

        @Override // qf.v0
        public ve.i n() {
            ve.i iVarN = this.f58086c.n();
            AbstractC5504s.g(iVarN, "getBuiltIns(...)");
            return iVarN;
        }

        @Override // qf.v0
        public v0 o(AbstractC6317g kotlinTypeRefiner) {
            AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f58086c.o(kotlinTypeRefiner);
        }

        @Override // qf.v0
        public InterfaceC7230h p() {
            return this.f58086c.p();
        }

        @Override // qf.v0
        public boolean q() {
            return this.f58086c.q();
        }

        public String toString() {
            return this.f58086c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: qf.p$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection f58087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f58088b;

        public b(Collection allSupertypes) {
            AbstractC5504s.h(allSupertypes, "allSupertypes");
            this.f58087a = allSupertypes;
            this.f58088b = AbstractC2279u.e(sf.l.f59724a.l());
        }

        public final Collection a() {
            return this.f58087a;
        }

        public final List b() {
            return this.f58088b;
        }

        public final void c(List list) {
            AbstractC5504s.h(list, "<set-?>");
            this.f58088b = list;
        }
    }

    public AbstractC6206p(pf.n storageManager) {
        AbstractC5504s.h(storageManager, "storageManager");
        this.f58082b = storageManager.e(new C6190h(this), C6192i.f58059a, new C6194j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b A(AbstractC6206p abstractC6206p) {
        return new b(abstractC6206p.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b B(boolean z10) {
        return new b(AbstractC2279u.e(sf.l.f59724a.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L C(AbstractC6206p abstractC6206p, b supertypes) {
        AbstractC5504s.h(supertypes, "supertypes");
        Collection collectionA = abstractC6206p.v().a(abstractC6206p, supertypes.a(), new C6196k(abstractC6206p), new C6198l(abstractC6206p));
        if (collectionA.isEmpty()) {
            S s10 = abstractC6206p.s();
            collectionA = s10 != null ? AbstractC2279u.e(s10) : null;
            if (collectionA == null) {
                collectionA = AbstractC2279u.m();
            }
        }
        if (abstractC6206p.u()) {
            abstractC6206p.v().a(abstractC6206p, collectionA, new C6200m(abstractC6206p), new C6202n(abstractC6206p));
        }
        List listB1 = collectionA instanceof List ? (List) collectionA : null;
        if (listB1 == null) {
            listB1 = AbstractC2279u.b1(collectionA);
        }
        supertypes.c(abstractC6206p.x(listB1));
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable D(AbstractC6206p abstractC6206p, v0 it) {
        AbstractC5504s.h(it, "it");
        return abstractC6206p.m(it, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L E(AbstractC6206p abstractC6206p, S it) {
        AbstractC5504s.h(it, "it");
        abstractC6206p.z(it);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(AbstractC6206p abstractC6206p, v0 it) {
        AbstractC5504s.h(it, "it");
        return abstractC6206p.m(it, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L G(AbstractC6206p abstractC6206p, S it) {
        AbstractC5504s.h(it, "it");
        abstractC6206p.y(it);
        return Td.L.f17438a;
    }

    private final Collection m(v0 v0Var, boolean z10) {
        List listI0;
        AbstractC6206p abstractC6206p = v0Var instanceof AbstractC6206p ? (AbstractC6206p) v0Var : null;
        if (abstractC6206p != null && (listI0 = AbstractC2279u.I0(((b) abstractC6206p.f58082b.invoke()).a(), abstractC6206p.t(z10))) != null) {
            return listI0;
        }
        Collection collectionK = v0Var.k();
        AbstractC5504s.g(collectionK, "getSupertypes(...)");
        return collectionK;
    }

    @Override // qf.v0
    public v0 o(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    protected abstract Collection r();

    protected abstract S s();

    protected Collection t(boolean z10) {
        return AbstractC2279u.m();
    }

    protected boolean u() {
        return this.f58083c;
    }

    protected abstract ye.k0 v();

    @Override // qf.v0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public List k() {
        return ((b) this.f58082b.invoke()).b();
    }

    protected List x(List supertypes) {
        AbstractC5504s.h(supertypes, "supertypes");
        return supertypes;
    }

    protected void y(S type) {
        AbstractC5504s.h(type, "type");
    }

    protected void z(S type) {
        AbstractC5504s.h(type, "type");
    }
}
