package com.revenuecat.purchases.ui.revenuecatui.components.text;

import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TextComponentState$localizedVariableKeys$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextComponentState$localizedVariableKeys$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final NonEmptyMap<VariableLocalizationKey, String> invoke() {
        NonEmptyMap variableLocalizations = this.this$0.style.getVariableLocalizations();
        NonEmptyMap<VariableLocalizationKey, String> nonEmptyMap = (NonEmptyMap) LocalizationKt.m420getBestMatch64pKzr8(variableLocalizations, this.this$0.m543getLocaleIduqtKvyA());
        return nonEmptyMap == null ? (NonEmptyMap) variableLocalizations.getEntry().getValue() : nonEmptyMap;
    }
}
