package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Td.D;
import Td.L;
import U.E;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u000f\u0010\u0019\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0019\u0010\u0015\u001a\u000f\u0010\u001a\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001a\u0010\u0015\u001a\u000f\u0010\u001b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001b\u0010\u0015\u001a\u000f\u0010\u001c\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001c\u0010\u0015\u001a\u000f\u0010\u001d\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001d\u0010\u0015\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u0015\u001a\u000f\u0010\u001f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001f\u0010\u0015¨\u0006!²\u0006\f\u0010 \u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Landroidx/compose/ui/e;", "modifier", "LTd/L;", "TextComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;", "textState", "", "rememberProcessedText", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;LY/m;I)Ljava/lang/String;", "", "pricePerMonthMicros", "mostExpensiveMicros", "", "discountPercentage", "(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Double;", "TextComponentView_Preview_Default", "(LY/m;I)V", "TextComponentView_Preview_HeadingXlExtraBold", "TextComponentView_Preview_SerifFont", "TextComponentView_Preview_SansSerifFont", "TextComponentView_Preview_MonospaceFont", "TextComponentView_Preview_FontSize", "TextComponentView_Preview_HorizontalAlignment", "TextComponentView_Preview_Customizations", "TextComponentView_Preview_Markdown", "TextComponentView_Preview_LinearGradient", "TextComponentView_Preview_RadialGradient", "processedText", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class TextComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "it", "invoke", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(e applyIfNotNull, ColorStyle it) {
            AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
            AbstractC5504s.h(it, "it");
            return BackgroundKt.background$default(applyIfNotNull, it, (E1) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TextComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TextComponentStyle textComponentStyle, PaywallState.Loaded.Components components, e eVar, int i10, int i11) {
            super(2);
            this.$style = textComponentStyle;
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
            TextComponentViewKt.TextComponentView(this.$style, this.$state, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_Customizations$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42751 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42751(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_Customizations(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_Default$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42761 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42761(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_Default(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_FontSize$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42771 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42771(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_FontSize(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_HeadingXlExtraBold$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42781 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42781(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_HeadingXlExtraBold(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_HorizontalAlignment$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42791 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42791(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_HorizontalAlignment(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_LinearGradient$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42801 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42801(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_LinearGradient(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_Markdown$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42811 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42811(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_Markdown(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_MonospaceFont$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42821 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42821(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_MonospaceFont(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_RadialGradient$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42831 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42831(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_RadialGradient(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_SansSerifFont$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42841 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42841(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_SansSerifFont(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_SerifFont$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42851 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42851(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TextComponentViewKt.TextComponentView_Preview_SerifFont(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle r48, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r49, androidx.compose.ui.e r50, Y.InterfaceC2425m r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt.TextComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final void TextComponentView_Preview_Customizations(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1310256028);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1310256028, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Customizations (TextComponentView.kt:266)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.f(255, 0, 0, 0, 8, null))), null, 2, null);
            FontWeight fontWeight = FontWeight.BLACK;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Hello, world", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : colorStyles, (62224 & 4) != 0 ? 15 : 13, (62224 & 8) != 0 ? FontWeight.REGULAR : fontWeight, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.f(222, 222, 222, 0, 8, null))), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(10.0d, 10.0d, 20.0d, 20.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : new Padding(20.0d, 20.0d, 10.0d, 10.0d), (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42751(i10));
        }
    }

    public static final void TextComponentView_Preview_Default(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1838187961);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1838187961, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Default (TextComponentView.kt:162)");
            }
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Hello, world", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null), (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42761(i10));
        }
    }

    public static final void TextComponentView_Preview_FontSize(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(793345132);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(793345132, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_FontSize (TextComponentView.kt:236)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Hello, world", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : colorStyles, (62224 & 4) != 0 ? 15 : 28, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42771(i10));
        }
    }

    public static final void TextComponentView_Preview_HeadingXlExtraBold(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1682911299);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1682911299, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_HeadingXlExtraBold (TextComponentView.kt:174)");
            }
            E.a(null, null, null, ComposableSingletons$TextComponentViewKt.INSTANCE.m541getLambda2$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 3072, 7);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42781(i10));
        }
    }

    public static final void TextComponentView_Preview_HorizontalAlignment(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-43764709);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-43764709, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_HorizontalAlignment (TextComponentView.kt:250)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Hello, world", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : colorStyles, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : HorizontalAlignment.TRAILING, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), s.x(e.f26613a, C5015h.n(400), 0.0f, 2, null), interfaceC2425mG, 384, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42791(i10));
        }
    }

    public static final void TextComponentView_Preview_LinearGradient(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(702292295);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(702292295, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_LinearGradient (TextComponentView.kt:298)");
            }
            C6385r0.a aVar = C6385r0.f58985b;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(135.0f, AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.c()), 10.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(0, 102, 255, 0, 8, null)), 30.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(160, 0, 160, 0, 8, null)), 80.0f)))), null, 2, null), (62224 & 4) != 0 ? 15 : 15, (62224 & 8) != 0 ? FontWeight.REGULAR : FontWeight.MEDIUM, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : HorizontalAlignment.LEADING, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.a())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(new SizeConstraint.Fixed(D.b(200), null), SizeConstraint.Fit.INSTANCE), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(10.0d, 10.0d, 20.0d, 20.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : new Padding(20.0d, 20.0d, 10.0d, 10.0d), (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42801(i10));
        }
    }

    public static final void TextComponentView_Preview_Markdown(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1145662669);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1145662669, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Markdown (TextComponentView.kt:285)");
            }
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Hello, **bold**, *italic* or _italic2_ with ~strikethrough~, ~~strikethrough2~~ and `monospace`. Click [here](https://revenuecat.com)", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null), (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42811(i10));
        }
    }

    public static final void TextComponentView_Preview_MonospaceFont(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-744412312);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-744412312, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_MonospaceFont (TextComponentView.kt:222)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null);
            FontSpec.Generic.Monospace monospace = FontSpec.Generic.Monospace.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Hello, world", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : colorStyles, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : monospace, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42821(i10));
        }
    }

    public static final void TextComponentView_Preview_RadialGradient(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(261376653);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(261376653, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_RadialGradient (TextComponentView.kt:336)");
            }
            C6385r0.a aVar = C6385r0.f58985b;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.c()), 10.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(0, 102, 255, 0, 8, null)), 80.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(160, 0, 160, 0, 8, null)), 100.0f)))), null, 2, null), (62224 & 4) != 0 ? 15 : 15, (62224 & 8) != 0 ? FontWeight.REGULAR : FontWeight.MEDIUM, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : HorizontalAlignment.LEADING, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.a())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(new SizeConstraint.Fixed(D.b(200), null), SizeConstraint.Fit.INSTANCE), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(10.0d, 10.0d, 20.0d, 20.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : new Padding(20.0d, 20.0d, 10.0d, 10.0d), (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42831(i10));
        }
    }

    public static final void TextComponentView_Preview_SansSerifFont(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(570489761);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(570489761, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_SansSerifFont (TextComponentView.kt:208)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null);
            FontSpec.Generic.SansSerif sansSerif = FontSpec.Generic.SansSerif.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Hello, world", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : colorStyles, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : sansSerif, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42841(i10));
        }
    }

    public static final void TextComponentView_Preview_SerifFont(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2065783982);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2065783982, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_SerifFont (TextComponentView.kt:194)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null);
            FontSpec.Generic.Serif serif = FontSpec.Generic.Serif.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle("Hello, world", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : colorStyles, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : serif, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42851(i10));
        }
    }

    public static final Double discountPercentage(Long l10, Long l11) {
        if (l10 == null || l11 == null || l11.longValue() <= l10.longValue()) {
            return null;
        }
        return Double.valueOf((l11.longValue() - l10.longValue()) / l11.longValue());
    }

    private static final String rememberProcessedText(PaywallState.Loaded.Components components, TextComponentState textComponentState, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-2070949083);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2070949083, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.rememberProcessedText (TextComponentView.kt:109)");
        }
        interfaceC2425m.V(1040262346);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(components)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(textComponentState)) || (i10 & 48) == 32);
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = U1.d(new TextComponentViewKt$rememberProcessedText$processedText$2$1(components, textComponentState));
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        String strRememberProcessedText$lambda$1 = rememberProcessedText$lambda$1((h2) objD);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return strRememberProcessedText$lambda$1;
    }

    private static final String rememberProcessedText$lambda$1(h2 h2Var) {
        return (String) h2Var.getValue();
    }
}
