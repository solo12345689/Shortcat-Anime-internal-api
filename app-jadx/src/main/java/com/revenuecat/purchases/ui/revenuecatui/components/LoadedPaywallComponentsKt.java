package com.revenuecat.purchases.ui.revenuecatui.components;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.InterfaceC1138i;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Td.v;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import ae.AbstractC2605b;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TextComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.ExitOffers;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState;
import com.revenuecat.purchases.ui.revenuecatui.data.MockPurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import g0.i;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.net.URL;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001aE\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aD\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0015\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u000f\u0010\u001b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u0018\u001a\u000f\u0010\u001c\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010 \u001a\u00020\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;", "LZd/e;", "LTd/L;", "", "clickHandler", "Landroidx/compose/ui/e;", "modifier", "LoadedPaywallComponents", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "action", "externalClickHandler", "handleClick", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Sheet;", "sheet", "onClick", "show", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Sheet;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;)V", "LoadedPaywallComponents_Preview", "(LY/m;I)V", "LoadedPaywallComponents_BottomSheet_NullSize_Preview", "LoadedPaywallComponents_BottomSheet_FitSize_Preview", "LoadedPaywallComponents_Preview_Bless", "previewHelloWorldPaywallState", "(LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "previewBottomSheet", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Sheet;", "", "MILLIS_2025_01_25", "J", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class LoadedPaywallComponentsKt {
    private static final long MILLIS_2025_01_25 = 1737763200000L;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ BackgroundStyle $background;
        final /* synthetic */ ComponentStyle $footerComponentStyle;
        final /* synthetic */ Function2 $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ComponentStyle $style;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06791 extends AbstractC5506u implements Function2 {
            final /* synthetic */ ComponentStyle $footerComponentStyle;
            final /* synthetic */ Function2 $onClick;
            final /* synthetic */ PaywallState.Loaded.Components $state;
            final /* synthetic */ ComponentStyle $style;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06791(ComponentStyle componentStyle, PaywallState.Loaded.Components components, Function2 function2, ComponentStyle componentStyle2) {
                super(2);
                this.$style = componentStyle;
                this.$state = components;
                this.$onClick = function2;
                this.$footerComponentStyle = componentStyle2;
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
                    AbstractC2454w.U(1882576877, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents.<anonymous>.<anonymous> (LoadedPaywallComponents.kt:83)");
                }
                ComponentStyle componentStyle = this.$style;
                PaywallState.Loaded.Components components = this.$state;
                Function2 function2 = this.$onClick;
                ComponentStyle componentStyle2 = this.$footerComponentStyle;
                e.a aVar = e.f26613a;
                B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425m, 0);
                int iA = AbstractC2410h.a(interfaceC2425m, 0);
                I iR = interfaceC2425m.r();
                e eVarF = c.f(interfaceC2425m, aVar);
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
                m2.e(interfaceC2425mB, bA, aVar2.e());
                m2.e(interfaceC2425mB, iR, aVar2.g());
                Function2 function2B = aVar2.b();
                if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                    interfaceC2425mB.u(Integer.valueOf(iA));
                    interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                }
                m2.e(interfaceC2425mB, eVarF, aVar2.f());
                ComponentViewKt.ComponentView(componentStyle, components, function2, m.f(InterfaceC1138i.c(C1139j.f2142a, s.h(aVar, 0.0f, 1, null), 1.0f, false, 2, null), m.c(0, interfaceC2425m, 0, 1), false, null, false, 14, null), interfaceC2425m, 0, 0);
                interfaceC2425m.V(1628615184);
                if (componentStyle2 != null) {
                    ComponentViewKt.ComponentView(componentStyle2, components, function2, s.h(aVar, 0.0f, 1, null), interfaceC2425m, 3072, 0);
                }
                interfaceC2425m.O();
                interfaceC2425m.x();
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Components components, BackgroundStyle backgroundStyle, ComponentStyle componentStyle, Function2 function2, ComponentStyle componentStyle2) {
            super(2);
            this.$state = components;
            this.$background = backgroundStyle;
            this.$style = componentStyle;
            this.$onClick = function2;
            this.$footerComponentStyle = componentStyle2;
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
                AbstractC2454w.U(-1179256774, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents.<anonymous> (LoadedPaywallComponents.kt:82)");
            }
            PaywallState.Loaded.Components components = this.$state;
            WithOptionalBackgroundOverlayKt.WithOptionalBackgroundOverlay(components, this.$background, null, null, i.d(1882576877, true, new C06791(this.$style, components, this.$onClick, this.$footerComponentStyle), interfaceC2425m, 54), interfaceC2425m, 24576, 12);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
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
            LoadedPaywallComponentsKt.LoadedPaywallComponents(this.$state, this.$clickHandler, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_FitSize_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_FitSize_Preview$1", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41561 extends l implements Function2 {
        int label;

        C41561(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41561(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C41561) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_FitSize_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_FitSize_Preview$2", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41572 extends l implements Function2 {
        int label;

        C41572(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41572(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction.External external, Zd.e eVar) {
            return ((C41572) create(external, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_FitSize_Preview$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            LoadedPaywallComponentsKt.LoadedPaywallComponents_BottomSheet_FitSize_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_NullSize_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_NullSize_Preview$1", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41581 extends l implements Function2 {
        int label;

        C41581(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41581(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C41581) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_NullSize_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_NullSize_Preview$2", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41592 extends l implements Function2 {
        int label;

        C41592(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41592(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction.External external, Zd.e eVar) {
            return ((C41592) create(external, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_NullSize_Preview$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41603 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41603(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            LoadedPaywallComponentsKt.LoadedPaywallComponents_BottomSheet_NullSize_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview$1", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41611 extends l implements Function2 {
        int label;

        C41611(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41611(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction.External external, Zd.e eVar) {
            return ((C41611) create(external, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41622 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41622(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            LoadedPaywallComponentsKt.LoadedPaywallComponents_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview_Bless$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview_Bless$1", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41631 extends l implements Function2 {
        int label;

        C41631(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41631(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction.External external, Zd.e eVar) {
            return ((C41631) create(external, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview_Bless$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41642 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41642(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            LoadedPaywallComponentsKt.LoadedPaywallComponents_Preview_Bless(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$handleClick$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$handleClick$2", f = "LoadedPaywallComponents.kt", l = {119}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41652 extends l implements Function2 {
        final /* synthetic */ Function2 $externalClickHandler;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41652(PaywallState.Loaded.Components components, Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.$state = components;
            this.$externalClickHandler = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            C41652 c41652 = new C41652(this.$state, this.$externalClickHandler, eVar);
            c41652.L$0 = obj;
            return c41652;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C41652) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                PaywallAction paywallAction = (PaywallAction) this.L$0;
                PaywallState.Loaded.Components components = this.$state;
                Function2 function2 = this.$externalClickHandler;
                this.label = 1;
                if (LoadedPaywallComponentsKt.handleClick(paywallAction, components, function2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$previewHelloWorldPaywallState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41661 extends AbstractC5506u implements InterfaceC5082a {
        public static final C41661 INSTANCE = new C41661();

        C41661() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Date invoke() {
            return new Date(LoadedPaywallComponentsKt.MILLIS_2025_01_25);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41671 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function2 $onClick;
        final /* synthetic */ ButtonComponentStyle.Action.NavigateTo.Destination.Sheet $sheet;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ SimpleSheetState $this_show;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$show$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "it", "invoke", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final e invoke(e applyIfNotNull, Size it) {
                AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
                AbstractC5504s.h(it, "it");
                return SizeKt.size$default(applyIfNotNull, it, null, null, 6, null);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$show$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final e invoke(e conditional) {
                AbstractC5504s.h(conditional, "$this$conditional");
                return s.h(conditional, 0.0f, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41671(ButtonComponentStyle.Action.NavigateTo.Destination.Sheet sheet, PaywallState.Loaded.Components components, SimpleSheetState simpleSheetState, Function2 function2) {
            super(2);
            this.$sheet = sheet;
            this.$state = components;
            this.$this_show = simpleSheetState;
            this.$onClick = function2;
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
                AbstractC2454w.U(1290168816, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.show.<anonymous> (LoadedPaywallComponents.kt:140)");
            }
            ComponentStyle stack = this.$sheet.getStack();
            PaywallState.Loaded.Components components = this.$state;
            interfaceC2425m.V(1730748123);
            boolean zU = interfaceC2425m.U(this.$this_show) | interfaceC2425m.F(this.$onClick);
            SimpleSheetState simpleSheetState = this.$this_show;
            Function2 function2 = this.$onClick;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new LoadedPaywallComponentsKt$show$1$1$1(simpleSheetState, function2, null);
                interfaceC2425m.u(objD);
            }
            Function2 function22 = (Function2) objD;
            interfaceC2425m.O();
            ComponentViewKt.ComponentView(stack, components, function22, ModifierExtensionsKt.conditional(ModifierExtensionsKt.applyIfNotNull(e.f26613a, this.$sheet.getSize(), AnonymousClass2.INSTANCE), this.$sheet.getSize() == null, AnonymousClass3.INSTANCE), interfaceC2425m, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$show$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41682 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41682(PaywallState.Loaded.Components components) {
            super(0);
            this.$state = components;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m392invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m392invoke() {
            this.$state.resetToDefaultPackage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LoadedPaywallComponents(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r16, kotlin.jvm.functions.Function2 r17, androidx.compose.ui.e r18, Y.InterfaceC2425m r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt.LoadedPaywallComponents(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, kotlin.jvm.functions.Function2, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedPaywallComponents_BottomSheet_FitSize_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(561912880);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(561912880, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_BottomSheet_FitSize_Preview (LoadedPaywallComponents.kt:195)");
            }
            PaywallState.Loaded.Components componentsPreviewHelloWorldPaywallState = previewHelloWorldPaywallState(interfaceC2425mG, 0);
            SimpleSheetState sheet = componentsPreviewHelloWorldPaywallState.getSheet();
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            show(sheet, previewBottomSheet(new Size(fit, fit)), componentsPreviewHelloWorldPaywallState, new C41561(null));
            LoadedPaywallComponents(componentsPreviewHelloWorldPaywallState, new C41572(null), s.f(e.f26613a, 0.0f, 1, null), interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedPaywallComponents_BottomSheet_NullSize_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-398756048);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-398756048, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_BottomSheet_NullSize_Preview (LoadedPaywallComponents.kt:176)");
            }
            PaywallState.Loaded.Components componentsPreviewHelloWorldPaywallState = previewHelloWorldPaywallState(interfaceC2425mG, 0);
            show(componentsPreviewHelloWorldPaywallState.getSheet(), previewBottomSheet(null), componentsPreviewHelloWorldPaywallState, new C41581(null));
            LoadedPaywallComponents(componentsPreviewHelloWorldPaywallState, new C41592(null), s.f(e.f26613a, 0.0f, 1, null), interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41603(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedPaywallComponents_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1173704376);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1173704376, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_Preview (LoadedPaywallComponents.kt:164)");
            }
            LoadedPaywallComponents(previewHelloWorldPaywallState(interfaceC2425mG, 0), new C41611(null), s.f(e.f26613a, 0.0f, 1, null), interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41622(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedPaywallComponents_Preview_Bless(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-485118556);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-485118556, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_Preview_Bless (LoadedPaywallComponents.kt:215)");
            }
            C6385r0.a aVar = C6385r0.f58985b;
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.a())), new ColorInfo.Hex(AbstractC6387s0.k(aVar.k())));
            ColorScheme colorScheme2 = new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.k())), new ColorInfo.Hex(AbstractC6387s0.k(aVar.a())));
            URL url = new URL("https://assets.pawwalls.com");
            List listE = AbstractC2279u.e(TestData.Components.INSTANCE.getMonthlyPackageComponent());
            TwoDimensionalAlignment twoDimensionalAlignment = TwoDimensionalAlignment.CENTER;
            Dimension.ZLayer zLayer = new Dimension.ZLayer(twoDimensionalAlignment);
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            StackComponent stackComponent = new StackComponent(listE, (Boolean) null, zLayer, new Size(fill, fill), (Float) null, new ColorScheme(new ColorInfo.Gradient.Linear(60.0f, AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.c(255, 255, 255, 255)), 40.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(5, 124, 91, 0, 8, null)), 100.0f))), (ColorInfo) null, 2, (DefaultConstructorMarker) null), (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32722, (DefaultConstructorMarker) null);
            String strM344constructorimpl = LocalizationKey.m344constructorimpl(b.f34626S);
            FontWeight fontWeight = FontWeight.SEMI_BOLD;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            ColorScheme colorScheme3 = null;
            String str = null;
            Integer num = null;
            Padding padding = null;
            List list = null;
            TextComponent textComponent = new TextComponent(strM344constructorimpl, colorScheme, (Boolean) null, colorScheme3, str, fontWeight, num, 28, horizontalAlignment, new Size(fill, fit), padding, new Padding(0.0d, 40.0d, 0.0d, 0.0d), list, 5212, (DefaultConstructorMarker) null);
            int i11 = 5372;
            FontWeight fontWeight2 = null;
            int i12 = 0;
            PaywallComponent[] paywallComponentArr = {textComponent, new TextComponent(LocalizationKey.m344constructorimpl("feature-1"), colorScheme, (Boolean) null, colorScheme3, str, fontWeight2, num, i12, horizontalAlignment, new Size(fill, fit), padding, new Padding(8.0d, 8.0d, 0.0d, 0.0d), list, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new TextComponent(LocalizationKey.m344constructorimpl("feature-2"), colorScheme, (Boolean) null, colorScheme3, str, fontWeight2, num, i12, horizontalAlignment, new Size(fill, fit), padding, new Padding(8.0d, 8.0d, 0.0d, 0.0d), list, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new TextComponent(LocalizationKey.m344constructorimpl("feature-3"), colorScheme, (Boolean) null, colorScheme3, str, fontWeight2, num, i12, horizontalAlignment, new Size(fill, fit), padding, new Padding(8.0d, 8.0d, 0.0d, 0.0d), list, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new TextComponent(LocalizationKey.m344constructorimpl("feature-4"), colorScheme, (Boolean) null, colorScheme3, str, fontWeight2, num, i12, horizontalAlignment, new Size(fill, fit), padding, new Padding(8.0d, 8.0d, 0.0d, 0.0d), list, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new TextComponent(LocalizationKey.m344constructorimpl("feature-5"), colorScheme, (Boolean) null, colorScheme3, str, fontWeight2, num, i12, horizontalAlignment, new Size(fill, fit), padding, new Padding(8.0d, 8.0d, 0.0d, 0.0d), list, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new TextComponent(LocalizationKey.m344constructorimpl("feature-6"), colorScheme, (Boolean) null, colorScheme3, str, fontWeight2, num, i12, horizontalAlignment, new Size(fill, fit), padding, new Padding(8.0d, 8.0d, 0.0d, 0.0d), list, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new TextComponent(LocalizationKey.m344constructorimpl("offer"), colorScheme, (Boolean) null, colorScheme3, str, fontWeight2, num, i12, horizontalAlignment, new Size(fill, fit), padding, new Padding(48.0d, 8.0d, 0.0d, 0.0d), list, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new StackComponent(AbstractC2279u.e(new TextComponent(LocalizationKey.m344constructorimpl("cta"), new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.k())), (ColorInfo) null, 2, (DefaultConstructorMarker) null), (Boolean) null, (ColorScheme) null, (String) null, FontWeight.BOLD, (Integer) null, 0, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, (List) null, 8156, (DefaultConstructorMarker) null)), (Boolean) null, (Dimension) new Dimension.ZLayer(twoDimensionalAlignment), new Size(fit, fit), (Float) (0 == true ? 1 : 0), new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(AbstractC6387s0.f(5, 124, 91, 0, 8, null))), (ColorInfo) null, 2, (DefaultConstructorMarker) null), (Background) null, new Padding(8.0d, 8.0d, 32.0d, 32.0d), new Padding(8.0d, 8.0d, 0.0d, 0.0d), (Shape) Shape.Pill.INSTANCE, (Border) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (Badge) (0 == true ? 1 : 0), (StackComponent.Overflow) (0 == true ? 1 : 0), (List) null, 31826, (DefaultConstructorMarker) null), new TextComponent(LocalizationKey.m344constructorimpl("terms"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, fontWeight2, num, i12, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, (List) null, 8188, (DefaultConstructorMarker) (0 == true ? 1 : 0))};
            byte b10 = 0 == true ? 1 : 0;
            byte b11 = 0 == true ? 1 : 0;
            byte b12 = 0 == true ? 1 : 0;
            byte b13 = 0 == true ? 1 : 0;
            byte b14 = 0 == true ? 1 : 0;
            String str2 = "preview_paywall_id";
            String str3 = "template";
            byte b15 = 0 == true ? 1 : 0;
            Offering offering = new Offering(DiagnosticsEntry.ID_KEY, b.f34645c, S.i(), AbstractC2279u.e(TestData.Packages.INSTANCE.getMonthly()), null, new Offering.PaywallComponents(PreviewHelpersKt.previewUiConfig$default(null, null, null, 7, null), new PaywallComponentsData(str2, str3, url, new ComponentsConfig(new PaywallComponentsConfig(new StackComponent(AbstractC2279u.p(stackComponent, new StackComponent(AbstractC2279u.p(paywallComponentArr), (Boolean) null, new Dimension.Vertical(horizontalAlignment, FlexDistribution.END), new Size(fill, fill), (Float) null, (ColorScheme) null, (Background) null, new Padding(16.0d, 16.0d, 32.0d, 32.0d), (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32626, (DefaultConstructorMarker) null)), (Boolean) null, (Dimension) new Dimension.ZLayer(TwoDimensionalAlignment.BOTTOM), new Size(fill, fill), (Float) null, colorScheme2, (Background) b11, (Padding) b12, (Padding) b13, (Shape) b14, (Border) null, (Shadow) b10, (Badge) null, (StackComponent.Overflow) null, (List) null, 32722, (DefaultConstructorMarker) null), new Background.Color(colorScheme2), null)), S.f(z.a(LocaleId.m307boximpl(LocaleId.m308constructorimpl("en_US")), S.l(z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl(b.f34626S)), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("Unlock bless."))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("feature-1")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("✓ Enjoy a 7 day trial"))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("feature-2")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("✓ Change currencies"))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("feature-3")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("✓ Access more trend charts"))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("feature-4")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("✓ Create custom categories"))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("feature-5")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("✓ Get a special premium icon"))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("feature-6")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("✓ Receive our love and gratitude for your support"))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("offer")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("Try 7 days free, then $19.98/year. Cancel anytime."))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("cta")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("Continue"))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("terms")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("Privacy & Terms")))))), LocaleId.m308constructorimpl("en_US"), 0, (List) (0 == true ? 1 : 0), (ExitOffers) (0 == true ? 1 : 0), (ProductChangeConfig) (0 == true ? 1 : 0), 960, (DefaultConstructorMarker) b15)), 0 == true ? 1 : 0, 80, 0 == true ? 1 : 0);
            Result resultValidatePaywallComponentsDataOrNullForPreviews = PreviewHelpersKt.validatePaywallComponentsDataOrNullForPreviews(offering, interfaceC2425mG, 0);
            PaywallValidationResult.Components components = resultValidatePaywallComponentsDataOrNullForPreviews != null ? (PaywallValidationResult.Components) ResultKt.getOrThrow(resultValidatePaywallComponentsDataOrNullForPreviews) : null;
            AbstractC5504s.e(components);
            LoadedPaywallComponents(OfferingToStateMapperKt.toComponentsPaywallState$default(offering, components, null, LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview_Bless$state$1.INSTANCE, new MockPurchasesType(null, null, null, null, 15, null), null, null, 48, null), new C41631(null), s.f(e.f26613a, 0.0f, 1, null), interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41642(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object handleClick(PaywallAction paywallAction, PaywallState.Loaded.Components components, Function2 function2, Zd.e eVar) {
        if (paywallAction instanceof PaywallAction.External) {
            Object objInvoke = function2.invoke(paywallAction, eVar);
            return objInvoke == AbstractC2605b.f() ? objInvoke : L.f17438a;
        }
        if ((paywallAction instanceof PaywallAction.Internal) && (((PaywallAction.Internal) paywallAction) instanceof PaywallAction.Internal.NavigateTo)) {
            PaywallAction.Internal.NavigateTo navigateTo = (PaywallAction.Internal.NavigateTo) paywallAction;
            if (navigateTo.getDestination() instanceof PaywallAction.Internal.NavigateTo.Destination.Sheet) {
                show(components.getSheet(), ((PaywallAction.Internal.NavigateTo.Destination.Sheet) navigateTo.getDestination()).getSheet(), components, new C41652(components, function2, null));
            }
        }
        return L.f17438a;
    }

    private static final ButtonComponentStyle.Action.NavigateTo.Destination.Sheet previewBottomSheet(Size size) {
        return new ButtonComponentStyle.Action.NavigateTo.Destination.Sheet("", "", PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(AbstractC2279u.p(PreviewHelpersKt.previewTextComponentStyle("This is a bottom sheet.", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("This is a bottom sheet.", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null), PreviewHelpersKt.previewTextComponentStyle("This is a bottom sheet.", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : null, (62224 & 4) != 0 ? 15 : 0, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : null, (29694 & 4) != 0, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : null, (29694 & 16) != 0 ? C5015h.n(16) : 0.0f, (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.k())), null, 2, null))), (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : new Shape.Rectangle(new CornerRadiuses.Dp(16.0d, 16.0d, 0.0d, 0.0d)), (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (29694 & 2048) != 0 ? null : null, (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? null : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), true, size);
    }

    static /* synthetic */ ButtonComponentStyle.Action.NavigateTo.Destination.Sheet previewBottomSheet$default(Size size, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            size = null;
        }
        return previewBottomSheet(size);
    }

    private static final PaywallState.Loaded.Components previewHelloWorldPaywallState(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-1486758699);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1486758699, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.previewHelloWorldPaywallState (LoadedPaywallComponents.kt:395)");
        }
        URL url = new URL("https://assets.pawwalls.com");
        String strM344constructorimpl = LocalizationKey.m344constructorimpl("hello-world");
        C6385r0.a aVar = C6385r0.f58985b;
        List listP = AbstractC2279u.p(new TextComponent(strM344constructorimpl, new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.a())), (ColorInfo) null, 2, (DefaultConstructorMarker) null), (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, (List) null, 8188, (DefaultConstructorMarker) null), TestData.Components.INSTANCE.getMonthlyPackageComponent());
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
        FlexDistribution flexDistribution = FlexDistribution.START;
        int i11 = 0;
        List list = null;
        ExitOffers exitOffers = null;
        ProductChangeConfig productChangeConfig = null;
        String str = "preview_paywall_id";
        String str2 = "template";
        Offering offering = new Offering(DiagnosticsEntry.ID_KEY, b.f34645c, S.i(), AbstractC2279u.e(TestData.Packages.INSTANCE.getMonthly()), null, new Offering.PaywallComponents(PreviewHelpersKt.previewUiConfig$default(null, null, null, 7, null), new PaywallComponentsData(str, str2, url, new ComponentsConfig(new PaywallComponentsConfig(new StackComponent(listP, (Boolean) null, new Dimension.Vertical(horizontalAlignment, flexDistribution), (Size) null, (Float) null, new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.c())), (ColorInfo) null, 2, (DefaultConstructorMarker) null), (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32730, (DefaultConstructorMarker) null), new Background.Color(new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.b())), new ColorInfo.Hex(AbstractC6387s0.k(aVar.h())))), new StickyFooterComponent(new StackComponent(AbstractC2279u.e(new TextComponent(LocalizationKey.m344constructorimpl("sticky-footer"), new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.a())), (ColorInfo) null, 2, (DefaultConstructorMarker) null), (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), 0, (HorizontalAlignment) (0 == true ? 1 : 0), (Size) (0 == true ? 1 : 0), (Padding) (0 == true ? 1 : 0), (Padding) (0 == true ? 1 : 0), (List) null, 8188, (DefaultConstructorMarker) null)), (Boolean) null, new Dimension.Vertical(horizontalAlignment, flexDistribution), (Size) null, (Float) null, new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.k())), (ColorInfo) null, 2, (DefaultConstructorMarker) null), (Background) null, (Padding) null, (Padding) null, new Shape.Rectangle(new CornerRadiuses.Dp(10.0d, 10.0d, 0.0d, 0.0d)), (Border) null, new Shadow(new ColorScheme(new ColorInfo.Hex(AbstractC6387s0.k(aVar.a())), new ColorInfo.Hex(AbstractC6387s0.k(aVar.l()))), 10.0d, 0.0d, -5.0d), (Badge) null, (StackComponent.Overflow) null, (List) null, 30170, (DefaultConstructorMarker) null)))), S.f(z.a(LocaleId.m307boximpl(LocaleId.m308constructorimpl("en_US")), S.l(z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("hello-world")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("Hello, world!"))), z.a(LocalizationKey.m343boximpl(LocalizationKey.m344constructorimpl("sticky-footer")), LocalizationData.Text.m325boximpl(LocalizationData.Text.m326constructorimpl("Sticky Footer")))))), LocaleId.m308constructorimpl("en_US"), i11, list, exitOffers, productChangeConfig, 960, (DefaultConstructorMarker) null)), 0 == true ? 1 : 0, 80, 0 == true ? 1 : 0);
        Result resultValidatePaywallComponentsDataOrNullForPreviews = PreviewHelpersKt.validatePaywallComponentsDataOrNullForPreviews(offering, interfaceC2425m, 0);
        PaywallValidationResult.Components components = resultValidatePaywallComponentsDataOrNullForPreviews != null ? (PaywallValidationResult.Components) ResultKt.getOrThrow(resultValidatePaywallComponentsDataOrNullForPreviews) : null;
        AbstractC5504s.e(components);
        PaywallState.Loaded.Components componentsPaywallState$default = OfferingToStateMapperKt.toComponentsPaywallState$default(offering, components, null, C41661.INSTANCE, new MockPurchasesType(null, null, null, null, 15, null), null, null, 48, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return componentsPaywallState$default;
    }

    private static final void show(SimpleSheetState simpleSheetState, ButtonComponentStyle.Action.NavigateTo.Destination.Sheet sheet, PaywallState.Loaded.Components components, Function2 function2) {
        simpleSheetState.show(sheet.getBackgroundBlur(), i.b(1290168816, true, new C41671(sheet, components, simpleSheetState, function2)), new C41682(components));
    }
}
