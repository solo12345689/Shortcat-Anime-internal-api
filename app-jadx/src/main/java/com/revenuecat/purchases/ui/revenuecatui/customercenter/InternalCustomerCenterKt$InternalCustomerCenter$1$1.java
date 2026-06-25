package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Gf.O;
import Td.L;
import Td.v;
import U.C2175l;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$1$1", f = "InternalCustomerCenter.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class InternalCustomerCenterKt$InternalCustomerCenter$1$1 extends l implements Function2 {
    final /* synthetic */ C2175l $colorScheme;
    final /* synthetic */ boolean $isDark;
    final /* synthetic */ CustomerCenterViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalCustomerCenterKt$InternalCustomerCenter$1$1(CustomerCenterViewModel customerCenterViewModel, C2175l c2175l, boolean z10, e eVar) {
        super(2, eVar);
        this.$viewModel = customerCenterViewModel;
        this.$colorScheme = c2175l;
        this.$isDark = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new InternalCustomerCenterKt$InternalCustomerCenter$1$1(this.$viewModel, this.$colorScheme, this.$isDark, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((InternalCustomerCenterKt$InternalCustomerCenter$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2605b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        this.$viewModel.refreshColors(this.$colorScheme, this.$isDark);
        return L.f17438a;
    }
}
