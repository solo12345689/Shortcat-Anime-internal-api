package com.revenuecat.purchases.ui.revenuecatui.components.image;

import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;", "", "LTd/D;", "imageWidth", "imageHeight", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "viewSize", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "<init>", "(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "getImageWidth-pVg5ArA", "()I", "getImageHeight-pVg5ArA", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getViewSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PreviewParameters {
    private final FitMode fitMode;
    private final int imageHeight;
    private final int imageWidth;
    private final Size viewSize;

    public /* synthetic */ PreviewParameters(int i10, int i11, Size size, FitMode fitMode, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, size, fitMode);
    }

    public final FitMode getFitMode() {
        return this.fitMode;
    }

    /* JADX INFO: renamed from: getImageHeight-pVg5ArA, reason: not valid java name and from getter */
    public final int getImageHeight() {
        return this.imageHeight;
    }

    /* JADX INFO: renamed from: getImageWidth-pVg5ArA, reason: not valid java name and from getter */
    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final Size getViewSize() {
        return this.viewSize;
    }

    private PreviewParameters(int i10, int i11, Size viewSize, FitMode fitMode) {
        AbstractC5504s.h(viewSize, "viewSize");
        AbstractC5504s.h(fitMode, "fitMode");
        this.imageWidth = i10;
        this.imageHeight = i11;
        this.viewSize = viewSize;
        this.fitMode = fitMode;
    }
}
