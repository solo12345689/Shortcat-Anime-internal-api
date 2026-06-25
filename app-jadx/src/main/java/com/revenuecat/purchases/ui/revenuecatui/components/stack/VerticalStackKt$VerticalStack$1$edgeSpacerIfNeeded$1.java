package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class VerticalStackKt$VerticalStack$1$edgeSpacerIfNeeded$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ Dimension.Vertical $dimension;
    final /* synthetic */ InterfaceC5096o $fillSpaceSpacer;
    final /* synthetic */ VerticalStackScopeImpl $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalStackKt$VerticalStack$1$edgeSpacerIfNeeded$1(VerticalStackScopeImpl verticalStackScopeImpl, Dimension.Vertical vertical, InterfaceC5096o interfaceC5096o) {
        super(2);
        this.$scope = verticalStackScopeImpl;
        this.$dimension = vertical;
        this.$fillSpaceSpacer = interfaceC5096o;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        if ((i10 & 3) == 2 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-535287235, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.VerticalStack.<anonymous>.<anonymous> (VerticalStack.kt:56)");
        }
        if (this.$scope.getShouldApplyFillSpacers() && (this.$dimension.getDistribution() == FlexDistribution.SPACE_AROUND || this.$dimension.getDistribution() == FlexDistribution.SPACE_EVENLY)) {
            this.$fillSpaceSpacer.invoke(Float.valueOf(1.0f), interfaceC2425m, 54);
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
