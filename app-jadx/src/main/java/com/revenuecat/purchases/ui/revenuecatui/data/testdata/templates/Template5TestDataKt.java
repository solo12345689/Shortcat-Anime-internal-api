package com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"template5", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;", "getTemplate5", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template5TestDataKt {
    public static final PaywallData getTemplate5(TestData testData) {
        AbstractC5504s.h(testData, "<this>");
        String id2 = PaywallTemplate.TEMPLATE_5.getId();
        PackageType packageType = PackageType.ANNUAL;
        String identifier = packageType.getIdentifier();
        AbstractC5504s.e(identifier);
        String identifier2 = PackageType.MONTHLY.getIdentifier();
        AbstractC5504s.e(identifier2);
        List listP = AbstractC2279u.p(identifier, identifier2);
        String identifier3 = packageType.getIdentifier();
        AbstractC5504s.e(identifier3);
        Map map = null;
        Map map2 = null;
        List list = null;
        boolean z10 = false;
        boolean z11 = true;
        URL url = null;
        PaywallData.Configuration configuration = new PaywallData.Configuration(listP, identifier3, new PaywallData.Configuration.Images("954459_1692992845.png", (String) null, (String) null, 6, (DefaultConstructorMarker) null), map, new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#adf5c5"), new PaywallColor("#b15d5d"), new PaywallColor("#45c186"), new PaywallColor("#ffffff"), (PaywallColor) null, new PaywallColor("#b24010"), new PaywallColor("#027424"), new PaywallColor("#D1D1D1"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 31808, (DefaultConstructorMarker) null), (PaywallData.Configuration.Colors) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), map2, list, z10, z11, url, new URL("https://revenuecat.com/privacy"), 744, (DefaultConstructorMarker) null);
        byte b10 = 0 == true ? 1 : 0;
        String str = "Spice Up Your Kitchen - Go Pro for Exclusive Benefits!";
        String str2 = null;
        String str3 = "Continue";
        String str4 = "Start your Free Trial";
        String str5 = null;
        String str6 = "{{ total_price_and_per_month }}";
        String str7 = "Free for {{ sub_offer_duration }}, then {{ total_price_and_per_month }}";
        String str8 = null;
        String str9 = "{{ sub_period }}";
        String str10 = null;
        byte b11 = 0 == true ? 1 : 0;
        Map mapF = S.f(z.a("en_US", new PaywallData.LocalizedConfiguration(str, str2, str3, str4, str5, str6, str7, str8, str9, AbstractC2279u.p(new PaywallData.LocalizedConfiguration.Feature("Unique gourmet recipes", (String) b10, "tick", 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new PaywallData.LocalizedConfiguration.Feature("Advanced nutritional recipes", (String) null, "apple", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("Personalized support from our Chef", (String) null, "warning", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("Unlimited receipt collections", (String) null, "bookmark", 2, (DefaultConstructorMarker) (0 == true ? 1 : 0))), str10, (Map) b11, 3218, (DefaultConstructorMarker) null)));
        TestData.Constants constants = TestData.Constants.INSTANCE;
        return new PaywallData((String) null, id2, configuration, constants.getAssetBaseURL(), 0, mapF, (Map) null, constants.getZeroDecimalPlaceCountries(), str5, 337, (DefaultConstructorMarker) null);
    }
}
