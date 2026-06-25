package com.revenuecat.purchases.ui.revenuecatui.data;

import Td.r;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0018\u0010\r\u001a\u00020\f*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "loadedLegacy", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;", "getSelectedLocalization", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;", "selectedLocalization", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "getCurrentColors", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "currentColors", "", "isInFullScreenMode", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;)Z", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallStateKt {
    public static final TemplateConfiguration.Colors getCurrentColors(PaywallState.Loaded.Legacy legacy, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(legacy, "<this>");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(779612430, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.data.<get-currentColors> (PaywallState.kt:384)");
        }
        TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return currentColors;
    }

    public static final ProcessedLocalizedConfiguration getSelectedLocalization(PaywallState.Loaded.Legacy legacy) {
        AbstractC5504s.h(legacy, "<this>");
        return ((TemplateConfiguration.PackageInfo) legacy.getSelectedPackage().getValue()).getLocalization();
    }

    public static final boolean isInFullScreenMode(PaywallState.Loaded.Legacy legacy) {
        AbstractC5504s.h(legacy, "<this>");
        return PaywallModeKt.isFullScreen(legacy.getTemplateConfiguration().getMode());
    }

    public static final PaywallState.Loaded.Legacy loadedLegacy(PaywallState paywallState) {
        AbstractC5504s.h(paywallState, "<this>");
        if (paywallState instanceof PaywallState.Error) {
            return null;
        }
        if (!(paywallState instanceof PaywallState.Loaded)) {
            if (paywallState instanceof PaywallState.Loading) {
                return null;
            }
            throw new r();
        }
        PaywallState.Loaded loaded = (PaywallState.Loaded) paywallState;
        if (loaded instanceof PaywallState.Loaded.Legacy) {
            return (PaywallState.Loaded.Legacy) paywallState;
        }
        if (loaded instanceof PaywallState.Loaded.Components) {
            return null;
        }
        throw new r();
    }
}
