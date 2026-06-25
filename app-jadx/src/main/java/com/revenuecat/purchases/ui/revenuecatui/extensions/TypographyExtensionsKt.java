package com.revenuecat.purchases.ui.revenuecatui.extensions;

import U.o0;
import U0.Y0;
import Y0.AbstractC2485u;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LU/o0;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "copyWithFontProvider", "(LU/o0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU/o0;", "LU0/Y0;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;", "typographyType", "modifyFontIfNeeded", "(LU0/Y0;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)LU0/Y0;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TypographyExtensionsKt {
    public static final o0 copyWithFontProvider(o0 o0Var, FontProvider fontProvider) {
        AbstractC5504s.h(o0Var, "<this>");
        AbstractC5504s.h(fontProvider, "fontProvider");
        return o0Var.a(modifyFontIfNeeded(o0Var.e(), TypographyType.DISPLAY_LARGE, fontProvider), modifyFontIfNeeded(o0Var.f(), TypographyType.DISPLAY_MEDIUM, fontProvider), modifyFontIfNeeded(o0Var.g(), TypographyType.DISPLAY_SMALL, fontProvider), modifyFontIfNeeded(o0Var.h(), TypographyType.HEADLINE_LARGE, fontProvider), modifyFontIfNeeded(o0Var.i(), TypographyType.HEADLINE_MEDIUM, fontProvider), modifyFontIfNeeded(o0Var.j(), TypographyType.HEADLINE_SMALL, fontProvider), modifyFontIfNeeded(o0Var.n(), TypographyType.TITLE_LARGE, fontProvider), modifyFontIfNeeded(o0Var.o(), TypographyType.TITLE_MEDIUM, fontProvider), modifyFontIfNeeded(o0Var.p(), TypographyType.TITLE_SMALL, fontProvider), modifyFontIfNeeded(o0Var.b(), TypographyType.BODY_LARGE, fontProvider), modifyFontIfNeeded(o0Var.c(), TypographyType.BODY_MEDIUM, fontProvider), modifyFontIfNeeded(o0Var.d(), TypographyType.BODY_SMALL, fontProvider), modifyFontIfNeeded(o0Var.k(), TypographyType.LABEL_LARGE, fontProvider), modifyFontIfNeeded(o0Var.l(), TypographyType.LABEL_MEDIUM, fontProvider), modifyFontIfNeeded(o0Var.m(), TypographyType.LABEL_SMALL, fontProvider));
    }

    private static final Y0 modifyFontIfNeeded(Y0 y02, TypographyType typographyType, FontProvider fontProvider) {
        AbstractC2485u font = fontProvider.getFont(typographyType);
        return font == null ? y02 : Y0.e(y02, 0L, 0L, null, null, null, font, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
    }
}
