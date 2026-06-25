package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import D.y;
import Td.L;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import g0.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LD/y;", "LTd/L;", "invoke", "(LD/y;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ long $foregroundOnAccentColor;
    final /* synthetic */ long $mainColor;
    final /* synthetic */ Function1 $onSelectPackage;
    final /* synthetic */ List<TemplateConfiguration.PackageInfo> $packages;
    final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(TemplateConfiguration.PackageInfo it) {
            AbstractC5504s.h(it, "it");
            return it.getRcPackage().getIdentifier();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1(List<TemplateConfiguration.PackageInfo> list, long j10, long j11, TemplateConfiguration.PackageInfo packageInfo, Function1 function1) {
        super(1);
        this.$packages = list;
        this.$mainColor = j10;
        this.$foregroundOnAccentColor = j11;
        this.$selectedPackage = packageInfo;
        this.$onSelectPackage = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((y) obj);
        return L.f17438a;
    }

    public final void invoke(y LazyColumn) {
        AbstractC5504s.h(LazyColumn, "$this$LazyColumn");
        List<TemplateConfiguration.PackageInfo> list = this.$packages;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        long j10 = this.$mainColor;
        long j11 = this.$foregroundOnAccentColor;
        TemplateConfiguration.PackageInfo packageInfo = this.$selectedPackage;
        Function1 function1 = this.$onSelectPackage;
        LazyColumn.d(list.size(), anonymousClass1 != null ? new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$2(anonymousClass1, list) : null, new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$3(DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$1.INSTANCE, list), i.b(-632812321, true, new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$4(list, j10, j11, packageInfo, function1)));
        if (this.$packages.isEmpty()) {
            return;
        }
        y.a(LazyColumn, null, null, ComposableSingletons$DefaultPaywallViewKt.INSTANCE.m794getLambda1$revenuecatui_defaultsBc8Release(), 3, null);
    }
}
