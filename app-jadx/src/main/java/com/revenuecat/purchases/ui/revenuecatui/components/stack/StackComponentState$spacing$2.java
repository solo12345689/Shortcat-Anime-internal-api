package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li1/h;", "invoke-D9Ej5fM", "()F", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class StackComponentState$spacing$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ StackComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentState$spacing$2(StackComponentState stackComponentState) {
        super(0);
        this.this$0 = stackComponentState;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        return C5015h.h(m504invokeD9Ej5fM());
    }

    /* JADX INFO: renamed from: invoke-D9Ej5fM, reason: not valid java name */
    public final float m504invokeD9Ej5fM() {
        PartialStackComponent partial;
        Float spacing;
        PresentedStackPartial presentedPartial = this.this$0.getPresentedPartial();
        return (presentedPartial == null || (partial = presentedPartial.getPartial()) == null || (spacing = partial.getSpacing()) == null) ? this.this$0.style.m530getSpacingD9Ej5fM() : C5015h.n(spacing.floatValue());
    }
}
