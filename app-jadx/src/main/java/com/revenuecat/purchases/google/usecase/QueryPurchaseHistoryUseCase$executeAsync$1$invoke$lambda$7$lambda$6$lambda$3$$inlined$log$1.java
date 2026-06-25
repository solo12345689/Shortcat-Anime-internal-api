package com.revenuecat.purchases.google.usecase;

import Ud.AbstractC2279u;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.strings.RestoreStrings;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Purchase $it$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1(LogIntent logIntent, Purchase purchase) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = purchase;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC2279u.w0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null));
        sb2.append(' ');
        Purchase it = this.$it$inlined;
        AbstractC5504s.g(it, "it");
        String str = String.format(RestoreStrings.PURCHASE_HISTORY_RETRIEVED, Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(this.$it$inlined)}, 1));
        AbstractC5504s.g(str, "format(...)");
        sb2.append(str);
        return sb2.toString();
    }
}
