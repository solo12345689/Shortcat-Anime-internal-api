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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"template1", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;", "getTemplate1", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template1TestDataKt {
    public static final PaywallData getTemplate1(TestData testData) {
        AbstractC5504s.h(testData, "<this>");
        String id2 = PaywallTemplate.TEMPLATE_1.getId();
        PackageType packageType = PackageType.MONTHLY;
        String identifier = packageType.getIdentifier();
        AbstractC5504s.e(identifier);
        List listE = AbstractC2279u.e(identifier);
        String identifier2 = packageType.getIdentifier();
        AbstractC5504s.e(identifier2);
        TestData.Constants constants = TestData.Constants.INSTANCE;
        PaywallColor paywallColor = null;
        PaywallColor paywallColor2 = null;
        PaywallColor paywallColor3 = null;
        PaywallColor paywallColor4 = null;
        PaywallColor paywallColor5 = null;
        PaywallColor paywallColor6 = null;
        byte b10 = 0 == true ? 1 : 0;
        Map map = null;
        Map map2 = null;
        List list = null;
        boolean z10 = true;
        boolean z11 = true;
        URL url = null;
        PaywallData.Configuration configuration = new PaywallData.Configuration(listE, identifier2, constants.getImages(), map, new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), (PaywallColor) null, (PaywallColor) null, new PaywallColor("#5CD27A"), new PaywallColor("#FFFFFF"), (PaywallColor) null, new PaywallColor("#BC66FF"), (PaywallColor) null, paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5, paywallColor6, 32588, (DefaultConstructorMarker) null), new PaywallData.Configuration.Colors(new PaywallColor("#000000"), new PaywallColor("#FFFFFF"), (PaywallColor) b10, (PaywallColor) null, new PaywallColor("#ACD27A"), new PaywallColor("#000000"), (PaywallColor) null, new PaywallColor("#B022BB"), paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5, paywallColor6, (PaywallColor) null, 32588, (DefaultConstructorMarker) null)), map2, list, z10, z11, new URL("https://revenuecat.com/tos"), url, 1128, (DefaultConstructorMarker) null);
        byte b11 = 0 == true ? 1 : 0;
        byte b12 = 0 == true ? 1 : 0;
        byte b13 = 0 == true ? 1 : 0;
        byte b14 = 0 == true ? 1 : 0;
        return new PaywallData((String) null, id2, configuration, constants.getAssetBaseURL(), 0, S.f(z.a("en_US", new PaywallData.LocalizedConfiguration("Ignite your _child_'s curiosity", "Get access to **all our educational content** trusted by thousands of parents.", "Subscribe for _only_ {{ sub_price_per_month }}", "Purchase for _only_ {{ sub_price_per_month }} per month", (String) b13, "*Just* {{ sub_price_per_month }} per month", "Start your {{ sub_offer_duration }} trial, then {{ sub_price_per_month }} per month", (String) null, (String) null, (List) b14, (String) null, (Map) b12, 3984, (DefaultConstructorMarker) b11))), (Map) null, (List) constants.getZeroDecimalPlaceCountries(), (String) (0 == true ? 1 : 0), 337, (DefaultConstructorMarker) null);
    }
}
