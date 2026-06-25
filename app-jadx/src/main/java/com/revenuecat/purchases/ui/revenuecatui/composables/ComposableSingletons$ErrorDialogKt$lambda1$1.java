package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.I;
import P0.f;
import Td.L;
import U.j0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.R;
import g1.C4830j;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ComposableSingletons$ErrorDialogKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ComposableSingletons$ErrorDialogKt$lambda1$1 extends AbstractC5506u implements InterfaceC5096o {
    public static final ComposableSingletons$ErrorDialogKt$lambda1$1 INSTANCE = new ComposableSingletons$ErrorDialogKt$lambda1$1();

    ComposableSingletons$ErrorDialogKt$lambda1$1() {
        super(3);
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(I TextButton, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(TextButton, "$this$TextButton");
        if ((i10 & 17) == 16 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1324687321, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ComposableSingletons$ErrorDialogKt.lambda-1.<anonymous> (ErrorDialog.kt:25)");
        }
        j0.b(f.a(R.string.OK, interfaceC2425m, 0), null, 0L, 0L, null, null, null, 0L, null, C4830j.h(C4830j.f47278b.a()), 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 130558);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
