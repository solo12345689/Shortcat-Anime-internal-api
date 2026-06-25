package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import U.C2175l;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelFactory;", "Landroidx/lifecycle/W$d;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "LU/l;", "colorScheme", "", "isDarkMode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "listener", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;LU/l;ZLcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V", "Landroidx/lifecycle/U;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/U;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "LU/l;", "Z", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterViewModelFactory extends W.d {
    public static final int $stable = 8;
    private final C2175l colorScheme;
    private final boolean isDarkMode;
    private final CustomerCenterListener listener;
    private final PurchasesType purchases;

    public /* synthetic */ CustomerCenterViewModelFactory(PurchasesType purchasesType, C2175l c2175l, boolean z10, CustomerCenterListener customerCenterListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(purchasesType, c2175l, z10, (i10 & 8) != 0 ? null : customerCenterListener);
    }

    @Override // androidx.lifecycle.W.d, androidx.lifecycle.W.c
    public <T extends U> T create(Class<T> modelClass) {
        AbstractC5504s.h(modelClass, "modelClass");
        return new CustomerCenterViewModelImpl(this.purchases, null, null, this.colorScheme, this.isDarkMode, this.listener, 6, null);
    }

    public CustomerCenterViewModelFactory(PurchasesType purchases, C2175l colorScheme, boolean z10, CustomerCenterListener customerCenterListener) {
        AbstractC5504s.h(purchases, "purchases");
        AbstractC5504s.h(colorScheme, "colorScheme");
        this.purchases = purchases;
        this.colorScheme = colorScheme;
        this.isDarkMode = z10;
        this.listener = customerCenterListener;
    }
}
