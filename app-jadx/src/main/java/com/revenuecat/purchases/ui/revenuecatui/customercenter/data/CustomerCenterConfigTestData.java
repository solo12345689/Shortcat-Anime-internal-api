package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.net.Uri;
import com.amazon.a.a.o.b;
import com.facebook.imageutils.JfifUtil;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.TestStoreProduct;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.ExpirationOrRenewal;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PriceDetails;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;", "", "()V", "fiveVirtualCurrencies", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getFiveVirtualCurrencies", "()Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "fourVirtualCurrencies", "getFourVirtualCurrencies", "purchaseInformationFreeTrial", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "getPurchaseInformationFreeTrial", "()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "purchaseInformationLifetime", "getPurchaseInformationLifetime", "purchaseInformationMonthlyRenewing", "getPurchaseInformationMonthlyRenewing", "purchaseInformationPromotional", "getPurchaseInformationPromotional", "purchaseInformationYearlyExpired", "getPurchaseInformationYearlyExpired", "purchaseInformationYearlyExpiring", "getPurchaseInformationYearlyExpiring", "standardAppearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "getStandardAppearance", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "customerCenterData", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "shouldWarnCustomerToUpdate", "", "allowSupportTicketCreation", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterConfigTestData {
    public static final int $stable;
    private static final VirtualCurrencies fiveVirtualCurrencies;
    private static final VirtualCurrencies fourVirtualCurrencies;
    private static final PurchaseInformation purchaseInformationFreeTrial;
    private static final PurchaseInformation purchaseInformationLifetime;
    private static final PurchaseInformation purchaseInformationMonthlyRenewing;
    private static final PurchaseInformation purchaseInformationPromotional;
    private static final PurchaseInformation purchaseInformationYearlyExpired;
    private static final PurchaseInformation purchaseInformationYearlyExpiring;
    public static final CustomerCenterConfigTestData INSTANCE = new CustomerCenterConfigTestData();
    private static final CustomerCenterConfigData.Appearance standardAppearance = new CustomerCenterConfigData.Appearance(new CustomerCenterConfigData.Appearance.ColorInformation(new PaywallColor("#007AFF"), new PaywallColor("#000000"), new PaywallColor("#f5f5f7"), new PaywallColor("#7A0000"), new PaywallColor("#287aff")), new CustomerCenterConfigData.Appearance.ColorInformation(new PaywallColor("#FFFFFF"), new PaywallColor("#FFFFFF"), new PaywallColor("#A96800"), new PaywallColor("#FF2600"), new PaywallColor("#000000")));

    static {
        PriceDetails.Paid paid = new PriceDetails.Paid("$4.99");
        ExpirationOrRenewal.Renewal renewal = new ExpirationOrRenewal.Renewal("June 1st, 2024");
        Store store = Store.PLAY_STORE;
        purchaseInformationMonthlyRenewing = new PurchaseInformation("Basic", paid, renewal, new TestStoreProduct("monthly_product_id", "Basic", b.f34626S, b.f34645c, new Price("$4.99", 4990000L, "US"), new Period(1, Period.Unit.MONTH, "P1M"), null, null, JfifUtil.MARKER_SOFn, null), store, true, Uri.parse("https://play.google.com/store/account/subscriptions"), false, false, false, false);
        PriceDetails.Paid paid2 = new PriceDetails.Paid("$40.99");
        ExpirationOrRenewal.Expiration expiration = new ExpirationOrRenewal.Expiration("June 1st, 2024");
        Uri uri = Uri.parse("https://play.google.com/store/account/subscriptions");
        Price price = new Price("$40.99", 40990000L, "US");
        Period.Unit unit = Period.Unit.YEAR;
        purchaseInformationYearlyExpiring = new PurchaseInformation("Basic", paid2, expiration, new TestStoreProduct("yearly_product_id", "Basic", b.f34626S, b.f34645c, price, new Period(1, unit, "P1Y"), null, null, JfifUtil.MARKER_SOFn, null), store, true, uri, false, false, true, false);
        purchaseInformationYearlyExpired = new PurchaseInformation("Basic", new PriceDetails.Paid("$40.99"), new ExpirationOrRenewal.Expiration("June 1st, 2024"), new TestStoreProduct("yearly_product_id", "Basic", b.f34626S, b.f34645c, new Price("$40.99", 40990000L, "US"), new Period(1, unit, "P1Y"), null, null, JfifUtil.MARKER_SOFn, null), store, true, Uri.parse("https://play.google.com/store/account/subscriptions"), true, false, true, false);
        purchaseInformationLifetime = new PurchaseInformation("Lifetime", new PriceDetails.Paid("$100.99"), null, null, Store.APP_STORE, false, Uri.parse("https://play.google.com/store/account/subscriptions"), false, false, false, true);
        PriceDetails.Free free = PriceDetails.Free.INSTANCE;
        purchaseInformationFreeTrial = new PurchaseInformation("Premium", free, new ExpirationOrRenewal.Expiration("June 15th, 2024"), new TestStoreProduct("premium_yearly_product_id", "Premium", b.f34626S, b.f34645c, new Price("$59.99", 59990000L, "US"), new Period(1, unit, "P1Y"), null, null, JfifUtil.MARKER_SOFn, null), store, true, Uri.parse("https://play.google.com/store/account/subscriptions"), false, true, false, false);
        purchaseInformationPromotional = new PurchaseInformation("rc_promo_Test1_lifetime", free, new ExpirationOrRenewal.Expiration("April 24th, 2225"), null, Store.PROMOTIONAL, false, null, false, false, true, false);
        fourVirtualCurrencies = new VirtualCurrencies(S.l(z.a("GLD", new VirtualCurrency(100, "Gold", "GLD", "It's gold")), z.a("SLV", new VirtualCurrency(200, "Silver", "SLV", "It's silver")), z.a("BRNZ", new VirtualCurrency(300, "Bronze", "BRNZ", "It's bronze")), z.a("PLTNM", new VirtualCurrency(400, "Platinum", "PLTNM", "It's platinum"))));
        fiveVirtualCurrencies = new VirtualCurrencies(S.l(z.a("GLD", new VirtualCurrency(100, "Gold", "GLD", "It's gold")), z.a("SLV", new VirtualCurrency(200, "Silver", "SLV", "It's silver")), z.a("BRNZ", new VirtualCurrency(300, "Bronze", "BRNZ", "It's bronze")), z.a("PLTNM", new VirtualCurrency(400, "Platinum", "PLTNM", "It's platinum")), z.a("RC_COIN", new VirtualCurrency(1, "RC Coin", "RC_COIN", "RevenueCat Coin"))));
        $stable = 8;
    }

    private CustomerCenterConfigTestData() {
    }

    public static /* synthetic */ CustomerCenterConfigData customerCenterData$default(CustomerCenterConfigTestData customerCenterConfigTestData, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return customerCenterConfigTestData.customerCenterData(z10, z11);
    }

    public final CustomerCenterConfigData customerCenterData(boolean shouldWarnCustomerToUpdate, boolean allowSupportTicketCreation) {
        CustomerCenterConfigData.Screen.ScreenType screenType = CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT;
        CustomerCenterConfigData.HelpPath.PathType pathType = CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE;
        Pair pairA = z.a(screenType, new CustomerCenterConfigData.Screen(screenType, "Manage Subscription", (String) null, AbstractC2279u.p(new CustomerCenterConfigData.HelpPath("1", "Check for previous purchases", pathType, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (DefaultConstructorMarker) null), new CustomerCenterConfigData.HelpPath("2", "Request a refund", CustomerCenterConfigData.HelpPath.PathType.REFUND_REQUEST, new CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer("offer_id", true, "Wait a minute...", "Before you cancel, please consider accepting this one time offer", S.f(z.a("monthly", "offer_id"))), (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 240, (DefaultConstructorMarker) null), new CustomerCenterConfigData.HelpPath("3", "Change plans", CustomerCenterConfigData.HelpPath.PathType.CHANGE_PLANS, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (DefaultConstructorMarker) null), new CustomerCenterConfigData.HelpPath("4", "Cancel subscription", CustomerCenterConfigData.HelpPath.PathType.CANCEL, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey("Why are you cancelling?", AbstractC2279u.p(new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option("1", "Too expensive", new CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer("offer_id", true, "Wait a minute...", "Before you cancel, please consider accepting this offer", S.f(z.a("monthly", "offer_id")))), new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option("2", "Don't use the app", (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, 4, (DefaultConstructorMarker) null), new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option("3", "Bought by mistake", (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, 4, (DefaultConstructorMarker) null))), (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 232, (DefaultConstructorMarker) null), new CustomerCenterConfigData.HelpPath("5", "FAQ", CustomerCenterConfigData.HelpPath.PathType.CUSTOM_URL, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, "https://www.revenuecat.com/docs/customer-center-faq", (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, JfifUtil.MARKER_SOI, (DefaultConstructorMarker) null)), (CustomerCenterConfigData.ScreenOffering) null, 16, (DefaultConstructorMarker) null));
        CustomerCenterConfigData.Screen.ScreenType screenType2 = CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE;
        return new CustomerCenterConfigData(S.l(pairA, z.a(screenType2, new CustomerCenterConfigData.Screen(screenType2, "No subscriptions found", "We can try checking your account for any previous purchases", AbstractC2279u.e(new CustomerCenterConfigData.HelpPath("9q9719171o", "Check for previous purchases", pathType, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (DefaultConstructorMarker) null)), (CustomerCenterConfigData.ScreenOffering) null, 16, (DefaultConstructorMarker) null))), standardAppearance, new CustomerCenterConfigData.Localization("en_US", S.l(z.a("cancel", "Cancel"), z.a("back", "Back"))), new CustomerCenterConfigData.Support("test-support@revenuecat.com", Boolean.valueOf(shouldWarnCustomerToUpdate), (Boolean) null, new CustomerCenterConfigData.Support.SupportTickets(allowSupportTicketCreation, new CustomerCenterConfigData.Support.SupportTickets.CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false), CustomerCenterConfigData.Support.SupportTickets.CustomerType.NOT_ACTIVE), 4, (DefaultConstructorMarker) null), (String) null, 16, (DefaultConstructorMarker) null);
    }

    public final VirtualCurrencies getFiveVirtualCurrencies() {
        return fiveVirtualCurrencies;
    }

    public final VirtualCurrencies getFourVirtualCurrencies() {
        return fourVirtualCurrencies;
    }

    public final PurchaseInformation getPurchaseInformationFreeTrial() {
        return purchaseInformationFreeTrial;
    }

    public final PurchaseInformation getPurchaseInformationLifetime() {
        return purchaseInformationLifetime;
    }

    public final PurchaseInformation getPurchaseInformationMonthlyRenewing() {
        return purchaseInformationMonthlyRenewing;
    }

    public final PurchaseInformation getPurchaseInformationPromotional() {
        return purchaseInformationPromotional;
    }

    public final PurchaseInformation getPurchaseInformationYearlyExpired() {
        return purchaseInformationYearlyExpired;
    }

    public final PurchaseInformation getPurchaseInformationYearlyExpiring() {
        return purchaseInformationYearlyExpiring;
    }

    public final CustomerCenterConfigData.Appearance getStandardAppearance() {
        return standardAppearance;
    }
}
