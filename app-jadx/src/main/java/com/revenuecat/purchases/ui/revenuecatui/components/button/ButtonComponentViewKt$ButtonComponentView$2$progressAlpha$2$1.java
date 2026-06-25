package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Y.C0;
import com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ButtonComponentViewKt$ButtonComponentView$2$progressAlpha$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ C0 $myActionInProgress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonComponentViewKt$ButtonComponentView$2$progressAlpha$2$1(C0 c02) {
        super(0);
        this.$myActionInProgress$delegate = c02;
    }

    @Override // ie.InterfaceC5082a
    public final Float invoke() {
        return Float.valueOf(ButtonComponentViewKt.AnonymousClass2.invoke$lambda$2(this.$myActionInProgress$delegate) ? 1.0f : 0.0f);
    }
}
