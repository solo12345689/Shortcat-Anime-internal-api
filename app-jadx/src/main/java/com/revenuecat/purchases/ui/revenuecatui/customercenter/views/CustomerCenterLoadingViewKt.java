package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.G;
import C.J;
import C.K;
import I0.B;
import J.h;
import J.i;
import K0.InterfaceC1788g;
import Td.L;
import U.AbstractC2176m;
import U.D;
import U.e0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.Fade;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderDefaults;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import s0.C6385r0;
import w.C6884M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\"\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u001a\"\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u001a\u000f\u0010\u000e\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LTd/L;", "CustomerCenterLoadingView", "(LY/m;I)V", "Ls0/r0;", "placeholderColor", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;", "fadeHighlight", "LoadingCardPlaceholder-Iv8Zu3U", "(JLcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;LY/m;I)V", "LoadingCardPlaceholder", "LoadingCardTitleRow-Iv8Zu3U", "LoadingCardTitleRow", "LoadingButtonsPlaceholder-Iv8Zu3U", "LoadingButtonsPlaceholder", "CustomerCenterLoadingViewPreview", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterLoadingViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingViewKt$CustomerCenterLoadingView$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CustomerCenterLoadingViewKt.CustomerCenterLoadingView(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingViewKt$CustomerCenterLoadingViewPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CustomerCenterLoadingViewKt.CustomerCenterLoadingViewPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void CustomerCenterLoadingView(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1909589276);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1909589276, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingView (CustomerCenterLoadingView.kt:45)");
            }
            long jQ = C6385r0.q(D.f17597a.a(interfaceC2425mG, D.f17598b).w(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
            Fade fade = new Fade(jQ, PlaceholderDefaults.INSTANCE.getFadeAnimationSpec(), null);
            e.a aVar = e.f26613a;
            e eVarF = s.f(aVar, 0.0f, 1, null);
            CustomerCenterConstants.Layout layout = CustomerCenterConstants.Layout.INSTANCE;
            e eVarK = p.k(eVarF, layout.m655getHORIZONTAL_PADDINGD9Ej5fM(), 0.0f, 2, null);
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425mG, 48);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF2 = androidx.compose.ui.c.f(interfaceC2425mG, eVarK);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
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
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF2, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            int i11 = C6884M.f62376d;
            m726LoadingCardPlaceholderIv8Zu3U(jQ, fade, interfaceC2425mG, i11 << 3);
            K.a(s.i(aVar, layout.m654getBUTTONS_TOP_PADDINGD9Ej5fM()), interfaceC2425mG, 6);
            m725LoadingButtonsPlaceholderIv8Zu3U(jQ, fade, interfaceC2425mG, i11 << 3);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }

    public static final void CustomerCenterLoadingViewPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1144543300);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1144543300, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingViewPreview (CustomerCenterLoadingView.kt:162)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$CustomerCenterLoadingViewKt.INSTANCE.m710getLambda1$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(i10));
        }
    }

    /* JADX INFO: renamed from: LoadingButtonsPlaceholder-Iv8Zu3U */
    public static final void m725LoadingButtonsPlaceholderIv8Zu3U(long j10, Fade fade, InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1444525897);
        int i11 = (i10 & 6) == 0 ? (interfaceC2425mG.d(j10) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC2425mG.U(fade) : interfaceC2425mG.F(fade) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1444525897, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingButtonsPlaceholder (CustomerCenterLoadingView.kt:137)");
            }
            C1131b.f fVarO = C1131b.f2093a.o(CustomerCenterConstants.Layout.INSTANCE.m653getBUTTONS_SPACINGD9Ej5fM());
            e.a aVar = e.f26613a;
            B bA = AbstractC1136g.a(fVarO, l0.e.f52304a.k(), interfaceC2425mG, 6);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, aVar);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
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
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            interfaceC2425mG.V(-1444471500);
            for (int i13 = 0; i13 < 2; i13++) {
                e eVarH = s.h(e.f26613a, 0.0f, 1, null);
                LoadingViewConstants loadingViewConstants = LoadingViewConstants.INSTANCE;
                f.a(PlaceholderKt.m613placeholderTgFrcIs(s.b(eVarH, 0.0f, loadingViewConstants.m736getBUTTON_HEIGHTD9Ej5fM(), 1, null), true, j10, loadingViewConstants.getBUTTON_SHAPE(), fade, null, null, interfaceC2425mG, ((i12 << 6) & 896) | 3126 | (C6884M.f62376d << 12) | ((i12 << 9) & 57344), 48), interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new CustomerCenterLoadingViewKt$LoadingButtonsPlaceholder$2(j10, fade, i10));
        }
    }

    /* JADX INFO: renamed from: LoadingCardPlaceholder-Iv8Zu3U */
    public static final void m726LoadingCardPlaceholderIv8Zu3U(long j10, Fade fade, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1798499628);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.d(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC2425mG.U(fade) : interfaceC2425mG.F(fade) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1798499628, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingCardPlaceholder (CustomerCenterLoadingView.kt:65)");
            }
            e0.a(s.h(e.f26613a, 0.0f, 1, null), i.d(CustomerCenterConstants.Card.INSTANCE.m650getROUNDED_CORNER_SIZED9Ej5fM()), AbstractC2176m.k(D.f17597a.a(interfaceC2425mG, D.f17598b), C5015h.n(2)), 0L, 0.0f, 0.0f, null, g0.i.d(1204625137, true, new CustomerCenterLoadingViewKt$LoadingCardPlaceholder$1(j10, fade), interfaceC2425mG, 54), interfaceC2425mG, 12582918, 120);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new CustomerCenterLoadingViewKt$LoadingCardPlaceholder$2(j10, fade, i10));
        }
    }

    /* JADX INFO: renamed from: LoadingCardTitleRow-Iv8Zu3U */
    public static final void m727LoadingCardTitleRowIv8Zu3U(long j10, Fade fade, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        long j11 = j10;
        Fade fade2 = fade;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1182560361);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.d(j11) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC2425mG.U(fade2) : interfaceC2425mG.F(fade2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1182560361, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingCardTitleRow (CustomerCenterLoadingView.kt:103)");
            }
            C1131b.f fVarE = C1131b.f2093a.e();
            e.c cVarL = l0.e.f52304a.l();
            e.a aVar = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarM = p.m(s.h(aVar, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, CustomerCenterConstants.Card.INSTANCE.m651getTITLE_ROW_BOTTOM_PADDINGD9Ej5fM(), 7, null);
            B b10 = G.b(fVarE, cVarL, interfaceC2425mG, 54);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, eVarM);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
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
            m2.e(interfaceC2425mB, b10, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            J j12 = J.f2025a;
            LoadingViewConstants loadingViewConstants = LoadingViewConstants.INSTANCE;
            androidx.compose.ui.e eVarI = s.i(s.v(aVar, loadingViewConstants.m740getTITLE_WIDTHD9Ej5fM()), loadingViewConstants.m739getTITLE_HEIGHTD9Ej5fM());
            h placeholder_shape = loadingViewConstants.getPLACEHOLDER_SHAPE();
            int i12 = ((i11 << 6) & 896) | 3126;
            int i13 = C6884M.f62376d;
            int i14 = (i11 << 9) & 57344;
            f.a(PlaceholderKt.m613placeholderTgFrcIs(eVarI, true, j11, placeholder_shape, fade2, null, null, interfaceC2425mG, (i13 << 12) | i12 | i14, 48), interfaceC2425mG, 0);
            j11 = j10;
            fade2 = fade;
            f.a(PlaceholderKt.m613placeholderTgFrcIs(s.i(s.v(aVar, loadingViewConstants.m734getBADGE_WIDTHD9Ej5fM()), loadingViewConstants.m733getBADGE_HEIGHTD9Ej5fM()), true, j11, loadingViewConstants.getBADGE_SHAPE(), fade2, null, null, interfaceC2425mG, (i13 << 12) | i12 | i14, 48), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new CustomerCenterLoadingViewKt$LoadingCardTitleRow$2(j11, fade2, i10));
        }
    }
}
