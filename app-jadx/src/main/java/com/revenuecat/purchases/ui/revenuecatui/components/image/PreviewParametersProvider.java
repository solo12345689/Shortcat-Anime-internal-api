package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Cf.i;
import Cf.l;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import h1.InterfaceC4895a;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParametersProvider;", "Lh1/a;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;", "<init>", "()V", "LCf/i;", "values", "LCf/i;", "getValues", "()LCf/i;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PreviewParametersProvider implements InterfaceC4895a {
    private final i values;

    public PreviewParametersProvider() {
        Size size = new Size(new SizeConstraint.Fixed(200, null), new SizeConstraint.Fixed(200, null));
        FitMode fitMode = FitMode.FILL;
        PreviewParameters previewParameters = new PreviewParameters(100, 100, size, fitMode, null);
        Size size2 = new Size(new SizeConstraint.Fixed(200, null), new SizeConstraint.Fixed(200, null));
        FitMode fitMode2 = FitMode.FIT;
        PreviewParameters previewParameters2 = new PreviewParameters(100, 100, size2, fitMode2, null);
        PreviewParameters previewParameters3 = new PreviewParameters(100, 100, new Size(new SizeConstraint.Fixed(200, null), new SizeConstraint.Fixed(50, null)), fitMode, null);
        PreviewParameters previewParameters4 = new PreviewParameters(100, 100, new Size(new SizeConstraint.Fixed(200, null), new SizeConstraint.Fixed(50, null)), fitMode2, null);
        PreviewParameters previewParameters5 = new PreviewParameters(100, 100, new Size(new SizeConstraint.Fixed(50, null), new SizeConstraint.Fixed(200, null)), fitMode, null);
        PreviewParameters previewParameters6 = new PreviewParameters(100, 100, new Size(new SizeConstraint.Fixed(50, null), new SizeConstraint.Fixed(200, null)), fitMode2, null);
        SizeConstraint.Fixed fixed = new SizeConstraint.Fixed(72, null);
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        PreviewParameters previewParameters7 = new PreviewParameters(100, 100, new Size(fixed, fit), fitMode, null);
        PreviewParameters previewParameters8 = new PreviewParameters(100, 100, new Size(fit, new SizeConstraint.Fixed(72, null)), fitMode, null);
        SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
        this.values = l.s(previewParameters, previewParameters2, previewParameters3, previewParameters4, previewParameters5, previewParameters6, previewParameters7, previewParameters8, new PreviewParameters(1909, 1306, new Size(fill, fit), fitMode2, null), new PreviewParameters(1306, 1909, new Size(fit, fill), fitMode2, null));
    }

    @Override // h1.InterfaceC4895a
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // h1.InterfaceC4895a
    public i getValues() {
        return this.values;
    }
}
