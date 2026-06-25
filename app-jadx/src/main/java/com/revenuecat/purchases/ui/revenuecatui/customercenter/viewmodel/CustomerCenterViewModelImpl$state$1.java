package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Jf.InterfaceC1743f;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$state$1", f = "CustomerCenterViewModel.kt", l = {219}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJf/f;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;", "LTd/L;", "<anonymous>", "(LJf/f;)V"}, k = 3, mv = {1, 8, 0})
final class CustomerCenterViewModelImpl$state$1 extends l implements Function2 {
    int label;
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerCenterViewModelImpl$state$1(CustomerCenterViewModelImpl customerCenterViewModelImpl, e eVar) {
        super(2, eVar);
        this.this$0 = customerCenterViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new CustomerCenterViewModelImpl$state$1(this.this$0, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1743f interfaceC1743f, e eVar) {
        return ((CustomerCenterViewModelImpl$state$1) create(interfaceC1743f, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            CustomerCenterState customerCenterState = (CustomerCenterState) this.this$0._state.getValue();
            if ((customerCenterState instanceof CustomerCenterState.NotLoaded) || (customerCenterState instanceof CustomerCenterState.Loading) || (customerCenterState instanceof CustomerCenterState.Error)) {
                CustomerCenterViewModelImpl customerCenterViewModelImpl = this.this$0;
                this.label = 1;
                if (customerCenterViewModelImpl.loadCustomerCenter(this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
        }
        return L.f17438a;
    }
}
