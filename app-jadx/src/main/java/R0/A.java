package R0;

import Td.L;
import U0.C2197e;
import U0.W0;
import Ud.AbstractC2279u;
import a1.C2551s;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ InterfaceC6023m[] f14924a = {O.e(new kotlin.jvm.internal.z(A.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.e(new kotlin.jvm.internal.z(A.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.e(new kotlin.jvm.internal.z(A.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.e(new kotlin.jvm.internal.z(A.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.e(new kotlin.jvm.internal.z(A.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.e(new kotlin.jvm.internal.z(A.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), O.e(new kotlin.jvm.internal.z(A.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.e(new kotlin.jvm.internal.z(A.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.e(new kotlin.jvm.internal.z(A.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), O.e(new kotlin.jvm.internal.z(A.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.e(new kotlin.jvm.internal.z(A.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.e(new kotlin.jvm.internal.z(A.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.e(new kotlin.jvm.internal.z(A.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.e(new kotlin.jvm.internal.z(A.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1)), O.e(new kotlin.jvm.internal.z(A.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5082a f14925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5082a interfaceC5082a) {
            super(1);
            this.f14925a = interfaceC5082a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(List list) {
            boolean z10;
            Float f10 = (Float) this.f14925a.invoke();
            if (f10 == null) {
                z10 = false;
            } else {
                list.add(f10);
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static {
        x xVar = x.f15043a;
        xVar.H();
        xVar.C();
        xVar.A();
        xVar.y();
        xVar.i();
        xVar.q();
        xVar.w();
        xVar.u();
        xVar.e();
        xVar.c();
        xVar.N();
        xVar.l();
        xVar.O();
        xVar.D();
        xVar.I();
        xVar.L();
        xVar.v();
        xVar.o();
        xVar.g();
        xVar.K();
        xVar.m();
        xVar.F();
        xVar.a();
        xVar.b();
        xVar.M();
        xVar.s();
        xVar.z();
        xVar.G();
        l.f14981a.d();
    }

    public static final void A(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.p(), new C2092a(str, interfaceC5082a));
    }

    public static /* synthetic */ void B(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        A(c10, str, interfaceC5082a);
    }

    public static final void C(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.q(), new C2092a(str, interfaceC5082a));
    }

    public static /* synthetic */ void D(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        C(c10, str, interfaceC5082a);
    }

    public static final void E(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.r(), new C2092a(str, interfaceC5082a));
    }

    public static /* synthetic */ void F(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        E(c10, str, interfaceC5082a);
    }

    public static final void G(C c10) {
        c10.b(x.f15043a.B(), L.f17438a);
    }

    public static final void H(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.s(), new C2092a(str, interfaceC5082a));
    }

    public static /* synthetic */ void I(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        H(c10, str, interfaceC5082a);
    }

    public static final void J(C c10) {
        c10.b(x.f15043a.t(), L.f17438a);
    }

    public static final void K(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.t(), new C2092a(str, interfaceC5082a));
    }

    public static /* synthetic */ void L(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        K(c10, str, interfaceC5082a);
    }

    public static final void M(C c10, String str, Function2 function2) {
        c10.b(l.f14981a.u(), new C2092a(str, function2));
    }

    public static /* synthetic */ void N(C c10, String str, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        M(c10, str, function2);
    }

    public static final void O(C c10, Function2 function2) {
        c10.b(l.f14981a.v(), function2);
    }

    public static final void P(C c10, String str, Function1 function1) {
        c10.b(l.f14981a.w(), new C2092a(str, function1));
    }

    public static /* synthetic */ void Q(C c10, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        P(c10, str, function1);
    }

    public static final void R(C c10) {
        c10.b(x.f15043a.E(), L.f17438a);
    }

    public static final void S(C c10, C2093b c2093b) {
        x.f15043a.a().e(c10, f14924a[22], c2093b);
    }

    public static final void T(C c10, boolean z10) {
        x.f15043a.q().e(c10, f14924a[5], Boolean.valueOf(z10));
    }

    public static final void U(C c10, String str) {
        c10.b(x.f15043a.d(), AbstractC2279u.e(str));
    }

    public static final void V(C c10, boolean z10) {
        x.f15043a.s().e(c10, f14924a[25], Boolean.valueOf(z10));
    }

    public static final void W(C c10, C2197e c2197e) {
        x.f15043a.g().e(c10, f14924a[18], c2197e);
    }

    public static final void X(C c10, boolean z10) {
        x.f15043a.i().e(c10, f14924a[4], Boolean.valueOf(z10));
    }

    public static final void Y(C c10, j jVar) {
        x.f15043a.l().e(c10, f14924a[11], jVar);
    }

    public static final void Z(C c10, int i10) {
        x.f15043a.y().e(c10, f14924a[3], C2096e.c(i10));
    }

    public static final void a(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.a(), new C2092a(str, interfaceC5082a));
    }

    public static final void a0(C c10, String str) {
        x.f15043a.A().e(c10, f14924a[2], str);
    }

    public static /* synthetic */ void b(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        a(c10, str, interfaceC5082a);
    }

    public static final void b0(C c10, C2098g c2098g) {
        x.f15043a.C().e(c10, f14924a[1], c2098g);
    }

    public static final void c(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.c(), new C2092a(str, interfaceC5082a));
    }

    public static final void c0(C c10, int i10) {
        x.f15043a.D().e(c10, f14924a[13], C2099h.j(i10));
    }

    public static /* synthetic */ void d(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c(c10, str, interfaceC5082a);
    }

    public static final void d0(C c10, boolean z10) {
        x.f15043a.F().e(c10, f14924a[21], Boolean.valueOf(z10));
    }

    public static final void e(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.e(), new C2092a(str, interfaceC5082a));
    }

    public static final void e0(C c10, String str, InterfaceC5096o interfaceC5096o) {
        c10.b(l.f14981a.y(), new C2092a(str, interfaceC5096o));
    }

    public static /* synthetic */ void f(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e(c10, str, interfaceC5082a);
    }

    public static /* synthetic */ void f0(C c10, String str, InterfaceC5096o interfaceC5096o, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e0(c10, str, interfaceC5096o);
    }

    public static final void g(C c10) {
        c10.b(x.f15043a.r(), L.f17438a);
    }

    public static final void g0(C c10, boolean z10) {
        x.f15043a.v().e(c10, f14924a[16], Boolean.valueOf(z10));
    }

    public static final void h(C c10) {
        c10.b(x.f15043a.f(), L.f17438a);
    }

    public static final void h0(C c10, String str) {
        x.f15043a.I().e(c10, f14924a[14], str);
    }

    public static final void i(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.f(), new C2092a(str, interfaceC5082a));
    }

    public static final void i0(C c10, C2197e c2197e) {
        c10.b(x.f15043a.J(), AbstractC2279u.e(c2197e));
    }

    public static /* synthetic */ void j(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        i(c10, str, interfaceC5082a);
    }

    public static final void j0(C c10, String str, Function1 function1) {
        c10.b(l.f14981a.z(), new C2092a(str, function1));
    }

    public static final void k(C c10, String str) {
        c10.b(x.f15043a.h(), str);
    }

    public static /* synthetic */ void k0(C c10, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        j0(c10, str, function1);
    }

    public static final void l(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.h(), new C2092a(str, new a(interfaceC5082a)));
    }

    public static final void l0(C c10, long j10) {
        x.f15043a.K().e(c10, f14924a[19], W0.b(j10));
    }

    public static /* synthetic */ void m(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        l(c10, str, interfaceC5082a);
    }

    public static final void m0(C c10, C2197e c2197e) {
        x.f15043a.L().e(c10, f14924a[15], c2197e);
    }

    public static final void n(C c10, String str, Function1 function1) {
        c10.b(l.f14981a.i(), new C2092a(str, function1));
    }

    public static final void n0(C c10, String str, Function1 function1) {
        c10.b(l.f14981a.A(), new C2092a(str, function1));
    }

    public static /* synthetic */ void o(C c10, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        n(c10, str, function1);
    }

    public static /* synthetic */ void o0(C c10, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        n0(c10, str, function1);
    }

    public static final void p(C c10, Function1 function1) {
        c10.b(x.f15043a.n(), function1);
    }

    public static final void p0(C c10, T0.a aVar) {
        x.f15043a.M().e(c10, f14924a[24], aVar);
    }

    public static final void q(C c10, String str, Function1 function1) {
        c10.b(l.f14981a.j(), new C2092a(str, function1));
    }

    public static final void q0(C c10, boolean z10) {
        x.f15043a.w().e(c10, f14924a[6], Boolean.valueOf(z10));
    }

    public static /* synthetic */ void r(C c10, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        q(c10, str, function1);
    }

    public static final void r0(C c10, j jVar) {
        x.f15043a.O().e(c10, f14924a[12], jVar);
    }

    public static final void s(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.l(), new C2092a(str, interfaceC5082a));
    }

    public static final void s0(C c10, String str, Function1 function1) {
        c10.b(l.f14981a.B(), new C2092a(str, function1));
    }

    public static /* synthetic */ void t(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        s(c10, str, interfaceC5082a);
    }

    public static /* synthetic */ void t0(C c10, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        s0(c10, str, function1);
    }

    public static final void u(C c10, int i10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(x.f15043a.m(), C2551s.j(i10));
        c10.b(l.f14981a.m(), new C2092a(str, interfaceC5082a));
    }

    public static /* synthetic */ void v(C c10, int i10, String str, InterfaceC5082a interfaceC5082a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        u(c10, i10, str, interfaceC5082a);
    }

    public static final void w(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.n(), new C2092a(str, interfaceC5082a));
    }

    public static /* synthetic */ void x(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        w(c10, str, interfaceC5082a);
    }

    public static final void y(C c10, String str, InterfaceC5082a interfaceC5082a) {
        c10.b(l.f14981a.o(), new C2092a(str, interfaceC5082a));
    }

    public static /* synthetic */ void z(C c10, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        y(c10, str, interfaceC5082a);
    }
}
