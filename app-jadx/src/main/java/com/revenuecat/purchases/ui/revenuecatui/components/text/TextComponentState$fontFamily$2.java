package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Y0.AbstractC2485u;
import Y0.H;
import Y0.L;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpecKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LY0/u;", "invoke", "()LY0/u;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TextComponentState$fontFamily$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextComponentState$fontFamily$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final AbstractC2485u invoke() {
        FontSpec fontSpec = this.this$0.getFontSpec();
        if (fontSpec == null) {
            return null;
        }
        L fontWeight = this.this$0.getFontWeight();
        if (fontWeight == null) {
            fontWeight = L.f22613b.g();
        }
        return FontSpecKt.m482resolveRetOiIg(fontSpec, fontWeight, H.f22594b.b());
    }
}
