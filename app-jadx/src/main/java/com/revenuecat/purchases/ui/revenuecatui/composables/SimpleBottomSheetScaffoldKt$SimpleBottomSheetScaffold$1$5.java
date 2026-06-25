package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import e.AbstractC4633a;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import v.InterfaceC6784e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ SimpleSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5(SimpleSheetState simpleSheetState) {
        super(3);
        this.$sheetState = simpleSheetState;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1578294028, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffold.<anonymous>.<anonymous> (SimpleBottomSheetScaffold.kt:61)");
        }
        interfaceC2425m.V(465543994);
        boolean zU = interfaceC2425m.U(this.$sheetState);
        SimpleSheetState simpleSheetState = this.$sheetState;
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5$1$1(simpleSheetState);
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        AbstractC4633a.a(false, (InterfaceC5082a) objD, interfaceC2425m, 0, 1);
        this.$sheetState.getContent().invoke(interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
