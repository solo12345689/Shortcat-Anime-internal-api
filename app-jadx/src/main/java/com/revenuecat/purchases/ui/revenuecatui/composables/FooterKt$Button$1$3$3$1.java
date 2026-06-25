package com.revenuecat.purchases.ui.revenuecatui.composables;

import P0.f;
import Td.L;
import U.j0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import g1.C4830j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class FooterKt$Button$1$3$3$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Button$1$3$3$1(int i10, e eVar, long j10) {
        super(2);
        this.$it = i10;
        this.$childModifier = eVar;
        this.$color = j10;
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
            AbstractC2454w.U(1301841013, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Footer.kt:235)");
        }
        String strA = f.a(this.$it, interfaceC2425m, 0);
        int iA = C4830j.f47278b.a();
        j0.b(strA, this.$childModifier, this.$color, 0L, null, null, null, 0L, null, C4830j.h(iA), 0L, 0, true, 0, 0, null, FooterConstants.INSTANCE.style(interfaceC2425m, 6), interfaceC2425m, 0, 384, 60920);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
