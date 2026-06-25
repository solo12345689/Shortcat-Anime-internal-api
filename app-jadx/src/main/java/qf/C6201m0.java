package qf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.InterfaceC6205o0;
import vf.AbstractC6867d;
import ye.InterfaceC7230h;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: qf.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6201m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f58069c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C6201m0 f58070d = new C6201m0(InterfaceC6205o0.a.f58081a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6205o0 f58071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58072b;

    /* JADX INFO: renamed from: qf.m0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i10, ye.l0 l0Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + l0Var.getName());
        }

        private a() {
        }
    }

    public C6201m0(InterfaceC6205o0 reportStrategy, boolean z10) {
        AbstractC5504s.h(reportStrategy, "reportStrategy");
        this.f58071a = reportStrategy;
        this.f58072b = z10;
    }

    private final void a(InterfaceC7374h interfaceC7374h, InterfaceC7374h interfaceC7374h2) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC7374h.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC7369c) it.next()).f());
        }
        Iterator it2 = interfaceC7374h2.iterator();
        while (it2.hasNext()) {
            InterfaceC7369c interfaceC7369c = (InterfaceC7369c) it2.next();
            if (hashSet.contains(interfaceC7369c.f())) {
                this.f58071a.c(interfaceC7369c);
            }
        }
    }

    private final void b(S s10, S s11) {
        G0 g0F = G0.f(s11);
        AbstractC5504s.g(g0F, "create(...)");
        int i10 = 0;
        for (Object obj : s11.L0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            B0 b02 = (B0) obj;
            if (!b02.a()) {
                S type = b02.getType();
                AbstractC5504s.g(type, "getType(...)");
                if (!AbstractC6867d.g(type)) {
                    B0 b03 = (B0) s10.L0().get(i10);
                    ye.m0 m0Var = (ye.m0) s10.N0().getParameters().get(i10);
                    if (this.f58072b) {
                        InterfaceC6205o0 interfaceC6205o0 = this.f58071a;
                        S type2 = b03.getType();
                        AbstractC5504s.g(type2, "getType(...)");
                        S type3 = b02.getType();
                        AbstractC5504s.g(type3, "getType(...)");
                        AbstractC5504s.e(m0Var);
                        interfaceC6205o0.b(g0F, type2, type3, m0Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final AbstractC6183d0 c(AbstractC6183d0 abstractC6183d0, r0 r0Var) {
        return W.a(abstractC6183d0) ? abstractC6183d0 : F0.f(abstractC6183d0, null, g(abstractC6183d0, r0Var), 1, null);
    }

    private final AbstractC6183d0 d(AbstractC6183d0 abstractC6183d0, S s10) {
        AbstractC6183d0 abstractC6183d0R = J0.r(abstractC6183d0, s10.O0());
        AbstractC5504s.g(abstractC6183d0R, "makeNullableIfNeeded(...)");
        return abstractC6183d0R;
    }

    private final AbstractC6183d0 e(AbstractC6183d0 abstractC6183d0, S s10) {
        return c(d(abstractC6183d0, s10), s10.M0());
    }

    private final AbstractC6183d0 f(C6203n0 c6203n0, r0 r0Var, boolean z10) {
        v0 v0VarL = c6203n0.b().l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        return V.m(r0Var, v0VarL, c6203n0.a(), z10, InterfaceC5387k.b.f51800b);
    }

    private final r0 g(S s10, r0 r0Var) {
        return W.a(s10) ? s10.M0() : r0Var.n(s10.M0());
    }

    private final B0 i(B0 b02, C6203n0 c6203n0, int i10) {
        M0 m0Q0 = b02.getType().Q0();
        if (!E.a(m0Q0)) {
            AbstractC6183d0 abstractC6183d0A = F0.a(m0Q0);
            if (!W.a(abstractC6183d0A) && AbstractC6867d.E(abstractC6183d0A)) {
                v0 v0VarN0 = abstractC6183d0A.N0();
                InterfaceC7230h interfaceC7230hP = v0VarN0.p();
                v0VarN0.getParameters().size();
                abstractC6183d0A.L0().size();
                if (!(interfaceC7230hP instanceof ye.m0)) {
                    if (!(interfaceC7230hP instanceof ye.l0)) {
                        AbstractC6183d0 abstractC6183d0L = l(abstractC6183d0A, c6203n0, i10);
                        b(abstractC6183d0A, abstractC6183d0L);
                        return new D0(b02.b(), abstractC6183d0L);
                    }
                    ye.l0 l0Var = (ye.l0) interfaceC7230hP;
                    if (c6203n0.d(l0Var)) {
                        this.f58071a.d(l0Var);
                        return new D0(N0.f57999e, sf.l.d(sf.k.f59706s, l0Var.getName().toString()));
                    }
                    List listL0 = abstractC6183d0A.L0();
                    ArrayList arrayList = new ArrayList(AbstractC2279u.x(listL0, 10));
                    int i11 = 0;
                    for (Object obj : listL0) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC2279u.w();
                        }
                        arrayList.add(k((B0) obj, c6203n0, (ye.m0) v0VarN0.getParameters().get(i11), i10 + 1));
                        i11 = i12;
                    }
                    AbstractC6183d0 abstractC6183d0J = j(C6203n0.f58074e.a(c6203n0, l0Var, arrayList), abstractC6183d0A.M0(), abstractC6183d0A.O0(), i10 + 1, false);
                    AbstractC6183d0 abstractC6183d0L2 = l(abstractC6183d0A, c6203n0, i10);
                    if (!E.a(abstractC6183d0J)) {
                        abstractC6183d0J = AbstractC6191h0.j(abstractC6183d0J, abstractC6183d0L2);
                    }
                    return new D0(b02.b(), abstractC6183d0J);
                }
            }
        }
        return b02;
    }

    private final AbstractC6183d0 j(C6203n0 c6203n0, r0 r0Var, boolean z10, int i10, boolean z11) {
        B0 b0K = k(new D0(N0.f57999e, c6203n0.b().u0()), c6203n0, null, i10);
        S type = b0K.getType();
        AbstractC5504s.g(type, "getType(...)");
        AbstractC6183d0 abstractC6183d0A = F0.a(type);
        if (W.a(abstractC6183d0A)) {
            return abstractC6183d0A;
        }
        b0K.b();
        a(abstractC6183d0A.getAnnotations(), AbstractC6209t.a(r0Var));
        AbstractC6183d0 abstractC6183d0R = J0.r(c(abstractC6183d0A, r0Var), z10);
        AbstractC5504s.g(abstractC6183d0R, "let(...)");
        return z11 ? AbstractC6191h0.j(abstractC6183d0R, f(c6203n0, r0Var, z10)) : abstractC6183d0R;
    }

    private final B0 k(B0 b02, C6203n0 c6203n0, ye.m0 m0Var, int i10) {
        N0 n0M;
        N0 n02;
        N0 n03;
        f58069c.b(i10, c6203n0.b());
        if (b02.a()) {
            AbstractC5504s.e(m0Var);
            B0 b0S = J0.s(m0Var);
            AbstractC5504s.g(b0S, "makeStarProjection(...)");
            return b0S;
        }
        S type = b02.getType();
        AbstractC5504s.g(type, "getType(...)");
        B0 b0C = c6203n0.c(type.N0());
        if (b0C == null) {
            return i(b02, c6203n0, i10);
        }
        if (b0C.a()) {
            AbstractC5504s.e(m0Var);
            B0 b0S2 = J0.s(m0Var);
            AbstractC5504s.g(b0S2, "makeStarProjection(...)");
            return b0S2;
        }
        M0 m0Q0 = b0C.getType().Q0();
        N0 n0B = b0C.b();
        AbstractC5504s.g(n0B, "getProjectionKind(...)");
        N0 n0B2 = b02.b();
        AbstractC5504s.g(n0B2, "getProjectionKind(...)");
        if (n0B2 != n0B && n0B2 != (n03 = N0.f57999e)) {
            if (n0B == n03) {
                n0B = n0B2;
            } else {
                this.f58071a.a(c6203n0.b(), m0Var, m0Q0);
            }
        }
        if (m0Var == null || (n0M = m0Var.m()) == null) {
            n0M = N0.f57999e;
        }
        if (n0M != n0B && n0M != (n02 = N0.f57999e)) {
            if (n0B == n02) {
                n0B = n02;
            } else {
                this.f58071a.a(c6203n0.b(), m0Var, m0Q0);
            }
        }
        a(type.getAnnotations(), m0Q0.getAnnotations());
        return new D0(n0B, e(F0.a(m0Q0), type));
    }

    private final AbstractC6183d0 l(AbstractC6183d0 abstractC6183d0, C6203n0 c6203n0, int i10) {
        v0 v0VarN0 = abstractC6183d0.N0();
        List listL0 = abstractC6183d0.L0();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listL0, 10));
        int i11 = 0;
        for (Object obj : listL0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC2279u.w();
            }
            B0 b02 = (B0) obj;
            B0 b0K = k(b02, c6203n0, (ye.m0) v0VarN0.getParameters().get(i11), i10 + 1);
            if (!b0K.a()) {
                b0K = new D0(b0K.b(), J0.q(b0K.getType(), b02.getType().O0()));
            }
            arrayList.add(b0K);
            i11 = i12;
        }
        return F0.f(abstractC6183d0, arrayList, null, 2, null);
    }

    public final AbstractC6183d0 h(C6203n0 typeAliasExpansion, r0 attributes) {
        AbstractC5504s.h(typeAliasExpansion, "typeAliasExpansion");
        AbstractC5504s.h(attributes, "attributes");
        return j(typeAliasExpansion, attributes, false, 0, true);
    }
}
