package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.I;
import C.K;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "weight", "LTd/L;", "invoke", "(FLY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class HorizontalStackKt$HorizontalStack$1$fillSpaceSpacer$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ I $this_Row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HorizontalStackKt$HorizontalStack$1$fillSpaceSpacer$1(I i10) {
        super(3);
        this.$this_Row = i10;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).floatValue(), (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(float f10, InterfaceC2425m interfaceC2425m, int i10) {
        if ((i10 & 6) == 0) {
            i10 |= interfaceC2425m.b(f10) ? 4 : 2;
        }
        if ((i10 & 19) == 18 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-865996447, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.HorizontalStack.<anonymous>.<anonymous> (HorizontalStack.kt:43)");
        }
        K.a(I.b(this.$this_Row, e.f26613a, f10, false, 2, null), interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
