package com.revenuecat.purchases;

import Td.L;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.LogInCallback;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$logIn$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06611 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ boolean $created;
            final /* synthetic */ CustomerInfo $customerInfo;
            final /* synthetic */ PurchasesOrchestrator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06611(LogInCallback logInCallback, CustomerInfo customerInfo, boolean z10, PurchasesOrchestrator purchasesOrchestrator) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
                this.$created = z10;
                this.this$0 = purchasesOrchestrator;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m157invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m157invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, this.$created);
                }
                this.this$0.customerInfoUpdateHandler.notifyListeners(this.$customerInfo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
            super(2);
            this.this$0 = purchasesOrchestrator;
            this.$newAppUserID = str;
            this.$callback = logInCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo, boolean z10) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            purchasesOrchestrator.dispatch(new C06611(this.$callback, customerInfo, z10, purchasesOrchestrator));
            OfferingsManager.fetchAndCacheOfferings$default(this.this$0.offeringsManager, this.$newAppUserID, this.this$0.getState$purchases_defaultsBc8Release().getAppInBackground(), null, null, 12, null);
            this.this$0.backupManager.dataChanged();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m158invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m158invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PurchasesOrchestrator purchasesOrchestrator, LogInCallback logInCallback) {
            super(1);
            this.this$0 = purchasesOrchestrator;
            this.$callback = logInCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            this.this$0.dispatch(new AnonymousClass1(this.$callback, error));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$logIn$2$1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
        super(0);
        this.this$0 = purchasesOrchestrator;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m156invoke();
        return L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m156invoke() {
        IdentityManager identityManager = this.this$0.identityManager;
        String str = this.$newAppUserID;
        identityManager.logIn(str, new AnonymousClass1(this.this$0, str, this.$callback), new AnonymousClass2(this.this$0, this.$callback));
    }
}
