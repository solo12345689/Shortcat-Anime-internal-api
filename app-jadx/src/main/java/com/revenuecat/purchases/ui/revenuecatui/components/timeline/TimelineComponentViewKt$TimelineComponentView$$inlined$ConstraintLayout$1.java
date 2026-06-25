package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import If.g;
import K0.x0;
import Td.L;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import l1.C5513A;
import l1.C5530l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ g $channel;
    final /* synthetic */ x0 $compositionSource;
    final /* synthetic */ C0 $contentTracker;
    final /* synthetic */ C0 $end;
    final /* synthetic */ C5530l $scope;
    final /* synthetic */ C0 $start;
    final /* synthetic */ PaywallState.Loaded.Components $state$inlined;
    final /* synthetic */ TimelineComponentState $timelineState$inlined;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ g $channel;
        final /* synthetic */ C0 $end;
        final /* synthetic */ C5530l $scope;
        final /* synthetic */ C0 $start;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C5530l c5530l, C0 c02, C0 c03, g gVar) {
            super(0);
            this.$scope = c5530l;
            this.$start = c02;
            this.$end = c03;
            this.$channel = gVar;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m552invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m552invoke() {
            C5513A c5513a = new C5513A(this.$scope.g().clone());
            if (this.$start.getValue() != null && this.$end.getValue() != null) {
                this.$channel.d(c5513a);
            } else {
                this.$start.setValue(c5513a);
                this.$end.setValue(this.$start.getValue());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$1(C0 c02, x0 x0Var, C5530l c5530l, g gVar, C0 c03, C0 c04, TimelineComponentState timelineComponentState, PaywallState.Loaded.Components components) {
        super(2);
        this.$contentTracker = c02;
        this.$scope = c5530l;
        this.$channel = gVar;
        this.$start = c03;
        this.$end = c04;
        this.$timelineState$inlined = timelineComponentState;
        this.$state$inlined = components;
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
            AbstractC2454w.U(-74958949, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(L.f17438a);
        throw null;
    }
}
