package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.C2330h;
import Vf.D;
import Vf.J;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\b\u0007\u0018\u0000 `2\u00020\u0001:\u0002a`BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 BÉ\u0001\b\u0011\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J(\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÁ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b9\u00105\u001a\u0004\b7\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b>\u00105\u001a\u0004\b=\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010?\u0012\u0004\bB\u00105\u001a\u0004\b@\u0010AR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010C\u0012\u0004\bF\u00105\u001a\u0004\bD\u0010ER\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bM\u0010LR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010VR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010W\u0012\u0004\bZ\u00105\u001a\u0004\bX\u0010YR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b[\u00100R\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\\\u0012\u0004\b_\u00105\u001a\u0004\b]\u0010^¨\u0006b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "", "initialPageIndex", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "pageAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "pagePeek", "", "pageSpacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "pageControl", "loop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getInitialPageIndex", "()Ljava/lang/Integer;", "getInitialPageIndex$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getPagePeek", "getPagePeek$annotations", "Ljava/lang/Float;", "getPageSpacing", "()Ljava/lang/Float;", "getPageSpacing$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl$annotations", "getLoop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialCarouselComponent implements PartialComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CarouselComponent.AutoAdvancePages autoAdvance;
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Integer initialPageIndex;
    private final Boolean loop;
    private final Padding margin;
    private final Padding padding;
    private final VerticalAlignment pageAlignment;
    private final CarouselComponent.PageControl pageControl;
    private final Integer pagePeek;
    private final Float pageSpacing;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return PartialCarouselComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialCarouselComponent() {
        this((Boolean) null, (Integer) null, (VerticalAlignment) null, (Size) null, (Integer) null, (Float) null, (ColorScheme) null, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (CarouselComponent.PageControl) null, (Boolean) null, (CarouselComponent.AutoAdvancePages) null, 65535, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialCarouselComponent self, d output, e serialDesc) {
        if (output.g(serialDesc, 0) || self.visible != null) {
            output.f(serialDesc, 0, C2330h.f20193a, self.visible);
        }
        if (output.g(serialDesc, 1) || self.initialPageIndex != null) {
            output.f(serialDesc, 1, J.f20144a, self.initialPageIndex);
        }
        if (output.g(serialDesc, 2) || self.pageAlignment != null) {
            output.f(serialDesc, 2, VerticalAlignmentDeserializer.INSTANCE, self.pageAlignment);
        }
        if (output.g(serialDesc, 3) || self.size != null) {
            output.f(serialDesc, 3, Size$$serializer.INSTANCE, self.size);
        }
        if (output.g(serialDesc, 4) || self.pagePeek != null) {
            output.f(serialDesc, 4, J.f20144a, self.pagePeek);
        }
        if (output.g(serialDesc, 5) || self.pageSpacing != null) {
            output.f(serialDesc, 5, D.f20127a, self.pageSpacing);
        }
        if (output.g(serialDesc, 6) || self.backgroundColor != null) {
            output.f(serialDesc, 6, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.g(serialDesc, 7) || self.background != null) {
            output.f(serialDesc, 7, BackgroundDeserializer.INSTANCE, self.background);
        }
        if (output.g(serialDesc, 8) || self.padding != null) {
            output.f(serialDesc, 8, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.g(serialDesc, 9) || self.margin != null) {
            output.f(serialDesc, 9, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.g(serialDesc, 10) || self.shape != null) {
            output.f(serialDesc, 10, ShapeDeserializer.INSTANCE, self.shape);
        }
        if (output.g(serialDesc, 11) || self.border != null) {
            output.f(serialDesc, 11, Border$$serializer.INSTANCE, self.border);
        }
        if (output.g(serialDesc, 12) || self.shadow != null) {
            output.f(serialDesc, 12, Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (output.g(serialDesc, 13) || self.pageControl != null) {
            output.f(serialDesc, 13, CarouselComponent$PageControl$$serializer.INSTANCE, self.pageControl);
        }
        if (output.g(serialDesc, 14) || self.loop != null) {
            output.f(serialDesc, 14, C2330h.f20193a, self.loop);
        }
        if (!output.g(serialDesc, 15) && self.autoAdvance == null) {
            return;
        }
        output.f(serialDesc, 15, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, self.autoAdvance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialCarouselComponent)) {
            return false;
        }
        PartialCarouselComponent partialCarouselComponent = (PartialCarouselComponent) obj;
        return AbstractC5504s.c(this.visible, partialCarouselComponent.visible) && AbstractC5504s.c(this.initialPageIndex, partialCarouselComponent.initialPageIndex) && this.pageAlignment == partialCarouselComponent.pageAlignment && AbstractC5504s.c(this.size, partialCarouselComponent.size) && AbstractC5504s.c(this.pagePeek, partialCarouselComponent.pagePeek) && AbstractC5504s.c(this.pageSpacing, partialCarouselComponent.pageSpacing) && AbstractC5504s.c(this.backgroundColor, partialCarouselComponent.backgroundColor) && AbstractC5504s.c(this.background, partialCarouselComponent.background) && AbstractC5504s.c(this.padding, partialCarouselComponent.padding) && AbstractC5504s.c(this.margin, partialCarouselComponent.margin) && AbstractC5504s.c(this.shape, partialCarouselComponent.shape) && AbstractC5504s.c(this.border, partialCarouselComponent.border) && AbstractC5504s.c(this.shadow, partialCarouselComponent.shadow) && AbstractC5504s.c(this.pageControl, partialCarouselComponent.pageControl) && AbstractC5504s.c(this.loop, partialCarouselComponent.loop) && AbstractC5504s.c(this.autoAdvance, partialCarouselComponent.autoAdvance);
    }

    public final /* synthetic */ CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ Integer getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final /* synthetic */ Boolean getLoop() {
        return this.loop;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ VerticalAlignment getPageAlignment() {
        return this.pageAlignment;
    }

    public final /* synthetic */ CarouselComponent.PageControl getPageControl() {
        return this.pageControl;
    }

    public final /* synthetic */ Integer getPagePeek() {
        return this.pagePeek;
    }

    public final /* synthetic */ Float getPageSpacing() {
        return this.pageSpacing;
    }

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.initialPageIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        VerticalAlignment verticalAlignment = this.pageAlignment;
        int iHashCode3 = (iHashCode2 + (verticalAlignment == null ? 0 : verticalAlignment.hashCode())) * 31;
        Size size = this.size;
        int iHashCode4 = (iHashCode3 + (size == null ? 0 : size.hashCode())) * 31;
        Integer num2 = this.pagePeek;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f10 = this.pageSpacing;
        int iHashCode6 = (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode7 = (iHashCode6 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int iHashCode8 = (iHashCode7 + (background == null ? 0 : background.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode9 = (iHashCode8 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int iHashCode10 = (iHashCode9 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Shape shape = this.shape;
        int iHashCode11 = (iHashCode10 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode12 = (iHashCode11 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode13 = (iHashCode12 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        CarouselComponent.PageControl pageControl = this.pageControl;
        int iHashCode14 = (iHashCode13 + (pageControl == null ? 0 : pageControl.hashCode())) * 31;
        Boolean bool2 = this.loop;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CarouselComponent.AutoAdvancePages autoAdvancePages = this.autoAdvance;
        return iHashCode15 + (autoAdvancePages != null ? autoAdvancePages.hashCode() : 0);
    }

    public String toString() {
        return "PartialCarouselComponent(visible=" + this.visible + ", initialPageIndex=" + this.initialPageIndex + ", pageAlignment=" + this.pageAlignment + ", size=" + this.size + ", pagePeek=" + this.pagePeek + ", pageSpacing=" + this.pageSpacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", pageControl=" + this.pageControl + ", loop=" + this.loop + ", autoAdvance=" + this.autoAdvance + ')';
    }

    @InterfaceC2154e
    public /* synthetic */ PartialCarouselComponent(int i10, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f10, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, CarouselComponent.PageControl pageControl, Boolean bool2, CarouselComponent.AutoAdvancePages autoAdvancePages, t0 t0Var) {
        if ((i10 & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i10 & 2) == 0) {
            this.initialPageIndex = null;
        } else {
            this.initialPageIndex = num;
        }
        if ((i10 & 4) == 0) {
            this.pageAlignment = null;
        } else {
            this.pageAlignment = verticalAlignment;
        }
        if ((i10 & 8) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i10 & 16) == 0) {
            this.pagePeek = null;
        } else {
            this.pagePeek = num2;
        }
        if ((i10 & 32) == 0) {
            this.pageSpacing = null;
        } else {
            this.pageSpacing = f10;
        }
        if ((i10 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i10 & 128) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i10 & 2048) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i10 & 4096) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i10 & 8192) == 0) {
            this.pageControl = null;
        } else {
            this.pageControl = pageControl;
        }
        if ((i10 & 16384) == 0) {
            this.loop = null;
        } else {
            this.loop = bool2;
        }
        if ((i10 & 32768) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = autoAdvancePages;
        }
    }

    public PartialCarouselComponent(Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f10, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, CarouselComponent.PageControl pageControl, Boolean bool2, CarouselComponent.AutoAdvancePages autoAdvancePages) {
        this.visible = bool;
        this.initialPageIndex = num;
        this.pageAlignment = verticalAlignment;
        this.size = size;
        this.pagePeek = num2;
        this.pageSpacing = f10;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.padding = padding;
        this.margin = padding2;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.pageControl = pageControl;
        this.loop = bool2;
        this.autoAdvance = autoAdvancePages;
    }

    public static /* synthetic */ void getAutoAdvance$annotations() {
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getInitialPageIndex$annotations() {
    }

    public static /* synthetic */ void getPageAlignment$annotations() {
    }

    public static /* synthetic */ void getPageControl$annotations() {
    }

    public static /* synthetic */ void getPagePeek$annotations() {
    }

    public static /* synthetic */ void getPageSpacing$annotations() {
    }

    public /* synthetic */ PartialCarouselComponent(Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f10, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, CarouselComponent.PageControl pageControl, Boolean bool2, CarouselComponent.AutoAdvancePages autoAdvancePages, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : verticalAlignment, (i10 & 8) != 0 ? null : size, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : f10, (i10 & 64) != 0 ? null : colorScheme, (i10 & 128) != 0 ? null : background, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : padding, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : padding2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : shape, (i10 & 2048) != 0 ? null : border, (i10 & 4096) != 0 ? null : shadow, (i10 & 8192) != 0 ? null : pageControl, (i10 & 16384) != 0 ? null : bool2, (i10 & 32768) != 0 ? null : autoAdvancePages);
    }
}
