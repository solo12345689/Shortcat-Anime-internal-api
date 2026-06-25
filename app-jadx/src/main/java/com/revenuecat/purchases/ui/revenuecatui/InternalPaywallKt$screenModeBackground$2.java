package com.revenuecat.purchases.ui.revenuecatui;

import J.i;
import androidx.compose.foundation.b;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5912g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class InternalPaywallKt$screenModeBackground$2 extends AbstractC5506u implements Function1 {
    final /* synthetic */ long $backgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalPaywallKt$screenModeBackground$2(long j10) {
        super(1);
        this.$backgroundColor = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final e invoke(e conditional) {
        AbstractC5504s.h(conditional, "$this$conditional");
        e.a aVar = e.f26613a;
        UIConstant uIConstant = UIConstant.INSTANCE;
        return b.d(AbstractC5912g.a(aVar, i.f(uIConstant.m385getDefaultCornerRadiusD9Ej5fM(), uIConstant.m385getDefaultCornerRadiusD9Ej5fM(), 0.0f, 0.0f, 12, null)), this.$backgroundColor, null, 2, null);
    }
}
