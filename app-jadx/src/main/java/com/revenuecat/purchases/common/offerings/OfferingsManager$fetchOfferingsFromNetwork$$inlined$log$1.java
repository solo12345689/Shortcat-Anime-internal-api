package com.revenuecat.purchases.common.offerings;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.strings.OfferingStrings;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ DiagnosticsTracker.CacheStatus $cacheStatus$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1(LogIntent logIntent, DiagnosticsTracker.CacheStatus cacheStatus) {
        super(0);
        this.$intent = logIntent;
        this.$cacheStatus$inlined = cacheStatus;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC2279u.w0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null));
        sb2.append(' ');
        int i10 = OfferingsManager.WhenMappings.$EnumSwitchMapping$0[this.$cacheStatus$inlined.ordinal()];
        if (i10 == 1) {
            str = OfferingStrings.FORCE_OFFERINGS_FETCHING_NETWORK;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unexpected cache status for fetch: " + this.$cacheStatus$inlined);
            }
            str = OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
