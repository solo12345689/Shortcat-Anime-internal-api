package R0;

import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import I0.InterfaceC1693t;
import K0.A0;
import K0.AbstractC1785e0;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import K0.B0;
import K0.C1781c0;
import K0.J;
import Td.L;
import Ud.AbstractC2279u;
import a0.C2507c;
import androidx.compose.ui.e;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import i1.C5025r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e.c f15009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J f15011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SemanticsConfiguration f15012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s f15014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f15015g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2099h f15016a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2099h c2099h) {
            super(1);
            this.f15016a = c2099h;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }

        public final void invoke(C c10) {
            A.c0(c10, this.f15016a.p());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15017a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f15017a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }

        public final void invoke(C c10) {
            A.U(c10, this.f15017a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends e.c implements A0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f15018a;

        c(Function1 function1) {
            this.f15018a = function1;
        }

        @Override // K0.A0
        public void Y(C c10) {
            this.f15018a.invoke(c10);
        }
    }

    public s(e.c cVar, boolean z10, J j10, SemanticsConfiguration semanticsConfiguration) {
        this.f15009a = cVar;
        this.f15010b = z10;
        this.f15011c = j10;
        this.f15012d = semanticsConfiguration;
        this.f15015g = j10.y();
    }

    private final boolean A() {
        return this.f15010b && this.f15012d.v();
    }

    private final void D(List list, SemanticsConfiguration semanticsConfiguration) {
        if (this.f15012d.u()) {
            return;
        }
        F(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            s sVar = (s) list.get(size2);
            if (!sVar.A()) {
                semanticsConfiguration.w(sVar.f15012d);
                sVar.D(list, semanticsConfiguration);
            }
        }
    }

    public static /* synthetic */ List F(s sVar, List list, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return sVar.E(list, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final C6226h a(InterfaceC1690p interfaceC1690p) {
        ?? H10;
        s sVarT = t();
        if (sVarT == null) {
            return C6226h.f58334e.a();
        }
        C1781c0 c1781c0T0 = sVarT.f15011c.t0();
        int iA = AbstractC1789g0.a(8);
        if ((c1781c0T0.i() & iA) != 0) {
            loop0: for (e.c cVarK = c1781c0T0.k(); cVarK != null; cVarK = cVarK.getChild$ui_release()) {
                if ((cVarK.getKindSet$ui_release() & iA) != 0) {
                    H10 = cVarK;
                    ?? c2507c = 0;
                    while (H10 != 0) {
                        if (H10 instanceof A0) {
                            if (((A0) H10).z()) {
                                break loop0;
                            }
                        } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                            e.c cVarF1 = ((AbstractC1800m) H10).F1();
                            int i10 = 0;
                            H10 = H10;
                            c2507c = c2507c;
                            while (cVarF1 != null) {
                                if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                    i10++;
                                    c2507c = c2507c;
                                    if (i10 == 1) {
                                        H10 = cVarF1;
                                    } else {
                                        if (c2507c == 0) {
                                            c2507c = new C2507c(new e.c[16], 0);
                                        }
                                        if (H10 != 0) {
                                            c2507c.c(H10);
                                            H10 = 0;
                                        }
                                        c2507c.c(cVarF1);
                                    }
                                }
                                cVarF1 = cVarF1.getChild$ui_release();
                                H10 = H10;
                                c2507c = c2507c;
                            }
                            if (i10 == 1) {
                            }
                        }
                        H10 = AbstractC1796k.h(c2507c);
                    }
                }
                if ((cVarK.getAggregateChildKindSet$ui_release() & iA) == 0) {
                    break;
                }
            }
            H10 = 0;
        } else {
            H10 = 0;
        }
        A0 a02 = (A0) H10;
        AbstractC1785e0 abstractC1785e0I = a02 != null ? AbstractC1796k.i(a02, AbstractC1789g0.a(8)) : null;
        return abstractC1785e0I == null ? sVarT.a(interfaceC1690p) : InterfaceC1690p.V(abstractC1785e0I, interfaceC1690p, false, 2, null);
    }

    private final void c(List list) {
        C2099h c2099hF = t.f(this);
        if (c2099hF != null && this.f15012d.v() && !list.isEmpty()) {
            list.add(d(c2099hF, new a(c2099hF)));
        }
        SemanticsConfiguration semanticsConfiguration = this.f15012d;
        x xVar = x.f15043a;
        if (semanticsConfiguration.e(xVar.d()) && !list.isEmpty() && this.f15012d.v()) {
            List list2 = (List) m.a(this.f15012d, xVar.d());
            String str = list2 != null ? (String) AbstractC2279u.o0(list2) : null;
            if (str != null) {
                list.add(0, d(null, new b(str)));
            }
        }
    }

    private final s d(C2099h c2099h, Function1 function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.z(false);
        semanticsConfiguration.y(false);
        function1.invoke(semanticsConfiguration);
        s sVar = new s(new c(function1), false, new J(true, c2099h != null ? t.g(this) : t.e(this)), semanticsConfiguration);
        sVar.f15013e = true;
        sVar.f15014f = this;
        return sVar;
    }

    private final void e(J j10, List list, boolean z10) {
        C2507c c2507cH0 = j10.H0();
        Object[] objArr = c2507cH0.f23496a;
        int iP = c2507cH0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j11 = (J) objArr[i10];
            if (j11.b() && (z10 || !j11.z())) {
                if (j11.t0().q(AbstractC1789g0.a(8))) {
                    list.add(t.a(j11, this.f15010b));
                } else {
                    e(j11, list, z10);
                }
            }
        }
    }

    private final List g(List list, List list2) {
        F(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            s sVar = (s) list.get(size2);
            if (sVar.A()) {
                list2.add(sVar);
            } else if (!sVar.f15012d.u()) {
                sVar.g(list, list2);
            }
        }
        return list2;
    }

    static /* synthetic */ List h(s sVar, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list2 = new ArrayList();
        }
        return sVar.g(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    private final A0 i() {
        ?? H10;
        ?? r52 = 0;
        r52 = 0;
        r52 = 0;
        r52 = 0;
        if (this.f15012d.v()) {
            C1781c0 c1781c0T0 = this.f15011c.t0();
            int iA = AbstractC1789g0.a(8);
            if ((c1781c0T0.i() & iA) != 0) {
                e.c cVarK = c1781c0T0.k();
                H10 = 0;
                while (cVarK != null) {
                    if ((cVarK.getKindSet$ui_release() & iA) != 0) {
                        ?? H11 = cVarK;
                        ?? c2507c = 0;
                        while (H11 != 0) {
                            if (H11 instanceof A0) {
                                A0 a02 = (A0) H11;
                                if (a02.z()) {
                                    if (a02.z1()) {
                                        return a02;
                                    }
                                    if (H10 == 0) {
                                        H10 = a02;
                                    }
                                }
                            } else if ((H11.getKindSet$ui_release() & iA) != 0 && (H11 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H11).F1();
                                int i10 = 0;
                                H11 = H11;
                                c2507c = c2507c;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c = c2507c;
                                        if (i10 == 1) {
                                            H11 = cVarF1;
                                        } else {
                                            if (c2507c == 0) {
                                                c2507c = new C2507c(new e.c[16], 0);
                                            }
                                            if (H11 != 0) {
                                                c2507c.c(H11);
                                                H11 = 0;
                                            }
                                            c2507c.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H11 = H11;
                                    c2507c = c2507c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H11 = AbstractC1796k.h(c2507c);
                        }
                    }
                    if ((cVarK.getAggregateChildKindSet$ui_release() & iA) == 0) {
                        break;
                    }
                    cVarK = cVarK.getChild$ui_release();
                    H10 = H10;
                }
                r52 = H10;
            }
        } else {
            C1781c0 c1781c0T02 = this.f15011c.t0();
            int iA2 = AbstractC1789g0.a(8);
            if ((c1781c0T02.i() & iA2) != 0) {
                loop3: for (e.c cVarK2 = c1781c0T02.k(); cVarK2 != null; cVarK2 = cVarK2.getChild$ui_release()) {
                    if ((cVarK2.getKindSet$ui_release() & iA2) != 0) {
                        H10 = cVarK2;
                        ?? c2507c2 = 0;
                        while (H10 != 0) {
                            if (H10 instanceof A0) {
                                if (((A0) H10).z()) {
                                    r52 = H10;
                                }
                            } else if ((H10.getKindSet$ui_release() & iA2) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF12 = ((AbstractC1800m) H10).F1();
                                int i11 = 0;
                                H10 = H10;
                                c2507c2 = c2507c2;
                                while (cVarF12 != null) {
                                    if ((cVarF12.getKindSet$ui_release() & iA2) != 0) {
                                        i11++;
                                        c2507c2 = c2507c2;
                                        if (i11 == 1) {
                                            H10 = cVarF12;
                                        } else {
                                            if (c2507c2 == 0) {
                                                c2507c2 = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c2.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c2.c(cVarF12);
                                        }
                                    }
                                    cVarF12 = cVarF12.getChild$ui_release();
                                    H10 = H10;
                                    c2507c2 = c2507c2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c2);
                        }
                    }
                    if ((cVarK2.getAggregateChildKindSet$ui_release() & iA2) == 0) {
                        break;
                    }
                }
            }
        }
        return (A0) r52;
    }

    public static /* synthetic */ List o(s sVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !sVar.f15010b;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return sVar.n(z10, z11, z12);
    }

    public final boolean B() {
        AbstractC1785e0 abstractC1785e0F = f();
        if (abstractC1785e0F != null) {
            return abstractC1785e0F.b3();
        }
        return false;
    }

    public final boolean C() {
        if (this.f15013e || !v().isEmpty()) {
            return false;
        }
        J jA0 = this.f15011c.A0();
        while (true) {
            if (jA0 == null) {
                jA0 = null;
                break;
            }
            SemanticsConfiguration semanticsConfigurationE = jA0.e();
            if (semanticsConfigurationE != null && semanticsConfigurationE.v()) {
                break;
            }
            jA0 = jA0.A0();
        }
        return jA0 == null;
    }

    public final List E(List list, boolean z10, boolean z11) {
        if (this.f15013e) {
            return AbstractC2279u.m();
        }
        e(this.f15011c, list, z11);
        if (z10) {
            c(list);
        }
        return list;
    }

    public final s b() {
        return new s(this.f15009a, true, this.f15011c, this.f15012d);
    }

    public final AbstractC1785e0 f() {
        AbstractC1785e0 abstractC1785e0I;
        if (!this.f15013e) {
            A0 a0I = i();
            return (a0I == null || (abstractC1785e0I = AbstractC1796k.i(a0I, AbstractC1789g0.a(8))) == null) ? this.f15011c.X() : abstractC1785e0I;
        }
        s sVarT = t();
        if (sVarT != null) {
            return sVarT.f();
        }
        return null;
    }

    public final C6226h j() {
        InterfaceC1690p interfaceC1690pX;
        AbstractC1785e0 abstractC1785e0F = f();
        if (abstractC1785e0F != null) {
            if (!abstractC1785e0F.b()) {
                abstractC1785e0F = null;
            }
            if (abstractC1785e0F != null && (interfaceC1690pX = abstractC1785e0F.x()) != null) {
                return a(interfaceC1690pX);
            }
        }
        return C6226h.f58334e.a();
    }

    public final C6226h k() {
        C6226h c6226hB;
        AbstractC1785e0 abstractC1785e0F = f();
        if (abstractC1785e0F != null) {
            if (!abstractC1785e0F.b()) {
                abstractC1785e0F = null;
            }
            if (abstractC1785e0F != null && (c6226hB = AbstractC1691q.b(abstractC1785e0F)) != null) {
                return c6226hB;
            }
        }
        return C6226h.f58334e.a();
    }

    public final C6226h l() {
        C6226h c6226hC;
        AbstractC1785e0 abstractC1785e0F = f();
        if (abstractC1785e0F != null) {
            if (!abstractC1785e0F.b()) {
                abstractC1785e0F = null;
            }
            if (abstractC1785e0F != null && (c6226hC = AbstractC1691q.c(abstractC1785e0F)) != null) {
                return c6226hC;
            }
        }
        return C6226h.f58334e.a();
    }

    public final List m() {
        return o(this, false, false, false, 7, null);
    }

    public final List n(boolean z10, boolean z11, boolean z12) {
        if (!z10 && this.f15012d.u()) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList();
        return A() ? h(this, arrayList, null, 2, null) : E(arrayList, z11, z12);
    }

    public final SemanticsConfiguration p() {
        if (!A()) {
            return this.f15012d;
        }
        SemanticsConfiguration semanticsConfigurationI = this.f15012d.i();
        D(new ArrayList(), semanticsConfigurationI);
        return semanticsConfigurationI;
    }

    public final int q() {
        return this.f15015g;
    }

    public final InterfaceC1693t r() {
        return this.f15011c;
    }

    public final J s() {
        return this.f15011c;
    }

    public final s t() {
        J jA0;
        s sVar = this.f15014f;
        if (sVar != null) {
            return sVar;
        }
        if (this.f15010b) {
            jA0 = this.f15011c.A0();
            while (jA0 != null) {
                SemanticsConfiguration semanticsConfigurationE = jA0.e();
                if (semanticsConfigurationE != null && semanticsConfigurationE.v()) {
                    break;
                }
                jA0 = jA0.A0();
            }
            jA0 = null;
        } else {
            jA0 = null;
        }
        if (jA0 == null) {
            jA0 = this.f15011c.A0();
            while (true) {
                if (jA0 == null) {
                    jA0 = null;
                    break;
                }
                if (jA0.t0().q(AbstractC1789g0.a(8))) {
                    break;
                }
                jA0 = jA0.A0();
            }
        }
        if (jA0 == null) {
            return null;
        }
        return t.a(jA0, this.f15010b);
    }

    public final long u() {
        AbstractC1785e0 abstractC1785e0F = f();
        if (abstractC1785e0F != null) {
            if (!abstractC1785e0F.b()) {
                abstractC1785e0F = null;
            }
            if (abstractC1785e0F != null) {
                return AbstractC1691q.e(abstractC1785e0F);
            }
        }
        return C6224f.f58329b.c();
    }

    public final List v() {
        return o(this, false, true, false, 4, null);
    }

    public final long w() {
        AbstractC1785e0 abstractC1785e0F = f();
        return abstractC1785e0F != null ? abstractC1785e0F.a() : C5025r.f48570b.a();
    }

    public final C6226h x() {
        A0 a0I = i();
        return a0I == null ? this.f15011c.X().C3() : B0.c(a0I.getNode(), B0.a(this.f15012d));
    }

    public final SemanticsConfiguration y() {
        return this.f15012d;
    }

    public final boolean z() {
        return this.f15013e;
    }
}
