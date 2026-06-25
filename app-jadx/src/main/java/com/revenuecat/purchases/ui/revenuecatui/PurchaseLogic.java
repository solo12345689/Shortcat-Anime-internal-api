package com.revenuecat.purchases.ui.revenuecatui;

import Td.InterfaceC2154e;
import Zd.e;
import android.app.Activity;
import com.revenuecat.purchases.Package;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogic;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;", "performPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicParams;", "params", "(Landroid/app/Activity;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogicParams;LZd/e;)Ljava/lang/Object;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public interface PurchaseLogic extends PaywallPurchaseLogic {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object performPurchase(PurchaseLogic purchaseLogic, Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, e eVar) {
            return purchaseLogic.performPurchase(activity, paywallPurchaseLogicParams.getRcPackage(), eVar);
        }
    }

    Object performPurchase(Activity activity, Package r22, e eVar);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic
    Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, e eVar);
}
