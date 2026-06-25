package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import I0.A;
import I0.C;
import Td.L;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import i1.C5009b;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/l;", "LI0/A;", "measurable", "Li1/b;", "constraints", "LI0/C;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class StackComponentViewKt$OverlaidBadge$2$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ TwoDimensionalAlignment $alignment;
    final /* synthetic */ Float $mainStackBorderWidthPx;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$OverlaidBadge$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/s$a;", "LTd/L;", "invoke", "(Landroidx/compose/ui/layout/s$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ Float $mainStackBorderWidthPx;
        final /* synthetic */ s $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(s sVar, TwoDimensionalAlignment twoDimensionalAlignment, Float f10) {
            super(1);
            this.$placeable = sVar;
            this.$alignment = twoDimensionalAlignment;
            this.$mainStackBorderWidthPx = f10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a layout) {
            AbstractC5504s.h(layout, "$this$layout");
            s sVar = this.$placeable;
            int iP0 = sVar.P0();
            TwoDimensionalAlignment twoDimensionalAlignment = this.$alignment;
            Float f10 = this.$mainStackBorderWidthPx;
            s.a.W(layout, sVar, 0, StackComponentViewKt.getOverlaidBadgeOffsetY(iP0, twoDimensionalAlignment, f10 != null ? f10.floatValue() : 0.0f), 0.0f, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$OverlaidBadge$2$1(TwoDimensionalAlignment twoDimensionalAlignment, Float f10) {
        super(3);
        this.$alignment = twoDimensionalAlignment;
        this.$mainStackBorderWidthPx = f10;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m506invoke3p2s80s((l) obj, (A) obj2, ((C5009b) obj3).r());
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final C m506invoke3p2s80s(l layout, A measurable, long j10) {
        AbstractC5504s.h(layout, "$this$layout");
        AbstractC5504s.h(measurable, "measurable");
        s sVarV0 = measurable.v0(j10);
        return l.u0(layout, sVarV0.W0(), sVarV0.P0(), null, new AnonymousClass1(sVarV0, this.$alignment, this.$mainStackBorderWidthPx), 4, null);
    }
}
