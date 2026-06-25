package com.revenuecat.purchases.ui.revenuecatui.templates;

import Td.L;
import Y.C0;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class Template7Kt$Template7$2$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ C0 $selectedTier$delegate;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template7Kt$Template7$2$2$1(PaywallState.Loaded.Legacy legacy, C0 c02) {
        super(1);
        this.$state = legacy;
        this.$selectedTier$delegate = c02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TemplateConfiguration.TierInfo) obj);
        return L.f17438a;
    }

    public final void invoke(TemplateConfiguration.TierInfo it) {
        AbstractC5504s.h(it, "it");
        this.$selectedTier$delegate.setValue(it);
        this.$state.selectPackage(Template7Kt.Template7$lambda$5(this.$selectedTier$delegate).getDefaultPackage());
    }
}
