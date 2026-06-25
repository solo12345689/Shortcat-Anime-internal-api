package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "warning", "Ls0/r0;", "warningColor", "Landroidx/compose/ui/e;", "modifier", "LTd/L;", "DefaultPaywallWarning-3IgeMak", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;JLandroidx/compose/ui/e;LY/m;II)V", "DefaultPaywallWarning", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DefaultPaywallWarningKt {
    /* JADX INFO: renamed from: DefaultPaywallWarning-3IgeMak, reason: not valid java name */
    public static final void m804DefaultPaywallWarning3IgeMak(PaywallWarning warning, long j10, e eVar, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        AbstractC5504s.h(warning, "warning");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1893499378);
        if ((i10 & 1) == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if ((i11 & 4) != 0) {
                eVar = e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1893499378, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarning (DefaultPaywallWarning.kt:13)");
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        e eVar2 = eVar;
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new DefaultPaywallWarningKt$DefaultPaywallWarning$1(warning, j10, eVar2, i10, i11));
        }
    }
}
