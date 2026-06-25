package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Gf.O;
import Td.L;
import Td.v;
import U.a0;
import Y.h2;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoaded$1$1", f = "InternalCustomerCenter.kt", l = {423}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class InternalCustomerCenterKt$CustomerCenterLoaded$1$1 extends l implements Function2 {
    final /* synthetic */ h2 $latestMessage$delegate;
    final /* synthetic */ h2 $latestOnAction$delegate;
    final /* synthetic */ a0 $snackbarHostState;
    final /* synthetic */ CustomerCenterState.Success $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalCustomerCenterKt$CustomerCenterLoaded$1$1(CustomerCenterState.Success success, a0 a0Var, h2 h2Var, h2 h2Var2, e eVar) {
        super(2, eVar);
        this.$state = success;
        this.$snackbarHostState = a0Var;
        this.$latestMessage$delegate = h2Var;
        this.$latestOnAction$delegate = h2Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new InternalCustomerCenterKt$CustomerCenterLoaded$1$1(this.$state, this.$snackbarHostState, this.$latestMessage$delegate, this.$latestOnAction$delegate, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((InternalCustomerCenterKt$CustomerCenterLoaded$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InternalCustomerCenterKt$CustomerCenterLoaded$1$1 internalCustomerCenterKt$CustomerCenterLoaded$1$1;
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            if (!this.$state.getShowSupportTicketSuccessSnackbar()) {
                return L.f17438a;
            }
            a0 a0Var = this.$snackbarHostState;
            String strCustomerCenterLoaded$lambda$14 = InternalCustomerCenterKt.CustomerCenterLoaded$lambda$14(this.$latestMessage$delegate);
            this.label = 1;
            internalCustomerCenterKt$CustomerCenterLoaded$1$1 = this;
            if (a0.f(a0Var, strCustomerCenterLoaded$lambda$14, null, false, null, internalCustomerCenterKt$CustomerCenterLoaded$1$1, 14, null) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            internalCustomerCenterKt$CustomerCenterLoaded$1$1 = this;
        }
        InternalCustomerCenterKt.CustomerCenterLoaded$lambda$13(internalCustomerCenterKt$CustomerCenterLoaded$1$1.$latestOnAction$delegate).invoke(CustomerCenterAction.DismissSupportTicketSuccessSnackbar.INSTANCE);
        return L.f17438a;
    }
}
