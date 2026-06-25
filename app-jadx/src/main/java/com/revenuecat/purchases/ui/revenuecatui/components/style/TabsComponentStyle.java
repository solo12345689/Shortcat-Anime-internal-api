package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u0001RBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u001c\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016HÆ\u0003¢\u0006\u0004\b/\u00100J\u0096\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bC\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010*R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010,R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010.R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\bQ\u00100¨\u0006S"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;", "control", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle$Tab;", "tabs", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;", "overrides", "<init>", "(ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;Ljava/util/List;)V", "component1", "()Z", "component2", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "component3", "()LC/A;", "component4", "component5", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "component6", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "component7", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "component8", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "component9", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;", "component10", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "component11", "()Ljava/util/List;", "copy", "(ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;Ljava/util/List;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getVisible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "LC/A;", "getPadding", "getMargin", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "getBackground", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "getBorder", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "getShadow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlStyle;", "getControl", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "getTabs", "Ljava/util/List;", "getOverrides", "Tab", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TabsComponentStyle implements ComponentStyle {
    public static final int $stable = 0;
    private final BackgroundStyles background;
    private final BorderStyles border;
    private final TabControlStyle control;
    private final A margin;
    private final List<PresentedOverride<PresentedTabsPartial>> overrides;
    private final A padding;
    private final ShadowStyles shadow;
    private final Shape shape;
    private final Size size;
    private final NonEmptyList<Tab> tabs;
    private final boolean visible;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle$Tab;", "", "stack", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;)V", "getStack", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Tab {
        public static final int $stable = 0;
        private final StackComponentStyle stack;

        public Tab(StackComponentStyle stack) {
            AbstractC5504s.h(stack, "stack");
            this.stack = stack;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, StackComponentStyle stackComponentStyle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                stackComponentStyle = tab.stack;
            }
            return tab.copy(stackComponentStyle);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final StackComponentStyle getStack() {
            return this.stack;
        }

        public final Tab copy(StackComponentStyle stack) {
            AbstractC5504s.h(stack, "stack");
            return new Tab(stack);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Tab) && AbstractC5504s.c(this.stack, ((Tab) other).stack);
        }

        public final /* synthetic */ StackComponentStyle getStack() {
            return this.stack;
        }

        public int hashCode() {
            return this.stack.hashCode();
        }

        public String toString() {
            return "Tab(stack=" + this.stack + ')';
        }
    }

    public TabsComponentStyle(boolean z10, Size size, A padding, A margin, BackgroundStyles backgroundStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, TabControlStyle control, NonEmptyList<Tab> tabs, List<PresentedOverride<PresentedTabsPartial>> overrides) {
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(control, "control");
        AbstractC5504s.h(tabs, "tabs");
        AbstractC5504s.h(overrides, "overrides");
        this.visible = z10;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.background = backgroundStyles;
        this.shape = shape;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.control = control;
        this.tabs = tabs;
        this.overrides = overrides;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabsComponentStyle copy$default(TabsComponentStyle tabsComponentStyle, boolean z10, Size size, A a10, A a11, BackgroundStyles backgroundStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, TabControlStyle tabControlStyle, NonEmptyList nonEmptyList, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = tabsComponentStyle.visible;
        }
        if ((i10 & 2) != 0) {
            size = tabsComponentStyle.size;
        }
        if ((i10 & 4) != 0) {
            a10 = tabsComponentStyle.padding;
        }
        if ((i10 & 8) != 0) {
            a11 = tabsComponentStyle.margin;
        }
        if ((i10 & 16) != 0) {
            backgroundStyles = tabsComponentStyle.background;
        }
        if ((i10 & 32) != 0) {
            shape = tabsComponentStyle.shape;
        }
        if ((i10 & 64) != 0) {
            borderStyles = tabsComponentStyle.border;
        }
        if ((i10 & 128) != 0) {
            shadowStyles = tabsComponentStyle.shadow;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            tabControlStyle = tabsComponentStyle.control;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            nonEmptyList = tabsComponentStyle.tabs;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            list = tabsComponentStyle.overrides;
        }
        NonEmptyList nonEmptyList2 = nonEmptyList;
        List list2 = list;
        ShadowStyles shadowStyles2 = shadowStyles;
        TabControlStyle tabControlStyle2 = tabControlStyle;
        Shape shape2 = shape;
        BorderStyles borderStyles2 = borderStyles;
        BackgroundStyles backgroundStyles2 = backgroundStyles;
        A a12 = a10;
        return tabsComponentStyle.copy(z10, size, a12, a11, backgroundStyles2, shape2, borderStyles2, shadowStyles2, tabControlStyle2, nonEmptyList2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public final NonEmptyList<Tab> component10() {
        return this.tabs;
    }

    public final List<PresentedOverride<PresentedTabsPartial>> component11() {
        return this.overrides;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Size getSize() {
        return this.size;
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
    public final BackgroundStyles getBackground() {
        return this.background;
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
    public final TabControlStyle getControl() {
        return this.control;
    }

    public final TabsComponentStyle copy(boolean visible, Size size, A padding, A margin, BackgroundStyles backgroundStyles, Shape shape, BorderStyles border, ShadowStyles shadow, TabControlStyle control, NonEmptyList<Tab> tabs, List<PresentedOverride<PresentedTabsPartial>> overrides) {
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(control, "control");
        AbstractC5504s.h(tabs, "tabs");
        AbstractC5504s.h(overrides, "overrides");
        return new TabsComponentStyle(visible, size, padding, margin, backgroundStyles, shape, border, shadow, control, tabs, overrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabsComponentStyle)) {
            return false;
        }
        TabsComponentStyle tabsComponentStyle = (TabsComponentStyle) other;
        return this.visible == tabsComponentStyle.visible && AbstractC5504s.c(this.size, tabsComponentStyle.size) && AbstractC5504s.c(this.padding, tabsComponentStyle.padding) && AbstractC5504s.c(this.margin, tabsComponentStyle.margin) && AbstractC5504s.c(this.background, tabsComponentStyle.background) && AbstractC5504s.c(this.shape, tabsComponentStyle.shape) && AbstractC5504s.c(this.border, tabsComponentStyle.border) && AbstractC5504s.c(this.shadow, tabsComponentStyle.shadow) && AbstractC5504s.c(this.control, tabsComponentStyle.control) && AbstractC5504s.c(this.tabs, tabsComponentStyle.tabs) && AbstractC5504s.c(this.overrides, tabsComponentStyle.overrides);
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return this.background;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ TabControlStyle getControl() {
        return this.control;
    }

    public final /* synthetic */ A getMargin() {
        return this.margin;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ A getPadding() {
        return this.padding;
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

    public final /* synthetic */ NonEmptyList getTabs() {
        return this.tabs;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.visible) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        BackgroundStyles backgroundStyles = this.background;
        int iHashCode2 = (((iHashCode + (backgroundStyles == null ? 0 : backgroundStyles.hashCode())) * 31) + this.shape.hashCode()) * 31;
        BorderStyles borderStyles = this.border;
        int iHashCode3 = (iHashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        return ((((((iHashCode3 + (shadowStyles != null ? shadowStyles.hashCode() : 0)) * 31) + this.control.hashCode()) * 31) + this.tabs.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "TabsComponentStyle(visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", control=" + this.control + ", tabs=" + this.tabs + ", overrides=" + this.overrides + ')';
    }
}
