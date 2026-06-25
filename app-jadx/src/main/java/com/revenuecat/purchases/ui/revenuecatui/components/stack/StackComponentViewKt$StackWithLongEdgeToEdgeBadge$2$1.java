package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import I0.A;
import I0.C;
import I0.P;
import Td.L;
import Ud.AbstractC2279u;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import g0.i;
import i1.C5009b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LI0/P;", "Li1/b;", "constraints", "LI0/C;", "invoke-0kLqBqw", "(LI0/P;J)LI0/C;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ StackComponentStyle $badgeStack;
    final /* synthetic */ Function2 $clickHandler;
    final /* synthetic */ float $contentAlpha;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ PaywallState.Loaded.Components $state;
    final /* synthetic */ boolean $topBadge;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/s$a;", "LTd/L;", "invoke", "(Landroidx/compose/ui/layout/s$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ s $backgroundPlaceable;
        final /* synthetic */ s $badgePlaceable;
        final /* synthetic */ s $stackPlaceable;
        final /* synthetic */ boolean $topBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(s sVar, boolean z10, s sVar2, s sVar3) {
            super(1);
            this.$backgroundPlaceable = sVar;
            this.$topBadge = z10;
            this.$badgePlaceable = sVar2;
            this.$stackPlaceable = sVar3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a layout) {
            AbstractC5504s.h(layout, "$this$layout");
            s.a.W(layout, this.$backgroundPlaceable, 0, 0, 0.0f, 4, null);
            if (this.$topBadge) {
                s.a.W(layout, this.$badgePlaceable, 0, 0, 0.0f, 4, null);
                s.a.W(layout, this.$stackPlaceable, 0, this.$badgePlaceable.P0(), 0.0f, 4, null);
                this.$stackPlaceable.P0();
                return;
            }
            s.a.W(layout, this.$stackPlaceable, 0, 0, 0.0f, 4, null);
            s.a.W(layout, this.$badgePlaceable, 0, this.$stackPlaceable.P0(), 0.0f, 4, null);
            this.$badgePlaceable.P0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1(StackComponentState stackComponentState, PaywallState.Loaded.Components components, Function2 function2, float f10, StackComponentStyle stackComponentStyle, boolean z10) {
        super(2);
        this.$stackState = stackComponentState;
        this.$state = components;
        this.$clickHandler = function2;
        this.$contentAlpha = f10;
        this.$badgeStack = stackComponentStyle;
        this.$topBadge = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m507invoke0kLqBqw((P) obj, ((C5009b) obj2).r());
    }

    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final C m507invoke0kLqBqw(P SubcomposeLayout, long j10) {
        AbstractC5504s.h(SubcomposeLayout, "$this$SubcomposeLayout");
        s sVarV0 = ((A) AbstractC2279u.m0(SubcomposeLayout.M("stack", i.b(-1349600991, true, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$stackMeasurable$1(this.$stackState, this.$state, this.$clickHandler, this.$contentAlpha))))).v0(j10);
        s sVarV02 = ((A) AbstractC2279u.m0(SubcomposeLayout.M("badge", i.b(1484438374, true, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$badgeMeasurable$1(this.$badgeStack, this.$state, this.$clickHandler))))).v0(j10);
        int iP0 = sVarV02.P0();
        int iW0 = sVarV0.W0();
        int iP02 = sVarV0.P0() + iP0;
        return l.u0(SubcomposeLayout, iW0, iP02, null, new AnonymousClass1(((A) AbstractC2279u.m0(SubcomposeLayout.M(AppStateModule.APP_STATE_BACKGROUND, i.b(-1688443959, true, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1(this.$badgeStack, this.$stackState, this.$topBadge, sVarV0))))).v0(C5009b.f48540b.c(iW0, iP02)), this.$topBadge, sVarV02, sVarV0), 4, null);
    }
}
