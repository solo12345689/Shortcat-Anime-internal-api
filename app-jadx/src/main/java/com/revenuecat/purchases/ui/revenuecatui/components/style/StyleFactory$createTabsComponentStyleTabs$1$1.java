package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle$Tab;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "index", "", "tab", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class StyleFactory$createTabsComponentStyleTabs$1$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ TabControlStyle $control;
    final /* synthetic */ StyleFactory.StyleFactoryScope $this_createTabsComponentStyleTabs;
    final /* synthetic */ StyleFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StyleFactory$createTabsComponentStyleTabs$1$1(StyleFactory styleFactory, StyleFactory.StyleFactoryScope styleFactoryScope, TabControlStyle tabControlStyle) {
        super(2);
        this.this$0 = styleFactory;
        this.$this_createTabsComponentStyleTabs = styleFactoryScope;
        this.$control = tabControlStyle;
    }

    public final Result<TabsComponentStyle.Tab, NonEmptyList<PaywallValidationError>> invoke(int i10, TabsComponent.Tab tab) {
        AbstractC5504s.h(tab, "tab");
        return this.this$0.createTabsComponentStyleTab(this.$this_createTabsComponentStyleTabs, tab, this.$control, i10);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (TabsComponent.Tab) obj2);
    }
}
