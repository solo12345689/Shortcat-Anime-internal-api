package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.A;
import Td.D;
import Td.N;
import Td.r;
import Ud.S;
import Y.C0;
import Y.U1;
import Y.b2;
import Y.h2;
import androidx.compose.foundation.layout.p;
import b4.C2986c;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import i1.C5015h;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\b¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R+\u0010\u001b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010\u0018\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00105\u001a\u0004\u0018\u0001008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8F¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010A\u001a\u0002068F¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u00109R\u0017\u0010D\u001a\u0002068F¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u00109R\u0017\u0010F\u001a\u0002068F¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u00109R\u001b\u0010L\u001a\u00020H8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u0010KR!\u0010Q\u001a\u00020M8FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u00102\u001a\u0004\bO\u0010PR\u001d\u0010V\u001a\u0004\u0018\u00010R8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u00102\u001a\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u00102\u001a\u0004\bX\u0010YR\u001b\u0010\u0017\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u00102\u001a\u0004\b\\\u0010YR\u001b\u0010`\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u00102\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bb\u00102\u001a\u0004\bc\u0010dR\u001d\u0010j\u001a\u0004\u0018\u00010f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bg\u00102\u001a\u0004\bh\u0010iR\u001d\u0010o\u001a\u0004\u0018\u00010k8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bl\u00102\u001a\u0004\bm\u0010nR\u001d\u0010t\u001a\u0004\u0018\u00010p8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bq\u00102\u001a\u0004\br\u0010sR\u001d\u0010y\u001a\u0004\u0018\u00010u8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bv\u00102\u001a\u0004\bw\u0010x\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006z"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;", "", "Lb4/c;", "initialWindowSize", "Li1/t;", "initialLayoutDirection", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "style", "Lkotlin/Function0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "<init>", "(Lb4/c;Li1/t;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "LC/A;", "margin", "layoutDirection", "adjustForMargin", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;Li1/t;)Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "windowSize", "LTd/L;", "update", "(Lb4/c;Li1/t;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "Lie/a;", "<set-?>", "windowSize$delegate", "LY/C0;", "getWindowSize", "()Lb4/c;", "setWindowSize", "(Lb4/c;)V", "layoutDirection$delegate", "getLayoutDirection", "()Li1/t;", "setLayoutDirection", "(Li1/t;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "packageAwareDelegate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageAwareDelegate;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;", "presentedPartial$delegate", "LY/h2;", "getPresentedPartial", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;", "presentedPartial", "", "visible$delegate", "getVisible", "()Z", "visible", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "children", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "applyTopWindowInsets", "Z", "getApplyTopWindowInsets", "applyBottomWindowInsets", "getApplyBottomWindowInsets", "applyHorizontalWindowInsets", "getApplyHorizontalWindowInsets", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension$delegate", "getDimension", "()Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "Li1/h;", "spacing$delegate", "getSpacing-D9Ej5fM", "()F", "spacing", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "background$delegate", "getBackground", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "padding$delegate", "getPadding", "()LC/A;", "padding", "margin$delegate", "getMargin", "size$delegate", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape$delegate", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border$delegate", "getBorder", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow$delegate", "getShadow", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "badge$delegate", "getBadge", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "badge", "Lz/q;", "scrollOrientation$delegate", "getScrollOrientation", "()Lz/q;", "scrollOrientation", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StackComponentState {
    public static final int $stable = 0;
    private final boolean applyBottomWindowInsets;
    private final boolean applyHorizontalWindowInsets;
    private final boolean applyTopWindowInsets;

    /* JADX INFO: renamed from: background$delegate, reason: from kotlin metadata */
    private final h2 background;

    /* JADX INFO: renamed from: badge$delegate, reason: from kotlin metadata */
    private final h2 badge;

    /* JADX INFO: renamed from: border$delegate, reason: from kotlin metadata */
    private final h2 border;
    private final List<ComponentStyle> children;
    private final InterfaceC5082a customVariablesProvider;

    /* JADX INFO: renamed from: dimension$delegate, reason: from kotlin metadata */
    private final h2 dimension;

    /* JADX INFO: renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    private final C0 layoutDirection;

    /* JADX INFO: renamed from: margin$delegate, reason: from kotlin metadata */
    private final h2 margin;
    private final PackageAwareDelegate packageAwareDelegate;

    /* JADX INFO: renamed from: padding$delegate, reason: from kotlin metadata */
    private final h2 padding;

    /* JADX INFO: renamed from: presentedPartial$delegate, reason: from kotlin metadata */
    private final h2 presentedPartial;

    /* JADX INFO: renamed from: scrollOrientation$delegate, reason: from kotlin metadata */
    private final h2 scrollOrientation;
    private final InterfaceC5082a selectedOfferEligibilityProvider;
    private final InterfaceC5082a selectedPackageInfoProvider;
    private final InterfaceC5082a selectedTabIndexProvider;

    /* JADX INFO: renamed from: shadow$delegate, reason: from kotlin metadata */
    private final h2 shadow;

    /* JADX INFO: renamed from: shape$delegate, reason: from kotlin metadata */
    private final h2 shape;

    /* JADX INFO: renamed from: size$delegate, reason: from kotlin metadata */
    private final h2 size;

    /* JADX INFO: renamed from: spacing$delegate, reason: from kotlin metadata */
    private final h2 spacing;
    private final StackComponentStyle style;

    /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
    private final h2 visible;

    /* JADX INFO: renamed from: windowSize$delegate, reason: from kotlin metadata */
    private final C0 windowSize;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState$1, reason: invalid class name */
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

    public StackComponentState(C2986c initialWindowSize, EnumC5027t initialLayoutDirection, StackComponentStyle style, InterfaceC5082a selectedPackageInfoProvider, InterfaceC5082a selectedTabIndexProvider, InterfaceC5082a selectedOfferEligibilityProvider, InterfaceC5082a customVariablesProvider) {
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
        this.presentedPartial = U1.d(new StackComponentState$presentedPartial$2(this));
        this.visible = U1.d(new StackComponentState$visible$2(this));
        this.children = style.getChildren();
        this.applyTopWindowInsets = style.getApplyTopWindowInsets();
        this.applyBottomWindowInsets = style.getApplyBottomWindowInsets();
        this.applyHorizontalWindowInsets = style.getApplyHorizontalWindowInsets();
        this.dimension = U1.d(new StackComponentState$dimension$2(this));
        this.spacing = U1.d(new StackComponentState$spacing$2(this));
        this.background = U1.d(new StackComponentState$background$2(this));
        this.padding = U1.d(new StackComponentState$padding$2(this));
        this.margin = U1.d(new StackComponentState$margin$2(this));
        this.size = U1.d(new StackComponentState$size$2(this));
        this.shape = U1.d(new StackComponentState$shape$2(this));
        this.border = U1.d(new StackComponentState$border$2(this));
        this.shadow = U1.d(new StackComponentState$shadow$2(this));
        this.badge = U1.d(new StackComponentState$badge$2(this));
        this.scrollOrientation = U1.d(new StackComponentState$scrollOrientation$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Size adjustForMargin(Size size, A a10, EnumC5027t enumC5027t) {
        SizeConstraint width = size.getWidth();
        if (width instanceof SizeConstraint.Fixed) {
            width = new SizeConstraint.Fixed(D.b(D.b(((SizeConstraint.Fixed) width).getValue() + N.a(p.g(a10, enumC5027t))) + N.a(p.f(a10, enumC5027t))), null);
        } else {
            if (!(width instanceof SizeConstraint.Fill ? true : width instanceof SizeConstraint.Fit)) {
                throw new r();
            }
        }
        SizeConstraint height = size.getHeight();
        if (height instanceof SizeConstraint.Fixed) {
            height = new SizeConstraint.Fixed(D.b(D.b(((SizeConstraint.Fixed) height).getValue() + N.a(a10.d())) + N.a(a10.c())), null);
        } else {
            if (!(height instanceof SizeConstraint.Fill ? true : height instanceof SizeConstraint.Fit)) {
                throw new r();
            }
        }
        return new Size(width, height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnumC5027t getLayoutDirection() {
        return (EnumC5027t) this.layoutDirection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresentedStackPartial getPresentedPartial() {
        return (PresentedStackPartial) this.presentedPartial.getValue();
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

    public static /* synthetic */ void update$default(StackComponentState stackComponentState, C2986c c2986c, EnumC5027t enumC5027t, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2986c = null;
        }
        if ((i10 & 2) != 0) {
            enumC5027t = null;
        }
        stackComponentState.update(c2986c, enumC5027t);
    }

    public final /* synthetic */ boolean getApplyBottomWindowInsets() {
        return this.applyBottomWindowInsets;
    }

    public final /* synthetic */ boolean getApplyHorizontalWindowInsets() {
        return this.applyHorizontalWindowInsets;
    }

    public final /* synthetic */ boolean getApplyTopWindowInsets() {
        return this.applyTopWindowInsets;
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return (BackgroundStyles) this.background.getValue();
    }

    public final /* synthetic */ BadgeStyle getBadge() {
        return (BadgeStyle) this.badge.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border.getValue();
    }

    public final /* synthetic */ List getChildren() {
        return this.children;
    }

    public final /* synthetic */ Dimension getDimension() {
        return (Dimension) this.dimension.getValue();
    }

    public final /* synthetic */ A getMargin() {
        return (A) this.margin.getValue();
    }

    public final /* synthetic */ A getPadding() {
        return (A) this.padding.getValue();
    }

    public final /* synthetic */ q getScrollOrientation() {
        return (q) this.scrollOrientation.getValue();
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return (ShadowStyles) this.shadow.getValue();
    }

    public final /* synthetic */ Shape getShape() {
        return (Shape) this.shape.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size.getValue();
    }

    /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m503getSpacingD9Ej5fM() {
        return ((C5015h) this.spacing.getValue()).t();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(C2986c windowSize, EnumC5027t layoutDirection) {
        if (windowSize != null) {
            setWindowSize(windowSize);
        }
        if (layoutDirection != null) {
            setLayoutDirection(layoutDirection);
        }
    }

    public /* synthetic */ StackComponentState(C2986c c2986c, EnumC5027t enumC5027t, StackComponentStyle stackComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2986c, enumC5027t, stackComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, (i10 & 64) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a4);
    }
}
