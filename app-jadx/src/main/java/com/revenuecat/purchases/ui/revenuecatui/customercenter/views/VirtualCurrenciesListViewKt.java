package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.C1131b;
import C.G;
import C.J;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import U.D;
import U.j0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.KeyboardArrowRightKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import g0.i;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\u001aE\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0018\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "virtualCurrencies", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "appearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "LTd/L;", "onAction", "Landroidx/compose/ui/e;", "modifier", "VirtualCurrenciesListView", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "virtualCurrency", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;", "position", "VirtualCurrencyRow", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;Landroidx/compose/ui/e;LY/m;II)V", "ShowAllVirtualCurrenciesRow", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V", "VirtualCurrenciesListView_4_VCs_Preview", "(LY/m;I)V", "VirtualCurrenciesListView_5_VCs_Preview", "", "MAX_NUMBER_OF_ROWS", "I", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrenciesListViewKt {
    private static final int MAX_NUMBER_OF_ROWS = 4;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ Function1 $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$onAction = function1;
            this.$localization = localization;
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
                AbstractC2454w.U(-906812433, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ShowAllVirtualCurrenciesRow.<anonymous> (VirtualCurrenciesListView.kt:197)");
            }
            e eVarH = s.h(e.f26613a, 0.0f, 1, null);
            interfaceC2425m.V(160480015);
            boolean zU = interfaceC2425m.U(this.$onAction);
            Function1 function1 = this.$onAction;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1$1$1(function1);
                interfaceC2425m.u(objD);
            }
            interfaceC2425m.O();
            e eVarJ = p.j(androidx.compose.foundation.d.d(eVarH, false, null, null, (InterfaceC5082a) objD, 7, null), CustomerCenterConstants.Card.INSTANCE.m648getCARD_PADDINGD9Ej5fM(), C5015h.n(12));
            C1131b.f fVarE = C1131b.f2093a.e();
            e.c cVarI = l0.e.f52304a.i();
            CustomerCenterConfigData.Localization localization = this.$localization;
            B b10 = G.b(fVarE, cVarI, interfaceC2425m, 54);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarJ);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
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
            m2.e(interfaceC2425mB, b10, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            J j10 = J.f2025a;
            String strCommonLocalizedString = localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SEE_ALL_VIRTUAL_CURRENCIES);
            D d10 = D.f17597a;
            int i11 = D.f17598b;
            j0.b(strCommonLocalizedString, null, d10.a(interfaceC2425m, i11).C(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, d10.c(interfaceC2425m, i11).c(), interfaceC2425m, 0, 0, 65530);
            U.B.b(KeyboardArrowRightKt.getKeyboardArrowRight(), null, null, d10.a(interfaceC2425m, i11).C(), interfaceC2425m, 48, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1 $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CustomerCenterConfigData.Localization localization, Function1 function1, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$localization = localization;
            this.$onAction = function1;
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
            VirtualCurrenciesListViewKt.ShowAllVirtualCurrenciesRow(this.$localization, this.$onAction, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrenciesListView$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44091 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ VirtualCurrencies $virtualCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44091(VirtualCurrencies virtualCurrencies, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, Function1 function1, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$virtualCurrencies = virtualCurrencies;
            this.$appearance = appearance;
            this.$localization = localization;
            this.$onAction = function1;
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
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView(this.$virtualCurrencies, this.$appearance, this.$localization, this.$onAction, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrenciesListView$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ VirtualCurrencies $virtualCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(VirtualCurrencies virtualCurrencies, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, Function1 function1, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$virtualCurrencies = virtualCurrencies;
            this.$appearance = appearance;
            this.$localization = localization;
            this.$onAction = function1;
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
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView(this.$virtualCurrencies, this.$appearance, this.$localization, this.$onAction, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrenciesListView_4_VCs_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44101 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrenciesListView_4_VCs_Preview$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06921 extends AbstractC5506u implements Function1 {
            public static final C06921 INSTANCE = new C06921();

            C06921() {
                super(1);
            }

            public final void invoke(CustomerCenterAction it) {
                AbstractC5504s.h(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerCenterAction) obj);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44101(CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$testData = customerCenterConfigData;
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
                AbstractC2454w.U(1130083298, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_4_VCs_Preview.<anonymous> (VirtualCurrenciesListView.kt:238)");
            }
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView(customerCenterConfigTestData.getFourVirtualCurrencies(), customerCenterConfigTestData.getStandardAppearance(), this.$testData.getLocalization(), C06921.INSTANCE, null, interfaceC2425m, 3072, 16);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrenciesListView_4_VCs_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44112 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44112(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView_4_VCs_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrenciesListView_5_VCs_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44121 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrenciesListView_5_VCs_Preview$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06931 extends AbstractC5506u implements Function1 {
            public static final C06931 INSTANCE = new C06931();

            C06931() {
                super(1);
            }

            public final void invoke(CustomerCenterAction it) {
                AbstractC5504s.h(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerCenterAction) obj);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44121(CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$testData = customerCenterConfigData;
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
                AbstractC2454w.U(488997155, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_5_VCs_Preview.<anonymous> (VirtualCurrenciesListView.kt:261)");
            }
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView(customerCenterConfigTestData.getFiveVirtualCurrencies(), customerCenterConfigTestData.getStandardAppearance(), this.$testData.getLocalization(), C06931.INSTANCE, null, interfaceC2425m, 3072, 16);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrenciesListView_5_VCs_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44132 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44132(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView_5_VCs_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrencyRow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44141 extends AbstractC5506u implements Function2 {
        final /* synthetic */ String $formattedBalance;
        final /* synthetic */ long $textColor;
        final /* synthetic */ VirtualCurrency $virtualCurrency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44141(VirtualCurrency virtualCurrency, long j10, String str) {
            super(2);
            this.$virtualCurrency = virtualCurrency;
            this.$textColor = j10;
            this.$formattedBalance = str;
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
                AbstractC2454w.U(-1744786209, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyRow.<anonymous> (VirtualCurrenciesListView.kt:157)");
            }
            androidx.compose.ui.e eVarJ = p.j(androidx.compose.ui.e.f26613a, CustomerCenterConstants.Card.INSTANCE.m648getCARD_PADDINGD9Ej5fM(), C5015h.n(12));
            C1131b.f fVarE = C1131b.f2093a.e();
            e.c cVarI = l0.e.f52304a.i();
            VirtualCurrency virtualCurrency = this.$virtualCurrency;
            long j10 = this.$textColor;
            String str = this.$formattedBalance;
            B b10 = G.b(fVarE, cVarI, interfaceC2425m, 54);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarJ);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
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
            m2.e(interfaceC2425mB, b10, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            J j11 = J.f2025a;
            j0.b(virtualCurrency.getName() + " (" + virtualCurrency.getCode() + ')', null, j10, 0L, null, null, null, 0L, null, C4830j.h(C4830j.f47278b.f()), 0L, 0, false, 2, 0, null, null, interfaceC2425m, 0, 3072, 122362);
            j0.b(str, null, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131066);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt$VirtualCurrencyRow$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44152 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ ButtonPosition $position;
        final /* synthetic */ VirtualCurrency $virtualCurrency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44152(CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, VirtualCurrency virtualCurrency, ButtonPosition buttonPosition, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$appearance = appearance;
            this.$localization = localization;
            this.$virtualCurrency = virtualCurrency;
            this.$position = buttonPosition;
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
            VirtualCurrenciesListViewKt.VirtualCurrencyRow(this.$appearance, this.$localization, this.$virtualCurrency, this.$position, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonPosition.values().length];
            try {
                iArr[ButtonPosition.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonPosition.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonPosition.LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonPosition.MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ShowAllVirtualCurrenciesRow(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r20, kotlin.jvm.functions.Function1 r21, androidx.compose.ui.e r22, Y.InterfaceC2425m r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt.ShowAllVirtualCurrenciesRow(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, kotlin.jvm.functions.Function1, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VirtualCurrenciesListView(com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies r34, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r35, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r36, kotlin.jvm.functions.Function1 r37, androidx.compose.ui.e r38, Y.InterfaceC2425m r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt.VirtualCurrenciesListView(com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, kotlin.jvm.functions.Function1, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VirtualCurrenciesListView_4_VCs_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1658158529);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1658158529, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_4_VCs_Preview (VirtualCurrenciesListView.kt:234)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1130083298, true, new C44101(CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null)), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44112(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VirtualCurrenciesListView_5_VCs_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1017072386);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1017072386, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_5_VCs_Preview (VirtualCurrenciesListView.kt:257)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(488997155, true, new C44121(CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null)), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44132(i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VirtualCurrencyRow(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r21, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r22, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency r23, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ButtonPosition r24, androidx.compose.ui.e r25, Y.InterfaceC2425m r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt.VirtualCurrencyRow(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ButtonPosition, androidx.compose.ui.e, Y.m, int, int):void");
    }
}
