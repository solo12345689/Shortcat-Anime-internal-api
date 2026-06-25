package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.InterfaceC1132c;
import J.i;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5912g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class Template4Kt$Template4$1$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ InterfaceC1132c $this_Box;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$Template4$1$2$1(InterfaceC1132c interfaceC1132c) {
        super(1);
        this.$this_Box = interfaceC1132c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final e invoke(e conditional) {
        AbstractC5504s.h(conditional, "$this$conditional");
        e eVarB = this.$this_Box.b(e.f26613a, l0.e.f52304a.b());
        UIConstant uIConstant = UIConstant.INSTANCE;
        float f10 = 0;
        return AbstractC5912g.a(eVarB, i.e(uIConstant.m385getDefaultCornerRadiusD9Ej5fM(), uIConstant.m385getDefaultCornerRadiusD9Ej5fM(), C5015h.n(f10), C5015h.n(f10)));
    }
}
