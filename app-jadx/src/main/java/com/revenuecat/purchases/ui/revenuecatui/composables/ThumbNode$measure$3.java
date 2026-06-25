package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import androidx.compose.ui.layout.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import w.C6888a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/s$a;", "LTd/L;", "invoke", "(Landroidx/compose/ui/layout/s$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ThumbNode$measure$3 extends AbstractC5506u implements Function1 {
    final /* synthetic */ float $offset;
    final /* synthetic */ s $placeable;
    final /* synthetic */ ThumbNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThumbNode$measure$3(s sVar, ThumbNode thumbNode, float f10) {
        super(1);
        this.$placeable = sVar;
        this.this$0 = thumbNode;
        this.$offset = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((s.a) obj);
        return L.f17438a;
    }

    public final void invoke(s.a layout) {
        AbstractC5504s.h(layout, "$this$layout");
        s sVar = this.$placeable;
        C6888a c6888a = this.this$0.offsetAnim;
        s.a.W(layout, sVar, (int) (c6888a != null ? ((Number) c6888a.m()).floatValue() : this.$offset), 0, 0.0f, 4, null);
    }
}
