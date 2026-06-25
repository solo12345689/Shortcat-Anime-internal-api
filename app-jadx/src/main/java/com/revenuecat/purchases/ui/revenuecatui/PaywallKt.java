package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.react.ui.PaywallViewManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "options", "LTd/L;", PaywallViewManager.REACT_CLASS, "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallKt$Paywall$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallOptions paywallOptions, int i10) {
            super(2);
            this.$options = paywallOptions;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallKt.Paywall(this.$options, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void Paywall(PaywallOptions options, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(options, "options");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(377521151);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(options) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(377521151, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.Paywall (Paywall.kt:9)");
            }
            InternalPaywallKt.InternalPaywall(options, null, interfaceC2425mG, i11 & 14, 2);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(options, i10));
        }
    }
}
