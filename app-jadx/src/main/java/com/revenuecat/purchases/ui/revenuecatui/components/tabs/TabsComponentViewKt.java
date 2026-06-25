package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import C.A;
import Td.L;
import Td.v;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import ae.AbstractC2605b;
import androidx.compose.animation.a;
import androidx.compose.animation.d;
import androidx.compose.animation.f;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import i1.C5015h;
import ie.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5870f;
import s0.C6385r0;
import v.InterfaceC6781b;
import v.j;
import w.AbstractC6906j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0094\u0001\u0010+\u001a\u00020(2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010,\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "LZd/e;", "LTd/L;", "", "clickHandler", "Landroidx/compose/ui/e;", "modifier", "TabsComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V", "TabsComponentView_Preview", "(LY/m;I)V", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "children", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Li1/h;", "spacing", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "LC/A;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "", "tabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "previewStackComponentStyle-gNPyAyM", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LC/A;LC/A;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Ljava/lang/Integer;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "previewStackComponentStyle", "DURATION_MS_CROSS_FADE", "I", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class TabsComponentViewKt {
    private static final int DURATION_MS_CROSS_FADE = 220;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt$TabsComponentView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabsComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TabsComponentStyle tabsComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
            this.$style = tabsComponentStyle;
            this.$state = components;
            this.$clickHandler = function2;
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
            TabsComponentViewKt.TabsComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt$TabsComponentView$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "", "Lv/j;", "invoke", "(Landroidx/compose/animation/d;)Lv/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass5 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j invoke(d AnimatedContent) {
            AbstractC5504s.h(AnimatedContent, "$this$AnimatedContent");
            return a.e(f.m(AbstractC6906j.j(TabsComponentViewKt.DURATION_MS_CROSS_FADE, 0, null, 4, null), 0.0f, 2, null), f.o(AbstractC6906j.j(TabsComponentViewKt.DURATION_MS_CROSS_FADE, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt$TabsComponentView$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/b;", "", "selectedTabIndex", "LTd/L;", "invoke", "(Lv/b;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass6 extends AbstractC5506u implements p {
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabsComponentState $tabsState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(TabsComponentState tabsComponentState, PaywallState.Loaded.Components components, Function2 function2) {
            super(4);
            this.$tabsState = tabsComponentState;
            this.$state = components;
            this.$clickHandler = function2;
        }

        @Override // ie.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((InterfaceC6781b) obj, ((Number) obj2).intValue(), (InterfaceC2425m) obj3, ((Number) obj4).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC6781b AnimatedContent, int i10, InterfaceC2425m interfaceC2425m, int i11) {
            AbstractC5504s.h(AnimatedContent, "$this$AnimatedContent");
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1188428519, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentView.<anonymous> (TabsComponentView.kt:100)");
            }
            StackComponentViewKt.StackComponentView(((TabsComponentStyle.Tab) this.$tabsState.getTabs().get(AbstractC5874j.n(i10, new C5870f(0, AbstractC2279u.o(this.$tabsState.getTabs()))))).getStack(), this.$state, this.$clickHandler, null, 0.0f, interfaceC2425m, 0, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt$TabsComponentView$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass7 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabsComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(TabsComponentStyle tabsComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
            this.$style = tabsComponentStyle;
            this.$state = components;
            this.$clickHandler = function2;
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
            TabsComponentViewKt.TabsComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt$TabsComponentView_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt$TabsComponentView_Preview$1", f = "TabsComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C42741 extends l implements Function2 {
        int label;

        C42741(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C42741(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C42741) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt$TabsComponentView_Preview$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TabsComponentViewKt.TabsComponentView_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TabsComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle r15, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r16, kotlin.jvm.functions.Function2 r17, androidx.compose.ui.e r18, Y.InterfaceC2425m r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt.TabsComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, kotlin.jvm.functions.Function2, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabsComponentView_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1844948686);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1844948686, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentView_Preview (TabsComponentView.kt:113)");
            }
            PresentedOverride presentedOverride = new PresentedOverride(AbstractC2279u.e(ComponentOverride.Condition.Selected.INSTANCE), (PresentedPartial) ResultKt.getOrThrow(LocalizedTextPartial.INSTANCE.invoke(new PartialTextComponent((Boolean) null, (String) null, (ColorScheme) null, (ColorScheme) null, (String) null, FontWeight.EXTRA_BOLD, (Integer) null, (Integer) null, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, 4063, (DefaultConstructorMarker) null), NonEmptyMapKt.nonEmptyMapOf(z.a(LocaleId.m307boximpl(LocaleId.m308constructorimpl("en_US")), NonEmptyMapKt.nonEmptyMapOf(z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("dummy")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("dummy"))), new Pair[0])), new Pair[0]), S.i(), S.i())));
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            float f10 = 8;
            StackComponentStyle stackComponentStyleM539previewStackComponentStylegNPyAyM$default = m539previewStackComponentStylegNPyAyM$default(AbstractC2279u.p(new TabControlButtonComponentStyle(0, m539previewStackComponentStylegNPyAyM$default(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("Tab 1", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : 0, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : AbstractC2279u.e(presentedOverride))), null, false, new Size(fit, fit), 0.0f, null, null, null, null, null, null, null, 4086, null)), new TabControlButtonComponentStyle(1, m539previewStackComponentStylegNPyAyM$default(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("Tab 2", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : 1, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : AbstractC2279u.e(presentedOverride))), null, false, new Size(fit, fit), 0.0f, null, null, null, null, null, null, null, 4086, null)), new TabControlButtonComponentStyle(2, m539previewStackComponentStylegNPyAyM$default(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("Tab 3", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : new Size(fit, fit), (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : 2, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : AbstractC2279u.e(presentedOverride))), null, false, new Size(fit, fit), 0.0f, null, null, null, null, null, null, null, 4086, null))), new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.CENTER), false, new Size(fit, fit), C5015h.n(f10), null, null, null, null, null, null, null, 4068, null);
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            Size size = new Size(fill, fill);
            float f11 = 16;
            A a10 = androidx.compose.foundation.layout.p.a(C5015h.n(f11));
            A a11 = androidx.compose.foundation.layout.p.a(C5015h.n(f11));
            C6385r0.a aVar = C6385r0.f58985b;
            TabsComponentView(new TabsComponentStyle(true, size, a10, a11, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.g())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.d()))))), new Shape.Rectangle(new CornerRadiuses.Dp(16.0d)), new BorderStyles(C5015h.n(f10), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b()))), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h()))), C5015h.n(6), C5015h.n(0), C5015h.n(10), null), new TabControlStyle.Buttons(m539previewStackComponentStylegNPyAyM$default(AbstractC2279u.m(), null, false, null, 0.0f, null, null, null, null, null, null, null, 4094, null)), NonEmptyListKt.nonEmptyListOf(new TabsComponentStyle.Tab(m539previewStackComponentStylegNPyAyM$default(AbstractC2279u.p(stackComponentStyleM539previewStackComponentStylegNPyAyM$default, PreviewHelpersKt.previewTextComponentStyle("Tab 1 content", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), null, false, null, 0.0f, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b()))))), null, null, null, null, null, null, 4062, null)), new TabsComponentStyle.Tab(m539previewStackComponentStylegNPyAyM$default(AbstractC2279u.p(stackComponentStyleM539previewStackComponentStylegNPyAyM$default, PreviewHelpersKt.previewTextComponentStyle("Tab 2 content", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), null, false, null, 0.0f, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.f()))))), null, null, null, null, null, null, 4062, null)), new TabsComponentStyle.Tab(m539previewStackComponentStylegNPyAyM$default(AbstractC2279u.p(stackComponentStyleM539previewStackComponentStylegNPyAyM$default, PreviewHelpersKt.previewTextComponentStyle("Tab 3 content", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), null, false, null, 0.0f, BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h()))))), null, null, null, null, null, null, 4062, null))), AbstractC2279u.m()), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C42741(null), null, interfaceC2425mG, 384, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }

    /* JADX INFO: renamed from: previewStackComponentStyle-gNPyAyM, reason: not valid java name */
    private static final StackComponentStyle m538previewStackComponentStylegNPyAyM(List<? extends ComponentStyle> list, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, Integer num) {
        return new StackComponentStyle(list, dimension, z10, size, f10, backgroundStyles, a10, a11, shape, borderStyles, shadowStyles, null, null, null, null, num, null, null, CountdownComponent.CountFrom.DAYS, AbstractC2279u.m(), false, false, false, 7421952, null);
    }

    /* JADX INFO: renamed from: previewStackComponentStyle-gNPyAyM$default, reason: not valid java name */
    static /* synthetic */ StackComponentStyle m539previewStackComponentStylegNPyAyM$default(List list, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, A a10, A a11, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, Integer num, int i10, Object obj) {
        Size size2;
        if ((i10 & 2) != 0) {
            dimension = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.CENTER);
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            size2 = new Size(fill, fill);
        } else {
            size2 = size;
        }
        return m538previewStackComponentStylegNPyAyM(list, dimension, z10, size2, (i10 & 16) != 0 ? C5015h.n(0) : f10, (i10 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.i())), null, 2, null))) : backgroundStyles, (i10 & 64) != 0 ? androidx.compose.foundation.layout.p.a(C5015h.n(0)) : a10, (i10 & 128) != 0 ? androidx.compose.foundation.layout.p.a(C5015h.n(0)) : a11, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(0.0d)) : shape, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : borderStyles, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : shadowStyles, (i10 & 2048) != 0 ? null : num);
    }
}
