package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import g0.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\u000f\u001a\u00020\r2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "contactEmail", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "purchaseInformation", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "supportedPaths", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "LTd/L;", "onAction", "SelectedPurchaseDetailView", "(Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V", "SelectedPurchaseDetailViewPreview", "(LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SelectedPurchaseDetailViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewKt$SelectedPurchaseDetailView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $contactEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ PurchaseInformation $purchaseInformation;
        final /* synthetic */ List<CustomerCenterConfigData.HelpPath> $supportedPaths;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, CustomerCenterConfigData.Localization localization, PurchaseInformation purchaseInformation, List<CustomerCenterConfigData.HelpPath> list, e eVar, Function1 function1, int i10, int i11) {
            super(2);
            this.$contactEmail = str;
            this.$localization = localization;
            this.$purchaseInformation = purchaseInformation;
            this.$supportedPaths = list;
            this.$modifier = eVar;
            this.$onAction = function1;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SelectedPurchaseDetailViewKt.SelectedPurchaseDetailView(this.$contactEmail, this.$localization, this.$purchaseInformation, this.$supportedPaths, this.$modifier, this.$onAction, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewKt$SelectedPurchaseDetailViewPreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ PurchaseInformation $purchaseInfo;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewKt$SelectedPurchaseDetailViewPreview$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06911 extends AbstractC5506u implements Function1 {
            public static final C06911 INSTANCE = new C06911();

            C06911() {
                super(1);
            }

            public final void invoke(CustomerCenterAction it) {
                AbstractC5504s.h(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerCenterAction) obj);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CustomerCenterConfigData customerCenterConfigData, PurchaseInformation purchaseInformation, CustomerCenterConfigData.Screen screen) {
            super(2);
            this.$testData = customerCenterConfigData;
            this.$purchaseInfo = purchaseInformation;
            this.$managementScreen = screen;
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
                AbstractC2454w.U(1713352777, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewPreview.<anonymous> (SelectedPurchaseDetailView.kt:72)");
            }
            SelectedPurchaseDetailViewKt.SelectedPurchaseDetailView(this.$testData.getSupport().getEmail(), this.$testData.getLocalization(), this.$purchaseInfo, this.$managementScreen.getPaths(), null, C06911.INSTANCE, interfaceC2425m, 196608, 16);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewKt$SelectedPurchaseDetailViewPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44082 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44082(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SelectedPurchaseDetailViewKt.SelectedPurchaseDetailViewPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SelectedPurchaseDetailView(java.lang.String r30, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r31, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r32, java.util.List<com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath> r33, androidx.compose.ui.e r34, kotlin.jvm.functions.Function1 r35, Y.InterfaceC2425m r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewKt.SelectedPurchaseDetailView(java.lang.String, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation, java.util.List, androidx.compose.ui.e, kotlin.jvm.functions.Function1, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectedPurchaseDetailViewPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1898383606);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1898383606, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewPreview (SelectedPurchaseDetailView.kt:67)");
            }
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1713352777, true, new AnonymousClass1(customerCenterConfigDataCustomerCenterData$default, customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), screen), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44082(i10));
        }
    }
}
