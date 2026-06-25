package com.revenuecat.purchases.ui.revenuecatui.components.countdown;

import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import ae.AbstractC2605b;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
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
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CountdownComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import i1.C5015h;
import java.util.Date;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "LZd/e;", "LTd/L;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "CountdownComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CountdownComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V", "CountdownComponentView_Preview_Running", "(LY/m;I)V", "CountdownComponentView_Preview_TimesUp", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class CountdownComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function2 $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ CountdownComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CountdownComponentStyle countdownComponentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
            this.$style = countdownComponentStyle;
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
            CountdownComponentViewKt.CountdownComponentView(this.$style, this.$state, this.$onClick, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView_Preview_Running$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView_Preview_Running$1", f = "CountdownComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41801 extends l implements Function2 {
        int label;

        C41801(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41801(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C41801) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView_Preview_Running$2, reason: invalid class name */
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
            CountdownComponentViewKt.CountdownComponentView_Preview_Running(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView_Preview_TimesUp$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView_Preview_TimesUp$1", f = "CountdownComponentView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
    static final class C41811 extends l implements Function2 {
        int label;

        C41811(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C41811(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaywallAction paywallAction, Zd.e eVar) {
            return ((C41811) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView_Preview_TimesUp$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41822 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41822(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CountdownComponentViewKt.CountdownComponentView_Preview_TimesUp(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void CountdownComponentView(CountdownComponentStyle style, PaywallState.Loaded.Components state, Function2 onClick, e eVar, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        PaywallState.Loaded.Components components;
        Function2 function2;
        e eVar2;
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(onClick, "onClick");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1827191195);
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
            function2 = onClick;
            components = state;
        } else {
            if (i13 != 0) {
                eVar = e.f26613a;
            }
            e eVar3 = eVar;
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1827191195, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView (CountdownComponentView.kt:26)");
            }
            StackComponentViewKt.StackComponentView((!CountdownComponentStateKt.rememberCountdownState(style.getDate(), interfaceC2425mG, 0).getHasEnded() || style.getEndStackComponentStyle() == null) ? style.getCountdownStackComponentStyle() : style.getEndStackComponentStyle(), state, onClick, eVar3, 0.0f, interfaceC2425mG, i12 & 8176, 16);
            components = state;
            function2 = onClick;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            eVar2 = eVar3;
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(style, components, function2, eVar2, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CountdownComponentView_Preview_Running(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(964712165);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(964712165, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView_Preview_Running (CountdownComponentView.kt:45)");
            }
            Date date = new Date(System.currentTimeMillis() + ((long) 172800000));
            CountdownComponentView(new CountdownComponentStyle(date, CountdownComponent.CountFrom.DAYS, PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("{{ count_days_without_zero }}d {{ count_hours_without_zero }}h {{ count_minutes_without_zero }}m {{ count_seconds_without_zero }}s", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null), (62224 & 4) != 0 ? 15 : 24, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? date : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : null, (29694 & 4) != 0, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : null, (29694 & 16) != 0 ? C5015h.n(16) : 0.0f, (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : null, (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (29694 & 2048) != 0 ? null : null, (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? date : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), null, null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C41801(null), null, interfaceC2425mG, 384, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CountdownComponentView_Preview_TimesUp(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1982632477);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1982632477, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView_Preview_TimesUp (CountdownComponentView.kt:73)");
            }
            Date date = new Date(System.currentTimeMillis() - ((long) 172800000));
            C6385r0.a aVar = C6385r0.f58985b;
            CountdownComponentView(new CountdownComponentStyle(date, CountdownComponent.CountFrom.DAYS, PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("{{ count_days_without_zero }}d {{ count_hours_without_zero }}h {{ count_minutes_without_zero }}m {{ count_seconds_without_zero }}s", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.a())), null, 2, null), (62224 & 4) != 0 ? 15 : 24, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? date : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : null, (29694 & 4) != 0, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : null, (29694 & 16) != 0 ? C5015h.n(16) : 0.0f, (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : null, (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (29694 & 2048) != 0 ? null : null, (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? date : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), PreviewHelpersKt.m393previewStackComponentStyle7SJwSw(AbstractC2279u.e(PreviewHelpersKt.previewTextComponentStyle("Offer expired!", (62224 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null) : new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.a())), null, 2, null), (62224 & 4) != 0 ? 15 : 24, (62224 & 8) != 0 ? FontWeight.REGULAR : null, (62224 & 16) != 0 ? null : null, (62224 & 32) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 64) != 0 ? HorizontalAlignment.CENTER : null, (62224 & 128) != 0 ? null : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : null, (62224 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 2048) != 0 ? Padding.INSTANCE.getZero() : null, (62224 & 4096) != 0 ? null : null, (62224 & 8192) == 0 ? null : null, (62224 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null, (62224 & 32768) != 0 ? AbstractC2279u.m() : null)), (29694 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : null, (29694 & 4) != 0, (29694 & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, null), SizeConstraint.Fit.INSTANCE) : null, (29694 & 16) != 0 ? C5015h.n(16) : 0.0f, (29694 & 32) != 0 ? BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())), null, 2, null))) : null, (29694 & 64) != 0 ? p.a(C5015h.n(0)) : null, (29694 & 128) != 0 ? p.a(C5015h.n(0)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.b())), null, 2, null), null) : null, (29694 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (29694 & 2048) != 0 ? null : null, (29694 & 4096) != 0 ? null : null, (29694 & 8192) == 0 ? null : null, (29694 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : null), null), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), new C41811(null), null, interfaceC2425mG, 384, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41822(i10));
        }
    }
}
