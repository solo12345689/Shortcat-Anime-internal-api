package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import C.A;
import Ud.S;
import Y.C0;
import Y.U1;
import Y.b2;
import Y.h2;
import b4.C2986c;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0012R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8F¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\u0004\u0018\u0001068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010>R\u001b\u0010B\u001a\u00020;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u001d\u001a\u0004\bA\u0010>R\u001b\u0010G\u001a\u00020C8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u001d\u001a\u0004\bE\u0010FR\u001d\u0010L\u001a\u0004\u0018\u00010H8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u001d\u001a\u0004\bJ\u0010KR\u001d\u0010Q\u001a\u0004\u0018\u00010M8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\u001d\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;", "", "Lb4/c;", "initialWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;", "style", "Lkotlin/Function0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "<init>", "(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lie/a;Lie/a;)V", "windowSize", "LTd/L;", "update", "(Lb4/c;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;", "Lie/a;", "<set-?>", "windowSize$delegate", "LY/C0;", "getWindowSize", "()Lb4/c;", "setWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility$delegate", "LY/h2;", "getOfferEligibility", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;", "presentedPartial$delegate", "getPresentedPartial", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;", "presentedPartial", "", "visible$delegate", "getVisible", "()Z", "visible", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle$Tab;", "tabs", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "getTabs", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size$delegate", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "background$delegate", "getBackground", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "LC/A;", "padding$delegate", "getPadding", "()LC/A;", "padding", "margin$delegate", "getMargin", "margin", "Ls0/E1;", "shape$delegate", "getShape", "()Ls0/E1;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border$delegate", "getBorder", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow$delegate", "getShadow", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabsComponentState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: background$delegate, reason: from kotlin metadata */
    private final h2 background;

    /* JADX INFO: renamed from: border$delegate, reason: from kotlin metadata */
    private final h2 border;
    private final InterfaceC5082a customVariablesProvider;

    /* JADX INFO: renamed from: margin$delegate, reason: from kotlin metadata */
    private final h2 margin;

    /* JADX INFO: renamed from: offerEligibility$delegate, reason: from kotlin metadata */
    private final h2 offerEligibility;

    /* JADX INFO: renamed from: padding$delegate, reason: from kotlin metadata */
    private final h2 padding;

    /* JADX INFO: renamed from: presentedPartial$delegate, reason: from kotlin metadata */
    private final h2 presentedPartial;
    private final InterfaceC5082a selectedPackageInfoProvider;

    /* JADX INFO: renamed from: shadow$delegate, reason: from kotlin metadata */
    private final h2 shadow;

    /* JADX INFO: renamed from: shape$delegate, reason: from kotlin metadata */
    private final h2 shape;

    /* JADX INFO: renamed from: size$delegate, reason: from kotlin metadata */
    private final h2 size;
    private final TabsComponentStyle style;
    private final NonEmptyList<TabsComponentStyle.Tab> tabs;

    /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
    private final h2 visible;

    /* JADX INFO: renamed from: windowSize$delegate, reason: from kotlin metadata */
    private final C0 windowSize;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentState$1, reason: invalid class name */
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

    public TabsComponentState(C2986c initialWindowSize, TabsComponentStyle style, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a customVariablesProvider) {
        AbstractC5504s.h(initialWindowSize, "initialWindowSize");
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        AbstractC5504s.h(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize = b2.e(initialWindowSize, null, 2, null);
        this.offerEligibility = U1.d(new TabsComponentState$offerEligibility$2(this));
        this.presentedPartial = U1.d(new TabsComponentState$presentedPartial$2(this));
        this.visible = U1.d(new TabsComponentState$visible$2(this));
        this.tabs = style.getTabs();
        this.size = U1.d(new TabsComponentState$size$2(this));
        this.background = U1.d(new TabsComponentState$background$2(this));
        this.padding = U1.d(new TabsComponentState$padding$2(this));
        this.margin = U1.d(new TabsComponentState$margin$2(this));
        this.shape = U1.d(new TabsComponentState$shape$2(this));
        this.border = U1.d(new TabsComponentState$border$2(this));
        this.shadow = U1.d(new TabsComponentState$shadow$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OfferEligibility getOfferEligibility() {
        return (OfferEligibility) this.offerEligibility.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresentedTabsPartial getPresentedPartial() {
        return (PresentedTabsPartial) this.presentedPartial.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2986c getWindowSize() {
        return (C2986c) this.windowSize.getValue();
    }

    private final void setWindowSize(C2986c c2986c) {
        this.windowSize.setValue(c2986c);
    }

    public static /* synthetic */ void update$default(TabsComponentState tabsComponentState, C2986c c2986c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2986c = null;
        }
        tabsComponentState.update(c2986c);
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return (BackgroundStyles) this.background.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border.getValue();
    }

    public final /* synthetic */ A getMargin() {
        return (A) this.margin.getValue();
    }

    public final /* synthetic */ A getPadding() {
        return (A) this.padding.getValue();
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

    public final /* synthetic */ NonEmptyList getTabs() {
        return this.tabs;
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(C2986c windowSize) {
        if (windowSize != null) {
            setWindowSize(windowSize);
        }
    }

    public /* synthetic */ TabsComponentState(C2986c c2986c, TabsComponentStyle tabsComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2986c, tabsComponentStyle, interfaceC5082a, (i10 & 8) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a2);
    }
}
