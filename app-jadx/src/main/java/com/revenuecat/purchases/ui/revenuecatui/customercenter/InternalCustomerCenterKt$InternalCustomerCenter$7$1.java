package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import android.app.Activity;
import android.content.Context;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ContextExtensionsKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "action", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class InternalCustomerCenterKt$InternalCustomerCenter$7$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Context $context;
    final /* synthetic */ O $coroutineScope;
    final /* synthetic */ InterfaceC5082a $onDismiss;
    final /* synthetic */ CustomerCenterViewModel $viewModel;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$1", f = "InternalCustomerCenter.kt", l = {167}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ CustomerCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CustomerCenterViewModel customerCenterViewModel, e eVar) {
            super(2, eVar);
            this.$viewModel = customerCenterViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass1(this.$viewModel, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass1) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
                this.label = 1;
                if (customerCenterViewModel.restorePurchases(this) == objF) {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$2", f = "InternalCustomerCenter.kt", l = {173}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ CustomerCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CustomerCenterViewModel customerCenterViewModel, e eVar) {
            super(2, eVar);
            this.$viewModel = customerCenterViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass2(this.$viewModel, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass2) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
                this.label = 1;
                if (customerCenterViewModel.dismissRestoreDialog(this) == objF) {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$3", f = "InternalCustomerCenter.kt", l = {188}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends l implements Function2 {
        final /* synthetic */ CustomerCenterAction $action;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ CustomerCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CustomerCenterViewModel customerCenterViewModel, CustomerCenterAction customerCenterAction, Activity activity, e eVar) {
            super(2, eVar);
            this.$viewModel = customerCenterViewModel;
            this.$action = customerCenterAction;
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass3(this.$viewModel, this.$action, this.$activity, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass3) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
                SubscriptionOption subscriptionOption = ((CustomerCenterAction.PurchasePromotionalOffer) this.$action).getSubscriptionOption();
                Activity activity = this.$activity;
                this.label = 1;
                if (customerCenterViewModel.onAcceptedPromotionalOffer(subscriptionOption, activity, this) == objF) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalCustomerCenterKt$InternalCustomerCenter$7$1(CustomerCenterViewModel customerCenterViewModel, Context context, O o10, InterfaceC5082a interfaceC5082a) {
        super(1);
        this.$viewModel = customerCenterViewModel;
        this.$context = context;
        this.$coroutineScope = o10;
        this.$onDismiss = interfaceC5082a;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerCenterAction) obj);
        return L.f17438a;
    }

    public final void invoke(CustomerCenterAction action) {
        AbstractC5504s.h(action, "action");
        if (action instanceof CustomerCenterAction.PathButtonPressed) {
            CustomerCenterAction.PathButtonPressed pathButtonPressed = (CustomerCenterAction.PathButtonPressed) action;
            this.$viewModel.pathButtonPressed(this.$context, pathButtonPressed.getPath(), pathButtonPressed.getPurchaseInformation());
            return;
        }
        if (action instanceof CustomerCenterAction.PerformRestore) {
            AbstractC1617k.d(this.$coroutineScope, null, null, new AnonymousClass1(this.$viewModel, null), 3, null);
            return;
        }
        if (action instanceof CustomerCenterAction.DismissRestoreDialog) {
            AbstractC1617k.d(this.$coroutineScope, null, null, new AnonymousClass2(this.$viewModel, null), 3, null);
            return;
        }
        if (action instanceof CustomerCenterAction.ContactSupport) {
            this.$viewModel.contactSupport(this.$context, ((CustomerCenterAction.ContactSupport) action).getEmail());
            return;
        }
        if (action instanceof CustomerCenterAction.OpenURL) {
            CustomerCenterViewModel.DefaultImpls.openURL$default(this.$viewModel, this.$context, ((CustomerCenterAction.OpenURL) action).getUrl(), null, 4, null);
            return;
        }
        if (action instanceof CustomerCenterAction.NavigationButtonPressed) {
            this.$viewModel.onNavigationButtonPressed(this.$context, this.$onDismiss);
            return;
        }
        if (action instanceof CustomerCenterAction.DismissPromotionalOffer) {
            this.$viewModel.dismissPromotionalOffer(this.$context, ((CustomerCenterAction.DismissPromotionalOffer) action).getOriginalPath());
            return;
        }
        if (action instanceof CustomerCenterAction.PurchasePromotionalOffer) {
            AbstractC1617k.d(this.$coroutineScope, null, null, new AnonymousClass3(this.$viewModel, action, ContextExtensionsKt.getActivity(this.$context), null), 3, null);
            return;
        }
        if (action instanceof CustomerCenterAction.CustomActionSelected) {
            this.$viewModel.onCustomActionSelected(((CustomerCenterAction.CustomActionSelected) action).getCustomActionData());
            return;
        }
        if (action instanceof CustomerCenterAction.SelectPurchase) {
            this.$viewModel.selectPurchase(((CustomerCenterAction.SelectPurchase) action).getPurchase());
            return;
        }
        if (action instanceof CustomerCenterAction.ShowPaywall) {
            this.$viewModel.showPaywall(this.$context);
            return;
        }
        if (action instanceof CustomerCenterAction.ShowVirtualCurrencyBalances) {
            this.$viewModel.showVirtualCurrencyBalances();
        } else if (action instanceof CustomerCenterAction.ShowSupportTicketCreation) {
            this.$viewModel.showCreateSupportTicket();
        } else if (action instanceof CustomerCenterAction.DismissSupportTicketSuccessSnackbar) {
            this.$viewModel.dismissSupportTicketSuccessSnackbar();
        }
    }
}
