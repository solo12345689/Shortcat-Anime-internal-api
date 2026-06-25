package com.revenuecat.purchases.ui.revenuecatui;

import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import U.D;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C2397c1;
import Y.H;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC2854h;
import androidx.lifecycle.U;
import androidx.lifecycle.Y;
import com.facebook.imageutils.JfifUtil;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.CloseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialogKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ContextExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProviderKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt;
import com.revenuecat.purchases.ui.revenuecatui.utils.URLOpener;
import com.revenuecat.purchases.ui.revenuecatui.utils.URLOpeningMethod;
import g0.i;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.O;
import m2.AbstractC5628a;
import n2.AbstractC5719d;
import n2.C5717b;
import pe.InterfaceC6018h;
import s0.C6385r0;
import v.AbstractC6783d;
import v.InterfaceC6784e;
import x.AbstractC7015m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\n\u001a/\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010#\u001a\u00020\u0004*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a&\u0010+\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "options", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "LTd/L;", "InternalPaywall", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "LoadedPaywall", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "TemplatePaywall", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "", "shouldDisplayBlock", "getPaywallViewModel", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;Lkotlin/jvm/functions/Function1;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "Landroid/content/res/Configuration;", "configuration", "Landroid/content/Context;", "contextWithConfiguration", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Landroid/content/res/Configuration;LY/m;I)Landroid/content/Context;", "configurationWithOverriddenLocale", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)Landroid/content/res/Configuration;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;", "LZd/e;", "", "rememberPaywallActionHandler", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)Lkotlin/jvm/functions/Function2;", "", "url", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "handleUrlDestination", "(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "Landroidx/compose/ui/e;", "isInFullScreenMode", "Ls0/r0;", "backgroundColor", "screenModeBackground-mxwnekA", "(Landroidx/compose/ui/e;ZJ)Landroidx/compose/ui/e;", "screenModeBackground", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InternalPaywallKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ PaywallOptions $options;
        final /* synthetic */ PaywallState $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$3$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
            final /* synthetic */ PaywallOptions $options;
            final /* synthetic */ PaywallViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaywallOptions paywallOptions, PaywallViewModel paywallViewModel) {
                super(3);
                this.$options = paywallOptions;
                this.$viewModel = paywallViewModel;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
                return L.f17438a;
            }

            public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
                AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(272980506, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:84)");
                }
                PaywallMode mode = this.$options.getMode();
                boolean shouldDisplayDismissButton = this.$options.getShouldDisplayDismissButton();
                PaywallViewModel paywallViewModel = this.$viewModel;
                interfaceC2425m.V(1191294305);
                boolean zU = interfaceC2425m.U(paywallViewModel);
                Object objD = interfaceC2425m.D();
                if (zU || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new InternalPaywallKt$InternalPaywall$3$1$1$1(paywallViewModel);
                    interfaceC2425m.u(objD);
                }
                interfaceC2425m.O();
                LoadingPaywallKt.LoadingPaywall(mode, shouldDisplayDismissButton, (InterfaceC5082a) objD, interfaceC2425m, 0);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallState paywallState, PaywallOptions paywallOptions, PaywallViewModel paywallViewModel) {
            super(2);
            this.$state = paywallState;
            this.$options = paywallOptions;
            this.$viewModel = paywallViewModel;
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
                AbstractC2454w.U(-1925201086, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:79)");
            }
            PaywallState paywallState = this.$state;
            boolean z10 = (paywallState instanceof PaywallState.Loading) || (paywallState instanceof PaywallState.Error);
            UIConstant uIConstant = UIConstant.INSTANCE;
            AbstractC6783d.e(z10, null, f.m(uIConstant.defaultAnimation(), 0.0f, 2, null), f.o(uIConstant.defaultAnimation(), 0.0f, 2, null), null, i.d(272980506, true, new AnonymousClass1(this.$options, this.$viewModel), interfaceC2425m, 54), interfaceC2425m, 196608, 18);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ PaywallState $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$4$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
            final /* synthetic */ PaywallState $state;
            final /* synthetic */ PaywallViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaywallState paywallState, PaywallViewModel paywallViewModel) {
                super(3);
                this.$state = paywallState;
                this.$viewModel = paywallViewModel;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
                return L.f17438a;
            }

            public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
                AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(-2131421167, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:98)");
                }
                PaywallState paywallState = this.$state;
                if (paywallState instanceof PaywallState.Loaded.Legacy) {
                    InternalPaywallKt.LoadedPaywall((PaywallState.Loaded.Legacy) paywallState, this.$viewModel, interfaceC2425m, 0);
                } else {
                    Logger.INSTANCE.e("State is not loaded while transitioning animation. This may happen if state changes from being loaded to a different state. This should not happen.");
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PaywallState paywallState, PaywallViewModel paywallViewModel) {
            super(2);
            this.$state = paywallState;
            this.$viewModel = paywallViewModel;
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
                AbstractC2454w.U(-1460021447, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:93)");
            }
            boolean z10 = this.$state instanceof PaywallState.Loaded.Legacy;
            UIConstant uIConstant = UIConstant.INSTANCE;
            AbstractC6783d.e(z10, null, f.m(uIConstant.defaultAnimation(), 0.0f, 2, null), f.o(uIConstant.defaultAnimation(), 0.0f, 2, null), null, i.d(-2131421167, true, new AnonymousClass1(this.$state, this.$viewModel), interfaceC2425m, 54), interfaceC2425m, 196608, 18);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$5 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass5 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ PaywallState $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(PaywallState paywallState, PaywallViewModel paywallViewModel) {
            super(3);
            this.$state = paywallState;
            this.$viewModel = paywallViewModel;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1024882965, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:115)");
            }
            if (this.$state instanceof PaywallState.Loaded.Components) {
                this.$viewModel.trackPaywallImpressionIfNeeded();
                LoadedPaywallComponentsKt.LoadedPaywallComponents((PaywallState.Loaded.Components) this.$state, InternalPaywallKt.rememberPaywallActionHandler(this.$viewModel, interfaceC2425m, 0), null, interfaceC2425m, 0, 4);
            } else {
                Logger.INSTANCE.e("State is not Loaded.Components while transitioning animation. This may happen if state changes from being loaded to a different state. This should not happen.");
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$6 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass6 extends AbstractC5506u implements Function2 {
        final /* synthetic */ PaywallOptions $options;
        final /* synthetic */ PaywallState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(PaywallOptions paywallOptions, PaywallState paywallState) {
            super(2);
            this.$options = paywallOptions;
            this.$state = paywallState;
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
                AbstractC2454w.U(-1440901149, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:134)");
            }
            ErrorDialogKt.ErrorDialog(this.$options.getDismissRequest(), ((PaywallState.Error) this.$state).getErrorMessage(), interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$8 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass8 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ PaywallOptions $options;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(PaywallOptions paywallOptions, PaywallViewModel paywallViewModel, int i10, int i11) {
            super(2);
            this.$options = paywallOptions;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalPaywallKt.InternalPaywall(this.$options, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$LoadedPaywall$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalPaywallKt.LoadedPaywall(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$LoadedPaywall$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41524 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41524(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalPaywallKt.LoadedPaywall(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$TemplatePaywall$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalPaywallKt.TemplatePaywall(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaywallTemplate.values().length];
            try {
                iArr[PaywallTemplate.TEMPLATE_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_7.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonComponent.UrlMethod.values().length];
            try {
                iArr2[ButtonComponent.UrlMethod.IN_APP_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ButtonComponent.UrlMethod.EXTERNAL_BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ButtonComponent.UrlMethod.DEEP_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ButtonComponent.UrlMethod.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void InternalPaywall(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r18, Y.InterfaceC2425m r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt.InternalPaywall(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, Y.m, int, int):void");
    }

    public static final void LoadedPaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1252678312);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1252678312, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadedPaywall (InternalPaywall.kt:160)");
            }
            paywallViewModel.trackPaywallImpressionIfNeeded();
            Activity activity = ContextExtensionsKt.getActivity((Context) interfaceC2425mG.n(AndroidCompositionLocals_androidKt.g()));
            interfaceC2425mG.V(-492482342);
            if (legacy.getValidationWarning() != null) {
                D d10 = D.f17597a;
                int i12 = D.f17598b;
                long jC = d10.a(interfaceC2425mG, i12).c();
                long jW = d10.a(interfaceC2425mG, i12).w();
                e eVarM368screenModeBackgroundmxwnekA = m368screenModeBackgroundmxwnekA(e.f26613a, PaywallStateKt.isInFullScreenMode(legacy), jC);
                B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
                int iA = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR = interfaceC2425mG.r();
                e eVarF = c.f(interfaceC2425mG, eVarM368screenModeBackgroundmxwnekA);
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
                List<TemplateConfiguration.PackageInfo> all = legacy.getTemplateConfiguration().getPackages().getAll();
                TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) legacy.getSelectedPackage().getValue();
                PaywallWarning validationWarning = legacy.getValidationWarning();
                interfaceC2425mG.V(2084302107);
                int i13 = i11 & 112;
                boolean z10 = i13 == 32;
                Object objD = interfaceC2425mG.D();
                if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new InternalPaywallKt$LoadedPaywall$1$1$1(paywallViewModel);
                    interfaceC2425mG.u(objD);
                }
                interfaceC2425mG.O();
                Function1 function1 = (Function1) ((InterfaceC6018h) objD);
                interfaceC2425mG.V(2084303926);
                boolean zF = (i13 == 32) | interfaceC2425mG.F(activity);
                Object objD2 = interfaceC2425mG.D();
                if (zF || objD2 == InterfaceC2425m.f22370a.a()) {
                    objD2 = new InternalPaywallKt$LoadedPaywall$1$2$1(paywallViewModel, activity);
                    interfaceC2425mG.u(objD2);
                }
                InterfaceC5082a interfaceC5082a = (InterfaceC5082a) objD2;
                interfaceC2425mG.O();
                interfaceC2425mG.V(2084307527);
                boolean z11 = i13 == 32;
                Object objD3 = interfaceC2425mG.D();
                if (z11 || objD3 == InterfaceC2425m.f22370a.a()) {
                    objD3 = new InternalPaywallKt$LoadedPaywall$1$3$1(paywallViewModel);
                    interfaceC2425mG.u(objD3);
                }
                interfaceC2425mG.O();
                boolean z12 = true;
                DefaultPaywallViewKt.DefaultPaywallView(all, packageInfo, validationWarning, function1, interfaceC5082a, (InterfaceC5082a) objD3, null, null, interfaceC2425mG, 0, JfifUtil.MARKER_SOFn);
                boolean shouldDisplayDismissButton = legacy.getShouldDisplayDismissButton();
                C6385r0 c6385r0M = C6385r0.m(jW);
                boolean zBooleanValue = ((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue();
                interfaceC2425mG.V(2084317882);
                if (i13 != 32) {
                    z12 = false;
                }
                Object objD4 = interfaceC2425mG.D();
                if (z12 || objD4 == InterfaceC2425m.f22370a.a()) {
                    objD4 = new InternalPaywallKt$LoadedPaywall$1$4$1(paywallViewModel);
                    interfaceC2425mG.u(objD4);
                }
                interfaceC2425mG.O();
                CloseButtonKt.m566CloseButtondrOMvmE(hVar, shouldDisplayDismissButton, c6385r0M, zBooleanValue, (InterfaceC5082a) objD4, interfaceC2425mG, 6);
                interfaceC2425mG.x();
                interfaceC2425mG.O();
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
                B1 b1K = interfaceC2425mG.k();
                if (b1K != null) {
                    b1K.a(new AnonymousClass2(legacy, paywallViewModel, i10));
                    return;
                }
                return;
            }
            interfaceC2425m2 = interfaceC2425mG;
            interfaceC2425m2.O();
            e eVarM368screenModeBackgroundmxwnekA2 = m368screenModeBackgroundmxwnekA(e.f26613a, PaywallStateKt.isInFullScreenMode(legacy), legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425m2, 0).m781getBackground0d7_KjU());
            B bH2 = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA2 = AbstractC2410h.a(interfaceC2425m2, 0);
            I iR2 = interfaceC2425m2.r();
            e eVarF2 = c.f(interfaceC2425m2, eVarM368screenModeBackgroundmxwnekA2);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA2 = aVar2.a();
            if (interfaceC2425m2.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m2.I();
            if (interfaceC2425m2.e()) {
                interfaceC2425m2.h(interfaceC5082aA2);
            } else {
                interfaceC2425m2.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425m2);
            m2.e(interfaceC2425mB2, bH2, aVar2.e());
            m2.e(interfaceC2425mB2, iR2, aVar2.g());
            Function2 function2B2 = aVar2.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar2.f());
            int i14 = i11;
            h hVar2 = h.f26161a;
            int i15 = i14 & 14;
            Configuration configurationConfigurationWithOverriddenLocale = configurationWithOverriddenLocale(legacy, interfaceC2425m2, i15);
            H.d(new C2397c1[]{HelperFunctionsKt.getLocalActivity().d(activity), AndroidCompositionLocals_androidKt.g().d(contextWithConfiguration(legacy, configurationConfigurationWithOverriddenLocale, interfaceC2425m2, i15)), AndroidCompositionLocals_androidKt.f().d(configurationConfigurationWithOverriddenLocale)}, i.d(1771404190, true, new InternalPaywallKt$LoadedPaywall$3$1(legacy, paywallViewModel), interfaceC2425m2, 54), interfaceC2425m2, C2397c1.f22274i | 48);
            boolean shouldDisplayDismissButton2 = legacy.getShouldDisplayDismissButton();
            C6385r0 c6385r0M785getCloseButtonQN2ZGVo = PaywallStateKt.getCurrentColors(legacy, interfaceC2425m2, i15).m785getCloseButtonQN2ZGVo();
            boolean zBooleanValue2 = ((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue();
            interfaceC2425m2.V(2084345882);
            boolean z13 = (i14 & 112) == 32;
            Object objD5 = interfaceC2425m2.D();
            if (z13 || objD5 == InterfaceC2425m.f22370a.a()) {
                objD5 = new InternalPaywallKt$LoadedPaywall$3$2$1(paywallViewModel);
                interfaceC2425m2.u(objD5);
            }
            interfaceC2425m2.O();
            CloseButtonKt.m566CloseButtondrOMvmE(hVar2, shouldDisplayDismissButton2, c6385r0M785getCloseButtonQN2ZGVo, zBooleanValue2, (InterfaceC5082a) objD5, interfaceC2425m2, 6);
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K2 = interfaceC2425m2.k();
        if (b1K2 != null) {
            b1K2.a(new C41524(legacy, paywallViewModel, i10));
        }
    }

    public static final void TemplatePaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        PaywallState.Loaded.Legacy legacy2;
        PaywallViewModel paywallViewModel2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1883481085);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            legacy2 = legacy;
            paywallViewModel2 = paywallViewModel;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1883481085, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.TemplatePaywall (InternalPaywall.kt:216)");
            }
            switch (WhenMappings.$EnumSwitchMapping$0[legacy.getTemplateConfiguration().getTemplate().ordinal()]) {
                case 1:
                    legacy2 = legacy;
                    paywallViewModel2 = paywallViewModel;
                    interfaceC2425mG.V(-820467874);
                    Template1Kt.Template1(legacy2, paywallViewModel2, interfaceC2425mG, i11 & 126);
                    interfaceC2425mG.O();
                    break;
                case 2:
                    interfaceC2425mG.V(-820465122);
                    legacy2 = legacy;
                    paywallViewModel2 = paywallViewModel;
                    Template2Kt.Template2(legacy2, paywallViewModel2, null, interfaceC2425mG, i11 & 126, 4);
                    interfaceC2425mG.O();
                    break;
                case 3:
                    interfaceC2425mG.V(-820462370);
                    Template3Kt.Template3(legacy, paywallViewModel, interfaceC2425mG, i11 & 126);
                    interfaceC2425mG.O();
                    legacy2 = legacy;
                    paywallViewModel2 = paywallViewModel;
                    break;
                case 4:
                    interfaceC2425mG.V(-820459618);
                    Template4Kt.Template4(legacy, paywallViewModel, interfaceC2425mG, i11 & 126);
                    interfaceC2425mG.O();
                    legacy2 = legacy;
                    paywallViewModel2 = paywallViewModel;
                    break;
                case 5:
                    interfaceC2425mG.V(-820456866);
                    Template5Kt.Template5(legacy, paywallViewModel, interfaceC2425mG, i11 & 126);
                    interfaceC2425mG.O();
                    legacy2 = legacy;
                    paywallViewModel2 = paywallViewModel;
                    break;
                case 6:
                    interfaceC2425mG.V(-820454114);
                    Template7Kt.Template7(legacy, paywallViewModel, interfaceC2425mG, i11 & 126);
                    interfaceC2425mG.O();
                    legacy2 = legacy;
                    paywallViewModel2 = paywallViewModel;
                    break;
                default:
                    interfaceC2425mG.V(335777363);
                    interfaceC2425mG.O();
                    legacy2 = legacy;
                    paywallViewModel2 = paywallViewModel;
                    break;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(legacy2, paywallViewModel2, i10));
        }
    }

    private static final Configuration configurationWithOverriddenLocale(PaywallState.Loaded.Legacy legacy, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(761546839, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.configurationWithOverriddenLocale (InternalPaywall.kt:260)");
        }
        Configuration configuration = new Configuration((Configuration) interfaceC2425m.n(AndroidCompositionLocals_androidKt.f()));
        configuration.setLocale(legacy.getTemplateConfiguration().getLocale());
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return configuration;
    }

    private static final Context contextWithConfiguration(PaywallState.Loaded.Legacy legacy, Configuration configuration, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(2083869389, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.contextWithConfiguration (InternalPaywall.kt:251)");
        }
        Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        if (contextCreateConfigurationContext != null) {
            context = contextCreateConfigurationContext;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return context;
    }

    public static final PaywallViewModel getPaywallViewModel(PaywallOptions options, Function1 function1, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        AbstractC5504s.h(options, "options");
        interfaceC2425m.V(-1725540891);
        Function1 function12 = (i11 & 2) != 0 ? null : function1;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1725540891, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.getPaywallViewModel (InternalPaywall.kt:232)");
        }
        Context applicationContext = ((Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g())).getApplicationContext();
        String strValueOf = String.valueOf(options.hashCode());
        AbstractC5504s.g(applicationContext, "applicationContext");
        PaywallViewModelFactory paywallViewModelFactory = new PaywallViewModelFactory(PaywallResourceProviderKt.toResourceProvider(applicationContext), options, D.f17597a.a(interfaceC2425m, D.f17598b), AbstractC7015m.a(interfaceC2425m, 0), function12, HelperFunctionsKt.isInPreviewMode(interfaceC2425m, 0));
        interfaceC2425m.C(1729797275);
        Y yC = C5717b.f53840a.c(interfaceC2425m, 6);
        if (yC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        U uB = AbstractC5719d.b(O.b(PaywallViewModelImpl.class), yC, strValueOf, paywallViewModelFactory, yC instanceof InterfaceC2854h ? ((InterfaceC2854h) yC).getDefaultViewModelCreationExtras() : AbstractC5628a.b.f53049c, interfaceC2425m, 0, 0);
        interfaceC2425m.T();
        PaywallViewModelImpl paywallViewModelImpl = (PaywallViewModelImpl) uB;
        paywallViewModelImpl.updateOptions(options);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return paywallViewModelImpl;
    }

    public static final void handleUrlDestination(Context context, String str, ButtonComponent.UrlMethod urlMethod) {
        URLOpeningMethod uRLOpeningMethod;
        int i10 = WhenMappings.$EnumSwitchMapping$1[urlMethod.ordinal()];
        if (i10 == 1) {
            uRLOpeningMethod = URLOpeningMethod.IN_APP_BROWSER;
        } else if (i10 == 2) {
            uRLOpeningMethod = URLOpeningMethod.EXTERNAL_BROWSER;
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new r();
                }
                Logger.INSTANCE.e("Ignoring button click with unknown open method for URL: '" + str + "'. This is a bug in the SDK.");
                return;
            }
            uRLOpeningMethod = URLOpeningMethod.DEEP_LINK;
        }
        URLOpener.INSTANCE.openURL$revenuecatui_defaultsBc8Release(context, str, uRLOpeningMethod);
    }

    public static final Function2 rememberPaywallActionHandler(PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-1933557776);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1933557776, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.rememberPaywallActionHandler (InternalPaywall.kt:268)");
        }
        Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        Activity activity = ContextExtensionsKt.getActivity(context);
        interfaceC2425m.V(-1197188630);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(paywallViewModel)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new InternalPaywallKt$rememberPaywallActionHandler$1$1(paywallViewModel, activity, context, null);
            interfaceC2425m.u(objD);
        }
        Function2 function2 = (Function2) objD;
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return function2;
    }

    /* JADX INFO: renamed from: screenModeBackground-mxwnekA */
    private static final e m368screenModeBackgroundmxwnekA(e eVar, boolean z10, long j10) {
        return ModifierExtensionsKt.conditional(ModifierExtensionsKt.conditional(eVar, z10, new InternalPaywallKt$screenModeBackground$1(j10)), !z10, new InternalPaywallKt$screenModeBackground$2(j10));
    }
}
