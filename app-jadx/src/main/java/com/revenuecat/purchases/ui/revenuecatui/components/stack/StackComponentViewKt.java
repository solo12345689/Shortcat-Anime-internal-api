package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.A;
import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.G;
import C.InterfaceC1132c;
import C.J;
import C.P;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import Td.v;
import U.j0;
import Ud.AbstractC2279u;
import Ud.O;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.h2;
import Y.m2;
import ae.AbstractC2605b;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import i1.C5015h;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.C5870f;
import r0.AbstractC6231m;
import s0.AbstractC6387s0;
import s0.C6385r0;
import s0.E1;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001ae\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001ae\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001ae\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001b\u0010\u0016\u001a?\u0010\u001e\u001a\u00020\u0007*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0083\u0001\u0010%\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\u00172\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0018\u00010#H\u0003¢\u0006\u0004\b%\u0010&\u001a)\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*\u001a#\u00100\u001a\u00020+*\u00020+2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101\u001a&\u00100\u001a\u00020+*\u00020+2\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u000f\u00106\u001a\u00020\u0007H\u0003¢\u0006\u0004\b6\u00107\u001a\u000f\u00108\u001a\u00020\u0007H\u0003¢\u0006\u0004\b8\u00107\u001a\u0019\u00109\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b9\u0010:\u001a\u0019\u0010;\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b;\u0010:\u001a\u0019\u0010<\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b<\u0010:\u001a\u0019\u0010=\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b=\u0010:\u001a\u000f\u0010>\u001a\u00020\u0007H\u0003¢\u0006\u0004\b>\u00107\u001a\u000f\u0010?\u001a\u00020\u0007H\u0003¢\u0006\u0004\b?\u00107\u001a\u000f\u0010@\u001a\u00020\u0007H\u0003¢\u0006\u0004\b@\u00107\u001a\u000f\u0010A\u001a\u00020\u0007H\u0003¢\u0006\u0004\bA\u00107\u001a\u000f\u0010B\u001a\u00020\u0007H\u0003¢\u0006\u0004\bB\u00107\u001a\u000f\u0010C\u001a\u00020\u0007H\u0003¢\u0006\u0004\bC\u00107\u001a\u0019\u0010F\u001a\u00020\u00072\b\b\u0001\u0010E\u001a\u00020DH\u0003¢\u0006\u0004\bF\u0010G\u001a\u0019\u0010H\u001a\u00020\u00072\b\b\u0001\u0010E\u001a\u00020DH\u0003¢\u0006\u0004\bH\u0010G\u001a\u000f\u0010I\u001a\u00020\u0007H\u0003¢\u0006\u0004\bI\u00107\u001a\u0019\u0010J\u001a\u00020\u00072\b\b\u0001\u0010E\u001a\u00020DH\u0003¢\u0006\u0004\bJ\u0010G\u001a\u000f\u0010K\u001a\u00020\u0007H\u0003¢\u0006\u0004\bK\u00107\u001a\u000f\u0010L\u001a\u00020\u0007H\u0003¢\u0006\u0004\bL\u00107\u001a\u000f\u0010M\u001a\u00020\u0007H\u0003¢\u0006\u0004\bM\u00107\u001a\u0015\u0010P\u001a\b\u0012\u0004\u0012\u00020O0NH\u0003¢\u0006\u0004\bP\u0010Q\u001a;\u0010X\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020R2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010T\u001a\u00020S2\b\b\u0002\u0010V\u001a\u00020U2\b\b\u0002\u0010W\u001a\u00020UH\u0002¢\u0006\u0004\bX\u0010Y\"\u0018\u0010Z\u001a\u00020\u0017*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0018\u0010_\u001a\u00020\u0017*\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\"\u0018\u0010c\u001a\u00020\u0017*\u00020`8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006f²\u0006\f\u0010e\u001a\u00020d8\nX\u008a\u0084\u0002²\u0006\f\u0010e\u001a\u00020d8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "LZd/e;", "LTd/L;", "", "clickHandler", "Landroidx/compose/ui/e;", "modifier", "", "contentAlpha", "StackComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;", "stackState", "badgeStack", "Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;", "alignment", "StackWithOverlaidBadge", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;Lkotlin/jvm/functions/Function2;FLandroidx/compose/ui/e;LY/m;II)V", "", "topBadge", "StackWithLongEdgeToEdgeBadge", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;ZLkotlin/jvm/functions/Function2;FLandroidx/compose/ui/e;LY/m;II)V", "StackWithShortEdgeToEdgeBadge", "LC/c;", "mainStackBorderWidthPx", "OverlaidBadge", "(LC/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;Ljava/lang/Float;Landroidx/compose/ui/e;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "nestedBadge", "shouldApplyShadow", "Lkotlin/Function1;", "overlay", "MainStackComponent", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;FLandroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;ZLie/o;LY/m;II)V", "", "height", "getOverlaidBadgeOffsetY", "(ILcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;F)I", "LJ/b;", "Landroidx/compose/ui/layout/s;", "placeable", "Li1/d;", "density", "makeAbsolute", "(LJ/b;Landroidx/compose/ui/layout/s;Li1/d;)LJ/b;", "Lr0/l;", "shapeSize", "makeAbsolute-12SF9DM", "(LJ/b;JLi1/d;)LJ/b;", "StackComponentView_Preview_Vertical", "(LY/m;I)V", "StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll", "StackComponentView_Preview_Overlay_Badge", "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;LY/m;I)V", "StackComponentView_Preview_EdgeToEdge_Badge", "StackComponentView_Preview_Pill_EdgeToEdge_Badge", "StackComponentView_Preview_Nested_Badge", "StackComponentView_Preview_Horizontal", "StackComponentView_Preview_Children_Extend_Over_Parent", "StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll", "StackComponentView_Preview_ZLayer", "StackComponentView_Preview_HorizontalChildrenFillWidth", "StackComponentView_Preview_VerticalChildrenFillHeight", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size", "(Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;LY/m;I)V", "StackComponentView_Preview_Distribution_Without_Spacing", "StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children", "StackComponentView_Preview_Distribution_With_Spacing", "StackComponentView_Preview_HorizontalDivider", "StackComponentView_Preview_VerticalDivider", "StackComponentView_Preview_ContentAlpha", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "previewChildren", "(LY/m;I)Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge$Style;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "LC/A;", "padding", "margin", "previewBadge", "(Lcom/revenuecat/purchases/paywalls/components/properties/Badge$Style;Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;LC/A;LC/A;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "isTop", "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "getUsesAllAvailableSpace", "(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)Z", "usesAllAvailableSpace", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "getShouldIgnoreTopWindowInsets", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;)Z", "shouldIgnoreTopWindowInsets", "Ls0/E1;", "composeShape", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class StackComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$MainStackComponent$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ e $innerShapeModifier;
        final /* synthetic */ P $safeDrawingInsets;
        final /* synthetic */ InterfaceC5096o $stack;
        final /* synthetic */ StackComponentState $stackState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC5096o interfaceC5096o, e eVar, StackComponentState stackComponentState, P p10) {
            super(2);
            this.$stack = interfaceC5096o;
            this.$innerShapeModifier = eVar;
            this.$stackState = stackComponentState;
            this.$safeDrawingInsets = p10;
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
                AbstractC2454w.U(-2041007063, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous> (StackComponentView.kt:633)");
            }
            InterfaceC5096o interfaceC5096o = this.$stack;
            e eVarThen = e.f26613a.then(this.$innerShapeModifier);
            boolean applyBottomWindowInsets = this.$stackState.getApplyBottomWindowInsets();
            interfaceC2425m.V(-957923809);
            boolean zU = interfaceC2425m.U(this.$safeDrawingInsets);
            P p10 = this.$safeDrawingInsets;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new StackComponentViewKt$MainStackComponent$1$1$1(p10);
                interfaceC2425m.u(objD);
            }
            interfaceC2425m.O();
            e eVarConditional = ModifierExtensionsKt.conditional(eVarThen, applyBottomWindowInsets, (Function1) objD);
            boolean applyHorizontalWindowInsets = this.$stackState.getApplyHorizontalWindowInsets();
            interfaceC2425m.V(-957917309);
            boolean zU2 = interfaceC2425m.U(this.$safeDrawingInsets);
            P p11 = this.$safeDrawingInsets;
            Object objD2 = interfaceC2425m.D();
            if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new StackComponentViewKt$MainStackComponent$1$2$1(p11);
                interfaceC2425m.u(objD2);
            }
            interfaceC2425m.O();
            interfaceC5096o.invoke(ModifierExtensionsKt.conditional(eVarConditional, applyHorizontalWindowInsets, (Function1) objD2), interfaceC2425m, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$MainStackComponent$6 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass6 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ BadgeStyle $nestedBadge;
        final /* synthetic */ InterfaceC5096o $overlay;
        final /* synthetic */ boolean $shouldApplyShadow;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(StackComponentState stackComponentState, PaywallState.Loaded.Components components, Function2 function2, float f10, e eVar, BadgeStyle badgeStyle, boolean z10, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.$stackState = stackComponentState;
            this.$state = components;
            this.$clickHandler = function2;
            this.$contentAlpha = f10;
            this.$modifier = eVar;
            this.$nestedBadge = badgeStyle;
            this.$shouldApplyShadow = z10;
            this.$overlay = interfaceC5096o;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.MainStackComponent(this.$stackState, this.$state, this.$clickHandler, this.$contentAlpha, this.$modifier, this.$nestedBadge, this.$shouldApplyShadow, this.$overlay, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$OverlaidBadge$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$OverlaidBadge$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42301 extends l implements Function2 {
        int label;

        C42301(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42301(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42301) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$OverlaidBadge$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ Float $mainStackBorderWidthPx;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ InterfaceC1132c $this_OverlaidBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InterfaceC1132c interfaceC1132c, StackComponentStyle stackComponentStyle, PaywallState.Loaded.Components components, TwoDimensionalAlignment twoDimensionalAlignment, Float f10, e eVar, int i10, int i11) {
            super(2);
            this.$this_OverlaidBadge = interfaceC1132c;
            this.$badgeStack = stackComponentStyle;
            this.$state = components;
            this.$alignment = twoDimensionalAlignment;
            this.$mainStackBorderWidthPx = f10;
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
            StackComponentViewKt.OverlaidBadge(this.$this_OverlaidBadge, this.$badgeStack, this.$state, this.$alignment, this.$mainStackBorderWidthPx, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42311 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ StackComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42311(StackComponentStyle stackComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, float f10, int i10, int i11) {
            super(2);
            this.$style = stackComponentStyle;
            this.$state = components;
            this.$clickHandler = function2;
            this.$modifier = eVar;
            this.$contentAlpha = f10;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, this.$contentAlpha, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ StackComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(StackComponentStyle stackComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, float f10, int i10, int i11) {
            super(2);
            this.$style = stackComponentStyle;
            this.$state = components;
            this.$clickHandler = function2;
            this.$modifier = eVar;
            this.$contentAlpha = f10;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, this.$contentAlpha, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Children_Extend_Over_Parent$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42322 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42322(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Children_Extend_Over_Parent(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_ContentAlpha$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_ContentAlpha$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42331 extends l implements Function2 {
        int label;

        C42331(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42331(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42331) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_ContentAlpha$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42342 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42342(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_ContentAlpha(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42351 extends l implements Function2 {
        int label;

        C42351(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42351(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42351) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42362 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42362(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_With_Spacing$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_With_Spacing$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42371 extends l implements Function2 {
        int label;

        C42371(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42371(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42371) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_With_Spacing$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42382 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Dimension $dimension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42382(Dimension dimension, int i10) {
            super(2);
            this.$dimension = dimension;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Distribution_With_Spacing(this.$dimension, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_Without_Spacing$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_Without_Spacing$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42391 extends l implements Function2 {
        int label;

        C42391(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42391(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42391) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_Without_Spacing$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42402 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Dimension $dimension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42402(Dimension dimension, int i10) {
            super(2);
            this.$dimension = dimension;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Distribution_Without_Spacing(this.$dimension, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42411 extends l implements Function2 {
        int label;

        C42411(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42411(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42411) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42422 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Dimension $dimension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42422(Dimension dimension, int i10) {
            super(2);
            this.$dimension = dimension;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size(this.$dimension, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_EdgeToEdge_Badge$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42432 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TwoDimensionalAlignment $alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42432(TwoDimensionalAlignment twoDimensionalAlignment, int i10) {
            super(2);
            this.$alignment = twoDimensionalAlignment;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_EdgeToEdge_Badge(this.$alignment, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Horizontal$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42442 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42442(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Horizontal(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_HorizontalChildrenFillWidth$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_HorizontalChildrenFillWidth$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42451 extends l implements Function2 {
        int label;

        C42451(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42451(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42451) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_HorizontalChildrenFillWidth$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42462 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42462(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_HorizontalChildrenFillWidth(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_HorizontalDivider$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42472 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42472(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_HorizontalDivider(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Nested_Badge$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42482 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TwoDimensionalAlignment $alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42482(TwoDimensionalAlignment twoDimensionalAlignment, int i10) {
            super(2);
            this.$alignment = twoDimensionalAlignment;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Nested_Badge(this.$alignment, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Overlay_Badge$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42492 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TwoDimensionalAlignment $alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42492(TwoDimensionalAlignment twoDimensionalAlignment, int i10) {
            super(2);
            this.$alignment = twoDimensionalAlignment;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Overlay_Badge(this.$alignment, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Pill_EdgeToEdge_Badge$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42502 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TwoDimensionalAlignment $alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42502(TwoDimensionalAlignment twoDimensionalAlignment, int i10) {
            super(2);
            this.$alignment = twoDimensionalAlignment;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Pill_EdgeToEdge_Badge(this.$alignment, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42512 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42512(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42522 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42522(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Vertical$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42532 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42532(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_Vertical(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_VerticalChildrenFillHeight$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_VerticalChildrenFillHeight$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42541 extends l implements Function2 {
        int label;

        C42541(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42541(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42541) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_VerticalChildrenFillHeight$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42552 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42552(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_VerticalChildrenFillHeight(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_VerticalDivider$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42562 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42562(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_VerticalDivider(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_ZLayer$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42572 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42572(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            StackComponentViewKt.StackComponentView_Preview_ZLayer(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackWithLongEdgeToEdgeBadge$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42583 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ boolean $topBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42583(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, boolean z10, Function2 function2, float f10, e eVar, int i10, int i11) {
            super(2);
            this.$stackState = stackComponentState;
            this.$state = components;
            this.$badgeStack = stackComponentStyle;
            this.$topBadge = z10;
            this.$clickHandler = function2;
            this.$contentAlpha = f10;
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
            StackComponentViewKt.StackWithLongEdgeToEdgeBadge(this.$stackState, this.$state, this.$badgeStack, this.$topBadge, this.$clickHandler, this.$contentAlpha, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackWithOverlaidBadge$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42592 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42592(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, TwoDimensionalAlignment twoDimensionalAlignment, Function2 function2, float f10, e eVar, int i10, int i11) {
            super(2);
            this.$stackState = stackComponentState;
            this.$state = components;
            this.$badgeStack = stackComponentStyle;
            this.$alignment = twoDimensionalAlignment;
            this.$clickHandler = function2;
            this.$contentAlpha = f10;
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
            StackComponentViewKt.StackWithOverlaidBadge(this.$stackState, this.$state, this.$badgeStack, this.$alignment, this.$clickHandler, this.$contentAlpha, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackWithShortEdgeToEdgeBadge$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/c;", "LTd/L;", "invoke", "(LC/c;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42601 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ CornerRadiuses $adjustedCornerRadiuses;
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42601(StackComponentStyle stackComponentStyle, CornerRadiuses cornerRadiuses, PaywallState.Loaded.Components components, Function2 function2, TwoDimensionalAlignment twoDimensionalAlignment) {
            super(3);
            this.$badgeStack = stackComponentStyle;
            this.$adjustedCornerRadiuses = cornerRadiuses;
            this.$state = components;
            this.$clickHandler = function2;
            this.$alignment = twoDimensionalAlignment;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1132c) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1132c MainStackComponent, InterfaceC2425m interfaceC2425m, int i10) {
            int i11;
            AbstractC5504s.h(MainStackComponent, "$this$MainStackComponent");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC2425m.U(MainStackComponent) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1023039340, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackWithShortEdgeToEdgeBadge.<anonymous> (StackComponentView.kt:440)");
            }
            StackComponentViewKt.StackComponentView(StackComponentStyle.m527copyKMZiVUk$default(this.$badgeStack, null, null, false, null, 0.0f, null, null, null, new Shape.Rectangle(this.$adjustedCornerRadiuses), null, null, null, null, null, null, null, null, null, null, null, false, false, false, 8388351, null), this.$state, this.$clickHandler, MainStackComponent.b(e.f26613a, AlignmentKt.toAlignment(this.$alignment)), 0.0f, interfaceC2425m, 0, 16);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackWithShortEdgeToEdgeBadge$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42612 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42612(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, TwoDimensionalAlignment twoDimensionalAlignment, Function2 function2, float f10, e eVar, int i10, int i11) {
            super(2);
            this.$stackState = stackComponentState;
            this.$state = components;
            this.$badgeStack = stackComponentStyle;
            this.$alignment = twoDimensionalAlignment;
            this.$clickHandler = function2;
            this.$contentAlpha = f10;
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
            StackComponentViewKt.StackWithShortEdgeToEdgeBadge(this.$stackState, this.$state, this.$badgeStack, this.$alignment, this.$clickHandler, this.$contentAlpha, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TwoDimensionalAlignment.values().length];
            try {
                iArr[TwoDimensionalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TwoDimensionalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TwoDimensionalAlignment.TOP_LEADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TwoDimensionalAlignment.TOP_TRAILING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TwoDimensionalAlignment.BOTTOM_LEADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TwoDimensionalAlignment.BOTTOM_TRAILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TwoDimensionalAlignment.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TwoDimensionalAlignment.LEADING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TwoDimensionalAlignment.TRAILING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Badge.Style.values().length];
            try {
                iArr2[Badge.Style.Overlay.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Badge.Style.EdgeToEdge.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Badge.Style.Nested.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FlexDistribution.values().length];
            try {
                iArr3[FlexDistribution.SPACE_AROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[FlexDistribution.SPACE_BETWEEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[FlexDistribution.SPACE_EVENLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[FlexDistribution.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[FlexDistribution.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[FlexDistribution.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:417:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MainStackComponent(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState r24, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r25, kotlin.jvm.functions.Function2 r26, float r27, androidx.compose.ui.e r28, com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle r29, boolean r30, ie.InterfaceC5096o r31, Y.InterfaceC2425m r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.MainStackComponent(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, kotlin.jvm.functions.Function2, float, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle, boolean, ie.o, Y.m, int, int):void");
    }

    public static final E1 MainStackComponent$lambda$10(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OverlaidBadge(C.InterfaceC1132c r16, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r18, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment r19, java.lang.Float r20, androidx.compose.ui.e r21, Y.InterfaceC2425m r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.OverlaidBadge(C.c, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment, java.lang.Float, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StackComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r14, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r15, kotlin.jvm.functions.Function2 r16, androidx.compose.ui.e r17, float r18, Y.InterfaceC2425m r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.StackComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, kotlin.jvm.functions.Function2, androidx.compose.ui.e, float, Y.m, int, int):void");
    }

    public static final void StackComponentView_Preview_Children_Extend_Over_Parent(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1849301685);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1849301685, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Children_Extend_Over_Parent (StackComponentView.kt:1122)");
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            C6385r0.a aVar = C6385r0.f58985b;
            e eVarD = b.d(eVarI, aVar.e(), null, 2, null);
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarD);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            h hVar = h.f26161a;
            float f10 = 0;
            List listE = AbstractC2279u.e(PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(previewChildren(interfaceC2425mG, 0), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : null, (29694 & 4) != 0, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : null, (29694 & 16) != 0 ? C5015h.n(16) : 0.0f, (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : null, (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.a())), null, 2, null), C5015h.n(10), C5015h.n(f10), C5015h.n(3), null), (29694 & 2048) != 0 ? null : previewBadge$default(Badge.Style.Overlay, TwoDimensionalAlignment.TOP_TRAILING, new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), null, null, 24, null), (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? null : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null));
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f11 = 16;
            StackComponentView(new StackComponentStyle(listE, horizontal, true, size, C5015h.n(f11), BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l()))))), p.a(C5015h.n(f10)), p.a(C5015h.n(f11)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Children_Extend_Over_Parent$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42322(i10));
        }
    }

    public static final void StackComponentView_Preview_ContentAlpha(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1355314342);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1355314342, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_ContentAlpha (StackComponentView.kt:1674)");
            }
            StackComponentView(PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(previewChildren(interfaceC2425mG, 0), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : null, (29694 & 4) != 0, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : null, (29694 & 16) != 0 ? C5015h.n(16) : 0.0f, (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : null, (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (29694 & 2048) != 0 ? null : null, (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? null : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C42331(null), null, 0.6f, interfaceC2425mG, 24960, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42342(i10));
        }
    }

    public static final void StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-2040912590);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2040912590, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children (StackComponentView.kt:1506)");
            }
            C6385r0.a aVar = C6385r0.f58985b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), null, 2, null);
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            StackComponentView(new StackComponentStyle(AbstractC2279u.p(PreviewHelpersKt.previewTextComponentStyle("Hello", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fill, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("SPACE_AROUND", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.f())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("World", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.SPACE_AROUND), true, new Size(new SizeConstraint.Fixed(300, null), new SizeConstraint.Fixed(300, null)), C5015h.n(8), BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), null, 2, null))), p.a(C5015h.n(0)), p.a(C5015h.n(16)), new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C42351(null), null, 0.0f, interfaceC2425mG, 384, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42362(i10));
        }
    }

    public static final void StackComponentView_Preview_Distribution_With_Spacing(Dimension dimension, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        FlexDistribution distribution;
        String strName;
        Dimension dimension2;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-2060177158);
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425mG.U(dimension) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
            dimension2 = dimension;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2060177158, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Distribution_With_Spacing (StackComponentView.kt:1557)");
            }
            if (dimension instanceof Dimension.Horizontal) {
                distribution = ((Dimension.Horizontal) dimension).getDistribution();
            } else if (dimension instanceof Dimension.Vertical) {
                distribution = ((Dimension.Vertical) dimension).getDistribution();
            } else {
                if (!(dimension instanceof Dimension.ZLayer)) {
                    throw new r();
                }
                distribution = null;
            }
            C6385r0.a aVar = C6385r0.f58985b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentStyle textComponentStylePreviewTextComponentStyle = PreviewHelpersKt.previewTextComponentStyle("Hello", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null);
            if (distribution == null || (strName = distribution.name()) == null) {
                strName = "null";
            }
            float f10 = 16;
            StackComponentStyle stackComponentStyle = new StackComponentStyle(AbstractC2279u.p(textComponentStylePreviewTextComponentStyle, PreviewHelpersKt.previewTextComponentStyle(strName, (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.f())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("World", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), dimension, true, new Size(new SizeConstraint.Fixed(300, null), new SizeConstraint.Fixed(300, null)), C5015h.n(f10), BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), null, 2, null))), p.a(C5015h.n(0)), p.a(C5015h.n(f10)), new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null);
            dimension2 = dimension;
            interfaceC2425m2 = interfaceC2425mG;
            StackComponentView(stackComponentStyle, PreviewHelpersKt.previewEmptyState(null, interfaceC2425m2, 0, 1), new C42371(null), null, 0.0f, interfaceC2425m2, 384, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C42382(dimension2, i10));
        }
    }

    public static final void StackComponentView_Preview_Distribution_Without_Spacing(Dimension dimension, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        FlexDistribution distribution;
        String strName;
        Dimension dimension2;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1146712254);
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425mG.U(dimension) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
            dimension2 = dimension;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1146712254, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Distribution_Without_Spacing (StackComponentView.kt:1455)");
            }
            if (dimension instanceof Dimension.Horizontal) {
                distribution = ((Dimension.Horizontal) dimension).getDistribution();
            } else if (dimension instanceof Dimension.Vertical) {
                distribution = ((Dimension.Vertical) dimension).getDistribution();
            } else {
                if (!(dimension instanceof Dimension.ZLayer)) {
                    throw new r();
                }
                distribution = null;
            }
            C6385r0.a aVar = C6385r0.f58985b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentStyle textComponentStylePreviewTextComponentStyle = PreviewHelpersKt.previewTextComponentStyle("Hello", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null);
            if (distribution == null || (strName = distribution.name()) == null) {
                strName = "null";
            }
            float f10 = 0;
            dimension2 = dimension;
            interfaceC2425m2 = interfaceC2425mG;
            StackComponentView(new StackComponentStyle(AbstractC2279u.p(textComponentStylePreviewTextComponentStyle, PreviewHelpersKt.previewTextComponentStyle(strName, (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.f())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("World", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), dimension, true, new Size(new SizeConstraint.Fixed(300, null), new SizeConstraint.Fixed(300, null)), C5015h.n(f10), BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), null, 2, null))), p.a(C5015h.n(f10)), p.a(C5015h.n(16)), new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m2, 0, 1), new C42391(null), null, 0.0f, interfaceC2425m2, 384, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C42402(dimension2, i10));
        }
    }

    public static final void StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size(Dimension dimension, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        FlexDistribution distribution;
        String strName;
        Dimension dimension2;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(585047730);
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425mG.U(dimension) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
            dimension2 = dimension;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(585047730, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size (StackComponentView.kt:1402)");
            }
            if (dimension instanceof Dimension.Horizontal) {
                distribution = ((Dimension.Horizontal) dimension).getDistribution();
            } else if (dimension instanceof Dimension.Vertical) {
                distribution = ((Dimension.Vertical) dimension).getDistribution();
            } else {
                if (!(dimension instanceof Dimension.ZLayer)) {
                    throw new r();
                }
                distribution = null;
            }
            C6385r0.a aVar = C6385r0.f58985b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentStyle textComponentStylePreviewTextComponentStyle = PreviewHelpersKt.previewTextComponentStyle("Hello", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null);
            if (distribution == null || (strName = distribution.name()) == null) {
                strName = "null";
            }
            float f10 = 0;
            dimension2 = dimension;
            interfaceC2425m2 = interfaceC2425mG;
            StackComponentView(new StackComponentStyle(AbstractC2279u.p(textComponentStylePreviewTextComponentStyle, PreviewHelpersKt.previewTextComponentStyle(strName, (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.f())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("World", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), dimension, true, new Size(fit, fit), C5015h.n(f10), BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), null, 2, null))), p.a(C5015h.n(f10)), p.a(C5015h.n(16)), new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m2, 0, 1), new C42411(null), null, 0.0f, interfaceC2425m2, 384, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C42422(dimension2, i10));
        }
    }

    public static final void StackComponentView_Preview_EdgeToEdge_Badge(TwoDimensionalAlignment twoDimensionalAlignment, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1687690690);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(twoDimensionalAlignment) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1687690690, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_EdgeToEdge_Badge (StackComponentView.kt:947)");
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            StackComponentView(PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(previewChildren(interfaceC2425mG, 0), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : null, (29694 & 4) != 0, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : null, (29694 & 16) != 0 ? C5015h.n(16) : 0.0f, (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : null, (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null), C5015h.n(20), C5015h.n(0), C5015h.n(5), null), (29694 & 2048) != 0 ? null : previewBadge$default(Badge.Style.EdgeToEdge, twoDimensionalAlignment, new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), null, null, 24, null), (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? null : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_EdgeToEdge_Badge$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42432(twoDimensionalAlignment, i10));
        }
    }

    public static final void StackComponentView_Preview_Horizontal(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(537558075);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(537558075, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Horizontal (StackComponentView.kt:1076)");
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            List<TextComponentStyle> listPreviewChildren = previewChildren(interfaceC2425mG, 0);
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f10 = 16;
            float fN = C5015h.n(f10);
            C6385r0.a aVar2 = C6385r0.f58985b;
            StackComponentView(new StackComponentStyle(listPreviewChildren, horizontal, true, size, fN, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.l()))))), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.a())), null, 2, null), C5015h.n(30), C5015h.n(0), C5015h.n(5), null), null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Horizontal$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42442(i10));
        }
    }

    public static final void StackComponentView_Preview_HorizontalChildrenFillWidth(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(94466939);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(94466939, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_HorizontalChildrenFillWidth (StackComponentView.kt:1302)");
            }
            C6385r0.a aVar = C6385r0.f58985b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), null, 2, null);
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            List listP = AbstractC2279u.p(PreviewHelpersKt.previewTextComponentStyle("Hello", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fill, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("World", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fill, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null));
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(new SizeConstraint.Fixed(200, null), fit);
            float f10 = 16;
            float fN = C5015h.n(f10);
            ColorStyles colorStylesM448constructorimpl = BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), null, 2, null));
            StackComponentView(new StackComponentStyle(listP, horizontal, true, size, fN, BackgroundStyles.Color.m447boximpl(colorStylesM448constructorimpl), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle(null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C42451(null), null, 0.0f, interfaceC2425mG, 384, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42462(i10));
        }
    }

    public static final void StackComponentView_Preview_HorizontalDivider(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1466582790);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1466582790, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_HorizontalDivider (StackComponentView.kt:1608)");
            }
            C1131b.f fVarF = C1131b.f2093a.f();
            e.a aVar = e.f26613a;
            B bA = AbstractC1136g.a(fVarF, l0.e.f52304a.k(), interfaceC2425mG, 6);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, aVar);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            j0.b("There should be a divider below this text.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425mG, 6, 0, 131070);
            StackComponentView(PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(AbstractC2279u.m(), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : new Dimension.Vertical(HorizontalAlignment.LEADING, FlexDistribution.SPACE_BETWEEN), (29694 & 4) != 0 ? true : true, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fixed(1, null)), (29694 & 16) != 0 ? C5015h.n(16) : C5015h.n(0), (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.f(200, 200, 200, 0, 8, null))), null, 2, null))), (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : p.c(0.0f, C5015h.n(40), 1, null), (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (29694 & 2048) != 0 ? null : null, (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? null : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_HorizontalDivider$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425m2 = interfaceC2425mG;
            j0.b("There should be a divider above this text.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m2, 6, 0, 131070);
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C42472(i10));
        }
    }

    public static final void StackComponentView_Preview_Nested_Badge(TwoDimensionalAlignment twoDimensionalAlignment, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1890270268);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(twoDimensionalAlignment) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1890270268, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Nested_Badge (StackComponentView.kt:1022)");
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            Shape.Rectangle rectangle = new Shape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d));
            List<TextComponentStyle> listPreviewChildren = previewChildren(interfaceC2425mG, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE);
            float fN = C5015h.n(16);
            C6385r0.a aVar2 = C6385r0.f58985b;
            float f10 = 20;
            float f11 = 0;
            StackComponentView(new StackComponentStyle(listPreviewChildren, vertical, true, size, fN, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())), null, 2, null))), p.a(C5015h.n(f10)), p.a(C5015h.n(f11)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(C5015h.n(10), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.l())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.a())), null, 2, null), C5015h.n(f10), C5015h.n(f11), C5015h.n(5), null), previewBadge$default(Badge.Style.Nested, twoDimensionalAlignment, rectangle, null, null, 24, null), null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Nested_Badge$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42482(twoDimensionalAlignment, i10));
        }
    }

    public static final void StackComponentView_Preview_Overlay_Badge(TwoDimensionalAlignment twoDimensionalAlignment, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1927454081);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(twoDimensionalAlignment) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1927454081, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Overlay_Badge (StackComponentView.kt:887)");
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            Shape.Rectangle rectangle = new Shape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d));
            List<TextComponentStyle> listPreviewChildren = previewChildren(interfaceC2425mG, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE);
            float fN = C5015h.n(16);
            C6385r0.a aVar2 = C6385r0.f58985b;
            float f10 = 12;
            StackComponentView(new StackComponentStyle(listPreviewChildren, vertical, true, size, fN, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())), null, 2, null))), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(C5015h.n(10), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.a())), null, 2, null), C5015h.n(20), C5015h.n(0), C5015h.n(5), null), previewBadge$default(Badge.Style.Overlay, twoDimensionalAlignment, rectangle, null, p.c(C5015h.n(8), 0.0f, 2, null), 8, null), null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Overlay_Badge$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42492(twoDimensionalAlignment, i10));
        }
    }

    public static final void StackComponentView_Preview_Pill_EdgeToEdge_Badge(TwoDimensionalAlignment twoDimensionalAlignment, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1484368524);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(twoDimensionalAlignment) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1484368524, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Pill_EdgeToEdge_Badge (StackComponentView.kt:975)");
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            List<TextComponentStyle> listPreviewChildren = previewChildren(interfaceC2425mG, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE);
            float fN = C5015h.n(16);
            C6385r0.a aVar2 = C6385r0.f58985b;
            BackgroundStyles.Color colorM447boximpl = BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())), null, 2, null)));
            float f10 = 0;
            A a10 = p.a(C5015h.n(f10));
            A a11 = p.a(C5015h.n(f10));
            Shape.Pill pill = Shape.Pill.INSTANCE;
            StackComponentView(new StackComponentStyle(listPreviewChildren, vertical, true, size, fN, colorM447boximpl, a10, a11, pill, new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.a())), null, 2, null), C5015h.n(20), C5015h.n(f10), C5015h.n(5), null), previewBadge$default(Badge.Style.EdgeToEdge, twoDimensionalAlignment, pill, null, null, 24, null), null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Pill_EdgeToEdge_Badge$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42502(twoDimensionalAlignment, i10));
        }
    }

    public static final void StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-889520099);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-889520099, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll (StackComponentView.kt:1181)");
            }
            C5870f c5870f = new C5870f(0, 10);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870f, 10));
            Iterator it = c5870f.iterator();
            while (it.hasNext()) {
                String str = "Hello " + ((O) it).nextInt();
                ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null);
                SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
                arrayList.add(PreviewHelpersKt.previewTextComponentStyle(str, (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? true : true, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(8.0d, 8.0d, 8.0d, 8.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null));
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit2 = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit2, fit2);
            float f10 = 16;
            float fN = C5015h.n(f10);
            C6385r0.a aVar2 = C6385r0.f58985b;
            StackComponentView(new StackComponentStyle(arrayList, horizontal, true, size, fN, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.l()))))), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.a())), null, 2, null), C5015h.n(10), C5015h.n(0), C5015h.n(5), null), null, q.Horizontal, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42512(i10));
        }
    }

    public static final void StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-99980615);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-99980615, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll (StackComponentView.kt:817)");
            }
            C5870f c5870f = new C5870f(0, 30);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870f, 10));
            Iterator it = c5870f.iterator();
            while (it.hasNext()) {
                String str = "Hello " + ((O) it).nextInt();
                ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null);
                SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
                arrayList.add(PreviewHelpersKt.previewTextComponentStyle(str, (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? true : true, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(8.0d, 8.0d, 8.0d, 8.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null));
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit2 = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit2, fit2);
            float f10 = 16;
            float fN = C5015h.n(f10);
            C6385r0.a aVar2 = C6385r0.f58985b;
            StackComponentView(new StackComponentStyle(arrayList, vertical, true, size, fN, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.l()))))), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.a())), null, 2, null), C5015h.n(10), C5015h.n(0), C5015h.n(3), null), null, q.Vertical, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42522(i10));
        }
    }

    public static final void StackComponentView_Preview_Vertical(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1372631849);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1372631849, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Vertical (StackComponentView.kt:770)");
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            List<TextComponentStyle> listPreviewChildren = previewChildren(interfaceC2425mG, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f10 = 16;
            float fN = C5015h.n(f10);
            C6385r0.a aVar2 = C6385r0.f58985b;
            StackComponentView(new StackComponentStyle(listPreviewChildren, vertical, true, size, fN, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.l()))))), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.a())), null, 2, null), C5015h.n(10), C5015h.n(0), C5015h.n(3), null), null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Vertical$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42532(i10));
        }
    }

    public static final void StackComponentView_Preview_VerticalChildrenFillHeight(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(89883392);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(89883392, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_VerticalChildrenFillHeight (StackComponentView.kt:1345)");
            }
            C6385r0.a aVar = C6385r0.f58985b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            List listP = AbstractC2279u.p(PreviewHelpersKt.previewTextComponentStyle("Hello", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fill), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("World", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fill), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null));
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(fit, new SizeConstraint.Fixed(200, null));
            float f10 = 16;
            float fN = C5015h.n(f10);
            ColorStyles colorStylesM448constructorimpl = BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), null, 2, null));
            StackComponentView(new StackComponentStyle(listP, vertical, true, size, fN, BackgroundStyles.Color.m447boximpl(colorStylesM448constructorimpl), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C42541(null), null, 0.0f, interfaceC2425mG, 384, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42552(i10));
        }
    }

    public static final void StackComponentView_Preview_VerticalDivider(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-843904936);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-843904936, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_VerticalDivider (StackComponentView.kt:1639)");
            }
            e.a aVar = e.f26613a;
            e eVarI = s.i(aVar, C5015h.n(100));
            B b10 = G.b(C1131b.f2093a.f(), l0.e.f52304a.l(), interfaceC2425mG, 6);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, b10, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            J j10 = J.f2025a;
            j0.b("There should be a divider to the right of this text.", C.I.b(j10, aVar, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425mG, 6, 0, 131068);
            StackComponentView(PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(AbstractC2279u.m(), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : new Dimension.Horizontal(VerticalAlignment.TOP, FlexDistribution.SPACE_BETWEEN), (29694 & 4) != 0 ? true : true, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : new Size(new SizeConstraint.Fixed(1, null), SizeConstraint.Fill.INSTANCE), (29694 & 16) != 0 ? C5015h.n(16) : C5015h.n(0), (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.f(200, 200, 200, 0, 8, null))), null, 2, null))), (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : p.c(C5015h.n(40), 0.0f, 2, null), (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (29694 & 2048) != 0 ? null : null, (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? null : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_VerticalDivider$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425m2 = interfaceC2425mG;
            j0.b("There should be a divider to the left of this text.", C.I.b(j10, aVar, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m2, 6, 0, 131068);
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C42562(i10));
        }
    }

    public static final void StackComponentView_Preview_ZLayer(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(665263624);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(665263624, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_ZLayer (StackComponentView.kt:1240)");
            }
            e eVarI = p.i(e.f26613a, C5015h.n(32));
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            C6385r0.a aVar2 = C6385r0.f58985b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.l())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())));
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            float f10 = 16;
            float f11 = 5;
            interfaceC2425mG = interfaceC2425mG;
            StackComponentView(new StackComponentStyle(AbstractC2279u.p(PreviewHelpersKt.previewTextComponentStyle("Hello", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(8.0d, 8.0d, 8.0d, 8.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : new Padding(0.0d, 24.0d, 0.0d, 24.0d), (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("World", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(8.0d, 8.0d, 8.0d, 8.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), new Dimension.ZLayer(TwoDimensionalAlignment.BOTTOM_TRAILING), true, new Size(fit, fit), C5015h.n(f10), BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.l()))))), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.a())), null, 2, null), C5015h.n(20), C5015h.n(f11), C5015h.n(f11), null), null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new StackComponentViewKt$StackComponentView_Preview_ZLayer$1$1(null), null, 0.0f, interfaceC2425mG, 384, 24);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42572(i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StackWithLongEdgeToEdgeBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r18, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r19, boolean r20, kotlin.jvm.functions.Function2 r21, float r22, androidx.compose.ui.e r23, Y.InterfaceC2425m r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.StackWithLongEdgeToEdgeBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, boolean, kotlin.jvm.functions.Function2, float, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final E1 StackWithLongEdgeToEdgeBadge$lambda$4(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StackWithOverlaidBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState r20, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r21, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r22, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment r23, kotlin.jvm.functions.Function2 r24, float r25, androidx.compose.ui.e r26, Y.InterfaceC2425m r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.StackWithOverlaidBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment, kotlin.jvm.functions.Function2, float, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StackWithShortEdgeToEdgeBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState r28, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r29, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r30, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment r31, kotlin.jvm.functions.Function2 r32, float r33, androidx.compose.ui.e r34, Y.InterfaceC2425m r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.StackWithShortEdgeToEdgeBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment, kotlin.jvm.functions.Function2, float, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final int getOverlaidBadgeOffsetY(int i10, TwoDimensionalAlignment twoDimensionalAlignment, float f10) {
        switch (WhenMappings.$EnumSwitchMapping$0[twoDimensionalAlignment.ordinal()]) {
            case 1:
            case 3:
            case 4:
                return AbstractC5466a.d(-((i10 - f10) / 2));
            case 2:
            case 5:
            case 6:
                return AbstractC5466a.d((i10 - f10) / 2);
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                throw new r();
        }
    }

    static /* synthetic */ int getOverlaidBadgeOffsetY$default(int i10, TwoDimensionalAlignment twoDimensionalAlignment, float f10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 0.0f;
        }
        return getOverlaidBadgeOffsetY(i10, twoDimensionalAlignment, f10);
    }

    public static final boolean getShouldIgnoreTopWindowInsets(ComponentStyle componentStyle) {
        if (componentStyle instanceof ImageComponentStyle) {
            return ((ImageComponentStyle) componentStyle).getIgnoreTopWindowInsets();
        }
        if (componentStyle instanceof VideoComponentStyle) {
            return ((VideoComponentStyle) componentStyle).getIgnoreTopWindowInsets();
        }
        return false;
    }

    public static final boolean getUsesAllAvailableSpace(FlexDistribution flexDistribution) {
        AbstractC5504s.h(flexDistribution, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[flexDistribution.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new r();
        }
    }

    private static final boolean isTop(TwoDimensionalAlignment twoDimensionalAlignment) {
        switch (WhenMappings.$EnumSwitchMapping$0[twoDimensionalAlignment.ordinal()]) {
            case 1:
            case 3:
            case 4:
                return true;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new r();
        }
    }

    public static final J.b makeAbsolute(J.b bVar, androidx.compose.ui.layout.s sVar, InterfaceC5011d interfaceC5011d) {
        return m505makeAbsolute12SF9DM(bVar, AbstractC6231m.a(sVar.W0(), sVar.P0()), interfaceC5011d);
    }

    /* JADX INFO: renamed from: makeAbsolute-12SF9DM */
    private static final J.b m505makeAbsolute12SF9DM(J.b bVar, long j10, InterfaceC5011d interfaceC5011d) {
        return J.c.a(bVar.a(j10, interfaceC5011d));
    }

    private static final BadgeStyle previewBadge(Badge.Style style, TwoDimensionalAlignment twoDimensionalAlignment, Shape shape, A a10, A a11) {
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        List listE = AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("Badge", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(8.0d, 8.0d, 8.0d, 8.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null));
        Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.CENTER);
        Size size = new Size(fit, fit);
        float fN = C5015h.n(0);
        C6385r0.a aVar = C6385r0.f58985b;
        return new BadgeStyle(new StackComponentStyle(listE, vertical, true, size, fN, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(45.0f, AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.f()), 0.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.l()), 80.0f)))), null, 2, null))), a10, a11, shape, null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null), style, twoDimensionalAlignment);
    }

    static /* synthetic */ BadgeStyle previewBadge$default(Badge.Style style, TwoDimensionalAlignment twoDimensionalAlignment, Shape shape, A a10, A a11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            a10 = p.a(C5015h.n(0));
        }
        if ((i10 & 16) != 0) {
            a11 = p.a(C5015h.n(0));
        }
        return previewBadge(style, twoDimensionalAlignment, shape, a10, a11);
    }

    private static final List<TextComponentStyle> previewChildren(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-407337990);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-407337990, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.previewChildren (StackComponentView.kt:1686)");
        }
        C6385r0.a aVar = C6385r0.f58985b;
        ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null);
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        List<TextComponentStyle> listP = AbstractC2279u.p(PreviewHelpersKt.previewTextComponentStyle("Hello", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(8.0d, 8.0d, 8.0d, 8.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("World", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(8.0d, 8.0d, 8.0d, 8.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return listP;
    }
}
