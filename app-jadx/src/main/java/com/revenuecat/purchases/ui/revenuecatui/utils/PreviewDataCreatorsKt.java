package com.revenuecat.purchases.ui.revenuecatui.utils;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.models.InstallmentsInfo;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\u000b\u001aJ\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¨\u0006\u0017"}, d2 = {"previewPricingPhase", "Lcom/revenuecat/purchases/models/PricingPhase;", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", "priceCurrencyCodeValue", "", com.amazon.a.a.o.b.f34666x, "", "recurrenceMode", "", "billingCycleCount", "(Lcom/revenuecat/purchases/models/Period;Ljava/lang/String;DILjava/lang/Integer;)Lcom/revenuecat/purchases/models/PricingPhase;", "previewSubscriptionOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", DiagnosticsEntry.ID_KEY, "productId", "duration", "pricingPhases", "", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "installmentsInfo", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class PreviewDataCreatorsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.utils.PreviewDataCreatorsKt$previewSubscriptionOption$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"com/revenuecat/purchases/ui/revenuecatui/utils/PreviewDataCreatorsKt$previewSubscriptionOption$1", "Lcom/revenuecat/purchases/models/SubscriptionOption;", DiagnosticsEntry.ID_KEY, "", "getId", "()Ljava/lang/String;", "installmentsInfo", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/InstallmentsInfo;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier", "pricingPhases", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "getPricingPhases", "()Ljava/util/List;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "tags", "getTags", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements SubscriptionOption {
        final /* synthetic */ String $id;
        final /* synthetic */ InstallmentsInfo $installmentsInfo;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ List<PricingPhase> $pricingPhases;
        final /* synthetic */ String $productId;

        AnonymousClass1(String str, List<PricingPhase> list, PresentedOfferingContext presentedOfferingContext, String str2, InstallmentsInfo installmentsInfo) {
            str = str;
            list = list;
            presentedOfferingContext = presentedOfferingContext;
            str = str2;
            installmentsInfo = installmentsInfo;
        }

        @Override // com.revenuecat.purchases.models.SubscriptionOption
        /* JADX INFO: renamed from: getId, reason: from getter */
        public String get$id() {
            return str;
        }

        @Override // com.revenuecat.purchases.models.SubscriptionOption
        /* JADX INFO: renamed from: getInstallmentsInfo, reason: from getter */
        public InstallmentsInfo get$installmentsInfo() {
            return installmentsInfo;
        }

        @Override // com.revenuecat.purchases.models.SubscriptionOption
        /* JADX INFO: renamed from: getPresentedOfferingContext, reason: from getter */
        public PresentedOfferingContext get$presentedOfferingContext() {
            return presentedOfferingContext;
        }

        @Override // com.revenuecat.purchases.models.SubscriptionOption
        public String getPresentedOfferingIdentifier() {
            PresentedOfferingContext presentedOfferingContext = presentedOfferingContext;
            if (presentedOfferingContext != null) {
                return presentedOfferingContext.getOfferingIdentifier();
            }
            return null;
        }

        @Override // com.revenuecat.purchases.models.SubscriptionOption
        public List<PricingPhase> getPricingPhases() {
            return list;
        }

        @Override // com.revenuecat.purchases.models.SubscriptionOption
        public PurchasingData getPurchasingData() {
            return new PreviewPurchasingData(str);
        }

        @Override // com.revenuecat.purchases.models.SubscriptionOption
        public List<String> getTags() {
            return AbstractC2279u.e("tag");
        }
    }

    public static final /* synthetic */ PricingPhase previewPricingPhase(Period billingPeriod, String priceCurrencyCodeValue, double d10, int i10, Integer num) {
        String string;
        AbstractC5504s.h(billingPeriod, "billingPeriod");
        AbstractC5504s.h(priceCurrencyCodeValue, "priceCurrencyCodeValue");
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(i10));
        if (d10 == 0.0d) {
            string = "Free";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('$');
            sb2.append(d10);
            string = sb2.toString();
        }
        return new PricingPhase(billingPeriod, recurrenceMode, num, new Price(string, (long) (d10 * ((double) 1000000)), priceCurrencyCodeValue));
    }

    public static /* synthetic */ PricingPhase previewPricingPhase$default(Period period, String str, double d10, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            period = new Period(1, Period.Unit.MONTH, "P1M");
        }
        if ((i11 & 2) != 0) {
            str = "USD";
        }
        if ((i11 & 4) != 0) {
            d10 = 4.99d;
        }
        if ((i11 & 8) != 0) {
            i10 = 1;
        }
        if ((i11 & 16) != 0) {
            num = null;
        }
        double d11 = d10;
        return previewPricingPhase(period, str, d11, i10, num);
    }

    public static final /* synthetic */ SubscriptionOption previewSubscriptionOption(String id2, String productId, Period duration, List pricingPhases, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(duration, "duration");
        AbstractC5504s.h(pricingPhases, "pricingPhases");
        return new SubscriptionOption() { // from class: com.revenuecat.purchases.ui.revenuecatui.utils.PreviewDataCreatorsKt.previewSubscriptionOption.1
            final /* synthetic */ String $id;
            final /* synthetic */ InstallmentsInfo $installmentsInfo;
            final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
            final /* synthetic */ List<PricingPhase> $pricingPhases;
            final /* synthetic */ String $productId;

            AnonymousClass1(String id22, List<PricingPhase> pricingPhases2, PresentedOfferingContext presentedOfferingContext2, String productId2, InstallmentsInfo installmentsInfo2) {
                str = id22;
                list = pricingPhases2;
                presentedOfferingContext = presentedOfferingContext2;
                str = productId2;
                installmentsInfo = installmentsInfo2;
            }

            @Override // com.revenuecat.purchases.models.SubscriptionOption
            /* JADX INFO: renamed from: getId, reason: from getter */
            public String get$id() {
                return str;
            }

            @Override // com.revenuecat.purchases.models.SubscriptionOption
            /* JADX INFO: renamed from: getInstallmentsInfo, reason: from getter */
            public InstallmentsInfo get$installmentsInfo() {
                return installmentsInfo;
            }

            @Override // com.revenuecat.purchases.models.SubscriptionOption
            /* JADX INFO: renamed from: getPresentedOfferingContext, reason: from getter */
            public PresentedOfferingContext get$presentedOfferingContext() {
                return presentedOfferingContext;
            }

            @Override // com.revenuecat.purchases.models.SubscriptionOption
            public String getPresentedOfferingIdentifier() {
                PresentedOfferingContext presentedOfferingContext2 = presentedOfferingContext;
                if (presentedOfferingContext2 != null) {
                    return presentedOfferingContext2.getOfferingIdentifier();
                }
                return null;
            }

            @Override // com.revenuecat.purchases.models.SubscriptionOption
            public List<PricingPhase> getPricingPhases() {
                return list;
            }

            @Override // com.revenuecat.purchases.models.SubscriptionOption
            public PurchasingData getPurchasingData() {
                return new PreviewPurchasingData(str);
            }

            @Override // com.revenuecat.purchases.models.SubscriptionOption
            public List<String> getTags() {
                return AbstractC2279u.e("tag");
            }
        };
    }

    public static /* synthetic */ SubscriptionOption previewSubscriptionOption$default(String str, String str2, Period period, List list, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            period = new Period(1, Period.Unit.MONTH, "P1M");
        }
        Period period2 = period;
        if ((i10 & 8) != 0) {
            list = AbstractC2279u.e(previewPricingPhase$default(period2, null, 0.0d, 0, null, 30, null));
        }
        return previewSubscriptionOption(str, str2, period2, list, (i10 & 16) != 0 ? null : presentedOfferingContext, (i10 & 32) != 0 ? null : installmentsInfo);
    }
}
