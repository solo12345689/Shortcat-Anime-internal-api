package com.revenuecat.purchases.ui.revenuecatui;

import Y.C0;
import Y.b2;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY/C0;", "", "invoke", "()LY/C0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ Function1 $shouldDisplayBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1(Function1 function1) {
        super(0);
        this.$shouldDisplayBlock = function1;
    }

    @Override // ie.InterfaceC5082a
    public final C0 invoke() {
        return b2.e(Boolean.valueOf(this.$shouldDisplayBlock == null), null, 2, null);
    }
}
