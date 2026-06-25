package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import D.InterfaceC1231c;
import D.y;
import Td.L;
import U.D;
import U.j0;
import U0.Y0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import g0.i;
import i1.C5015h;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LD/y;", "LTd/L;", "invoke", "(LD/y;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
    final /* synthetic */ CustomerCenterConfigData.Localization $localization;
    final /* synthetic */ C6385r0 $textColor;
    final /* synthetic */ VirtualCurrencyBalancesScreenViewState $viewState;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LD/c;", "LTd/L;", "invoke", "(LD/c;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ C6385r0 $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CustomerCenterConfigData.Localization localization, C6385r0 c6385r0) {
            super(3);
            this.$localization = localization;
            this.$textColor = c6385r0;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1231c) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1231c item, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(item, "$this$item");
            if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-853776436, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.InternalVirtualCurrencyBalancesScreen.<anonymous>.<anonymous>.<anonymous> (VirtualCurrencyBalancesScreen.kt:84)");
            }
            String strCommonLocalizedString = this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER);
            D d10 = D.f17597a;
            int i11 = D.f17598b;
            Y0 y0J = d10.c(interfaceC2425m, i11).j();
            C6385r0 c6385r0 = this.$textColor;
            interfaceC2425m.V(58225184);
            long jP = c6385r0 == null ? d10.a(interfaceC2425m, i11).p() : c6385r0.A();
            interfaceC2425m.O();
            j0.b(strCommonLocalizedString, p.m(e.f26613a, 0.0f, 0.0f, 0.0f, C5015h.n(16), 7, null), jP, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y0J, interfaceC2425m, 48, 0, 65528);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "virtualCurrency", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (VirtualCurrency) obj2);
        }

        public final Object invoke(int i10, VirtualCurrency virtualCurrency) {
            AbstractC5504s.h(virtualCurrency, "virtualCurrency");
            return virtualCurrency.getCode() + '_' + virtualCurrency.getName() + '_' + i10;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LD/c;", "LTd/L;", "invoke", "(LD/c;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(CustomerCenterConfigData.Localization localization) {
            super(3);
            this.$localization = localization;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1231c) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1231c item, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(item, "$this$item");
            if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1955047837, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.InternalVirtualCurrencyBalancesScreen.<anonymous>.<anonymous>.<anonymous> (VirtualCurrencyBalancesScreen.kt:122)");
            }
            VirtualCurrencyBalancesScreenKt.EmptyStateView(this.$localization, null, interfaceC2425m, 0, 2);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LD/c;", "LTd/L;", "invoke", "(LD/c;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass5 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ VirtualCurrencyBalancesScreenViewState $viewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState) {
            super(3);
            this.$viewState = virtualCurrencyBalancesScreenViewState;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1231c) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1231c item, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(item, "$this$item");
            if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1044805064, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.InternalVirtualCurrencyBalancesScreen.<anonymous>.<anonymous>.<anonymous> (VirtualCurrencyBalancesScreen.kt:130)");
            }
            CustomerCenterErrorViewKt.CustomerCenterErrorView(new CustomerCenterState.Error(((VirtualCurrencyBalancesScreenViewState.Error) this.$viewState).getError()), interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1(VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState, CustomerCenterConfigData.Localization localization, C6385r0 c6385r0, CustomerCenterConfigData.Appearance appearance) {
        super(1);
        this.$viewState = virtualCurrencyBalancesScreenViewState;
        this.$localization = localization;
        this.$textColor = c6385r0;
        this.$appearance = appearance;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((y) obj);
        return L.f17438a;
    }

    public final void invoke(y LazyColumn) {
        AbstractC5504s.h(LazyColumn, "$this$LazyColumn");
        VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState = this.$viewState;
        if (virtualCurrencyBalancesScreenViewState instanceof VirtualCurrencyBalancesScreenViewState.Loading) {
            y.a(LazyColumn, null, null, ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.m711getLambda1$revenuecatui_defaultsBc8Release(), 3, null);
            return;
        }
        if (!(virtualCurrencyBalancesScreenViewState instanceof VirtualCurrencyBalancesScreenViewState.Loaded)) {
            if (virtualCurrencyBalancesScreenViewState instanceof VirtualCurrencyBalancesScreenViewState.Error) {
                y.a(LazyColumn, null, null, i.b(1044805064, true, new AnonymousClass5(virtualCurrencyBalancesScreenViewState)), 3, null);
                return;
            }
            return;
        }
        List<VirtualCurrency> virtualCurrencyBalanceData = ((VirtualCurrencyBalancesScreenViewState.Loaded) virtualCurrencyBalancesScreenViewState).getVirtualCurrencyBalanceData();
        if (virtualCurrencyBalanceData.isEmpty()) {
            y.a(LazyColumn, null, null, i.b(-1955047837, true, new AnonymousClass4(this.$localization)), 3, null);
            return;
        }
        y.a(LazyColumn, null, null, i.b(-853776436, true, new AnonymousClass1(this.$localization, this.$textColor)), 3, null);
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        LazyColumn.d(virtualCurrencyBalanceData.size(), anonymousClass2 != null ? new VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$invoke$$inlined$itemsIndexed$default$1(anonymousClass2, virtualCurrencyBalanceData) : null, new VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$invoke$$inlined$itemsIndexed$default$2(virtualCurrencyBalanceData), i.b(-1091073711, true, new VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$invoke$$inlined$itemsIndexed$default$3(virtualCurrencyBalanceData, virtualCurrencyBalanceData, this.$appearance, this.$localization)));
    }
}
