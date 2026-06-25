package com.revenuecat.purchases.ui.revenuecatui.views;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.Context;
import android.util.AttributeSet;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import com.revenuecat.purchases.customercenter.Resumable;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import g0.i;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u001e\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u000eB/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;", "Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "LTd/L;", "dismissHandler", "(Landroid/content/Context;Lie/a;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "customerCenterListener", "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Lie/a;)V", "init", "()V", "dismiss", "setDismissHandler", "(Lie/a;)V", "setCustomerCenterListener", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V", "onBackPressed", "Content", "(LY/m;I)V", "Lie/a;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "com/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView$internalListener$1", "internalListener", "Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView$internalListener$1;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;", "customerCenterOptions", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterOptions;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterView extends CompatComposeView {
    public static final int $stable = 8;
    private CustomerCenterListener customerCenterListener;
    private final CustomerCenterOptions customerCenterOptions;
    private InterfaceC5082a dismissHandler;
    private final CustomerCenterView$internalListener$1 internalListener;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$Content$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        AnonymousClass1() {
            super(2);
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
                AbstractC2454w.U(1061986288, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView.Content.<anonymous> (CustomerCenterView.kt:132)");
            }
            CustomerCenterOptions customerCenterOptions = CustomerCenterView.this.customerCenterOptions;
            interfaceC2425m.V(573881428);
            boolean zF = interfaceC2425m.F(CustomerCenterView.this);
            CustomerCenterView customerCenterView = CustomerCenterView.this;
            Object objD = interfaceC2425m.D();
            if (zF || objD == InterfaceC2425m.f22370a.a()) {
                objD = new CustomerCenterView$Content$1$1$1(customerCenterView);
                interfaceC2425m.u(objD);
            }
            interfaceC2425m.O();
            CustomerCenterKt.CustomerCenter(null, customerCenterOptions, (InterfaceC5082a) objD, interfaceC2425m, 0, 1);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context) {
        this(context, null, null, 6, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss() {
        InterfaceC5082a interfaceC5082a = this.dismissHandler;
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
        destroy();
    }

    private final void init() {
        Logger.INSTANCE.d("Initialized CustomerCenterView");
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void Content(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(1372663828);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1372663828, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView.Content (CustomerCenterView.kt:130)");
        }
        RevenueCatThemeKt.RevenueCatTheme(i.d(1061986288, true, new AnonymousClass1(), interfaceC2425m, 54), interfaceC2425m, 6);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.views.CompatComposeView
    public void onBackPressed() {
        L l10;
        if (this.dismissHandler != null) {
            dismiss();
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            super.onBackPressed();
        }
    }

    public final void setCustomerCenterListener(CustomerCenterListener customerCenterListener) {
        this.customerCenterListener = customerCenterListener;
    }

    public final void setDismissHandler(InterfaceC5082a dismissHandler) {
        this.dismissHandler = dismissHandler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, CustomerCenterListener customerCenterListener) {
        this(context, customerCenterListener, null, 4, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.revenuecat.purchases.customercenter.CustomerCenterListener, com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1] */
    public CustomerCenterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        AbstractC5504s.h(context, "context");
        ?? r82 = new CustomerCenterListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1
            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onCustomActionSelected(String actionIdentifier, String purchaseIdentifier) {
                AbstractC5504s.h(actionIdentifier, "actionIdentifier");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onCustomActionSelected(actionIdentifier, purchaseIdentifier);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
                AbstractC5504s.h(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onManagementOptionSelected(CustomerCenterManagementOption action) {
                AbstractC5504s.h(action, "action");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onManagementOptionSelected(action);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(transaction, "transaction");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onPromotionalOfferSucceeded(customerInfo, transaction);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreFailed(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreFailed(error);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreInitiated(Resumable resume) {
                L l10;
                AbstractC5504s.h(resume, "resume");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreInitiated(resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreStarted() {
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreStarted();
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onShowingManageSubscriptions() {
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onShowingManageSubscriptions();
                }
            }
        };
        this.internalListener = r82;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(r82).build();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.revenuecat.purchases.customercenter.CustomerCenterListener, com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1] */
    public CustomerCenterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5504s.h(context, "context");
        ?? r22 = new CustomerCenterListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1
            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onCustomActionSelected(String actionIdentifier, String purchaseIdentifier) {
                AbstractC5504s.h(actionIdentifier, "actionIdentifier");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onCustomActionSelected(actionIdentifier, purchaseIdentifier);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
                AbstractC5504s.h(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onManagementOptionSelected(CustomerCenterManagementOption action) {
                AbstractC5504s.h(action, "action");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onManagementOptionSelected(action);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(transaction, "transaction");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onPromotionalOfferSucceeded(customerInfo, transaction);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreFailed(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreFailed(error);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreInitiated(Resumable resume) {
                L l10;
                AbstractC5504s.h(resume, "resume");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreInitiated(resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreStarted() {
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreStarted();
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onShowingManageSubscriptions() {
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onShowingManageSubscriptions();
                }
            }
        };
        this.internalListener = r22;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(r22).build();
        init();
    }

    public /* synthetic */ CustomerCenterView(Context context, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : interfaceC5082a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, InterfaceC5082a interfaceC5082a) {
        this(context, (CustomerCenterListener) null, interfaceC5082a);
        AbstractC5504s.h(context, "context");
    }

    public /* synthetic */ CustomerCenterView(Context context, CustomerCenterListener customerCenterListener, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : customerCenterListener, (i10 & 4) != 0 ? null : interfaceC5082a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.revenuecat.purchases.customercenter.CustomerCenterListener, com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1] */
    public CustomerCenterView(Context context, CustomerCenterListener customerCenterListener, InterfaceC5082a interfaceC5082a) {
        super(context, null, 0, 6, null);
        AbstractC5504s.h(context, "context");
        ?? r82 = new CustomerCenterListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1
            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onCustomActionSelected(String actionIdentifier, String purchaseIdentifier) {
                AbstractC5504s.h(actionIdentifier, "actionIdentifier");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onCustomActionSelected(actionIdentifier, purchaseIdentifier);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
                AbstractC5504s.h(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onManagementOptionSelected(CustomerCenterManagementOption action) {
                AbstractC5504s.h(action, "action");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onManagementOptionSelected(action);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(transaction, "transaction");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onPromotionalOfferSucceeded(customerInfo, transaction);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreFailed(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onRestoreFailed(error);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreInitiated(Resumable resume) {
                L l10;
                AbstractC5504s.h(resume, "resume");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onRestoreInitiated(resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreStarted() {
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onRestoreStarted();
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onShowingManageSubscriptions() {
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onShowingManageSubscriptions();
                }
            }
        };
        this.internalListener = r82;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(r82).build();
        this.customerCenterListener = customerCenterListener;
        this.dismissHandler = interfaceC5082a;
        init();
    }
}
