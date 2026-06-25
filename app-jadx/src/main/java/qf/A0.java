package qf;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import pf.C6041f;
import pf.InterfaceC6042g;
import qf.w0;
import rf.AbstractC6314d;
import vf.AbstractC6867d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class A0 {

    /* JADX INFO: renamed from: f */
    public static final a f57952f = new a(null);

    /* JADX INFO: renamed from: a */
    private final F f57953a;

    /* JADX INFO: renamed from: b */
    private final x0 f57954b;

    /* JADX INFO: renamed from: c */
    private final C6041f f57955c;

    /* JADX INFO: renamed from: d */
    private final Lazy f57956d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6042g f57957e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:137:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x01cf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final qf.S a(qf.S r17, qf.G0 r18, java.util.Set r19, boolean r20) {
            /*
                Method dump skipped, instruction units count: 500
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qf.A0.a.a(qf.S, qf.G0, java.util.Set, boolean):qf.S");
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a */
        private final ye.m0 f57958a;

        /* JADX INFO: renamed from: b */
        private final G f57959b;

        public b(ye.m0 typeParameter, G typeAttr) {
            AbstractC5504s.h(typeParameter, "typeParameter");
            AbstractC5504s.h(typeAttr, "typeAttr");
            this.f57958a = typeParameter;
            this.f57959b = typeAttr;
        }

        public final G a() {
            return this.f57959b;
        }

        public final ye.m0 b() {
            return this.f57958a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(bVar.f57958a, this.f57958a) && AbstractC5504s.c(bVar.f57959b, this.f57959b);
        }

        public int hashCode() {
            int iHashCode = this.f57958a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f57959b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f57958a + ", typeAttr=" + this.f57959b + ')';
        }
    }

    public A0(F projectionComputer, x0 options) {
        AbstractC5504s.h(projectionComputer, "projectionComputer");
        AbstractC5504s.h(options, "options");
        this.f57953a = projectionComputer;
        this.f57954b = options;
        C6041f c6041f = new C6041f("Type parameter upper bound erasure results");
        this.f57955c = c6041f;
        this.f57956d = AbstractC2163n.b(new y0(this));
        InterfaceC6042g interfaceC6042gH = c6041f.h(new z0(this));
        AbstractC5504s.g(interfaceC6042gH, "createMemoizedFunction(...)");
        this.f57957e = interfaceC6042gH;
    }

    public static final sf.i c(A0 a02) {
        return sf.l.d(sf.k.f59666U0, a02.toString());
    }

    private final S d(G g10) {
        S sD;
        AbstractC6183d0 abstractC6183d0A = g10.a();
        return (abstractC6183d0A == null || (sD = AbstractC6867d.D(abstractC6183d0A)) == null) ? h() : sD;
    }

    public static final S f(A0 a02, b bVar) {
        return a02.g(bVar.b(), bVar.a());
    }

    private final S g(ye.m0 m0Var, G g10) {
        B0 b0A;
        Set setC = g10.c();
        if (setC != null && setC.contains(m0Var.a())) {
            return d(g10);
        }
        AbstractC6183d0 abstractC6183d0P = m0Var.p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        Set<ye.m0> setL = AbstractC6867d.l(abstractC6183d0P, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(setL, 10)), 16));
        for (ye.m0 m0Var2 : setL) {
            if (setC == null || !setC.contains(m0Var2)) {
                b0A = this.f57953a.a(m0Var2, g10, this, e(m0Var2, g10.d(m0Var)));
            } else {
                b0A = J0.t(m0Var2, g10);
                AbstractC5504s.g(b0A, "makeStarProjection(...)");
            }
            Pair pairA = Td.z.a(m0Var2.l(), b0A);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        G0 g0G = G0.g(w0.a.e(w0.f58118c, linkedHashMap, false, 2, null));
        AbstractC5504s.g(g0G, "create(...)");
        List upperBounds = m0Var.getUpperBounds();
        AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
        Set setI = i(g0G, upperBounds, g10);
        if (setI.isEmpty()) {
            return d(g10);
        }
        if (!this.f57954b.a()) {
            if (setI.size() == 1) {
                return (S) AbstractC2279u.L0(setI);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listB1 = AbstractC2279u.b1(setI);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listB1, 10));
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            arrayList.add(((S) it.next()).Q0());
        }
        return AbstractC6314d.a(arrayList);
    }

    private final sf.i h() {
        return (sf.i) this.f57956d.getValue();
    }

    private final Set i(G0 g02, List list, G g10) {
        Set setB = Ud.a0.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S s10 = (S) it.next();
            InterfaceC7230h interfaceC7230hP = s10.N0().p();
            if (interfaceC7230hP instanceof InterfaceC7227e) {
                setB.add(f57952f.a(s10, g02, g10.c(), this.f57954b.b()));
            } else if (interfaceC7230hP instanceof ye.m0) {
                Set setC = g10.c();
                if (setC == null || !setC.contains(interfaceC7230hP)) {
                    List upperBounds = ((ye.m0) interfaceC7230hP).getUpperBounds();
                    AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
                    setB.addAll(i(g02, upperBounds, g10));
                } else {
                    setB.add(d(g10));
                }
            }
            if (!this.f57954b.a()) {
                break;
            }
        }
        return Ud.a0.a(setB);
    }

    public final S e(ye.m0 typeParameter, G typeAttr) {
        AbstractC5504s.h(typeParameter, "typeParameter");
        AbstractC5504s.h(typeAttr, "typeAttr");
        Object objInvoke = this.f57957e.invoke(new b(typeParameter, typeAttr));
        AbstractC5504s.g(objInvoke, "invoke(...)");
        return (S) objInvoke;
    }

    public /* synthetic */ A0(F f10, x0 x0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? new x0(false, false) : x0Var);
    }
}
