package com.revenuecat.purchases.ui.revenuecatui.fonts;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomParcelizableFontProvider;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;", "fontFamily", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;)V", "getFont", "type", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomParcelizableFontProvider implements ParcelizableFontProvider {
    public static final int $stable = 0;
    private final PaywallFontFamily fontFamily;

    public CustomParcelizableFontProvider(PaywallFontFamily fontFamily) {
        AbstractC5504s.h(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider
    public PaywallFontFamily getFont(TypographyType type) {
        AbstractC5504s.h(type, "type");
        return this.fontFamily;
    }
}
