package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import C.A;
import I0.B;
import J.i;
import K0.InterfaceC1788g;
import Td.L;
import U.j0;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.h2;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ImagePreviewsKt;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import p0.l;
import s0.AbstractC6387s0;
import s0.C6385r0;
import x.AbstractC7007e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\n\u001a\u0019\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001ao\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0003¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010%\u001a\u00020\u001dH\u0003¢\u0006\u0004\b&\u0010'\u001a5\u0010/\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\b\b\u0002\u0010,\u001a\u00020+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0003¢\u0006\u0004\b/\u00100\u001a5\u0010/\u001a\u00020!2\u0006\u0010)\u001a\u0002012\u0006\u0010*\u001a\u0002012\b\b\u0002\u0010,\u001a\u00020+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0003¢\u0006\u0004\b/\u00102\u001a:\u00109\u001a\u00020+2\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\u001dH\u0003ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a-\u0010<\u001a\u00020-2\b\b\u0002\u0010:\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u00104\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@²\u0006\u000e\u0010?\u001a\u0004\u0018\u00010>8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Landroidx/compose/ui/e;", "modifier", "LTd/L;", "TimelineComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V", "TimelineComponentView_Align_Title_Preview", "(LY/m;I)V", "TimelineComponentView_Align_TitleAndDescription_Preview", "TimelineComponentView_Connector_Margin_Preview", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "TimelineComponentView_Size_Preview", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "textWidth", "TimelineComponentView_TextSize_Preview", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;LY/m;I)V", "", "itemSpacing", "textSpacing", "columnGutter", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "iconAlignment", "", "visible", "LC/A;", "padding", "margin", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "items", "previewStyle", "(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LC/A;Ljava/util/List;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle;", "connectorMargins", "previewItems", "(LC/A;LY/m;II)Ljava/util/List;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", b.f34626S, b.f34645c, "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "icon", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;", "connector", "previewItem", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ItemStyle;", "Ls0/r0;", "color", "backgroundColor", "paddingValues", "previewIcon-6xbWgXg", "(JJLcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;", "previewIcon", "width", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "previewConnectorStyle", "(ILC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TimelineComponentStyle$ConnectorStyle;", "Li1/h;", "biggestIconWidth", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class TimelineComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TimelineComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TimelineComponentStyle timelineComponentStyle, PaywallState.Loaded.Components components, e eVar, int i10, int i11) {
            super(2);
            this.$style = timelineComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TimelineComponentViewKt.TimelineComponentView(this.$style, this.$state, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TimelineComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TimelineComponentStyle timelineComponentStyle, PaywallState.Loaded.Components components, e eVar, int i10, int i11) {
            super(2);
            this.$style = timelineComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TimelineComponentViewKt.TimelineComponentView(this.$style, this.$state, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView_Align_TitleAndDescription_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42861 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42861(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TimelineComponentViewKt.TimelineComponentView_Align_TitleAndDescription_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView_Align_Title_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42871 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42871(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TimelineComponentViewKt.TimelineComponentView_Align_Title_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView_Connector_Margin_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42881 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42881(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TimelineComponentViewKt.TimelineComponentView_Connector_Margin_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView_Size_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42891 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Size $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42891(Size size) {
            super(2);
            this.$size = size;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-111498279, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Size_Preview.<anonymous> (TimelineComponentView.kt:272)");
            }
            e.a aVar = e.f26613a;
            C6385r0.a aVar2 = C6385r0.f58985b;
            e eVarD = androidx.compose.foundation.b.d(aVar, aVar2.k(), null, 2, null);
            Size size = this.$size;
            e.a aVar3 = l0.e.f52304a;
            B bH = f.h(aVar3.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar4 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar4.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar4.e());
            m2.e(interfaceC2425mB, iR, aVar4.g());
            Function2 function2B = aVar4.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar4.f());
            h hVar = h.f26161a;
            TimelineComponentViewKt.TimelineComponentView(TimelineComponentViewKt.previewStyle(0, 0, 0, null, false, size, null, null, null, interfaceC2425m, 0, 479), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            float f10 = 16;
            j0.b("timeline = w:" + size.getWidth().getClass().getSimpleName() + " x h:" + size.getHeight().getClass().getSimpleName(), p.i(AbstractC7007e.f(androidx.compose.foundation.b.c(l.b(hVar.b(aVar, aVar3.e()), C5015h.n(f10), i.a(50), false, 0L, 0L, 28, null), aVar2.k(), i.a(50)), C5015h.n(2), aVar2.a(), i.a(50)), C5015h.n(f10)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131068);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView_Size_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Size $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Size size, int i10) {
            super(2);
            this.$size = size;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TimelineComponentViewKt.TimelineComponentView_Size_Preview(this.$size, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView_TextSize_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42901 extends AbstractC5506u implements Function2 {
        final /* synthetic */ SizeConstraint $textWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42901(SizeConstraint sizeConstraint) {
            super(2);
            this.$textWidth = sizeConstraint;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-408857751, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_TextSize_Preview.<anonymous> (TimelineComponentView.kt:307)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            C6385r0.a aVar2 = C6385r0.f58985b;
            androidx.compose.ui.e eVarD = androidx.compose.foundation.b.d(aVar, aVar2.k(), null, 2, null);
            SizeConstraint sizeConstraint = this.$textWidth;
            e.a aVar3 = l0.e.f52304a;
            B bH = f.h(aVar3.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar4 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar4.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar4.e());
            m2.e(interfaceC2425mB, iR, aVar4.g());
            Function2 function2B = aVar4.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar4.f());
            h hVar = h.f26161a;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f10 = 8;
            IconComponentStyle iconComponentStyleM551previewIcon6xbWgXg = TimelineComponentViewKt.m551previewIcon6xbWgXg(0L, 0L, new Size(new SizeConstraint.Fixed(39, null), new SizeConstraint.Fixed(39, null)), p.a(C5015h.n(f10)), interfaceC2425m, 3456, 3);
            FontWeight fontWeight = FontWeight.MEDIUM;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
            TimelineComponentViewKt.TimelineComponentView(TimelineComponentViewKt.previewStyle(0, 0, 0, null, false, size, null, null, AbstractC2279u.p(TimelineComponentViewKt.previewItem(PreviewHelpersKt.previewTextComponentStyle("Today", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : fontWeight, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(sizeConstraint, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("Description of what you get today if you subscribe with multiple lines to check wrapping", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(sizeConstraint, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), iconComponentStyleM551previewIcon6xbWgXg, (TimelineComponentStyle.ConnectorStyle) null, interfaceC2425m, 0, 8), TimelineComponentViewKt.previewItem(PreviewHelpersKt.previewTextComponentStyle("Day X", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : fontWeight, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(sizeConstraint, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("We'll remind you that your trial is ending soon", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(sizeConstraint, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), TimelineComponentViewKt.m551previewIcon6xbWgXg(0L, 0L, new Size(new SizeConstraint.Fixed(39, null), new SizeConstraint.Fixed(39, null)), p.a(C5015h.n(f10)), interfaceC2425m, 3456, 3), (TimelineComponentStyle.ConnectorStyle) null, interfaceC2425m, 0, 8), TimelineComponentViewKt.previewItem(PreviewHelpersKt.previewTextComponentStyle("Day Y", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : fontWeight, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(sizeConstraint, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("You'll be charged. You can cancel anytime before.", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(sizeConstraint, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), TimelineComponentViewKt.m551previewIcon6xbWgXg(0L, 0L, new Size(new SizeConstraint.Fixed(39, null), new SizeConstraint.Fixed(39, null)), p.a(C5015h.n(f10)), interfaceC2425m, 3456, 3), (TimelineComponentStyle.ConnectorStyle) null, interfaceC2425m, 3072, 0)), interfaceC2425m, 196608, 223), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            float f11 = 16;
            j0.b("text = w:" + sizeConstraint.getClass().getSimpleName() + " x h:Fit", p.i(AbstractC7007e.f(androidx.compose.foundation.b.c(l.b(hVar.b(aVar, aVar3.e()), C5015h.n(f11), i.a(50), false, 0L, 0L, 28, null), aVar2.k(), i.a(50)), C5015h.n(2), aVar2.a(), i.a(50)), C5015h.n(f11)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131068);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView_TextSize_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42912 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ SizeConstraint $textWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42912(SizeConstraint sizeConstraint, int i10) {
            super(2);
            this.$textWidth = sizeConstraint;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TimelineComponentViewKt.TimelineComponentView_TextSize_Preview(this.$textWidth, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TimelineComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle r16, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r17, androidx.compose.ui.e r18, Y.InterfaceC2425m r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt.TimelineComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final C5015h TimelineComponentView$lambda$13$lambda$1(h2 h2Var) {
        return (C5015h) h2Var.getValue();
    }

    public static final void TimelineComponentView_Align_TitleAndDescription_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1930279475);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1930279475, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Align_TitleAndDescription_Preview (TimelineComponentView.kt:227)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, interfaceC2425mG, 0, 1), ComposableSingletons$TimelineComponentViewKt.INSTANCE.m548getLambda2$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42861(i10));
        }
    }

    public static final void TimelineComponentView_Align_Title_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(747423832);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(747423832, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Align_Title_Preview (TimelineComponentView.kt:214)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, interfaceC2425mG, 0, 1), ComposableSingletons$TimelineComponentViewKt.INSTANCE.m547getLambda1$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42871(i10));
        }
    }

    public static final void TimelineComponentView_Connector_Margin_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(475255038);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(475255038, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Connector_Margin_Preview (TimelineComponentView.kt:240)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, interfaceC2425mG, 0, 1), ComposableSingletons$TimelineComponentViewKt.INSTANCE.m549getLambda3$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42881(i10));
        }
    }

    public static final void TimelineComponentView_Size_Preview(Size size, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(74978622);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(size) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(74978622, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Size_Preview (TimelineComponentView.kt:270)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, interfaceC2425mG, 0, 1), g0.i.d(-111498279, true, new C42891(size), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(size, i10));
        }
    }

    public static final void TimelineComponentView_TextSize_Preview(SizeConstraint sizeConstraint, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(774105102);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(sizeConstraint) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(774105102, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_TextSize_Preview (TimelineComponentView.kt:305)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, interfaceC2425mG, 0, 1), g0.i.d(-408857751, true, new C42901(sizeConstraint), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42912(sizeConstraint, i10));
        }
    }

    private static final TimelineComponentStyle.ConnectorStyle previewConnectorStyle(int i10, A a10, ColorStyle colorStyle) {
        return new TimelineComponentStyle.ConnectorStyle(i10, a10, new ColorStyles(colorStyle, null, 2, null));
    }

    static /* synthetic */ TimelineComponentStyle.ConnectorStyle previewConnectorStyle$default(int i10, A a10, ColorStyle colorStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        if ((i11 & 2) != 0) {
            a10 = p.a(C5015h.n(0));
        }
        if ((i11 & 4) != 0) {
            colorStyle = ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.d(4290561265L)));
        }
        return previewConnectorStyle(i10, a10, colorStyle);
    }

    /* JADX INFO: renamed from: previewIcon-6xbWgXg */
    public static final IconComponentStyle m551previewIcon6xbWgXg(long j10, long j11, Size size, A a10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        interfaceC2425m.V(-254474895);
        if ((i11 & 1) != 0) {
            j10 = C6385r0.f58985b.k();
        }
        long jD = (i11 & 2) != 0 ? AbstractC6387s0.d(4283919579L) : j11;
        Size size2 = (i11 & 4) != 0 ? new Size(new SizeConstraint.Fixed(20, null), new SizeConstraint.Fixed(20, null)) : size;
        A a11 = (i11 & 8) != 0 ? p.a(C5015h.n(4)) : a10;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-254474895, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewIcon (TimelineComponentView.kt:502)");
        }
        IconComponentStyle iconComponentStylePreviewIconComponentStyle = PreviewHelpersKt.previewIconComponentStyle(size2, false, new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(j10)), null, 2, null), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(jD)), null, 2, null), a11, p.a(C5015h.n(0)), null, null, null, interfaceC2425m, ((i10 >> 6) & 14) | 14352384 | ((i10 << 3) & 57344), 258);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return iconComponentStylePreviewIconComponentStyle;
    }

    public static final TimelineComponentStyle.ItemStyle previewItem(TextComponentStyle textComponentStyle, TextComponentStyle textComponentStyle2, IconComponentStyle iconComponentStyle, TimelineComponentStyle.ConnectorStyle connectorStyle, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        interfaceC2425m.V(-1551417669);
        IconComponentStyle iconComponentStyleM551previewIcon6xbWgXg = (i11 & 4) != 0 ? m551previewIcon6xbWgXg(0L, 0L, null, null, interfaceC2425m, 0, 15) : iconComponentStyle;
        TimelineComponentStyle.ConnectorStyle connectorStylePreviewConnectorStyle$default = (i11 & 8) != 0 ? previewConnectorStyle$default(0, null, null, 7, null) : connectorStyle;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1551417669, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewItem (TimelineComponentView.kt:459)");
        }
        TimelineComponentStyle.ItemStyle itemStyle = new TimelineComponentStyle.ItemStyle(textComponentStyle, true, textComponentStyle2, iconComponentStyleM551previewIcon6xbWgXg, connectorStylePreviewConnectorStyle$default, null, null, null, null, AbstractC2279u.m(), 320, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return itemStyle;
    }

    public static final List<TimelineComponentStyle.ItemStyle> previewItems(A a10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        interfaceC2425m.V(-2140988222);
        A a11 = (i11 & 1) != 0 ? p.a(C5015h.n(0)) : a10;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2140988222, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewItems (TimelineComponentView.kt:422)");
        }
        List<TimelineComponentStyle.ItemStyle> listP = AbstractC2279u.p(previewItem("Today", "Description of what you get today if you subscribe with multiple lines to check wrapping", (IconComponentStyle) null, previewConnectorStyle$default(0, a11, null, 5, null), interfaceC2425m, 54, 4), previewItem("Day X", "We'll remind you that your trial is ending soon", m551previewIcon6xbWgXg(0L, 0L, new Size(new SizeConstraint.Fixed(30, null), new SizeConstraint.Fixed(30, null)), null, interfaceC2425m, 384, 11), previewConnectorStyle$default(0, a11, null, 5, null), interfaceC2425m, 54, 0), previewItem("Day Y", "You'll be charged. You can cancel anytime before.", m551previewIcon6xbWgXg(C6385r0.f58985b.a(), AbstractC6387s0.d(4279227523L), null, null, interfaceC2425m, 54, 12), previewConnectorStyle$default(0, a11, ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(0.0f, AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.b(1037443)), 0.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.d(4279227523L)), 100.0f)))), 1, null), interfaceC2425m, 54, 0));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return listP;
    }

    public static final TimelineComponentStyle previewStyle(int i10, int i11, int i12, TimelineComponent.IconAlignment iconAlignment, boolean z10, Size size, A a10, A a11, List<TimelineComponentStyle.ItemStyle> list, InterfaceC2425m interfaceC2425m, int i13, int i14) {
        interfaceC2425m.V(-1453577113);
        int i15 = (i14 & 1) != 0 ? 24 : i10;
        int i16 = (i14 & 2) != 0 ? 4 : i11;
        int i17 = (i14 & 4) != 0 ? 8 : i12;
        TimelineComponent.IconAlignment iconAlignment2 = (i14 & 8) != 0 ? TimelineComponent.IconAlignment.TitleAndDescription : iconAlignment;
        boolean z11 = (i14 & 16) != 0 ? true : z10;
        Size size2 = (i14 & 32) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size;
        A a12 = (i14 & 64) != 0 ? p.a(C5015h.n(5)) : a10;
        A a13 = (i14 & 128) != 0 ? p.a(C5015h.n(5)) : a11;
        List<TimelineComponentStyle.ItemStyle> listPreviewItems = (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? previewItems(null, interfaceC2425m, 0, 1) : list;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1453577113, i13, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewStyle (TimelineComponentView.kt:401)");
        }
        TimelineComponentStyle timelineComponentStyle = new TimelineComponentStyle(i15, i16, i17, iconAlignment2, z11, size2, a12, a13, listPreviewItems, null, null, null, null, AbstractC2279u.m(), 5120, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return timelineComponentStyle;
    }

    private static final TimelineComponentStyle.ItemStyle previewItem(String str, String str2, IconComponentStyle iconComponentStyle, TimelineComponentStyle.ConnectorStyle connectorStyle, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        interfaceC2425m.V(66138427);
        IconComponentStyle iconComponentStyleM551previewIcon6xbWgXg = (i11 & 4) != 0 ? m551previewIcon6xbWgXg(0L, 0L, null, null, interfaceC2425m, 0, 15) : iconComponentStyle;
        TimelineComponentStyle.ConnectorStyle connectorStylePreviewConnectorStyle$default = (i11 & 8) != 0 ? previewConnectorStyle$default(0, null, null, 7, null) : connectorStyle;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(66138427, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewItem (TimelineComponentView.kt:476)");
        }
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
        TimelineComponentStyle.ItemStyle itemStyle = new TimelineComponentStyle.ItemStyle(PreviewHelpersKt.previewTextComponentStyle(str, (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : FontWeight.BOLD, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), true, PreviewHelpersKt.previewTextComponentStyle(str2, (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), iconComponentStyleM551previewIcon6xbWgXg, connectorStylePreviewConnectorStyle$default, null, null, null, null, AbstractC2279u.m(), 320, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return itemStyle;
    }
}
