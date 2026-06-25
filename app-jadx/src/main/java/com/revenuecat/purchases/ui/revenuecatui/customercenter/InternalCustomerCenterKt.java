package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import C.A;
import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import Td.z;
import U.AbstractC2167d;
import U.B;
import U.C2175l;
import U.D;
import U.K;
import U.Z;
import U.a0;
import U.j0;
import U.k0;
import U.l0;
import U.m0;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import Y.m2;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.InterfaceC2854h;
import androidx.lifecycle.Y;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigDataExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelFactory;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterErrorViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreenKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.icons.ArrowBackKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.CloseKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import g0.i;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import ie.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import l0.e;
import m2.AbstractC5628a;
import n2.AbstractC5719d;
import n2.C5717b;
import s0.C6385r0;
import v.InterfaceC6781b;
import w.AbstractC6892c;
import w.AbstractC6906j;
import x.AbstractC7015m;
import x0.C7032d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a=\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\t\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b\t\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aC\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b\"\u0010#\u001a+\u0010%\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020$2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b%\u0010&\u001a=\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b*\u0010+\u001a+\u0010,\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020$2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b,\u0010&\u001a7\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b1\u00102\u001a\u000f\u00103\u001a\u00020\u0007H\u0001¢\u0006\u0004\b3\u00104\u001a\u000f\u00105\u001a\u00020\u0007H\u0001¢\u0006\u0004\b5\u00104\u001a\u000f\u00106\u001a\u00020\u0007H\u0001¢\u0006\u0004\b6\u00104\u001a\u000f\u00107\u001a\u00020\u0007H\u0001¢\u0006\u0004\b7\u00104\u001a\u000f\u00108\u001a\u00020\u0007H\u0001¢\u0006\u0004\b8\u00104\"\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006A²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u0018\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r8\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020=8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "listener", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;", "viewModel", "Lkotlin/Function0;", "LTd/L;", "onDismiss", "InternalCustomerCenter", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;Lie/a;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;", "state", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "onAction", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V", "LU/l;", "createColorScheme", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;LY/m;I)LU/l;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/ScaffoldConfigData;", "createScaffoldState", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/ScaffoldConfigData;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterScaffoldConfig;", "scaffoldConfig", "mainContent", "CustomerCenterScaffold", "(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterScaffoldConfig;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V", "LU/m0;", "scrollBehavior", "CustomerCenterTopBar", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterScaffoldConfig;LU/m0;Lkotlin/jvm/functions/Function1;LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;", "navigationButtonType", "CustomerCenterNavigationIcon", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lkotlin/jvm/functions/Function1;LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;", "CustomerCenterLoaded", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lkotlin/jvm/functions/Function1;LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;", "currentDestination", "customerCenterState", "CustomerCenterNavHost", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LY/m;II)V", "MainScreenContent", "", "isDarkMode", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "getCustomerCenterViewModel", "(ZLcom/revenuecat/purchases/customercenter/CustomerCenterListener;Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;", "CustomerCenterNoActiveScreenPreview", "(LY/m;I)V", "CustomerCenterLoadingPreview", "CustomerCenterErrorPreview", "CustomerCenterLoadedPreview", "CustomerCenterMultiplePurchasesPreview", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "previewConfigData", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "latestOnAction", "", "latestMessage", "", "contentAlpha", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class InternalCustomerCenterKt {
    private static final CustomerCenterConfigData previewConfigData;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterErrorPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterErrorPreview$2 */
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
            InternalCustomerCenterKt.CustomerCenterErrorPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoaded$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterState.Success $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CustomerCenterState.Success success, Function1 function1, int i10) {
            super(2);
            this.$state = success;
            this.$onAction = function1;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.CustomerCenterLoaded(this.$state, this.$onAction, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoadedPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43112 extends AbstractC5506u implements Function1 {
        public static final C43112 INSTANCE = new C43112();

        C43112() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoadedPreview$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43123 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43123(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.CustomerCenterLoadedPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoadingPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43131 extends AbstractC5506u implements Function1 {
        public static final C43131 INSTANCE = new C43131();

        C43131() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoadingPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43142 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43142(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.CustomerCenterLoadingPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterMultiplePurchasesPreview$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43153 extends AbstractC5506u implements Function1 {
        public static final C43153 INSTANCE = new C43153();

        C43153() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterMultiplePurchasesPreview$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.CustomerCenterMultiplePurchasesPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterNavHost$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/b;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;", "destination", "LTd/L;", "invoke", "(Lv/b;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43162 extends AbstractC5506u implements p {
        final /* synthetic */ CustomerCenterState.Success $customerCenterState;
        final /* synthetic */ Function1 $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43162(CustomerCenterState.Success success, Function1 function1) {
            super(4);
            this.$customerCenterState = success;
            this.$onAction = function1;
        }

        @Override // ie.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((InterfaceC6781b) obj, (CustomerCenterDestination) obj2, (InterfaceC2425m) obj3, ((Number) obj4).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC6781b AnimatedContent, CustomerCenterDestination destination, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(AnimatedContent, "$this$AnimatedContent");
            AbstractC5504s.h(destination, "destination");
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1269377464, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNavHost.<anonymous> (InternalCustomerCenter.kt:483)");
            }
            if (destination instanceof CustomerCenterDestination.Main) {
                interfaceC2425m.V(1775650687);
                InternalCustomerCenterKt.MainScreenContent(this.$customerCenterState, this.$onAction, interfaceC2425m, 0);
                interfaceC2425m.O();
            } else if (destination instanceof CustomerCenterDestination.FeedbackSurvey) {
                interfaceC2425m.V(1775865145);
                FeedbackSurveyViewKt.FeedbackSurveyView(((CustomerCenterDestination.FeedbackSurvey) destination).getData(), interfaceC2425m, 0);
                interfaceC2425m.O();
            } else if (destination instanceof CustomerCenterDestination.PromotionalOffer) {
                interfaceC2425m.V(1776013542);
                PromotionalOfferData data = ((CustomerCenterDestination.PromotionalOffer) destination).getData();
                CustomerCenterConfigData.Appearance appearance = this.$customerCenterState.getCustomerCenterConfigData().getAppearance();
                CustomerCenterConfigData.Localization localization = this.$customerCenterState.getCustomerCenterConfigData().getLocalization();
                interfaceC2425m.V(750037078);
                boolean zU = interfaceC2425m.U(this.$onAction);
                Function1 function1 = this.$onAction;
                Object objD = interfaceC2425m.D();
                if (zU || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1(function1);
                    interfaceC2425m.u(objD);
                }
                Function1 function12 = (Function1) objD;
                interfaceC2425m.O();
                interfaceC2425m.V(750042794);
                boolean zU2 = interfaceC2425m.U(this.$onAction) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(destination)) || (i10 & 48) == 32);
                Function1 function13 = this.$onAction;
                Object objD2 = interfaceC2425m.D();
                if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                    objD2 = new InternalCustomerCenterKt$CustomerCenterNavHost$2$2$1(function13, destination);
                    interfaceC2425m.u(objD2);
                }
                interfaceC2425m.O();
                PromotionalOfferScreenKt.PromotionalOfferScreen(data, appearance, localization, function12, (InterfaceC5082a) objD2, null, interfaceC2425m, 0, 32);
                interfaceC2425m.O();
            } else if (destination instanceof CustomerCenterDestination.SelectedPurchaseDetail) {
                interfaceC2425m.V(1776733331);
                SelectedPurchaseDetailViewKt.SelectedPurchaseDetailView(this.$customerCenterState.getCustomerCenterConfigData().getSupport().getEmail(), this.$customerCenterState.getCustomerCenterConfigData().getLocalization(), ((CustomerCenterDestination.SelectedPurchaseDetail) destination).getPurchaseInformation(), this.$customerCenterState.getDetailScreenPaths(), null, this.$onAction, interfaceC2425m, 0, 16);
                interfaceC2425m.O();
            } else if (destination instanceof CustomerCenterDestination.VirtualCurrencyBalances) {
                interfaceC2425m.V(1777251093);
                VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreen(this.$customerCenterState.getCustomerCenterConfigData().getAppearance(), this.$customerCenterState.getCustomerCenterConfigData().getLocalization(), null, null, interfaceC2425m, 0, 12);
                interfaceC2425m.O();
            } else if (destination instanceof CustomerCenterDestination.CreateSupportTicket) {
                interfaceC2425m.V(1777576872);
                CreateSupportTicketViewKt.CreateSupportTicketView(((CustomerCenterDestination.CreateSupportTicket) destination).getData(), this.$customerCenterState.getCustomerCenterConfigData().getLocalization(), null, null, null, interfaceC2425m, 0, 28);
                interfaceC2425m.O();
            } else {
                interfaceC2425m.V(1777791485);
                interfaceC2425m.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterNavHost$6 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass6 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterDestination $currentDestination;
        final /* synthetic */ CustomerCenterState.Success $customerCenterState;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1 $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(CustomerCenterDestination customerCenterDestination, CustomerCenterState.Success success, Function1 function1, e eVar, int i10, int i11) {
            super(2);
            this.$currentDestination = customerCenterDestination;
            this.$customerCenterState = success;
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
            InternalCustomerCenterKt.CustomerCenterNavHost(this.$currentDestination, this.$customerCenterState, this.$onAction, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterNavigationIcon$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43172 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterState.NavigationButtonType $navigationButtonType;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterNavigationIcon$2$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CustomerCenterState.NavigationButtonType.values().length];
                try {
                    iArr[CustomerCenterState.NavigationButtonType.BACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CustomerCenterState.NavigationButtonType.CLOSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43172(CustomerCenterState.NavigationButtonType navigationButtonType) {
            super(2);
            this.$navigationButtonType = navigationButtonType;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            C7032d arrowBack;
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1324873520, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNavigationIcon.<anonymous> (InternalCustomerCenter.kt:396)");
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.$navigationButtonType.ordinal()];
            if (i11 == 1) {
                arrowBack = ArrowBackKt.getArrowBack();
            } else {
                if (i11 != 2) {
                    throw new r();
                }
                arrowBack = CloseKt.getClose();
            }
            B.b(arrowBack, null, null, 0L, interfaceC2425m, 48, 12);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterNavigationIcon$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43183 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterState.NavigationButtonType $navigationButtonType;
        final /* synthetic */ Function1 $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43183(CustomerCenterState.NavigationButtonType navigationButtonType, Function1 function1, int i10) {
            super(2);
            this.$navigationButtonType = navigationButtonType;
            this.$onAction = function1;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.CustomerCenterNavigationIcon(this.$navigationButtonType, this.$onAction, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterNoActiveScreenPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43191 extends AbstractC5506u implements Function1 {
        public static final C43191 INSTANCE = new C43191();

        C43191() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterNoActiveScreenPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43202 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43202(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.CustomerCenterNoActiveScreenPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterScaffold$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "LU/m0;", "it", "invoke", "(Landroidx/compose/ui/e;LU/m0;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43211 extends AbstractC5506u implements Function2 {
        public static final C43211 INSTANCE = new C43211();

        C43211() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(e applyIfNotNull, m0 it) {
            AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
            AbstractC5504s.h(it, "it");
            return androidx.compose.ui.input.nestedscroll.a.b(applyIfNotNull, it.a(), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterScaffold$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43222 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;
        final /* synthetic */ m0 $scrollBehavior;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43222(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, m0 m0Var, Function1 function1) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$scrollBehavior = m0Var;
            this.$onAction = function1;
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
                AbstractC2454w.U(422219848, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffold.<anonymous> (InternalCustomerCenter.kt:326)");
            }
            InternalCustomerCenterKt.CustomerCenterTopBar(this.$scaffoldConfig, this.$scrollBehavior, this.$onAction, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterScaffold$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC/A;", "paddingValues", "LTd/L;", "invoke", "(LC/A;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43233 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ Function2 $mainContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43233(Function2 function2) {
            super(3);
            this.$mainContent = function2;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((A) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(A paddingValues, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC2425m.U(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-50242659, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffold.<anonymous> (InternalCustomerCenter.kt:333)");
            }
            e eVarH = androidx.compose.foundation.layout.p.h(s.f(e.f26613a, 0.0f, 1, null), paddingValues);
            e.b bVarG = l0.e.f52304a.g();
            C1131b.m mVarH = C1131b.f2093a.h();
            Function2 function2 = this.$mainContent;
            I0.B bA = AbstractC1136g.a(mVarH, bVarG, interfaceC2425m, 54);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425m, eVarH);
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
            m2.e(interfaceC2425mB, bA, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            C1139j c1139j = C1139j.f2142a;
            function2.invoke(interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterScaffold$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43244 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $mainContent;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43244(Function1 function1, CustomerCenterScaffoldConfig customerCenterScaffoldConfig, androidx.compose.ui.e eVar, Function2 function2, int i10, int i11) {
            super(2);
            this.$onAction = function1;
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$modifier = eVar;
            this.$mainContent = function2;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.CustomerCenterScaffold(this.$onAction, this.$scaffoldConfig, this.$modifier, this.$mainContent, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterTopBar$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43251 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43251(CustomerCenterScaffoldConfig customerCenterScaffoldConfig) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
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
                AbstractC2454w.U(391648475, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar.<anonymous> (InternalCustomerCenter.kt:361)");
            }
            String title = this.$scaffoldConfig.getTitle();
            if (title != null) {
                j0.b(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterTopBar$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43262 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43262(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, Function1 function1) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$onAction = function1;
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
                AbstractC2454w.U(389814109, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar.<anonymous> (InternalCustomerCenter.kt:364)");
            }
            InternalCustomerCenterKt.CustomerCenterNavigationIcon(this.$scaffoldConfig.getNavigationButtonType(), this.$onAction, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterTopBar$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43273 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43273(CustomerCenterScaffoldConfig customerCenterScaffoldConfig) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
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
                AbstractC2454w.U(1110666087, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar.<anonymous> (InternalCustomerCenter.kt:375)");
            }
            String title = this.$scaffoldConfig.getTitle();
            if (title != null) {
                j0.b(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterTopBar$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43284 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43284(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, Function1 function1) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$onAction = function1;
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
                AbstractC2454w.U(237000485, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar.<anonymous> (InternalCustomerCenter.kt:378)");
            }
            InternalCustomerCenterKt.CustomerCenterNavigationIcon(this.$scaffoldConfig.getNavigationButtonType(), this.$onAction, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterTopBar$5 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;
        final /* synthetic */ m0 $scrollBehavior;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, m0 m0Var, Function1 function1, int i10) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$scrollBehavior = m0Var;
            this.$onAction = function1;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.CustomerCenterTopBar(this.$scaffoldConfig, this.$scrollBehavior, this.$onAction, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$10 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass10 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(CustomerCenterState customerCenterState, androidx.compose.ui.e eVar, Function1 function1, int i10, int i11) {
            super(2);
            this.$state = customerCenterState;
            this.$modifier = eVar;
            this.$onAction = function1;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.InternalCustomerCenter(this.$state, this.$modifier, this.$onAction, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$8 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass8 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterListener $listener;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ InterfaceC5082a $onDismiss;
        final /* synthetic */ CustomerCenterViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(androidx.compose.ui.e eVar, CustomerCenterListener customerCenterListener, CustomerCenterViewModel customerCenterViewModel, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.$modifier = eVar;
            this.$listener = customerCenterListener;
            this.$viewModel = customerCenterViewModel;
            this.$onDismiss = interfaceC5082a;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.InternalCustomerCenter(this.$modifier, this.$listener, this.$viewModel, this.$onDismiss, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$9 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass9 extends AbstractC5506u implements Function2 {
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ CustomerCenterState.NavigationButtonType $navigationButtonType;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ boolean $shouldUseLargeTopBar;
        final /* synthetic */ CustomerCenterState $state;
        final /* synthetic */ String $title;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$9$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
            final /* synthetic */ Function1 $onAction;
            final /* synthetic */ CustomerCenterState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CustomerCenterState customerCenterState, Function1 function1) {
                super(2);
                this.$state = customerCenterState;
                this.$onAction = function1;
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
                    AbstractC2454w.U(-98702717, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenter.<anonymous>.<anonymous> (InternalCustomerCenter.kt:227)");
                }
                CustomerCenterState customerCenterState = this.$state;
                if (customerCenterState instanceof CustomerCenterState.NotLoaded) {
                    interfaceC2425m.V(1633707983);
                    interfaceC2425m.O();
                } else if (customerCenterState instanceof CustomerCenterState.Loading) {
                    interfaceC2425m.V(1633779903);
                    CustomerCenterLoadingViewKt.CustomerCenterLoadingView(interfaceC2425m, 0);
                    interfaceC2425m.O();
                } else if (customerCenterState instanceof CustomerCenterState.Error) {
                    interfaceC2425m.V(1633896060);
                    CustomerCenterErrorViewKt.CustomerCenterErrorView((CustomerCenterState.Error) this.$state, interfaceC2425m, 0);
                    interfaceC2425m.O();
                } else if (customerCenterState instanceof CustomerCenterState.Success) {
                    interfaceC2425m.V(1634020091);
                    InternalCustomerCenterKt.CustomerCenterLoaded((CustomerCenterState.Success) this.$state, this.$onAction, interfaceC2425m, 0);
                    interfaceC2425m.O();
                } else {
                    interfaceC2425m.V(1634194466);
                    interfaceC2425m.O();
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(androidx.compose.ui.e eVar, String str, boolean z10, CustomerCenterState.NavigationButtonType navigationButtonType, Function1 function1, CustomerCenterState customerCenterState) {
            super(2);
            this.$modifier = eVar;
            this.$title = str;
            this.$shouldUseLargeTopBar = z10;
            this.$navigationButtonType = navigationButtonType;
            this.$onAction = function1;
            this.$state = customerCenterState;
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
                AbstractC2454w.U(252597340, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenter.<anonymous> (InternalCustomerCenter.kt:217)");
            }
            androidx.compose.ui.e eVarD = b.d(this.$modifier, D.f17597a.a(interfaceC2425m, D.f17598b).c(), null, 2, null);
            CustomerCenterScaffoldConfig customerCenterScaffoldConfig = new CustomerCenterScaffoldConfig(this.$title, this.$shouldUseLargeTopBar, this.$navigationButtonType);
            Function1 function1 = this.$onAction;
            InternalCustomerCenterKt.CustomerCenterScaffold(function1, customerCenterScaffoldConfig, eVarD, i.d(-98702717, true, new AnonymousClass1(this.$state, function1), interfaceC2425m, 54), interfaceC2425m, 3072, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$MainScreenContent$5 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43295 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterState.Success $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43295(CustomerCenterState.Success success, Function1 function1, int i10) {
            super(2);
            this.$state = success;
            this.$onAction = function1;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            InternalCustomerCenterKt.MainScreenContent(this.$state, this.$onAction, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    static {
        CustomerCenterConfigData.Screen.ScreenType screenType = CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT;
        Pair pairA = z.a(screenType, new CustomerCenterConfigData.Screen(screenType, "Manage Subscription", "Manage subscription subtitle", AbstractC2279u.e(new CustomerCenterConfigData.HelpPath("path-id-1", "Subscription", CustomerCenterConfigData.HelpPath.PathType.CANCEL, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 160, (DefaultConstructorMarker) null)), (CustomerCenterConfigData.ScreenOffering) null, 16, (DefaultConstructorMarker) null));
        CustomerCenterConfigData.Screen.ScreenType screenType2 = CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE;
        previewConfigData = new CustomerCenterConfigData(S.l(pairA, z.a(screenType2, new CustomerCenterConfigData.Screen(screenType2, "No subscriptions found", "We can try checking your account for any previous purchases", AbstractC2279u.e(new CustomerCenterConfigData.HelpPath("9q9719171o", "Check for previous purchases", CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (DefaultConstructorMarker) null)), (CustomerCenterConfigData.ScreenOffering) null, 16, (DefaultConstructorMarker) null))), new CustomerCenterConfigData.Appearance((CustomerCenterConfigData.Appearance.ColorInformation) null, (CustomerCenterConfigData.Appearance.ColorInformation) null, 3, (DefaultConstructorMarker) null), new CustomerCenterConfigData.Localization("en_US", S.l(z.a("cancel", "Cancel"), z.a("subscription", "Subscription"))), new CustomerCenterConfigData.Support("test@revenuecat.com", (Boolean) null, (Boolean) null, new CustomerCenterConfigData.Support.SupportTickets(false, (CustomerCenterConfigData.Support.SupportTickets.CustomerDetails) null, (CustomerCenterConfigData.Support.SupportTickets.CustomerType) null, 7, (DefaultConstructorMarker) null), 6, (DefaultConstructorMarker) null), (String) null, 16, (DefaultConstructorMarker) null);
    }

    public static final void CustomerCenterErrorPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-117134989);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-117134989, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterErrorPreview (InternalCustomerCenter.kt:690)");
            }
            InternalCustomerCenter(new CustomerCenterState.Error(new PurchasesError(PurchasesErrorCode.UnknownBackendError, null, 2, null)), androidx.compose.foundation.layout.p.i(s.f(androidx.compose.ui.e.f26613a, 0.0f, 1, null), C5015h.n(10)), AnonymousClass1.INSTANCE, interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }

    public static final void CustomerCenterLoaded(CustomerCenterState.Success success, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        a0 a0Var;
        CustomerCenterState.Success success2;
        e.a aVar;
        int i12;
        h hVar;
        Function1 function12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1615276070);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(success) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function1) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            success2 = success;
            function12 = function1;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1615276070, i13, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoaded (InternalCustomerCenter.kt:410)");
            }
            interfaceC2425mG.V(526827882);
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar2 = InterfaceC2425m.f22370a;
            if (objD == aVar2.a()) {
                objD = new a0();
                interfaceC2425mG.u(objD);
            }
            a0 a0Var2 = (a0) objD;
            interfaceC2425mG.O();
            h2 h2VarO = U1.o(function1, interfaceC2425mG, (i13 >> 3) & 14);
            h2 h2VarO2 = U1.o(success.getCustomerCenterConfigData().getLocalization().commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SENT), interfaceC2425mG, 0);
            Boolean boolValueOf = Boolean.valueOf(success.getShowSupportTicketSuccessSnackbar());
            interfaceC2425mG.V(526840544);
            boolean zF = interfaceC2425mG.F(success) | interfaceC2425mG.U(h2VarO2) | interfaceC2425mG.U(h2VarO);
            Object objD2 = interfaceC2425mG.D();
            if (zF || objD2 == aVar2.a()) {
                InternalCustomerCenterKt$CustomerCenterLoaded$1$1 internalCustomerCenterKt$CustomerCenterLoaded$1$1 = new InternalCustomerCenterKt$CustomerCenterLoaded$1$1(success, a0Var2, h2VarO2, h2VarO, null);
                a0Var = a0Var2;
                interfaceC2425mG.u(internalCustomerCenterKt$CustomerCenterLoaded$1$1);
                objD2 = internalCustomerCenterKt$CustomerCenterLoaded$1$1;
            } else {
                a0Var = a0Var2;
            }
            interfaceC2425mG.O();
            AbstractC2393b0.e(boolValueOf, (Function2) objD2, interfaceC2425mG, 0);
            h2 h2VarD = AbstractC6892c.d(success.isRefreshing() ? 0.5f : 1.0f, AbstractC6906j.j(300, 0, null, 6, null), 0.0f, "refreshAlpha", null, interfaceC2425mG, 3120, 20);
            e.a aVar3 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarF = s.f(aVar3, 0.0f, 1, null);
            e.a aVar4 = l0.e.f52304a;
            I0.B bH = f.h(aVar4.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarF);
            InterfaceC1788g.a aVar5 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar5.a();
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
            m2.e(interfaceC2425mB, bH, aVar5.e());
            m2.e(interfaceC2425mB, iR, aVar5.g());
            Function2 function2B = aVar5.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF2, aVar5.f());
            h hVar2 = h.f26161a;
            androidx.compose.ui.e eVarF3 = s.f(aVar3, 0.0f, 1, null);
            interfaceC2425mG.V(-244583743);
            boolean zU = interfaceC2425mG.U(h2VarD);
            Object objD3 = interfaceC2425mG.D();
            if (zU || objD3 == aVar2.a()) {
                objD3 = new InternalCustomerCenterKt$CustomerCenterLoaded$2$1$1(h2VarD);
                interfaceC2425mG.u(objD3);
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.f.a(eVarF3, (Function1) objD3);
            I0.B bH2 = f.h(aVar4.o(), false);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF4 = c.f(interfaceC2425mG, eVarA);
            InterfaceC5082a interfaceC5082aA2 = aVar5.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA2);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB2, bH2, aVar5.e());
            m2.e(interfaceC2425mB2, iR2, aVar5.g());
            Function2 function2B2 = aVar5.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF4, aVar5.f());
            CustomerCenterNavHost(success.getCurrentDestination(), success, function1, null, interfaceC2425mG, (i13 << 3) & 1008, 8);
            success2 = success;
            interfaceC2425mG.x();
            interfaceC2425mG.V(-244573442);
            if (success2.isRefreshing()) {
                i12 = 16;
                hVar = hVar2;
                aVar = aVar3;
                K.a(hVar2.b(aVar3, aVar4.e()), 0L, 0.0f, 0L, 0, interfaceC2425mG, 0, 30);
                interfaceC2425mG = interfaceC2425mG;
            } else {
                aVar = aVar3;
                i12 = 16;
                hVar = hVar2;
            }
            interfaceC2425mG.O();
            function12 = function1;
            Z.b(a0Var, androidx.compose.foundation.layout.p.i(hVar.b(aVar, aVar4.b()), C5015h.n(i12)), null, interfaceC2425mG, 6, 4);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(success2, function12, i10));
        }
    }

    public static final Function1 CustomerCenterLoaded$lambda$13(h2 h2Var) {
        return (Function1) h2Var.getValue();
    }

    public static final String CustomerCenterLoaded$lambda$14(h2 h2Var) {
        return (String) h2Var.getValue();
    }

    public static final float CustomerCenterLoaded$lambda$16(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    public static final void CustomerCenterLoadedPreview(InterfaceC2425m interfaceC2425m, int i10) {
        List<CustomerCenterConfigData.HelpPath> listM;
        List listM2;
        List<CustomerCenterConfigData.HelpPath> paths;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(899134290);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(899134290, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoadedPreview (InternalCustomerCenter.kt:702)");
            }
            CustomerCenterConfigData customerCenterConfigData = previewConfigData;
            List listE = AbstractC2279u.e(CustomerCenterConfigTestData.INSTANCE.getPurchaseInformationMonthlyRenewing());
            CustomerCenterConfigData.Screen managementScreen = customerCenterConfigData.getManagementScreen();
            if (managementScreen == null || (listM = managementScreen.getPaths()) == null) {
                listM = AbstractC2279u.m();
            }
            List<CustomerCenterConfigData.HelpPath> list = listM;
            CustomerCenterConfigData.Screen managementScreen2 = customerCenterConfigData.getManagementScreen();
            if (managementScreen2 == null || (paths = managementScreen2.getPaths()) == null) {
                listM2 = AbstractC2279u.m();
            } else {
                listM2 = new ArrayList();
                for (Object obj : paths) {
                    if (((CustomerCenterConfigData.HelpPath) obj).getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL) {
                        listM2.add(obj);
                    }
                }
            }
            InternalCustomerCenter(new CustomerCenterState.Success(customerCenterConfigData, listE, list, listM2, null, null, null, null, null, false, false, 2032, null), androidx.compose.foundation.layout.p.i(s.f(androidx.compose.ui.e.f26613a, 0.0f, 1, null), C5015h.n(10)), C43112.INSTANCE, interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43123(i10));
        }
    }

    public static final void CustomerCenterLoadingPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(626880743);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(626880743, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoadingPreview (InternalCustomerCenter.kt:678)");
            }
            InternalCustomerCenter(CustomerCenterState.Loading.INSTANCE, androidx.compose.foundation.layout.p.i(s.f(androidx.compose.ui.e.f26613a, 0.0f, 1, null), C5015h.n(10)), C43131.INSTANCE, interfaceC2425mG, 438, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43142(i10));
        }
    }

    public static final void CustomerCenterMultiplePurchasesPreview(InterfaceC2425m interfaceC2425m, int i10) {
        List listM;
        List listM2;
        List<CustomerCenterConfigData.HelpPath> paths;
        List<CustomerCenterConfigData.HelpPath> paths2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(348505677);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(348505677, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterMultiplePurchasesPreview (InternalCustomerCenter.kt:721)");
            }
            CustomerCenterConfigData customerCenterConfigData = previewConfigData;
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            List listP = AbstractC2279u.p(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationYearlyExpiring());
            CustomerCenterConfigData.Screen managementScreen = customerCenterConfigData.getManagementScreen();
            if (managementScreen == null || (paths2 = managementScreen.getPaths()) == null) {
                listM = AbstractC2279u.m();
            } else {
                listM = new ArrayList();
                for (Object obj : paths2) {
                    CustomerCenterConfigData.HelpPath helpPath = (CustomerCenterConfigData.HelpPath) obj;
                    if (helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE || helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.CUSTOM_URL) {
                        listM.add(obj);
                    }
                }
            }
            List list = listM;
            CustomerCenterConfigData.Screen managementScreen2 = previewConfigData.getManagementScreen();
            if (managementScreen2 == null || (paths = managementScreen2.getPaths()) == null) {
                listM2 = AbstractC2279u.m();
            } else {
                listM2 = new ArrayList();
                for (Object obj2 : paths) {
                    if (((CustomerCenterConfigData.HelpPath) obj2).getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL) {
                        listM2.add(obj2);
                    }
                }
            }
            InternalCustomerCenter(new CustomerCenterState.Success(customerCenterConfigData, listP, list, listM2, null, null, null, null, null, false, false, 2032, null), androidx.compose.foundation.layout.p.i(s.f(androidx.compose.ui.e.f26613a, 0.0f, 1, null), C5015h.n(10)), C43153.INSTANCE, interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass4(i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CustomerCenterNavHost(com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination r17, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success r18, kotlin.jvm.functions.Function1 r19, androidx.compose.ui.e r20, Y.InterfaceC2425m r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt.CustomerCenterNavHost(com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState$Success, kotlin.jvm.functions.Function1, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final void CustomerCenterNavigationIcon(CustomerCenterState.NavigationButtonType navigationButtonType, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-501948109);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(navigationButtonType) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function1) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-501948109, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNavigationIcon (InternalCustomerCenter.kt:392)");
            }
            interfaceC2425mG.V(1087660344);
            boolean z10 = (i11 & 112) == 32;
            Object objD = interfaceC2425mG.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                objD = new InternalCustomerCenterKt$CustomerCenterNavigationIcon$1$1(function1);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            U.A.a((InterfaceC5082a) objD, null, false, null, null, i.d(-1324873520, true, new C43172(navigationButtonType), interfaceC2425mG, 54), interfaceC2425mG, 196608, 30);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43183(navigationButtonType, function1, i10));
        }
    }

    public static final void CustomerCenterNoActiveScreenPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(595047360);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(595047360, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNoActiveScreenPreview (InternalCustomerCenter.kt:661)");
            }
            InternalCustomerCenter(new CustomerCenterState.Success(previewConfigData, AbstractC2279u.m(), AbstractC2279u.m(), AbstractC2279u.m(), null, null, null, null, null, false, false, 2032, null), androidx.compose.foundation.layout.p.i(s.f(androidx.compose.ui.e.f26613a, 0.0f, 1, null), C5015h.n(10)), C43191.INSTANCE, interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43202(i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CustomerCenterScaffold(kotlin.jvm.functions.Function1 r22, com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffoldConfig r23, androidx.compose.ui.e r24, kotlin.jvm.functions.Function2 r25, Y.InterfaceC2425m r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt.CustomerCenterScaffold(kotlin.jvm.functions.Function1, com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffoldConfig, androidx.compose.ui.e, kotlin.jvm.functions.Function2, Y.m, int, int):void");
    }

    public static final void CustomerCenterTopBar(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, m0 m0Var, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        m0 m0Var2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(317175815);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(customerCenterScaffoldConfig) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(m0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            m0Var2 = m0Var;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(317175815, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar (InternalCustomerCenter.kt:351)");
            }
            l0 l0Var = l0.f18560a;
            D d10 = D.f17597a;
            int i12 = D.f17598b;
            k0 k0VarJ = l0Var.j(d10.a(interfaceC2425mG, i12).c(), d10.a(interfaceC2425mG, i12).c(), d10.a(interfaceC2425mG, i12).p(), d10.a(interfaceC2425mG, i12).p(), 0L, interfaceC2425mG, l0.f18566g << 15, 16);
            if (customerCenterScaffoldConfig.getShouldUseLargeTopBar()) {
                interfaceC2425mG.V(1321464226);
                AbstractC2167d.a(i.d(391648475, true, new C43251(customerCenterScaffoldConfig), interfaceC2425mG, 54), null, i.d(389814109, true, new C43262(customerCenterScaffoldConfig, function1), interfaceC2425mG, 54), null, 0.0f, 0.0f, null, k0VarJ, m0Var, interfaceC2425mG, ((i11 << 21) & 234881024) | 390, 122);
                m0Var2 = m0Var;
                interfaceC2425mG.O();
            } else {
                m0Var2 = m0Var;
                interfaceC2425mG.V(1321910068);
                AbstractC2167d.e(i.d(1110666087, true, new C43273(customerCenterScaffoldConfig), interfaceC2425mG, 54), null, i.d(237000485, true, new C43284(customerCenterScaffoldConfig, function1), interfaceC2425mG, 54), null, 0.0f, null, k0VarJ, null, interfaceC2425mG, 390, 186);
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass5(customerCenterScaffoldConfig, m0Var2, function1, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:379:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void InternalCustomerCenter(androidx.compose.ui.e r19, com.revenuecat.purchases.customercenter.CustomerCenterListener r20, com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel r21, ie.InterfaceC5082a r22, Y.InterfaceC2425m r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt.InternalCustomerCenter(androidx.compose.ui.e, com.revenuecat.purchases.customercenter.CustomerCenterListener, com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel, ie.a, Y.m, int, int):void");
    }

    public static final CustomerCenterState InternalCustomerCenter$lambda$1(h2 h2Var) {
        return (CustomerCenterState) h2Var.getValue();
    }

    public static final void MainScreenContent(CustomerCenterState.Success success, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        Function1 function12 = function1;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-622947142);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(success) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function12) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-622947142, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.MainScreenContent (InternalCustomerCenter.kt:555)");
            }
            CustomerCenterConfigData customerCenterConfigData = success.getCustomerCenterConfigData();
            if (success.getPurchases().isEmpty()) {
                interfaceC2425m2 = interfaceC2425mG;
                interfaceC2425m2.V(388207578);
                CustomerCenterConfigData.Screen noActiveScreen = customerCenterConfigData.getNoActiveScreen();
                if (noActiveScreen == null) {
                    function12 = function1;
                } else {
                    function12 = function1;
                    NoActiveUserManagementViewKt.NoActiveUserManagementView(noActiveScreen, customerCenterConfigData.getSupport().getEmail(), customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), success.getNoActiveScreenOffering(), success.getVirtualCurrencies(), function12, interfaceC2425m2, (i11 << 18) & 29360128, 0);
                    interfaceC2425m2 = interfaceC2425m2;
                    L l10 = L.f17438a;
                }
                interfaceC2425m2.O();
            } else {
                interfaceC2425mG.V(387234953);
                if (customerCenterConfigData.getManagementScreen() == null) {
                    interfaceC2425m2 = interfaceC2425mG;
                } else {
                    List mainScreenPaths = success.getMainScreenPaths();
                    String email = customerCenterConfigData.getSupport().getEmail();
                    VirtualCurrencies virtualCurrencies = success.getVirtualCurrencies();
                    CustomerCenterConfigData.Appearance appearance = customerCenterConfigData.getAppearance();
                    CustomerCenterConfigData.Localization localization = customerCenterConfigData.getLocalization();
                    CustomerCenterConfigData.Support.SupportTickets supportTickets = customerCenterConfigData.getSupport().getSupportTickets();
                    interfaceC2425mG.V(684114534);
                    boolean zF = ((i11 & 112) == 32) | interfaceC2425mG.F(success);
                    Object objD = interfaceC2425mG.D();
                    if (zF || objD == InterfaceC2425m.f22370a.a()) {
                        objD = new InternalCustomerCenterKt$MainScreenContent$1$1$1(success, function12);
                        interfaceC2425mG.u(objD);
                    }
                    interfaceC2425mG.O();
                    interfaceC2425m2 = interfaceC2425mG;
                    RelevantPurchasesListViewKt.RelevantPurchasesListView(mainScreenPaths, email, virtualCurrencies, appearance, localization, supportTickets, (Function1) objD, function12, null, success.getPurchases(), interfaceC2425m2, (i11 << 18) & 29360128, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                    L l11 = L.f17438a;
                }
                interfaceC2425m2.O();
                function12 = function1;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C43295(success, function12, i10));
        }
    }

    private static final C2175l createColorScheme(CustomerCenterState customerCenterState, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(352157510);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(352157510, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.createColorScheme (InternalCustomerCenter.kt:251)");
        }
        boolean zA = AbstractC7015m.a(interfaceC2425m, 0);
        C2175l c2175lA = D.f17597a.a(interfaceC2425m, D.f17598b);
        interfaceC2425m.V(636383891);
        boolean zA2 = interfaceC2425m.a(zA) | ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(customerCenterState)) || (i10 & 6) == 4) | interfaceC2425m.U(c2175lA);
        Object objD = interfaceC2425m.D();
        if (zA2 || objD == InterfaceC2425m.f22370a.a()) {
            if (customerCenterState instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success = (CustomerCenterState.Success) customerCenterState;
                CustomerCenterConfigData.Appearance appearance = success.getCustomerCenterConfigData().getAppearance();
                C6385r0 colorForTheme = CustomerCenterConfigDataExtensionsKt.getColorForTheme(appearance, zA, InternalCustomerCenterKt$createColorScheme$1$accentColor$1.INSTANCE);
                C6385r0 colorForTheme2 = success.getCurrentDestination() instanceof CustomerCenterDestination.PromotionalOffer ? CustomerCenterConfigDataExtensionsKt.getColorForTheme(appearance, zA, InternalCustomerCenterKt$createColorScheme$1$backgroundColor$1.INSTANCE) : null;
                c2175lA = C2175l.b(c2175lA, colorForTheme != null ? colorForTheme.A() : c2175lA.C(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, colorForTheme2 != null ? colorForTheme2.A() : c2175lA.c(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -8194, 15, null);
            }
            interfaceC2425m.u(c2175lA);
            objD = c2175lA;
        }
        C2175l c2175l = (C2175l) objD;
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return c2175l;
    }

    private static final ScaffoldConfigData createScaffoldState(CustomerCenterState customerCenterState, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(953700373);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(953700373, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.createScaffoldState (InternalCustomerCenter.kt:284)");
        }
        interfaceC2425m.V(2044243650);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(customerCenterState)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            if (customerCenterState instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success = (CustomerCenterState.Success) customerCenterState;
                String title = success.getNavigationState().getCurrentDestination().getTitle();
                objD = new ScaffoldConfigData(title, customerCenterState.getNavigationButtonType(), (success.getCurrentDestination() instanceof CustomerCenterDestination.Main) && title != null);
            } else {
                objD = new ScaffoldConfigData(null, CustomerCenterState.NavigationButtonType.CLOSE, false);
            }
            interfaceC2425m.u(objD);
        }
        ScaffoldConfigData scaffoldConfigData = (ScaffoldConfigData) objD;
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return scaffoldConfigData;
    }

    private static final CustomerCenterViewModel getCustomerCenterViewModel(boolean z10, CustomerCenterListener customerCenterListener, PurchasesType purchasesType, CustomerCenterViewModel customerCenterViewModel, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        InterfaceC2425m interfaceC2425m2;
        interfaceC2425m.V(1278114306);
        if ((i11 & 2) != 0) {
            customerCenterListener = null;
        }
        if ((i11 & 4) != 0) {
            purchasesType = new PurchasesImpl(null, 1, null);
        }
        if ((i11 & 8) != 0) {
            CustomerCenterViewModelFactory customerCenterViewModelFactory = new CustomerCenterViewModelFactory(purchasesType, D.f17597a.a(interfaceC2425m, D.f17598b), z10, customerCenterListener);
            interfaceC2425m.C(1729797275);
            Y yC = C5717b.f53840a.c(interfaceC2425m, 6);
            if (yC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            interfaceC2425m2 = interfaceC2425m;
            Object objB = AbstractC5719d.b(O.b(CustomerCenterViewModelImpl.class), yC, null, customerCenterViewModelFactory, yC instanceof InterfaceC2854h ? ((InterfaceC2854h) yC).getDefaultViewModelCreationExtras() : AbstractC5628a.b.f53049c, interfaceC2425m2, 0, 0);
            interfaceC2425m2.T();
            customerCenterViewModel = (CustomerCenterViewModel) objB;
        } else {
            interfaceC2425m2 = interfaceC2425m;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1278114306, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.getCustomerCenterViewModel (InternalCustomerCenter.kt:611)");
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m2.O();
        return customerCenterViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void InternalCustomerCenter(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState r15, androidx.compose.ui.e r16, kotlin.jvm.functions.Function1 r17, Y.InterfaceC2425m r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt.InternalCustomerCenter(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState, androidx.compose.ui.e, kotlin.jvm.functions.Function1, Y.m, int, int):void");
    }
}
