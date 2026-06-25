package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Jf.AbstractC1744g;
import Jf.E;
import Jf.I;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/VirtualCurrencyBalancesScreenViewModel;", "Landroidx/lifecycle/U;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "LJf/I;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/VirtualCurrencyBalancesScreenViewState;", "viewState", "LJf/I;", "getViewState", "()LJf/I;", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrencyBalancesScreenViewModel extends U {
    public static final int $stable = 0;
    private static final long STOP_TIMEOUT_MILLIS = 5000;
    private final PurchasesType purchases;
    private final I viewState;

    public VirtualCurrencyBalancesScreenViewModel(PurchasesType purchases) {
        AbstractC5504s.h(purchases, "purchases");
        this.purchases = purchases;
        this.viewState = AbstractC1744g.w(AbstractC1744g.q(new VirtualCurrencyBalancesScreenViewModel$viewState$1(this, null)), V.a(this), E.a.b(E.f9525a, 5000L, 0L, 2, null), VirtualCurrencyBalancesScreenViewState.Loading.INSTANCE);
    }

    public final I getViewState() {
        return this.viewState;
    }
}
