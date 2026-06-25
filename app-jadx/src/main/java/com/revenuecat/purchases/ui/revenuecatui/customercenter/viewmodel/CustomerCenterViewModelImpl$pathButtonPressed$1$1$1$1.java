package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Gf.O;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1", f = "CustomerCenterViewModel.kt", l = {250}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1 extends l implements Function2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option $it;
    final /* synthetic */ CustomerCenterConfigData.HelpPath $path;
    final /* synthetic */ PurchaseInformation $purchaseInformation;
    int label;
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1(CustomerCenterViewModelImpl customerCenterViewModelImpl, Context context, PurchaseInformation purchaseInformation, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option, CustomerCenterConfigData.HelpPath helpPath, e eVar) {
        super(2, eVar);
        this.this$0 = customerCenterViewModelImpl;
        this.$context = context;
        this.$purchaseInformation = purchaseInformation;
        this.$it = option;
        this.$path = helpPath;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1(this.this$0, this.$context, this.$purchaseInformation, this.$it, this.$path, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1 customerCenterViewModelImpl$pathButtonPressed$1$1$1$1;
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            CustomerCenterViewModelImpl customerCenterViewModelImpl = this.this$0;
            Context context = this.$context;
            PurchaseInformation purchaseInformation = this.$purchaseInformation;
            StoreProduct product = purchaseInformation != null ? purchaseInformation.getProduct() : null;
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer = this.$it.getPromotionalOffer();
            CustomerCenterConfigData.HelpPath helpPath = this.$path;
            PurchaseInformation purchaseInformation2 = this.$purchaseInformation;
            this.label = 1;
            customerCenterViewModelImpl$pathButtonPressed$1$1$1$1 = this;
            obj = customerCenterViewModelImpl.handlePromotionalOffer(context, product, promotionalOffer, helpPath, purchaseInformation2, customerCenterViewModelImpl$pathButtonPressed$1$1$1$1);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            customerCenterViewModelImpl$pathButtonPressed$1$1$1$1 = this;
        }
        if (!((Boolean) obj).booleanValue()) {
            customerCenterViewModelImpl$pathButtonPressed$1$1$1$1.this$0.goBackToMain();
            customerCenterViewModelImpl$pathButtonPressed$1$1$1$1.this$0.mainPathAction(customerCenterViewModelImpl$pathButtonPressed$1$1$1$1.$path, customerCenterViewModelImpl$pathButtonPressed$1$1$1$1.$context, customerCenterViewModelImpl$pathButtonPressed$1$1$1$1.$purchaseInformation);
        }
        return L.f17438a;
    }
}
