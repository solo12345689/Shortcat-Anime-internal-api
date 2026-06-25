package Pe;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.AbstractC6191h0;
import qf.B0;
import qf.J0;
import qf.M0;
import qf.N0;
import qf.v0;
import vf.AbstractC6867d;
import ye.InterfaceC7230h;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Pe.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2022g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ke.e f13874a;

    /* JADX INFO: renamed from: Pe.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qf.S f13875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13876b;

        public a(qf.S s10, int i10) {
            this.f13875a = s10;
            this.f13876b = i10;
        }

        public final int a() {
            return this.f13876b;
        }

        public final qf.S b() {
            return this.f13875a;
        }
    }

    /* JADX INFO: renamed from: Pe.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC6183d0 f13877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f13879c;

        public b(AbstractC6183d0 abstractC6183d0, int i10, boolean z10) {
            this.f13877a = abstractC6183d0;
            this.f13878b = i10;
            this.f13879c = z10;
        }

        public final boolean a() {
            return this.f13879c;
        }

        public final int b() {
            return this.f13878b;
        }

        public final AbstractC6183d0 c() {
            return this.f13877a;
        }
    }

    public C2022g(Ke.e javaResolverSettings) {
        AbstractC5504s.h(javaResolverSettings, "javaResolverSettings");
        this.f13874a = javaResolverSettings;
    }

    private final b b(AbstractC6183d0 abstractC6183d0, Function1 function1, int i10, p0 p0Var, boolean z10, boolean z11) {
        v0 v0VarN0;
        Boolean bool;
        a aVar;
        B0 b0S;
        Function1 function12 = function1;
        boolean zA = q0.a(p0Var);
        boolean z12 = (z11 && z10) ? false : true;
        qf.S s10 = null;
        if (!zA && abstractC6183d0.L0().isEmpty()) {
            return new b(null, 1, false);
        }
        InterfaceC7230h interfaceC7230hP = abstractC6183d0.N0().p();
        if (interfaceC7230hP == null) {
            return new b(null, 1, false);
        }
        C2023h c2023h = (C2023h) function12.invoke(Integer.valueOf(i10));
        InterfaceC7230h interfaceC7230hF = s0.f(interfaceC7230hP, c2023h, p0Var);
        Boolean boolH = s0.h(c2023h, p0Var);
        if (interfaceC7230hF == null || (v0VarN0 = interfaceC7230hF.l()) == null) {
            v0VarN0 = abstractC6183d0.N0();
        }
        v0 v0Var = v0VarN0;
        int iA = i10 + 1;
        List listL0 = abstractC6183d0.L0();
        List parameters = v0Var.getParameters();
        AbstractC5504s.g(parameters, "getParameters(...)");
        Iterator it = listL0.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2279u.x(listL0, 10), AbstractC2279u.x(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            ye.m0 m0Var = (ye.m0) it2.next();
            B0 b02 = (B0) next;
            if (z12) {
                bool = boolH;
                if (!b02.a()) {
                    aVar = d(b02.getType().Q0(), function12, iA, z11);
                } else if (((C2023h) function12.invoke(Integer.valueOf(iA))).f() == EnumC2026k.f13898a) {
                    M0 m0Q0 = b02.getType().Q0();
                    aVar = new a(qf.V.e(qf.L.c(m0Q0).R0(false), qf.L.d(m0Q0).R0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                bool = boolH;
                aVar = new a(s10, 0);
            }
            iA += aVar.a();
            if (aVar.b() != null) {
                qf.S sB = aVar.b();
                N0 n0B = b02.b();
                AbstractC5504s.g(n0B, "getProjectionKind(...)");
                b0S = AbstractC6867d.k(sB, n0B, m0Var);
            } else if (interfaceC7230hF == null || b02.a()) {
                b0S = interfaceC7230hF != null ? J0.s(m0Var) : null;
            } else {
                qf.S type = b02.getType();
                AbstractC5504s.g(type, "getType(...)");
                N0 n0B2 = b02.b();
                AbstractC5504s.g(n0B2, "getProjectionKind(...)");
                b0S = AbstractC6867d.k(type, n0B2, m0Var);
            }
            arrayList.add(b0S);
            function12 = function1;
            boolH = bool;
            s10 = null;
        }
        Boolean bool2 = boolH;
        int i11 = iA - i10;
        if (interfaceC7230hF == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((B0) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i11, false);
        }
        InterfaceC7374h annotations = abstractC6183d0.getAnnotations();
        C2021f c2021f = s0.f13935b;
        if (interfaceC7230hF == null) {
            c2021f = null;
        }
        qf.r0 r0VarB = qf.s0.b(s0.e(AbstractC2279u.r(annotations, c2021f, bool2 != null ? s0.g() : null)));
        List listL02 = abstractC6183d0.L0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listL02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC2279u.x(arrayList, 10), AbstractC2279u.x(listL02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            B0 b03 = (B0) it5.next();
            B0 b04 = (B0) next2;
            if (b04 != null) {
                b03 = b04;
            }
            arrayList2.add(b03);
        }
        AbstractC6183d0 abstractC6183d0K = qf.V.k(r0VarB, v0Var, arrayList2, bool2 != null ? bool2.booleanValue() : abstractC6183d0.O0(), null, 16, null);
        if (c2023h.d()) {
            abstractC6183d0K = e(abstractC6183d0K);
        }
        return new b(abstractC6183d0K, i11, bool2 != null && c2023h.g());
    }

    static /* synthetic */ b c(C2022g c2022g, AbstractC6183d0 abstractC6183d0, Function1 function1, int i10, p0 p0Var, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return c2022g.b(abstractC6183d0, function1, i10, p0Var, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Pe.C2022g.a d(qf.M0 r21, kotlin.jvm.functions.Function1 r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Pe.C2022g.d(qf.M0, kotlin.jvm.functions.Function1, int, boolean):Pe.g$a");
    }

    private final AbstractC6183d0 e(AbstractC6183d0 abstractC6183d0) {
        return this.f13874a.a() ? AbstractC6191h0.h(abstractC6183d0, true) : new C2025j(abstractC6183d0);
    }

    public final qf.S a(qf.S s10, Function1 qualifiers, boolean z10) {
        AbstractC5504s.h(s10, "<this>");
        AbstractC5504s.h(qualifiers, "qualifiers");
        return d(s10.Q0(), qualifiers, 0, z10).b();
    }
}
