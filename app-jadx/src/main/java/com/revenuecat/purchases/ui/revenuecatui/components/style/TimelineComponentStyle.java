package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.A;
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelineItemPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelinePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002YZB\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b4\u00105J\u001c\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0010HÆ\u0003¢\u0006\u0004\b6\u0010-J¶\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0010HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b<\u0010 J\u001a\u0010?\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010 R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bC\u0010 R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bD\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010*R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bM\u0010*R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010T\u001a\u0004\bU\u00103R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bW\u00105R#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010N\u001a\u0004\bX\u0010-¨\u0006["}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", "", "itemSpacing", "textSpacing", "columnGutter", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "iconAlignment", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "LC/A;", "padding", "margin", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "items", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "offerEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelinePartial;", "overrides", "<init>", "(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Ljava/util/List;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;)V", "component1", "()I", "component2", "component3", "component4", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "component5", "()Z", "component6", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "component7", "()LC/A;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/revenuecat/purchases/Package;", "component11", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "component12", "()Ljava/lang/Integer;", "component13", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "component14", "copy", "(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Ljava/util/List;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getItemSpacing", "getTextSpacing", "getColumnGutter", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment", "Z", "getVisible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "LC/A;", "getPadding", "getMargin", "Ljava/util/List;", "getItems", "Lcom/revenuecat/purchases/Package;", "getRcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getResolvedOffer", "Ljava/lang/Integer;", "getTabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOfferEligibility", "getOverrides", "ConnectorStyle", "ItemStyle", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TimelineComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final int columnGutter;
    private final TimelineComponent.IconAlignment iconAlignment;
    private final int itemSpacing;
    private final List<ItemStyle> items;
    private final A margin;
    private final OfferEligibility offerEligibility;
    private final List<PresentedOverride<PresentedTimelinePartial>> overrides;
    private final A padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final Size size;
    private final Integer tabIndex;
    private final int textSpacing;
    private final boolean visible;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;", "", "", "width", "LC/A;", "margin", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "color", "<init>", "(ILC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V", "component1", "()I", "component2", "()LC/A;", "component3", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "copy", "(ILC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "LC/A;", "getMargin", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "getColor", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ConnectorStyle {
        public static final int $stable = 0;
        private final ColorStyles color;
        private final A margin;
        private final int width;

        public ConnectorStyle(int i10, A margin, ColorStyles color) {
            AbstractC5504s.h(margin, "margin");
            AbstractC5504s.h(color, "color");
            this.width = i10;
            this.margin = margin;
            this.color = color;
        }

        public static /* synthetic */ ConnectorStyle copy$default(ConnectorStyle connectorStyle, int i10, A a10, ColorStyles colorStyles, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = connectorStyle.width;
            }
            if ((i11 & 2) != 0) {
                a10 = connectorStyle.margin;
            }
            if ((i11 & 4) != 0) {
                colorStyles = connectorStyle.color;
            }
            return connectorStyle.copy(i10, a10, colorStyles);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final A getMargin() {
            return this.margin;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ColorStyles getColor() {
            return this.color;
        }

        public final ConnectorStyle copy(int width, A margin, ColorStyles color) {
            AbstractC5504s.h(margin, "margin");
            AbstractC5504s.h(color, "color");
            return new ConnectorStyle(width, margin, color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectorStyle)) {
                return false;
            }
            ConnectorStyle connectorStyle = (ConnectorStyle) other;
            return this.width == connectorStyle.width && AbstractC5504s.c(this.margin, connectorStyle.margin) && AbstractC5504s.c(this.color, connectorStyle.color);
        }

        public final /* synthetic */ ColorStyles getColor() {
            return this.color;
        }

        public final /* synthetic */ A getMargin() {
            return this.margin;
        }

        public final /* synthetic */ int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.width) * 31) + this.margin.hashCode()) * 31) + this.color.hashCode();
        }

        public String toString() {
            return "ConnectorStyle(width=" + this.width + ", margin=" + this.margin + ", color=" + this.color + ')';
        }
    }

    public TimelineComponentStyle(int i10, int i11, int i12, TimelineComponent.IconAlignment iconAlignment, boolean z10, Size size, A padding, A margin, List<ItemStyle> items, Package r11, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List<PresentedOverride<PresentedTimelinePartial>> overrides) {
        AbstractC5504s.h(iconAlignment, "iconAlignment");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(items, "items");
        AbstractC5504s.h(overrides, "overrides");
        this.itemSpacing = i10;
        this.textSpacing = i11;
        this.columnGutter = i12;
        this.iconAlignment = iconAlignment;
        this.visible = z10;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.items = items;
        this.rcPackage = r11;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.overrides = overrides;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getItemSpacing() {
        return this.itemSpacing;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Package getRcPackage() {
        return this.rcPackage;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getTabIndex() {
        return this.tabIndex;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final List<PresentedOverride<PresentedTimelinePartial>> component14() {
        return this.overrides;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTextSpacing() {
        return this.textSpacing;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColumnGutter() {
        return this.columnGutter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TimelineComponent.IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final A getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final A getMargin() {
        return this.margin;
    }

    public final List<ItemStyle> component9() {
        return this.items;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i10);
    }

    public final TimelineComponentStyle copy(int itemSpacing, int textSpacing, int columnGutter, TimelineComponent.IconAlignment iconAlignment, boolean visible, Size size, A padding, A margin, List<ItemStyle> items, Package rcPackage, ResolvedOffer resolvedOffer, Integer tabIndex, OfferEligibility offerEligibility, List<PresentedOverride<PresentedTimelinePartial>> overrides) {
        AbstractC5504s.h(iconAlignment, "iconAlignment");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(items, "items");
        AbstractC5504s.h(overrides, "overrides");
        return new TimelineComponentStyle(itemSpacing, textSpacing, columnGutter, iconAlignment, visible, size, padding, margin, items, rcPackage, resolvedOffer, tabIndex, offerEligibility, overrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimelineComponentStyle)) {
            return false;
        }
        TimelineComponentStyle timelineComponentStyle = (TimelineComponentStyle) other;
        return this.itemSpacing == timelineComponentStyle.itemSpacing && this.textSpacing == timelineComponentStyle.textSpacing && this.columnGutter == timelineComponentStyle.columnGutter && this.iconAlignment == timelineComponentStyle.iconAlignment && this.visible == timelineComponentStyle.visible && AbstractC5504s.c(this.size, timelineComponentStyle.size) && AbstractC5504s.c(this.padding, timelineComponentStyle.padding) && AbstractC5504s.c(this.margin, timelineComponentStyle.margin) && AbstractC5504s.c(this.items, timelineComponentStyle.items) && AbstractC5504s.c(this.rcPackage, timelineComponentStyle.rcPackage) && AbstractC5504s.c(this.resolvedOffer, timelineComponentStyle.resolvedOffer) && AbstractC5504s.c(this.tabIndex, timelineComponentStyle.tabIndex) && AbstractC5504s.c(this.offerEligibility, timelineComponentStyle.offerEligibility) && AbstractC5504s.c(this.overrides, timelineComponentStyle.overrides);
    }

    public final /* synthetic */ int getColumnGutter() {
        return this.columnGutter;
    }

    public final /* synthetic */ TimelineComponent.IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final /* synthetic */ int getItemSpacing() {
        return this.itemSpacing;
    }

    public final /* synthetic */ List getItems() {
        return this.items;
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

    public final /* synthetic */ int getTextSpacing() {
        return this.textSpacing;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((Integer.hashCode(this.itemSpacing) * 31) + Integer.hashCode(this.textSpacing)) * 31) + Integer.hashCode(this.columnGutter)) * 31) + this.iconAlignment.hashCode()) * 31) + Boolean.hashCode(this.visible)) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.items.hashCode()) * 31;
        Package r12 = this.rcPackage;
        int iHashCode2 = (iHashCode + (r12 == null ? 0 : r12.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int iHashCode3 = (iHashCode2 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        return ((iHashCode4 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "TimelineComponentStyle(itemSpacing=" + this.itemSpacing + ", textSpacing=" + this.textSpacing + ", columnGutter=" + this.columnGutter + ", iconAlignment=" + this.iconAlignment + ", visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", items=" + this.items + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", overrides=" + this.overrides + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u008a\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u0010HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/state/PackageContext;", b.f34626S, "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "visible", "", b.f34645c, "icon", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "connector", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;", "rcPackage", "Lcom/revenuecat/purchases/Package;", "resolvedOffer", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "tabIndex", "", "offerEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "overrides", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTimelineItemPartial;", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;ZLcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;)V", "getConnector", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;", "getDescription", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "getIcon", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "getOfferEligibility", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getOverrides", "()Ljava/util/List;", "getRcPackage", "()Lcom/revenuecat/purchases/Package;", "getResolvedOffer", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getTabIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getVisible", "()Z", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;ZLcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/util/List;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "equals", "other", "", "hashCode", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ItemStyle implements PackageContext {
        public static final int $stable = 0;
        private final ConnectorStyle connector;
        private final TextComponentStyle description;
        private final IconComponentStyle icon;
        private final OfferEligibility offerEligibility;
        private final List<PresentedOverride<PresentedTimelineItemPartial>> overrides;
        private final Package rcPackage;
        private final ResolvedOffer resolvedOffer;
        private final Integer tabIndex;
        private final TextComponentStyle title;
        private final boolean visible;

        public ItemStyle(TextComponentStyle title, boolean z10, TextComponentStyle textComponentStyle, IconComponentStyle icon, ConnectorStyle connectorStyle, Package r72, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List<PresentedOverride<PresentedTimelineItemPartial>> overrides) {
            AbstractC5504s.h(title, "title");
            AbstractC5504s.h(icon, "icon");
            AbstractC5504s.h(overrides, "overrides");
            this.title = title;
            this.visible = z10;
            this.description = textComponentStyle;
            this.icon = icon;
            this.connector = connectorStyle;
            this.rcPackage = r72;
            this.resolvedOffer = resolvedOffer;
            this.tabIndex = num;
            this.offerEligibility = offerEligibility;
            this.overrides = overrides;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ItemStyle copy$default(ItemStyle itemStyle, TextComponentStyle textComponentStyle, boolean z10, TextComponentStyle textComponentStyle2, IconComponentStyle iconComponentStyle, ConnectorStyle connectorStyle, Package r62, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                textComponentStyle = itemStyle.title;
            }
            if ((i10 & 2) != 0) {
                z10 = itemStyle.visible;
            }
            if ((i10 & 4) != 0) {
                textComponentStyle2 = itemStyle.description;
            }
            if ((i10 & 8) != 0) {
                iconComponentStyle = itemStyle.icon;
            }
            if ((i10 & 16) != 0) {
                connectorStyle = itemStyle.connector;
            }
            if ((i10 & 32) != 0) {
                r62 = itemStyle.rcPackage;
            }
            if ((i10 & 64) != 0) {
                resolvedOffer = itemStyle.resolvedOffer;
            }
            if ((i10 & 128) != 0) {
                num = itemStyle.tabIndex;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                offerEligibility = itemStyle.offerEligibility;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                list = itemStyle.overrides;
            }
            OfferEligibility offerEligibility2 = offerEligibility;
            List list2 = list;
            ResolvedOffer resolvedOffer2 = resolvedOffer;
            Integer num2 = num;
            ConnectorStyle connectorStyle2 = connectorStyle;
            Package r82 = r62;
            return itemStyle.copy(textComponentStyle, z10, textComponentStyle2, iconComponentStyle, connectorStyle2, r82, resolvedOffer2, num2, offerEligibility2, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextComponentStyle getTitle() {
            return this.title;
        }

        public final List<PresentedOverride<PresentedTimelineItemPartial>> component10() {
            return this.overrides;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getVisible() {
            return this.visible;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextComponentStyle getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final IconComponentStyle getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ConnectorStyle getConnector() {
            return this.connector;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Package getRcPackage() {
            return this.rcPackage;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final ResolvedOffer getResolvedOffer() {
            return this.resolvedOffer;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Integer getTabIndex() {
            return this.tabIndex;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final OfferEligibility getOfferEligibility() {
            return this.offerEligibility;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
        public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
            return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i10);
        }

        public final ItemStyle copy(TextComponentStyle title, boolean visible, TextComponentStyle description, IconComponentStyle icon, ConnectorStyle connector, Package rcPackage, ResolvedOffer resolvedOffer, Integer tabIndex, OfferEligibility offerEligibility, List<PresentedOverride<PresentedTimelineItemPartial>> overrides) {
            AbstractC5504s.h(title, "title");
            AbstractC5504s.h(icon, "icon");
            AbstractC5504s.h(overrides, "overrides");
            return new ItemStyle(title, visible, description, icon, connector, rcPackage, resolvedOffer, tabIndex, offerEligibility, overrides);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemStyle)) {
                return false;
            }
            ItemStyle itemStyle = (ItemStyle) other;
            return AbstractC5504s.c(this.title, itemStyle.title) && this.visible == itemStyle.visible && AbstractC5504s.c(this.description, itemStyle.description) && AbstractC5504s.c(this.icon, itemStyle.icon) && AbstractC5504s.c(this.connector, itemStyle.connector) && AbstractC5504s.c(this.rcPackage, itemStyle.rcPackage) && AbstractC5504s.c(this.resolvedOffer, itemStyle.resolvedOffer) && AbstractC5504s.c(this.tabIndex, itemStyle.tabIndex) && AbstractC5504s.c(this.offerEligibility, itemStyle.offerEligibility) && AbstractC5504s.c(this.overrides, itemStyle.overrides);
        }

        public final /* synthetic */ ConnectorStyle getConnector() {
            return this.connector;
        }

        public final /* synthetic */ TextComponentStyle getDescription() {
            return this.description;
        }

        public final /* synthetic */ IconComponentStyle getIcon() {
            return this.icon;
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

        @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
        public /* synthetic */ Package getRcPackage() {
            return this.rcPackage;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
        public /* synthetic */ ResolvedOffer getResolvedOffer() {
            return this.resolvedOffer;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
        public /* synthetic */ Integer getTabIndex() {
            return this.tabIndex;
        }

        public final /* synthetic */ TextComponentStyle getTitle() {
            return this.title;
        }

        public final /* synthetic */ boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + Boolean.hashCode(this.visible)) * 31;
            TextComponentStyle textComponentStyle = this.description;
            int iHashCode2 = (((iHashCode + (textComponentStyle == null ? 0 : textComponentStyle.hashCode())) * 31) + this.icon.hashCode()) * 31;
            ConnectorStyle connectorStyle = this.connector;
            int iHashCode3 = (iHashCode2 + (connectorStyle == null ? 0 : connectorStyle.hashCode())) * 31;
            Package r12 = this.rcPackage;
            int iHashCode4 = (iHashCode3 + (r12 == null ? 0 : r12.hashCode())) * 31;
            ResolvedOffer resolvedOffer = this.resolvedOffer;
            int iHashCode5 = (iHashCode4 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
            Integer num = this.tabIndex;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            OfferEligibility offerEligibility = this.offerEligibility;
            return ((iHashCode6 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + this.overrides.hashCode();
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
        public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
            return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
        }

        public String toString() {
            return "ItemStyle(title=" + this.title + ", visible=" + this.visible + ", description=" + this.description + ", icon=" + this.icon + ", connector=" + this.connector + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", overrides=" + this.overrides + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ItemStyle(TextComponentStyle textComponentStyle, boolean z10, TextComponentStyle textComponentStyle2, IconComponentStyle iconComponentStyle, ConnectorStyle connectorStyle, Package r72, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            List list2;
            OfferEligibility offerEligibility2;
            resolvedOffer = (i10 & 64) != 0 ? null : resolvedOffer;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                list2 = list;
                offerEligibility2 = null;
            } else {
                list2 = list;
                offerEligibility2 = offerEligibility;
            }
            this(textComponentStyle, z10, textComponentStyle2, iconComponentStyle, connectorStyle, r72, resolvedOffer, num, offerEligibility2, list2);
        }
    }

    public /* synthetic */ TimelineComponentStyle(int i10, int i11, int i12, TimelineComponent.IconAlignment iconAlignment, boolean z10, Size size, A a10, A a11, List list, Package r28, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, iconAlignment, z10, size, a10, a11, list, r28, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : resolvedOffer, num, (i13 & 4096) != 0 ? null : offerEligibility, list2);
    }
}
