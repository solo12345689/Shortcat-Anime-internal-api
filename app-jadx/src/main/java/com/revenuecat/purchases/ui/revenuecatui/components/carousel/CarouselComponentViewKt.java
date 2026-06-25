package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import C.A;
import C.InterfaceC1138i;
import G.C;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import Y.m2;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;
import p0.AbstractC5912g;
import s0.AbstractC6387s0;
import s0.C6385r0;
import s0.E1;
import w.AbstractC6892c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u001aM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0015\u001a\u00020\u0007*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0007H\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0007H\u0003¢\u0006\u0004\b&\u0010%\u001a\u000f\u0010'\u001a\u00020\u0007H\u0003¢\u0006\u0004\b'\u0010%\u001aÀ\u0001\u0010B\u001a\u00020\u00002\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010+\u001a\u00020\u00112\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u001c2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u0002062\b\b\u0002\u0010:\u001a\u0002092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010?\u001a\u00020\u001c2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u0019\u0010E\u001a\u00020\u000f2\b\b\u0002\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010F\u001a\u0015\u0010G\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\bG\u0010H\u001a*\u0010O\u001a\u00020)2\u0006\u0010J\u001a\u00020I2\u0006\u00105\u001a\u0002042\u0006\u0010L\u001a\u00020KH\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y²\u0006\f\u0010Q\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010S\u001a\u00020R8\nX\u008a\u0084\u0002²\u0006\f\u0010T\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u0010U\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u0010V\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u0010W\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u0010L\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u0010X\u001a\u0002018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "LZd/e;", "LTd/L;", "", "clickHandler", "Landroidx/compose/ui/e;", "modifier", "CarouselComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V", "LC/i;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "pageControl", "", "pageCount", "LG/C;", "pagerState", "PagerIndicator", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;ILG/C;Landroidx/compose/ui/e;LY/m;II)V", "pageIndex", "Indicator", "(LG/C;IILcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;LY/m;I)V", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "", "shouldLoop", "EnableAutoAdvance", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;LG/C;ZILY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;", "carouselState", "getInitialPage", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;)I", "CarouselComponentView_Preview", "(LY/m;I)V", "CarouselComponentView_Top_Preview", "CarouselComponentView_Loop_Preview", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "pages", "initialPageIndex", "Ll0/e$c;", "alignment", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Li1/h;", "sidePagePeek", "spacing", "Ls0/r0;", "backgroundColor", "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "borderStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadowStyle", "loop", "previewCarouselComponentStyle-2XaYeUA", "(Ljava/util/List;ILl0/e$c;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FFJLC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;ZLcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;", "previewCarouselComponentStyle", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "position", "previewPageControl", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "previewPages", "()Ljava/util/List;", "", "pageText", "LTd/D;", "height", "previewPage-ecKwGiE", "(Ljava/lang/String;JI)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "previewPage", "Ls0/E1;", "composeShape", "", ReactProgressBarViewManager.PROP_PROGRESS, "targetWidth", "targetHeight", "targetStrokeWidth", "width", "strokeWidth", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class CarouselComponentViewKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$CarouselComponentView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ CarouselComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CarouselComponentStyle carouselComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
            this.$style = carouselComponentStyle;
            this.$state = components;
            this.$clickHandler = function2;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CarouselComponentViewKt.CarouselComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$CarouselComponentView$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass7 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ CarouselComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(CarouselComponentStyle carouselComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
            this.$style = carouselComponentStyle;
            this.$state = components;
            this.$clickHandler = function2;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CarouselComponentViewKt.CarouselComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$CarouselComponentView_Loop_Preview$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CarouselComponentViewKt.CarouselComponentView_Loop_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$CarouselComponentView_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41762 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41762(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CarouselComponentViewKt.CarouselComponentView_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$CarouselComponentView_Top_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41772 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41772(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CarouselComponentViewKt.CarouselComponentView_Top_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$EnableAutoAdvance$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41782 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CarouselComponent.AutoAdvancePages $autoAdvance;
        final /* synthetic */ int $pageCount;
        final /* synthetic */ C $pagerState;
        final /* synthetic */ boolean $shouldLoop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41782(CarouselComponent.AutoAdvancePages autoAdvancePages, C c10, boolean z10, int i10, int i11) {
            super(2);
            this.$autoAdvance = autoAdvancePages;
            this.$pagerState = c10;
            this.$shouldLoop = z10;
            this.$pageCount = i10;
            this.$$changed = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CarouselComponentViewKt.EnableAutoAdvance(this.$autoAdvance, this.$pagerState, this.$shouldLoop, this.$pageCount, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$Indicator$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41792 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CarouselComponentStyle.PageControlStyles $pageControl;
        final /* synthetic */ int $pageCount;
        final /* synthetic */ int $pageIndex;
        final /* synthetic */ C $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41792(C c10, int i10, int i11, CarouselComponentStyle.PageControlStyles pageControlStyles, int i12) {
            super(2);
            this.$pagerState = c10;
            this.$pageIndex = i10;
            this.$pageCount = i11;
            this.$pageControl = pageControlStyles;
            this.$$changed = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CarouselComponentViewKt.Indicator(this.$pagerState, this.$pageIndex, this.$pageCount, this.$pageControl, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$PagerIndicator$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ CarouselComponentStyle.PageControlStyles $pageControl;
        final /* synthetic */ int $pageCount;
        final /* synthetic */ C $pagerState;
        final /* synthetic */ InterfaceC1138i $this_PagerIndicator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(InterfaceC1138i interfaceC1138i, CarouselComponentStyle.PageControlStyles pageControlStyles, int i10, C c10, e eVar, int i11, int i12) {
            super(2);
            this.$this_PagerIndicator = interfaceC1138i;
            this.$pageControl = pageControlStyles;
            this.$pageCount = i10;
            this.$pagerState = c10;
            this.$modifier = eVar;
            this.$$changed = i11;
            this.$$default = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CarouselComponentViewKt.PagerIndicator(this.$this_PagerIndicator, this.$pageControl, this.$pageCount, this.$pagerState, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void CarouselComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle r26, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r27, kotlin.jvm.functions.Function2 r28, androidx.compose.ui.e r29, Y.InterfaceC2425m r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt.CarouselComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, kotlin.jvm.functions.Function2, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CarouselComponentView_Loop_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-172536871);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-172536871, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView_Loop_Preview (CarouselComponentView.kt:354)");
            }
            e eVarD = b.d(e.f26613a, C6385r0.f58985b.k(), null, 2, null);
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            CarouselComponentView(m406previewCarouselComponentStyle2XaYeUA$default(null, 0, null, false, null, 0.0f, 0.0f, 0L, null, null, null, null, null, null, true, new CarouselComponent.AutoAdvancePages(1000, 500, CarouselComponent.AutoAdvancePages.TransitionType.FADE), 16383, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new CarouselComponentViewKt$CarouselComponentView_Loop_Preview$1$1(null), null, interfaceC2425mG, 384, 8);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CarouselComponentView_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(697064564);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(697064564, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView_Preview (CarouselComponentView.kt:328)");
            }
            e eVarD = b.d(e.f26613a, C6385r0.f58985b.k(), null, 2, null);
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            CarouselComponentView(m406previewCarouselComponentStyle2XaYeUA$default(null, 0, null, false, null, 0.0f, 0.0f, 0L, null, null, null, null, null, null, false, null, 65535, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new CarouselComponentViewKt$CarouselComponentView_Preview$1$1(null), null, interfaceC2425mG, 384, 8);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41762(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CarouselComponentView_Top_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(897820094);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(897820094, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView_Top_Preview (CarouselComponentView.kt:340)");
            }
            e eVarD = b.d(e.f26613a, C6385r0.f58985b.k(), null, 2, null);
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            CarouselComponentView(m406previewCarouselComponentStyle2XaYeUA$default(null, 0, null, false, null, 0.0f, 0.0f, 0L, null, null, null, null, null, previewPageControl(CarouselComponent.PageControl.Position.TOP), false, null, 57343, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new CarouselComponentViewKt$CarouselComponentView_Top_Preview$1$1(null), null, interfaceC2425mG, 384, 8);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41772(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EnableAutoAdvance(CarouselComponent.AutoAdvancePages autoAdvancePages, C c10, boolean z10, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        CarouselComponent.AutoAdvancePages autoAdvancePages2;
        C c11;
        boolean z11;
        int i13;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-845596149);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425mG.F(autoAdvancePages) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.U(c10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC2425mG.a(z10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC2425mG.c(i10) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            autoAdvancePages2 = autoAdvancePages;
            c11 = c10;
            z11 = z10;
            i13 = i10;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-845596149, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.EnableAutoAdvance (CarouselComponentView.kt:289)");
            }
            L l10 = L.f17438a;
            interfaceC2425mG.V(906902516);
            boolean zF = interfaceC2425mG.F(autoAdvancePages) | ((i12 & 112) == 32) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048);
            Object objD = interfaceC2425mG.D();
            if (zF || objD == InterfaceC2425m.f22370a.a()) {
                autoAdvancePages2 = autoAdvancePages;
                c11 = c10;
                z11 = z10;
                i13 = i10;
                CarouselComponentViewKt$EnableAutoAdvance$1$1 carouselComponentViewKt$EnableAutoAdvance$1$1 = new CarouselComponentViewKt$EnableAutoAdvance$1$1(autoAdvancePages2, c11, z11, i13, null);
                interfaceC2425mG.u(carouselComponentViewKt$EnableAutoAdvance$1$1);
                objD = carouselComponentViewKt$EnableAutoAdvance$1$1;
            } else {
                autoAdvancePages2 = autoAdvancePages;
                c11 = c10;
                z11 = z10;
                i13 = i10;
            }
            interfaceC2425mG.O();
            AbstractC2393b0.e(l10, (Function2) objD, interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            int i14 = i13;
            b1K.a(new C41782(autoAdvancePages2, c11, z11, i14, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Indicator(C c10, int i10, int i11, CarouselComponentStyle.PageControlStyles pageControlStyles, InterfaceC2425m interfaceC2425m, int i12) {
        int i13;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-532758904);
        if ((i12 & 6) == 0) {
            i13 = (interfaceC2425mG.U(c10) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= interfaceC2425mG.c(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= interfaceC2425mG.c(i11) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= interfaceC2425mG.U(pageControlStyles) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i13 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-532758904, i13, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.Indicator (CarouselComponentView.kt:193)");
            }
            interfaceC2425mG.V(-106660265);
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = U1.d(new CarouselComponentViewKt$Indicator$progress$2$1(c10, i11, i10));
                interfaceC2425mG.u(objD);
            }
            h2 h2Var = (h2) objD;
            interfaceC2425mG.O();
            interfaceC2425mG.V(-106632266);
            Object objD2 = interfaceC2425mG.D();
            if (objD2 == aVar.a()) {
                objD2 = U1.d(new CarouselComponentViewKt$Indicator$targetWidth$2$1(pageControlStyles, h2Var));
                interfaceC2425mG.u(objD2);
            }
            h2 h2Var2 = (h2) objD2;
            interfaceC2425mG.O();
            interfaceC2425mG.V(-106625128);
            Object objD3 = interfaceC2425mG.D();
            if (objD3 == aVar.a()) {
                objD3 = U1.d(new CarouselComponentViewKt$Indicator$targetHeight$2$1(pageControlStyles, h2Var));
                interfaceC2425mG.u(objD3);
            }
            h2 h2Var3 = (h2) objD3;
            interfaceC2425mG.O();
            interfaceC2425mG.V(-106617710);
            Object objD4 = interfaceC2425mG.D();
            if (objD4 == aVar.a()) {
                objD4 = U1.d(new CarouselComponentViewKt$Indicator$targetStrokeWidth$2$1(pageControlStyles, h2Var));
                interfaceC2425mG.u(objD4);
            }
            h2 h2Var4 = (h2) objD4;
            interfaceC2425mG.O();
            h2 h2VarC = AbstractC6892c.c(Indicator$lambda$21(h2Var2), null, null, null, interfaceC2425mG, 0, 14);
            h2 h2VarC2 = AbstractC6892c.c(Indicator$lambda$23(h2Var3), null, null, null, interfaceC2425mG, 0, 14);
            ColorStyle forCurrentTheme = ColorStyleKt.getForCurrentTheme(pageControlStyles.getDefault().getColor(), interfaceC2425mG, 0);
            ColorStyle.Solid solid = forCurrentTheme instanceof ColorStyle.Solid ? (ColorStyle.Solid) forCurrentTheme : null;
            long jM476unboximpl = solid != null ? solid.m476unboximpl() : C6385r0.f58985b.i();
            ColorStyle forCurrentTheme2 = ColorStyleKt.getForCurrentTheme(pageControlStyles.getActive().getColor(), interfaceC2425mG, 0);
            ColorStyle.Solid solid2 = forCurrentTheme2 instanceof ColorStyle.Solid ? (ColorStyle.Solid) forCurrentTheme2 : null;
            long jI = AbstractC6387s0.i(jM476unboximpl, solid2 != null ? solid2.m476unboximpl() : C6385r0.f58985b.i(), Indicator$lambda$19(h2Var));
            boolean z10 = ((pageControlStyles.getDefault().getStrokeColor() == null && pageControlStyles.getActive().getStrokeColor() == null) || (pageControlStyles.getDefault().m521getStrokeWidthlTKBWiU() == null && pageControlStyles.getActive().m521getStrokeWidthlTKBWiU() == null)) ? false : true;
            ColorStyles strokeColor = pageControlStyles.getDefault().getStrokeColor();
            interfaceC2425mG.V(-106588769);
            ColorStyle forCurrentTheme3 = strokeColor == null ? null : ColorStyleKt.getForCurrentTheme(strokeColor, interfaceC2425mG, 0);
            interfaceC2425mG.O();
            ColorStyle.Solid solid3 = forCurrentTheme3 instanceof ColorStyle.Solid ? (ColorStyle.Solid) forCurrentTheme3 : null;
            long jM476unboximpl2 = solid3 != null ? solid3.m476unboximpl() : C6385r0.f58985b.i();
            ColorStyles strokeColor2 = pageControlStyles.getActive().getStrokeColor();
            interfaceC2425mG.V(-106585313);
            ColorStyle forCurrentTheme4 = strokeColor2 == null ? null : ColorStyleKt.getForCurrentTheme(strokeColor2, interfaceC2425mG, 0);
            interfaceC2425mG.O();
            ColorStyle.Solid solid4 = forCurrentTheme4 instanceof ColorStyle.Solid ? (ColorStyle.Solid) forCurrentTheme4 : null;
            long jI2 = AbstractC6387s0.i(jM476unboximpl2, solid4 != null ? solid4.m476unboximpl() : C6385r0.f58985b.i(), Indicator$lambda$19(h2Var));
            h2 h2VarC3 = AbstractC6892c.c(Indicator$lambda$25(h2Var4), null, null, null, interfaceC2425mG, 0, 14);
            e eVarS = s.s(b.d(AbstractC5912g.a(p.k(e.f26613a, C5015h.n(pageControlStyles.m526getSpacingD9Ej5fM() / 2), 0.0f, 2, null), ShapeKt.toShape(Shape.Pill.INSTANCE)), jI, null, 2, null), Indicator$lambda$26(h2VarC), Indicator$lambda$27(h2VarC2));
            interfaceC2425mG.V(-106571074);
            boolean zU = interfaceC2425mG.U(h2VarC3) | interfaceC2425mG.d(jI2);
            Object objD5 = interfaceC2425mG.D();
            if (zU || objD5 == aVar.a()) {
                objD5 = new CarouselComponentViewKt$Indicator$1$1(jI2, h2VarC3);
                interfaceC2425mG.u(objD5);
            }
            interfaceC2425mG.O();
            f.a(ModifierExtensionsKt.conditional(eVarS, z10, (Function1) objD5), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41792(c10, i10, i11, pageControlStyles, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Indicator$lambda$19(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    private static final float Indicator$lambda$21(h2 h2Var) {
        return ((C5015h) h2Var.getValue()).t();
    }

    private static final float Indicator$lambda$23(h2 h2Var) {
        return ((C5015h) h2Var.getValue()).t();
    }

    private static final float Indicator$lambda$25(h2 h2Var) {
        return ((C5015h) h2Var.getValue()).t();
    }

    private static final float Indicator$lambda$26(h2 h2Var) {
        return ((C5015h) h2Var.getValue()).t();
    }

    private static final float Indicator$lambda$27(h2 h2Var) {
        return ((C5015h) h2Var.getValue()).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Indicator$lambda$28(h2 h2Var) {
        return ((C5015h) h2Var.getValue()).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023b A[LOOP:0: B:113:0x0239->B:114:0x023b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PagerIndicator(C.InterfaceC1138i r16, com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle.PageControlStyles r17, int r18, G.C r19, androidx.compose.ui.e r20, Y.InterfaceC2425m r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt.PagerIndicator(C.i, com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle$PageControlStyles, int, G.C, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E1 PagerIndicator$lambda$12(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    private static final int getInitialPage(CarouselComponentState carouselComponentState) {
        if (!carouselComponentState.getLoop()) {
            return carouselComponentState.getInitialPageIndex();
        }
        int i10 = 1073741823;
        while (i10 % carouselComponentState.getPages().size() != carouselComponentState.getInitialPageIndex()) {
            i10++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: previewCarouselComponentStyle-2XaYeUA, reason: not valid java name */
    private static final CarouselComponentStyle m405previewCarouselComponentStyle2XaYeUA(List<StackComponentStyle> list, int i10, e.c cVar, boolean z10, Size size, float f10, float f11, long j10, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, CarouselComponentStyle.PageControlStyles pageControlStyles, boolean z11, CarouselComponent.AutoAdvancePages autoAdvancePages) {
        return new CarouselComponentStyle(list, i10, cVar, z10, size, f10, f11, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(j10)), null, 2, null))), a10, a11, shape, borderStyles, shadowStyles, pageControlStyles, z11, autoAdvancePages, null, null, null, null, AbstractC2279u.m(), 655360, null);
    }

    /* JADX INFO: renamed from: previewCarouselComponentStyle-2XaYeUA$default, reason: not valid java name */
    static /* synthetic */ CarouselComponentStyle m406previewCarouselComponentStyle2XaYeUA$default(List list, int i10, e.c cVar, boolean z10, Size size, float f10, float f11, long j10, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, CarouselComponentStyle.PageControlStyles pageControlStyles, boolean z11, CarouselComponent.AutoAdvancePages autoAdvancePages, int i11, Object obj) {
        Size size2;
        List list2;
        int i12;
        e.c cVar2;
        BorderStyles borderStyles2;
        CarouselComponent.AutoAdvancePages autoAdvancePages2;
        CarouselComponentStyle.PageControlStyles pageControlStylesPreviewPageControl$default;
        List listPreviewPages = (i11 & 1) != 0 ? previewPages() : list;
        int i13 = (i11 & 2) != 0 ? 0 : i10;
        e.c cVarI = (i11 & 4) != 0 ? l0.e.f52304a.i() : cVar;
        boolean z12 = (i11 & 8) != 0 ? true : z10;
        if ((i11 & 16) != 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            size2 = new Size(fit, fit);
        } else {
            size2 = size;
        }
        float fN = (i11 & 32) != 0 ? C5015h.n(20) : f10;
        float fN2 = (i11 & 64) != 0 ? C5015h.n(8) : f11;
        long jG = (i11 & 128) != 0 ? C6385r0.f58985b.g() : j10;
        A a12 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? p.a(C5015h.n(0)) : a10;
        A aC = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? p.c(0.0f, C5015h.n(16), 1, null) : a11;
        Shape rectangle = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null) : shape;
        if ((i11 & 2048) != 0) {
            list2 = listPreviewPages;
            i12 = i13;
            cVar2 = cVarI;
            borderStyles2 = new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null);
        } else {
            list2 = listPreviewPages;
            i12 = i13;
            cVar2 = cVarI;
            borderStyles2 = borderStyles;
        }
        ShadowStyles shadowStyles2 = (i11 & 4096) != 0 ? new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null), C5015h.n(5), C5015h.n(0), C5015h.n(3), null) : shadowStyles;
        if ((i11 & 8192) != 0) {
            autoAdvancePages2 = null;
            pageControlStylesPreviewPageControl$default = previewPageControl$default(null, 1, null);
        } else {
            autoAdvancePages2 = null;
            pageControlStylesPreviewPageControl$default = pageControlStyles;
        }
        boolean z13 = (i11 & 16384) != 0 ? false : z11;
        if ((i11 & 32768) != 0) {
            autoAdvancePages = autoAdvancePages2;
        }
        return m405previewCarouselComponentStyle2XaYeUA(list2, i12, cVar2, z12, size2, fN, fN2, jG, a12, aC, rectangle, borderStyles2, shadowStyles2, pageControlStylesPreviewPageControl$default, z13, autoAdvancePages);
    }

    /* JADX INFO: renamed from: previewPage-ecKwGiE, reason: not valid java name */
    private static final StackComponentStyle m407previewPageecKwGiE(String str, long j10, int i10) {
        return new StackComponentStyle(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle(str, (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.CENTER), true, new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fixed(i10, null)), C5015h.n(8), BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(j10)), null, 2, null))), p.c(0.0f, C5015h.n(16), 1, null), p.a(C5015h.n(0)), new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null);
    }

    private static final CarouselComponentStyle.PageControlStyles previewPageControl(CarouselComponent.PageControl.Position position) {
        float f10 = 4;
        float fN = C5015h.n(f10);
        float f11 = 8;
        A a10 = p.a(C5015h.n(f11));
        A a11 = p.a(C5015h.n(f11));
        C6385r0.a aVar = C6385r0.f58985b;
        return new CarouselComponentStyle.PageControlStyles(position, fN, a10, a11, new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.f())), null, 2, null), Shape.Pill.INSTANCE, new BorderStyles(C5015h.n(f10), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.a())), null, 2, null), C5015h.n(20), C5015h.n(f11), C5015h.n(f11), null), new CarouselComponentStyle.IndicatorStyles(C5015h.n(14), C5015h.n(10), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), null, 2, null), C5015h.h(C5015h.n(2)), null), new CarouselComponentStyle.IndicatorStyles(C5015h.n(f11), C5015h.n(f11), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.e())), null, 2, null), null, 0 == true ? 1 : 0, null), null);
    }

    static /* synthetic */ CarouselComponentStyle.PageControlStyles previewPageControl$default(CarouselComponent.PageControl.Position position, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            position = CarouselComponent.PageControl.Position.BOTTOM;
        }
        return previewPageControl(position);
    }

    private static final List<StackComponentStyle> previewPages() {
        C6385r0.a aVar = C6385r0.f58985b;
        return AbstractC2279u.p(m407previewPageecKwGiE("Page 1", aVar.h(), 200), m407previewPageecKwGiE("Page 2", aVar.f(), 100), m407previewPageecKwGiE("Page 3", aVar.b(), 300), m407previewPageecKwGiE("Page 4", aVar.l(), 200));
    }
}
