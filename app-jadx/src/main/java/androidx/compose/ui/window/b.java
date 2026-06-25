package androidx.compose.ui.window;

import Gf.O;
import I0.B;
import I0.C;
import I0.InterfaceC1690p;
import K0.InterfaceC1788g;
import R0.A;
import Td.L;
import Y.AbstractC2394b1;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.H;
import Y.I;
import Y.InterfaceC2425m;
import Y.X;
import Y.Y;
import Y.h2;
import Y.m2;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5023p;
import i1.C5025r;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5906a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f27785a = H.h(null, a.f27786a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f27786a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0481b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m f27787a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f27788b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ t f27789c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f27790d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ EnumC5027t f27791e;

        /* JADX INFO: renamed from: androidx.compose.ui.window.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements X {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ m f27792a;

            public a(m mVar) {
                this.f27792a = mVar;
            }

            @Override // Y.X
            public void dispose() {
                this.f27792a.disposeComposition();
                this.f27792a.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0481b(m mVar, InterfaceC5082a interfaceC5082a, t tVar, String str, EnumC5027t enumC5027t) {
            super(1);
            this.f27787a = mVar;
            this.f27788b = interfaceC5082a;
            this.f27789c = tVar;
            this.f27790d = str;
            this.f27791e = enumC5027t;
        }

        @Override // kotlin.jvm.functions.Function1
        public final X invoke(Y y10) {
            this.f27787a.m();
            this.f27787a.o(this.f27788b, this.f27789c, this.f27790d, this.f27791e);
            return new a(this.f27787a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m f27793a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f27794b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ t f27795c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f27796d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ EnumC5027t f27797e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m mVar, InterfaceC5082a interfaceC5082a, t tVar, String str, EnumC5027t enumC5027t) {
            super(0);
            this.f27793a = mVar;
            this.f27794b = interfaceC5082a;
            this.f27795c = tVar;
            this.f27796d = str;
            this.f27797e = enumC5027t;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m95invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m95invoke() {
            this.f27793a.o(this.f27794b, this.f27795c, this.f27796d, this.f27797e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m f27798a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ s f27799b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m mVar, s sVar) {
            super(1);
            this.f27798a = mVar;
            this.f27799b = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final X invoke(Y y10) {
            this.f27798a.setPositionProvider(this.f27799b);
            this.f27798a.s();
            return new a();
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements X {
            @Override // Y.X
            public void dispose() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m f27804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m mVar) {
            super(1);
            this.f27804a = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1690p) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC1690p interfaceC1690p) {
            InterfaceC1690p interfaceC1690pX0 = interfaceC1690p.x0();
            AbstractC5504s.e(interfaceC1690pX0);
            this.f27804a.q(interfaceC1690pX0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g implements B {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m f27805a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ EnumC5027t f27806b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final a f27807a = new a();

            a() {
                super(1);
            }

            public final void invoke(s.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }
        }

        g(m mVar, EnumC5027t enumC5027t) {
            this.f27805a = mVar;
            this.f27806b = enumC5027t;
        }

        @Override // I0.B
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
            this.f27805a.setParentLayoutDirection(this.f27806b);
            return androidx.compose.ui.layout.l.u0(lVar, 0, 0, null, a.f27807a, 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ s f27808a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f27809b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ t f27810c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f27811d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f27812e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f27813f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(s sVar, InterfaceC5082a interfaceC5082a, t tVar, Function2 function2, int i10, int i11) {
            super(2);
            this.f27808a = sVar;
            this.f27809b = interfaceC5082a;
            this.f27810c = tVar;
            this.f27811d = function2;
            this.f27812e = i10;
            this.f27813f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            b.a(this.f27808a, this.f27809b, this.f27810c, this.f27811d, interfaceC2425m, AbstractC2409g1.a(this.f27812e | 1), this.f27813f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final i f27814a = new i();

        i() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m f27815a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ h2 f27816b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final a f27817a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((R0.C) obj);
                return L.f17438a;
            }

            public final void invoke(R0.C c10) {
                A.J(c10);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.window.b$j$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0482b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ m f27818a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0482b(m mVar) {
                super(1);
                this.f27818a = mVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m96invokeozmzZPI(((C5025r) obj).j());
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke-ozmzZPI */
            public final void m96invokeozmzZPI(long j10) {
                this.f27818a.m98setPopupContentSizefhxjrPA(C5025r.b(j10));
                this.f27818a.s();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m mVar, h2 h2Var) {
            super(2);
            this.f27815a = mVar;
            this.f27816b = h2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-297523940, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:317)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            Object objD = interfaceC2425m.D();
            InterfaceC2425m.a aVar2 = InterfaceC2425m.f22370a;
            if (objD == aVar2.a()) {
                objD = a.f27817a;
                interfaceC2425m.u(objD);
            }
            androidx.compose.ui.e eVarF = R0.r.f(aVar, false, (Function1) objD, 1, null);
            boolean zF = interfaceC2425m.F(this.f27815a);
            m mVar = this.f27815a;
            Object objD2 = interfaceC2425m.D();
            if (zF || objD2 == aVar2.a()) {
                objD2 = new C0482b(mVar);
                interfaceC2425m.u(objD2);
            }
            androidx.compose.ui.e eVarA = AbstractC5906a.a(androidx.compose.ui.layout.p.a(eVarF, (Function1) objD2), this.f27815a.getCanCalculatePosition() ? 1.0f : 0.0f);
            Function2 function2B = b.b(this.f27816b);
            Object objD3 = interfaceC2425m.D();
            if (objD3 == aVar2.a()) {
                objD3 = androidx.compose.ui.window.c.f27819a;
                interfaceC2425m.u(objD3);
            }
            B b10 = (B) objD3;
            int iHashCode = Long.hashCode(AbstractC2410h.b(interfaceC2425m, 0));
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF2 = androidx.compose.ui.c.f(interfaceC2425m, eVarA);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, b10, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iHashCode))) {
                interfaceC2425mB.u(Integer.valueOf(iHashCode));
                interfaceC2425mB.m(Integer.valueOf(iHashCode), function2B2);
            }
            m2.e(interfaceC2425mB, eVarF2, aVar3.f());
            function2B.invoke(interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.window.s r27, ie.InterfaceC5082a r28, androidx.compose.ui.window.t r29, kotlin.jvm.functions.Function2 r30, Y.InterfaceC2425m r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.a(androidx.compose.ui.window.s, ie.a, androidx.compose.ui.window.t, kotlin.jvm.functions.Function2, Y.m, int, int):void");
    }

    public static final Function2 b(h2 h2Var) {
        return (Function2) h2Var.getValue();
    }

    public static final int g(boolean z10, u uVar, boolean z11) {
        int i10 = !z10 ? 262152 : 262144;
        if (uVar == u.f27898b) {
            i10 |= 8192;
        }
        return !z11 ? i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING : i10;
    }

    public static final int h(t tVar, boolean z10) {
        return (tVar.e() && z10) ? tVar.d() | 8192 : (!tVar.e() || z10) ? tVar.d() : tVar.d() & (-8193);
    }

    public static final boolean i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final C5023p j(Rect rect) {
        return new C5023p(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f27800a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f27801b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ m f27802c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m mVar, Zd.e eVar) {
            super(2, eVar);
            this.f27802c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            e eVar2 = new e(this.f27802c, eVar);
            eVar2.f27801b = obj;
            return eVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0033 -> B:31:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r3.f27800a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.f27801b
                Gf.O r1 = (Gf.O) r1
                Td.v.b(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                Td.v.b(r4)
                java.lang.Object r4 = r3.f27801b
                Gf.O r4 = (Gf.O) r4
                r1 = r4
            L23:
                boolean r4 = Gf.P.g(r1)
                if (r4 == 0) goto L3c
                androidx.compose.ui.window.b$e$a r4 = androidx.compose.ui.window.b.e.a.f27803a
                r3.f27801b = r1
                r3.f27800a = r2
                java.lang.Object r4 = androidx.compose.ui.platform.Q0.a(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.m r4 = r3.f27802c
                r4.k()
                goto L23
            L3c:
                Td.L r4 = Td.L.f17438a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final a f27803a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return L.f17438a;
            }

            public final void a(long j10) {
            }
        }
    }
}
