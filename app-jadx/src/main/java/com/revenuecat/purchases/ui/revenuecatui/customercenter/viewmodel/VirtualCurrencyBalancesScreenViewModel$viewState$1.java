package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Jf.InterfaceC1743f;
import Td.L;
import Zd.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel$viewState$1", f = "VirtualCurrencyBalancesScreenViewModel.kt", l = {ColorExtractionConstants.ALPHA_CHANNEL_SHIFT, 28, BackgroundUIConstants.minSDKVersionSupportingBlur, 33}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJf/f;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrencyBalancesScreenViewState;", "LTd/L;", "<anonymous>", "(LJf/f;)V"}, k = 3, mv = {1, 8, 0})
final class VirtualCurrencyBalancesScreenViewModel$viewState$1 extends l implements Function2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VirtualCurrencyBalancesScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCurrencyBalancesScreenViewModel$viewState$1(VirtualCurrencyBalancesScreenViewModel virtualCurrencyBalancesScreenViewModel, e eVar) {
        super(2, eVar);
        this.this$0 = virtualCurrencyBalancesScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        VirtualCurrencyBalancesScreenViewModel$viewState$1 virtualCurrencyBalancesScreenViewModel$viewState$1 = new VirtualCurrencyBalancesScreenViewModel$viewState$1(this.this$0, eVar);
        virtualCurrencyBalancesScreenViewModel$viewState$1.L$0 = obj;
        return virtualCurrencyBalancesScreenViewModel$viewState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1743f interfaceC1743f, e eVar) {
        return ((VirtualCurrencyBalancesScreenViewModel$viewState$1) create(interfaceC1743f, eVar)).invokeSuspend(L.f17438a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r1.emit(r4, r6) != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r1.emit(r3, r6) != r0) goto L34;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [Jf.f, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            Td.v.b(r7)
            goto La5
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            java.lang.Object r1 = r6.L$0
            Jf.f r1 = (Jf.InterfaceC1743f) r1
            Td.v.b(r7)     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            goto La5
        L2a:
            r7 = move-exception
            goto L90
        L2c:
            java.lang.Object r1 = r6.L$0
            Jf.f r1 = (Jf.InterfaceC1743f) r1
            Td.v.b(r7)     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            goto L6b
        L34:
            java.lang.Object r1 = r6.L$0
            Jf.f r1 = (Jf.InterfaceC1743f) r1
            Td.v.b(r7)
            goto L51
        L3c:
            Td.v.b(r7)
            java.lang.Object r7 = r6.L$0
            Jf.f r7 = (Jf.InterfaceC1743f) r7
            com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState$Loading r1 = com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState.Loading.INSTANCE
            r6.L$0 = r7
            r6.label = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L50
            goto La4
        L50:
            r1 = r7
        L51:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel r7 = r6.this$0
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r7 = com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel.access$getPurchases$p(r7)
            r7.invalidateVirtualCurrenciesCache()
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel r7 = r6.this$0     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r7 = com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel.access$getPurchases$p(r7)     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            r6.L$0 = r1     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            r6.label = r4     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            java.lang.Object r7 = r7.awaitGetVirtualCurrencies(r6)     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            if (r7 != r0) goto L6b
            goto La4
        L6b:
            com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies r7 = (com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies) r7     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            java.util.Map r7 = r7.getAll()     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            java.util.Collection r7 = r7.values()     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel$viewState$1$invokeSuspend$$inlined$sortedByDescending$1 r4 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel$viewState$1$invokeSuspend$$inlined$sortedByDescending$1     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            r4.<init>()     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            java.util.List r7 = Ud.AbstractC2279u.R0(r7, r4)     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState$Loaded r4 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState$Loaded     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            r4.<init>(r7)     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            r6.L$0 = r1     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            r6.label = r3     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            java.lang.Object r7 = r1.emit(r4, r6)     // Catch: com.revenuecat.purchases.PurchasesException -> L2a
            if (r7 != r0) goto La5
            goto La4
        L90:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState$Error r3 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState$Error
            com.revenuecat.purchases.PurchasesError r7 = r7.getError()
            r3.<init>(r7)
            r7 = 0
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto La5
        La4:
            return r0
        La5:
            Td.L r7 = Td.L.f17438a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel$viewState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
