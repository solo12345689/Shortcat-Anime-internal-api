package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import Y.C0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import u0.InterfaceC6708c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "LTd/L;", "invoke", "(Lu0/c;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AutoResizedTextKt$AutoResizedText$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ C0 $shouldDraw$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoResizedTextKt$AutoResizedText$1$1(C0 c02) {
        super(1);
        this.$shouldDraw$delegate = c02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC6708c) obj);
        return L.f17438a;
    }

    public final void invoke(InterfaceC6708c drawWithContent) {
        AbstractC5504s.h(drawWithContent, "$this$drawWithContent");
        if (AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$4(this.$shouldDraw$delegate)) {
            drawWithContent.B1();
        }
    }
}
