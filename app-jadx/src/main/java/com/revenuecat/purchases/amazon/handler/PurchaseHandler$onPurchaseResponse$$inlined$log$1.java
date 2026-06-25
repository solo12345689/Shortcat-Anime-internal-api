package com.revenuecat.purchases.amazon.handler;

import Ud.AbstractC2279u;
import com.amazon.device.iap.model.PurchaseResponse;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.common.LogIntent;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchaseHandler$onPurchaseResponse$$inlined$log$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ PurchaseResponse $response$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$onPurchaseResponse$$inlined$log$1(LogIntent logIntent, PurchaseResponse purchaseResponse) {
        super(0);
        this.$intent = logIntent;
        this.$response$inlined = purchaseResponse;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC2279u.w0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null));
        sb2.append(' ');
        String str = String.format(AmazonStrings.PURCHASE_REQUEST_FINISHED, Arrays.copyOf(new Object[]{this.$response$inlined.toJSON().toString(1)}, 1));
        AbstractC5504s.g(str, "format(...)");
        sb2.append(str);
        return sb2.toString();
    }
}
