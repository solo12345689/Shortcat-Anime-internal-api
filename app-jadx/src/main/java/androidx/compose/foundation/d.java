package androidx.compose.foundation;

import K0.I0;
import K0.J0;
import R0.C2099h;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.J;
import x.InterfaceC6987G;
import x.InterfaceC6989I;
import z.v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2099h f25831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f25832d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
            super(3);
            this.f25829a = z10;
            this.f25830b = str;
            this.f25831c = c2099h;
            this.f25832d = interfaceC5082a;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            B.m mVar;
            interfaceC2425m.V(-756081143);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
            }
            InterfaceC6987G interfaceC6987G = (InterfaceC6987G) interfaceC2425m.n(j.a());
            if (interfaceC6987G instanceof InterfaceC6989I) {
                interfaceC2425m.V(617140216);
                interfaceC2425m.O();
                mVar = null;
            } else {
                interfaceC2425m.V(617248189);
                Object objD = interfaceC2425m.D();
                if (objD == InterfaceC2425m.f22370a.a()) {
                    objD = B.l.a();
                    interfaceC2425m.u(objD);
                }
                mVar = (B.m) objD;
                interfaceC2425m.O();
            }
            androidx.compose.ui.e eVarA = d.a(androidx.compose.ui.e.f26613a, mVar, interfaceC6987G, this.f25829a, this.f25830b, this.f25831c, this.f25832d);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarA;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6987G f25833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2099h f25836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f25837e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6987G interfaceC6987G, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
            super(3);
            this.f25833a = interfaceC6987G;
            this.f25834b = z10;
            this.f25835c = str;
            this.f25836d = c2099h;
            this.f25837e = interfaceC5082a;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(-1525724089);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objD = interfaceC2425m.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = B.l.a();
                interfaceC2425m.u(objD);
            }
            B.m mVar = (B.m) objD;
            androidx.compose.ui.e eVarThen = j.b(androidx.compose.ui.e.f26613a, mVar, this.f25833a).then(new ClickableElement(mVar, null, this.f25834b, this.f25835c, this.f25836d, this.f25837e, null));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarThen;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2099h f25840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f25841d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
            super(1);
            this.f25838a = z10;
            this.f25839b = str;
            this.f25840c = c2099h;
            this.f25841d = interfaceC5082a;
        }

        public final void a(V0 v02) {
            v02.d("clickable");
            v02.b().c("enabled", Boolean.valueOf(this.f25838a));
            v02.b().c("onClickLabel", this.f25839b);
            v02.b().c("role", this.f25840c);
            v02.b().c("onClick", this.f25841d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0442d extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6987G f25842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2099h f25845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f25846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f25847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f25848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f25849h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0442d(InterfaceC6987G interfaceC6987G, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a, String str2, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3) {
            super(3);
            this.f25842a = interfaceC6987G;
            this.f25843b = z10;
            this.f25844c = str;
            this.f25845d = c2099h;
            this.f25846e = interfaceC5082a;
            this.f25847f = str2;
            this.f25848g = interfaceC5082a2;
            this.f25849h = interfaceC5082a3;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(-1525724089);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objD = interfaceC2425m.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = B.l.a();
                interfaceC2425m.u(objD);
            }
            B.m mVar = (B.m) objD;
            androidx.compose.ui.e eVarThen = j.b(androidx.compose.ui.e.f26613a, mVar, this.f25842a).then(new CombinedClickableElement(mVar, null, this.f25843b, this.f25844c, this.f25845d, this.f25846e, this.f25847f, this.f25848g, this.f25849h, null));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarThen;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f25850a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(J j10) {
            super(1);
            this.f25850a = j10;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(K0.I0 r4) {
            /*
                r3 = this;
                kotlin.jvm.internal.J r0 = r3.f25850a
                boolean r1 = r0.f52255a
                r2 = 1
                if (r1 != 0) goto L17
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"
                kotlin.jvm.internal.AbstractC5504s.f(r4, r1)
                z.v r4 = (z.v) r4
                boolean r4 = r4.E1()
                if (r4 == 0) goto L15
                goto L17
            L15:
                r4 = 0
                goto L18
            L17:
                r4 = r2
            L18:
                r0.f52255a = r4
                kotlin.jvm.internal.J r4 = r3.f25850a
                boolean r4 = r4.f52255a
                r4 = r4 ^ r2
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.e.invoke(K0.I0):java.lang.Boolean");
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, B.m mVar, InterfaceC6987G interfaceC6987G, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        androidx.compose.ui.e eVarC;
        if (interfaceC6987G instanceof InterfaceC6989I) {
            eVarC = new ClickableElement(mVar, (InterfaceC6989I) interfaceC6987G, z10, str, c2099h, interfaceC5082a, null);
        } else if (interfaceC6987G == null) {
            eVarC = new ClickableElement(mVar, null, z10, str, c2099h, interfaceC5082a, null);
        } else if (mVar != null) {
            eVarC = j.b(androidx.compose.ui.e.f26613a, mVar, interfaceC6987G).then(new ClickableElement(mVar, null, z10, str, c2099h, interfaceC5082a, null));
        } else {
            eVarC = androidx.compose.ui.c.c(androidx.compose.ui.e.f26613a, null, new b(interfaceC6987G, z10, str, c2099h, interfaceC5082a), 1, null);
        }
        return eVar.then(eVarC);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, B.m mVar, InterfaceC6987G interfaceC6987G, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return a(eVar, mVar, interfaceC6987G, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : c2099h, interfaceC5082a);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        return androidx.compose.ui.c.b(eVar, T0.b() ? new c(z10, str, c2099h, interfaceC5082a) : T0.a(), new a(z10, str, c2099h, interfaceC5082a));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            c2099h = null;
        }
        return c(eVar, z10, str, c2099h, interfaceC5082a);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, B.m mVar, InterfaceC6987G interfaceC6987G, boolean z10, String str, C2099h c2099h, String str2, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3) {
        androidx.compose.ui.e eVarC;
        if (interfaceC6987G instanceof InterfaceC6989I) {
            eVarC = new CombinedClickableElement(mVar, (InterfaceC6989I) interfaceC6987G, z10, str, c2099h, interfaceC5082a3, str2, interfaceC5082a, interfaceC5082a2, null);
        } else if (interfaceC6987G == null) {
            eVarC = new CombinedClickableElement(mVar, null, z10, str, c2099h, interfaceC5082a3, str2, interfaceC5082a, interfaceC5082a2, null);
        } else if (mVar != null) {
            eVarC = j.b(androidx.compose.ui.e.f26613a, mVar, interfaceC6987G).then(new CombinedClickableElement(mVar, null, z10, str, c2099h, interfaceC5082a3, str2, interfaceC5082a, interfaceC5082a2, null));
        } else {
            eVarC = androidx.compose.ui.c.c(androidx.compose.ui.e.f26613a, null, new C0442d(interfaceC6987G, z10, str, c2099h, interfaceC5082a3, str2, interfaceC5082a, interfaceC5082a2), 1, null);
        }
        return eVar.then(eVarC);
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, B.m mVar, InterfaceC6987G interfaceC6987G, boolean z10, String str, C2099h c2099h, String str2, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, int i10, Object obj) {
        InterfaceC5082a interfaceC5082a4;
        androidx.compose.ui.e eVar2;
        B.m mVar2;
        InterfaceC6987G interfaceC6987G2;
        InterfaceC5082a interfaceC5082a5;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        String str3 = (i10 & 8) != 0 ? null : str;
        C2099h c2099h2 = (i10 & 16) != 0 ? null : c2099h;
        String str4 = (i10 & 32) != 0 ? null : str2;
        InterfaceC5082a interfaceC5082a6 = (i10 & 64) != 0 ? null : interfaceC5082a;
        if ((i10 & 128) != 0) {
            interfaceC5082a4 = null;
            eVar2 = eVar;
            interfaceC6987G2 = interfaceC6987G;
            interfaceC5082a5 = interfaceC5082a3;
            mVar2 = mVar;
        } else {
            interfaceC5082a4 = interfaceC5082a2;
            eVar2 = eVar;
            mVar2 = mVar;
            interfaceC6987G2 = interfaceC6987G;
            interfaceC5082a5 = interfaceC5082a3;
        }
        return e(eVar2, mVar2, interfaceC6987G2, z11, str3, c2099h2, str4, interfaceC5082a6, interfaceC5082a4, interfaceC5082a5);
    }

    public static final boolean g(I0 i02) {
        J j10 = new J();
        J0.c(i02, v.f65428c, new e(j10));
        return j10.f52255a;
    }
}
