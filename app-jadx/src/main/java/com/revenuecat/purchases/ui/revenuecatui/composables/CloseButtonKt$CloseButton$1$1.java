package com.revenuecat.purchases.ui.revenuecatui.composables;

import P0.c;
import Td.L;
import U.AbstractC2181s;
import U.B;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CloseButtonKt$CloseButton$1$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ C6385r0 $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseButtonKt$CloseButton$1$1(C6385r0 c6385r0) {
        super(2);
        this.$color = c6385r0;
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
            AbstractC2454w.U(170484435, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.CloseButton.<anonymous>.<anonymous> (CloseButton.kt:30)");
        }
        AbstractC6923b abstractC6923bC = c.c(R.drawable.close, interfaceC2425m, 0);
        C6385r0 c6385r0 = this.$color;
        interfaceC2425m.V(752306841);
        long jA = c6385r0 == null ? ((C6385r0) interfaceC2425m.n(AbstractC2181s.a())).A() : c6385r0.A();
        interfaceC2425m.O();
        B.a(abstractC6923bC, null, null, jA, interfaceC2425m, 48, 4);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
