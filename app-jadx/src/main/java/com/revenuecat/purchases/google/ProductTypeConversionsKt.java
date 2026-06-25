package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, d2 = {"toGoogleProductType", "", "Lcom/revenuecat/purchases/ProductType;", "toRevenueCatProductType", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ProductTypeConversionsKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toGoogleProductType(ProductType productType) {
        AbstractC5504s.h(productType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i10 == 1) {
            return "inapp";
        }
        if (i10 != 2) {
            return null;
        }
        return "subs";
    }

    public static final ProductType toRevenueCatProductType(String str) {
        return AbstractC5504s.c(str, "inapp") ? ProductType.INAPP : AbstractC5504s.c(str, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
    }
}
