package ff;

import Af.b;
import Cf.i;
import Cf.l;
import Ud.AbstractC2279u;
import Xe.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.N;
import qf.S;
import rf.AbstractC6317g;
import rf.AbstractC6318h;
import ye.C7222A;
import ye.H;
import ye.I;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7231i;
import ye.InterfaceC7235m;
import ye.Y;
import ye.Z;
import ye.r0;
import ye.t0;
import ze.InterfaceC7369c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a */
    private static final f f47055a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f47056a = new a();

        a() {
            super(1, t0.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final Boolean invoke(t0 p02) {
            AbstractC5504s.h(p02, "p0");
            return Boolean.valueOf(p02.B0());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends b.AbstractC0011b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ N f47057a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function1 f47058b;

        b(N n10, Function1 function1) {
            this.f47057a = n10;
            this.f47058b = function1;
        }

        @Override // Af.b.AbstractC0011b, Af.b.d
        /* JADX INFO: renamed from: d */
        public void b(InterfaceC7224b current) {
            AbstractC5504s.h(current, "current");
            if (this.f47057a.f52259a == null && ((Boolean) this.f47058b.invoke(current)).booleanValue()) {
                this.f47057a.f52259a = current;
            }
        }

        @Override // Af.b.d
        /* JADX INFO: renamed from: e */
        public boolean c(InterfaceC7224b current) {
            AbstractC5504s.h(current, "current");
            return this.f47057a.f52259a == null;
        }

        @Override // Af.b.d
        /* JADX INFO: renamed from: f */
        public InterfaceC7224b a() {
            return (InterfaceC7224b) this.f47057a.f52259a;
        }
    }

    static {
        f fVarM = f.m("value");
        AbstractC5504s.g(fVarM, "identifier(...)");
        f47055a = fVarM;
    }

    public static final i A(boolean z10, InterfaceC7224b interfaceC7224b) {
        AbstractC5504s.e(interfaceC7224b);
        return z(interfaceC7224b, z10);
    }

    public static final InterfaceC7227e B(H h10, Xe.c topLevelClassFqName, Ge.b location) {
        AbstractC5504s.h(h10, "<this>");
        AbstractC5504s.h(topLevelClassFqName, "topLevelClassFqName");
        AbstractC5504s.h(location, "location");
        topLevelClassFqName.c();
        InterfaceC7230h interfaceC7230hE = h10.S(topLevelClassFqName.d()).o().e(topLevelClassFqName.f(), location);
        if (interfaceC7230hE instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hE;
        }
        return null;
    }

    public static final InterfaceC7235m a(InterfaceC7235m it) {
        AbstractC5504s.h(it, "it");
        return it.b();
    }

    public static final boolean f(t0 t0Var) {
        AbstractC5504s.h(t0Var, "<this>");
        Boolean boolE = Af.b.e(AbstractC2279u.e(t0Var), C4800a.f47051a, a.f47056a);
        AbstractC5504s.g(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    public static final Iterable g(t0 t0Var) {
        Collection collectionE = t0Var.e();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).a());
        }
        return arrayList;
    }

    public static final InterfaceC7224b h(InterfaceC7224b interfaceC7224b, boolean z10, Function1 predicate) {
        AbstractC5504s.h(interfaceC7224b, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return (InterfaceC7224b) Af.b.b(AbstractC2279u.e(interfaceC7224b), new C4802c(z10), new b(new N(), predicate));
    }

    public static /* synthetic */ InterfaceC7224b i(InterfaceC7224b interfaceC7224b, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(interfaceC7224b, z10, function1);
    }

    public static final Iterable j(boolean z10, InterfaceC7224b interfaceC7224b) {
        Collection collectionE;
        if (z10) {
            interfaceC7224b = interfaceC7224b != null ? interfaceC7224b.a() : null;
        }
        return (interfaceC7224b == null || (collectionE = interfaceC7224b.e()) == null) ? AbstractC2279u.m() : collectionE;
    }

    public static final Xe.c k(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        Xe.d dVarP = p(interfaceC7235m);
        if (!dVarP.f()) {
            dVarP = null;
        }
        if (dVarP != null) {
            return dVarP.m();
        }
        return null;
    }

    public static final InterfaceC7227e l(InterfaceC7369c interfaceC7369c) {
        AbstractC5504s.h(interfaceC7369c, "<this>");
        InterfaceC7230h interfaceC7230hP = interfaceC7369c.getType().N0().p();
        if (interfaceC7230hP instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hP;
        }
        return null;
    }

    public static final ve.i m(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        return s(interfaceC7235m).n();
    }

    public static final Xe.b n(InterfaceC7230h interfaceC7230h) {
        InterfaceC7235m interfaceC7235mB;
        Xe.b bVarN;
        if (interfaceC7230h != null && (interfaceC7235mB = interfaceC7230h.b()) != null) {
            if (interfaceC7235mB instanceof ye.N) {
                Xe.c cVarF = ((ye.N) interfaceC7235mB).f();
                f name = interfaceC7230h.getName();
                AbstractC5504s.g(name, "getName(...)");
                return new Xe.b(cVarF, name);
            }
            if ((interfaceC7235mB instanceof InterfaceC7231i) && (bVarN = n((InterfaceC7230h) interfaceC7235mB)) != null) {
                f name2 = interfaceC7230h.getName();
                AbstractC5504s.g(name2, "getName(...)");
                return bVarN.d(name2);
            }
        }
        return null;
    }

    public static final Xe.c o(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        Xe.c cVarN = bf.i.n(interfaceC7235m);
        AbstractC5504s.g(cVarN, "getFqNameSafe(...)");
        return cVarN;
    }

    public static final Xe.d p(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        Xe.d dVarM = bf.i.m(interfaceC7235m);
        AbstractC5504s.g(dVarM, "getFqName(...)");
        return dVarM;
    }

    public static final C7222A q(InterfaceC7227e interfaceC7227e) {
        r0 r0VarV = interfaceC7227e != null ? interfaceC7227e.V() : null;
        if (r0VarV instanceof C7222A) {
            return (C7222A) r0VarV;
        }
        return null;
    }

    public static final AbstractC6317g r(H h10) {
        AbstractC5504s.h(h10, "<this>");
        android.support.v4.media.session.b.a(h10.a0(AbstractC6318h.a()));
        return AbstractC6317g.a.f58775a;
    }

    public static final H s(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        H hG = bf.i.g(interfaceC7235m);
        AbstractC5504s.g(hG, "getContainingModule(...)");
        return hG;
    }

    public static final I t(InterfaceC7227e interfaceC7227e) {
        r0 r0VarV = interfaceC7227e != null ? interfaceC7227e.V() : null;
        if (r0VarV instanceof I) {
            return (I) r0VarV;
        }
        return null;
    }

    public static final i u(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        return l.x(v(interfaceC7235m), 1);
    }

    public static final i v(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        return l.p(interfaceC7235m, C4801b.f47052a);
    }

    public static final InterfaceC7224b w(InterfaceC7224b interfaceC7224b) {
        AbstractC5504s.h(interfaceC7224b, "<this>");
        if (!(interfaceC7224b instanceof Y)) {
            return interfaceC7224b;
        }
        Z zW = ((Y) interfaceC7224b).W();
        AbstractC5504s.g(zW, "getCorrespondingProperty(...)");
        return zW;
    }

    public static final InterfaceC7227e x(InterfaceC7227e interfaceC7227e) {
        AbstractC5504s.h(interfaceC7227e, "<this>");
        for (S s10 : interfaceC7227e.p().N0().k()) {
            if (!ve.i.c0(s10)) {
                InterfaceC7230h interfaceC7230hP = s10.N0().p();
                if (bf.i.w(interfaceC7230hP)) {
                    AbstractC5504s.f(interfaceC7230hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC7227e) interfaceC7230hP;
                }
            }
        }
        return null;
    }

    public static final boolean y(H h10) {
        AbstractC5504s.h(h10, "<this>");
        android.support.v4.media.session.b.a(h10.a0(AbstractC6318h.a()));
        return false;
    }

    public static final i z(InterfaceC7224b interfaceC7224b, boolean z10) {
        AbstractC5504s.h(interfaceC7224b, "<this>");
        if (z10) {
            interfaceC7224b = interfaceC7224b.a();
        }
        i iVarS = l.s(interfaceC7224b);
        Collection collectionE = interfaceC7224b.e();
        AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
        return l.M(iVarS, l.E(AbstractC2279u.c0(collectionE), new d(z10)));
    }
}
