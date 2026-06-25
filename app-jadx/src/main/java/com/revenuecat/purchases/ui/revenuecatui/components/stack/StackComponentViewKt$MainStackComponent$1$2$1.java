package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.P;
import C.S;
import C.T;
import C.V;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class StackComponentViewKt$MainStackComponent$1$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ P $safeDrawingInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$MainStackComponent$1$2$1(P p10) {
        super(1);
        this.$safeDrawingInsets = p10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final e invoke(e conditional) {
        AbstractC5504s.h(conditional, "$this$conditional");
        return T.c(conditional, S.e(this.$safeDrawingInsets, V.f2072a.f()));
    }
}
