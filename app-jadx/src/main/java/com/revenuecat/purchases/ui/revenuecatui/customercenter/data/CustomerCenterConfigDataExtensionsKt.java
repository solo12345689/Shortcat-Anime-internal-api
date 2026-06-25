package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.PaywallColor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "", "isDark", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "Lcom/revenuecat/purchases/customercenter/RCColor;", "selector", "Ls0/r0;", "getColorForTheme", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;ZLkotlin/jvm/functions/Function1;)Ls0/r0;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class CustomerCenterConfigDataExtensionsKt {
    public static final /* synthetic */ C6385r0 getColorForTheme(CustomerCenterConfigData.Appearance appearance, boolean z10, Function1 selector) {
        PaywallColor paywallColor;
        AbstractC5504s.h(appearance, "<this>");
        AbstractC5504s.h(selector, "selector");
        CustomerCenterConfigData.Appearance.ColorInformation dark = z10 ? appearance.getDark() : appearance.getLight();
        if (dark == null || (paywallColor = (PaywallColor) selector.invoke(dark)) == null) {
            return null;
        }
        return C6385r0.m(AbstractC6387s0.b(paywallColor.getColorInt()));
    }
}
