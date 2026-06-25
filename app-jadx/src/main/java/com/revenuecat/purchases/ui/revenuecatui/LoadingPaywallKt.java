package com.revenuecat.purchases.ui.revenuecatui;

import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import U.D;
import Ud.S;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.composables.CloseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProviderKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import g0.i;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "", "shouldDisplayDismissButton", "Lkotlin/Function0;", "LTd/L;", "onDismiss", "LoadingPaywall", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;ZLie/a;LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Lie/a;LY/m;I)V", "LoadingPaywallPreview", "(LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LoadingPaywallKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallKt$LoadingPaywall$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallMode $mode;
        final /* synthetic */ InterfaceC5082a $onDismiss;
        final /* synthetic */ boolean $shouldDisplayDismissButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallMode paywallMode, boolean z10, InterfaceC5082a interfaceC5082a, int i10) {
            super(2);
            this.$mode = paywallMode;
            this.$shouldDisplayDismissButton = z10;
            this.$onDismiss = interfaceC5082a;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            LoadingPaywallKt.LoadingPaywall(this.$mode, this.$shouldDisplayDismissButton, this.$onDismiss, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallKt$LoadingPaywall$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ InterfaceC5082a $onDismiss;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC5082a interfaceC5082a, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$onDismiss = interfaceC5082a;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            LoadingPaywallKt.LoadingPaywall(this.$state, this.$viewModel, this.$onDismiss, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallKt$LoadingPaywallPreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m378invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m378invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallKt$LoadingPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41532 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41532(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            LoadingPaywallKt.LoadingPaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void LoadingPaywall(PaywallMode mode, boolean z10, InterfaceC5082a onDismiss, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(onDismiss, "onDismiss");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1867064258);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(mode) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(onDismiss) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1867064258, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall (LoadingPaywall.kt:51)");
            }
            ResourceProvider resourceProvider = PaywallResourceProviderKt.toResourceProvider((Context) interfaceC2425mG.n(AndroidCompositionLocals_androidKt.g()));
            PaywallData.Companion companion = PaywallData.INSTANCE;
            LoadingPaywallConstants loadingPaywallConstants = LoadingPaywallConstants.INSTANCE;
            PaywallData paywallDataCreateDefault = PaywallDataExtensionsKt.createDefault(companion, loadingPaywallConstants.getPackages(), D.f17597a.a(interfaceC2425mG, D.f17598b), resourceProvider);
            PaywallState legacyPaywallState = OfferingToStateMapperKt.toLegacyPaywallState(new Offering(LoadingPaywallConstants.offeringIdentifier, "Loading paywall", S.i(), loadingPaywallConstants.getPackages(), paywallDataCreateDefault, null, null, 96, null), new VariableDataProvider(resourceProvider, HelperFunctionsKt.isInPreviewMode(interfaceC2425mG, 0)), mode, paywallDataCreateDefault, loadingPaywallConstants.getTemplate(), z10, null, (64 & 64) != 0 ? null : null);
            if (legacyPaywallState instanceof PaywallState.Error ? true : legacyPaywallState instanceof PaywallState.Loading ? true : legacyPaywallState instanceof PaywallState.Loaded.Components) {
                interfaceC2425mG.V(1291724261);
                e.a aVar = e.f26613a;
                B bH = f.h(l0.e.f52304a.o(), false);
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
                m2.e(interfaceC2425mB, bH, aVar2.e());
                m2.e(interfaceC2425mB, iR, aVar2.g());
                Function2 function2B = aVar2.b();
                if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                    interfaceC2425mB.u(Integer.valueOf(iA));
                    interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                }
                m2.e(interfaceC2425mB, eVarF, aVar2.f());
                h hVar = h.f26161a;
                interfaceC2425mG.x();
                interfaceC2425mG.O();
            } else if (legacyPaywallState instanceof PaywallState.Loaded.Legacy) {
                interfaceC2425mG.V(1291725898);
                LoadingPaywall((PaywallState.Loaded.Legacy) legacyPaywallState, new LoadingViewModel(legacyPaywallState, resourceProvider), onDismiss, interfaceC2425mG, i12 & 896);
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(1388875203);
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(mode, z10, onDismiss, i10));
        }
    }

    public static final void LoadingPaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(234924211);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(234924211, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallPreview (LoadingPaywall.kt:236)");
            }
            LoadingPaywall(PaywallMode.FULL_SCREEN, false, (InterfaceC5082a) AnonymousClass1.INSTANCE, interfaceC2425mG, 438);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41532(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingPaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC5082a interfaceC5082a2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1534111610);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(interfaceC5082a) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC5082a2 = interfaceC5082a;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1534111610, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall (LoadingPaywall.kt:97)");
            }
            e.a aVar = e.f26613a;
            B bH = f.h(l0.e.f52304a.o(), false);
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
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            h hVar = h.f26161a;
            DisableTouchesComposableKt.DisableTouchesComposable(false, i.d(-1190756256, true, new LoadingPaywallKt$LoadingPaywall$3$1(legacy, paywallViewModel), interfaceC2425mG, 54), interfaceC2425mG, 48, 1);
            interfaceC5082a2 = interfaceC5082a;
            CloseButtonKt.m566CloseButtondrOMvmE(hVar, legacy.getShouldDisplayDismissButton(), null, ((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue(), interfaceC5082a2, interfaceC2425mG, 390 | ((i11 << 6) & 57344));
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass4(legacy, paywallViewModel, interfaceC5082a2, i10));
        }
    }
}
