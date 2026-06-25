package com.revenuecat.purchases.subscriberattributes.caching;

import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SubscriberAttributesCache$subscriberAttributesCacheKey$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ SubscriberAttributesCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesCache$subscriberAttributesCacheKey$2(SubscriberAttributesCache subscriberAttributesCache) {
        super(0);
        this.this$0 = subscriberAttributesCache;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        return this.this$0.getDeviceCache().newKey$purchases_defaultsBc8Release("subscriberAttributes");
    }
}
