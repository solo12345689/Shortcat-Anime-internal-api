package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.G;
import C.J;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import U.D;
import U.j0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.ExpirationOrRenewal;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PriceDetails;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.KeyboardArrowRightKt;
import g0.i;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aM\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0011\u001a\u0019\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "purchaseInformation", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Landroidx/compose/ui/e;", "modifier", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;", "position", "", "isDetailedView", "Lkotlin/Function0;", "LTd/L;", "onCardClick", "PurchaseInformationCardView", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;ZLie/a;LY/m;II)V", "", "getSubtitle", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getStoreText", "(Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;", "getPrice", "details", "PurchaseInformationCardView_Preview", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LY/m;I)V", "PurchaseInformationCardView_Preview_Scale2", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchaseInformationCardViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ boolean $isDetailedView;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ InterfaceC5082a $onCardClick;
        final /* synthetic */ PurchaseInformation $purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC5082a interfaceC5082a, PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, boolean z10) {
            super(2);
            this.$onCardClick = interfaceC5082a;
            this.$purchaseInformation = purchaseInformation;
            this.$localization = localization;
            this.$isDetailedView = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            int i11;
            PurchaseInformation purchaseInformation;
            CustomerCenterConfigData.Localization localization;
            D d10;
            PurchaseInformation purchaseInformation2;
            int i12;
            CustomerCenterConfigData.Localization localization2;
            D d11;
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-63636015, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView.<anonymous> (PurchaseInformationCardView.kt:67)");
            }
            e.a aVar = e.f26613a;
            InterfaceC5082a interfaceC5082a = this.$onCardClick;
            interfaceC2425m.V(672812244);
            boolean zU = interfaceC2425m.U(this.$onCardClick);
            InterfaceC5082a interfaceC5082a2 = this.$onCardClick;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1(interfaceC5082a2);
                interfaceC2425m.u(objD);
            }
            interfaceC2425m.O();
            e eVarApplyIfNotNull = ModifierExtensionsKt.applyIfNotNull(aVar, interfaceC5082a, (Function2) objD);
            CustomerCenterConstants.Card card = CustomerCenterConstants.Card.INSTANCE;
            e eVarI = p.i(eVarApplyIfNotNull, card.m648getCARD_PADDINGD9Ej5fM());
            PurchaseInformation purchaseInformation3 = this.$purchaseInformation;
            CustomerCenterConfigData.Localization localization3 = this.$localization;
            boolean z10 = this.$isDetailedView;
            C1131b c1131b = C1131b.f2093a;
            C1131b.m mVarH = c1131b.h();
            e.a aVar2 = l0.e.f52304a;
            B bA = AbstractC1136g.a(mVarH, aVar2.k(), interfaceC2425m, 0);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarI);
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
            m2.e(interfaceC2425mB, bA, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            C1131b.f fVarE = c1131b.e();
            e.c cVarL = aVar2.l();
            androidx.compose.ui.e eVarM = p.m(s.h(aVar, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, card.m651getTITLE_ROW_BOTTOM_PADDINGD9Ej5fM(), 7, null);
            B b10 = G.b(fVarE, cVarL, interfaceC2425m, 54);
            int iA2 = AbstractC2410h.a(interfaceC2425m, 0);
            I iR2 = interfaceC2425m.r();
            androidx.compose.ui.e eVarF2 = androidx.compose.ui.c.f(interfaceC2425m, eVarM);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA2);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB2, b10, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            J j10 = J.f2025a;
            String title = purchaseInformation3.getTitle();
            if (title == null) {
                StoreProduct product = purchaseInformation3.getProduct();
                String title2 = product != null ? product.getTitle() : null;
                title = title2 == null ? "" : title2;
            }
            D d12 = D.f17597a;
            int i13 = D.f17598b;
            j0.b(title, C.I.b(j10, aVar, 1.0f, false, 2, null), d12.a(interfaceC2425m, i13).w(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, d12.c(interfaceC2425m, i13).o(), interfaceC2425m, 0, 0, 65528);
            InterfaceC2425m interfaceC2425m2 = interfaceC2425m;
            if (purchaseInformation3.isSubscription() || z10) {
                i11 = i13;
                purchaseInformation = purchaseInformation3;
                localization = localization3;
                d10 = d12;
                interfaceC2425m2.V(-1127028447);
                PurchaseStatusBadgeKt.PurchaseStatusBadge(purchaseInformation, localization, interfaceC2425m2, 0);
                interfaceC2425m2.O();
            } else {
                interfaceC2425m2.V(-578963871);
                B b11 = G.b(c1131b.o(card.m646getBADGE_HORIZONTAL_PADDINGD9Ej5fM()), aVar2.i(), interfaceC2425m2, 54);
                int iA3 = AbstractC2410h.a(interfaceC2425m2, 0);
                I iR3 = interfaceC2425m2.r();
                androidx.compose.ui.e eVarF3 = androidx.compose.ui.c.f(interfaceC2425m2, aVar);
                InterfaceC5082a interfaceC5082aA3 = aVar3.a();
                if (interfaceC2425m2.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425m2.I();
                if (interfaceC2425m2.e()) {
                    interfaceC2425m2.h(interfaceC5082aA3);
                } else {
                    interfaceC2425m2.s();
                }
                InterfaceC2425m interfaceC2425mB3 = m2.b(interfaceC2425m2);
                m2.e(interfaceC2425mB3, b11, aVar3.e());
                m2.e(interfaceC2425mB3, iR3, aVar3.g());
                Function2 function2B3 = aVar3.b();
                if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
                    interfaceC2425mB3.u(Integer.valueOf(iA3));
                    interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
                }
                m2.e(interfaceC2425mB3, eVarF3, aVar3.f());
                interfaceC2425m2.V(-1362156284);
                if (purchaseInformation3.isLifetime()) {
                    purchaseInformation = purchaseInformation3;
                    localization = localization3;
                    PurchaseStatusBadgeKt.PurchaseStatusBadge(purchaseInformation, localization, interfaceC2425m2, 0);
                } else {
                    purchaseInformation = purchaseInformation3;
                    localization = localization3;
                }
                interfaceC2425m2.O();
                i11 = i13;
                d10 = d12;
                U.B.b(KeyboardArrowRightKt.getKeyboardArrowRight(), null, null, d10.a(interfaceC2425m2, i11).w(), interfaceC2425m2, 48, 4);
                interfaceC2425m2.x();
                interfaceC2425m2.O();
            }
            interfaceC2425m2.x();
            String subtitle = PurchaseInformationCardViewKt.getSubtitle(purchaseInformation, localization);
            interfaceC2425m2.V(-1189903813);
            if (subtitle == null) {
                purchaseInformation2 = purchaseInformation;
                localization2 = localization;
                d11 = d10;
                i12 = i11;
            } else {
                purchaseInformation2 = purchaseInformation;
                i12 = i11;
                localization2 = localization;
                d11 = d10;
                j0.b(subtitle, null, C6385r0.q(d10.a(interfaceC2425m2, i11).w(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, d10.c(interfaceC2425m2, i11).c(), interfaceC2425m, 0, 0, 65530);
                interfaceC2425m2 = interfaceC2425m;
                L l10 = L.f17438a;
            }
            interfaceC2425m2.O();
            D d13 = d11;
            int i14 = i12;
            j0.b(PurchaseInformationCardViewKt.getStoreText(purchaseInformation2.getStore(), localization2), null, C6385r0.q(d13.a(interfaceC2425m2, i14).w(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, d13.c(interfaceC2425m2, i14).c(), interfaceC2425m, 0, 0, 65530);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $isDetailedView;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ InterfaceC5082a $onCardClick;
        final /* synthetic */ ButtonPosition $position;
        final /* synthetic */ PurchaseInformation $purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, androidx.compose.ui.e eVar, ButtonPosition buttonPosition, boolean z10, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.$purchaseInformation = purchaseInformation;
            this.$localization = localization;
            this.$modifier = eVar;
            this.$position = buttonPosition;
            this.$isDetailedView = z10;
            this.$onCardClick = interfaceC5082a;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PurchaseInformationCardViewKt.PurchaseInformationCardView(this.$purchaseInformation, this.$localization, this.$modifier, this.$position, this.$isDetailedView, this.$onCardClick, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43901 extends AbstractC5506u implements Function2 {
        final /* synthetic */ PurchaseInformation $details;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06891 extends AbstractC5506u implements InterfaceC5082a {
            public static final C06891 INSTANCE = new C06891();

            C06891() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m749invoke() {
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m749invoke();
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43901(PurchaseInformation purchaseInformation) {
            super(2);
            this.$details = purchaseInformation;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(832472595, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview.<anonymous> (PurchaseInformationCardView.kt:203)");
            }
            PurchaseInformationCardViewKt.PurchaseInformationCardView(this.$details, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 2, null).getLocalization(), null, null, false, C06891.INSTANCE, interfaceC2425m, 196608, 28);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43912 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PurchaseInformation $details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43912(PurchaseInformation purchaseInformation, int i10) {
            super(2);
            this.$details = purchaseInformation;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PurchaseInformationCardViewKt.PurchaseInformationCardView_Preview(this.$details, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview_Scale2$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43921 extends AbstractC5506u implements Function2 {
        final /* synthetic */ PurchaseInformation $details;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview_Scale2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06901 extends AbstractC5506u implements InterfaceC5082a {
            public static final C06901 INSTANCE = new C06901();

            C06901() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m750invoke() {
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m750invoke();
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43921(PurchaseInformation purchaseInformation) {
            super(2);
            this.$details = purchaseInformation;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(184551620, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview_Scale2.<anonymous> (PurchaseInformationCardView.kt:220)");
            }
            PurchaseInformationCardViewKt.PurchaseInformationCardView(this.$details, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 2, null).getLocalization(), null, null, false, C06901.INSTANCE, interfaceC2425m, 196608, 28);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView_Preview_Scale2$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43932 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PurchaseInformation $details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43932(PurchaseInformation purchaseInformation, int i10) {
            super(2);
            this.$details = purchaseInformation;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PurchaseInformationCardViewKt.PurchaseInformationCardView_Preview_Scale2(this.$details, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonPosition.values().length];
            try {
                iArr[ButtonPosition.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonPosition.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonPosition.LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonPosition.MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Store.values().length];
            try {
                iArr2[Store.APP_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Store.MAC_APP_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Store.PLAY_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Store.AMAZON.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Store.GALAXY.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Store.PROMOTIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Store.STRIPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Store.EXTERNAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Store.PADDLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Store.RC_BILLING.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Store.UNKNOWN_STORE.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Store.TEST_STORE.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PurchaseInformationCardView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r21, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r22, androidx.compose.ui.e r23, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ButtonPosition r24, boolean r25, ie.InterfaceC5082a r26, Y.InterfaceC2425m r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt.PurchaseInformationCardView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ButtonPosition, boolean, ie.a, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PurchaseInformationCardView_Preview(PurchaseInformation purchaseInformation, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1729898988);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(purchaseInformation) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1729898988, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview (PurchaseInformationCardView.kt:201)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(832472595, true, new C43901(purchaseInformation), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43912(purchaseInformation, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PurchaseInformationCardView_Preview_Scale2(PurchaseInformation purchaseInformation, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1576933981);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(purchaseInformation) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1576933981, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview_Scale2 (PurchaseInformationCardView.kt:218)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(184551620, true, new C43921(purchaseInformation), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43932(purchaseInformation, i10));
        }
    }

    private static final String getPrice(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization) {
        PriceDetails pricePaid = purchaseInformation.getPricePaid();
        if (pricePaid instanceof PriceDetails.Paid) {
            return ((PriceDetails.Paid) purchaseInformation.getPricePaid()).getPrice();
        }
        if (AbstractC5504s.c(pricePaid, PriceDetails.Free.INSTANCE)) {
            return localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.FREE);
        }
        if (AbstractC5504s.c(pricePaid, PriceDetails.Unknown.INSTANCE)) {
            return null;
        }
        throw new r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getStoreText(Store store, CustomerCenterConfigData.Localization localization) {
        CustomerCenterConfigData.Localization.CommonLocalizedString commonLocalizedString;
        switch (WhenMappings.$EnumSwitchMapping$1[store.ordinal()]) {
            case 1:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.APP_STORE;
                break;
            case 2:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.MAC_APP_STORE;
                break;
            case 3:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.GOOGLE_PLAY_STORE;
                break;
            case 4:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.AMAZON_STORE;
                break;
            case 5:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.GALAXY_STORE;
                break;
            case 6:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.CARD_STORE_PROMOTIONAL;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.WEB_STORE;
                break;
            case 11:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.UNKNOWN_STORE;
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.TEST_STORE;
                break;
            default:
                throw new r();
        }
        return localization.commonLocalizedString(commonLocalizedString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSubtitle(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization) {
        ExpirationOrRenewal expirationOrRenewal = purchaseInformation.getExpirationOrRenewal();
        if (expirationOrRenewal instanceof ExpirationOrRenewal.Expiration) {
            return purchaseInformation.expirationString(((ExpirationOrRenewal.Expiration) purchaseInformation.getExpirationOrRenewal()).getDate(), localization);
        }
        if (expirationOrRenewal instanceof ExpirationOrRenewal.Renewal) {
            return purchaseInformation.renewalString(((ExpirationOrRenewal.Renewal) purchaseInformation.getExpirationOrRenewal()).getDate(), localization);
        }
        if (expirationOrRenewal == null) {
            return getPrice(purchaseInformation, localization);
        }
        throw new r();
    }
}
