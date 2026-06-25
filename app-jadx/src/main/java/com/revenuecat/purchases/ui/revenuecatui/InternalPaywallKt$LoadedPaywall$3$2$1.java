package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.C5487a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class InternalPaywallKt$LoadedPaywall$3$2$1 extends C5487a implements InterfaceC5082a {
    InternalPaywallKt$LoadedPaywall$3$2$1(Object obj) {
        super(0, obj, PaywallViewModel.class, "closePaywall", "closePaywall(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", 0);
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m376invoke();
        return L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m376invoke() {
        PaywallViewModel.DefaultImpls.closePaywall$default((PaywallViewModel) this.receiver, null, 1, null);
    }
}
