package com.revenuecat.purchases.ui.revenuecatui;

import Ud.AbstractC2279u;
import com.facebook.imageutils.JfifUtil;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.TestStoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import java.util.List;
import kotlin.Metadata;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/LoadingPaywallConstants;", "", "<init>", "()V", "", "offeringIdentifier", "Ljava/lang/String;", "", "placeholderAlpha", "F", "Ls0/r0;", "placeholderColor", "J", "getPlaceholderColor-0d7_KjU", "()J", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "template", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "getTemplate", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "", "Lcom/revenuecat/purchases/Package;", "packages", "Ljava/util/List;", "getPackages", "()Ljava/util/List;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LoadingPaywallConstants {
    public static final float placeholderAlpha = 0.5f;
    public static final LoadingPaywallConstants INSTANCE = new LoadingPaywallConstants();
    private static final long placeholderColor = C6385r0.q(C6385r0.f58985b.e(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
    private static final PaywallTemplate template = PaywallTemplate.TEMPLATE_2;
    public static final String offeringIdentifier = "loading_offering";
    private static final List<Package> packages = AbstractC2279u.p(new Package("weekly", PackageType.WEEKLY, new TestStoreProduct("com.revenuecat.weekly", "Weekly", "Weekly (App name)", "Weekly", new Price("$1.99", 1990000, "USD"), new Period(1, Period.Unit.WEEK, "P1W"), null, null, JfifUtil.MARKER_SOFn, null), offeringIdentifier), new Package("monthly", PackageType.MONTHLY, new TestStoreProduct("com.revenuecat.monthly", "Monthly", "Monthly (App name)", "Monthly", new Price("$5.99", 5990000, "USD"), new Period(1, Period.Unit.MONTH, "P1M"), null, null, JfifUtil.MARKER_SOFn, null), offeringIdentifier), new Package("annual", PackageType.ANNUAL, new TestStoreProduct("com.revenuecat.annual", "Annual", "Annual (App name)", "Annual", new Price("$15.99", 5990000, "USD"), new Period(1, Period.Unit.YEAR, "P1Y"), null, null, JfifUtil.MARKER_SOFn, null), offeringIdentifier));

    private LoadingPaywallConstants() {
    }

    public final List<Package> getPackages() {
        return packages;
    }

    /* JADX INFO: renamed from: getPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m377getPlaceholderColor0d7_KjU() {
        return placeholderColor;
    }

    public final PaywallTemplate getTemplate() {
        return template;
    }
}
