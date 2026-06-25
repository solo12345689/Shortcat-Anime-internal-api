package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.K;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import g0.i;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\f\u001a\u008b\u0001\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aA\u0010\u001b\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u000f\u0010 \u001a\u00020\u000fH\u0003¢\u0006\u0004\b \u0010\u001e\u001a\u000f\u0010!\u001a\u00020\u000fH\u0003¢\u0006\u0004\b!\u0010\u001e\u001a\u000f\u0010\"\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\"\u0010\u001e\u001a\u000f\u0010#\u001a\u00020\u000fH\u0003¢\u0006\u0004\b#\u0010\u001e\u001a\u000f\u0010$\u001a\u00020\u000fH\u0003¢\u0006\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "supportedPaths", "", "contactEmail", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "virtualCurrencies", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "appearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "supportTickets", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "LTd/L;", "onPurchaseSelect", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "onAction", "Landroidx/compose/ui/e;", "modifier", "purchases", "RelevantPurchasesListView", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Ljava/util/List;LY/m;II)V", "", "", "totalPurchaseCount", "PurchaseListSection", "(Ljava/util/Set;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;ILkotlin/jvm/functions/Function1;LY/m;I)V", "RelevantPurchasesListViewPreview", "(LY/m;I)V", "NoActiveSubscriptionsViewPreview", "RelevantPurchasesListViewWithLifetimePurchasePreview", "RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview", "NoActiveSubscriptionsViewNoDescription_Preview", "RelevantPurchasesListViewWithMultiplePurchasesPreview", "RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RelevantPurchasesListViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$NoActiveSubscriptionsViewNoDescription_Preview$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $noActiveScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$noActiveScreen = screen;
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
                AbstractC2454w.U(1539230767, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveSubscriptionsViewNoDescription_Preview.<anonymous> (RelevantPurchasesListView.kt:255)");
            }
            CustomerCenterConfigData.Screen screen = this.$noActiveScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.f26613a;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425m, 0);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425m, aVar);
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
            C1139j c1139j = C1139j.f2142a;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(screen.getPaths(), "support@revenuecat.com", null, customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), RelevantPurchasesListViewKt$NoActiveSubscriptionsViewNoDescription_Preview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$NoActiveSubscriptionsViewNoDescription_Preview$1$1$2.INSTANCE, null, AbstractC2279u.m(), interfaceC2425m, 819462576, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$NoActiveSubscriptionsViewNoDescription_Preview$2, reason: invalid class name */
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
            RelevantPurchasesListViewKt.NoActiveSubscriptionsViewNoDescription_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$NoActiveSubscriptionsViewPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43941 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $noActiveScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43941(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$noActiveScreen = screen;
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
                AbstractC2454w.U(329820115, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveSubscriptionsViewPreview.<anonymous> (RelevantPurchasesListView.kt:182)");
            }
            CustomerCenterConfigData.Screen screen = this.$noActiveScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.f26613a;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425m, 0);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425m, aVar);
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
            C1139j c1139j = C1139j.f2142a;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(screen.getPaths(), "support@revenuecat.com", null, customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), RelevantPurchasesListViewKt$NoActiveSubscriptionsViewPreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$NoActiveSubscriptionsViewPreview$1$1$2.INSTANCE, null, AbstractC2279u.m(), interfaceC2425m, 819462576, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$NoActiveSubscriptionsViewPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43952 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43952(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RelevantPurchasesListViewKt.NoActiveSubscriptionsViewPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$PurchaseListSection$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43962 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ Function1 $onPurchaseSelect;
        final /* synthetic */ Set<PurchaseInformation> $purchases;
        final /* synthetic */ int $totalPurchaseCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43962(Set<PurchaseInformation> set, CustomerCenterConfigData.Localization localization, int i10, Function1 function1, int i11) {
            super(2);
            this.$purchases = set;
            this.$localization = localization;
            this.$totalPurchaseCount = i10;
            this.$onPurchaseSelect = function1;
            this.$$changed = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RelevantPurchasesListViewKt.PurchaseListSection(this.$purchases, this.$localization, this.$totalPurchaseCount, this.$onPurchaseSelect, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListView$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43972 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ String $contactEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ Function1 $onPurchaseSelect;
        final /* synthetic */ List<PurchaseInformation> $purchases;
        final /* synthetic */ CustomerCenterConfigData.Support.SupportTickets $supportTickets;
        final /* synthetic */ List<CustomerCenterConfigData.HelpPath> $supportedPaths;
        final /* synthetic */ VirtualCurrencies $virtualCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43972(List<CustomerCenterConfigData.HelpPath> list, String str, VirtualCurrencies virtualCurrencies, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, CustomerCenterConfigData.Support.SupportTickets supportTickets, Function1 function1, Function1 function12, e eVar, List<PurchaseInformation> list2, int i10, int i11) {
            super(2);
            this.$supportedPaths = list;
            this.$contactEmail = str;
            this.$virtualCurrencies = virtualCurrencies;
            this.$appearance = appearance;
            this.$localization = localization;
            this.$supportTickets = supportTickets;
            this.$onPurchaseSelect = function1;
            this.$onAction = function12;
            this.$modifier = eVar;
            this.$purchases = list2;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RelevantPurchasesListViewKt.RelevantPurchasesListView(this.$supportedPaths, this.$contactEmail, this.$virtualCurrencies, this.$appearance, this.$localization, this.$supportTickets, this.$onPurchaseSelect, this.$onAction, this.$modifier, this.$purchases, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43981 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43981(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
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
                AbstractC2454w.U(-2112866129, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewPreview.<anonymous> (RelevantPurchasesListView.kt:160)");
            }
            e eVarF = s.f(e.f26613a, 0.0f, 1, null);
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF2 = androidx.compose.ui.c.f(interfaceC2425m, eVarF);
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
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF2, aVar.f());
            h hVar = h.f26161a;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(screen.getPaths(), "support@revenuecat.com", null, customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), RelevantPurchasesListViewKt$RelevantPurchasesListViewPreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewPreview$1$1$2.INSTANCE, null, AbstractC2279u.e(CustomerCenterConfigTestData.INSTANCE.getPurchaseInformationMonthlyRenewing()), interfaceC2425m, 14156208, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43992 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43992(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RelevantPurchasesListViewKt.RelevantPurchasesListViewPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewWithLifetimePurchasePreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44001 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44001(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
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
                AbstractC2454w.U(623687999, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithLifetimePurchasePreview.<anonymous> (RelevantPurchasesListView.kt:204)");
            }
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.f26613a;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425m, 0);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425m, aVar);
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
            C1139j c1139j = C1139j.f2142a;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(screen.getPaths(), "support@revenuecat.com", null, customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), RelevantPurchasesListViewKt$RelevantPurchasesListViewWithLifetimePurchasePreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithLifetimePurchasePreview$1$1$2.INSTANCE, null, AbstractC2279u.e(CustomerCenterConfigTestData.INSTANCE.getPurchaseInformationLifetime()), interfaceC2425m, 14156208, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewWithLifetimePurchasePreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44012 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44012(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RelevantPurchasesListViewKt.RelevantPurchasesListViewWithLifetimePurchasePreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44021 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44021(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
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
                AbstractC2454w.U(1494673350, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview.<anonymous> (RelevantPurchasesListView.kt:312)");
            }
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.f26613a;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425m, 0);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425m, aVar);
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
            C1139j c1139j = C1139j.f2142a;
            List<CustomerCenterConfigData.HelpPath> paths = screen.getPaths();
            CustomerCenterConfigData.Appearance appearance = customerCenterConfigData.getAppearance();
            CustomerCenterConfigData.Localization localization = customerCenterConfigData.getLocalization();
            CustomerCenterConfigData.Support.SupportTickets supportTickets = customerCenterConfigData.getSupport().getSupportTickets();
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(paths, "support@revenuecat.com", customerCenterConfigTestData.getFiveVirtualCurrencies(), appearance, localization, supportTickets, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview$1$1$2.INSTANCE, null, AbstractC2279u.p(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationLifetime()), interfaceC2425m, 14155824, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44032 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44032(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RelevantPurchasesListViewKt.RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44041 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44041(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
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
                AbstractC2454w.U(-2089866295, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesPreview.<anonymous> (RelevantPurchasesListView.kt:282)");
            }
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.f26613a;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425m, 0);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425m, aVar);
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
            C1139j c1139j = C1139j.f2142a;
            List<CustomerCenterConfigData.HelpPath> paths = screen.getPaths();
            CustomerCenterConfigData.Appearance appearance = customerCenterConfigData.getAppearance();
            CustomerCenterConfigData.Localization localization = customerCenterConfigData.getLocalization();
            CustomerCenterConfigData.Support.SupportTickets supportTickets = customerCenterConfigData.getSupport().getSupportTickets();
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(paths, "support@revenuecat.com", null, appearance, localization, supportTickets, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1$1$2.INSTANCE, null, AbstractC2279u.p(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationYearlyExpiring()), interfaceC2425m, 14156208, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44052 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44052(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RelevantPurchasesListViewKt.RelevantPurchasesListViewWithMultiplePurchasesPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44061 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44061(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
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
                AbstractC2454w.U(1430822974, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview.<anonymous> (RelevantPurchasesListView.kt:228)");
            }
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.f26613a;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425m, 0);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425m, aVar);
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
            C1139j c1139j = C1139j.f2142a;
            List<CustomerCenterConfigData.HelpPath> paths = screen.getPaths();
            CustomerCenterConfigData.Appearance appearance = customerCenterConfigData.getAppearance();
            CustomerCenterConfigData.Localization localization = customerCenterConfigData.getLocalization();
            CustomerCenterConfigData.Support.SupportTickets supportTickets = customerCenterConfigData.getSupport().getSupportTickets();
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(paths, "support@revenuecat.com", null, appearance, localization, supportTickets, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview$1$1$2.INSTANCE, null, AbstractC2279u.p(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationYearlyExpiring(), customerCenterConfigTestData.getPurchaseInformationLifetime()), interfaceC2425m, 14156208, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt$RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44072 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44072(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RelevantPurchasesListViewKt.RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NoActiveSubscriptionsViewNoDescription_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-611911312);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-611911312, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveSubscriptionsViewNoDescription_Preview (RelevantPurchasesListView.kt:250)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1539230767, true, new AnonymousClass1(CustomerCenterConfigData.Screen.copy$default(screen, null, null, null, null, null, 27, null), customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
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
    public static final void NoActiveSubscriptionsViewPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1881756972);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1881756972, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveSubscriptionsViewPreview (RelevantPurchasesListView.kt:178)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(329820115, true, new C43941(screen, customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43952(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PurchaseListSection(Set<PurchaseInformation> set, CustomerCenterConfigData.Localization localization, int i10, Function1 function1, InterfaceC2425m interfaceC2425m, int i11) {
        char c10;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1017442857);
        int i12 = (i11 & 6) == 0 ? (interfaceC2425mG.F(set) ? 4 : 2) | i11 : i11;
        CustomerCenterConfigData.Localization localization2 = localization;
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.F(localization2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC2425mG.c(i10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC2425mG.F(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1017442857, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseListSection (RelevantPurchasesListView.kt:118)");
            }
            if (!set.isEmpty()) {
                int i13 = 0;
                for (Object obj : set) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC2279u.w();
                    }
                    PurchaseInformation purchaseInformation = (PurchaseInformation) obj;
                    interfaceC2425mG.V(-980519695);
                    if (i13 > 0) {
                        K.a(s.r(e.f26613a, CustomerCenterConstants.Layout.INSTANCE.m656getITEMS_SPACINGD9Ej5fM()), interfaceC2425mG, 6);
                    }
                    interfaceC2425mG.O();
                    ButtonPosition buttonPosition = set.size() == 1 ? ButtonPosition.SINGLE : i13 == 0 ? ButtonPosition.FIRST : i13 == set.size() - 1 ? ButtonPosition.LAST : ButtonPosition.MIDDLE;
                    InterfaceC5082a interfaceC5082a = null;
                    e eVarK = p.k(s.h(e.f26613a, 0.0f, 1, null), CustomerCenterConstants.Layout.INSTANCE.m655getHORIZONTAL_PADDINGD9Ej5fM(), 0.0f, 2, null);
                    boolean z10 = i10 == 1;
                    interfaceC2425mG.V(-980493404);
                    if (i10 > 1) {
                        interfaceC2425mG.V(-917850771);
                        boolean zF = ((i12 & 7168) == 2048) | interfaceC2425mG.F(purchaseInformation);
                        Object objD = interfaceC2425mG.D();
                        if (zF || objD == InterfaceC2425m.f22370a.a()) {
                            objD = new RelevantPurchasesListViewKt$PurchaseListSection$1$1$1(function1, purchaseInformation);
                            interfaceC2425mG.u(objD);
                        }
                        interfaceC2425mG.O();
                        interfaceC5082a = (InterfaceC5082a) objD;
                        c10 = 2048;
                    } else {
                        c10 = 2048;
                    }
                    interfaceC2425mG.O();
                    PurchaseInformationCardViewKt.PurchaseInformationCardView(purchaseInformation, localization2, eVarK, buttonPosition, z10, interfaceC5082a, interfaceC2425mG, (i12 & 112) | 384, 0);
                    localization2 = localization;
                    i13 = i14;
                }
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43962(set, localization, i10, function1, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RelevantPurchasesListView(java.util.List<com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath> r42, java.lang.String r43, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies r44, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r45, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r46, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets r47, kotlin.jvm.functions.Function1 r48, kotlin.jvm.functions.Function1 r49, androidx.compose.ui.e r50, java.util.List<com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation> r51, Y.InterfaceC2425m r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt.RelevantPurchasesListView(java.util.List, java.lang.String, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.e, java.util.List, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RelevantPurchasesListViewPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-29475920);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-29475920, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewPreview (RelevantPurchasesListView.kt:156)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(-2112866129, true, new C43981(screen, customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43992(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RelevantPurchasesListViewWithLifetimePurchasePreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1781255744);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1781255744, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithLifetimePurchasePreview (RelevantPurchasesListView.kt:200)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(623687999, true, new C44001(screen, customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44012(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(531462629);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(531462629, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview (RelevantPurchasesListView.kt:308)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1494673350, true, new C44021(screen, customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44032(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RelevantPurchasesListViewWithMultiplePurchasesPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(666289000);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(666289000, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesPreview (RelevantPurchasesListView.kt:278)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(-2089866295, true, new C44041(screen, customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44052(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-577177921);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-577177921, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview (RelevantPurchasesListView.kt:224)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1430822974, true, new C44061(screen, customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44072(i10));
        }
    }
}
