package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import Y0.L;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import g1.C4830j;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b:\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bí\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u001e\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\u00030\u0003\u0012\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(¢\u0006\u0004\b,\u0010-R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\bC\u00103R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\bM\u0010LR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010]\u001a\u0004\b^\u0010_R/\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\u00030\u00038\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b`\u00100R#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(8\u0006¢\u0006\f\n\u0004\b+\u0010a\u001a\u0004\bb\u0010c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "", "texts", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "color", "", "fontSize", "LY0/L;", "fontWeight", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "fontSpec", "Lg1/j;", "textAlign", "Ll0/e$b;", "horizontalAlignment", "backgroundColor", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "Ljava/util/Date;", "countdownDate", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "countFrom", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "variableLocalizations", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;", "overrides", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ILY0/L;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;Lg1/j;Ll0/e$b;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/Date;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "getTexts", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getColor", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "I", "getFontSize", "()I", "LY0/L;", "getFontWeight", "()LY0/L;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "getFontSpec", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "Lg1/j;", "getTextAlign-buA522U", "()Lg1/j;", "Ll0/e$b;", "getHorizontalAlignment", "()Ll0/e$b;", "getBackgroundColor", "Z", "getVisible", "()Z", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "LC/A;", "getPadding", "()LC/A;", "getMargin", "Lcom/revenuecat/purchases/Package;", "getRcPackage", "()Lcom/revenuecat/purchases/Package;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getResolvedOffer", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "Ljava/lang/Integer;", "getTabIndex", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOfferEligibility", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "Ljava/util/Date;", "getCountdownDate", "()Ljava/util/Date;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getCountFrom", "()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getVariableLocalizations", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final ColorStyles backgroundColor;
    private final ColorStyles color;
    private final CountdownComponent.CountFrom countFrom;
    private final Date countdownDate;
    private final int fontSize;
    private final FontSpec fontSpec;
    private final L fontWeight;
    private final e.b horizontalAlignment;
    private final A margin;
    private final OfferEligibility offerEligibility;
    private final List<PresentedOverride<LocalizedTextPartial>> overrides;
    private final A padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final Size size;
    private final Integer tabIndex;
    private final C4830j textAlign;
    private final NonEmptyMap<LocaleId, String> texts;
    private final NonEmptyMap<LocaleId, NonEmptyMap<VariableLocalizationKey, String>> variableLocalizations;
    private final boolean visible;

    public /* synthetic */ TextComponentStyle(NonEmptyMap nonEmptyMap, ColorStyles colorStyles, int i10, L l10, FontSpec fontSpec, C4830j c4830j, e.b bVar, ColorStyles colorStyles2, boolean z10, Size size, A a10, A a11, Package r13, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, NonEmptyMap nonEmptyMap2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(nonEmptyMap, colorStyles, i10, l10, fontSpec, c4830j, bVar, colorStyles2, z10, size, a10, a11, r13, resolvedOffer, num, offerEligibility, date, countFrom, nonEmptyMap2, list);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i10);
    }

    public final /* synthetic */ ColorStyles getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorStyles getColor() {
        return this.color;
    }

    public final /* synthetic */ CountdownComponent.CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final /* synthetic */ Date getCountdownDate() {
        return this.countdownDate;
    }

    public final /* synthetic */ int getFontSize() {
        return this.fontSize;
    }

    public final /* synthetic */ FontSpec getFontSpec() {
        return this.fontSpec;
    }

    public final /* synthetic */ L getFontWeight() {
        return this.fontWeight;
    }

    public final /* synthetic */ e.b getHorizontalAlignment() {
        return this.horizontalAlignment;
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

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: from getter */
    public final /* synthetic */ C4830j getTextAlign() {
        return this.textAlign;
    }

    public final /* synthetic */ NonEmptyMap getTexts() {
        return this.texts;
    }

    public final /* synthetic */ NonEmptyMap getVariableLocalizations() {
        return this.variableLocalizations;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    private TextComponentStyle(NonEmptyMap<LocaleId, String> texts, ColorStyles color, int i10, L l10, FontSpec fontSpec, C4830j c4830j, e.b horizontalAlignment, ColorStyles colorStyles, boolean z10, Size size, A padding, A margin, Package r20, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, NonEmptyMap<LocaleId, NonEmptyMap<VariableLocalizationKey, String>> variableLocalizations, List<PresentedOverride<LocalizedTextPartial>> overrides) {
        AbstractC5504s.h(texts, "texts");
        AbstractC5504s.h(color, "color");
        AbstractC5504s.h(horizontalAlignment, "horizontalAlignment");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(countFrom, "countFrom");
        AbstractC5504s.h(variableLocalizations, "variableLocalizations");
        AbstractC5504s.h(overrides, "overrides");
        this.texts = texts;
        this.color = color;
        this.fontSize = i10;
        this.fontWeight = l10;
        this.fontSpec = fontSpec;
        this.textAlign = c4830j;
        this.horizontalAlignment = horizontalAlignment;
        this.backgroundColor = colorStyles;
        this.visible = z10;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.rcPackage = r20;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.countdownDate = date;
        this.countFrom = countFrom;
        this.variableLocalizations = variableLocalizations;
        this.overrides = overrides;
    }

    public /* synthetic */ TextComponentStyle(NonEmptyMap nonEmptyMap, ColorStyles colorStyles, int i10, L l10, FontSpec fontSpec, C4830j c4830j, e.b bVar, ColorStyles colorStyles2, boolean z10, Size size, A a10, A a11, Package r38, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, NonEmptyMap nonEmptyMap2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nonEmptyMap, colorStyles, i10, l10, fontSpec, c4830j, bVar, colorStyles2, z10, size, a10, a11, r38, (i11 & 8192) != 0 ? null : resolvedOffer, num, (i11 & 32768) != 0 ? null : offerEligibility, date, countFrom, nonEmptyMap2, list, null);
    }
}
