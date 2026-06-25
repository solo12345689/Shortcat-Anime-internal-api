package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$1$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ SimpleSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$1$1(SimpleSheetState simpleSheetState) {
        super(0);
        this.$sheetState = simpleSheetState;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m622invoke();
        return L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m622invoke() {
        this.$sheetState.hide();
    }
}
