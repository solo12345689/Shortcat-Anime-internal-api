package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import J.i;
import Td.L;
import Td.r;
import U.D;
import U.e0;
import U.j0;
import U0.Y0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;
import x.AbstractC7010h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "purchaseInformation", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "LTd/L;", "PurchaseStatusBadge", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;", "status", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;", "getBadgeInfo", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/BadgeInfo;", "determinePurchaseStatus", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseStatus;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchaseStatusBadgeKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadgeKt$PurchaseStatusBadge$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ PurchaseInformation $purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, int i10) {
            super(2);
            this.$purchaseInformation = purchaseInformation;
            this.$localization = localization;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PurchaseStatusBadgeKt.PurchaseStatusBadge(this.$purchaseInformation, this.$localization, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadgeKt$PurchaseStatusBadge$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ BadgeInfo $badgeInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BadgeInfo badgeInfo) {
            super(2);
            this.$badgeInfo = badgeInfo;
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
                AbstractC2454w.U(1077364541, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadge.<anonymous> (PurchaseStatusBadge.kt:34)");
            }
            String text = this.$badgeInfo.getText();
            D d10 = D.f17597a;
            int i11 = D.f17598b;
            Y0 y0K = d10.c(interfaceC2425m, i11).k();
            C6385r0 c6385r0M707getTextColorQN2ZGVo = this.$badgeInfo.m707getTextColorQN2ZGVo();
            interfaceC2425m.V(2012735351);
            long jW = c6385r0M707getTextColorQN2ZGVo == null ? d10.a(interfaceC2425m, i11).w() : c6385r0M707getTextColorQN2ZGVo.A();
            interfaceC2425m.O();
            e.a aVar = e.f26613a;
            CustomerCenterConstants.Card card = CustomerCenterConstants.Card.INSTANCE;
            j0.b(text, p.j(aVar, card.m646getBADGE_HORIZONTAL_PADDINGD9Ej5fM(), card.m647getBADGE_VERTICAL_PADDINGD9Ej5fM()), jW, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y0K, interfaceC2425m, 48, 0, 65528);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadgeKt$PurchaseStatusBadge$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ PurchaseInformation $purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, int i10) {
            super(2);
            this.$purchaseInformation = purchaseInformation;
            this.$localization = localization;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PurchaseStatusBadgeKt.PurchaseStatusBadge(this.$purchaseInformation, this.$localization, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void PurchaseStatusBadge(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(purchaseInformation, "purchaseInformation");
        AbstractC5504s.h(localization, "localization");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(256749794);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(purchaseInformation) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(localization) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(256749794, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadge (PurchaseStatusBadge.kt:21)");
            }
            BadgeInfo badgeInfo = getBadgeInfo(determinePurchaseStatus(purchaseInformation), localization, interfaceC2425mG, i11 & 112);
            if (badgeInfo.getText() == null || badgeInfo.m706getColorQN2ZGVo() == null) {
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
                B1 b1K = interfaceC2425mG.k();
                if (b1K != null) {
                    b1K.a(new AnonymousClass1(purchaseInformation, localization, i10));
                    return;
                }
                return;
            }
            e0.a(null, i.d(CustomerCenterConstants.Card.INSTANCE.m645getBADGE_CORNER_SIZED9Ej5fM()), badgeInfo.m706getColorQN2ZGVo().A(), 0L, 0.0f, 0.0f, badgeInfo.getBorder(), g0.i.d(1077364541, true, new AnonymousClass2(badgeInfo), interfaceC2425mG, 54), interfaceC2425mG, 12582912, 57);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K2 = interfaceC2425mG.k();
        if (b1K2 != null) {
            b1K2.a(new AnonymousClass3(purchaseInformation, localization, i10));
        }
    }

    private static final PurchaseStatus determinePurchaseStatus(PurchaseInformation purchaseInformation) {
        return purchaseInformation.isExpired() ? PurchaseStatus.EXPIRED : (purchaseInformation.isCancelled() && purchaseInformation.isTrial()) ? PurchaseStatus.FREE_TRIAL_CANCELLED : (!purchaseInformation.isCancelled() || purchaseInformation.getStore() == Store.PROMOTIONAL) ? purchaseInformation.isTrial() ? PurchaseStatus.FREE_TRIAL : purchaseInformation.isLifetime() ? PurchaseStatus.LIFETIME : purchaseInformation.getExpirationOrRenewal() != null ? PurchaseStatus.ACTIVE : PurchaseStatus.NONE : PurchaseStatus.CANCELLED;
    }

    private static final BadgeInfo getBadgeInfo(PurchaseStatus purchaseStatus, CustomerCenterConfigData.Localization localization, InterfaceC2425m interfaceC2425m, int i10) {
        BadgeInfo badgeInfo;
        BadgeInfo badgeInfo2;
        interfaceC2425m.V(806722768);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(806722768, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.getBadgeInfo (PurchaseStatusBadge.kt:57)");
        }
        if (purchaseStatus == PurchaseStatus.EXPIRED) {
            badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.EXPIRED), C6385r0.m(AbstractC6387s0.b(CustomerCenterConstants.Card.COLOR_BADGE_EXPIRED)), null, null, 12, null);
        } else {
            if (purchaseStatus == PurchaseStatus.FREE_TRIAL_CANCELLED) {
                badgeInfo2 = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BADGE_FREE_TRIAL_CANCELLED), C6385r0.m(AbstractC6387s0.b(CustomerCenterConstants.Card.COLOR_BADGE_CANCELLED)), null, null, 12, null);
            } else if (purchaseStatus == PurchaseStatus.CANCELLED) {
                badgeInfo2 = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BADGE_CANCELLED), C6385r0.m(AbstractC6387s0.b(CustomerCenterConstants.Card.COLOR_BADGE_CANCELLED)), null, null, 12, null);
            } else if (purchaseStatus == PurchaseStatus.FREE_TRIAL) {
                badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BADGE_FREE_TRIAL), C6385r0.m(AbstractC6387s0.b(CustomerCenterConstants.Card.COLOR_BADGE_FREE_TRIAL)), null, null, 12, null);
            } else if (purchaseStatus == PurchaseStatus.LIFETIME) {
                badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BADGE_LIFETIME), C6385r0.m(C6385r0.f58985b.i()), AbstractC7010h.a(C5015h.n(1), C6385r0.q(D.f17597a.a(interfaceC2425m, D.f17598b).w(), 0.29f, 0.0f, 0.0f, 0.0f, 14, null)), null, 8, null);
            } else if (purchaseStatus == PurchaseStatus.ACTIVE) {
                badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.ACTIVE), C6385r0.m(AbstractC6387s0.d(CustomerCenterConstants.Card.COLOR_BADGE_ACTIVE)), null, null, 12, null);
            } else {
                if (purchaseStatus != PurchaseStatus.NONE) {
                    throw new r();
                }
                badgeInfo = new BadgeInfo(null, null, null, null, 12, null);
            }
            badgeInfo = badgeInfo2;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return badgeInfo;
    }
}
