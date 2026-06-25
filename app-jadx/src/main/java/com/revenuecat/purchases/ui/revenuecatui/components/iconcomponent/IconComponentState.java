package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import C.A;
import Ud.S;
import Y.C0;
import Y.U1;
import Y.b2;
import Y.h2;
import b4.C2986c;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedIconPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0018R+\u0010&\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010/\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u00102R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010:R\u001d\u0010@\u001a\u0004\u0018\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u00102R\u001b\u0010M\u001a\u00020I8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010,\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010,\u001a\u0004\bP\u0010QR\u001b\u0010U\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010,\u001a\u0004\bT\u0010QR\u001b\u0010X\u001a\u00020I8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010,\u001a\u0004\bW\u0010LR\u001d\u0010]\u001a\u0004\u0018\u00010Y8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010,\u001a\u0004\b[\u0010\\R\u001d\u0010b\u001a\u0004\u0018\u00010^8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010,\u001a\u0004\b`\u0010aR\u001d\u0010g\u001a\u0004\u0018\u00010c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bd\u0010,\u001a\u0004\be\u0010fR\u001d\u0010l\u001a\u0004\u0018\u00010h8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bi\u0010,\u001a\u0004\bj\u0010kR\u001d\u0010o\u001a\u0004\u0018\u00010h8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bm\u0010,\u001a\u0004\bn\u0010k¨\u0006p"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;", "", "Lb4/c;", "initialWindowSize", "Li1/t;", "initialLayoutDirection", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "style", "Lkotlin/Function0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "<init>", "(Lb4/c;Li1/t;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V", "windowSize", "LTd/L;", "update", "(Lb4/c;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "Lie/a;", "<set-?>", "windowSize$delegate", "LY/C0;", "getWindowSize", "()Lb4/c;", "setWindowSize", "layoutDirection$delegate", "getLayoutDirection", "()Li1/t;", "setLayoutDirection", "(Li1/t;)V", "layoutDirection", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "packageAwareDelegate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;", "presentedPartial$delegate", "LY/h2;", "getPresentedPartial", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedIconPartial;", "presentedPartial", "baseUrl$delegate", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "iconName$delegate", "getIconName", "iconName", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "formats$delegate", "getFormats", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "formats", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;", "iconBackground$delegate", "getIconBackground", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle$Background;", "iconBackground", "", "visible$delegate", "getVisible", "()Z", "visible", "url$delegate", "getUrl", "url", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size$delegate", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "LC/A;", "padding$delegate", "getPadding", "()LC/A;", "padding", "margin$delegate", "getMargin", "margin", "sizePlusMargin$delegate", "getSizePlusMargin", "sizePlusMargin", "Ls0/E1;", "shape$delegate", "getShape", "()Ls0/E1;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border$delegate", "getBorder", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow$delegate", "getShadow", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "backgroundColorStyles$delegate", "getBackgroundColorStyles", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "backgroundColorStyles", "tintColor$delegate", "getTintColor", "tintColor", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IconComponentState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: backgroundColorStyles$delegate, reason: from kotlin metadata */
    private final h2 backgroundColorStyles;

    /* JADX INFO: renamed from: baseUrl$delegate, reason: from kotlin metadata */
    private final h2 baseUrl;

    /* JADX INFO: renamed from: border$delegate, reason: from kotlin metadata */
    private final h2 border;
    private final InterfaceC5082a customVariablesProvider;

    /* JADX INFO: renamed from: formats$delegate, reason: from kotlin metadata */
    private final h2 formats;

    /* JADX INFO: renamed from: iconBackground$delegate, reason: from kotlin metadata */
    private final h2 iconBackground;

    /* JADX INFO: renamed from: iconName$delegate, reason: from kotlin metadata */
    private final h2 iconName;

    /* JADX INFO: renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    private final C0 layoutDirection;

    /* JADX INFO: renamed from: margin$delegate, reason: from kotlin metadata */
    private final h2 margin;
    private final PackageAwareDelegate packageAwareDelegate;

    /* JADX INFO: renamed from: padding$delegate, reason: from kotlin metadata */
    private final h2 padding;

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

    /* JADX INFO: renamed from: sizePlusMargin$delegate, reason: from kotlin metadata */
    private final h2 sizePlusMargin;
    private final IconComponentStyle style;

    /* JADX INFO: renamed from: tintColor$delegate, reason: from kotlin metadata */
    private final h2 tintColor;

    /* JADX INFO: renamed from: url$delegate, reason: from kotlin metadata */
    private final h2 url;

    /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
    private final h2 visible;

    /* JADX INFO: renamed from: windowSize$delegate, reason: from kotlin metadata */
    private final C0 windowSize;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.IconComponentState$1, reason: invalid class name */
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

    public IconComponentState(C2986c initialWindowSize, EnumC5027t initialLayoutDirection, IconComponentStyle style, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a selectedTabIndexProvider, InterfaceC5082a selectedOfferEligibilityProvider, InterfaceC5082a customVariablesProvider) {
        AbstractC5504s.h(initialWindowSize, "initialWindowSize");
        AbstractC5504s.h(initialLayoutDirection, "initialLayoutDirection");
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
        this.layoutDirection = b2.e(initialLayoutDirection, null, 2, null);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.presentedPartial = U1.d(new IconComponentState$presentedPartial$2(this));
        this.baseUrl = U1.d(new IconComponentState$baseUrl$2(this));
        this.iconName = U1.d(new IconComponentState$iconName$2(this));
        this.formats = U1.d(new IconComponentState$formats$2(this));
        this.iconBackground = U1.d(new IconComponentState$iconBackground$2(this));
        this.visible = U1.d(new IconComponentState$visible$2(this));
        this.url = U1.d(new IconComponentState$url$2(this));
        this.size = U1.d(new IconComponentState$size$2(this));
        this.padding = U1.d(new IconComponentState$padding$2(this));
        this.margin = U1.d(new IconComponentState$margin$2(this));
        this.sizePlusMargin = U1.d(new IconComponentState$sizePlusMargin$2(this));
        this.shape = U1.d(new IconComponentState$shape$2(this));
        this.border = U1.d(new IconComponentState$border$2(this));
        this.shadow = U1.d(new IconComponentState$shadow$2(this));
        this.backgroundColorStyles = U1.d(new IconComponentState$backgroundColorStyles$2(this));
        this.tintColor = U1.d(new IconComponentState$tintColor$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBaseUrl() {
        return (String) this.baseUrl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconComponent.Formats getFormats() {
        return (IconComponent.Formats) this.formats.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconComponentStyle.Background getIconBackground() {
        return (IconComponentStyle.Background) this.iconBackground.getValue();
    }

    private final String getIconName() {
        return (String) this.iconName.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnumC5027t getLayoutDirection() {
        return (EnumC5027t) this.layoutDirection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresentedIconPartial getPresentedPartial() {
        return (PresentedIconPartial) this.presentedPartial.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2986c getWindowSize() {
        return (C2986c) this.windowSize.getValue();
    }

    private final void setLayoutDirection(EnumC5027t enumC5027t) {
        this.layoutDirection.setValue(enumC5027t);
    }

    private final void setWindowSize(C2986c c2986c) {
        this.windowSize.setValue(c2986c);
    }

    public static /* synthetic */ void update$default(IconComponentState iconComponentState, C2986c c2986c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2986c = null;
        }
        iconComponentState.update(c2986c);
    }

    public final /* synthetic */ ColorStyles getBackgroundColorStyles() {
        return (ColorStyles) this.backgroundColorStyles.getValue();
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

    public final /* synthetic */ Size getSizePlusMargin() {
        return (Size) this.sizePlusMargin.getValue();
    }

    public final ColorStyles getTintColor() {
        return (ColorStyles) this.tintColor.getValue();
    }

    public final /* synthetic */ String getUrl() {
        return (String) this.url.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(C2986c windowSize) {
        if (windowSize != null) {
            setWindowSize(windowSize);
        }
    }

    public /* synthetic */ IconComponentState(C2986c c2986c, EnumC5027t enumC5027t, IconComponentStyle iconComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2986c, enumC5027t, iconComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, (i10 & 64) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a4);
    }
}
