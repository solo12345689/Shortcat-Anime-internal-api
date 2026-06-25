package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import G.C;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CarouselComponentViewKt$Indicator$progress$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ int $pageCount;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ C $pagerState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentViewKt$Indicator$progress$2$1(C c10, int i10, int i11) {
        super(0);
        this.$pagerState = c10;
        this.$pageCount = i10;
        this.$pageIndex = i11;
    }

    @Override // ie.InterfaceC5082a
    public final Float invoke() {
        int iV = this.$pagerState.v() % this.$pageCount;
        int i10 = this.$pageIndex;
        float fW = 0.0f;
        if (i10 == iV) {
            fW = this.$pagerState.w() >= 0.0f ? 1.0f - this.$pagerState.w() : this.$pagerState.w() + 1.0f;
        } else if (i10 == iV + 1 && this.$pagerState.w() >= 0.0f) {
            fW = this.$pagerState.w();
        } else if (this.$pageIndex == iV - 1 && this.$pagerState.w() < 0.0f) {
            fW = -this.$pagerState.w();
        }
        return Float.valueOf(fW);
    }
}
