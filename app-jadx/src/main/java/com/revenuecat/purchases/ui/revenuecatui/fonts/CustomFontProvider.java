package com.revenuecat.purchases.ui.revenuecatui.fonts;

import Y0.AbstractC2485u;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "LY0/u;", "fontFamily", "<init>", "(LY0/u;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;", "type", "getFont", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;)LY0/u;", "LY0/u;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomFontProvider implements FontProvider {
    public static final int $stable = 0;
    private final AbstractC2485u fontFamily;

    public CustomFontProvider(AbstractC2485u fontFamily) {
        AbstractC5504s.h(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider
    public AbstractC2485u getFont(TypographyType type) {
        AbstractC5504s.h(type, "type");
        return this.fontFamily;
    }
}
