package com.revenuecat.purchases.identity;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.IdentityStrings;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class IdentityManager$configure$$inlined$log$3 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ String $appUserIDToUse$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$configure$$inlined$log$3(LogIntent logIntent, String str) {
        super(0);
        this.$intent = logIntent;
        this.$appUserIDToUse$inlined = str;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC2279u.w0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null));
        sb2.append(' ');
        String str = String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{this.$appUserIDToUse$inlined}, 1));
        AbstractC5504s.g(str, "format(...)");
        sb2.append(str);
        return sb2.toString();
    }
}
