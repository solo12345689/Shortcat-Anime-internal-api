package com.revenuecat.purchases.subscriberattributes.caching;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ String $appUserID$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Map $unsyncedAttributesByKey$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1(LogIntent logIntent, Map map, String str) {
        super(0);
        this.$intent = logIntent;
        this.$unsyncedAttributesByKey$inlined = map;
        this.$appUserID$inlined = str;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC2279u.w0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null));
        sb2.append(' ');
        StringBuilder sb3 = new StringBuilder();
        String str = String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(this.$unsyncedAttributesByKey$inlined.size()), this.$appUserID$inlined}, 2));
        AbstractC5504s.g(str, "format(...)");
        sb3.append(str);
        sb3.append(!this.$unsyncedAttributesByKey$inlined.isEmpty() ? AbstractC2279u.w0(this.$unsyncedAttributesByKey$inlined.values(), "\n", null, null, 0, null, null, 62, null) : "");
        sb2.append(sb3.toString());
        return sb2.toString();
    }
}
