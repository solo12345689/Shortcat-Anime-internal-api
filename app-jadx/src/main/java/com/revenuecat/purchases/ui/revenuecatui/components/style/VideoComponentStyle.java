package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import I0.InterfaceC1680f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002Bë\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003¢\u0006\u0004\b-\u0010.J\u001e\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b4\u00101J\u0010\u00105\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b7\u00101J\u0010\u00108\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b:\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bM\u00101J\u001c\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0098\u0002\u0010P\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\t2\u0014\b\u0002\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'HÆ\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010S\u001a\u00020RHÖ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\"HÖ\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010Y\u001a\u00020\t2\b\u0010X\u001a\u0004\u0018\u00010WHÖ\u0003¢\u0006\u0004\bY\u0010ZR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b\\\u0010.R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\b]\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010^\u001a\u0004\b_\u00101R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\b`\u00101R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010^\u001a\u0004\ba\u00101R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\bb\u00101R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010c\u001a\u0004\bd\u00106R\u001a\u0010\u0010\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010^\u001a\u0004\be\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010f\u001a\u0004\bg\u00109R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010f\u001a\u0004\bh\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010i\u001a\u0004\bj\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010k\u001a\u0004\bl\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010m\u001a\u0004\bn\u0010@R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010o\u001a\u0004\bp\u0010BR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010q\u001a\u0004\br\u0010DR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010s\u001a\u0004\bt\u0010FR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010u\u001a\u0004\bv\u0010HR\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010w\u001a\u0004\bx\u0010JR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010y\u001a\u0004\bz\u0010LR\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010^\u001a\u0004\b{\u00101R#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'8\u0006¢\u0006\f\n\u0004\b*\u0010|\u001a\u0004\b}\u0010O¨\u0006~"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "sources", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "fallbackSources", "", "showControls", "autoplay", "loop", "muteAudio", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "visible", "LC/A;", "padding", "margin", "Ls0/E1;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "overlay", "LI0/f;", "contentScale", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "ignoreTopWindowInsets", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedVideoPartial;", "overrides", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;ZLC/A;LC/A;Ls0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LI0/f;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;ZLjava/util/List;)V", "component1", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "component8", "component9", "()LC/A;", "component10", "component11", "()Ls0/E1;", "component12", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "component13", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "component14", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "component15", "()LI0/f;", "component16", "()Lcom/revenuecat/purchases/Package;", "component17", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "component18", "()Ljava/lang/Integer;", "component19", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "component20", "component21", "()Ljava/util/List;", "copy", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;ZLC/A;LC/A;Ls0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LI0/f;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;ZLjava/util/List;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "getSources", "getFallbackSources", "Z", "getShowControls", "getAutoplay", "getLoop", "getMuteAudio", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "getVisible", "LC/A;", "getPadding", "getMargin", "Ls0/E1;", "getShape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "getBorder", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "getShadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getOverlay", "LI0/f;", "getContentScale", "Lcom/revenuecat/purchases/Package;", "getRcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getResolvedOffer", "Ljava/lang/Integer;", "getTabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOfferEligibility", "getIgnoreTopWindowInsets", "Ljava/util/List;", "getOverrides", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class VideoComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final boolean autoplay;
    private final BorderStyles border;
    private final InterfaceC1680f contentScale;
    private final NonEmptyMap<LocaleId, ThemeImageUrls> fallbackSources;
    private final boolean ignoreTopWindowInsets;
    private final boolean loop;
    private final A margin;
    private final boolean muteAudio;
    private final OfferEligibility offerEligibility;
    private final ColorStyles overlay;
    private final List<PresentedOverride<PresentedVideoPartial>> overrides;
    private final A padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final ShadowStyles shadow;
    private final E1 shape;
    private final boolean showControls;
    private final Size size;
    private final NonEmptyMap<LocaleId, ThemeVideoUrls> sources;
    private final Integer tabIndex;
    private final boolean visible;

    public VideoComponentStyle(NonEmptyMap<LocaleId, ThemeVideoUrls> sources, NonEmptyMap<LocaleId, ThemeImageUrls> nonEmptyMap, boolean z10, boolean z11, boolean z12, boolean z13, Size size, boolean z14, A padding, A margin, E1 e12, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, InterfaceC1680f contentScale, Package r19, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, boolean z15, List<PresentedOverride<PresentedVideoPartial>> overrides) {
        AbstractC5504s.h(sources, "sources");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(contentScale, "contentScale");
        AbstractC5504s.h(overrides, "overrides");
        this.sources = sources;
        this.fallbackSources = nonEmptyMap;
        this.showControls = z10;
        this.autoplay = z11;
        this.loop = z12;
        this.muteAudio = z13;
        this.size = size;
        this.visible = z14;
        this.padding = padding;
        this.margin = margin;
        this.shape = e12;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.overlay = colorStyles;
        this.contentScale = contentScale;
        this.rcPackage = r19;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.ignoreTopWindowInsets = z15;
        this.overrides = overrides;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoComponentStyle copy$default(VideoComponentStyle videoComponentStyle, NonEmptyMap nonEmptyMap, NonEmptyMap nonEmptyMap2, boolean z10, boolean z11, boolean z12, boolean z13, Size size, boolean z14, A a10, A a11, E1 e12, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, InterfaceC1680f interfaceC1680f, Package r33, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, boolean z15, List list, int i10, Object obj) {
        List list2;
        boolean z16;
        NonEmptyMap nonEmptyMap3 = (i10 & 1) != 0 ? videoComponentStyle.sources : nonEmptyMap;
        NonEmptyMap nonEmptyMap4 = (i10 & 2) != 0 ? videoComponentStyle.fallbackSources : nonEmptyMap2;
        boolean z17 = (i10 & 4) != 0 ? videoComponentStyle.showControls : z10;
        boolean z18 = (i10 & 8) != 0 ? videoComponentStyle.autoplay : z11;
        boolean z19 = (i10 & 16) != 0 ? videoComponentStyle.loop : z12;
        boolean z20 = (i10 & 32) != 0 ? videoComponentStyle.muteAudio : z13;
        Size size2 = (i10 & 64) != 0 ? videoComponentStyle.size : size;
        boolean z21 = (i10 & 128) != 0 ? videoComponentStyle.visible : z14;
        A a12 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? videoComponentStyle.padding : a10;
        A a13 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? videoComponentStyle.margin : a11;
        E1 e13 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? videoComponentStyle.shape : e12;
        BorderStyles borderStyles2 = (i10 & 2048) != 0 ? videoComponentStyle.border : borderStyles;
        ShadowStyles shadowStyles2 = (i10 & 4096) != 0 ? videoComponentStyle.shadow : shadowStyles;
        ColorStyles colorStyles2 = (i10 & 8192) != 0 ? videoComponentStyle.overlay : colorStyles;
        NonEmptyMap nonEmptyMap5 = nonEmptyMap3;
        InterfaceC1680f interfaceC1680f2 = (i10 & 16384) != 0 ? videoComponentStyle.contentScale : interfaceC1680f;
        Package r19 = (i10 & 32768) != 0 ? videoComponentStyle.rcPackage : r33;
        ResolvedOffer resolvedOffer2 = (i10 & 65536) != 0 ? videoComponentStyle.resolvedOffer : resolvedOffer;
        Integer num2 = (i10 & 131072) != 0 ? videoComponentStyle.tabIndex : num;
        OfferEligibility offerEligibility2 = (i10 & 262144) != 0 ? videoComponentStyle.offerEligibility : offerEligibility;
        boolean z22 = (i10 & 524288) != 0 ? videoComponentStyle.ignoreTopWindowInsets : z15;
        if ((i10 & 1048576) != 0) {
            z16 = z22;
            list2 = videoComponentStyle.overrides;
        } else {
            list2 = list;
            z16 = z22;
        }
        return videoComponentStyle.copy(nonEmptyMap5, nonEmptyMap4, z17, z18, z19, z20, size2, z21, a12, a13, e13, borderStyles2, shadowStyles2, colorStyles2, interfaceC1680f2, r19, resolvedOffer2, num2, offerEligibility2, z16, list2);
    }

    public final NonEmptyMap<LocaleId, ThemeVideoUrls> component1() {
        return this.sources;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final A getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final E1 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BorderStyles getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ShadowStyles getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ColorStyles getOverlay() {
        return this.overlay;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final InterfaceC1680f getContentScale() {
        return this.contentScale;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Package getRcPackage() {
        return this.rcPackage;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getTabIndex() {
        return this.tabIndex;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final NonEmptyMap<LocaleId, ThemeImageUrls> component2() {
        return this.fallbackSources;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIgnoreTopWindowInsets() {
        return this.ignoreTopWindowInsets;
    }

    public final List<PresentedOverride<PresentedVideoPartial>> component21() {
        return this.overrides;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowControls() {
        return this.showControls;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAutoplay() {
        return this.autoplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLoop() {
        return this.loop;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getMuteAudio() {
        return this.muteAudio;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final A getPadding() {
        return this.padding;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i10);
    }

    public final VideoComponentStyle copy(NonEmptyMap<LocaleId, ThemeVideoUrls> sources, NonEmptyMap<LocaleId, ThemeImageUrls> fallbackSources, boolean showControls, boolean autoplay, boolean loop, boolean muteAudio, Size size, boolean visible, A padding, A margin, E1 shape, BorderStyles border, ShadowStyles shadow, ColorStyles overlay, InterfaceC1680f contentScale, Package rcPackage, ResolvedOffer resolvedOffer, Integer tabIndex, OfferEligibility offerEligibility, boolean ignoreTopWindowInsets, List<PresentedOverride<PresentedVideoPartial>> overrides) {
        AbstractC5504s.h(sources, "sources");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(contentScale, "contentScale");
        AbstractC5504s.h(overrides, "overrides");
        return new VideoComponentStyle(sources, fallbackSources, showControls, autoplay, loop, muteAudio, size, visible, padding, margin, shape, border, shadow, overlay, contentScale, rcPackage, resolvedOffer, tabIndex, offerEligibility, ignoreTopWindowInsets, overrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoComponentStyle)) {
            return false;
        }
        VideoComponentStyle videoComponentStyle = (VideoComponentStyle) other;
        return AbstractC5504s.c(this.sources, videoComponentStyle.sources) && AbstractC5504s.c(this.fallbackSources, videoComponentStyle.fallbackSources) && this.showControls == videoComponentStyle.showControls && this.autoplay == videoComponentStyle.autoplay && this.loop == videoComponentStyle.loop && this.muteAudio == videoComponentStyle.muteAudio && AbstractC5504s.c(this.size, videoComponentStyle.size) && this.visible == videoComponentStyle.visible && AbstractC5504s.c(this.padding, videoComponentStyle.padding) && AbstractC5504s.c(this.margin, videoComponentStyle.margin) && AbstractC5504s.c(this.shape, videoComponentStyle.shape) && AbstractC5504s.c(this.border, videoComponentStyle.border) && AbstractC5504s.c(this.shadow, videoComponentStyle.shadow) && AbstractC5504s.c(this.overlay, videoComponentStyle.overlay) && AbstractC5504s.c(this.contentScale, videoComponentStyle.contentScale) && AbstractC5504s.c(this.rcPackage, videoComponentStyle.rcPackage) && AbstractC5504s.c(this.resolvedOffer, videoComponentStyle.resolvedOffer) && AbstractC5504s.c(this.tabIndex, videoComponentStyle.tabIndex) && AbstractC5504s.c(this.offerEligibility, videoComponentStyle.offerEligibility) && this.ignoreTopWindowInsets == videoComponentStyle.ignoreTopWindowInsets && AbstractC5504s.c(this.overrides, videoComponentStyle.overrides);
    }

    public final /* synthetic */ boolean getAutoplay() {
        return this.autoplay;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ InterfaceC1680f getContentScale() {
        return this.contentScale;
    }

    public final /* synthetic */ NonEmptyMap getFallbackSources() {
        return this.fallbackSources;
    }

    public final /* synthetic */ boolean getIgnoreTopWindowInsets() {
        return this.ignoreTopWindowInsets;
    }

    public final /* synthetic */ boolean getLoop() {
        return this.loop;
    }

    public final /* synthetic */ A getMargin() {
        return this.margin;
    }

    public final /* synthetic */ boolean getMuteAudio() {
        return this.muteAudio;
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

    public final /* synthetic */ boolean getShowControls() {
        return this.showControls;
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
        int iHashCode = this.sources.hashCode() * 31;
        NonEmptyMap<LocaleId, ThemeImageUrls> nonEmptyMap = this.fallbackSources;
        int iHashCode2 = (((((((((((((((((iHashCode + (nonEmptyMap == null ? 0 : nonEmptyMap.hashCode())) * 31) + Boolean.hashCode(this.showControls)) * 31) + Boolean.hashCode(this.autoplay)) * 31) + Boolean.hashCode(this.loop)) * 31) + Boolean.hashCode(this.muteAudio)) * 31) + this.size.hashCode()) * 31) + Boolean.hashCode(this.visible)) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        E1 e12 = this.shape;
        int iHashCode3 = (iHashCode2 + (e12 == null ? 0 : e12.hashCode())) * 31;
        BorderStyles borderStyles = this.border;
        int iHashCode4 = (iHashCode3 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int iHashCode5 = (iHashCode4 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        ColorStyles colorStyles = this.overlay;
        int iHashCode6 = (((iHashCode5 + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31) + this.contentScale.hashCode()) * 31;
        Package r12 = this.rcPackage;
        int iHashCode7 = (iHashCode6 + (r12 == null ? 0 : r12.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int iHashCode8 = (iHashCode7 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        return ((((iHashCode9 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + Boolean.hashCode(this.ignoreTopWindowInsets)) * 31) + this.overrides.hashCode();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "VideoComponentStyle(sources=" + this.sources + ", fallbackSources=" + this.fallbackSources + ", showControls=" + this.showControls + ", autoplay=" + this.autoplay + ", loop=" + this.loop + ", muteAudio=" + this.muteAudio + ", size=" + this.size + ", visible=" + this.visible + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", overlay=" + this.overlay + ", contentScale=" + this.contentScale + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", ignoreTopWindowInsets=" + this.ignoreTopWindowInsets + ", overrides=" + this.overrides + ')';
    }

    public /* synthetic */ VideoComponentStyle(NonEmptyMap nonEmptyMap, NonEmptyMap nonEmptyMap2, boolean z10, boolean z11, boolean z12, boolean z13, Size size, boolean z14, A a10, A a11, E1 e12, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, InterfaceC1680f interfaceC1680f, Package r40, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, boolean z15, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nonEmptyMap, nonEmptyMap2, z10, z11, z12, z13, size, z14, a10, a11, e12, borderStyles, shadowStyles, colorStyles, interfaceC1680f, r40, (i10 & 65536) != 0 ? null : resolvedOffer, num, (i10 & 262144) != 0 ? null : offerEligibility, (i10 & 524288) != 0 ? false : z15, list);
    }
}
