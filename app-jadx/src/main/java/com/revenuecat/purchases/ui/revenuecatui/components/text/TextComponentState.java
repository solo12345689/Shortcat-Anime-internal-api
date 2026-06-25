package com.revenuecat.purchases.ui.revenuecatui.components.text;

import C.A;
import Ud.S;
import Y.C0;
import Y.U1;
import Y.b2;
import Y.h2;
import Y0.AbstractC2485u;
import Y0.L;
import b4.C2986c;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownTime;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import g1.C4830j;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u0006¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R!\u00101\u001a\u00020,8BX\u0082\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0004\u0018\u0001028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u001d\u0010;\u001a\u0004\u0018\u0001078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u0010:R\u001d\u0010@\u001a\u0004\u0018\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u00100R'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00100I8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010.\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010.\u001a\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010.\u001a\u0004\bU\u0010VR\u001d\u0010\\\u001a\u0004\u0018\u00010X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010.\u001a\u0004\bZ\u0010[R\u001d\u0010a\u001a\u0004\u0018\u00010]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010.\u001a\u0004\b_\u0010`R\u001d\u0010f\u001a\u0004\u0018\u00010b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bc\u0010.\u001a\u0004\bd\u0010eR#\u0010k\u001a\u0004\u0018\u00010g8FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010.\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bm\u0010.\u001a\u0004\bn\u0010oR\u001d\u0010s\u001a\u0004\u0018\u00010O8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bq\u0010.\u001a\u0004\br\u0010RR\u001b\u0010x\u001a\u00020t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bu\u0010.\u001a\u0004\bv\u0010wR\u001b\u0010}\u001a\u00020y8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bz\u0010.\u001a\u0004\b{\u0010|R\u001c\u0010\u0080\u0001\u001a\u00020y8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b~\u0010.\u001a\u0004\b\u007f\u0010|R\u0015\u0010\u0084\u0001\u001a\u00030\u0081\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0085\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;", "", "Lb4/c;", "initialWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "style", "Lkotlin/Function0;", "Lc1/d;", "localeProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "<init>", "(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;)V", "windowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;", "countdownTime", "LTd/L;", "update", "(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "Lie/a;", "<set-?>", "windowSize$delegate", "LY/C0;", "getWindowSize", "()Lb4/c;", "setWindowSize", "(Lb4/c;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "packageAwareDelegate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "countdownTime$delegate", "getCountdownTime", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;", "setCountdownTime", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;)V", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "localeId$delegate", "LY/h2;", "getLocaleId-uqtKvyA", "()Ljava/lang/String;", "localeId", "Lcom/revenuecat/purchases/Package;", "applicablePackage$delegate", "getApplicablePackage", "()Lcom/revenuecat/purchases/Package;", "applicablePackage", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption$delegate", "getSubscriptionOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;", "presentedPartial$delegate", "getPresentedPartial", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;", "presentedPartial", "", "visible$delegate", "getVisible", "()Z", "visible", "text$delegate", "getText", "text", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "localizedVariableKeys$delegate", "getLocalizedVariableKeys", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "localizedVariableKeys", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "color$delegate", "getColor", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "color", "fontSize$delegate", "getFontSize", "()I", "fontSize", "LY0/L;", "fontWeight$delegate", "getFontWeight", "()LY0/L;", "fontWeight", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "fontSpec$delegate", "getFontSpec", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "fontSpec", "LY0/u;", "fontFamily$delegate", "getFontFamily", "()LY0/u;", "fontFamily", "Lg1/j;", "textAlign$delegate", "getTextAlign-buA522U", "()Lg1/j;", "textAlign", "Ll0/e$b;", "horizontalAlignment$delegate", "getHorizontalAlignment", "()Ll0/e$b;", "horizontalAlignment", "backgroundColor$delegate", "getBackgroundColor", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size$delegate", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "LC/A;", "padding$delegate", "getPadding", "()LC/A;", "padding", "margin$delegate", "getMargin", "margin", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getCountFrom", "()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "countFrom", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextComponentState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: applicablePackage$delegate, reason: from kotlin metadata */
    private final h2 applicablePackage;

    /* JADX INFO: renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    private final h2 backgroundColor;

    /* JADX INFO: renamed from: color$delegate, reason: from kotlin metadata */
    private final h2 color;

    /* JADX INFO: renamed from: countdownTime$delegate, reason: from kotlin metadata */
    private final C0 countdownTime;
    private final InterfaceC5082a customVariablesProvider;

    /* JADX INFO: renamed from: fontFamily$delegate, reason: from kotlin metadata */
    private final h2 fontFamily;

    /* JADX INFO: renamed from: fontSize$delegate, reason: from kotlin metadata */
    private final h2 fontSize;

    /* JADX INFO: renamed from: fontSpec$delegate, reason: from kotlin metadata */
    private final h2 fontSpec;

    /* JADX INFO: renamed from: fontWeight$delegate, reason: from kotlin metadata */
    private final h2 fontWeight;

    /* JADX INFO: renamed from: horizontalAlignment$delegate, reason: from kotlin metadata */
    private final h2 horizontalAlignment;

    /* JADX INFO: renamed from: localeId$delegate, reason: from kotlin metadata */
    private final h2 localeId;
    private final InterfaceC5082a localeProvider;

    /* JADX INFO: renamed from: localizedVariableKeys$delegate, reason: from kotlin metadata */
    private final h2 localizedVariableKeys;

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

    /* JADX INFO: renamed from: size$delegate, reason: from kotlin metadata */
    private final h2 size;
    private final TextComponentStyle style;

    /* JADX INFO: renamed from: subscriptionOption$delegate, reason: from kotlin metadata */
    private final h2 subscriptionOption;

    /* JADX INFO: renamed from: text$delegate, reason: from kotlin metadata */
    private final h2 text;

    /* JADX INFO: renamed from: textAlign$delegate, reason: from kotlin metadata */
    private final h2 textAlign;

    /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
    private final h2 visible;

    /* JADX INFO: renamed from: windowSize$delegate, reason: from kotlin metadata */
    private final C0 windowSize;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentState$1, reason: invalid class name */
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

    public TextComponentState(C2986c initialWindowSize, TextComponentStyle style, InterfaceC5082a localeProvider, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a selectedTabIndexProvider, InterfaceC5082a selectedOfferEligibilityProvider, InterfaceC5082a customVariablesProvider) {
        AbstractC5504s.h(initialWindowSize, "initialWindowSize");
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(localeProvider, "localeProvider");
        AbstractC5504s.h(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        AbstractC5504s.h(selectedTabIndexProvider, "selectedTabIndexProvider");
        AbstractC5504s.h(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        AbstractC5504s.h(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.localeProvider = localeProvider;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize = b2.e(initialWindowSize, null, 2, null);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.countdownTime = b2.e(null, null, 2, null);
        this.localeId = U1.d(new TextComponentState$localeId$2(this));
        this.applicablePackage = U1.d(new TextComponentState$applicablePackage$2(this));
        this.subscriptionOption = U1.d(new TextComponentState$subscriptionOption$2(this));
        this.presentedPartial = U1.d(new TextComponentState$presentedPartial$2(this));
        this.visible = U1.d(new TextComponentState$visible$2(this));
        this.text = U1.d(new TextComponentState$text$2(this));
        this.localizedVariableKeys = U1.d(new TextComponentState$localizedVariableKeys$2(this));
        this.color = U1.d(new TextComponentState$color$2(this));
        this.fontSize = U1.d(new TextComponentState$fontSize$2(this));
        this.fontWeight = U1.d(new TextComponentState$fontWeight$2(this));
        this.fontSpec = U1.d(new TextComponentState$fontSpec$2(this));
        this.fontFamily = U1.d(new TextComponentState$fontFamily$2(this));
        this.textAlign = U1.d(new TextComponentState$textAlign$2(this));
        this.horizontalAlignment = U1.d(new TextComponentState$horizontalAlignment$2(this));
        this.backgroundColor = U1.d(new TextComponentState$backgroundColor$2(this));
        this.size = U1.d(new TextComponentState$size$2(this));
        this.padding = U1.d(new TextComponentState$padding$2(this));
        this.margin = U1.d(new TextComponentState$margin$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FontSpec getFontSpec() {
        return (FontSpec) this.fontSpec.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getLocaleId-uqtKvyA, reason: not valid java name */
    public final String m543getLocaleIduqtKvyA() {
        return ((LocaleId) this.localeId.getValue()).m313unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalizedTextPartial getPresentedPartial() {
        return (LocalizedTextPartial) this.presentedPartial.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2986c getWindowSize() {
        return (C2986c) this.windowSize.getValue();
    }

    private final void setCountdownTime(CountdownTime countdownTime) {
        this.countdownTime.setValue(countdownTime);
    }

    private final void setWindowSize(C2986c c2986c) {
        this.windowSize.setValue(c2986c);
    }

    public static /* synthetic */ void update$default(TextComponentState textComponentState, C2986c c2986c, CountdownTime countdownTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2986c = null;
        }
        if ((i10 & 2) != 0) {
            countdownTime = textComponentState.getCountdownTime();
        }
        textComponentState.update(c2986c, countdownTime);
    }

    public final Package getApplicablePackage() {
        return (Package) this.applicablePackage.getValue();
    }

    public final /* synthetic */ ColorStyles getBackgroundColor() {
        return (ColorStyles) this.backgroundColor.getValue();
    }

    public final /* synthetic */ ColorStyles getColor() {
        return (ColorStyles) this.color.getValue();
    }

    public final /* synthetic */ CountdownComponent.CountFrom getCountFrom() {
        return this.style.getCountFrom();
    }

    public final CountdownTime getCountdownTime() {
        return (CountdownTime) this.countdownTime.getValue();
    }

    public final /* synthetic */ AbstractC2485u getFontFamily() {
        return (AbstractC2485u) this.fontFamily.getValue();
    }

    public final /* synthetic */ int getFontSize() {
        return ((Number) this.fontSize.getValue()).intValue();
    }

    public final /* synthetic */ L getFontWeight() {
        return (L) this.fontWeight.getValue();
    }

    public final /* synthetic */ e.b getHorizontalAlignment() {
        return (e.b) this.horizontalAlignment.getValue();
    }

    public final /* synthetic */ NonEmptyMap getLocalizedVariableKeys() {
        return (NonEmptyMap) this.localizedVariableKeys.getValue();
    }

    public final /* synthetic */ A getMargin() {
        return (A) this.margin.getValue();
    }

    public final /* synthetic */ A getPadding() {
        return (A) this.padding.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size.getValue();
    }

    public final SubscriptionOption getSubscriptionOption() {
        return (SubscriptionOption) this.subscriptionOption.getValue();
    }

    public final /* synthetic */ String getText() {
        return (String) this.text.getValue();
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final /* synthetic */ C4830j m544getTextAlignbuA522U() {
        return (C4830j) this.textAlign.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(C2986c windowSize, CountdownTime countdownTime) {
        if (windowSize != null) {
            setWindowSize(windowSize);
        }
        setCountdownTime(countdownTime);
    }

    public /* synthetic */ TextComponentState(C2986c c2986c, TextComponentStyle textComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, InterfaceC5082a interfaceC5082a5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2986c, textComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, interfaceC5082a4, (i10 & 64) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a5);
    }
}
