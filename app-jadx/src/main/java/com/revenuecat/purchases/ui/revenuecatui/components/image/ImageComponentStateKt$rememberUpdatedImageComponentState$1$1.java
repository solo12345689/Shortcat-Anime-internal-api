package com.revenuecat.purchases.ui.revenuecatui.components.image;

import c1.d;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc1/d;", "invoke", "()Lc1/d;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ImageComponentStateKt$rememberUpdatedImageComponentState$1$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ PaywallState.Loaded.Components $paywallState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComponentStateKt$rememberUpdatedImageComponentState$1$1(PaywallState.Loaded.Components components) {
        super(0);
        this.$paywallState = components;
    }

    @Override // ie.InterfaceC5082a
    public final d invoke() {
        return this.$paywallState.getLocale();
    }
}
