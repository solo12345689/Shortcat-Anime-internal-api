package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Gf.O;
import I0.A;
import I0.B;
import I0.C;
import I0.InterfaceC1687m;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import Td.v;
import U.K;
import Ud.AbstractC2279u;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.U1;
import Y.b2;
import Y.h2;
import Y.m2;
import Zd.j;
import ae.AbstractC2605b;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AbstractC2739w0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentStateKt;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import g0.i;
import i1.AbstractC5010c;
import i1.C5015h;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;
import p0.AbstractC5906a;
import s0.C6385r0;
import w.AbstractC6892c;
import x.AbstractC7015m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0017\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001c\u0010 \u001a\u000f\u0010!\u001a\u00020\u0007H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0007H\u0003¢\u0006\u0004\b#\u0010\"\u001a#\u0010(\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&H\u0003¢\u0006\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+\"\u0014\u0010-\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u0010.\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010+\"\u0014\u0010/\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010+\"\u0018\u00102\u001a\u00020\u0012*\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00069²\u0006\u000e\u00104\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\f\u00105\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u00107\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "LZd/e;", "LTd/L;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "ButtonComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V", "Li1/d;", "", "stackWidthPx", "stackHeightPx", "", "stackMarginStartPx", "stackMarginEndPx", "stackMarginTopPx", "stackMarginBottomPx", "progressSize", "(Li1/d;IIFFFF)I", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "backgroundStyles", "Ls0/r0;", "progressColorFor", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LY/m;I)J", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "colorStyle", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)J", "ButtonComponentView_Preview_Default", "(LY/m;I)V", "ButtonComponentView_Preview_Narrow", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "stackComponentStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;", "action", "previewButtonComponentStyle", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;", "COEFFICIENT_LUMINANCE_RED", "F", "COEFFICIENT_LUMINANCE_GREEN", "COEFFICIENT_LUMINANCE_BLUE", "BRIGHTNESS_CUTOFF", "ALPHA_DISABLED", "getBrightness-8_81llA", "(J)F", "brightness", "", "myActionInProgress", "contentAlpha", "progressAlpha", "animatedContentAlpha", "animatedProgressAlpha", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ButtonComponentViewKt {
    private static final float ALPHA_DISABLED = 0.6f;
    private static final float BRIGHTNESS_CUTOFF = 0.6f;
    private static final float COEFFICIENT_LUMINANCE_BLUE = 0.114f;
    private static final float COEFFICIENT_LUMINANCE_GREEN = 0.587f;
    private static final float COEFFICIENT_LUMINANCE_RED = 0.299f;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function2 $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ButtonComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ButtonComponentStyle buttonComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
            this.$style = buttonComponentStyle;
            this.$state = components;
            this.$onClick = function2;
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
            ButtonComponentViewKt.ButtonComponentView(this.$style, this.$state, this.$onClick, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function2 $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ButtonComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ButtonComponentStyle buttonComponentStyle, PaywallState.Loaded.Components components, e eVar, Function2 function2) {
            super(2);
            this.$style = buttonComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$onClick = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$2(C0 c02) {
            return ((Boolean) c02.getValue()).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(C0 c02, boolean z10) {
            c02.setValue(Boolean.valueOf(z10));
        }

        private static final float invoke$lambda$5(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        private static final float invoke$lambda$7(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        private static final float invoke$lambda$8(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        private static final float invoke$lambda$9(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Object buttonComponentViewKt$ButtonComponentView$2$2$1;
            Zd.e eVar;
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-17542715, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView.<anonymous> (ButtonComponentView.kt:85)");
            }
            ButtonComponentState buttonComponentStateRememberButtonComponentState = ButtonComponentStateKt.rememberButtonComponentState(this.$style, this.$state, interfaceC2425m, 0);
            Object objD = interfaceC2425m.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                Object l10 = new Y.L(AbstractC2393b0.i(j.f23275a, interfaceC2425m));
                interfaceC2425m.u(l10);
                objD = l10;
            }
            O oA = ((Y.L) objD).a();
            PaywallState.Loaded.Components components = this.$state;
            interfaceC2425m.V(-1790179292);
            Object objD2 = interfaceC2425m.D();
            if (objD2 == aVar.a()) {
                objD2 = b2.e(Boolean.FALSE, null, 2, null);
                interfaceC2425m.u(objD2);
            }
            C0 c02 = (C0) objD2;
            interfaceC2425m.O();
            interfaceC2425m.V(-1790177179);
            Object objD3 = interfaceC2425m.D();
            if (objD3 == aVar.a()) {
                objD3 = U1.d(new ButtonComponentViewKt$ButtonComponentView$2$contentAlpha$2$1(c02, components));
                interfaceC2425m.u(objD3);
            }
            h2 h2Var = (h2) objD3;
            interfaceC2425m.O();
            interfaceC2425m.V(-1790172092);
            Object objD4 = interfaceC2425m.D();
            if (objD4 == aVar.a()) {
                objD4 = U1.d(new ButtonComponentViewKt$ButtonComponentView$2$progressAlpha$2$1(c02));
                interfaceC2425m.u(objD4);
            }
            interfaceC2425m.O();
            h2 h2VarD = AbstractC6892c.d(invoke$lambda$5(h2Var), null, 0.0f, null, null, interfaceC2425m, 0, 30);
            h2 h2VarD2 = AbstractC6892c.d(invoke$lambda$7((h2) objD4), null, 0.0f, null, null, interfaceC2425m, 0, 30);
            EnumC5027t enumC5027t = (EnumC5027t) interfaceC2425m.n(AbstractC2739w0.k());
            Object margin = this.$style.getStackComponentStyle().getMargin();
            interfaceC2425m.V(-1790161765);
            boolean zU = interfaceC2425m.U(margin);
            ButtonComponentStyle buttonComponentStyle = this.$style;
            Object objD5 = interfaceC2425m.D();
            if (zU || objD5 == aVar.a()) {
                objD5 = C5015h.h(buttonComponentStyle.getStackComponentStyle().getMargin().d());
                interfaceC2425m.u(objD5);
            }
            final float fT = ((C5015h) objD5).t();
            interfaceC2425m.O();
            Object margin2 = this.$style.getStackComponentStyle().getMargin();
            interfaceC2425m.V(-1790156994);
            boolean zU2 = interfaceC2425m.U(margin2);
            ButtonComponentStyle buttonComponentStyle2 = this.$style;
            Object objD6 = interfaceC2425m.D();
            if (zU2 || objD6 == aVar.a()) {
                objD6 = C5015h.h(buttonComponentStyle2.getStackComponentStyle().getMargin().c());
                interfaceC2425m.u(objD6);
            }
            final float fT2 = ((C5015h) objD6).t();
            interfaceC2425m.O();
            Object margin3 = this.$style.getStackComponentStyle().getMargin();
            interfaceC2425m.V(-1790152131);
            boolean zU3 = interfaceC2425m.U(margin3) | interfaceC2425m.U(enumC5027t);
            ButtonComponentStyle buttonComponentStyle3 = this.$style;
            Object objD7 = interfaceC2425m.D();
            if (zU3 || objD7 == aVar.a()) {
                objD7 = C5015h.h(p.g(buttonComponentStyle3.getStackComponentStyle().getMargin(), enumC5027t));
                interfaceC2425m.u(objD7);
            }
            final float fT3 = ((C5015h) objD7).t();
            interfaceC2425m.O();
            Object margin4 = this.$style.getStackComponentStyle().getMargin();
            interfaceC2425m.V(-1790146373);
            boolean zU4 = interfaceC2425m.U(margin4) | interfaceC2425m.U(enumC5027t);
            ButtonComponentStyle buttonComponentStyle4 = this.$style;
            Object objD8 = interfaceC2425m.D();
            if (zU4 || objD8 == aVar.a()) {
                objD8 = C5015h.h(p.f(buttonComponentStyle4.getStackComponentStyle().getMargin(), enumC5027t));
                interfaceC2425m.u(objD8);
            }
            final float fT4 = ((C5015h) objD8).t();
            interfaceC2425m.O();
            ButtonComponentStyle buttonComponentStyle5 = this.$style;
            PaywallState.Loaded.Components components2 = this.$state;
            e eVar2 = this.$modifier;
            boolean z10 = !components.getActionInProgress();
            interfaceC2425m.V(-1790105339);
            boolean zU5 = interfaceC2425m.U(this.$state) | interfaceC2425m.F(oA) | interfaceC2425m.F(this.$onClick) | interfaceC2425m.U(buttonComponentStateRememberButtonComponentState);
            PaywallState.Loaded.Components components3 = this.$state;
            Function2 function2 = this.$onClick;
            Object objD9 = interfaceC2425m.D();
            if (zU5 || objD9 == aVar.a()) {
                eVar = null;
                buttonComponentViewKt$ButtonComponentView$2$2$1 = new ButtonComponentViewKt$ButtonComponentView$2$2$1(components3, oA, c02, function2, buttonComponentStateRememberButtonComponentState);
                interfaceC2425m.u(buttonComponentViewKt$ButtonComponentView$2$2$1);
            } else {
                buttonComponentViewKt$ButtonComponentView$2$2$1 = objD9;
                eVar = null;
            }
            interfaceC2425m.O();
            e eVarD = d.d(eVar2, z10, null, null, (InterfaceC5082a) buttonComponentViewKt$ButtonComponentView$2$2$1, 6, null);
            interfaceC2425m.V(-1790092426);
            boolean zB = interfaceC2425m.b(fT3) | interfaceC2425m.b(fT4) | interfaceC2425m.b(fT) | interfaceC2425m.b(fT2);
            Object objD10 = interfaceC2425m.D();
            if (zB || objD10 == aVar.a()) {
                objD10 = new B() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$2$3$1

                    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$2$3$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/s$a;", "LTd/L;", "invoke", "(Landroidx/compose/ui/layout/s$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
                        final /* synthetic */ float $marginStartPx;
                        final /* synthetic */ float $marginTopPx;
                        final /* synthetic */ s $progress;
                        final /* synthetic */ s $stack;
                        final /* synthetic */ float $stackHeightMinusMargin;
                        final /* synthetic */ float $stackWidthMinusMargin;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(s sVar, s sVar2, float f10, float f11, float f12, float f13) {
                            super(1);
                            this.$stack = sVar;
                            this.$progress = sVar2;
                            this.$marginStartPx = f10;
                            this.$stackWidthMinusMargin = f11;
                            this.$marginTopPx = f12;
                            this.$stackHeightMinusMargin = f13;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((s.a) obj);
                            return L.f17438a;
                        }

                        public final void invoke(s.a layout) {
                            AbstractC5504s.h(layout, "$this$layout");
                            s.a.W(layout, this.$stack, 0, 0, 0.0f, 4, null);
                            s.a.W(layout, this.$progress, ((int) this.$marginStartPx) + AbstractC5466a.d((this.$stackWidthMinusMargin / 2.0f) - (r2.W0() / 2.0f)), ((int) this.$marginTopPx) + AbstractC5466a.d((this.$stackHeightMinusMargin / 2.0f) - (this.$progress.P0() / 2.0f)), 0.0f, 4, null);
                        }
                    }

                    @Override // I0.B
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i11) {
                        return super.maxIntrinsicHeight(interfaceC1687m, list, i11);
                    }

                    @Override // I0.B
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i11) {
                        return super.maxIntrinsicWidth(interfaceC1687m, list, i11);
                    }

                    @Override // I0.B
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final C mo0measure3p2s80s(l Layout, List<? extends A> measurables, long j10) {
                        AbstractC5504s.h(Layout, "$this$Layout");
                        AbstractC5504s.h(measurables, "measurables");
                        s sVarV0 = measurables.get(0).v0(j10);
                        float fL1 = Layout.l1(fT3);
                        float fL12 = Layout.l1(fT4);
                        float fL13 = Layout.l1(fT);
                        float fL14 = Layout.l1(fT2);
                        int iProgressSize = ButtonComponentViewKt.progressSize(Layout, sVarV0.W0(), sVarV0.P0(), fL1, fL12, fL13, fL14);
                        s sVarV02 = measurables.get(1).v0(AbstractC5010c.a(iProgressSize, iProgressSize, iProgressSize, iProgressSize));
                        int iW0 = sVarV0.W0();
                        int iP0 = sVarV0.P0();
                        return l.u0(Layout, iW0, iP0, null, new AnonymousClass1(sVarV0, sVarV02, fL1, (iW0 - fL1) - fL12, fL13, (iP0 - fL13) - fL14), 4, null);
                    }

                    @Override // I0.B
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i11) {
                        return super.minIntrinsicHeight(interfaceC1687m, list, i11);
                    }

                    @Override // I0.B
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i11) {
                        return super.minIntrinsicWidth(interfaceC1687m, list, i11);
                    }
                };
                interfaceC2425m.u(objD10);
            }
            B b10 = (B) objD10;
            interfaceC2425m.O();
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
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
            m2.e(interfaceC2425mB, b10, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            StackComponentViewKt.StackComponentView(buttonComponentStyle5.getStackComponentStyle(), components2, new ButtonComponentViewKt$ButtonComponentView$2$1$1(eVar), null, invoke$lambda$8(h2VarD), interfaceC2425m, 384, 8);
            K.a(AbstractC5906a.a(e.f26613a, invoke$lambda$9(h2VarD2)), ButtonComponentViewKt.progressColorFor(buttonComponentStyle5.getStackComponentStyle().getBackground(), interfaceC2425m, 0), 0.0f, 0L, 0, interfaceC2425m, 0, 28);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function2 $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ButtonComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ButtonComponentStyle buttonComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
            this.$style = buttonComponentStyle;
            this.$state = components;
            this.$onClick = function2;
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
            ButtonComponentViewKt.ButtonComponentView(this.$style, this.$state, this.$onClick, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Default$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Default$1", f = "ButtonComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41721 extends kotlin.coroutines.jvm.internal.l implements Function2 {
        int label;

        C41721(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41721(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C41721) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Default$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41732 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41732(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ButtonComponentViewKt.ButtonComponentView_Preview_Default(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Narrow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Narrow$1", f = "ButtonComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41741 extends kotlin.coroutines.jvm.internal.l implements Function2 {
        int label;

        C41741(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41741(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C41741) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Narrow$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41752 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41752(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ButtonComponentViewKt.ButtonComponentView_Preview_Narrow(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void ButtonComponentView(ButtonComponentStyle style, PaywallState.Loaded.Components state, Function2 onClick, e eVar, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        e eVar2;
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(onClick, "onClick");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1096165859);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(style) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.U(state) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.F(onClick) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            eVar2 = eVar;
        } else {
            if (i13 != 0) {
                eVar = e.f26613a;
            }
            eVar2 = eVar;
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1096165859, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView (ButtonComponentView.kt:74)");
            }
            if (!StackComponentStateKt.rememberUpdatedStackComponentState(style.getStackComponentStyle(), state, interfaceC2425mG, i12 & 112).getVisible()) {
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
                B1 b1K = interfaceC2425mG.k();
                if (b1K != null) {
                    b1K.a(new AnonymousClass1(style, state, onClick, eVar2, i10, i11));
                    return;
                }
                return;
            }
            TransitionViewKt.TransitionView(style.getTransition(), i.d(-17542715, true, new AnonymousClass2(style, state, eVar2, onClick), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K2 = interfaceC2425mG.k();
        if (b1K2 != null) {
            b1K2.a(new AnonymousClass3(style, state, onClick, eVar2, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ButtonComponentView_Preview_Default(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-291258808);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-291258808, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView_Preview_Default (ButtonComponentView.kt:240)");
            }
            ButtonComponentView(previewButtonComponentStyle(null, null, interfaceC2425mG, 0, 3), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C41721(null), null, interfaceC2425mG, 384, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41732(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ButtonComponentView_Preview_Narrow(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1236087174);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1236087174, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView_Preview_Narrow (ButtonComponentView.kt:246)");
            }
            ButtonComponentView(previewButtonComponentStyle(PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("Restore purchases", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.l())), null, 2, null), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : null, (29694 & 4) != 0, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : null, (29694 & 16) != 0 ? C5015h.n(16) : 0.0f, (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : null, (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (29694 & 2048) != 0 ? null : null, (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? null : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), null, interfaceC2425mG, 0, 2), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C41741(null), null, interfaceC2425mG, 384, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41752(i10));
        }
    }

    /* JADX INFO: renamed from: getBrightness-8_81llA, reason: not valid java name */
    private static final float m399getBrightness8_81llA(long j10) {
        return (C6385r0.x(j10) * COEFFICIENT_LUMINANCE_RED) + (C6385r0.w(j10) * COEFFICIENT_LUMINANCE_GREEN) + (C6385r0.u(j10) * COEFFICIENT_LUMINANCE_BLUE);
    }

    private static final ButtonComponentStyle previewButtonComponentStyle(StackComponentStyle stackComponentStyle, ButtonComponentStyle.Action action, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        StackComponentStyle stackComponentStyle2;
        interfaceC2425m.V(-1733277159);
        if ((i11 & 1) != 0) {
            C6385r0.a aVar = C6385r0.f58985b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            float f10 = 16;
            stackComponentStyle2 = new StackComponentStyle(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("Restore purchases", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : colorStyles, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : new Padding(8.0d, 8.0d, 8.0d, 8.0d), (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : new Padding(0.0d, 24.0d, 0.0d, 24.0d), (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START), true, new Size(fit, fit), C5015h.n(f10), BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), null, 2, null))), p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.a())), null, 2, null), C5015h.n(10), C5015h.n(0), C5015h.n(3), null), null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null);
        } else {
            stackComponentStyle2 = stackComponentStyle;
        }
        ButtonComponentStyle.Action action2 = (i11 & 2) != 0 ? ButtonComponentStyle.Action.RestorePurchases.INSTANCE : action;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1733277159, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.previewButtonComponentStyle (ButtonComponentView.kt:299)");
        }
        ButtonComponentStyle buttonComponentStyle = new ButtonComponentStyle(stackComponentStyle2, action2, null, 4, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return buttonComponentStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long progressColorFor(BackgroundStyles backgroundStyles, InterfaceC2425m interfaceC2425m, int i10) {
        long jK;
        interfaceC2425m.V(-1216934903);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1216934903, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.progressColorFor (ButtonComponentView.kt:214)");
        }
        interfaceC2425m.V(-1003117124);
        if (backgroundStyles == null) {
            long jK2 = AbstractC7015m.a(interfaceC2425m, 0) ? C6385r0.f58985b.k() : C6385r0.f58985b.a();
            interfaceC2425m.O();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return jK2;
        }
        interfaceC2425m.O();
        if (backgroundStyles instanceof BackgroundStyles.Color) {
            jK = progressColorFor(ColorStyleKt.getForCurrentTheme(((BackgroundStyles.Color) backgroundStyles).m453unboximpl(), interfaceC2425m, 0));
        } else {
            if (!(backgroundStyles instanceof BackgroundStyles.Image) && !(backgroundStyles instanceof BackgroundStyles.Video)) {
                throw new r();
            }
            jK = C6385r0.f58985b.k();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return jK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int progressSize(InterfaceC5011d interfaceC5011d, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fN;
        float fE1 = interfaceC5011d.e1(Math.min((i10 - f10) - f11, (i11 - f12) - f13));
        if (C5015h.m(fE1, C5015h.n(32)) >= 0) {
            fN = C5015h.n(16);
        } else if (C5015h.m(fE1, C5015h.n(24)) >= 0) {
            fN = C5015h.n(fE1 - C5015h.n(16));
        } else if (C5015h.m(fE1, C5015h.n(16)) >= 0) {
            fN = C5015h.n(8);
        } else {
            float f14 = 8;
            fN = C5015h.m(fE1, C5015h.n(f14)) >= 0 ? C5015h.n(fE1 - C5015h.n(f14)) : C5015h.n(0);
        }
        return interfaceC5011d.s0(C5015h.n(AbstractC5874j.l(C5015h.n(fE1 - fN), C5015h.n(0), C5015h.n(38))));
    }

    private static final long progressColorFor(ColorStyle colorStyle) {
        if (colorStyle instanceof ColorStyle.Solid) {
            return m399getBrightness8_81llA(((ColorStyle.Solid) colorStyle).m476unboximpl()) > 0.6f ? C6385r0.f58985b.a() : C6385r0.f58985b.k();
        }
        if (!(colorStyle instanceof ColorStyle.Gradient)) {
            throw new r();
        }
        List colors$revenuecatui_defaultsBc8Release = ((ColorStyle.Gradient) colorStyle).m468unboximpl().getColors$revenuecatui_defaultsBc8Release();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(colors$revenuecatui_defaultsBc8Release, 10));
        Iterator it = colors$revenuecatui_defaultsBc8Release.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(m399getBrightness8_81llA(((C6385r0) it.next()).A())));
        }
        return AbstractC2279u.d0(arrayList) > 0.6000000238418579d ? C6385r0.f58985b.a() : C6385r0.f58985b.k();
    }
}
