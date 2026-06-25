package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import Zd.e;
import android.app.Activity;
import android.content.Context;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$rememberPaywallActionHandler$1$1", f = "InternalPaywall.kt", l = {276, 281}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;", "action", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;)V"}, k = 3, mv = {1, 8, 0})
final class InternalPaywallKt$rememberPaywallActionHandler$1$1 extends l implements Function2 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ PaywallViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalPaywallKt$rememberPaywallActionHandler$1$1(PaywallViewModel paywallViewModel, Activity activity, Context context, e eVar) {
        super(2, eVar);
        this.$viewModel = paywallViewModel;
        this.$activity = activity;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        InternalPaywallKt$rememberPaywallActionHandler$1$1 internalPaywallKt$rememberPaywallActionHandler$1$1 = new InternalPaywallKt$rememberPaywallActionHandler$1$1(this.$viewModel, this.$activity, this.$context, eVar);
        internalPaywallKt$rememberPaywallActionHandler$1$1.L$0 = obj;
        return internalPaywallKt$rememberPaywallActionHandler$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaywallAction.External external, e eVar) {
        return ((InternalPaywallKt$rememberPaywallActionHandler$1$1) create(external, eVar)).invokeSuspend(L.f17438a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r6.handleRestorePurchases(r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r3.handlePackagePurchase(r1, r4, r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            Td.v.b(r6)
            goto Lc3
        L1c:
            Td.v.b(r6)
            java.lang.Object r6 = r5.L$0
            com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction$External r6 = (com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External) r6
            boolean r1 = r6 instanceof com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.RestorePurchases
            if (r1 == 0) goto L32
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r6 = r5.$viewModel
            r5.label = r3
            java.lang.Object r6 = r6.handleRestorePurchases(r5)
            if (r6 != r0) goto Lc3
            goto L57
        L32:
            boolean r1 = r6 instanceof com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.PurchasePackage
            if (r1 == 0) goto L58
            android.app.Activity r1 = r5.$activity
            if (r1 != 0) goto L43
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.String r0 = "Activity is null, not initiating package purchase"
            r6.e(r0)
            goto Lc3
        L43:
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r3 = r5.$viewModel
            com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction$External$PurchasePackage r6 = (com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.PurchasePackage) r6
            com.revenuecat.purchases.Package r4 = r6.getRcPackage()
            com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer r6 = r6.getResolvedOffer()
            r5.label = r2
            java.lang.Object r6 = r3.handlePackagePurchase(r1, r4, r6, r5)
            if (r6 != r0) goto Lc3
        L57:
            return r0
        L58:
            boolean r0 = r6 instanceof com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.LaunchWebCheckout
            r1 = 0
            if (r0 == 0) goto L90
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r0 = r5.$viewModel
            com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction$External$LaunchWebCheckout r6 = (com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.LaunchWebCheckout) r6
            java.lang.String r0 = r0.getWebCheckoutUrl(r6)
            if (r0 != 0) goto L6f
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.String r0 = "Web checkout URL cannot be found, not launching web checkout."
            r6.e(r0)
            goto Lc3
        L6f:
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r2 = r5.$viewModel
            r2.invalidateCustomerInfoCache()
            android.content.Context r2 = r5.$context
            com.revenuecat.purchases.paywalls.components.ButtonComponent$UrlMethod r4 = r6.getOpenMethod()
            com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt.access$handleUrlDestination(r2, r0, r4)
            boolean r6 = r6.getAutoDismiss()
            if (r6 == 0) goto Lc3
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.String r0 = "Auto-dismissing paywall after launching web checkout."
            r6.d(r0)
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r6 = r5.$viewModel
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel.DefaultImpls.closePaywall$default(r6, r1, r3, r1)
            goto Lc3
        L90:
            boolean r0 = r6 instanceof com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.NavigateBack
            if (r0 == 0) goto L9a
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r6 = r5.$viewModel
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel.DefaultImpls.closePaywall$default(r6, r1, r3, r1)
            goto Lc3
        L9a:
            boolean r0 = r6 instanceof com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.NavigateTo
            if (r0 == 0) goto Lc3
            com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction$External$NavigateTo r6 = (com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.NavigateTo) r6
            com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction$External$NavigateTo$Destination r6 = r6.getDestination()
            boolean r0 = r6 instanceof com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.NavigateTo.Destination.CustomerCenter
            if (r0 == 0) goto Lb0
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.String r0 = "Customer Center is not yet implemented on Android."
            r6.w(r0)
            goto Lc3
        Lb0:
            boolean r0 = r6 instanceof com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.NavigateTo.Destination.Url
            if (r0 == 0) goto Lc3
            android.content.Context r0 = r5.$context
            com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction$External$NavigateTo$Destination$Url r6 = (com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction.External.NavigateTo.Destination.Url) r6
            java.lang.String r1 = r6.getUrl()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$UrlMethod r6 = r6.getMethod()
            com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt.access$handleUrlDestination(r0, r1, r6)
        Lc3:
            Td.L r6 = Td.L.f17438a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$rememberPaywallActionHandler$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
