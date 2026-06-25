package com.revenuecat.purchases.ui.revenuecatui.composables;

import Y.C0;
import i0.C4961E;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ C0 $maxSize$delegate;
    final /* synthetic */ C4961E $viewSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1(C4961E c4961e, C0 c02) {
        super(0);
        this.$viewSizes = c4961e;
        this.$maxSize$delegate = c02;
    }

    @Override // ie.InterfaceC5082a
    public final Integer invoke() {
        int size = this.$viewSizes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Number) this.$viewSizes.get(i10)).intValue() <= AdaptiveComposableKt.AdaptiveComposable$lambda$1(this.$maxSize$delegate)) {
                return Integer.valueOf(i10);
            }
        }
        return 0;
    }
}
