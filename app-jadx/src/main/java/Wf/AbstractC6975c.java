package wf;

import Td.r;
import Ud.AbstractC2279u;
import cf.AbstractC3103e;
import cf.InterfaceC3100b;
import ff.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.B0;
import qf.D0;
import qf.F0;
import qf.G0;
import qf.J0;
import qf.L;
import qf.L0;
import qf.M0;
import qf.N0;
import qf.S;
import qf.V;
import qf.v0;
import qf.w0;
import ve.i;
import vf.AbstractC6867d;
import ye.m0;

/* JADX INFO: renamed from: wf.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6975c {

    /* JADX INFO: renamed from: wf.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63200a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.f57999e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.f58000f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.f58001g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63200a = iArr;
        }
    }

    /* JADX INFO: renamed from: wf.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends w0 {
        b() {
        }

        @Override // qf.w0
        public B0 k(v0 key) {
            AbstractC5504s.h(key, "key");
            InterfaceC3100b interfaceC3100b = key instanceof InterfaceC3100b ? (InterfaceC3100b) key : null;
            if (interfaceC3100b == null) {
                return null;
            }
            return interfaceC3100b.a().a() ? new D0(N0.f58001g, interfaceC3100b.a().getType()) : interfaceC3100b.a();
        }
    }

    public static final C6973a b(S type) {
        Object objG;
        AbstractC5504s.h(type, "type");
        if (L.b(type)) {
            C6973a c6973aB = b(L.c(type));
            C6973a c6973aB2 = b(L.d(type));
            return new C6973a(L0.b(V.e(L.c((S) c6973aB.c()), L.d((S) c6973aB2.c())), type), L0.b(V.e(L.c((S) c6973aB.d()), L.d((S) c6973aB2.d())), type));
        }
        v0 v0VarN0 = type.N0();
        if (AbstractC3103e.f(type)) {
            AbstractC5504s.f(v0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            B0 b0A = ((InterfaceC3100b) v0VarN0).a();
            S type2 = b0A.getType();
            AbstractC5504s.g(type2, "getType(...)");
            S sC = c(type2, type);
            int i10 = a.f63200a[b0A.b().ordinal()];
            if (i10 == 2) {
                return new C6973a(sC, AbstractC6867d.n(type).J());
            }
            if (i10 == 3) {
                AbstractC6183d0 abstractC6183d0I = AbstractC6867d.n(type).I();
                AbstractC5504s.g(abstractC6183d0I, "getNothingType(...)");
                return new C6973a(c(abstractC6183d0I, type), sC);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + b0A);
        }
        if (type.L0().isEmpty() || type.L0().size() != v0VarN0.getParameters().size()) {
            return new C6973a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL0 = type.L0();
        List parameters = v0VarN0.getParameters();
        AbstractC5504s.g(parameters, "getParameters(...)");
        for (Pair pair : AbstractC2279u.j1(listL0, parameters)) {
            B0 b02 = (B0) pair.getFirst();
            m0 m0Var = (m0) pair.getSecond();
            AbstractC5504s.e(m0Var);
            C6976d c6976dI = i(b02, m0Var);
            if (b02.a()) {
                arrayList.add(c6976dI);
                arrayList2.add(c6976dI);
            } else {
                C6973a c6973aF = f(c6976dI);
                C6976d c6976d = (C6976d) c6973aF.a();
                C6976d c6976d2 = (C6976d) c6973aF.b();
                arrayList.add(c6976d);
                arrayList2.add(c6976d2);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((C6976d) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objG = AbstractC6867d.n(type).I();
            AbstractC5504s.g(objG, "getNothingType(...)");
        } else {
            objG = g(type, arrayList);
        }
        return new C6973a(objG, g(type, arrayList2));
    }

    private static final S c(S s10, S s11) {
        S sQ = J0.q(s10, s11.O0());
        AbstractC5504s.g(sQ, "makeNullableIfNeeded(...)");
        return sQ;
    }

    public static final B0 d(B0 b02, boolean z10) {
        if (b02 == null) {
            return null;
        }
        if (!b02.a()) {
            S type = b02.getType();
            AbstractC5504s.g(type, "getType(...)");
            if (J0.c(type, C6974b.f63199a)) {
                N0 n0B = b02.b();
                AbstractC5504s.g(n0B, "getProjectionKind(...)");
                return n0B == N0.f58001g ? new D0(n0B, (S) b(type).d()) : z10 ? new D0(n0B, (S) b(type).c()) : h(b02);
            }
        }
        return b02;
    }

    public static final Boolean e(M0 m02) {
        AbstractC5504s.e(m02);
        return Boolean.valueOf(AbstractC3103e.f(m02));
    }

    private static final C6973a f(C6976d c6976d) {
        C6973a c6973aB = b(c6976d.a());
        S s10 = (S) c6973aB.a();
        S s11 = (S) c6973aB.b();
        C6973a c6973aB2 = b(c6976d.b());
        return new C6973a(new C6976d(c6976d.c(), s11, (S) c6973aB2.a()), new C6976d(c6976d.c(), s10, (S) c6973aB2.b()));
    }

    private static final S g(S s10, List list) {
        s10.L0().size();
        list.size();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((C6976d) it.next()));
        }
        return F0.e(s10, arrayList, null, null, 6, null);
    }

    private static final B0 h(B0 b02) {
        G0 g0G = G0.g(new b());
        AbstractC5504s.g(g0G, "create(...)");
        return g0G.t(b02);
    }

    private static final C6976d i(B0 b02, m0 m0Var) {
        int i10 = a.f63200a[G0.c(m0Var.m(), b02).ordinal()];
        if (i10 == 1) {
            S type = b02.getType();
            AbstractC5504s.g(type, "getType(...)");
            S type2 = b02.getType();
            AbstractC5504s.g(type2, "getType(...)");
            return new C6976d(m0Var, type, type2);
        }
        if (i10 == 2) {
            S type3 = b02.getType();
            AbstractC5504s.g(type3, "getType(...)");
            AbstractC6183d0 abstractC6183d0J = e.m(m0Var).J();
            AbstractC5504s.g(abstractC6183d0J, "getNullableAnyType(...)");
            return new C6976d(m0Var, type3, abstractC6183d0J);
        }
        if (i10 != 3) {
            throw new r();
        }
        AbstractC6183d0 abstractC6183d0I = e.m(m0Var).I();
        AbstractC5504s.g(abstractC6183d0I, "getNothingType(...)");
        S type4 = b02.getType();
        AbstractC5504s.g(type4, "getType(...)");
        return new C6976d(m0Var, abstractC6183d0I, type4);
    }

    private static final B0 j(C6976d c6976d) {
        c6976d.d();
        if (!AbstractC5504s.c(c6976d.a(), c6976d.b())) {
            N0 n0M = c6976d.c().m();
            N0 n02 = N0.f58000f;
            if (n0M != n02) {
                return (!i.o0(c6976d.a()) || c6976d.c().m() == n02) ? i.q0(c6976d.b()) ? new D0(k(c6976d, n02), c6976d.a()) : new D0(k(c6976d, N0.f58001g), c6976d.b()) : new D0(k(c6976d, N0.f58001g), c6976d.b());
            }
        }
        return new D0(c6976d.a());
    }

    private static final N0 k(C6976d c6976d, N0 n02) {
        return n02 == c6976d.c().m() ? N0.f57999e : n02;
    }
}
