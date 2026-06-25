package qf;

import Ud.AbstractC2279u;
import df.C4608q;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import qf.InterfaceC6205o0;
import rf.AbstractC6317g;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class V {

    /* JADX INFO: renamed from: a */
    public static final V f58024a = new V();

    /* JADX INFO: renamed from: b */
    private static final Function1 f58025b = a.f58026a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f58026a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Void invoke(AbstractC6317g abstractC6317g) {
            AbstractC5504s.h(abstractC6317g, "<unused var>");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private final AbstractC6183d0 f58027a;

        /* JADX INFO: renamed from: b */
        private final v0 f58028b;

        public b(AbstractC6183d0 abstractC6183d0, v0 v0Var) {
            this.f58027a = abstractC6183d0;
            this.f58028b = v0Var;
        }

        public final AbstractC6183d0 a() {
            return this.f58027a;
        }

        public final v0 b() {
            return this.f58028b;
        }
    }

    private V() {
    }

    public static final AbstractC6183d0 c(ye.l0 l0Var, List arguments) {
        AbstractC5504s.h(l0Var, "<this>");
        AbstractC5504s.h(arguments, "arguments");
        return new C6201m0(InterfaceC6205o0.a.f58081a, false).h(C6203n0.f58074e.a(null, l0Var, arguments), r0.f58089b.k());
    }

    private final InterfaceC5387k d(v0 v0Var, List list, AbstractC6317g abstractC6317g) {
        InterfaceC7230h interfaceC7230hP = v0Var.p();
        if (interfaceC7230hP instanceof ye.m0) {
            return ((ye.m0) interfaceC7230hP).p().o();
        }
        if (interfaceC7230hP instanceof InterfaceC7227e) {
            if (abstractC6317g == null) {
                abstractC6317g = ff.e.r(ff.e.s(interfaceC7230hP));
            }
            return list.isEmpty() ? Be.A.b((InterfaceC7227e) interfaceC7230hP, abstractC6317g) : Be.A.a((InterfaceC7227e) interfaceC7230hP, w0.f58118c.b(v0Var, list), abstractC6317g);
        }
        if (interfaceC7230hP instanceof ye.l0) {
            return sf.l.a(sf.h.f59617e, true, ((ye.l0) interfaceC7230hP).getName().toString());
        }
        if (v0Var instanceof Q) {
            return ((Q) v0Var).e();
        }
        throw new IllegalStateException("Unsupported classifier: " + interfaceC7230hP + " for constructor: " + v0Var);
    }

    public static final M0 e(AbstractC6183d0 lowerBound, AbstractC6183d0 upperBound) {
        AbstractC5504s.h(lowerBound, "lowerBound");
        AbstractC5504s.h(upperBound, "upperBound");
        return AbstractC5504s.c(lowerBound, upperBound) ? lowerBound : new J(lowerBound, upperBound);
    }

    public static final AbstractC6183d0 f(r0 attributes, C4608q constructor, boolean z10) {
        AbstractC5504s.h(attributes, "attributes");
        AbstractC5504s.h(constructor, "constructor");
        return m(attributes, constructor, AbstractC2279u.m(), z10, sf.l.a(sf.h.f59615c, true, "unknown integer literal type"));
    }

    private final b g(v0 v0Var, AbstractC6317g abstractC6317g, List list) {
        InterfaceC7230h interfaceC7230hF;
        InterfaceC7230h interfaceC7230hP = v0Var.p();
        if (interfaceC7230hP == null || (interfaceC7230hF = abstractC6317g.f(interfaceC7230hP)) == null) {
            return null;
        }
        if (interfaceC7230hF instanceof ye.l0) {
            return new b(c((ye.l0) interfaceC7230hF, list), null);
        }
        v0 v0VarO = interfaceC7230hF.l().o(abstractC6317g);
        AbstractC5504s.g(v0VarO, "refine(...)");
        return new b(null, v0VarO);
    }

    public static final AbstractC6183d0 h(r0 attributes, InterfaceC7227e descriptor, List arguments) {
        AbstractC5504s.h(attributes, "attributes");
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(arguments, "arguments");
        v0 v0VarL = descriptor.l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        return k(attributes, v0VarL, arguments, false, null, 16, null);
    }

    public static final AbstractC6183d0 i(r0 attributes, v0 constructor, List arguments, boolean z10) {
        AbstractC5504s.h(attributes, "attributes");
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(arguments, "arguments");
        return k(attributes, constructor, arguments, z10, null, 16, null);
    }

    public static final AbstractC6183d0 j(r0 attributes, v0 constructor, List arguments, boolean z10, AbstractC6317g abstractC6317g) {
        AbstractC5504s.h(attributes, "attributes");
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.p() == null) {
            return n(attributes, constructor, arguments, z10, f58024a.d(constructor, arguments, abstractC6317g), new T(constructor, arguments, attributes, z10));
        }
        InterfaceC7230h interfaceC7230hP = constructor.p();
        AbstractC5504s.e(interfaceC7230hP);
        AbstractC6183d0 abstractC6183d0P = interfaceC7230hP.p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        return abstractC6183d0P;
    }

    public static /* synthetic */ AbstractC6183d0 k(r0 r0Var, v0 v0Var, List list, boolean z10, AbstractC6317g abstractC6317g, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            abstractC6317g = null;
        }
        return j(r0Var, v0Var, list, z10, abstractC6317g);
    }

    public static final AbstractC6183d0 l(v0 v0Var, List list, r0 r0Var, boolean z10, AbstractC6317g refiner) {
        AbstractC5504s.h(refiner, "refiner");
        b bVarG = f58024a.g(v0Var, refiner, list);
        if (bVarG == null) {
            return null;
        }
        AbstractC6183d0 abstractC6183d0A = bVarG.a();
        if (abstractC6183d0A != null) {
            return abstractC6183d0A;
        }
        v0 v0VarB = bVarG.b();
        AbstractC5504s.e(v0VarB);
        return j(r0Var, v0VarB, list, z10, refiner);
    }

    public static final AbstractC6183d0 m(r0 attributes, v0 constructor, List arguments, boolean z10, InterfaceC5387k memberScope) {
        AbstractC5504s.h(attributes, "attributes");
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(arguments, "arguments");
        AbstractC5504s.h(memberScope, "memberScope");
        C6185e0 c6185e0 = new C6185e0(constructor, arguments, z10, memberScope, new U(constructor, arguments, attributes, z10, memberScope));
        return attributes.isEmpty() ? c6185e0 : new C6187f0(c6185e0, attributes);
    }

    public static final AbstractC6183d0 n(r0 attributes, v0 constructor, List arguments, boolean z10, InterfaceC5387k memberScope, Function1 refinedTypeFactory) {
        AbstractC5504s.h(attributes, "attributes");
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(arguments, "arguments");
        AbstractC5504s.h(memberScope, "memberScope");
        AbstractC5504s.h(refinedTypeFactory, "refinedTypeFactory");
        C6185e0 c6185e0 = new C6185e0(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? c6185e0 : new C6187f0(c6185e0, attributes);
    }

    public static final AbstractC6183d0 o(v0 v0Var, List list, r0 r0Var, boolean z10, InterfaceC5387k interfaceC5387k, AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        b bVarG = f58024a.g(v0Var, kotlinTypeRefiner, list);
        if (bVarG == null) {
            return null;
        }
        AbstractC6183d0 abstractC6183d0A = bVarG.a();
        if (abstractC6183d0A != null) {
            return abstractC6183d0A;
        }
        v0 v0VarB = bVarG.b();
        AbstractC5504s.e(v0VarB);
        return m(r0Var, v0VarB, list, z10, interfaceC5387k);
    }
}
