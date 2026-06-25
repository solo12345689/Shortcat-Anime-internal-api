package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedIconPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b4\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010A\u001a\u0004\bB\u0010CR#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "", "baseUrl", "iconName", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "formats", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "color", "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;", "iconBackground", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;", "overrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;)V", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "getIconName", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "getFormats", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "Z", "getVisible", "()Z", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getColor", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "LC/A;", "getPadding", "()LC/A;", "getMargin", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;", "getIconBackground", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;", "Lcom/revenuecat/purchases/Package;", "getRcPackage", "()Lcom/revenuecat/purchases/Package;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getResolvedOffer", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "Ljava/lang/Integer;", "getTabIndex", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOfferEligibility", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Background", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IconComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final String baseUrl;
    private final ColorStyles color;
    private final IconComponent.Formats formats;
    private final Background iconBackground;
    private final String iconName;
    private final A margin;
    private final OfferEligibility offerEligibility;
    private final List<PresentedOverride<PresentedIconPartial>> overrides;
    private final A padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final Size size;
    private final Integer tabIndex;
    private final boolean visible;

    public IconComponentStyle(String baseUrl, String iconName, IconComponent.Formats formats, boolean z10, Size size, ColorStyles colorStyles, A padding, A margin, Background background, Package r11, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List<PresentedOverride<PresentedIconPartial>> overrides) {
        AbstractC5504s.h(baseUrl, "baseUrl");
        AbstractC5504s.h(iconName, "iconName");
        AbstractC5504s.h(formats, "formats");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(overrides, "overrides");
        this.baseUrl = baseUrl;
        this.iconName = iconName;
        this.formats = formats;
        this.visible = z10;
        this.size = size;
        this.color = colorStyles;
        this.padding = padding;
        this.margin = margin;
        this.iconBackground = background;
        this.rcPackage = r11;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.overrides = overrides;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i10);
    }

    public final /* synthetic */ String getBaseUrl() {
        return this.baseUrl;
    }

    public final /* synthetic */ ColorStyles getColor() {
        return this.color;
    }

    public final /* synthetic */ IconComponent.Formats getFormats() {
        return this.formats;
    }

    public final /* synthetic */ Background getIconBackground() {
        return this.iconBackground;
    }

    public final /* synthetic */ String getIconName() {
        return this.iconName;
    }

    public final /* synthetic */ A getMargin() {
        return this.margin;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public String getPackageUniqueId() {
        return PackageContext.DefaultImpls.getPackageUniqueId(this);
    }

    public final /* synthetic */ A getPadding() {
        return this.padding;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ Size getSize() {
        return this.size;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;", "", "color", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;)V", "getBorder", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "getColor", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getShadow", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Background {
        public static final int $stable = 0;
        private final BorderStyles border;
        private final ColorStyles color;
        private final ShadowStyles shadow;
        private final MaskShape shape;

        public Background(ColorStyles color, MaskShape shape, BorderStyles borderStyles, ShadowStyles shadowStyles) {
            AbstractC5504s.h(color, "color");
            AbstractC5504s.h(shape, "shape");
            this.color = color;
            this.shape = shape;
            this.border = borderStyles;
            this.shadow = shadowStyles;
        }

        public final /* synthetic */ BorderStyles getBorder() {
            return this.border;
        }

        public final /* synthetic */ ColorStyles getColor() {
            return this.color;
        }

        public final /* synthetic */ ShadowStyles getShadow() {
            return this.shadow;
        }

        public final /* synthetic */ MaskShape getShape() {
            return this.shape;
        }

        public /* synthetic */ Background(ColorStyles colorStyles, MaskShape maskShape, BorderStyles borderStyles, ShadowStyles shadowStyles, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(colorStyles, maskShape, (i10 & 4) != 0 ? null : borderStyles, (i10 & 8) != 0 ? null : shadowStyles);
        }
    }

    public /* synthetic */ IconComponentStyle(String str, String str2, IconComponent.Formats formats, boolean z10, Size size, ColorStyles colorStyles, A a10, A a11, Background background, Package r28, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, formats, z10, size, colorStyles, a10, a11, background, r28, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : resolvedOffer, num, (i10 & 4096) != 0 ? null : offerEligibility, list);
    }
}
