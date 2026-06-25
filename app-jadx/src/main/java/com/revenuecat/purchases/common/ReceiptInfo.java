package com.revenuecat.purchases.common;

import Td.InterfaceC2154e;
import Tf.e;
import Ud.AbstractC2279u;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.C2324e;
import Vf.C2350t;
import Vf.M;
import Vf.Q;
import Vf.t0;
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.ReplacementModeSerializer;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PeriodSerializer;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.PricingPhaseSerializer;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0081\b\u0018\u0000 b2\u00020\u0001:\u0002cbB»\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aBË\u0001\b\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u001c\u0010\u0014\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0019\u0010 J(\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$HÁ\u0001¢\u0006\u0004\b'\u0010(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010+J\u0012\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b8\u00109J$\u0010:\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u0002HÆ\u0003¢\u0006\u0004\b:\u0010+J\u0010\u0010;\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u00103J\u0012\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b>\u00103JÆ\u0001\u0010?\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bA\u00103J\u0010\u0010B\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\u00152\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bH\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010K\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010Q\u001a\u0004\bR\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bS\u00103R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010T\u0012\u0004\bV\u0010N\u001a\u0004\bU\u00106R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bW\u0010+R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010X\u0012\u0004\bZ\u0010N\u001a\u0004\bY\u00109R+\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\b[\u0010+R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\b^\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010Q\u001a\u0004\b_\u00103R\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u0012\n\u0004\b\u001d\u0010Q\u0012\u0004\ba\u0010N\u001a\u0004\b`\u00103¨\u0006d"}, d2 = {"Lcom/revenuecat/purchases/common/ReceiptInfo;", "", "", "", "productIDs", "", "purchaseTime", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "", com.amazon.a.a.o.b.f34666x, "formattedPrice", com.amazon.a.a.o.b.f34634a, "Lcom/revenuecat/purchases/models/Period;", "period", "Lcom/revenuecat/purchases/models/PricingPhase;", "pricingPhases", "Lcom/revenuecat/purchases/ReplacementMode;", "replacementMode", "", "platformProductIds", "", "sdkOriginated", "storeUserID", com.amazon.a.a.o.b.f34655m, "<init>", "(Ljava/util/List;Ljava/lang/Long;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/ReplacementMode;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen1", "duration", "LVf/t0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Long;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/ReplacementMode;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/ReceiptInfo;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Long;", "component3", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "component4", "()Ljava/lang/Double;", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/revenuecat/purchases/models/Period;", "component8", "component9", "()Lcom/revenuecat/purchases/ReplacementMode;", "component10", "component11", "()Z", "component12", "component13", "copy", "(Ljava/util/List;Ljava/lang/Long;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/ReplacementMode;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/ReceiptInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProductIDs", "Ljava/lang/Long;", "getPurchaseTime", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getPresentedOfferingContext$annotations", "()V", "Ljava/lang/Double;", "getPrice", "Ljava/lang/String;", "getFormattedPrice", "getCurrency", "Lcom/revenuecat/purchases/models/Period;", "getPeriod", "getPeriod$annotations", "getPricingPhases", "Lcom/revenuecat/purchases/ReplacementMode;", "getReplacementMode", "getReplacementMode$annotations", "getPlatformProductIds", "Z", "getSdkOriginated", "getStoreUserID", "getMarketplace", "getDuration", "getDuration$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ReceiptInfo {
    private static final Rf.b[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String currency;
    private final String duration;
    private final String formattedPrice;
    private final String marketplace;
    private final Period period;
    private final List<Map<String, String>> platformProductIds;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Double price;
    private final List<PricingPhase> pricingPhases;
    private final List<String> productIDs;
    private final Long purchaseTime;
    private final ReplacementMode replacementMode;
    private final boolean sdkOriginated;
    private final String storeUserID;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/ReceiptInfo$Companion;", "", "<init>", "()V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptionsForProductIDs", "", "sdkOriginated", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "from", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/ReceiptInfo;", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ReceiptInfo from$default(Companion companion, StoreTransaction storeTransaction, StoreProduct storeProduct, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            return companion.from(storeTransaction, storeProduct, map, z10);
        }

        public final ReceiptInfo from(StoreTransaction storeTransaction, StoreProduct storeProduct, Map<String, ? extends SubscriptionOption> subscriptionOptionsForProductIDs, boolean sdkOriginated) {
            SubscriptionOption subscriptionOption;
            PlatformProductId platformProductId;
            Price price;
            Price price2;
            Price price3;
            SubscriptionOption subscriptionOption2;
            PlatformProductId platformProductId2;
            Map<String, String> asMap;
            SubscriptionOptions subscriptionOptions;
            SubscriptionOption next;
            AbstractC5504s.h(storeTransaction, "storeTransaction");
            if (storeProduct == null || (subscriptionOptions = storeProduct.getSubscriptionOptions()) == null) {
                subscriptionOption = null;
            } else {
                Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC5504s.c(next.get$id(), storeTransaction.getSubscriptionOptionId())) {
                        break;
                    }
                }
                subscriptionOption = next;
            }
            if (subscriptionOption == null || (platformProductId = ReceiptInfoKt.platformProductId(subscriptionOption)) == null) {
                platformProductId = storeProduct != null ? ReceiptInfoKt.platformProductId(storeProduct) : null;
            }
            List<String> productIds = storeTransaction.getProductIds();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(productIds, 10));
            for (String str : productIds) {
                arrayList.add(AbstractC5504s.c(str, platformProductId != null ? platformProductId.getProductId() : null) ? platformProductId.getAsMap() : (subscriptionOptionsForProductIDs == null || (subscriptionOption2 = subscriptionOptionsForProductIDs.get(str)) == null || (platformProductId2 = ReceiptInfoKt.platformProductId(subscriptionOption2)) == null || (asMap = platformProductId2.getAsMap()) == null) ? new PlatformProductId(str).getAsMap() : asMap);
            }
            return new ReceiptInfo(storeTransaction.getProductIds(), Long.valueOf(storeTransaction.getPurchaseTime()), storeTransaction.getPresentedOfferingContext(), (storeProduct == null || (price3 = storeProduct.getPrice()) == null) ? null : Double.valueOf(price3.getAmountMicros() / 1000000.0d), (storeProduct == null || (price2 = storeProduct.getPrice()) == null) ? null : price2.getFormatted(), (storeProduct == null || (price = storeProduct.getPrice()) == null) ? null : price.getCurrencyCode(), storeProduct != null ? storeProduct.getPeriod() : null, subscriptionOption != null ? subscriptionOption.getPricingPhases() : null, storeTransaction.getReplacementMode(), arrayList, sdkOriginated, storeTransaction.getStoreUserID(), storeTransaction.getMarketplace());
        }

        public final Rf.b serializer() {
            return ReceiptInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        x0 x0Var = x0.f20253a;
        $childSerializers = new Rf.b[]{new C2324e(x0Var), null, null, null, null, null, null, new C2324e(PricingPhaseSerializer.INSTANCE), null, new C2324e(new M(x0Var, Sf.a.p(x0Var))), null, null, null, null};
    }

    @InterfaceC2154e
    public /* synthetic */ ReceiptInfo(int i10, List list, Long l10, PresentedOfferingContext presentedOfferingContext, Double d10, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z10, String str3, String str4, String str5, t0 t0Var) {
        String iso8601;
        if (1 != (i10 & 1)) {
            AbstractC2327f0.a(i10, 1, ReceiptInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.productIDs = list;
        String str6 = null;
        if ((i10 & 2) == 0) {
            this.purchaseTime = null;
        } else {
            this.purchaseTime = l10;
        }
        if ((i10 & 4) == 0) {
            this.presentedOfferingContext = null;
        } else {
            this.presentedOfferingContext = presentedOfferingContext;
        }
        if ((i10 & 8) == 0) {
            this.price = null;
        } else {
            this.price = d10;
        }
        if ((i10 & 16) == 0) {
            this.formattedPrice = null;
        } else {
            this.formattedPrice = str;
        }
        if ((i10 & 32) == 0) {
            this.currency = null;
        } else {
            this.currency = str2;
        }
        if ((i10 & 64) == 0) {
            this.period = null;
        } else {
            this.period = period;
        }
        if ((i10 & 128) == 0) {
            this.pricingPhases = null;
        } else {
            this.pricingPhases = list2;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.replacementMode = null;
        } else {
            this.replacementMode = replacementMode;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.platformProductIds = AbstractC2279u.m();
        } else {
            this.platformProductIds = list3;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.sdkOriginated = false;
        } else {
            this.sdkOriginated = z10;
        }
        if ((i10 & 2048) == 0) {
            this.storeUserID = null;
        } else {
            this.storeUserID = str3;
        }
        if ((i10 & 4096) == 0) {
            this.marketplace = null;
        } else {
            this.marketplace = str4;
        }
        if ((i10 & 8192) != 0) {
            this.duration = str5;
            return;
        }
        Period period2 = this.period;
        if (period2 != null && (iso8601 = period2.getIso8601()) != null && iso8601.length() != 0) {
            str6 = iso8601;
        }
        this.duration = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReceiptInfo copy$default(ReceiptInfo receiptInfo, List list, Long l10, PresentedOfferingContext presentedOfferingContext, Double d10, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z10, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = receiptInfo.productIDs;
        }
        return receiptInfo.copy(list, (i10 & 2) != 0 ? receiptInfo.purchaseTime : l10, (i10 & 4) != 0 ? receiptInfo.presentedOfferingContext : presentedOfferingContext, (i10 & 8) != 0 ? receiptInfo.price : d10, (i10 & 16) != 0 ? receiptInfo.formattedPrice : str, (i10 & 32) != 0 ? receiptInfo.currency : str2, (i10 & 64) != 0 ? receiptInfo.period : period, (i10 & 128) != 0 ? receiptInfo.pricingPhases : list2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? receiptInfo.replacementMode : replacementMode, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? receiptInfo.platformProductIds : list3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? receiptInfo.sdkOriginated : z10, (i10 & 2048) != 0 ? receiptInfo.storeUserID : str3, (i10 & 4096) != 0 ? receiptInfo.marketplace : str4);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ReceiptInfo self, d output, e serialDesc) {
        String iso8601;
        Rf.b[] bVarArr = $childSerializers;
        output.m(serialDesc, 0, bVarArr[0], self.productIDs);
        if (output.g(serialDesc, 1) || self.purchaseTime != null) {
            output.f(serialDesc, 1, Q.f20164a, self.purchaseTime);
        }
        if (output.g(serialDesc, 2) || self.presentedOfferingContext != null) {
            output.f(serialDesc, 2, PresentedOfferingContextSerializer.INSTANCE, self.presentedOfferingContext);
        }
        if (output.g(serialDesc, 3) || self.price != null) {
            output.f(serialDesc, 3, C2350t.f20233a, self.price);
        }
        if (output.g(serialDesc, 4) || self.formattedPrice != null) {
            output.f(serialDesc, 4, x0.f20253a, self.formattedPrice);
        }
        if (output.g(serialDesc, 5) || self.currency != null) {
            output.f(serialDesc, 5, x0.f20253a, self.currency);
        }
        if (output.g(serialDesc, 6) || self.period != null) {
            output.f(serialDesc, 6, PeriodSerializer.INSTANCE, self.period);
        }
        if (output.g(serialDesc, 7) || self.pricingPhases != null) {
            output.f(serialDesc, 7, bVarArr[7], self.pricingPhases);
        }
        if (output.g(serialDesc, 8) || self.replacementMode != null) {
            output.f(serialDesc, 8, ReplacementModeSerializer.INSTANCE, self.replacementMode);
        }
        if (output.g(serialDesc, 9) || !AbstractC5504s.c(self.platformProductIds, AbstractC2279u.m())) {
            output.m(serialDesc, 9, bVarArr[9], self.platformProductIds);
        }
        if (output.g(serialDesc, 10) || self.sdkOriginated) {
            output.B(serialDesc, 10, self.sdkOriginated);
        }
        if (output.g(serialDesc, 11) || self.storeUserID != null) {
            output.f(serialDesc, 11, x0.f20253a, self.storeUserID);
        }
        if (output.g(serialDesc, 12) || self.marketplace != null) {
            output.f(serialDesc, 12, x0.f20253a, self.marketplace);
        }
        if (!output.g(serialDesc, 13)) {
            String str = self.duration;
            Period period = self.period;
            String str2 = null;
            if (period != null && (iso8601 = period.getIso8601()) != null && iso8601.length() != 0) {
                str2 = iso8601;
            }
            if (AbstractC5504s.c(str, str2)) {
                return;
            }
        }
        output.f(serialDesc, 13, x0.f20253a, self.duration);
    }

    public final List<String> component1() {
        return this.productIDs;
    }

    public final List<Map<String, String>> component10() {
        return this.platformProductIds;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getSdkOriginated() {
        return this.sdkOriginated;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStoreUserID() {
        return this.storeUserID;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMarketplace() {
        return this.marketplace;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    public final List<PricingPhase> component8() {
        return this.pricingPhases;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final ReceiptInfo copy(List<String> productIDs, Long purchaseTime, PresentedOfferingContext presentedOfferingContext, Double d10, String formattedPrice, String str, Period period, List<PricingPhase> pricingPhases, ReplacementMode replacementMode, List<? extends Map<String, String>> platformProductIds, boolean sdkOriginated, String storeUserID, String str2) {
        AbstractC5504s.h(productIDs, "productIDs");
        AbstractC5504s.h(platformProductIds, "platformProductIds");
        return new ReceiptInfo(productIDs, purchaseTime, presentedOfferingContext, d10, formattedPrice, str, period, pricingPhases, replacementMode, platformProductIds, sdkOriginated, storeUserID, str2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptInfo)) {
            return false;
        }
        ReceiptInfo receiptInfo = (ReceiptInfo) other;
        return AbstractC5504s.c(this.productIDs, receiptInfo.productIDs) && AbstractC5504s.c(this.purchaseTime, receiptInfo.purchaseTime) && AbstractC5504s.c(this.presentedOfferingContext, receiptInfo.presentedOfferingContext) && AbstractC5504s.c(this.price, receiptInfo.price) && AbstractC5504s.c(this.formattedPrice, receiptInfo.formattedPrice) && AbstractC5504s.c(this.currency, receiptInfo.currency) && AbstractC5504s.c(this.period, receiptInfo.period) && AbstractC5504s.c(this.pricingPhases, receiptInfo.pricingPhases) && AbstractC5504s.c(this.replacementMode, receiptInfo.replacementMode) && AbstractC5504s.c(this.platformProductIds, receiptInfo.platformProductIds) && this.sdkOriginated == receiptInfo.sdkOriginated && AbstractC5504s.c(this.storeUserID, receiptInfo.storeUserID) && AbstractC5504s.c(this.marketplace, receiptInfo.marketplace);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final Period getPeriod() {
        return this.period;
    }

    public final List<Map<String, String>> getPlatformProductIds() {
        return this.platformProductIds;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final List<String> getProductIDs() {
        return this.productIDs;
    }

    public final Long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final boolean getSdkOriginated() {
        return this.sdkOriginated;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public int hashCode() {
        int iHashCode = this.productIDs.hashCode() * 31;
        Long l10 = this.purchaseTime;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode3 = (iHashCode2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        Double d10 = this.price;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str = this.formattedPrice;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Period period = this.period;
        int iHashCode7 = (iHashCode6 + (period == null ? 0 : period.hashCode())) * 31;
        List<PricingPhase> list = this.pricingPhases;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        ReplacementMode replacementMode = this.replacementMode;
        int iHashCode9 = (((((iHashCode8 + (replacementMode == null ? 0 : replacementMode.hashCode())) * 31) + this.platformProductIds.hashCode()) * 31) + Boolean.hashCode(this.sdkOriginated)) * 31;
        String str3 = this.storeUserID;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketplace;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ReceiptInfo(productIDs=" + this.productIDs + ", purchaseTime=" + this.purchaseTime + ", presentedOfferingContext=" + this.presentedOfferingContext + ", price=" + this.price + ", formattedPrice=" + this.formattedPrice + ", currency=" + this.currency + ", period=" + this.period + ", pricingPhases=" + this.pricingPhases + ", replacementMode=" + this.replacementMode + ", platformProductIds=" + this.platformProductIds + ", sdkOriginated=" + this.sdkOriginated + ", storeUserID=" + this.storeUserID + ", marketplace=" + this.marketplace + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiptInfo(List<String> productIDs, Long l10, PresentedOfferingContext presentedOfferingContext, Double d10, String str, String str2, Period period, List<PricingPhase> list, ReplacementMode replacementMode, List<? extends Map<String, String>> platformProductIds, boolean z10, String str3, String str4) {
        String iso8601;
        AbstractC5504s.h(productIDs, "productIDs");
        AbstractC5504s.h(platformProductIds, "platformProductIds");
        this.productIDs = productIDs;
        this.purchaseTime = l10;
        this.presentedOfferingContext = presentedOfferingContext;
        this.price = d10;
        this.formattedPrice = str;
        this.currency = str2;
        this.period = period;
        this.pricingPhases = list;
        this.replacementMode = replacementMode;
        this.platformProductIds = platformProductIds;
        this.sdkOriginated = z10;
        this.storeUserID = str3;
        this.marketplace = str4;
        String str5 = null;
        if (period != null && (iso8601 = period.getIso8601()) != null && iso8601.length() != 0) {
            str5 = iso8601;
        }
        this.duration = str5;
    }

    public static /* synthetic */ void getDuration$annotations() {
    }

    public static /* synthetic */ void getPeriod$annotations() {
    }

    public static /* synthetic */ void getPresentedOfferingContext$annotations() {
    }

    public static /* synthetic */ void getReplacementMode$annotations() {
    }

    public /* synthetic */ ReceiptInfo(List list, Long l10, PresentedOfferingContext presentedOfferingContext, Double d10, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z10, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : presentedOfferingContext, (i10 & 8) != 0 ? null : d10, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : period, (i10 & 128) != 0 ? null : list2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : replacementMode, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? AbstractC2279u.m() : list3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? false : z10, (i10 & 2048) != 0 ? null : str3, (i10 & 4096) != 0 ? null : str4);
    }
}
