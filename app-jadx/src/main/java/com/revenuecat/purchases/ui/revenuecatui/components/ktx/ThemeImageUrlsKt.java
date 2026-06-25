package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import x.AbstractC7015m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "getUrlsForCurrentTheme", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LY/m;I)Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "urlsForCurrentTheme", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ThemeImageUrlsKt {
    public static final ImageUrls getUrlsForCurrentTheme(ThemeImageUrls themeImageUrls, InterfaceC2425m interfaceC2425m, int i10) {
        ImageUrls light;
        AbstractC5504s.h(themeImageUrls, "<this>");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(154958320, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ktx.<get-urlsForCurrentTheme> (ThemeImageUrls.kt:12)");
        }
        if (!AbstractC7015m.a(interfaceC2425m, 0) || (light = themeImageUrls.getDark()) == null) {
            light = themeImageUrls.getLight();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return light;
    }
}
