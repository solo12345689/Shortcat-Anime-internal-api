package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData;
import com.revenuecat.purchases.ui.revenuecatui.utils.PreviewDataCreatorsKt;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;", "promotionalOfferData", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "appearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "LTd/L;", "onAccept", "Lkotlin/Function0;", "onDismiss", "Landroidx/compose/ui/e;", "modifier", "PromotionalOfferScreen", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Lie/a;Landroidx/compose/ui/e;LY/m;II)V", "PromotionalOfferViewPreview", "(LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class PromotionalOfferScreenKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreenKt$PromotionalOfferScreen$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1 $onAccept;
        final /* synthetic */ InterfaceC5082a $onDismiss;
        final /* synthetic */ PromotionalOfferData $promotionalOfferData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PromotionalOfferData promotionalOfferData, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, Function1 function1, InterfaceC5082a interfaceC5082a, e eVar, int i10, int i11) {
            super(2);
            this.$promotionalOfferData = promotionalOfferData;
            this.$appearance = appearance;
            this.$localization = localization;
            this.$onAccept = function1;
            this.$onDismiss = interfaceC5082a;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PromotionalOfferScreenKt.PromotionalOfferScreen(this.$promotionalOfferData, this.$appearance, this.$localization, this.$onAccept, this.$onDismiss, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreenKt$PromotionalOfferViewPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOption;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/models/SubscriptionOption;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(SubscriptionOption it) {
            AbstractC5504s.h(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SubscriptionOption) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreenKt$PromotionalOfferViewPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43892 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43892 INSTANCE = new C43892();

        C43892() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m747invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m747invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreenKt$PromotionalOfferViewPreview$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PromotionalOfferScreenKt.PromotionalOfferViewPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void PromotionalOfferScreen(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData r48, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r49, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r50, kotlin.jvm.functions.Function1 r51, ie.InterfaceC5082a r52, androidx.compose.ui.e r53, Y.InterfaceC2425m r54, int r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreenKt.PromotionalOfferScreen(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, kotlin.jvm.functions.Function1, ie.a, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final void PromotionalOfferViewPreview(InterfaceC2425m interfaceC2425m, int i10) {
        List<CustomerCenterConfigData.HelpPath> paths;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-552832253);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-552832253, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferViewPreview (PromotionalOfferScreen.kt:109)");
            }
            CustomerCenterConfigData.Screen managementScreen = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getManagementScreen();
            if (managementScreen != null && (paths = managementScreen.getPaths()) != null) {
                for (CustomerCenterConfigData.HelpPath helpPath : paths) {
                    if (helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.REFUND_REQUEST) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            helpPath = null;
            AbstractC5504s.e(helpPath);
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer = helpPath.getPromotionalOffer();
            AbstractC5504s.e(promotionalOffer);
            PromotionalOfferData promotionalOfferData = new PromotionalOfferData(promotionalOffer, PreviewDataCreatorsKt.previewSubscriptionOption$default("rc-cancel-offer", "monthly", null, null, null, null, 60, null), new CustomerCenterConfigData.HelpPath("1", "Check for previous purchases", CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (DefaultConstructorMarker) null), "1 month for $7.99, then $9.99/mth");
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            PromotionalOfferScreen(promotionalOfferData, CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null).getAppearance(), CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null).getLocalization(), AnonymousClass1.INSTANCE, C43892.INSTANCE, null, interfaceC2425mG, 27648, 32);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(i10));
        }
    }
}
