package com.revenuecat.purchases;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ConfigureStrings;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesFactory$createPurchases$lambda$8$$inlined$log$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesFactory$createPurchases$lambda$8$$inlined$log$2(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC2279u.w0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null));
        sb2.append(' ');
        String str = String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(new Object[]{Purchases.INSTANCE.getFrameworkVersion()}, 1));
        AbstractC5504s.g(str, "format(...)");
        sb2.append(str);
        return sb2.toString();
    }
}
