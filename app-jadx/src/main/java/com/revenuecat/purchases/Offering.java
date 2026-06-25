package com.revenuecat.purchases;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001IB9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nB[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?H\u0007J\u0012\u0010@\u001a\u0004\u0018\u00010\t2\u0006\u0010A\u001a\u00020BH\u0002J\u0011\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u0003H\u0086\u0002J\u0016\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u0003J\u000e\u0010H\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u001a8G¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b!\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b&\u0010\u0014R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010*R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u001d\u0010/\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b0\u0010\u0014R\u001d\u00102\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b3\u0010\u0014R\u001d\u00105\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0016\u001a\u0004\b6\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001d\u0010:\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0016\u001a\u0004\b;\u0010\u0014¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/Offering;", "", "identifier", "", "serverDescription", "metadata", "", "availablePackages", "", "Lcom/revenuecat/purchases/Package;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "paywall", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "paywallComponents", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "webCheckoutURL", "Ljava/net/URL;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;Lcom/revenuecat/purchases/Offering$PaywallComponents;Ljava/net/URL;)V", "annual", "getAnnual", "()Lcom/revenuecat/purchases/Package;", "annual$delegate", "Lkotlin/Lazy;", "getAvailablePackages", "()Ljava/util/List;", "hasPaywall", "", "hasPaywall$annotations", "()V", "()Z", "getIdentifier", "()Ljava/lang/String;", "lifetime", "getLifetime", "lifetime$delegate", "getMetadata", "()Ljava/util/Map;", "monthly", "getMonthly", "monthly$delegate", "getPaywall$annotations", "getPaywall", "()Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywallComponents$annotations", "getPaywallComponents", "()Lcom/revenuecat/purchases/Offering$PaywallComponents;", "getServerDescription", "sixMonth", "getSixMonth", "sixMonth$delegate", "threeMonth", "getThreeMonth", "threeMonth$delegate", "twoMonth", "getTwoMonth", "twoMonth$delegate", "getWebCheckoutURL", "()Ljava/net/URL;", "weekly", "getWeekly", "weekly$delegate", "copy", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "findPackage", "packageType", "Lcom/revenuecat/purchases/PackageType;", com.amazon.a.a.o.b.au, "s", "getMetadataString", SubscriberAttributeKt.JSON_NAME_KEY, "default", "getPackage", "PaywallComponents", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Offering {

    /* JADX INFO: renamed from: annual$delegate, reason: from kotlin metadata */
    private final Lazy annual;
    private final List<Package> availablePackages;
    private final String identifier;

    /* JADX INFO: renamed from: lifetime$delegate, reason: from kotlin metadata */
    private final Lazy lifetime;
    private final Map<String, Object> metadata;

    /* JADX INFO: renamed from: monthly$delegate, reason: from kotlin metadata */
    private final Lazy monthly;
    private final PaywallData paywall;
    private final PaywallComponents paywallComponents;
    private final String serverDescription;

    /* JADX INFO: renamed from: sixMonth$delegate, reason: from kotlin metadata */
    private final Lazy sixMonth;

    /* JADX INFO: renamed from: threeMonth$delegate, reason: from kotlin metadata */
    private final Lazy threeMonth;

    /* JADX INFO: renamed from: twoMonth$delegate, reason: from kotlin metadata */
    private final Lazy twoMonth;
    private final URL webCheckoutURL;

    /* JADX INFO: renamed from: weekly$delegate, reason: from kotlin metadata */
    private final Lazy weekly;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/Offering$PaywallComponents;", "", "uiConfig", "Lcom/revenuecat/purchases/UiConfig;", "data", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "(Lcom/revenuecat/purchases/UiConfig;Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)V", "getData", "()Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "getUiConfig", "()Lcom/revenuecat/purchases/UiConfig;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PaywallComponents {
        private final PaywallComponentsData data;
        private final UiConfig uiConfig;

        public PaywallComponents(UiConfig uiConfig, PaywallComponentsData data) {
            AbstractC5504s.h(uiConfig, "uiConfig");
            AbstractC5504s.h(data, "data");
            this.uiConfig = uiConfig;
            this.data = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallComponents)) {
                return false;
            }
            PaywallComponents paywallComponents = (PaywallComponents) obj;
            return AbstractC5504s.c(this.uiConfig, paywallComponents.uiConfig) && AbstractC5504s.c(this.data, paywallComponents.data);
        }

        public final PaywallComponentsData getData() {
            return this.data;
        }

        public final UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public int hashCode() {
            return (this.uiConfig.hashCode() * 31) + this.data.hashCode();
        }

        public String toString() {
            return "PaywallComponents(uiConfig=" + this.uiConfig + ", data=" + this.data + ')';
        }
    }

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData, PaywallComponents paywallComponents, URL url) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(serverDescription, "serverDescription");
        AbstractC5504s.h(metadata, "metadata");
        AbstractC5504s.h(availablePackages, "availablePackages");
        this.identifier = identifier;
        this.serverDescription = serverDescription;
        this.metadata = metadata;
        this.availablePackages = availablePackages;
        this.paywall = paywallData;
        this.paywallComponents = paywallComponents;
        this.webCheckoutURL = url;
        this.lifetime = AbstractC2163n.b(new Offering$lifetime$2(this));
        this.annual = AbstractC2163n.b(new Offering$annual$2(this));
        this.sixMonth = AbstractC2163n.b(new Offering$sixMonth$2(this));
        this.threeMonth = AbstractC2163n.b(new Offering$threeMonth$2(this));
        this.twoMonth = AbstractC2163n.b(new Offering$twoMonth$2(this));
        this.monthly = AbstractC2163n.b(new Offering$monthly$2(this));
        this.weekly = AbstractC2163n.b(new Offering$weekly$2(this));
    }

    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5504s.c(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                break;
            }
        }
        return (Package) next;
    }

    public final Offering copy(PresentedOfferingContext presentedOfferingContext) {
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        String str = this.identifier;
        String str2 = this.serverDescription;
        Map<String, Object> map = this.metadata;
        List<Package> list = this.availablePackages;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).copy$purchases_defaultsBc8Release(presentedOfferingContext));
        }
        return new Offering(str, str2, map, arrayList, this.paywall, this.paywallComponents, this.webCheckoutURL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return AbstractC5504s.c(this.identifier, offering.identifier) && AbstractC5504s.c(this.serverDescription, offering.serverDescription) && AbstractC5504s.c(this.metadata, offering.metadata) && AbstractC5504s.c(this.availablePackages, offering.availablePackages) && AbstractC5504s.c(this.paywall, offering.paywall) && AbstractC5504s.c(this.paywallComponents, offering.paywallComponents) && AbstractC5504s.c(this.webCheckoutURL, offering.webCheckoutURL);
    }

    public final Package get(String s10) {
        AbstractC5504s.h(s10, "s");
        return getPackage(s10);
    }

    public final Package getAnnual() {
        return (Package) this.annual.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String str, String str2) {
        AbstractC5504s.h(str, "key");
        AbstractC5504s.h(str2, "default");
        Object obj = this.metadata.get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
    }

    public final Package getMonthly() {
        return (Package) this.monthly.getValue();
    }

    public final Package getPackage(String identifier) {
        AbstractC5504s.h(identifier, "identifier");
        for (Package r12 : this.availablePackages) {
            if (AbstractC5504s.c(r12.getIdentifier(), identifier)) {
                return r12;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final PaywallComponents getPaywallComponents() {
        return this.paywallComponents;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth.getValue();
    }

    public final URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public final Package getWeekly() {
        return (Package) this.weekly.getValue();
    }

    public final boolean hasPaywall() {
        return (this.paywall == null && this.paywallComponents == null) ? false : true;
    }

    public int hashCode() {
        int iHashCode = ((((((this.identifier.hashCode() * 31) + this.serverDescription.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.availablePackages.hashCode()) * 31;
        PaywallData paywallData = this.paywall;
        int iHashCode2 = (iHashCode + (paywallData == null ? 0 : paywallData.hashCode())) * 31;
        PaywallComponents paywallComponents = this.paywallComponents;
        int iHashCode3 = (iHashCode2 + (paywallComponents == null ? 0 : paywallComponents.hashCode())) * 31;
        URL url = this.webCheckoutURL;
        return iHashCode3 + (url != null ? url.hashCode() : 0);
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ", paywallComponents=" + this.paywallComponents + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }

    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, PaywallComponents paywallComponents, URL url, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, list, (i10 & 16) != 0 ? null : paywallData, (i10 & 32) != 0 ? null : paywallComponents, (i10 & 64) != 0 ? null : url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages) {
        this(identifier, serverDescription, metadata, availablePackages, null, null, null);
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(serverDescription, "serverDescription");
        AbstractC5504s.h(metadata, "metadata");
        AbstractC5504s.h(availablePackages, "availablePackages");
    }

    public static /* synthetic */ void getPaywall$annotations() {
    }

    public static /* synthetic */ void getPaywallComponents$annotations() {
    }

    public static /* synthetic */ void hasPaywall$annotations() {
    }
}
