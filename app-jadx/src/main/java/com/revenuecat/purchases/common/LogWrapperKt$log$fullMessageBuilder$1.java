package com.revenuecat.purchases.common;

import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
public final class LogWrapperKt$log$fullMessageBuilder$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ InterfaceC5082a $messageBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogWrapperKt$log$fullMessageBuilder$1(LogIntent logIntent, InterfaceC5082a interfaceC5082a) {
        super(0);
        this.$intent = logIntent;
        this.$messageBuilder = interfaceC5082a;
    }

    @Override // ie.InterfaceC5082a
    public final String invoke() {
        return AbstractC2279u.w0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null) + ' ' + ((String) this.$messageBuilder.invoke());
    }
}
