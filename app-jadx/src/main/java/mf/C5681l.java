package mf;

import Ud.a0;
import Ue.i;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.C5890m;
import ve.o;
import ye.InterfaceC7227e;
import ye.h0;

/* JADX INFO: renamed from: mf.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5681l {

    /* JADX INFO: renamed from: c */
    public static final b f53427c = new b(null);

    /* JADX INFO: renamed from: d */
    private static final Set f53428d = a0.c(Xe.b.f21759d.c(o.a.f62237d.m()));

    /* JADX INFO: renamed from: a */
    private final C5683n f53429a;

    /* JADX INFO: renamed from: b */
    private final Function1 f53430b;

    /* JADX INFO: renamed from: mf.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final Xe.b f53431a;

        /* JADX INFO: renamed from: b */
        private final C5678i f53432b;

        public a(Xe.b classId, C5678i c5678i) {
            AbstractC5504s.h(classId, "classId");
            this.f53431a = classId;
            this.f53432b = c5678i;
        }

        public final C5678i a() {
            return this.f53432b;
        }

        public final Xe.b b() {
            return this.f53431a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC5504s.c(this.f53431a, ((a) obj).f53431a);
        }

        public int hashCode() {
            return this.f53431a.hashCode();
        }
    }

    /* JADX INFO: renamed from: mf.l$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return C5681l.f53428d;
        }

        private b() {
        }
    }

    public C5681l(C5683n components) {
        AbstractC5504s.h(components, "components");
        this.f53429a = components;
        this.f53430b = components.u().d(new C5680k(this));
    }

    public static final InterfaceC7227e c(C5681l c5681l, a key) {
        AbstractC5504s.h(key, "key");
        return c5681l.d(key);
    }

    private final InterfaceC7227e d(a aVar) {
        Object next;
        C5685p c5685pA;
        Xe.b bVarB = aVar.b();
        Iterator it = this.f53429a.l().iterator();
        while (it.hasNext()) {
            InterfaceC7227e interfaceC7227eA = ((Ae.b) it.next()).a(bVarB);
            if (interfaceC7227eA != null) {
                return interfaceC7227eA;
            }
        }
        if (f53428d.contains(bVarB)) {
            return null;
        }
        C5678i c5678iA = aVar.a();
        if (c5678iA == null && (c5678iA = this.f53429a.e().a(bVarB)) == null) {
            return null;
        }
        Ue.d dVarA = c5678iA.a();
        Se.c cVarB = c5678iA.b();
        Ue.a aVarC = c5678iA.c();
        h0 h0VarD = c5678iA.d();
        Xe.b bVarE = bVarB.e();
        if (bVarE != null) {
            InterfaceC7227e interfaceC7227eF = f(this, bVarE, null, 2, null);
            C5890m c5890m = interfaceC7227eF instanceof C5890m ? (C5890m) interfaceC7227eF : null;
            if (c5890m == null || !c5890m.k1(bVarB.h())) {
                return null;
            }
            c5685pA = c5890m.d1();
        } else {
            Iterator it2 = ye.T.c(this.f53429a.s(), bVarB.f()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                ye.N n10 = (ye.N) next;
                if (!(n10 instanceof r) || ((r) n10).K0(bVarB.h())) {
                    break;
                }
            }
            ye.N n11 = (ye.N) next;
            if (n11 == null) {
                return null;
            }
            C5683n c5683n = this.f53429a;
            Se.u uVarM1 = cVarB.m1();
            AbstractC5504s.g(uVarM1, "getTypeTable(...)");
            Ue.h hVar = new Ue.h(uVarM1);
            i.a aVar2 = Ue.i.f19583b;
            Se.x xVarO1 = cVarB.o1();
            AbstractC5504s.g(xVarO1, "getVersionRequirementTable(...)");
            c5685pA = c5683n.a(n11, dVarA, hVar, aVar2.a(xVarO1), aVarC, null);
            aVarC = aVarC;
        }
        return new C5890m(c5685pA, cVarB, dVarA, aVarC, h0VarD);
    }

    public static /* synthetic */ InterfaceC7227e f(C5681l c5681l, Xe.b bVar, C5678i c5678i, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c5678i = null;
        }
        return c5681l.e(bVar, c5678i);
    }

    public final InterfaceC7227e e(Xe.b classId, C5678i c5678i) {
        AbstractC5504s.h(classId, "classId");
        return (InterfaceC7227e) this.f53430b.invoke(new a(classId, c5678i));
    }
}
