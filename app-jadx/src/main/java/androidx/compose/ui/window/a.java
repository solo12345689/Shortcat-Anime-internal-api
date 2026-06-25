package androidx.compose.ui.window;

import Gf.O;
import I0.B;
import K0.InterfaceC1788g;
import R0.A;
import R0.C;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.X;
import Y.Y;
import Y.h2;
import Y.m2;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.C5009b;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.compose.ui.window.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0477a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f27763a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f27764b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0477a(l lVar, Zd.e eVar) {
            super(2, eVar);
            this.f27764b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C0477a(this.f27764b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((C0477a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f27763a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            this.f27764b.show();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ l f27765a;

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0478a implements X {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ l f27766a;

            public C0478a(l lVar) {
                this.f27766a = lVar;
            }

            @Override // Y.X
            public void dispose() {
                this.f27766a.dismiss();
                this.f27766a.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(1);
            this.f27765a = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final X invoke(Y y10) {
            return new C0478a(this.f27765a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ l f27767a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f27768b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ k f27769c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ EnumC5027t f27770d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l lVar, InterfaceC5082a interfaceC5082a, k kVar, EnumC5027t enumC5027t) {
            super(0);
            this.f27767a = lVar;
            this.f27768b = interfaceC5082a;
            this.f27769c = kVar;
            this.f27770d = enumC5027t;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m94invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m94invoke() {
            this.f27767a.o(this.f27768b, this.f27769c, this.f27770d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5082a f27771a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ k f27772b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f27773c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f27774d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f27775e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC5082a interfaceC5082a, k kVar, Function2 function2, int i10, int i11) {
            super(2);
            this.f27771a = interfaceC5082a;
            this.f27772b = kVar;
            this.f27773c = function2;
            this.f27774d = i10;
            this.f27775e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            a.a(this.f27771a, this.f27772b, this.f27773c, interfaceC2425m, AbstractC2409g1.a(this.f27774d | 1), this.f27775e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ h2 f27776a;

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0479a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final C0479a f27777a = new C0479a();

            C0479a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C) obj);
                return L.f17438a;
            }

            public final void invoke(C c10) {
                A.g(c10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h2 h2Var) {
            super(2);
            this.f27776a = h2Var;
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
                AbstractC2454w.U(346960332, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:211)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            Object objD = interfaceC2425m.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = C0479a.f27777a;
                interfaceC2425m.u(objD);
            }
            a.c(R0.r.f(aVar, false, (Function1) objD, 1, null), a.b(this.f27776a), interfaceC2425m, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final f f27778a = new f();

        f() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g implements B {

        /* JADX INFO: renamed from: a */
        public static final g f27779a = new g();

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$g$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0480a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ List f27780a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0480a(List list) {
                super(1);
                this.f27780a = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }

            public final void invoke(s.a aVar) {
                List list = this.f27780a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    s.a.W(aVar, (androidx.compose.ui.layout.s) list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }
        }

        g() {
        }

        @Override // I0.B
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iN = 0;
            int iM = 0;
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.s sVarV0 = ((I0.A) list.get(i10)).v0(j10);
                iN = Math.max(iN, sVarV0.W0());
                iM = Math.max(iM, sVarV0.P0());
                arrayList.add(sVarV0);
            }
            if (list.isEmpty()) {
                iN = C5009b.n(j10);
                iM = C5009b.m(j10);
            }
            return androidx.compose.ui.layout.l.u0(lVar, iN, iM, null, new C0480a(arrayList), 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f27781a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f27782b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f27783c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f27784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.e eVar, Function2 function2, int i10, int i11) {
            super(2);
            this.f27781a = eVar;
            this.f27782b = function2;
            this.f27783c = i10;
            this.f27784d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            a.c(this.f27781a, this.f27782b, interfaceC2425m, AbstractC2409g1.a(this.f27783c | 1), this.f27784d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(ie.InterfaceC5082a r21, androidx.compose.ui.window.k r22, kotlin.jvm.functions.Function2 r23, Y.InterfaceC2425m r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.a(ie.a, androidx.compose.ui.window.k, kotlin.jvm.functions.Function2, Y.m, int, int):void");
    }

    public static final Function2 b(h2 h2Var) {
        return (Function2) h2Var.getValue();
    }

    public static final void c(androidx.compose.ui.e eVar, Function2 function2, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1090521195);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if (interfaceC2425mG.p((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1090521195, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:665)");
            }
            Object objD = interfaceC2425mG.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = g.f27779a;
                interfaceC2425mG.u(objD);
            }
            B b10 = (B) objD;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int iHashCode = Long.hashCode(AbstractC2410h.b(interfaceC2425mG, 0));
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, eVar);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, b10, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iHashCode))) {
                interfaceC2425mB.u(Integer.valueOf(iHashCode));
                interfaceC2425mB.m(Integer.valueOf(iHashCode), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            function2.invoke(interfaceC2425mG, Integer.valueOf((i15 >> 6) & 14));
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        } else {
            interfaceC2425mG.K();
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new h(eVar, function2, i10, i11));
        }
    }
}
