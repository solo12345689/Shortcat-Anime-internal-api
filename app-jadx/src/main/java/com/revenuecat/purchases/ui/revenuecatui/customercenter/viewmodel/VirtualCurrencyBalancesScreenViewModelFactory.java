package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import androidx.lifecycle.U;
import androidx.lifecycle.W;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/VirtualCurrencyBalancesScreenViewModelFactory;", "Landroidx/lifecycle/W$d;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;)V", "Landroidx/lifecycle/U;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/U;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrencyBalancesScreenViewModelFactory extends W.d {
    public static final int $stable = 8;
    private final PurchasesType purchases;

    public VirtualCurrencyBalancesScreenViewModelFactory(PurchasesType purchases) {
        AbstractC5504s.h(purchases, "purchases");
        this.purchases = purchases;
    }

    @Override // androidx.lifecycle.W.d, androidx.lifecycle.W.c
    public <T extends U> T create(Class<T> modelClass) {
        AbstractC5504s.h(modelClass, "modelClass");
        return new VirtualCurrencyBalancesScreenViewModel(this.purchases);
    }
}
