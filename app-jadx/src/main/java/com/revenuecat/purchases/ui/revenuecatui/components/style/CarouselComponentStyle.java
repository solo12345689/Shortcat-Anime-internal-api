package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import i1.C5015h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b,\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0086\u0001\u0087\u0001B×\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b5\u00106J\u0016\u00109\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u0016\u0010;\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u00108J\u0012\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0010\u0010A\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bI\u00104J\u0012\u0010J\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u001c\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0003HÆ\u0003¢\u0006\u0004\bT\u0010.J\u0089\u0002\u0010W\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0014\b\u0002\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0003HÆ\u0001ø\u0001\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010Y\u001a\u00020XHÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b[\u00100J\u001a\u0010^\u001a\u00020\n2\b\u0010]\u001a\u0004\u0018\u00010\\HÖ\u0003¢\u0006\u0004\b^\u0010_R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010`\u001a\u0004\ba\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010b\u001a\u0004\bc\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010d\u001a\u0004\be\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010f\u001a\u0004\bg\u00104R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010h\u001a\u0004\bi\u00106R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010j\u001a\u0004\bk\u00108R\u001d\u0010\u0010\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010j\u001a\u0004\bl\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010m\u001a\u0004\bn\u0010=R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010o\u001a\u0004\bp\u0010?R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010o\u001a\u0004\bq\u0010?R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010r\u001a\u0004\bs\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010t\u001a\u0004\bu\u0010DR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010v\u001a\u0004\bw\u0010FR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010x\u001a\u0004\by\u0010HR\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010f\u001a\u0004\bz\u00104R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010{\u001a\u0004\b|\u0010KR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010}\u001a\u0004\b~\u0010MR\u001d\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b$\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010OR\u001e\u0010%\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010QR\u001e\u0010'\u001a\u0004\u0018\u00010&8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010SR$\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00038\u0006¢\u0006\r\n\u0004\b*\u0010`\u001a\u0005\b\u0085\u0001\u0010.\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "pages", "", "initialPageIndex", "Ll0/e$c;", "pageAlignment", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Li1/h;", "pagePeek", "pageSpacing", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "pageControl", "loop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedCarouselPartial;", "overrides", "<init>", "(Ljava/util/List;ILl0/e$c;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FFLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;ZLcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Ll0/e$c;", "component4", "()Z", "component5", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "component6-D9Ej5fM", "()F", "component6", "component7-D9Ej5fM", "component7", "component8", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "component9", "()LC/A;", "component10", "component11", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "component12", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "component13", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "component14", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "component15", "component16", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "component17", "()Lcom/revenuecat/purchases/Package;", "component18", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "component19", "()Ljava/lang/Integer;", "component20", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "component21", "copy-aesFJdY", "(Ljava/util/List;ILl0/e$c;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FFLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;ZLcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPages", "I", "getInitialPageIndex", "Ll0/e$c;", "getPageAlignment", "Z", "getVisible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "F", "getPagePeek-D9Ej5fM", "getPageSpacing-D9Ej5fM", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "getBackground", "LC/A;", "getPadding", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "getBorder", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "getShadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "getPageControl", "getLoop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance", "Lcom/revenuecat/purchases/Package;", "getRcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getResolvedOffer", "Ljava/lang/Integer;", "getTabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOfferEligibility", "getOverrides", "IndicatorStyles", "PageControlStyles", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CarouselComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final CarouselComponent.AutoAdvancePages autoAdvance;
    private final BackgroundStyles background;
    private final BorderStyles border;
    private final int initialPageIndex;
    private final boolean loop;
    private final A margin;
    private final OfferEligibility offerEligibility;
    private final List<PresentedOverride<PresentedCarouselPartial>> overrides;
    private final A padding;
    private final e.c pageAlignment;
    private final PageControlStyles pageControl;
    private final float pagePeek;
    private final float pageSpacing;
    private final List<StackComponentStyle> pages;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final ShadowStyles shadow;
    private final Shape shape;
    private final Size size;
    private final Integer tabIndex;
    private final boolean visible;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b(\u0010\u0011R\u001f\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0014\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;", "", "Li1/h;", "width", "height", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "color", "strokeColor", "strokeWidth", "<init>", "(FFLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Li1/h;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "component4", "component5-lTKBWiU", "()Li1/h;", "component5", "copy-EwDJqH8", "(FFLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Li1/h;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getWidth-D9Ej5fM", "getHeight-D9Ej5fM", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getColor", "getStrokeColor", "Li1/h;", "getStrokeWidth-lTKBWiU", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IndicatorStyles {
        public static final int $stable = 0;
        private final ColorStyles color;
        private final float height;
        private final ColorStyles strokeColor;
        private final C5015h strokeWidth;
        private final float width;

        public /* synthetic */ IndicatorStyles(float f10, float f11, ColorStyles colorStyles, ColorStyles colorStyles2, C5015h c5015h, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, colorStyles, colorStyles2, c5015h);
        }

        /* JADX INFO: renamed from: copy-EwDJqH8$default */
        public static /* synthetic */ IndicatorStyles m515copyEwDJqH8$default(IndicatorStyles indicatorStyles, float f10, float f11, ColorStyles colorStyles, ColorStyles colorStyles2, C5015h c5015h, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = indicatorStyles.width;
            }
            if ((i10 & 2) != 0) {
                f11 = indicatorStyles.height;
            }
            if ((i10 & 4) != 0) {
                colorStyles = indicatorStyles.color;
            }
            if ((i10 & 8) != 0) {
                colorStyles2 = indicatorStyles.strokeColor;
            }
            if ((i10 & 16) != 0) {
                c5015h = indicatorStyles.strokeWidth;
            }
            C5015h c5015h2 = c5015h;
            ColorStyles colorStyles3 = colorStyles;
            return indicatorStyles.m519copyEwDJqH8(f10, f11, colorStyles3, colorStyles2, c5015h2);
        }

        /* JADX INFO: renamed from: component1-D9Ej5fM, reason: from getter */
        public final float getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2-D9Ej5fM, reason: from getter */
        public final float getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ColorStyles getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ColorStyles getStrokeColor() {
            return this.strokeColor;
        }

        /* JADX INFO: renamed from: component5-lTKBWiU, reason: from getter */
        public final C5015h getStrokeWidth() {
            return this.strokeWidth;
        }

        /* JADX INFO: renamed from: copy-EwDJqH8 */
        public final IndicatorStyles m519copyEwDJqH8(float width, float height, ColorStyles color, ColorStyles strokeColor, C5015h strokeWidth) {
            AbstractC5504s.h(color, "color");
            return new IndicatorStyles(width, height, color, strokeColor, strokeWidth, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndicatorStyles)) {
                return false;
            }
            IndicatorStyles indicatorStyles = (IndicatorStyles) other;
            return C5015h.q(this.width, indicatorStyles.width) && C5015h.q(this.height, indicatorStyles.height) && AbstractC5504s.c(this.color, indicatorStyles.color) && AbstractC5504s.c(this.strokeColor, indicatorStyles.strokeColor) && AbstractC5504s.c(this.strokeWidth, indicatorStyles.strokeWidth);
        }

        public final /* synthetic */ ColorStyles getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: getHeight-D9Ej5fM */
        public final /* synthetic */ float m520getHeightD9Ej5fM() {
            return this.height;
        }

        public final /* synthetic */ ColorStyles getStrokeColor() {
            return this.strokeColor;
        }

        /* JADX INFO: renamed from: getStrokeWidth-lTKBWiU */
        public final /* synthetic */ C5015h m521getStrokeWidthlTKBWiU() {
            return this.strokeWidth;
        }

        /* JADX INFO: renamed from: getWidth-D9Ej5fM */
        public final /* synthetic */ float m522getWidthD9Ej5fM() {
            return this.width;
        }

        public int hashCode() {
            int iR = ((((C5015h.r(this.width) * 31) + C5015h.r(this.height)) * 31) + this.color.hashCode()) * 31;
            ColorStyles colorStyles = this.strokeColor;
            int iHashCode = (iR + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31;
            C5015h c5015h = this.strokeWidth;
            return iHashCode + (c5015h != null ? C5015h.r(c5015h.t()) : 0);
        }

        public String toString() {
            return "IndicatorStyles(width=" + ((Object) C5015h.s(this.width)) + ", height=" + ((Object) C5015h.s(this.height)) + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }

        private IndicatorStyles(float f10, float f11, ColorStyles color, ColorStyles colorStyles, C5015h c5015h) {
            AbstractC5504s.h(color, "color");
            this.width = f10;
            this.height = f11;
            this.color = color;
            this.strokeColor = colorStyles;
            this.strokeWidth = c5015h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001a\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b(\u0010'J}\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b<\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010%R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010'R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bG\u0010'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "position", "Li1/h;", "spacing", "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;", AppStateModule.APP_STATE_ACTIVE, "default", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;FLC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "component2-D9Ej5fM", "()F", "component2", "component3", "()LC/A;", "component4", "component5", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "component6", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "component7", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "component8", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "component9", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;", "component10", "copy-jfnsLPA", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;FLC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "getPosition", "F", "getSpacing-D9Ej5fM", "LC/A;", "getPadding", "getMargin", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getBackgroundColor", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "getBorder", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "getShadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$IndicatorStyles;", "getActive", "getDefault", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PageControlStyles {
        public static final int $stable = 0;
        private final IndicatorStyles active;
        private final ColorStyles backgroundColor;
        private final BorderStyles border;
        private final IndicatorStyles default;
        private final A margin;
        private final A padding;
        private final CarouselComponent.PageControl.Position position;
        private final ShadowStyles shadow;
        private final Shape shape;
        private final float spacing;

        public /* synthetic */ PageControlStyles(CarouselComponent.PageControl.Position position, float f10, A a10, A a11, ColorStyles colorStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, IndicatorStyles indicatorStyles, IndicatorStyles indicatorStyles2, DefaultConstructorMarker defaultConstructorMarker) {
            this(position, f10, a10, a11, colorStyles, shape, borderStyles, shadowStyles, indicatorStyles, indicatorStyles2);
        }

        /* JADX INFO: renamed from: copy-jfnsLPA$default */
        public static /* synthetic */ PageControlStyles m523copyjfnsLPA$default(PageControlStyles pageControlStyles, CarouselComponent.PageControl.Position position, float f10, A a10, A a11, ColorStyles colorStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, IndicatorStyles indicatorStyles, IndicatorStyles indicatorStyles2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                position = pageControlStyles.position;
            }
            if ((i10 & 2) != 0) {
                f10 = pageControlStyles.spacing;
            }
            if ((i10 & 4) != 0) {
                a10 = pageControlStyles.padding;
            }
            if ((i10 & 8) != 0) {
                a11 = pageControlStyles.margin;
            }
            if ((i10 & 16) != 0) {
                colorStyles = pageControlStyles.backgroundColor;
            }
            if ((i10 & 32) != 0) {
                shape = pageControlStyles.shape;
            }
            if ((i10 & 64) != 0) {
                borderStyles = pageControlStyles.border;
            }
            if ((i10 & 128) != 0) {
                shadowStyles = pageControlStyles.shadow;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                indicatorStyles = pageControlStyles.active;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                indicatorStyles2 = pageControlStyles.default;
            }
            IndicatorStyles indicatorStyles3 = indicatorStyles;
            IndicatorStyles indicatorStyles4 = indicatorStyles2;
            BorderStyles borderStyles2 = borderStyles;
            ShadowStyles shadowStyles2 = shadowStyles;
            ColorStyles colorStyles2 = colorStyles;
            Shape shape2 = shape;
            return pageControlStyles.m525copyjfnsLPA(position, f10, a10, a11, colorStyles2, shape2, borderStyles2, shadowStyles2, indicatorStyles3, indicatorStyles4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CarouselComponent.PageControl.Position getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final IndicatorStyles getDefault() {
            return this.default;
        }

        /* JADX INFO: renamed from: component2-D9Ej5fM, reason: from getter */
        public final float getSpacing() {
            return this.spacing;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final A getPadding() {
            return this.padding;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final A getMargin() {
            return this.margin;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ColorStyles getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Shape getShape() {
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
        public final IndicatorStyles getActive() {
            return this.active;
        }

        /* JADX INFO: renamed from: copy-jfnsLPA */
        public final PageControlStyles m525copyjfnsLPA(CarouselComponent.PageControl.Position position, float spacing, A padding, A margin, ColorStyles backgroundColor, Shape shape, BorderStyles border, ShadowStyles shadow, IndicatorStyles indicatorStyles, IndicatorStyles indicatorStyles2) {
            AbstractC5504s.h(position, "position");
            AbstractC5504s.h(padding, "padding");
            AbstractC5504s.h(margin, "margin");
            AbstractC5504s.h(shape, "shape");
            AbstractC5504s.h(indicatorStyles, "active");
            AbstractC5504s.h(indicatorStyles2, "default");
            return new PageControlStyles(position, spacing, padding, margin, backgroundColor, shape, border, shadow, indicatorStyles, indicatorStyles2, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageControlStyles)) {
                return false;
            }
            PageControlStyles pageControlStyles = (PageControlStyles) other;
            return this.position == pageControlStyles.position && C5015h.q(this.spacing, pageControlStyles.spacing) && AbstractC5504s.c(this.padding, pageControlStyles.padding) && AbstractC5504s.c(this.margin, pageControlStyles.margin) && AbstractC5504s.c(this.backgroundColor, pageControlStyles.backgroundColor) && AbstractC5504s.c(this.shape, pageControlStyles.shape) && AbstractC5504s.c(this.border, pageControlStyles.border) && AbstractC5504s.c(this.shadow, pageControlStyles.shadow) && AbstractC5504s.c(this.active, pageControlStyles.active) && AbstractC5504s.c(this.default, pageControlStyles.default);
        }

        public final /* synthetic */ IndicatorStyles getActive() {
            return this.active;
        }

        public final /* synthetic */ ColorStyles getBackgroundColor() {
            return this.backgroundColor;
        }

        public final /* synthetic */ BorderStyles getBorder() {
            return this.border;
        }

        public final /* synthetic */ IndicatorStyles getDefault() {
            return this.default;
        }

        public final /* synthetic */ A getMargin() {
            return this.margin;
        }

        public final /* synthetic */ A getPadding() {
            return this.padding;
        }

        public final /* synthetic */ CarouselComponent.PageControl.Position getPosition() {
            return this.position;
        }

        public final /* synthetic */ ShadowStyles getShadow() {
            return this.shadow;
        }

        public final /* synthetic */ Shape getShape() {
            return this.shape;
        }

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float m526getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public int hashCode() {
            int iHashCode = ((((((this.position.hashCode() * 31) + C5015h.r(this.spacing)) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
            ColorStyles colorStyles = this.backgroundColor;
            int iHashCode2 = (((iHashCode + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31) + this.shape.hashCode()) * 31;
            BorderStyles borderStyles = this.border;
            int iHashCode3 = (iHashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
            ShadowStyles shadowStyles = this.shadow;
            return ((((iHashCode3 + (shadowStyles != null ? shadowStyles.hashCode() : 0)) * 31) + this.active.hashCode()) * 31) + this.default.hashCode();
        }

        public String toString() {
            return "PageControlStyles(position=" + this.position + ", spacing=" + ((Object) C5015h.s(this.spacing)) + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", active=" + this.active + ", default=" + this.default + ')';
        }

        private PageControlStyles(CarouselComponent.PageControl.Position position, float f10, A padding, A margin, ColorStyles colorStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, IndicatorStyles active, IndicatorStyles indicatorStyles) {
            AbstractC5504s.h(position, "position");
            AbstractC5504s.h(padding, "padding");
            AbstractC5504s.h(margin, "margin");
            AbstractC5504s.h(shape, "shape");
            AbstractC5504s.h(active, "active");
            AbstractC5504s.h(indicatorStyles, "default");
            this.position = position;
            this.spacing = f10;
            this.padding = padding;
            this.margin = margin;
            this.backgroundColor = colorStyles;
            this.shape = shape;
            this.border = borderStyles;
            this.shadow = shadowStyles;
            this.active = active;
            this.default = indicatorStyles;
        }
    }

    public /* synthetic */ CarouselComponentStyle(List list, int i10, e.c cVar, boolean z10, Size size, float f10, float f11, BackgroundStyles backgroundStyles, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z11, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r17, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i10, cVar, z10, size, f10, f11, backgroundStyles, a10, a11, shape, borderStyles, shadowStyles, pageControlStyles, z11, autoAdvancePages, r17, resolvedOffer, num, offerEligibility, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-aesFJdY$default */
    public static /* synthetic */ CarouselComponentStyle m509copyaesFJdY$default(CarouselComponentStyle carouselComponentStyle, List list, int i10, e.c cVar, boolean z10, Size size, float f10, float f11, BackgroundStyles backgroundStyles, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z11, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r34, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, int i11, Object obj) {
        List list3;
        OfferEligibility offerEligibility2;
        List list4 = (i11 & 1) != 0 ? carouselComponentStyle.pages : list;
        int i12 = (i11 & 2) != 0 ? carouselComponentStyle.initialPageIndex : i10;
        e.c cVar2 = (i11 & 4) != 0 ? carouselComponentStyle.pageAlignment : cVar;
        boolean z12 = (i11 & 8) != 0 ? carouselComponentStyle.visible : z10;
        Size size2 = (i11 & 16) != 0 ? carouselComponentStyle.size : size;
        float f12 = (i11 & 32) != 0 ? carouselComponentStyle.pagePeek : f10;
        float f13 = (i11 & 64) != 0 ? carouselComponentStyle.pageSpacing : f11;
        BackgroundStyles backgroundStyles2 = (i11 & 128) != 0 ? carouselComponentStyle.background : backgroundStyles;
        A a12 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? carouselComponentStyle.padding : a10;
        A a13 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? carouselComponentStyle.margin : a11;
        Shape shape2 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? carouselComponentStyle.shape : shape;
        BorderStyles borderStyles2 = (i11 & 2048) != 0 ? carouselComponentStyle.border : borderStyles;
        ShadowStyles shadowStyles2 = (i11 & 4096) != 0 ? carouselComponentStyle.shadow : shadowStyles;
        PageControlStyles pageControlStyles2 = (i11 & 8192) != 0 ? carouselComponentStyle.pageControl : pageControlStyles;
        List list5 = list4;
        boolean z13 = (i11 & 16384) != 0 ? carouselComponentStyle.loop : z11;
        CarouselComponent.AutoAdvancePages autoAdvancePages2 = (i11 & 32768) != 0 ? carouselComponentStyle.autoAdvance : autoAdvancePages;
        Package r20 = (i11 & 65536) != 0 ? carouselComponentStyle.rcPackage : r34;
        ResolvedOffer resolvedOffer2 = (i11 & 131072) != 0 ? carouselComponentStyle.resolvedOffer : resolvedOffer;
        Integer num2 = (i11 & 262144) != 0 ? carouselComponentStyle.tabIndex : num;
        OfferEligibility offerEligibility3 = (i11 & 524288) != 0 ? carouselComponentStyle.offerEligibility : offerEligibility;
        if ((i11 & 1048576) != 0) {
            offerEligibility2 = offerEligibility3;
            list3 = carouselComponentStyle.overrides;
        } else {
            list3 = list2;
            offerEligibility2 = offerEligibility3;
        }
        return carouselComponentStyle.m512copyaesFJdY(list5, i12, cVar2, z12, size2, f12, f13, backgroundStyles2, a12, a13, shape2, borderStyles2, shadowStyles2, pageControlStyles2, z13, autoAdvancePages2, r20, resolvedOffer2, num2, offerEligibility2, list3);
    }

    public final List<StackComponentStyle> component1() {
        return this.pages;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final A getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Shape getShape() {
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
    public final PageControlStyles getPageControl() {
        return this.pageControl;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getLoop() {
        return this.loop;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Package getRcPackage() {
        return this.rcPackage;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getTabIndex() {
        return this.tabIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getInitialPageIndex() {
        return this.initialPageIndex;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final List<PresentedOverride<PresentedCarouselPartial>> component21() {
        return this.overrides;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final e.c getPageAlignment() {
        return this.pageAlignment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: from getter */
    public final float getPagePeek() {
        return this.pagePeek;
    }

    /* JADX INFO: renamed from: component7-D9Ej5fM, reason: from getter */
    public final float getPageSpacing() {
        return this.pageSpacing;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BackgroundStyles getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final A getPadding() {
        return this.padding;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i10);
    }

    /* JADX INFO: renamed from: copy-aesFJdY */
    public final CarouselComponentStyle m512copyaesFJdY(List<StackComponentStyle> pages, int initialPageIndex, e.c pageAlignment, boolean visible, Size size, float pagePeek, float pageSpacing, BackgroundStyles backgroundStyles, A padding, A margin, Shape shape, BorderStyles border, ShadowStyles shadow, PageControlStyles pageControl, boolean loop, CarouselComponent.AutoAdvancePages autoAdvance, Package rcPackage, ResolvedOffer resolvedOffer, Integer tabIndex, OfferEligibility offerEligibility, List<PresentedOverride<PresentedCarouselPartial>> overrides) {
        AbstractC5504s.h(pages, "pages");
        AbstractC5504s.h(pageAlignment, "pageAlignment");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(overrides, "overrides");
        return new CarouselComponentStyle(pages, initialPageIndex, pageAlignment, visible, size, pagePeek, pageSpacing, backgroundStyles, padding, margin, shape, border, shadow, pageControl, loop, autoAdvance, rcPackage, resolvedOffer, tabIndex, offerEligibility, overrides, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselComponentStyle)) {
            return false;
        }
        CarouselComponentStyle carouselComponentStyle = (CarouselComponentStyle) other;
        return AbstractC5504s.c(this.pages, carouselComponentStyle.pages) && this.initialPageIndex == carouselComponentStyle.initialPageIndex && AbstractC5504s.c(this.pageAlignment, carouselComponentStyle.pageAlignment) && this.visible == carouselComponentStyle.visible && AbstractC5504s.c(this.size, carouselComponentStyle.size) && C5015h.q(this.pagePeek, carouselComponentStyle.pagePeek) && C5015h.q(this.pageSpacing, carouselComponentStyle.pageSpacing) && AbstractC5504s.c(this.background, carouselComponentStyle.background) && AbstractC5504s.c(this.padding, carouselComponentStyle.padding) && AbstractC5504s.c(this.margin, carouselComponentStyle.margin) && AbstractC5504s.c(this.shape, carouselComponentStyle.shape) && AbstractC5504s.c(this.border, carouselComponentStyle.border) && AbstractC5504s.c(this.shadow, carouselComponentStyle.shadow) && AbstractC5504s.c(this.pageControl, carouselComponentStyle.pageControl) && this.loop == carouselComponentStyle.loop && AbstractC5504s.c(this.autoAdvance, carouselComponentStyle.autoAdvance) && AbstractC5504s.c(this.rcPackage, carouselComponentStyle.rcPackage) && AbstractC5504s.c(this.resolvedOffer, carouselComponentStyle.resolvedOffer) && AbstractC5504s.c(this.tabIndex, carouselComponentStyle.tabIndex) && AbstractC5504s.c(this.offerEligibility, carouselComponentStyle.offerEligibility) && AbstractC5504s.c(this.overrides, carouselComponentStyle.overrides);
    }

    public final /* synthetic */ CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return this.background;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ int getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final /* synthetic */ boolean getLoop() {
        return this.loop;
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

    public final /* synthetic */ e.c getPageAlignment() {
        return this.pageAlignment;
    }

    public final /* synthetic */ PageControlStyles getPageControl() {
        return this.pageControl;
    }

    /* JADX INFO: renamed from: getPagePeek-D9Ej5fM */
    public final /* synthetic */ float m513getPagePeekD9Ej5fM() {
        return this.pagePeek;
    }

    /* JADX INFO: renamed from: getPageSpacing-D9Ej5fM */
    public final /* synthetic */ float m514getPageSpacingD9Ej5fM() {
        return this.pageSpacing;
    }

    public final /* synthetic */ List getPages() {
        return this.pages;
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

    public final /* synthetic */ Shape getShape() {
        return this.shape;
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

    public int hashCode() {
        int iHashCode = ((((((((((((this.pages.hashCode() * 31) + Integer.hashCode(this.initialPageIndex)) * 31) + this.pageAlignment.hashCode()) * 31) + Boolean.hashCode(this.visible)) * 31) + this.size.hashCode()) * 31) + C5015h.r(this.pagePeek)) * 31) + C5015h.r(this.pageSpacing)) * 31;
        BackgroundStyles backgroundStyles = this.background;
        int iHashCode2 = (((((((iHashCode + (backgroundStyles == null ? 0 : backgroundStyles.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.shape.hashCode()) * 31;
        BorderStyles borderStyles = this.border;
        int iHashCode3 = (iHashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int iHashCode4 = (iHashCode3 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        PageControlStyles pageControlStyles = this.pageControl;
        int iHashCode5 = (((iHashCode4 + (pageControlStyles == null ? 0 : pageControlStyles.hashCode())) * 31) + Boolean.hashCode(this.loop)) * 31;
        CarouselComponent.AutoAdvancePages autoAdvancePages = this.autoAdvance;
        int iHashCode6 = (iHashCode5 + (autoAdvancePages == null ? 0 : autoAdvancePages.hashCode())) * 31;
        Package r12 = this.rcPackage;
        int iHashCode7 = (iHashCode6 + (r12 == null ? 0 : r12.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int iHashCode8 = (iHashCode7 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        return ((iHashCode9 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "CarouselComponentStyle(pages=" + this.pages + ", initialPageIndex=" + this.initialPageIndex + ", pageAlignment=" + this.pageAlignment + ", visible=" + this.visible + ", size=" + this.size + ", pagePeek=" + ((Object) C5015h.s(this.pagePeek)) + ", pageSpacing=" + ((Object) C5015h.s(this.pageSpacing)) + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", pageControl=" + this.pageControl + ", loop=" + this.loop + ", autoAdvance=" + this.autoAdvance + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", overrides=" + this.overrides + ')';
    }

    private CarouselComponentStyle(List<StackComponentStyle> pages, int i10, e.c pageAlignment, boolean z10, Size size, float f10, float f11, BackgroundStyles backgroundStyles, A padding, A margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z11, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r19, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List<PresentedOverride<PresentedCarouselPartial>> overrides) {
        AbstractC5504s.h(pages, "pages");
        AbstractC5504s.h(pageAlignment, "pageAlignment");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(overrides, "overrides");
        this.pages = pages;
        this.initialPageIndex = i10;
        this.pageAlignment = pageAlignment;
        this.visible = z10;
        this.size = size;
        this.pagePeek = f10;
        this.pageSpacing = f11;
        this.background = backgroundStyles;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.pageControl = pageControlStyles;
        this.loop = z11;
        this.autoAdvance = autoAdvancePages;
        this.rcPackage = r19;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.overrides = overrides;
    }

    public /* synthetic */ CarouselComponentStyle(List list, int i10, e.c cVar, boolean z10, Size size, float f10, float f11, BackgroundStyles backgroundStyles, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z11, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r42, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i10, cVar, z10, size, f10, f11, backgroundStyles, a10, a11, shape, borderStyles, shadowStyles, pageControlStyles, z11, autoAdvancePages, r42, (i11 & 131072) != 0 ? null : resolvedOffer, num, (i11 & 524288) != 0 ? null : offerEligibility, list2, null);
    }
}
