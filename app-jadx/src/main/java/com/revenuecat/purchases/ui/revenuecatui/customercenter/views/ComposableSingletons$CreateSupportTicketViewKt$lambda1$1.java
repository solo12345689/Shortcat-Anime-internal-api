package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Td.L;
import U.D;
import U.W;
import U.b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$CreateSupportTicketViewKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU/W;", "snackbarData", "LTd/L;", "invoke", "(LU/W;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ComposableSingletons$CreateSupportTicketViewKt$lambda1$1 extends AbstractC5506u implements InterfaceC5096o {
    public static final ComposableSingletons$CreateSupportTicketViewKt$lambda1$1 INSTANCE = new ComposableSingletons$CreateSupportTicketViewKt$lambda1$1();

    ComposableSingletons$CreateSupportTicketViewKt$lambda1$1() {
        super(3);
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((W) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(W snackbarData, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(snackbarData, "snackbarData");
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425m.U(snackbarData) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 19) == 18 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1015639048, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$CreateSupportTicketViewKt.lambda-1.<anonymous> (CreateSupportTicketView.kt:361)");
        }
        D d10 = D.f17597a;
        int i12 = D.f17598b;
        b0.d(snackbarData, null, false, null, d10.a(interfaceC2425m, i12).l(), d10.a(interfaceC2425m, i12).r(), 0L, 0L, 0L, interfaceC2425m, i11 & 14, 462);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
