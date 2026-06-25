package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import Td.r;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import i1.C5015h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "", "Lcom/revenuecat/purchases/ColorAlias;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "aliases", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "toShadowStyles", "(Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;", "rememberShadowStyle", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ShadowStyleKt {
    public static final /* synthetic */ ShadowStyle rememberShadowStyle(ShadowStyles shadow, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(shadow, "shadow");
        interfaceC2425m.V(1695935038);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1695935038, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberShadowStyle (ShadowStyle.kt:55)");
        }
        ColorStyle forCurrentTheme = ColorStyleKt.getForCurrentTheme(shadow.getColors(), interfaceC2425m, 0);
        interfaceC2425m.V(-634727445);
        boolean zU = interfaceC2425m.U(forCurrentTheme);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            Object shadowStyle = new ShadowStyle(forCurrentTheme, shadow.m497getRadiusD9Ej5fM(), shadow.m498getXD9Ej5fM(), shadow.m499getYD9Ej5fM(), null);
            interfaceC2425m.u(shadowStyle);
            objD = shadowStyle;
        }
        ShadowStyle shadowStyle2 = (ShadowStyle) objD;
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return shadowStyle2;
    }

    public static final /* synthetic */ Result toShadowStyles(Shadow shadow, Map aliases) {
        AbstractC5504s.h(shadow, "<this>");
        AbstractC5504s.h(aliases, "aliases");
        Result colorStyles = ColorStyleKt.toColorStyles(shadow.getColor(), aliases);
        if (colorStyles instanceof Result.Success) {
            return new Result.Success(new ShadowStyles((ColorStyles) ((Result.Success) colorStyles).getValue(), C5015h.n((float) shadow.getRadius()), C5015h.n((float) shadow.getX()), C5015h.n((float) shadow.getY()), null));
        }
        if (colorStyles instanceof Result.Error) {
            return colorStyles;
        }
        throw new r();
    }
}
