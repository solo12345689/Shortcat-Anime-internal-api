package we;

import Be.AbstractC1123s;
import Be.O;
import Be.V;
import Ud.AbstractC2279u;
import Ud.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.G0;
import qf.N0;
import qf.S;
import ve.h;
import xf.C7168t;
import ye.AbstractC7241t;
import ye.E;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.c0;
import ye.h0;
import ye.m0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: we.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6970e extends O {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final a f63181E = new a(null);

    /* JADX INFO: renamed from: we.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final t0 b(C6970e c6970e, int i10, m0 m0Var) {
            String lowerCase;
            String strB = m0Var.getName().b();
            AbstractC5504s.g(strB, "asString(...)");
            if (AbstractC5504s.c(strB, "T")) {
                lowerCase = "instance";
            } else if (AbstractC5504s.c(strB, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            }
            InterfaceC7374h interfaceC7374hB = InterfaceC7374h.f66223k0.b();
            Xe.f fVarM = Xe.f.m(lowerCase);
            AbstractC5504s.g(fVarM, "identifier(...)");
            AbstractC6183d0 abstractC6183d0P = m0Var.p();
            AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
            h0 NO_SOURCE = h0.f65112a;
            AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
            return new V(c6970e, null, i10, interfaceC7374hB, fVarM, abstractC6183d0P, false, false, false, null, NO_SOURCE);
        }

        public final C6970e a(C6967b functionClass, boolean z10) {
            AbstractC5504s.h(functionClass, "functionClass");
            List listQ = functionClass.q();
            C6970e c6970e = new C6970e(functionClass, null, InterfaceC7224b.a.DECLARATION, z10, null);
            c0 c0VarJ0 = functionClass.J0();
            List listM = AbstractC2279u.m();
            List listM2 = AbstractC2279u.m();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQ) {
                if (((m0) obj).m() != N0.f58000f) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<L> iterableH1 = AbstractC2279u.h1(arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(iterableH1, 10));
            for (L l10 : iterableH1) {
                arrayList2.add(C6970e.f63181E.b(c6970e, l10.c(), (m0) l10.d()));
            }
            c6970e.R0(null, c0VarJ0, listM, listM2, arrayList2, ((m0) AbstractC2279u.y0(listQ)).p(), E.f65063e, AbstractC7241t.f65124e);
            c6970e.Z0(true);
            return c6970e;
        }

        private a() {
        }
    }

    public /* synthetic */ C6970e(InterfaceC7235m interfaceC7235m, C6970e c6970e, InterfaceC7224b.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7235m, c6970e, aVar, z10);
    }

    private final InterfaceC7247z p1(List list) {
        Xe.f fVar;
        int size = j().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List listJ = j();
            AbstractC5504s.g(listJ, "getValueParameters(...)");
            List<Pair> listJ1 = AbstractC2279u.j1(list, listJ);
            if (listJ1 != null && listJ1.isEmpty()) {
                return this;
            }
            for (Pair pair : listJ1) {
                if (!AbstractC5504s.c((Xe.f) pair.getFirst(), ((t0) pair.getSecond()).getName())) {
                }
            }
            return this;
        }
        List<t0> listJ2 = j();
        AbstractC5504s.g(listJ2, "getValueParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listJ2, 10));
        for (t0 t0Var : listJ2) {
            Xe.f name = t0Var.getName();
            AbstractC5504s.g(name, "getName(...)");
            int index = t0Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = (Xe.f) list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(t0Var.H(this, name, index));
        }
        AbstractC1123s.c cVarS0 = S0(G0.f57972b);
        if (list.isEmpty()) {
            z10 = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Xe.f) it.next()) == null) {
                    break;
                }
            }
            z10 = false;
        }
        AbstractC1123s.c cVarR = cVarS0.G(z10).b(arrayList).r(a());
        AbstractC5504s.g(cVarR, "setOriginal(...)");
        InterfaceC7247z interfaceC7247zM0 = super.M0(cVarR);
        AbstractC5504s.e(interfaceC7247zM0);
        return interfaceC7247zM0;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z
    public boolean C() {
        return false;
    }

    @Override // Be.O, Be.AbstractC1123s
    protected AbstractC1123s L0(InterfaceC7235m newOwner, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a kind, Xe.f fVar, InterfaceC7374h annotations, h0 source) {
        AbstractC5504s.h(newOwner, "newOwner");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(source, "source");
        return new C6970e(newOwner, (C6970e) interfaceC7247z, kind, isSuspend());
    }

    @Override // Be.AbstractC1123s
    protected InterfaceC7247z M0(AbstractC1123s.c configuration) {
        AbstractC5504s.h(configuration, "configuration");
        C6970e c6970e = (C6970e) super.M0(configuration);
        if (c6970e == null) {
            return null;
        }
        List listJ = c6970e.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        if (listJ != null && listJ.isEmpty()) {
            return c6970e;
        }
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            S type = ((t0) it.next()).getType();
            AbstractC5504s.g(type, "getType(...)");
            if (h.d(type) != null) {
                List listJ2 = c6970e.j();
                AbstractC5504s.g(listJ2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(listJ2, 10));
                Iterator it2 = listJ2.iterator();
                while (it2.hasNext()) {
                    S type2 = ((t0) it2.next()).getType();
                    AbstractC5504s.g(type2, "getType(...)");
                    arrayList.add(h.d(type2));
                }
                return c6970e.p1(arrayList);
            }
        }
        return c6970e;
    }

    @Override // Be.AbstractC1123s, ye.D
    public boolean isExternal() {
        return false;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z
    public boolean isInline() {
        return false;
    }

    private C6970e(InterfaceC7235m interfaceC7235m, C6970e c6970e, InterfaceC7224b.a aVar, boolean z10) {
        super(interfaceC7235m, c6970e, InterfaceC7374h.f66223k0.b(), C7168t.f64548i, aVar, h0.f65112a);
        f1(true);
        h1(z10);
        Y0(false);
    }
}
