package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DualColorImageGenerator;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DualColorImageGenerator$redGreen$2 extends AbstractC5506u implements InterfaceC5082a {
    public static final DualColorImageGenerator$redGreen$2 INSTANCE = new DualColorImageGenerator$redGreen$2();

    DualColorImageGenerator$redGreen$2() {
        super(0);
    }

    @Override // ie.InterfaceC5082a
    public final DualColorImageGenerator.PreviewAppIcon invoke() {
        DualColorImageGenerator dualColorImageGenerator = DualColorImageGenerator.INSTANCE;
        C6385r0.a aVar = C6385r0.f58985b;
        DualColorImageGenerator.PreviewAppIcon previewAppIconM806createRFnl5yQ$default = DualColorImageGenerator.m806createRFnl5yQ$default(dualColorImageGenerator, aVar.h(), aVar.f(), 0, 0, 12, null);
        if (previewAppIconM806createRFnl5yQ$default != null) {
            return previewAppIconM806createRFnl5yQ$default;
        }
        throw new IllegalStateException("Failed to generate redGreen preview icon");
    }
}
