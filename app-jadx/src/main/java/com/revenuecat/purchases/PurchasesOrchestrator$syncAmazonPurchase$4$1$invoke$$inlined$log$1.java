package com.revenuecat.purchases;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.PurchaseStrings;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ String $amazonUserID$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $receiptID$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1(LogIntent logIntent, String str, String str2) {
        super(0);
        this.$intent = logIntent;
        this.$receiptID$inlined = str;
        this.$amazonUserID$inlined = str2;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC2279u.w0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null));
        sb2.append(' ');
        String str = String.format(PurchaseStrings.PURCHASE_SYNCED_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID$inlined, this.$amazonUserID$inlined}, 2));
        AbstractC5504s.g(str, "format(...)");
        sb2.append(str);
        return sb2.toString();
    }
}
