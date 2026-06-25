package com.revenuecat.purchases.ui.revenuecatui;

import Zd.e;
import Zd.k;
import ae.AbstractC2605b;
import android.app.Activity;
import com.revenuecat.purchases.CustomerInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicWithCallback;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicParams;", "params", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;", "LTd/L;", "completion", "performPurchaseWithCompletion", "(Landroid/app/Activity;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicParams;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "performRestoreWithCompletion", "(Lcom/revenuecat/purchases/CustomerInfo;Lkotlin/jvm/functions/Function1;)V", "performPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicParams;LZd/e;)Ljava/lang/Object;", "performRestore", "(Lcom/revenuecat/purchases/CustomerInfo;LZd/e;)Ljava/lang/Object;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PaywallPurchaseLogicWithCallback implements PaywallPurchaseLogic {
    public static final int $stable = 0;

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic
    public final Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, e eVar) throws Throwable {
        k kVar = new k(AbstractC2605b.c(eVar));
        performPurchaseWithCompletion(activity, paywallPurchaseLogicParams, new PaywallPurchaseLogicWithCallback$performPurchase$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            h.c(eVar);
        }
        return objA;
    }

    public abstract void performPurchaseWithCompletion(Activity activity, PaywallPurchaseLogicParams params, Function1 completion);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic
    public final Object performRestore(CustomerInfo customerInfo, e eVar) throws Throwable {
        k kVar = new k(AbstractC2605b.c(eVar));
        performRestoreWithCompletion(customerInfo, new PaywallPurchaseLogicWithCallback$performRestore$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            h.c(eVar);
        }
        return objA;
    }

    public abstract void performRestoreWithCompletion(CustomerInfo customerInfo, Function1 completion);
}
