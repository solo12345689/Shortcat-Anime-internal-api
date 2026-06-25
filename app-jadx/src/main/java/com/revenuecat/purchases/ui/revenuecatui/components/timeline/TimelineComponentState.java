package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import C.A;
import Ud.S;
import Y.C0;
import Y.U1;
import Y.b2;
import Y.h2;
import b4.C2986c;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelineItemPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelinePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001OB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u00100\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010/R\u001b\u00106\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010/R\u001b\u0010;\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010$\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010$\u001a\u0004\bG\u0010DR!\u0010N\u001a\b\u0012\u0004\u0012\u00020J0I8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010$\u001a\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState;", "", "Lb4/c;", "initialWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;", "style", "Lkotlin/Function0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "<init>", "(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V", "windowSize", "LTd/L;", "update", "(Lb4/c;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;", "Lie/a;", "<set-?>", "windowSize$delegate", "LY/C0;", "getWindowSize", "()Lb4/c;", "setWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "packageAwareDelegate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;", "presentedPartial$delegate", "LY/h2;", "getPresentedPartial", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;", "presentedPartial", "", "visible$delegate", "getVisible", "()Z", "visible", "itemSpacing$delegate", "getItemSpacing", "()I", "itemSpacing", "textSpacing$delegate", "getTextSpacing", "textSpacing", "columnGutter$delegate", "getColumnGutter", "columnGutter", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "iconAlignment$delegate", "getIconAlignment", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "iconAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size$delegate", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "LC/A;", "padding$delegate", "getPadding", "()LC/A;", "padding", "margin$delegate", "getMargin", "margin", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;", "items$delegate", "getItems", "()Ljava/util/List;", "items", "ItemState", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimelineComponentState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: columnGutter$delegate, reason: from kotlin metadata */
    private final h2 columnGutter;
    private final InterfaceC5082a customVariablesProvider;

    /* JADX INFO: renamed from: iconAlignment$delegate, reason: from kotlin metadata */
    private final h2 iconAlignment;

    /* JADX INFO: renamed from: itemSpacing$delegate, reason: from kotlin metadata */
    private final h2 itemSpacing;

    /* JADX INFO: renamed from: items$delegate, reason: from kotlin metadata */
    private final h2 items;

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
    private final TimelineComponentStyle style;

    /* JADX INFO: renamed from: textSpacing$delegate, reason: from kotlin metadata */
    private final h2 textSpacing;

    /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
    private final h2 visible;

    /* JADX INFO: renamed from: windowSize$delegate, reason: from kotlin metadata */
    private final C0 windowSize;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState$1, reason: invalid class name */
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

    public TimelineComponentState(C2986c initialWindowSize, TimelineComponentStyle style, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a selectedTabIndexProvider, InterfaceC5082a selectedOfferEligibilityProvider, InterfaceC5082a customVariablesProvider) {
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
        this.presentedPartial = U1.d(new TimelineComponentState$presentedPartial$2(this));
        this.visible = U1.d(new TimelineComponentState$visible$2(this));
        this.itemSpacing = U1.d(new TimelineComponentState$itemSpacing$2(this));
        this.textSpacing = U1.d(new TimelineComponentState$textSpacing$2(this));
        this.columnGutter = U1.d(new TimelineComponentState$columnGutter$2(this));
        this.iconAlignment = U1.d(new TimelineComponentState$iconAlignment$2(this));
        this.size = U1.d(new TimelineComponentState$size$2(this));
        this.padding = U1.d(new TimelineComponentState$padding$2(this));
        this.margin = U1.d(new TimelineComponentState$margin$2(this));
        this.items = U1.d(new TimelineComponentState$items$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresentedTimelinePartial getPresentedPartial() {
        return (PresentedTimelinePartial) this.presentedPartial.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2986c getWindowSize() {
        return (C2986c) this.windowSize.getValue();
    }

    private final void setWindowSize(C2986c c2986c) {
        this.windowSize.setValue(c2986c);
    }

    public static /* synthetic */ void update$default(TimelineComponentState timelineComponentState, C2986c c2986c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2986c = null;
        }
        timelineComponentState.update(c2986c);
    }

    public final /* synthetic */ int getColumnGutter() {
        return ((Number) this.columnGutter.getValue()).intValue();
    }

    public final /* synthetic */ TimelineComponent.IconAlignment getIconAlignment() {
        return (TimelineComponent.IconAlignment) this.iconAlignment.getValue();
    }

    public final /* synthetic */ int getItemSpacing() {
        return ((Number) this.itemSpacing.getValue()).intValue();
    }

    public final /* synthetic */ List getItems() {
        return (List) this.items.getValue();
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

    public final /* synthetic */ int getTextSpacing() {
        return ((Number) this.textSpacing.getValue()).intValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(C2986c windowSize) {
        if (windowSize != null) {
            setWindowSize(windowSize);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R\u001d\u00104\u001a\u0004\u0018\u00010-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u00100R\u001b\u00109\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u00108R\u001d\u0010>\u001a\u0004\u0018\u00010:8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;", "", "Lb4/c;", "initialWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "style", "Lkotlin/Function0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "<init>", "(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V", "windowSize", "LTd/L;", "update", "(Lb4/c;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "Lie/a;", "<set-?>", "windowSize$delegate", "LY/C0;", "getWindowSize", "()Lb4/c;", "setWindowSize", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "packageAwareDelegate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;", "presentedPartial$delegate", "LY/h2;", "getPresentedPartial", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;", "presentedPartial", "", "visible$delegate", "getVisible", "()Z", "visible", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "title$delegate", "getTitle", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", b.f34626S, "description$delegate", "getDescription", b.f34645c, "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "icon$delegate", "getIcon", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "icon", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;", "connector$delegate", "getConnector", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;", "connector", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ItemState {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: connector$delegate, reason: from kotlin metadata */
        private final h2 connector;
        private final InterfaceC5082a customVariablesProvider;

        /* JADX INFO: renamed from: description$delegate, reason: from kotlin metadata */
        private final h2 description;

        /* JADX INFO: renamed from: icon$delegate, reason: from kotlin metadata */
        private final h2 icon;
        private final PackageAwareDelegate packageAwareDelegate;

        /* JADX INFO: renamed from: presentedPartial$delegate, reason: from kotlin metadata */
        private final h2 presentedPartial;
        private final InterfaceC5082a selectedOfferEligibilityProvider;
        private final InterfaceC5082a selectedPackageInfoProvider;
        private final InterfaceC5082a selectedTabIndexProvider;
        private final TimelineComponentStyle.ItemStyle style;

        /* JADX INFO: renamed from: title$delegate, reason: from kotlin metadata */
        private final h2 title;

        /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
        private final h2 visible;

        /* JADX INFO: renamed from: windowSize$delegate, reason: from kotlin metadata */
        private final C0 windowSize;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState$ItemState$1, reason: invalid class name */
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

        public ItemState(C2986c initialWindowSize, TimelineComponentStyle.ItemStyle style, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a selectedTabIndexProvider, InterfaceC5082a selectedOfferEligibilityProvider, InterfaceC5082a customVariablesProvider) {
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
            this.presentedPartial = U1.d(new TimelineComponentState$ItemState$presentedPartial$2(this));
            this.visible = U1.d(new TimelineComponentState$ItemState$visible$2(this));
            this.title = U1.d(new TimelineComponentState$ItemState$title$2(this));
            this.description = U1.d(new TimelineComponentState$ItemState$description$2(this));
            this.icon = U1.d(new TimelineComponentState$ItemState$icon$2(this));
            this.connector = U1.d(new TimelineComponentState$ItemState$connector$2(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PresentedTimelineItemPartial getPresentedPartial() {
            return (PresentedTimelineItemPartial) this.presentedPartial.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2986c getWindowSize() {
            return (C2986c) this.windowSize.getValue();
        }

        private final void setWindowSize(C2986c c2986c) {
            this.windowSize.setValue(c2986c);
        }

        public static /* synthetic */ void update$default(ItemState itemState, C2986c c2986c, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c2986c = null;
            }
            itemState.update(c2986c);
        }

        public final /* synthetic */ TimelineComponentStyle.ConnectorStyle getConnector() {
            return (TimelineComponentStyle.ConnectorStyle) this.connector.getValue();
        }

        public final /* synthetic */ TextComponentStyle getDescription() {
            return (TextComponentStyle) this.description.getValue();
        }

        public final /* synthetic */ IconComponentStyle getIcon() {
            return (IconComponentStyle) this.icon.getValue();
        }

        public final /* synthetic */ TextComponentStyle getTitle() {
            return (TextComponentStyle) this.title.getValue();
        }

        public final /* synthetic */ boolean getVisible() {
            return ((Boolean) this.visible.getValue()).booleanValue();
        }

        public final /* synthetic */ void update(C2986c windowSize) {
            if (windowSize != null) {
                setWindowSize(windowSize);
            }
        }

        public /* synthetic */ ItemState(C2986c c2986c, TimelineComponentStyle.ItemStyle itemStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c2986c, itemStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, (i10 & 32) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a4);
        }
    }

    public /* synthetic */ TimelineComponentState(C2986c c2986c, TimelineComponentStyle timelineComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2986c, timelineComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, (i10 & 32) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a4);
    }
}
