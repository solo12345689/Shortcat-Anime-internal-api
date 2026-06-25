package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class InternalPaywallKt$LoadedPaywall$1$1$1 extends AbstractC5502p implements Function1 {
    InternalPaywallKt$LoadedPaywall$1$1$1(Object obj) {
        super(1, obj, PaywallViewModel.class, "selectPackage", "selectPackage(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TemplateConfiguration.PackageInfo) obj);
        return L.f17438a;
    }

    public final void invoke(TemplateConfiguration.PackageInfo p02) {
        AbstractC5504s.h(p02, "p0");
        ((PaywallViewModel) this.receiver).selectPackage(p02);
    }
}
