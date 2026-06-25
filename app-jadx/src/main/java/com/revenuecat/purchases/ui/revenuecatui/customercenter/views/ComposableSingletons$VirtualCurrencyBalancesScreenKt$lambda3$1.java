package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda3$1 extends AbstractC5506u implements Function2 {
    public static final ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda3$1();

    ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda3$1() {
        super(2);
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
            AbstractC2454w.U(-1872635862, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$VirtualCurrencyBalancesScreenKt.lambda-3.<anonymous> (VirtualCurrencyBalancesScreen.kt:206)");
        }
        CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
        VirtualCurrencyBalancesScreenKt.InternalVirtualCurrencyBalancesScreen(customerCenterConfigTestData.getStandardAppearance(), CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null).getLocalization(), new VirtualCurrencyBalancesScreenViewState.Loaded(AbstractC2279u.R0(customerCenterConfigTestData.getFourVirtualCurrencies().getAll().values(), new Comparator() { // from class: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-3$1$invoke$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return Xd.a.d(Integer.valueOf(((VirtualCurrency) t11).getBalance()), Integer.valueOf(((VirtualCurrency) t10).getBalance()));
            }
        })), null, interfaceC2425m, 0, 8);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
