package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class DefaultPaywallViewKt$DefaultPaywallView$2$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ long $foregroundOnAccentColor;
    final /* synthetic */ long $mainColor;
    final /* synthetic */ InterfaceC5082a $onPurchase;
    final /* synthetic */ InterfaceC5082a $onRestore;
    final /* synthetic */ List<TemplateConfiguration.PackageInfo> $packages;
    final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaywallViewKt$DefaultPaywallView$2$1(List<TemplateConfiguration.PackageInfo> list, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, TemplateConfiguration.PackageInfo packageInfo, long j10, long j11) {
        super(2);
        this.$packages = list;
        this.$onPurchase = interfaceC5082a;
        this.$onRestore = interfaceC5082a2;
        this.$selectedPackage = packageInfo;
        this.$mainColor = j10;
        this.$foregroundOnAccentColor = j11;
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
            AbstractC2454w.U(-1275945433, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallView.<anonymous>.<anonymous> (DefaultPaywallView.kt:153)");
        }
        if (!this.$packages.isEmpty()) {
            DefaultPaywallViewKt.m800DefaultPaywallFooterZkgLGzA(this.$onPurchase, this.$onRestore, this.$selectedPackage != null, this.$mainColor, this.$foregroundOnAccentColor, interfaceC2425m, 0);
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
