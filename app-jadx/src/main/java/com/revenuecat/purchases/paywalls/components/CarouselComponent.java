package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.D;
import Td.InterfaceC2154e;
import Tf.e;
import Ud.AbstractC2279u;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.C2324e;
import Vf.H0;
import Vf.J;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
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
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0007\u0018\u0000 j2\u00020\u0001:\u0004kljmBá\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0002¢\u0006\u0004\b%\u0010&Bï\u0001\b\u0011\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010 \u0012\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.HÁ\u0001¢\u0006\u0004\b1\u00102R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u00109R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bB\u0010>\u001a\u0004\b@\u0010AR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010ER\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\bG\u0010>\u001a\u0004\bF\u0010<R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u0010>\u001a\u0004\bI\u0010JR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010L\u0012\u0004\bO\u0010>\u001a\u0004\bM\u0010NR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bV\u0010UR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\b^\u0010_R\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010`\u0012\u0004\bc\u0010>\u001a\u0004\ba\u0010bR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u00107\u001a\u0004\bd\u00109R\"\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010e\u0012\u0004\bh\u0010>\u001a\u0004\bf\u0010gR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00028\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\bi\u00106¨\u0006n"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "pages", "", "visible", "", "initialPageIndex", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "pageAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "pagePeek", "", "pageSpacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "pageControl", "loop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "overrides", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljava/util/List;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljava/util/List;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;LUf/d;LTf/e;)V", "write$Self", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getInitialPageIndex", "()Ljava/lang/Integer;", "getInitialPageIndex$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getPagePeek", "getPagePeek$annotations", "Ljava/lang/Float;", "getPageSpacing", "()Ljava/lang/Float;", "getPageSpacing$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl$annotations", "getLoop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance$annotations", "getOverrides", "Companion", "$serializer", "AutoAdvancePages", "PageControl", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarouselComponent implements PaywallComponent {
    private final AutoAdvancePages autoAdvance;
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Integer initialPageIndex;
    private final Boolean loop;
    private final Padding margin;
    private final List<ComponentOverride<PartialCarouselComponent>> overrides;
    private final Padding padding;
    private final VerticalAlignment pageAlignment;
    private final PageControl pageControl;
    private final Integer pagePeek;
    private final Float pageSpacing;
    private final List<StackComponent> pages;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {new C2324e(StackComponent$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C2324e(ComponentOverride.INSTANCE.serializer(PartialCarouselComponent$$serializer.INSTANCE))};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\"!#B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0011\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "", "", "msTimePerPage", "msTransitionTime", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "transitionType", "<init>", "(IILcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(IIILcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;LUf/d;LTf/e;)V", "write$Self", "I", "getMsTimePerPage", "()I", "getMsTimePerPage$annotations", "()V", "getMsTransitionTime", "getMsTransitionTime$annotations", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "getTransitionType", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "getTransitionType$annotations", "Companion", "$serializer", "TransitionType", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AutoAdvancePages {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int msTimePerPage;
        private final int msTransitionTime;
        private final TransitionType transitionType;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return CarouselComponent$AutoAdvancePages$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "", "(Ljava/lang/String;I)V", "FADE", "SLIDE", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum TransitionType {
            FADE,
            SLIDE;


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return CarouselTransitionTypeDeserializer.INSTANCE;
                }

                private Companion() {
                }
            }
        }

        @InterfaceC2154e
        public /* synthetic */ AutoAdvancePages(int i10, int i11, int i12, TransitionType transitionType, t0 t0Var) {
            if (3 != (i10 & 3)) {
                AbstractC2327f0.a(i10, 3, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE.getDescriptor());
            }
            this.msTimePerPage = i11;
            this.msTransitionTime = i12;
            if ((i10 & 4) == 0) {
                this.transitionType = null;
            } else {
                this.transitionType = transitionType;
            }
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(AutoAdvancePages self, d output, e serialDesc) {
            output.p(serialDesc, 0, self.msTimePerPage);
            output.p(serialDesc, 1, self.msTransitionTime);
            if (!output.g(serialDesc, 2) && self.transitionType == null) {
                return;
            }
            output.f(serialDesc, 2, CarouselTransitionTypeDeserializer.INSTANCE, self.transitionType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoAdvancePages)) {
                return false;
            }
            AutoAdvancePages autoAdvancePages = (AutoAdvancePages) obj;
            return this.msTimePerPage == autoAdvancePages.msTimePerPage && this.msTransitionTime == autoAdvancePages.msTransitionTime && this.transitionType == autoAdvancePages.transitionType;
        }

        public final /* synthetic */ int getMsTimePerPage() {
            return this.msTimePerPage;
        }

        public final /* synthetic */ int getMsTransitionTime() {
            return this.msTransitionTime;
        }

        public final /* synthetic */ TransitionType getTransitionType() {
            return this.transitionType;
        }

        public int hashCode() {
            int i10 = ((this.msTimePerPage * 31) + this.msTransitionTime) * 31;
            TransitionType transitionType = this.transitionType;
            return i10 + (transitionType == null ? 0 : transitionType.hashCode());
        }

        public String toString() {
            return "AutoAdvancePages(msTimePerPage=" + this.msTimePerPage + ", msTransitionTime=" + this.msTransitionTime + ", transitionType=" + this.transitionType + ')';
        }

        public AutoAdvancePages(int i10, int i11, TransitionType transitionType) {
            this.msTimePerPage = i10;
            this.msTransitionTime = i11;
            this.transitionType = transitionType;
        }

        public /* synthetic */ AutoAdvancePages(int i10, int i11, TransitionType transitionType, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, (i12 & 4) != 0 ? null : transitionType);
        }

        public static /* synthetic */ void getMsTimePerPage$annotations() {
        }

        public static /* synthetic */ void getMsTransitionTime$annotations() {
        }

        public static /* synthetic */ void getTransitionType$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return CarouselComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ CarouselComponent(int i10, List list, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f10, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List list2, t0 t0Var) {
        if (9 != (i10 & 9)) {
            AbstractC2327f0.a(i10, 9, CarouselComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.pages = list;
        if ((i10 & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i10 & 4) == 0) {
            this.initialPageIndex = null;
        } else {
            this.initialPageIndex = num;
        }
        this.pageAlignment = verticalAlignment;
        if ((i10 & 16) == 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            this.size = new Size(fit, fit);
        } else {
            this.size = size;
        }
        if ((i10 & 32) == 0) {
            this.pagePeek = null;
        } else {
            this.pagePeek = num2;
        }
        if ((i10 & 64) == 0) {
            this.pageSpacing = null;
        } else {
            this.pageSpacing = f10;
        }
        if ((i10 & 128) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i10 & 2048) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i10 & 4096) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i10 & 8192) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i10 & 16384) == 0) {
            this.pageControl = null;
        } else {
            this.pageControl = pageControl;
        }
        if ((32768 & i10) == 0) {
            this.loop = null;
        } else {
            this.loop = bool2;
        }
        if ((65536 & i10) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = autoAdvancePages;
        }
        this.overrides = (i10 & 131072) == 0 ? AbstractC2279u.m() : list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(com.revenuecat.purchases.paywalls.components.CarouselComponent r5, Uf.d r6, Tf.e r7) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.CarouselComponent.write$Self$purchases_defaultsBc8Release(com.revenuecat.purchases.paywalls.components.CarouselComponent, Uf.d, Tf.e):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselComponent)) {
            return false;
        }
        CarouselComponent carouselComponent = (CarouselComponent) obj;
        return AbstractC5504s.c(this.pages, carouselComponent.pages) && AbstractC5504s.c(this.visible, carouselComponent.visible) && AbstractC5504s.c(this.initialPageIndex, carouselComponent.initialPageIndex) && this.pageAlignment == carouselComponent.pageAlignment && AbstractC5504s.c(this.size, carouselComponent.size) && AbstractC5504s.c(this.pagePeek, carouselComponent.pagePeek) && AbstractC5504s.c(this.pageSpacing, carouselComponent.pageSpacing) && AbstractC5504s.c(this.backgroundColor, carouselComponent.backgroundColor) && AbstractC5504s.c(this.background, carouselComponent.background) && AbstractC5504s.c(this.padding, carouselComponent.padding) && AbstractC5504s.c(this.margin, carouselComponent.margin) && AbstractC5504s.c(this.shape, carouselComponent.shape) && AbstractC5504s.c(this.border, carouselComponent.border) && AbstractC5504s.c(this.shadow, carouselComponent.shadow) && AbstractC5504s.c(this.pageControl, carouselComponent.pageControl) && AbstractC5504s.c(this.loop, carouselComponent.loop) && AbstractC5504s.c(this.autoAdvance, carouselComponent.autoAdvance) && AbstractC5504s.c(this.overrides, carouselComponent.overrides);
    }

    public final /* synthetic */ AutoAdvancePages getAutoAdvance() {
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

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ VerticalAlignment getPageAlignment() {
        return this.pageAlignment;
    }

    public final /* synthetic */ PageControl getPageControl() {
        return this.pageControl;
    }

    public final /* synthetic */ Integer getPagePeek() {
        return this.pagePeek;
    }

    public final /* synthetic */ Float getPageSpacing() {
        return this.pageSpacing;
    }

    public final /* synthetic */ List getPages() {
        return this.pages;
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
        int iHashCode = this.pages.hashCode() * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.initialPageIndex;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.pageAlignment.hashCode()) * 31) + this.size.hashCode()) * 31;
        Integer num2 = this.pagePeek;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f10 = this.pageSpacing;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode6 = (iHashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int iHashCode7 = (((((iHashCode6 + (background == null ? 0 : background.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Shape shape = this.shape;
        int iHashCode8 = (iHashCode7 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode9 = (iHashCode8 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode10 = (iHashCode9 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        PageControl pageControl = this.pageControl;
        int iHashCode11 = (iHashCode10 + (pageControl == null ? 0 : pageControl.hashCode())) * 31;
        Boolean bool2 = this.loop;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AutoAdvancePages autoAdvancePages = this.autoAdvance;
        return ((iHashCode12 + (autoAdvancePages != null ? autoAdvancePages.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "CarouselComponent(pages=" + this.pages + ", visible=" + this.visible + ", initialPageIndex=" + this.initialPageIndex + ", pageAlignment=" + this.pageAlignment + ", size=" + this.size + ", pagePeek=" + this.pagePeek + ", pageSpacing=" + this.pageSpacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", pageControl=" + this.pageControl + ", loop=" + this.loop + ", autoAdvance=" + this.autoAdvance + ", overrides=" + this.overrides + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0004@?ABBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b>\u0010=¨\u0006C"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "position", "", "spacing", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", AppStateModule.APP_STATE_ACTIVE, "default", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "getPosition", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "Ljava/lang/Integer;", "getSpacing", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "getActive", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "getDefault", "Companion", "$serializer", "Indicator", "Position", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PageControl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Indicator active;
        private final ColorScheme backgroundColor;
        private final Border border;
        private final Indicator default;
        private final Padding margin;
        private final Padding padding;
        private final Position position;
        private final Shadow shadow;
        private final Shape shape;
        private final Integer spacing;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return CarouselComponent$PageControl$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBQ\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u001fR(\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "", "LTd/D;", "width", "height", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "strokeColor", "strokeWidth", "<init>", "(IILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;LTd/D;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILTd/D;LTd/D;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;LTd/D;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;LUf/d;LTf/e;)V", "write$Self", "I", "getWidth-pVg5ArA", "()I", "getHeight-pVg5ArA", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getStrokeColor", "getStrokeColor$annotations", "()V", "LTd/D;", "getStrokeWidth-0hXNFcg", "()LTd/D;", "getStrokeWidth-0hXNFcg$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Indicator {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ColorScheme color;
            private final int height;
            private final ColorScheme strokeColor;
            private final D strokeWidth;
            private final int width;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ Indicator(int i10, int i11, ColorScheme colorScheme, ColorScheme colorScheme2, D d10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, i11, colorScheme, colorScheme2, d10);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Indicator self, d output, e serialDesc) {
                H0 h02 = H0.f20139a;
                output.m(serialDesc, 0, h02, D.a(self.width));
                output.m(serialDesc, 1, h02, D.a(self.height));
                ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
                output.m(serialDesc, 2, colorScheme$$serializer, self.color);
                if (output.g(serialDesc, 3) || self.strokeColor != null) {
                    output.f(serialDesc, 3, colorScheme$$serializer, self.strokeColor);
                }
                if (!output.g(serialDesc, 4) && self.strokeWidth == null) {
                    return;
                }
                output.f(serialDesc, 4, h02, self.strokeWidth);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Indicator)) {
                    return false;
                }
                Indicator indicator = (Indicator) obj;
                return this.width == indicator.width && this.height == indicator.height && AbstractC5504s.c(this.color, indicator.color) && AbstractC5504s.c(this.strokeColor, indicator.strokeColor) && AbstractC5504s.c(this.strokeWidth, indicator.strokeWidth);
            }

            public final /* synthetic */ ColorScheme getColor() {
                return this.color;
            }

            /* JADX INFO: renamed from: getHeight-pVg5ArA, reason: from getter */
            public final /* synthetic */ int getHeight() {
                return this.height;
            }

            public final /* synthetic */ ColorScheme getStrokeColor() {
                return this.strokeColor;
            }

            /* JADX INFO: renamed from: getStrokeWidth-0hXNFcg, reason: from getter */
            public final /* synthetic */ D getStrokeWidth() {
                return this.strokeWidth;
            }

            /* JADX INFO: renamed from: getWidth-pVg5ArA, reason: from getter */
            public final /* synthetic */ int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int iHashCode = ((((this.width * 31) + this.height) * 31) + this.color.hashCode()) * 31;
                ColorScheme colorScheme = this.strokeColor;
                int iHashCode2 = (iHashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
                D d10 = this.strokeWidth;
                return iHashCode2 + (d10 != null ? D.h(d10.m()) : 0);
            }

            public String toString() {
                return "Indicator(width=" + ((Object) D.k(this.width)) + ", height=" + ((Object) D.k(this.height)) + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
            }

            @InterfaceC2154e
            public /* synthetic */ Indicator(int i10, D d10, D d11, ColorScheme colorScheme, ColorScheme colorScheme2, D d12, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, d10, d11, colorScheme, colorScheme2, d12, t0Var);
            }

            private Indicator(int i10, int i11, ColorScheme color, ColorScheme colorScheme, D d10) {
                AbstractC5504s.h(color, "color");
                this.width = i10;
                this.height = i11;
                this.color = color;
                this.strokeColor = colorScheme;
                this.strokeWidth = d10;
            }

            private Indicator(int i10, D d10, D d11, ColorScheme colorScheme, ColorScheme colorScheme2, D d12, t0 t0Var) {
                if (7 != (i10 & 7)) {
                    AbstractC2327f0.a(i10, 7, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE.getDescriptor());
                }
                this.width = d10.m();
                this.height = d11.m();
                this.color = colorScheme;
                if ((i10 & 8) == 0) {
                    this.strokeColor = null;
                } else {
                    this.strokeColor = colorScheme2;
                }
                if ((i10 & 16) == 0) {
                    this.strokeWidth = null;
                } else {
                    this.strokeWidth = d12;
                }
            }

            public /* synthetic */ Indicator(int i10, int i11, ColorScheme colorScheme, ColorScheme colorScheme2, D d10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, i11, colorScheme, (i12 & 8) != 0 ? null : colorScheme2, (i12 & 16) != 0 ? null : d10, null);
            }

            public static /* synthetic */ void getStrokeColor$annotations() {
            }

            /* JADX INFO: renamed from: getStrokeWidth-0hXNFcg$annotations */
            public static /* synthetic */ void m281getStrokeWidth0hXNFcg$annotations() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Position {
            TOP,
            BOTTOM;


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return CarouselPageControlPositionDeserializer.INSTANCE;
                }

                private Companion() {
                }
            }
        }

        @InterfaceC2154e
        public /* synthetic */ PageControl(int i10, Position position, Integer num, Padding padding, Padding padding2, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2, t0 t0Var) {
            if (769 != (i10 & 769)) {
                AbstractC2327f0.a(i10, 769, CarouselComponent$PageControl$$serializer.INSTANCE.getDescriptor());
            }
            this.position = position;
            if ((i10 & 2) == 0) {
                this.spacing = null;
            } else {
                this.spacing = num;
            }
            if ((i10 & 4) == 0) {
                this.padding = Padding.INSTANCE.getZero();
            } else {
                this.padding = padding;
            }
            if ((i10 & 8) == 0) {
                this.margin = Padding.INSTANCE.getZero();
            } else {
                this.margin = padding2;
            }
            if ((i10 & 16) == 0) {
                this.backgroundColor = null;
            } else {
                this.backgroundColor = colorScheme;
            }
            if ((i10 & 32) == 0) {
                this.shape = null;
            } else {
                this.shape = shape;
            }
            if ((i10 & 64) == 0) {
                this.border = null;
            } else {
                this.border = border;
            }
            if ((i10 & 128) == 0) {
                this.shadow = null;
            } else {
                this.shadow = shadow;
            }
            this.active = indicator;
            this.default = indicator2;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PageControl self, d output, e serialDesc) {
            output.m(serialDesc, 0, CarouselPageControlPositionDeserializer.INSTANCE, self.position);
            if (output.g(serialDesc, 1) || self.spacing != null) {
                output.f(serialDesc, 1, J.f20144a, self.spacing);
            }
            if (output.g(serialDesc, 2) || !AbstractC5504s.c(self.padding, Padding.INSTANCE.getZero())) {
                output.m(serialDesc, 2, Padding$$serializer.INSTANCE, self.padding);
            }
            if (output.g(serialDesc, 3) || !AbstractC5504s.c(self.margin, Padding.INSTANCE.getZero())) {
                output.m(serialDesc, 3, Padding$$serializer.INSTANCE, self.margin);
            }
            if (output.g(serialDesc, 4) || self.backgroundColor != null) {
                output.f(serialDesc, 4, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
            }
            if (output.g(serialDesc, 5) || self.shape != null) {
                output.f(serialDesc, 5, ShapeDeserializer.INSTANCE, self.shape);
            }
            if (output.g(serialDesc, 6) || self.border != null) {
                output.f(serialDesc, 6, Border$$serializer.INSTANCE, self.border);
            }
            if (output.g(serialDesc, 7) || self.shadow != null) {
                output.f(serialDesc, 7, Shadow$$serializer.INSTANCE, self.shadow);
            }
            CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
            output.m(serialDesc, 8, carouselComponent$PageControl$Indicator$$serializer, self.active);
            output.m(serialDesc, 9, carouselComponent$PageControl$Indicator$$serializer, self.default);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageControl)) {
                return false;
            }
            PageControl pageControl = (PageControl) obj;
            return this.position == pageControl.position && AbstractC5504s.c(this.spacing, pageControl.spacing) && AbstractC5504s.c(this.padding, pageControl.padding) && AbstractC5504s.c(this.margin, pageControl.margin) && AbstractC5504s.c(this.backgroundColor, pageControl.backgroundColor) && AbstractC5504s.c(this.shape, pageControl.shape) && AbstractC5504s.c(this.border, pageControl.border) && AbstractC5504s.c(this.shadow, pageControl.shadow) && AbstractC5504s.c(this.active, pageControl.active) && AbstractC5504s.c(this.default, pageControl.default);
        }

        public final /* synthetic */ Indicator getActive() {
            return this.active;
        }

        public final /* synthetic */ ColorScheme getBackgroundColor() {
            return this.backgroundColor;
        }

        public final /* synthetic */ Border getBorder() {
            return this.border;
        }

        public final /* synthetic */ Indicator getDefault() {
            return this.default;
        }

        public final /* synthetic */ Padding getMargin() {
            return this.margin;
        }

        public final /* synthetic */ Padding getPadding() {
            return this.padding;
        }

        public final /* synthetic */ Position getPosition() {
            return this.position;
        }

        public final /* synthetic */ Shadow getShadow() {
            return this.shadow;
        }

        public final /* synthetic */ Shape getShape() {
            return this.shape;
        }

        public final /* synthetic */ Integer getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            int iHashCode = this.position.hashCode() * 31;
            Integer num = this.spacing;
            int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
            ColorScheme colorScheme = this.backgroundColor;
            int iHashCode3 = (iHashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
            Shape shape = this.shape;
            int iHashCode4 = (iHashCode3 + (shape == null ? 0 : shape.hashCode())) * 31;
            Border border = this.border;
            int iHashCode5 = (iHashCode4 + (border == null ? 0 : border.hashCode())) * 31;
            Shadow shadow = this.shadow;
            return ((((iHashCode5 + (shadow != null ? shadow.hashCode() : 0)) * 31) + this.active.hashCode()) * 31) + this.default.hashCode();
        }

        public String toString() {
            return "PageControl(position=" + this.position + ", spacing=" + this.spacing + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", active=" + this.active + ", default=" + this.default + ')';
        }

        public PageControl(Position position, Integer num, Padding padding, Padding margin, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator active, Indicator indicator) {
            AbstractC5504s.h(position, "position");
            AbstractC5504s.h(padding, "padding");
            AbstractC5504s.h(margin, "margin");
            AbstractC5504s.h(active, "active");
            AbstractC5504s.h(indicator, "default");
            this.position = position;
            this.spacing = num;
            this.padding = padding;
            this.margin = margin;
            this.backgroundColor = colorScheme;
            this.shape = shape;
            this.border = border;
            this.shadow = shadow;
            this.active = active;
            this.default = indicator;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PageControl(Position position, Integer num, Padding padding, Padding padding2, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            Indicator indicator3;
            Indicator indicator4;
            Shadow shadow2;
            num = (i10 & 2) != 0 ? null : num;
            padding = (i10 & 4) != 0 ? Padding.INSTANCE.getZero() : padding;
            padding2 = (i10 & 8) != 0 ? Padding.INSTANCE.getZero() : padding2;
            colorScheme = (i10 & 16) != 0 ? null : colorScheme;
            shape = (i10 & 32) != 0 ? null : shape;
            border = (i10 & 64) != 0 ? null : border;
            if ((i10 & 128) != 0) {
                indicator3 = indicator2;
                indicator4 = indicator;
                shadow2 = null;
            } else {
                indicator3 = indicator2;
                indicator4 = indicator;
                shadow2 = shadow;
            }
            this(position, num, padding, padding2, colorScheme, shape, border, shadow2, indicator4, indicator3);
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }
    }

    public CarouselComponent(List<StackComponent> pages, Boolean bool, Integer num, VerticalAlignment pageAlignment, Size size, Integer num2, Float f10, ColorScheme colorScheme, Background background, Padding padding, Padding margin, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List<ComponentOverride<PartialCarouselComponent>> overrides) {
        AbstractC5504s.h(pages, "pages");
        AbstractC5504s.h(pageAlignment, "pageAlignment");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(overrides, "overrides");
        this.pages = pages;
        this.visible = bool;
        this.initialPageIndex = num;
        this.pageAlignment = pageAlignment;
        this.size = size;
        this.pagePeek = num2;
        this.pageSpacing = f10;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.pageControl = pageControl;
        this.loop = bool2;
        this.autoAdvance = autoAdvancePages;
        this.overrides = overrides;
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

    public /* synthetic */ CarouselComponent(List list, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f10, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Size size2;
        Boolean bool3 = (i10 & 2) != 0 ? null : bool;
        Integer num3 = (i10 & 4) != 0 ? null : num;
        if ((i10 & 16) != 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            size2 = new Size(fit, fit);
        } else {
            size2 = size;
        }
        this(list, bool3, num3, verticalAlignment, size2, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : f10, (i10 & 128) != 0 ? null : colorScheme, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : background, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? Padding.INSTANCE.getZero() : padding, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : padding2, (i10 & 2048) != 0 ? null : shape, (i10 & 4096) != 0 ? null : border, (i10 & 8192) != 0 ? null : shadow, (i10 & 16384) != 0 ? null : pageControl, (32768 & i10) != 0 ? null : bool2, (65536 & i10) != 0 ? null : autoAdvancePages, (i10 & 131072) != 0 ? AbstractC2279u.m() : list2);
    }
}
