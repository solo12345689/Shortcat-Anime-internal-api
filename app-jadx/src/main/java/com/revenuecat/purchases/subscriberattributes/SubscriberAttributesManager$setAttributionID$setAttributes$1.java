package com.revenuecat.purchases.subscriberattributes;

import Td.L;
import Td.z;
import Ud.S;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesManager$setAttributionID$setAttributes$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ SubscriberAttributeKey.AttributionIds $attributionKey;
    final /* synthetic */ String $value;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$setAttributionID$setAttributes$1(SubscriberAttributeKey.AttributionIds attributionIds, String str, SubscriberAttributesManager subscriberAttributesManager, String str2) {
        super(1);
        this.$attributionKey = attributionIds;
        this.$value = str;
        this.this$0 = subscriberAttributesManager;
        this.$appUserID = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, String>) obj);
        return L.f17438a;
    }

    public final void invoke(Map<String, String> deviceIdentifiers) {
        AbstractC5504s.h(deviceIdentifiers, "deviceIdentifiers");
        this.this$0.setAttributes(S.p(S.f(z.a(this.$attributionKey.getBackendKey(), this.$value)), deviceIdentifiers), this.$appUserID);
    }
}
