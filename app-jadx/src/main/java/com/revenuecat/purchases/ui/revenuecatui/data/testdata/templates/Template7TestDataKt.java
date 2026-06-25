package com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"template7", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;", "getTemplate7", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template7TestDataKt {
    public static final PaywallData getTemplate7(TestData testData) {
        AbstractC5504s.h(testData, "<this>");
        List listM = AbstractC2279u.m();
        int i10 = 6;
        String str = null;
        String str2 = null;
        Map mapL = S.l(z.a("basic", new PaywallData.Configuration.Images("954459_1703109702.png", str, str2, i10, (DefaultConstructorMarker) null)), z.a("standard", new PaywallData.Configuration.Images("954459_1692992845.png", str, str2, i10, (DefaultConstructorMarker) (0 == true ? 1 : 0))), z.a("premium", new PaywallData.Configuration.Images("954459_1701267532.jpeg", (String) null, (String) (0 == true ? 1 : 0), 6, (DefaultConstructorMarker) null)));
        PackageType packageType = PackageType.ANNUAL;
        String identifier = packageType.getIdentifier();
        AbstractC5504s.e(identifier);
        String identifier2 = PackageType.MONTHLY.getIdentifier();
        AbstractC5504s.e(identifier2);
        List listP = AbstractC2279u.p(identifier, identifier2);
        String identifier3 = packageType.getIdentifier();
        AbstractC5504s.e(identifier3);
        PaywallData.Configuration.Tier tier = new PaywallData.Configuration.Tier("basic", listP, identifier3);
        String identifier4 = PackageType.TWO_MONTH.getIdentifier();
        AbstractC5504s.e(identifier4);
        PackageType packageType2 = PackageType.SIX_MONTH;
        String identifier5 = packageType2.getIdentifier();
        AbstractC5504s.e(identifier5);
        List listP2 = AbstractC2279u.p(identifier4, identifier5);
        String identifier6 = packageType2.getIdentifier();
        AbstractC5504s.e(identifier6);
        PaywallData.Configuration.Tier tier2 = new PaywallData.Configuration.Tier("standard", listP2, identifier6);
        PackageType packageType3 = PackageType.THREE_MONTH;
        String identifier7 = packageType3.getIdentifier();
        AbstractC5504s.e(identifier7);
        String identifier8 = PackageType.LIFETIME.getIdentifier();
        AbstractC5504s.e(identifier8);
        List listP3 = AbstractC2279u.p(identifier7, identifier8);
        String identifier9 = packageType3.getIdentifier();
        AbstractC5504s.e(identifier9);
        List listP4 = AbstractC2279u.p(tier, tier2, new PaywallData.Configuration.Tier("premium", listP3, identifier9));
        DefaultConstructorMarker defaultConstructorMarker = null;
        PaywallColor paywallColor = null;
        int i11 = 1088;
        String str3 = null;
        PaywallData.Configuration.Images images = null;
        PaywallData.Configuration.Images images2 = null;
        boolean z10 = false;
        boolean z11 = true;
        String str4 = null;
        PaywallData.Configuration configuration = new PaywallData.Configuration(listM, str3, images, images2, mapL, z10, z11, new URL("https://revenuecat.com/tos"), new URL("https://revenuecat.com/privacy"), new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), (PaywallColor) null, (PaywallColor) null, new PaywallColor("#45c186"), new PaywallColor("#ffffff"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, paywallColor, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32716, defaultConstructorMarker), (PaywallData.Configuration.Colors) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), S.l(z.a("basic", new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#ffffff"), new PaywallColor("#30A0F8AA"), new PaywallColor("#3fc1f7"), new PaywallColor("#ffffff"), (PaywallColor) (0 == true ? 1 : 0), new PaywallColor("#2d7fc1"), new PaywallColor("#7676801F"), new PaywallColor("#100031"), paywallColor, new PaywallColor("#eeeef0"), new PaywallColor("#000000"), new PaywallColor("#2d7fc1"), new PaywallColor("#000000"), i11, defaultConstructorMarker), (PaywallData.Configuration.Colors) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0))), z.a("standard", new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#ffffff"), new PaywallColor("#30A0F8AA"), new PaywallColor("#da4079"), new PaywallColor("#ffffff"), (PaywallColor) (0 == true ? 1 : 0), new PaywallColor("#cd0654"), new PaywallColor("#7676801F"), new PaywallColor("#310217"), paywallColor, new PaywallColor("#eeeef0"), new PaywallColor("#000000"), new PaywallColor("#cd0654"), new PaywallColor("#000000"), i11, defaultConstructorMarker), (PaywallData.Configuration.Colors) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0))), z.a("premium", new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#ffffff"), new PaywallColor("#30A0F8AA"), new PaywallColor("#94d269"), new PaywallColor("#ffffff"), (PaywallColor) (0 == true ? 1 : 0), new PaywallColor("#76c343"), new PaywallColor("#7676801F"), new PaywallColor("#213711"), paywallColor, new PaywallColor("#eeeef0"), new PaywallColor("#000000"), new PaywallColor("#76c343"), new PaywallColor("#000000"), i11, defaultConstructorMarker), (PaywallData.Configuration.Colors) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)))), listP4, str4, 4142, (DefaultConstructorMarker) null);
        TestData.Constants constants = TestData.Constants.INSTANCE;
        URL assetBaseURL = constants.getAssetBaseURL();
        String str5 = null;
        String str6 = "Get started with our Basic plan";
        String str7 = null;
        String str8 = "{{ price_per_period }}";
        String str9 = "Start your {{ sub_offer_duration }} free trial";
        String str10 = "{{ total_price_and_per_month }}";
        String str11 = "Free for {{ sub_offer_duration }}, then {{ total_price_and_per_month }}";
        String str12 = "{{ sub_period }}";
        String str13 = "Basic";
        Map map = null;
        byte b10 = 0 == true ? 1 : 0;
        Map mapF = S.f(z.a("en_US", new PaywallData.LocalizedConfiguration(str6, str7, str8, str9, str5, str10, str11, (String) b10, str12, AbstractC2279u.p(new PaywallData.LocalizedConfiguration.Feature("Access to 10 cinematic LUTs", (String) null, "tick", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("Standard fonts", (String) null, "tick", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("2 templates", str5, "tick", 2, (DefaultConstructorMarker) null)), str13, map, 2194, (DefaultConstructorMarker) null)));
        String str14 = null;
        List listP5 = AbstractC2279u.p(new PaywallData.LocalizedConfiguration.Feature("Access to 10 cinematic LUTs", str5, "tick", 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new PaywallData.LocalizedConfiguration.Feature("Standard fonts", (String) null, "tick", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("2 templates", str14, "tick", 2, (DefaultConstructorMarker) null));
        int i12 = 2194;
        byte b11 = 0 == true ? 1 : 0;
        byte b12 = 0 == true ? 1 : 0;
        Pair pairA = z.a("basic", new PaywallData.LocalizedConfiguration("Get started with our Basic plan", (String) null, "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", str14, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) (0 == true ? 1 : 0), "{{ sub_period }}", listP5, "Basic", (Map) b12, i12, (DefaultConstructorMarker) b11));
        String str15 = null;
        List listP6 = AbstractC2279u.p(new PaywallData.LocalizedConfiguration.Feature("Access to 30 cinematic LUTs", (String) null, "tick", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("Pro fonts and transition effects", (String) null, "tick", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("10+ templates", str15, "tick", 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
        byte b13 = 0 == true ? 1 : 0;
        byte b14 = 0 == true ? 1 : 0;
        Pair pairA2 = z.a("standard", new PaywallData.LocalizedConfiguration("Get started with our Standard plan", (String) null, "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", str15, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) (0 == true ? 1 : 0), "{{ sub_period }}", listP6, "Standard", (Map) b14, i12, (DefaultConstructorMarker) b13));
        String str16 = null;
        List listP7 = AbstractC2279u.p(new PaywallData.LocalizedConfiguration.Feature("Access to all 150 of our cinematic LUTs", (String) null, "tick", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("Custom design tools and transition effects", (String) null, "tick", 2, (DefaultConstructorMarker) null), new PaywallData.LocalizedConfiguration.Feature("100+ exclusive templates", str16, "tick", 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
        String str17 = null;
        byte b15 = 0 == true ? 1 : 0;
        byte b16 = 0 == true ? 1 : 0;
        return new PaywallData((String) null, "7", configuration, assetBaseURL, 0, mapF, S.f(z.a("en_US", S.l(pairA, pairA2, z.a("premium", new PaywallData.LocalizedConfiguration("Master the art of video editing", str17, "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", str16, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) (0 == true ? 1 : 0), "{{ sub_period }}", listP7, "Premium", (Map) b16, i12, (DefaultConstructorMarker) b15))))), constants.getZeroDecimalPlaceCountries(), str17, 273, (DefaultConstructorMarker) null);
    }
}
