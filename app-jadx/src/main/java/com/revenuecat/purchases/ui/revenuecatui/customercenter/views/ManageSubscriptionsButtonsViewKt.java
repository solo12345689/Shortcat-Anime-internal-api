package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "associatedPurchaseInformation", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "supportedPaths", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "", "contactEmail", "", "addContactButton", "addCreateTicketButton", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "LTd/L;", "onAction", "ManageSubscriptionsButtonsView", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;LY/m;II)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ManageSubscriptionsButtonsViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $addContactButton;
        final /* synthetic */ boolean $addCreateTicketButton;
        final /* synthetic */ PurchaseInformation $associatedPurchaseInformation;
        final /* synthetic */ String $contactEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ List<CustomerCenterConfigData.HelpPath> $supportedPaths;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PurchaseInformation purchaseInformation, List<CustomerCenterConfigData.HelpPath> list, CustomerCenterConfigData.Localization localization, String str, boolean z10, boolean z11, Function1 function1, int i10, int i11) {
            super(2);
            this.$associatedPurchaseInformation = purchaseInformation;
            this.$supportedPaths = list;
            this.$localization = localization;
            this.$contactEmail = str;
            this.$addContactButton = z10;
            this.$addCreateTicketButton = z11;
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
            ManageSubscriptionsButtonsViewKt.ManageSubscriptionsButtonsView(this.$associatedPurchaseInformation, this.$supportedPaths, this.$localization, this.$contactEmail, this.$addContactButton, this.$addCreateTicketButton, this.$onAction, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ManageSubscriptionsButtonsView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r26, java.util.List<com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath> r27, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r28, java.lang.String r29, boolean r30, boolean r31, kotlin.jvm.functions.Function1 r32, Y.InterfaceC2425m r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ManageSubscriptionsButtonsViewKt.ManageSubscriptionsButtonsView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation, java.util.List, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, Y.m, int, int):void");
    }
}
