package com.revenuecat.purchases.ui.revenuecatui.composables;

import I0.A;
import I0.C;
import Td.L;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import i0.C4961E;
import i1.AbstractC5010c;
import i1.C5009b;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/l;", "LI0/A;", "measurable", "Li1/b;", "<anonymous parameter 1>", "LI0/C;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ int $index;
    final /* synthetic */ C4961E $viewSizes;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/s$a;", "LTd/L;", "invoke", "(Landroidx/compose/ui/layout/s$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(s.a layout) {
            AbstractC5504s.h(layout, "$this$layout");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1(C4961E c4961e, int i10) {
        super(3);
        this.$viewSizes = c4961e;
        this.$index = i10;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m563invoke3p2s80s((l) obj, (A) obj2, ((C5009b) obj3).r());
    }

    /* JADX INFO: renamed from: invoke-3p2s80s */
    public final C m563invoke3p2s80s(l layout, A measurable, long j10) {
        AbstractC5504s.h(layout, "$this$layout");
        AbstractC5504s.h(measurable, "measurable");
        if (((Number) this.$viewSizes.get(this.$index)).intValue() == 0) {
            this.$viewSizes.set(this.$index, Integer.valueOf(measurable.v0(AbstractC5010c.b(0, 0, 0, 0, 15, null)).W0()));
        }
        return l.u0(layout, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
    }
}
