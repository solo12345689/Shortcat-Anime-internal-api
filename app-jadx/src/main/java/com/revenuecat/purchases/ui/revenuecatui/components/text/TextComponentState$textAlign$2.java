package com.revenuecat.purchases.ui.revenuecatui.components.text;

import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import g1.C4830j;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg1/j;", "invoke-buA522U", "()Lg1/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TextComponentState$textAlign$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextComponentState$textAlign$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    @Override // ie.InterfaceC5082a
    /* JADX INFO: renamed from: invoke-buA522U, reason: not valid java name and merged with bridge method [inline-methods] */
    public final C4830j invoke() {
        PartialTextComponent partial;
        HorizontalAlignment horizontalAlignment;
        LocalizedTextPartial presentedPartial = this.this$0.getPresentedPartial();
        return (presentedPartial == null || (partial = presentedPartial.getPartial()) == null || (horizontalAlignment = partial.getHorizontalAlignment()) == null) ? this.this$0.style.getTextAlign() : C4830j.h(AlignmentKt.toTextAlign(horizontalAlignment));
    }
}
