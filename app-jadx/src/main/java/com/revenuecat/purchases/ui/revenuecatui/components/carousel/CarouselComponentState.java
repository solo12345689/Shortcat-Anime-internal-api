package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import C.A;
import Ud.S;
import Y.C0;
import Y.U1;
import Y.b2;
import Y.h2;
import b4.C2986c;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u00100\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010/R!\u00106\u001a\b\u0012\u0004\u0012\u000202018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010?R!\u0010E\u001a\u00020A8FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010$\u001a\u0004\bC\u0010DR\u001d\u0010J\u001a\u0004\u0018\u00010F8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010$\u001a\u0004\bH\u0010IR!\u0010M\u001a\u00020A8FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010$\u001a\u0004\bL\u0010DR\u001b\u0010R\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010$\u001a\u0004\bP\u0010QR\u001b\u0010U\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010$\u001a\u0004\bT\u0010QR\u001b\u0010Z\u001a\u00020V8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010$\u001a\u0004\bX\u0010YR\u001d\u0010_\u001a\u0004\u0018\u00010[8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010$\u001a\u0004\b]\u0010^R\u001d\u0010d\u001a\u0004\u0018\u00010`8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\ba\u0010$\u001a\u0004\bb\u0010cR\u001d\u0010i\u001a\u0004\u0018\u00010e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010$\u001a\u0004\bg\u0010hR\u001b\u0010l\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bj\u0010$\u001a\u0004\bk\u0010+R\u001d\u0010q\u001a\u0004\u0018\u00010m8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u0010$\u001a\u0004\bo\u0010p\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;", "", "Lb4/c;", "initialWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;", "style", "Lkotlin/Function0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "<init>", "(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V", "windowSize", "LTd/L;", "update", "(Lb4/c;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;", "Lie/a;", "<set-?>", "windowSize$delegate", "LY/C0;", "getWindowSize", "()Lb4/c;", "setWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "packageAwareDelegate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedCarouselPartial;", "presentedPartial$delegate", "LY/h2;", "getPresentedPartial", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedCarouselPartial;", "presentedPartial", "", "visible$delegate", "getVisible", "()Z", "visible", "initialPageIndex$delegate", "getInitialPageIndex", "()I", "initialPageIndex", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "pages$delegate", "getPages", "()Ljava/util/List;", "pages", "Ll0/e$c;", "pageAlignment$delegate", "getPageAlignment", "()Ll0/e$c;", "pageAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size$delegate", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Li1/h;", "pagePeek$delegate", "getPagePeek-D9Ej5fM", "()F", "pagePeek", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "background$delegate", "getBackground", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "pageSpacing$delegate", "getPageSpacing-D9Ej5fM", "pageSpacing", "LC/A;", "padding$delegate", "getPadding", "()LC/A;", "padding", "margin$delegate", "getMargin", "margin", "Ls0/E1;", "shape$delegate", "getShape", "()Ls0/E1;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border$delegate", "getBorder", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow$delegate", "getShadow", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "pageControl$delegate", "getPageControl", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle$PageControlStyles;", "pageControl", "loop$delegate", "getLoop", "loop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance$delegate", "getAutoAdvance", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarouselComponentState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: autoAdvance$delegate, reason: from kotlin metadata */
    private final h2 autoAdvance;

    /* JADX INFO: renamed from: background$delegate, reason: from kotlin metadata */
    private final h2 background;

    /* JADX INFO: renamed from: border$delegate, reason: from kotlin metadata */
    private final h2 border;
    private final InterfaceC5082a customVariablesProvider;

    /* JADX INFO: renamed from: initialPageIndex$delegate, reason: from kotlin metadata */
    private final h2 initialPageIndex;

    /* JADX INFO: renamed from: loop$delegate, reason: from kotlin metadata */
    private final h2 loop;

    /* JADX INFO: renamed from: margin$delegate, reason: from kotlin metadata */
    private final h2 margin;
    private final PackageAwareDelegate packageAwareDelegate;

    /* JADX INFO: renamed from: padding$delegate, reason: from kotlin metadata */
    private final h2 padding;

    /* JADX INFO: renamed from: pageAlignment$delegate, reason: from kotlin metadata */
    private final h2 pageAlignment;

    /* JADX INFO: renamed from: pageControl$delegate, reason: from kotlin metadata */
    private final h2 pageControl;

    /* JADX INFO: renamed from: pagePeek$delegate, reason: from kotlin metadata */
    private final h2 pagePeek;

    /* JADX INFO: renamed from: pageSpacing$delegate, reason: from kotlin metadata */
    private final h2 pageSpacing;

    /* JADX INFO: renamed from: pages$delegate, reason: from kotlin metadata */
    private final h2 pages;

    /* JADX INFO: renamed from: presentedPartial$delegate, reason: from kotlin metadata */
    private final h2 presentedPartial;
    private final InterfaceC5082a selectedOfferEligibilityProvider;
    private final InterfaceC5082a selectedPackageInfoProvider;
    private final InterfaceC5082a selectedTabIndexProvider;

    /* JADX INFO: renamed from: shadow$delegate, reason: from kotlin metadata */
    private final h2 shadow;

    /* JADX INFO: renamed from: shape$delegate, reason: from kotlin metadata */
    private final h2 shape;

    /* JADX INFO: renamed from: size$delegate, reason: from kotlin metadata */
    private final h2 size;
    private final CarouselComponentStyle style;

    /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
    private final h2 visible;

    /* JADX INFO: renamed from: windowSize$delegate, reason: from kotlin metadata */
    private final C0 windowSize;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentState$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Map<String, CustomVariableValue> invoke() {
            return S.i();
        }
    }

    public CarouselComponentState(C2986c initialWindowSize, CarouselComponentStyle style, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a selectedTabIndexProvider, InterfaceC5082a selectedOfferEligibilityProvider, InterfaceC5082a customVariablesProvider) {
        AbstractC5504s.h(initialWindowSize, "initialWindowSize");
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        AbstractC5504s.h(selectedTabIndexProvider, "selectedTabIndexProvider");
        AbstractC5504s.h(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        AbstractC5504s.h(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize = b2.e(initialWindowSize, null, 2, null);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.presentedPartial = U1.d(new CarouselComponentState$presentedPartial$2(this));
        this.visible = U1.d(new CarouselComponentState$visible$2(this));
        this.initialPageIndex = U1.d(new CarouselComponentState$initialPageIndex$2(this));
        this.pages = U1.d(new CarouselComponentState$pages$2(this));
        this.pageAlignment = U1.d(new CarouselComponentState$pageAlignment$2(this));
        this.size = U1.d(new CarouselComponentState$size$2(this));
        this.pagePeek = U1.d(new CarouselComponentState$pagePeek$2(this));
        this.background = U1.d(new CarouselComponentState$background$2(this));
        this.pageSpacing = U1.d(new CarouselComponentState$pageSpacing$2(this));
        this.padding = U1.d(new CarouselComponentState$padding$2(this));
        this.margin = U1.d(new CarouselComponentState$margin$2(this));
        this.shape = U1.d(new CarouselComponentState$shape$2(this));
        this.border = U1.d(new CarouselComponentState$border$2(this));
        this.shadow = U1.d(new CarouselComponentState$shadow$2(this));
        this.pageControl = U1.d(new CarouselComponentState$pageControl$2(this));
        this.loop = U1.d(new CarouselComponentState$loop$2(this));
        this.autoAdvance = U1.d(new CarouselComponentState$autoAdvance$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresentedCarouselPartial getPresentedPartial() {
        return (PresentedCarouselPartial) this.presentedPartial.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2986c getWindowSize() {
        return (C2986c) this.windowSize.getValue();
    }

    private final void setWindowSize(C2986c c2986c) {
        this.windowSize.setValue(c2986c);
    }

    public static /* synthetic */ void update$default(CarouselComponentState carouselComponentState, C2986c c2986c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2986c = null;
        }
        carouselComponentState.update(c2986c);
    }

    public final /* synthetic */ CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return (CarouselComponent.AutoAdvancePages) this.autoAdvance.getValue();
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return (BackgroundStyles) this.background.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border.getValue();
    }

    public final /* synthetic */ int getInitialPageIndex() {
        return ((Number) this.initialPageIndex.getValue()).intValue();
    }

    public final /* synthetic */ boolean getLoop() {
        return ((Boolean) this.loop.getValue()).booleanValue();
    }

    public final /* synthetic */ A getMargin() {
        return (A) this.margin.getValue();
    }

    public final /* synthetic */ A getPadding() {
        return (A) this.padding.getValue();
    }

    public final /* synthetic */ e.c getPageAlignment() {
        return (e.c) this.pageAlignment.getValue();
    }

    public final /* synthetic */ CarouselComponentStyle.PageControlStyles getPageControl() {
        return (CarouselComponentStyle.PageControlStyles) this.pageControl.getValue();
    }

    /* JADX INFO: renamed from: getPagePeek-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m401getPagePeekD9Ej5fM() {
        return ((C5015h) this.pagePeek.getValue()).t();
    }

    /* JADX INFO: renamed from: getPageSpacing-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m402getPageSpacingD9Ej5fM() {
        return ((C5015h) this.pageSpacing.getValue()).t();
    }

    public final /* synthetic */ List getPages() {
        return (List) this.pages.getValue();
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return (ShadowStyles) this.shadow.getValue();
    }

    public final /* synthetic */ E1 getShape() {
        return (E1) this.shape.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(C2986c windowSize) {
        if (windowSize != null) {
            setWindowSize(windowSize);
        }
    }

    public /* synthetic */ CarouselComponentState(C2986c c2986c, CarouselComponentStyle carouselComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2986c, carouselComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, (i10 & 32) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a4);
    }
}
