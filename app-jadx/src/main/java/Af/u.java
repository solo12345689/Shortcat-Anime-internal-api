package af;

import Df.AbstractC1268a;
import Td.AbstractC2163n;
import Td.L;
import Ud.AbstractC2279u;
import af.n;
import df.AbstractC4598g;
import df.C4592a;
import df.C4593b;
import df.C4610s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.AbstractC6191h0;
import qf.B0;
import qf.C6176a;
import qf.C6214y;
import qf.I;
import qf.J0;
import qf.M0;
import qf.N0;
import qf.O0;
import qf.Q;
import qf.S;
import qf.W;
import qf.v0;
import ve.o;
import vf.AbstractC6867d;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.EnumC7228f;
import ye.H;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7231i;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.InterfaceC7238p;
import ye.InterfaceC7244w;
import ye.InterfaceC7247z;
import ye.M;
import ye.N;
import ye.V;
import ye.X;
import ye.Y;
import ye.Z;
import ye.a0;
import ye.b0;
import ye.c0;
import ye.l0;
import ye.m0;
import ye.q0;
import ye.t0;
import ye.u0;
import yf.AbstractC7248a;
import ze.EnumC7371e;
import ze.InterfaceC7367a;
import ze.InterfaceC7369c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class u extends n implements w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z f24006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f24007n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements InterfaceC7237o {

        /* JADX INFO: renamed from: af.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0420a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24009a;

            static {
                int[] iArr = new int[EnumC2612E.values().length];
                try {
                    iArr[EnumC2612E.f23956a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2612E.f23957b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC2612E.f23958c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f24009a = iArr;
            }
        }

        public a() {
        }

        private final void t(Y y10, StringBuilder sb2, String str) throws IOException {
            int i10 = C0420a.f24009a[u.this.P0().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    p(y10, sb2);
                    return;
                } else {
                    if (i10 != 3) {
                        throw new Td.r();
                    }
                    return;
                }
            }
            u.this.w1(y10, sb2);
            sb2.append(str + " for ");
            u uVar = u.this;
            Z zW = y10.W();
            AbstractC5504s.g(zW, "getCorrespondingProperty(...)");
            uVar.h2(zW, sb2);
        }

        public void A(t0 descriptor, StringBuilder builder) {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.B2(descriptor, true, builder, true);
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object a(c0 c0Var, Object obj) {
            x(c0Var, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object b(InterfaceC7247z interfaceC7247z, Object obj) throws IOException {
            p(interfaceC7247z, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object c(Z z10, Object obj) throws IOException {
            u(z10, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object d(N n10, Object obj) {
            r(n10, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object e(l0 l0Var, Object obj) {
            y(l0Var, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object f(m0 m0Var, Object obj) {
            z(m0Var, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object g(b0 b0Var, Object obj) throws IOException {
            w(b0Var, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object h(t0 t0Var, Object obj) {
            A(t0Var, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object i(a0 a0Var, Object obj) throws IOException {
            v(a0Var, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object j(H h10, Object obj) {
            q(h10, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object k(V v10, Object obj) {
            s(v10, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object l(InterfaceC7227e interfaceC7227e, Object obj) throws IOException {
            n(interfaceC7227e, (StringBuilder) obj);
            return L.f17438a;
        }

        @Override // ye.InterfaceC7237o
        public /* bridge */ /* synthetic */ Object m(InterfaceC7234l interfaceC7234l, Object obj) throws IOException {
            o(interfaceC7234l, (StringBuilder) obj);
            return L.f17438a;
        }

        public void n(InterfaceC7227e descriptor, StringBuilder builder) throws IOException {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.C1(descriptor, builder);
        }

        public void o(InterfaceC7234l constructorDescriptor, StringBuilder builder) throws IOException {
            AbstractC5504s.h(constructorDescriptor, "constructorDescriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.H1(constructorDescriptor, builder);
        }

        public void p(InterfaceC7247z descriptor, StringBuilder builder) throws IOException {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.P1(descriptor, builder);
        }

        public void q(H descriptor, StringBuilder builder) {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.Z1(descriptor, builder, true);
        }

        public void r(N descriptor, StringBuilder builder) {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.d2(descriptor, builder);
        }

        public void s(V descriptor, StringBuilder builder) {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.f2(descriptor, builder);
        }

        public void u(Z descriptor, StringBuilder builder) throws IOException {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.h2(descriptor, builder);
        }

        public void v(a0 descriptor, StringBuilder builder) throws IOException {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(b0 descriptor, StringBuilder builder) throws IOException {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(c0 descriptor, StringBuilder builder) {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(l0 descriptor, StringBuilder builder) {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.q2(descriptor, builder);
        }

        public void z(m0 descriptor, StringBuilder builder) {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(builder, "builder");
            u.this.w2(descriptor, builder, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f24011b;

        static {
            int[] iArr = new int[EnumC2613F.values().length];
            try {
                iArr[EnumC2613F.f23961a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2613F.f23962b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24010a = iArr;
            int[] iArr2 = new int[EnumC2611D.values().length];
            try {
                iArr2[EnumC2611D.f23951a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC2611D.f23952b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC2611D.f23953c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f24011b = iArr2;
        }
    }

    public u(z options) {
        AbstractC5504s.h(options, "options");
        this.f24006m = options;
        options.p0();
        this.f24007n = AbstractC2163n.b(new o(this));
    }

    static /* synthetic */ void A1(u uVar, StringBuilder sb2, InterfaceC7367a interfaceC7367a, EnumC7371e enumC7371e, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC7371e = null;
        }
        uVar.z1(sb2, interfaceC7367a, enumC7371e);
    }

    static /* synthetic */ void A2(u uVar, u0 u0Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        uVar.z2(u0Var, sb2, z10);
    }

    private final void B1(InterfaceC7231i interfaceC7231i, StringBuilder sb2) {
        List listQ = interfaceC7231i.q();
        AbstractC5504s.g(listQ, "getDeclaredTypeParameters(...)");
        List parameters = interfaceC7231i.l().getParameters();
        AbstractC5504s.g(parameters, "getParameters(...)");
        if (j1() && interfaceC7231i.A() && parameters.size() > listQ.size()) {
            sb2.append(" /*captured type parameters: ");
            x2(sb2, parameters.subList(listQ.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B2(ye.t0 r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r8.S1(r2)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L10:
            boolean r2 = r8.j1()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r11.append(r2)
            int r2 = r9.getIndex()
            r11.append(r2)
        */
        //  java.lang.String r2 = "*/ "
        /*
            r11.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r1 = r11
            A1(r0, r1, r2, r3, r4, r5)
            boolean r2 = r9.s0()
            java.lang.String r3 = "crossinline"
            r8.Y1(r11, r2, r3)
            boolean r2 = r9.r0()
            java.lang.String r3 = "noinline"
            r8.Y1(r11, r2, r3)
            boolean r2 = r8.Y0()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L60
            ye.a r2 = r9.b()
            boolean r3 = r2 instanceof ye.InterfaceC7226d
            if (r3 == 0) goto L55
            ye.d r2 = (ye.InterfaceC7226d) r2
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L60
            boolean r2 = r2.e0()
            if (r2 != r7) goto L60
            r5 = r7
            goto L61
        L60:
            r5 = r6
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r8.t0()
            java.lang.String r3 = "actual"
            r8.Y1(r11, r2, r3)
        L6c:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.D2(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function1 r0 = r8.z0()
            if (r0 == 0) goto L8c
            boolean r0 = r8.i()
            if (r0 == 0) goto L85
            boolean r0 = r9.B0()
            goto L89
        L85:
            boolean r0 = ff.e.f(r9)
        L89:
            if (r0 == 0) goto L8c
            r6 = r7
        L8c:
            if (r6 == 0) goto Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " = "
            r0.append(r2)
            kotlin.jvm.functions.Function1 r2 = r8.z0()
            kotlin.jvm.internal.AbstractC5504s.e(r2)
            java.lang.Object r2 = r2.invoke(r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: af.u.B2(ye.t0, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final u C0() {
        return (u) this.f24007n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(InterfaceC7227e interfaceC7227e, StringBuilder sb2) throws IOException {
        InterfaceC7226d interfaceC7226dD;
        boolean z10 = interfaceC7227e.h() == EnumC7228f.f65100e;
        if (!d1()) {
            List listZ = interfaceC7227e.Z();
            AbstractC5504s.g(listZ, "getContextReceivers(...)");
            J1(listZ, sb2);
            A1(this, sb2, interfaceC7227e, null, 2, null);
            if (!z10) {
                AbstractC7242u visibility = interfaceC7227e.getVisibility();
                AbstractC5504s.g(visibility, "getVisibility(...)");
                E2(visibility, sb2);
            }
            if ((interfaceC7227e.h() != EnumC7228f.f65098c || interfaceC7227e.r() != ye.E.f65063e) && (!interfaceC7227e.h().b() || interfaceC7227e.r() != ye.E.f65060b)) {
                ye.E eR = interfaceC7227e.r();
                AbstractC5504s.g(eR, "getModality(...)");
                W1(eR, sb2, r1(interfaceC7227e));
            }
            U1(interfaceC7227e, sb2);
            Y1(sb2, I0().contains(v.f24019i) && interfaceC7227e.A(), "inner");
            Y1(sb2, I0().contains(v.f24021k) && interfaceC7227e.I0(), "data");
            Y1(sb2, I0().contains(v.f24022l) && interfaceC7227e.isInline(), "inline");
            Y1(sb2, I0().contains(v.f24028r) && interfaceC7227e.s(), "value");
            Y1(sb2, I0().contains(v.f24027q) && interfaceC7227e.g0(), "fun");
            D1(interfaceC7227e, sb2);
        }
        if (bf.i.x(interfaceC7227e)) {
            F1(interfaceC7227e, sb2);
        } else {
            if (!d1()) {
                m2(sb2);
            }
            Z1(interfaceC7227e, sb2, true);
        }
        if (z10) {
            return;
        }
        List listQ = interfaceC7227e.q();
        AbstractC5504s.g(listQ, "getDeclaredTypeParameters(...)");
        y2(listQ, sb2, false);
        B1(interfaceC7227e, sb2);
        if (!interfaceC7227e.h().b() && x0() && (interfaceC7226dD = interfaceC7227e.D()) != null) {
            sb2.append(" ");
            A1(this, sb2, interfaceC7226dD, null, 2, null);
            AbstractC7242u visibility2 = interfaceC7226dD.getVisibility();
            AbstractC5504s.g(visibility2, "getVisibility(...)");
            E2(visibility2, sb2);
            sb2.append(S1("constructor"));
            List listJ = interfaceC7226dD.j();
            AbstractC5504s.g(listJ, "getValueParameters(...)");
            C2(listJ, interfaceC7226dD.i0(), sb2);
        }
        n2(interfaceC7227e, sb2);
        F2(listQ, sb2);
    }

    private final void C2(Collection collection, boolean z10, StringBuilder sb2) {
        boolean zH2 = H2(z10);
        int size = collection.size();
        i1().b(size, sb2);
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            i1().a(t0Var, i10, size, sb2);
            B2(t0Var, zH2, sb2, false);
            i1().c(t0Var, i10, size, sb2);
            i10++;
        }
        i1().d(size, sb2);
    }

    private final void D1(InterfaceC7227e interfaceC7227e, StringBuilder sb2) {
        sb2.append(S1(n.f23986a.a(interfaceC7227e)));
    }

    private final void D2(u0 u0Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        S type = u0Var.getType();
        AbstractC5504s.g(type, "getType(...)");
        t0 t0Var = u0Var instanceof t0 ? (t0) u0Var : null;
        S sV0 = t0Var != null ? t0Var.v0() : null;
        S s10 = sV0 == null ? type : sV0;
        Y1(sb2, sV0 != null, "vararg");
        if (z12 || (z11 && !d1())) {
            z2(u0Var, sb2, z12);
        }
        if (z10) {
            Z1(u0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(S(s10));
        R1(u0Var, sb2);
        if (!j1() || sV0 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(S(type));
        sb2.append("*/");
    }

    private final boolean E2(AbstractC7242u abstractC7242u, StringBuilder sb2) {
        if (!I0().contains(v.f24015e)) {
            return false;
        }
        if (J0()) {
            abstractC7242u = abstractC7242u.f();
        }
        if (!X0() && AbstractC5504s.c(abstractC7242u, AbstractC7241t.f65131l)) {
            return false;
        }
        sb2.append(S1(abstractC7242u.c()));
        sb2.append(" ");
        return true;
    }

    private final void F1(InterfaceC7235m interfaceC7235m, StringBuilder sb2) {
        if (S0()) {
            if (d1()) {
                sb2.append("companion object");
            }
            m2(sb2);
            InterfaceC7235m interfaceC7235mB = interfaceC7235m.b();
            if (interfaceC7235mB != null) {
                sb2.append("of ");
                Xe.f name = interfaceC7235mB.getName();
                AbstractC5504s.g(name, "getName(...)");
                sb2.append(R(name, false));
            }
        }
        if (j1() || !AbstractC5504s.c(interfaceC7235m.getName(), Xe.h.f21783d)) {
            if (!d1()) {
                m2(sb2);
            }
            Xe.f name2 = interfaceC7235m.getName();
            AbstractC5504s.g(name2, "getName(...)");
            sb2.append(R(name2, true));
        }
    }

    private final void F2(List list, StringBuilder sb2) throws IOException {
        if (o1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            List upperBounds = m0Var.getUpperBounds();
            AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
            for (S s10 : AbstractC2279u.g0(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                Xe.f name = m0Var.getName();
                AbstractC5504s.g(name, "getName(...)");
                sb3.append(R(name, false));
                sb3.append(" : ");
                AbstractC5504s.e(s10);
                sb3.append(S(s10));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(S1("where"));
        sb2.append(" ");
        Ud.F.t0(arrayList, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    private final String G1(AbstractC4598g abstractC4598g) {
        Function1 function1P = this.f24006m.P();
        if (function1P != null) {
            return (String) function1P.invoke(abstractC4598g);
        }
        if (abstractC4598g instanceof C4593b) {
            Iterable iterable = (Iterable) ((C4593b) abstractC4598g).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strG1 = G1((AbstractC4598g) it.next());
                if (strG1 != null) {
                    arrayList.add(strG1);
                }
            }
            return AbstractC2279u.w0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (abstractC4598g instanceof C4592a) {
            return Df.r.C0(n.O(this, (InterfaceC7369c) ((C4592a) abstractC4598g).b(), null, 2, null), "@");
        }
        if (!(abstractC4598g instanceof C4610s)) {
            return abstractC4598g.toString();
        }
        C4610s.b bVar = (C4610s.b) ((C4610s) abstractC4598g).b();
        if (bVar instanceof C4610s.b.a) {
            return ((C4610s.b.a) bVar).a() + "::class";
        }
        if (!(bVar instanceof C4610s.b.C0712b)) {
            throw new Td.r();
        }
        C4610s.b.C0712b c0712b = (C4610s.b.C0712b) bVar;
        String strA = c0712b.b().a().a();
        for (int i10 = 0; i10 < c0712b.a(); i10++) {
            strA = "kotlin.Array<" + strA + '>';
        }
        return strA + "::class";
    }

    private final boolean G2(S s10) {
        if (!ve.h.p(s10)) {
            return false;
        }
        List listL0 = s10.L0();
        if (listL0 != null && listL0.isEmpty()) {
            return true;
        }
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            if (((B0) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H1(ye.InterfaceC7234l r18, java.lang.StringBuilder r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: af.u.H1(ye.l, java.lang.StringBuilder):void");
    }

    private final boolean H2(boolean z10) {
        int i10 = b.f24011b[M0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return !z10;
        }
        if (i10 == 3) {
            return false;
        }
        throw new Td.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence I1(t0 t0Var) {
        return "";
    }

    private final void J1(List list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            c0 c0Var = (c0) it.next();
            z1(sb2, c0Var, EnumC7371e.f66210h);
            S type = c0Var.getType();
            AbstractC5504s.g(type, "getType(...)");
            sb2.append(N1(type));
            if (i10 == AbstractC2279u.o(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    private final void K1(StringBuilder sb2, S s10) {
        A1(this, sb2, s10, null, 2, null);
        C6214y c6214y = s10 instanceof C6214y ? (C6214y) s10 : null;
        if (c6214y != null) {
            c6214y.Z0();
        }
        if (!W.a(s10)) {
            v2(this, sb2, s10, null, 2, null);
            L l10 = L.f17438a;
        } else if (AbstractC6867d.z(s10) && O0()) {
            sb2.append(L1(sf.l.f59724a.p(s10)));
        } else {
            if (!(s10 instanceof sf.i) || H0()) {
                sb2.append(s10.N0().toString());
            } else {
                sb2.append(((sf.i) s10).W0());
            }
            sb2.append(r2(s10.L0()));
        }
        if (s10.O0()) {
            sb2.append("?");
        }
        if (AbstractC6191h0.c(s10)) {
            sb2.append(" & Any");
        }
    }

    private final String L1(String str) {
        int i10 = b.f24010a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new Td.r();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final void M1(StringBuilder sb2, C6176a c6176a) {
        EnumC2613F enumC2613FE1 = e1();
        EnumC2613F enumC2613F = EnumC2613F.f23962b;
        if (enumC2613FE1 == enumC2613F) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        b2(sb2, c6176a.G());
        sb2.append(" */");
        if (e1() == enumC2613F) {
            sb2.append("</i></font>");
        }
    }

    private final String N1(S s10) {
        String strS = S(s10);
        if ((!G2(s10) || J0.l(s10)) && !(s10 instanceof C6214y)) {
            return strS;
        }
        return '(' + strS + ')';
    }

    private final String O1(List list) {
        return q0(AbstractC2614G.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(InterfaceC7247z interfaceC7247z, StringBuilder sb2) throws IOException {
        InterfaceC7247z interfaceC7247z2;
        StringBuilder sb3;
        if (d1()) {
            interfaceC7247z2 = interfaceC7247z;
            sb3 = sb2;
        } else {
            if (c1()) {
                interfaceC7247z2 = interfaceC7247z;
                sb3 = sb2;
            } else {
                List listY0 = interfaceC7247z.y0();
                AbstractC5504s.g(listY0, "getContextReceiverParameters(...)");
                J1(listY0, sb2);
                interfaceC7247z2 = interfaceC7247z;
                sb3 = sb2;
                A1(this, sb3, interfaceC7247z2, null, 2, null);
                AbstractC7242u visibility = interfaceC7247z2.getVisibility();
                AbstractC5504s.g(visibility, "getVisibility(...)");
                E2(visibility, sb3);
                X1(interfaceC7247z2, sb3);
                if (D0()) {
                    U1(interfaceC7247z2, sb3);
                }
                c2(interfaceC7247z2, sb3);
                if (D0()) {
                    x1(interfaceC7247z2, sb3);
                } else {
                    p2(interfaceC7247z2, sb3);
                }
                T1(interfaceC7247z2, sb3);
                if (j1()) {
                    if (interfaceC7247z2.D0()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC7247z2.G0()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb3.append(S1("fun"));
            sb3.append(" ");
            List typeParameters = interfaceC7247z2.getTypeParameters();
            AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb3, true);
            j2(interfaceC7247z2, sb3);
        }
        Z1(interfaceC7247z2, sb3, true);
        List listJ = interfaceC7247z2.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        C2(listJ, interfaceC7247z2.i0(), sb3);
        k2(interfaceC7247z2, sb3);
        S returnType = interfaceC7247z2.getReturnType();
        if (!m1() && (h1() || returnType == null || !ve.i.D0(returnType))) {
            sb3.append(": ");
            sb3.append(returnType == null ? "[NULL]" : S(returnType));
        }
        List typeParameters2 = interfaceC7247z2.getTypeParameters();
        AbstractC5504s.g(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb3);
    }

    private final void Q1(StringBuilder sb2, S s10) {
        Xe.f fVarD;
        int length = sb2.length();
        A1(C0(), sb2, s10, null, 2, null);
        boolean z10 = sb2.length() != length;
        S sK = ve.h.k(s10);
        List listE = ve.h.e(s10);
        boolean zR = ve.h.r(s10);
        boolean zO0 = s10.O0();
        boolean z11 = zO0 || (z10 && sK != null);
        if (z11) {
            if (zR) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    AbstractC1268a.c(Df.r.q1(sb2));
                    if (sb2.charAt(Df.r.d0(sb2) - 1) != ')') {
                        sb2.insert(Df.r.d0(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!listE.isEmpty()) {
            sb2.append("context(");
            Iterator it = listE.subList(0, AbstractC2279u.o(listE)).iterator();
            while (it.hasNext()) {
                a2(sb2, (S) it.next());
                sb2.append(", ");
            }
            a2(sb2, (S) AbstractC2279u.y0(listE));
            sb2.append(") ");
        }
        Y1(sb2, zR, "suspend");
        if (sK != null) {
            boolean z12 = (G2(sK) && !sK.O0()) || q1(sK) || (sK instanceof C6214y);
            if (z12) {
                sb2.append("(");
            }
            a2(sb2, sK);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!ve.h.n(s10) || s10.L0().size() > 1) {
            int i10 = 0;
            for (B0 b02 : ve.h.m(s10)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (N0()) {
                    S type = b02.getType();
                    AbstractC5504s.g(type, "getType(...)");
                    fVarD = ve.h.d(type);
                } else {
                    fVarD = null;
                }
                if (fVarD != null) {
                    sb2.append(R(fVarD, false));
                    sb2.append(": ");
                }
                sb2.append(T(b02));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(p0());
        sb2.append(" ");
        a2(sb2, ve.h.l(s10));
        if (z11) {
            sb2.append(")");
        }
        if (zO0) {
            sb2.append("?");
        }
    }

    private final void R1(u0 u0Var, StringBuilder sb2) {
        AbstractC4598g abstractC4598gQ0;
        String strG1;
        if (!G0() || (abstractC4598gQ0 = u0Var.q0()) == null || (strG1 = G1(abstractC4598gQ0)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(q0(strG1));
    }

    private final String S1(String str) {
        int i10 = b.f24010a[e1().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new Td.r();
            }
            if (!w0()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    private final void T1(InterfaceC7224b interfaceC7224b, StringBuilder sb2) {
        if (I0().contains(v.f24020j) && j1() && interfaceC7224b.h() != InterfaceC7224b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(AbstractC7248a.f(interfaceC7224b.h().name()));
            sb2.append("*/ ");
        }
    }

    private final void U1(ye.D d10, StringBuilder sb2) {
        Y1(sb2, d10.isExternal(), "external");
        boolean z10 = false;
        Y1(sb2, I0().contains(v.f24023m) && d10.m0(), "expect");
        if (I0().contains(v.f24024n) && d10.Y()) {
            z10 = true;
        }
        Y1(sb2, z10, "actual");
    }

    private final void W1(ye.E e10, StringBuilder sb2, ye.E e11) {
        if (W0() || e10 != e11) {
            Y1(sb2, I0().contains(v.f24016f), AbstractC7248a.f(e10.name()));
        }
    }

    private final void X1(InterfaceC7224b interfaceC7224b, StringBuilder sb2) {
        if (bf.i.J(interfaceC7224b) && interfaceC7224b.r() == ye.E.f65060b) {
            return;
        }
        if (L0() == EnumC2610C.f23946a && interfaceC7224b.r() == ye.E.f65062d && u1(interfaceC7224b)) {
            return;
        }
        ye.E eR = interfaceC7224b.r();
        AbstractC5504s.g(eR, "getModality(...)");
        W1(eR, sb2, r1(interfaceC7224b));
    }

    private final void Y1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(S1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(InterfaceC7235m interfaceC7235m, StringBuilder sb2, boolean z10) {
        Xe.f name = interfaceC7235m.getName();
        AbstractC5504s.g(name, "getName(...)");
        sb2.append(R(name, z10));
    }

    private final void a2(StringBuilder sb2, S s10) {
        M0 m0Q0 = s10.Q0();
        C6176a c6176a = m0Q0 instanceof C6176a ? (C6176a) m0Q0 : null;
        if (c6176a == null) {
            b2(sb2, s10);
            return;
        }
        if (Z0()) {
            b2(sb2, c6176a.G());
            if (R0()) {
                v1(sb2, c6176a);
                return;
            }
            return;
        }
        b2(sb2, c6176a.Z0());
        if (a1()) {
            M1(sb2, c6176a);
        }
    }

    private final void b2(StringBuilder sb2, S s10) {
        if ((s10 instanceof O0) && i() && !((O0) s10).S0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            sb2.append(((I) m0Q0).X0(this, this));
        } else {
            if (!(m0Q0 instanceof AbstractC6183d0)) {
                throw new Td.r();
            }
            l2(sb2, (AbstractC6183d0) m0Q0);
        }
    }

    private final void c2(InterfaceC7224b interfaceC7224b, StringBuilder sb2) {
        if (I0().contains(v.f24017g) && u1(interfaceC7224b) && L0() != EnumC2610C.f23947b) {
            Y1(sb2, true, "override");
            if (j1()) {
                sb2.append("/*");
                sb2.append(interfaceC7224b.e().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(N n10, StringBuilder sb2) {
        e2(n10.f(), "package-fragment", sb2);
        if (i()) {
            sb2.append(" in ");
            Z1(n10.b(), sb2, false);
        }
    }

    private final void e2(Xe.c cVar, String str, StringBuilder sb2) {
        sb2.append(S1(str));
        String strQ = Q(cVar.i());
        if (strQ.length() > 0) {
            sb2.append(" ");
            sb2.append(strQ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(V v10, StringBuilder sb2) {
        e2(v10.f(), "package", sb2);
        if (i()) {
            sb2.append(" in context of ");
            Z1(v10.C0(), sb2, false);
        }
    }

    private final void g2(StringBuilder sb2, X x10) {
        X xC = x10.c();
        if (xC != null) {
            g2(sb2, xC);
            sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
            Xe.f name = x10.b().getName();
            AbstractC5504s.g(name, "getName(...)");
            sb2.append(R(name, false));
        } else {
            v0 v0VarL = x10.b().l();
            AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
            sb2.append(s2(v0VarL));
        }
        sb2.append(r2(x10.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(Z z10, StringBuilder sb2) throws IOException {
        Z z11;
        StringBuilder sb3;
        if (d1()) {
            z11 = z10;
            sb3 = sb2;
        } else {
            if (!c1()) {
                List listY0 = z10.y0();
                AbstractC5504s.g(listY0, "getContextReceiverParameters(...)");
                J1(listY0, sb2);
                i2(z10, sb2);
                AbstractC7242u visibility = z10.getVisibility();
                AbstractC5504s.g(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                boolean z12 = false;
                Y1(sb2, I0().contains(v.f24025o) && z10.d0(), "const");
                U1(z10, sb2);
                X1(z10, sb2);
                c2(z10, sb2);
                if (I0().contains(v.f24026p) && z10.z0()) {
                    z12 = true;
                }
                Y1(sb2, z12, "lateinit");
                T1(z10, sb2);
            }
            z11 = z10;
            sb3 = sb2;
            A2(this, z11, sb3, false, 4, null);
            List typeParameters = z11.getTypeParameters();
            AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb3, true);
            j2(z11, sb3);
        }
        Z1(z11, sb3, true);
        sb3.append(": ");
        S type = z11.getType();
        AbstractC5504s.g(type, "getType(...)");
        sb3.append(S(type));
        k2(z11, sb3);
        R1(z11, sb3);
        List typeParameters2 = z11.getTypeParameters();
        AbstractC5504s.g(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb3);
    }

    private final void i2(Z z10, StringBuilder sb2) {
        if (I0().contains(v.f24018h)) {
            A1(this, sb2, z10, null, 2, null);
            InterfaceC7244w interfaceC7244wW0 = z10.w0();
            if (interfaceC7244wW0 != null) {
                z1(sb2, interfaceC7244wW0, EnumC7371e.f66205c);
            }
            InterfaceC7244w interfaceC7244wP = z10.P();
            if (interfaceC7244wP != null) {
                z1(sb2, interfaceC7244wP, EnumC7371e.f66213k);
            }
            if (P0() == EnumC2612E.f23958c) {
                a0 a0VarD = z10.d();
                if (a0VarD != null) {
                    z1(sb2, a0VarD, EnumC7371e.f66208f);
                }
                b0 b0VarG = z10.g();
                if (b0VarG != null) {
                    z1(sb2, b0VarG, EnumC7371e.f66209g);
                    List listJ = b0VarG.j();
                    AbstractC5504s.g(listJ, "getValueParameters(...)");
                    t0 t0Var = (t0) AbstractC2279u.M0(listJ);
                    AbstractC5504s.e(t0Var);
                    z1(sb2, t0Var, EnumC7371e.f66212j);
                }
            }
        }
    }

    private final void j2(InterfaceC7223a interfaceC7223a, StringBuilder sb2) {
        c0 c0VarO = interfaceC7223a.O();
        if (c0VarO != null) {
            z1(sb2, c0VarO, EnumC7371e.f66210h);
            S type = c0VarO.getType();
            AbstractC5504s.g(type, "getType(...)");
            sb2.append(N1(type));
            sb2.append(".");
        }
    }

    private final void k2(InterfaceC7223a interfaceC7223a, StringBuilder sb2) {
        c0 c0VarO;
        if (Q0() && (c0VarO = interfaceC7223a.O()) != null) {
            sb2.append(" on ");
            S type = c0VarO.getType();
            AbstractC5504s.g(type, "getType(...)");
            sb2.append(S(type));
        }
    }

    private final void l2(StringBuilder sb2, AbstractC6183d0 abstractC6183d0) {
        if (AbstractC5504s.c(abstractC6183d0, J0.f57989b) || J0.k(abstractC6183d0)) {
            sb2.append("???");
            return;
        }
        if (sf.l.o(abstractC6183d0)) {
            if (!g1()) {
                sb2.append("???");
                return;
            }
            v0 v0VarN0 = abstractC6183d0.N0();
            AbstractC5504s.f(v0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(L1(((sf.j) v0VarN0).c(0)));
            return;
        }
        if (W.a(abstractC6183d0)) {
            K1(sb2, abstractC6183d0);
        } else if (G2(abstractC6183d0)) {
            Q1(sb2, abstractC6183d0);
        } else {
            K1(sb2, abstractC6183d0);
        }
    }

    private final void m0(StringBuilder sb2, InterfaceC7235m interfaceC7235m) {
        InterfaceC7235m interfaceC7235mB;
        String name;
        if ((interfaceC7235m instanceof N) || (interfaceC7235m instanceof V) || (interfaceC7235mB = interfaceC7235m.b()) == null || (interfaceC7235mB instanceof H)) {
            return;
        }
        sb2.append(" ");
        sb2.append(V1("defined in"));
        sb2.append(" ");
        Xe.d dVarM = bf.i.m(interfaceC7235mB);
        AbstractC5504s.g(dVarM, "getFqName(...)");
        sb2.append(dVarM.e() ? "root package" : Q(dVarM));
        if (l1() && (interfaceC7235mB instanceof N) && (interfaceC7235m instanceof InterfaceC7238p) && (name = ((InterfaceC7238p) interfaceC7235m).k().b().getName()) != null) {
            sb2.append(" ");
            sb2.append(V1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    private final void m2(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void n0(StringBuilder sb2, List list) throws IOException {
        Ud.F.t0(list, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new q(this));
    }

    private final void n2(InterfaceC7227e interfaceC7227e, StringBuilder sb2) throws IOException {
        if (n1() || ve.i.o0(interfaceC7227e.p())) {
            return;
        }
        Collection collectionK = interfaceC7227e.l().k();
        AbstractC5504s.g(collectionK, "getSupertypes(...)");
        if (collectionK.isEmpty()) {
            return;
        }
        if (collectionK.size() == 1 && ve.i.c0((S) collectionK.iterator().next())) {
            return;
        }
        m2(sb2);
        sb2.append(": ");
        Ud.F.t0(collectionK, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o0(u uVar, B0 it) {
        AbstractC5504s.h(it, "it");
        if (it.a()) {
            return "*";
        }
        S type = it.getType();
        AbstractC5504s.g(type, "getType(...)");
        String strS = uVar.S(type);
        if (it.b() == N0.f57999e) {
            return strS;
        }
        return it.b() + ' ' + strS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o2(u uVar, S s10) {
        AbstractC5504s.e(s10);
        return uVar.S(s10);
    }

    private final String p0() {
        int i10 = b.f24010a[e1().ordinal()];
        if (i10 == 1) {
            return q0("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new Td.r();
    }

    private final String p1() {
        return q0(">");
    }

    private final void p2(InterfaceC7247z interfaceC7247z, StringBuilder sb2) {
        Y1(sb2, interfaceC7247z.isSuspend(), "suspend");
    }

    private final String q0(String str) {
        return e1().b(str);
    }

    private final boolean q1(S s10) {
        return ve.h.r(s10) || !s10.getAnnotations().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(l0 l0Var, StringBuilder sb2) {
        A1(this, sb2, l0Var, null, 2, null);
        AbstractC7242u visibility = l0Var.getVisibility();
        AbstractC5504s.g(visibility, "getVisibility(...)");
        E2(visibility, sb2);
        U1(l0Var, sb2);
        sb2.append(S1("typealias"));
        sb2.append(" ");
        Z1(l0Var, sb2, true);
        List listQ = l0Var.q();
        AbstractC5504s.g(listQ, "getDeclaredTypeParameters(...)");
        y2(listQ, sb2, false);
        B1(l0Var, sb2);
        sb2.append(" = ");
        sb2.append(S(l0Var.u0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r0(u uVar) {
        n nVarU = uVar.U(t.f24005a);
        AbstractC5504s.f(nVarU, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (u) nVarU;
    }

    private final ye.E r1(ye.D d10) {
        if (d10 instanceof InterfaceC7227e) {
            return ((InterfaceC7227e) d10).h() == EnumC7228f.f65098c ? ye.E.f65063e : ye.E.f65060b;
        }
        InterfaceC7235m interfaceC7235mB = d10.b();
        InterfaceC7227e interfaceC7227e = interfaceC7235mB instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mB : null;
        if (interfaceC7227e == null) {
            return ye.E.f65060b;
        }
        if (!(d10 instanceof InterfaceC7224b)) {
            return ye.E.f65060b;
        }
        InterfaceC7224b interfaceC7224b = (InterfaceC7224b) d10;
        Collection collectionE = interfaceC7224b.e();
        AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
        if (!collectionE.isEmpty() && interfaceC7227e.r() != ye.E.f65060b) {
            return ye.E.f65062d;
        }
        if (interfaceC7227e.h() != EnumC7228f.f65098c || AbstractC5504s.c(interfaceC7224b.getVisibility(), AbstractC7241t.f65120a)) {
            return ye.E.f65060b;
        }
        ye.E eR = interfaceC7224b.r();
        ye.E e10 = ye.E.f65063e;
        return eR == e10 ? e10 : ye.E.f65062d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L s0(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.k(Ud.a0.l(withOptions.h(), AbstractC2279u.p(o.a.f62187C, o.a.f62189D)));
        return L.f17438a;
    }

    private final boolean s1(InterfaceC7369c interfaceC7369c) {
        return AbstractC5504s.c(interfaceC7369c.f(), o.a.f62191E);
    }

    private final String t1() {
        return q0("<");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t2(S it) {
        AbstractC5504s.h(it, "it");
        return it;
    }

    private final boolean u1(InterfaceC7224b interfaceC7224b) {
        return !interfaceC7224b.e().isEmpty();
    }

    private final void u2(StringBuilder sb2, S s10, v0 v0Var) {
        X xD = q0.d(s10);
        if (xD != null) {
            g2(sb2, xD);
        } else {
            sb2.append(s2(v0Var));
            sb2.append(r2(s10.L0()));
        }
    }

    private final void v1(StringBuilder sb2, C6176a c6176a) {
        EnumC2613F enumC2613FE1 = e1();
        EnumC2613F enumC2613F = EnumC2613F.f23962b;
        if (enumC2613FE1 == enumC2613F) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        b2(sb2, c6176a.Z0());
        sb2.append(" */");
        if (e1() == enumC2613F) {
            sb2.append("</i></font>");
        }
    }

    static /* synthetic */ void v2(u uVar, StringBuilder sb2, S s10, v0 v0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = s10.N0();
        }
        uVar.u2(sb2, s10, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(Y y10, StringBuilder sb2) {
        U1(y10, sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(m0 m0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(t1());
        }
        if (j1()) {
            sb2.append("/*");
            sb2.append(m0Var.getIndex());
            sb2.append("*/ ");
        }
        Y1(sb2, m0Var.y(), "reified");
        String strC = m0Var.m().c();
        boolean z11 = true;
        Y1(sb2, strC.length() > 0, strC);
        A1(this, sb2, m0Var, null, 2, null);
        Z1(m0Var, sb2, z10);
        int size = m0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            S s10 = (S) m0Var.getUpperBounds().iterator().next();
            if (!ve.i.k0(s10)) {
                sb2.append(" : ");
                AbstractC5504s.e(s10);
                sb2.append(S(s10));
            }
        } else if (z10) {
            for (S s11 : m0Var.getUpperBounds()) {
                if (!ve.i.k0(s11)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    AbstractC5504s.e(s11);
                    sb2.append(S(s11));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(p1());
        }
    }

    private final void x1(InterfaceC7247z interfaceC7247z, StringBuilder sb2) {
        boolean z10;
        boolean z11 = false;
        if (interfaceC7247z.isOperator()) {
            Collection collectionE = interfaceC7247z.e();
            AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
            Collection collection = collectionE;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC7247z) it.next()).isOperator()) {
                        if (u0()) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (interfaceC7247z.isInfix()) {
            Collection collectionE2 = interfaceC7247z.e();
            AbstractC5504s.g(collectionE2, "getOverriddenDescriptors(...)");
            Collection collection2 = collectionE2;
            if (collection2.isEmpty()) {
                z11 = true;
            } else {
                Iterator it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((InterfaceC7247z) it2.next()).isInfix()) {
                        if (u0()) {
                            break;
                        }
                    }
                }
            }
        }
        Y1(sb2, interfaceC7247z.C(), "tailrec");
        p2(interfaceC7247z, sb2);
        Y1(sb2, interfaceC7247z.isInline(), "inline");
        Y1(sb2, z11, "infix");
        Y1(sb2, z10, "operator");
    }

    private final void x2(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w2((m0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final List y1(InterfaceC7369c interfaceC7369c) {
        InterfaceC7226d interfaceC7226dD;
        List listJ;
        Map mapA = interfaceC7369c.a();
        List listM = null;
        InterfaceC7227e interfaceC7227eL = V0() ? ff.e.l(interfaceC7369c) : null;
        if (interfaceC7227eL != null && (interfaceC7226dD = interfaceC7227eL.D()) != null && (listJ = interfaceC7226dD.j()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (((t0) obj).B0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((t0) it.next()).getName());
            }
            listM = arrayList2;
        }
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM) {
            if (!mapA.containsKey((Xe.f) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC2279u.x(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Xe.f) it2.next()).b() + " = ...");
        }
        Set<Map.Entry> setEntrySet = mapA.entrySet();
        ArrayList arrayList5 = new ArrayList(AbstractC2279u.x(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            Xe.f fVar = (Xe.f) entry.getKey();
            AbstractC4598g abstractC4598g = (AbstractC4598g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.b());
            sb2.append(" = ");
            sb2.append(!listM.contains(fVar) ? G1(abstractC4598g) : "...");
            arrayList5.add(sb2.toString());
        }
        return AbstractC2279u.Q0(AbstractC2279u.I0(arrayList4, arrayList5));
    }

    private final void y2(List list, StringBuilder sb2, boolean z10) {
        if (o1() || list.isEmpty()) {
            return;
        }
        sb2.append(t1());
        x2(sb2, list);
        sb2.append(p1());
        if (z10) {
            sb2.append(" ");
        }
    }

    private final void z1(StringBuilder sb2, InterfaceC7367a interfaceC7367a, EnumC7371e enumC7371e) {
        if (I0().contains(v.f24018h)) {
            Set setH = interfaceC7367a instanceof S ? h() : B0();
            Function1 function1V0 = v0();
            for (InterfaceC7369c interfaceC7369c : interfaceC7367a.getAnnotations()) {
                if (!AbstractC2279u.e0(setH, interfaceC7369c.f()) && !s1(interfaceC7369c) && (function1V0 == null || ((Boolean) function1V0.invoke(interfaceC7369c)).booleanValue())) {
                    sb2.append(N(interfaceC7369c, enumC7371e));
                    if (A0()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void z2(u0 u0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(u0Var instanceof t0)) {
            sb2.append(S1(u0Var.N() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    public boolean A0() {
        return this.f24006m.B();
    }

    public Set B0() {
        return this.f24006m.C();
    }

    public boolean D0() {
        return this.f24006m.D();
    }

    public boolean E0() {
        return this.f24006m.E();
    }

    public String E1(InterfaceC7230h klass) {
        AbstractC5504s.h(klass, "klass");
        return sf.l.m(klass) ? klass.l().toString() : y0().a(klass, this);
    }

    public boolean F0() {
        return this.f24006m.F();
    }

    public boolean G0() {
        return this.f24006m.G();
    }

    public boolean H0() {
        return this.f24006m.H();
    }

    public Set I0() {
        return this.f24006m.I();
    }

    public boolean J0() {
        return this.f24006m.J();
    }

    public final z K0() {
        return this.f24006m;
    }

    public EnumC2610C L0() {
        return this.f24006m.K();
    }

    @Override // af.n
    public String M(InterfaceC7235m declarationDescriptor) {
        AbstractC5504s.h(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.b0(new a(), sb2);
        if (k1()) {
            m0(sb2, declarationDescriptor);
        }
        return sb2.toString();
    }

    public EnumC2611D M0() {
        return this.f24006m.L();
    }

    @Override // af.n
    public String N(InterfaceC7369c annotation, EnumC7371e enumC7371e) throws IOException {
        AbstractC5504s.h(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (enumC7371e != null) {
            sb2.append(enumC7371e.b() + ':');
        }
        S type = annotation.getType();
        sb2.append(S(type));
        if (E0()) {
            List listY1 = y1(annotation);
            if (F0() || !listY1.isEmpty()) {
                Ud.F.t0(listY1, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (j1() && (W.a(type) || (type.N0().p() instanceof M.b))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    public boolean N0() {
        return this.f24006m.M();
    }

    public boolean O0() {
        return this.f24006m.N();
    }

    @Override // af.n
    public String P(String lowerRendered, String upperRendered, ve.i builtIns) {
        AbstractC5504s.h(lowerRendered, "lowerRendered");
        AbstractC5504s.h(upperRendered, "upperRendered");
        AbstractC5504s.h(builtIns, "builtIns");
        if (AbstractC2614G.f(lowerRendered, upperRendered)) {
            if (!Df.r.Q(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        InterfaceC2616b interfaceC2616bY0 = y0();
        InterfaceC7227e interfaceC7227eX = builtIns.x();
        AbstractC5504s.g(interfaceC7227eX, "getCollection(...)");
        String strE1 = Df.r.e1(interfaceC2616bY0.a(interfaceC7227eX, this), "Collection", null, 2, null);
        String strD = AbstractC2614G.d(lowerRendered, strE1 + "Mutable", upperRendered, strE1, strE1 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = AbstractC2614G.d(lowerRendered, strE1 + "MutableMap.MutableEntry", upperRendered, strE1 + "Map.Entry", strE1 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        InterfaceC2616b interfaceC2616bY02 = y0();
        InterfaceC7227e interfaceC7227eJ = builtIns.j();
        AbstractC5504s.g(interfaceC7227eJ, "getArray(...)");
        String strE12 = Df.r.e1(interfaceC2616bY02.a(interfaceC7227eJ, this), "Array", null, 2, null);
        String strD3 = AbstractC2614G.d(lowerRendered, strE12 + q0("Array<"), upperRendered, strE12 + q0("Array<out "), strE12 + q0("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public EnumC2612E P0() {
        return this.f24006m.O();
    }

    @Override // af.n
    public String Q(Xe.d fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return O1(fqName.h());
    }

    public boolean Q0() {
        return this.f24006m.Q();
    }

    @Override // af.n
    public String R(Xe.f name, boolean z10) {
        AbstractC5504s.h(name, "name");
        String strQ0 = q0(AbstractC2614G.b(name));
        if (!w0() || e1() != EnumC2613F.f23962b || !z10) {
            return strQ0;
        }
        return "<b>" + strQ0 + "</b>";
    }

    public boolean R0() {
        return this.f24006m.R();
    }

    @Override // af.n
    public String S(S type) {
        AbstractC5504s.h(type, "type");
        StringBuilder sb2 = new StringBuilder();
        a2(sb2, (S) f1().invoke(type));
        return sb2.toString();
    }

    public boolean S0() {
        return this.f24006m.S();
    }

    @Override // af.n
    public String T(B0 typeProjection) throws IOException {
        AbstractC5504s.h(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        n0(sb2, AbstractC2279u.e(typeProjection));
        return sb2.toString();
    }

    public boolean T0() {
        return this.f24006m.T();
    }

    public boolean U0() {
        return this.f24006m.U();
    }

    public boolean V0() {
        return this.f24006m.V();
    }

    public String V1(String message) {
        AbstractC5504s.h(message, "message");
        int i10 = b.f24010a[e1().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 != 2) {
            throw new Td.r();
        }
        return "<i>" + message + "</i>";
    }

    public boolean W0() {
        return this.f24006m.W();
    }

    public boolean X0() {
        return this.f24006m.X();
    }

    public boolean Y0() {
        return this.f24006m.Y();
    }

    public boolean Z0() {
        return this.f24006m.Z();
    }

    @Override // af.w
    public void a(boolean z10) {
        this.f24006m.a(z10);
    }

    public boolean a1() {
        return this.f24006m.a0();
    }

    @Override // af.w
    public void b(boolean z10) {
        this.f24006m.b(z10);
    }

    public boolean b1() {
        return this.f24006m.b0();
    }

    @Override // af.w
    public boolean c() {
        return this.f24006m.c();
    }

    public boolean c1() {
        return this.f24006m.c0();
    }

    @Override // af.w
    public void d(boolean z10) {
        this.f24006m.d(z10);
    }

    public boolean d1() {
        return this.f24006m.d0();
    }

    @Override // af.w
    public void e(boolean z10) {
        this.f24006m.e(z10);
    }

    public EnumC2613F e1() {
        return this.f24006m.e0();
    }

    @Override // af.w
    public void f(EnumC2611D enumC2611D) {
        AbstractC5504s.h(enumC2611D, "<set-?>");
        this.f24006m.f(enumC2611D);
    }

    public Function1 f1() {
        return this.f24006m.f0();
    }

    @Override // af.w
    public void g(InterfaceC2616b interfaceC2616b) {
        AbstractC5504s.h(interfaceC2616b, "<set-?>");
        this.f24006m.g(interfaceC2616b);
    }

    public boolean g1() {
        return this.f24006m.g0();
    }

    @Override // af.w
    public Set h() {
        return this.f24006m.h();
    }

    public boolean h1() {
        return this.f24006m.h0();
    }

    @Override // af.w
    public boolean i() {
        return this.f24006m.i();
    }

    public n.b i1() {
        return this.f24006m.i0();
    }

    @Override // af.w
    public EnumC2615a j() {
        return this.f24006m.j();
    }

    public boolean j1() {
        return this.f24006m.j0();
    }

    @Override // af.w
    public void k(Set set) {
        AbstractC5504s.h(set, "<set-?>");
        this.f24006m.k(set);
    }

    public boolean k1() {
        return this.f24006m.k0();
    }

    @Override // af.w
    public void l(Set set) {
        AbstractC5504s.h(set, "<set-?>");
        this.f24006m.l(set);
    }

    public boolean l1() {
        return this.f24006m.l0();
    }

    @Override // af.w
    public void m(boolean z10) {
        this.f24006m.m(z10);
    }

    public boolean m1() {
        return this.f24006m.m0();
    }

    @Override // af.w
    public void n(boolean z10) {
        this.f24006m.n(z10);
    }

    public boolean n1() {
        return this.f24006m.n0();
    }

    @Override // af.w
    public void o(EnumC2613F enumC2613F) {
        AbstractC5504s.h(enumC2613F, "<set-?>");
        this.f24006m.o(enumC2613F);
    }

    public boolean o1() {
        return this.f24006m.o0();
    }

    @Override // af.w
    public void p(boolean z10) {
        this.f24006m.p(z10);
    }

    public String r2(List typeArguments) throws IOException {
        AbstractC5504s.h(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t1());
        n0(sb2, typeArguments);
        sb2.append(p1());
        return sb2.toString();
    }

    public String s2(v0 typeConstructor) {
        AbstractC5504s.h(typeConstructor, "typeConstructor");
        InterfaceC7230h interfaceC7230hP = typeConstructor.p();
        if ((interfaceC7230hP instanceof m0) || (interfaceC7230hP instanceof InterfaceC7227e) || (interfaceC7230hP instanceof l0)) {
            return E1(interfaceC7230hP);
        }
        if (interfaceC7230hP == null) {
            return typeConstructor instanceof Q ? ((Q) typeConstructor).i(p.f24001a) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC7230hP.getClass()).toString());
    }

    public boolean t0() {
        return this.f24006m.u();
    }

    public boolean u0() {
        return this.f24006m.v();
    }

    public Function1 v0() {
        return this.f24006m.w();
    }

    public boolean w0() {
        return this.f24006m.x();
    }

    public boolean x0() {
        return this.f24006m.y();
    }

    public InterfaceC2616b y0() {
        return this.f24006m.z();
    }

    public Function1 z0() {
        return this.f24006m.A();
    }
}
