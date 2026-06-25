package com.revenuecat.purchases.ui.revenuecatui.components.image;

import c1.d;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ImageComponentState$themeImageUrls$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComponentState$themeImageUrls$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ie.InterfaceC5082a
    public final ThemeImageUrls invoke() {
        NonEmptyMap sources;
        ThemeImageUrls themeImageUrls;
        String localeId = LocalizationKt.toLocaleId((d) this.this$0.localeProvider.invoke());
        PresentedImagePartial presentedPartial = this.this$0.getPresentedPartial();
        if (presentedPartial != null && (sources = presentedPartial.getSources()) != null && (themeImageUrls = (ThemeImageUrls) sources.getOrDefault(LocaleId.m307boximpl(localeId), sources.getEntry().getValue())) != null) {
            return themeImageUrls;
        }
        NonEmptyMap sources2 = this.this$0.style.getSources();
        return (ThemeImageUrls) sources2.getOrDefault(LocaleId.m307boximpl(localeId), sources2.getEntry().getValue());
    }
}
