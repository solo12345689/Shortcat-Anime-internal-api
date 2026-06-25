package com.revenuecat.purchases.ui.revenuecatui.components.text;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2;
import ie.InterfaceC5082a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TextComponentViewKt$rememberProcessedText$processedText$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ PaywallState.Loaded.Components $state;
    final /* synthetic */ TextComponentState $textState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextComponentViewKt$rememberProcessedText$processedText$2$1(PaywallState.Loaded.Components components, TextComponentState textComponentState) {
        super(0);
        this.$state = components;
        this.$textState = textComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        VariableProcessor.PackageContext packageContext;
        Locale javaLocale = LocalizationKt.toJavaLocale(this.$state.getLocale());
        Locale javaLocale2 = LocalizationKt.toJavaLocale(this.$state.getCurrencyLocale());
        Package applicablePackage = this.$textState.getApplicablePackage();
        if (applicablePackage != null) {
            PaywallState.Loaded.Components components = this.$state;
            Price pricePricePerMonth$default = StoreProduct.pricePerMonth$default(applicablePackage.getProduct(), null, 1, null);
            packageContext = new VariableProcessor.PackageContext(TextComponentViewKt.discountPercentage(pricePricePerMonth$default != null ? Long.valueOf(pricePricePerMonth$default.getAmountMicros()) : null, components.getMostExpensivePricePerMonthMicros()), !components.getShowPricesWithDecimals());
        } else {
            packageContext = null;
        }
        return VariableProcessorV2.INSTANCE.processVariables(this.$textState.getText(), this.$textState.getLocalizedVariableKeys(), this.$state.getVariableConfig(), this.$state.getVariableDataProvider(), packageContext, applicablePackage, this.$textState.getSubscriptionOption(), javaLocale2, javaLocale, this.$state.getCurrentDate(), this.$textState.getCountdownTime(), this.$textState.getCountFrom(), this.$state.getCustomVariables(), this.$state.getDefaultCustomVariables());
    }
}
