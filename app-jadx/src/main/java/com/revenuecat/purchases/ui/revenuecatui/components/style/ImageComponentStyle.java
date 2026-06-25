package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import I0.InterfaceC1680f;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002Bµ\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 \u0012\b\b\u0002\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u001c\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u001c\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bD\u0010*JØ\u0001\u0010E\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\b\u0002\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0002\u0010$\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010H\u001a\u00020GHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010N\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010LHÖ\u0003¢\u0006\u0004\bN\u0010OR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bQ\u0010(R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bS\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010T\u001a\u0004\bU\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\bW\u0010.R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bX\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bZ\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010[\u001a\u0004\b\\\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010]\u001a\u0004\b^\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00107R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010a\u001a\u0004\bb\u00109R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\bd\u0010;R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010e\u001a\u0004\bf\u0010=R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010g\u001a\u0004\bh\u0010?R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010i\u001a\u0004\bj\u0010AR#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0006¢\u0006\f\n\u0004\b#\u0010k\u001a\u0004\bl\u0010CR\u0017\u0010$\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010R\u001a\u0004\bm\u0010*¨\u0006n"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "sources", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "LC/A;", "padding", "margin", "Ls0/E1;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "overlay", "LI0/f;", "contentScale", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial;", "overrides", "ignoreTopWindowInsets", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Ls0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LI0/f;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;Z)V", "component1", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "component2", "()Z", "component3", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "component4", "()LC/A;", "component5", "component6", "()Ls0/E1;", "component7", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "component8", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "component9", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "component10", "()LI0/f;", "component11", "()Lcom/revenuecat/purchases/Package;", "component12", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "component13", "()Ljava/lang/Integer;", "component14", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "component15", "()Ljava/util/List;", "component16", "copy", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Ls0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LI0/f;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;Z)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "getSources", "Z", "getVisible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "LC/A;", "getPadding", "getMargin", "Ls0/E1;", "getShape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "getBorder", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "getShadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getOverlay", "LI0/f;", "getContentScale", "Lcom/revenuecat/purchases/Package;", "getRcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getResolvedOffer", "Ljava/lang/Integer;", "getTabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOfferEligibility", "Ljava/util/List;", "getOverrides", "getIgnoreTopWindowInsets", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ImageComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final BorderStyles border;
    private final InterfaceC1680f contentScale;
    private final boolean ignoreTopWindowInsets;
    private final A margin;
    private final OfferEligibility offerEligibility;
    private final ColorStyles overlay;
    private final List<PresentedOverride<PresentedImagePartial>> overrides;
    private final A padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final ShadowStyles shadow;
    private final E1 shape;
    private final Size size;
    private final NonEmptyMap<LocaleId, ThemeImageUrls> sources;
    private final Integer tabIndex;
    private final boolean visible;

    public ImageComponentStyle(NonEmptyMap<LocaleId, ThemeImageUrls> sources, boolean z10, Size size, A padding, A margin, E1 e12, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, InterfaceC1680f contentScale, Package r13, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List<PresentedOverride<PresentedImagePartial>> overrides, boolean z11) {
        AbstractC5504s.h(sources, "sources");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(contentScale, "contentScale");
        AbstractC5504s.h(overrides, "overrides");
        this.sources = sources;
        this.visible = z10;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.shape = e12;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.overlay = colorStyles;
        this.contentScale = contentScale;
        this.rcPackage = r13;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.overrides = overrides;
        this.ignoreTopWindowInsets = z11;
    }

    public final NonEmptyMap<LocaleId, ThemeImageUrls> component1() {
        return this.sources;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final InterfaceC1680f getContentScale() {
        return this.contentScale;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Package getRcPackage() {
        return this.rcPackage;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getTabIndex() {
        return this.tabIndex;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final List<PresentedOverride<PresentedImagePartial>> component15() {
        return this.overrides;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIgnoreTopWindowInsets() {
        return this.ignoreTopWindowInsets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final A getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final A getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final E1 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BorderStyles getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ShadowStyles getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ColorStyles getOverlay() {
        return this.overlay;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i10);
    }

    public final ImageComponentStyle copy(NonEmptyMap<LocaleId, ThemeImageUrls> sources, boolean visible, Size size, A padding, A margin, E1 shape, BorderStyles border, ShadowStyles shadow, ColorStyles overlay, InterfaceC1680f contentScale, Package rcPackage, ResolvedOffer resolvedOffer, Integer tabIndex, OfferEligibility offerEligibility, List<PresentedOverride<PresentedImagePartial>> overrides, boolean ignoreTopWindowInsets) {
        AbstractC5504s.h(sources, "sources");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(contentScale, "contentScale");
        AbstractC5504s.h(overrides, "overrides");
        return new ImageComponentStyle(sources, visible, size, padding, margin, shape, border, shadow, overlay, contentScale, rcPackage, resolvedOffer, tabIndex, offerEligibility, overrides, ignoreTopWindowInsets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageComponentStyle)) {
            return false;
        }
        ImageComponentStyle imageComponentStyle = (ImageComponentStyle) other;
        return AbstractC5504s.c(this.sources, imageComponentStyle.sources) && this.visible == imageComponentStyle.visible && AbstractC5504s.c(this.size, imageComponentStyle.size) && AbstractC5504s.c(this.padding, imageComponentStyle.padding) && AbstractC5504s.c(this.margin, imageComponentStyle.margin) && AbstractC5504s.c(this.shape, imageComponentStyle.shape) && AbstractC5504s.c(this.border, imageComponentStyle.border) && AbstractC5504s.c(this.shadow, imageComponentStyle.shadow) && AbstractC5504s.c(this.overlay, imageComponentStyle.overlay) && AbstractC5504s.c(this.contentScale, imageComponentStyle.contentScale) && AbstractC5504s.c(this.rcPackage, imageComponentStyle.rcPackage) && AbstractC5504s.c(this.resolvedOffer, imageComponentStyle.resolvedOffer) && AbstractC5504s.c(this.tabIndex, imageComponentStyle.tabIndex) && AbstractC5504s.c(this.offerEligibility, imageComponentStyle.offerEligibility) && AbstractC5504s.c(this.overrides, imageComponentStyle.overrides) && this.ignoreTopWindowInsets == imageComponentStyle.ignoreTopWindowInsets;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ InterfaceC1680f getContentScale() {
        return this.contentScale;
    }

    public final /* synthetic */ boolean getIgnoreTopWindowInsets() {
        return this.ignoreTopWindowInsets;
    }

    public final /* synthetic */ A getMargin() {
        return this.margin;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final /* synthetic */ ColorStyles getOverlay() {
        return this.overlay;
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

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ E1 getShape() {
        return this.shape;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ NonEmptyMap getSources() {
        return this.sources;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.sources.hashCode() * 31) + Boolean.hashCode(this.visible)) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        E1 e12 = this.shape;
        int iHashCode2 = (iHashCode + (e12 == null ? 0 : e12.hashCode())) * 31;
        BorderStyles borderStyles = this.border;
        int iHashCode3 = (iHashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int iHashCode4 = (iHashCode3 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        ColorStyles colorStyles = this.overlay;
        int iHashCode5 = (((iHashCode4 + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31) + this.contentScale.hashCode()) * 31;
        Package r12 = this.rcPackage;
        int iHashCode6 = (iHashCode5 + (r12 == null ? 0 : r12.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int iHashCode7 = (iHashCode6 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        return ((((iHashCode8 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + this.overrides.hashCode()) * 31) + Boolean.hashCode(this.ignoreTopWindowInsets);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "ImageComponentStyle(sources=" + this.sources + ", visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", overlay=" + this.overlay + ", contentScale=" + this.contentScale + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", overrides=" + this.overrides + ", ignoreTopWindowInsets=" + this.ignoreTopWindowInsets + ')';
    }

    public /* synthetic */ ImageComponentStyle(NonEmptyMap nonEmptyMap, boolean z10, Size size, A a10, A a11, E1 e12, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, InterfaceC1680f interfaceC1680f, Package r31, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nonEmptyMap, z10, size, a10, a11, e12, borderStyles, shadowStyles, colorStyles, interfaceC1680f, r31, (i10 & 2048) != 0 ? null : resolvedOffer, num, (i10 & 8192) != 0 ? null : offerEligibility, list, (i10 & 32768) != 0 ? false : z11);
    }
}
