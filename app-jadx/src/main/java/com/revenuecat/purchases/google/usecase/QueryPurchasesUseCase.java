package com.revenuecat.purchases.google.usecase;

import Td.L;
import Ud.S;
import com.android.billingclient.api.AbstractC3156a;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0016\u001a\u00020\b2\u001e\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001a\u001a\u00020\b2\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R/\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "LTd/L;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "onQueryInAppsSuccess", "onQueryInAppsError", "queryInApps", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onQuerySubscriptionsSuccess", "onQuerySubscriptionsError", "querySubscriptions", "executeAsync", "()V", "received", "onOk", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;", "Lkotlin/jvm/functions/Function1;", "getOnSuccess", "()Lkotlin/jvm/functions/Function1;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", com.amazon.a.a.o.b.f34648f, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchasesUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final Function1 onError;
    private final Function1 onSuccess;
    private final QueryPurchasesUseCaseParams useCaseParams;
    private final Function1 withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "LTd/L;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "activeSubs", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06731 extends AbstractC5506u implements Function1 {
            final /* synthetic */ QueryPurchasesUseCase this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1$1$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "unconsumedInApps", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class C06741 extends AbstractC5506u implements Function1 {
                final /* synthetic */ Map<String, StoreTransaction> $activeSubs;
                final /* synthetic */ QueryPurchasesUseCase this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C06741(QueryPurchasesUseCase queryPurchasesUseCase, Map<String, StoreTransaction> map) {
                    super(1);
                    this.this$0 = queryPurchasesUseCase;
                    this.$activeSubs = map;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Map<String, StoreTransaction>) obj);
                    return L.f17438a;
                }

                public final void invoke(Map<String, StoreTransaction> unconsumedInApps) {
                    AbstractC5504s.h(unconsumedInApps, "unconsumedInApps");
                    this.this$0.onOk2(S.p(this.$activeSubs, unconsumedInApps));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06731(QueryPurchasesUseCase queryPurchasesUseCase) {
                super(1);
                this.this$0 = queryPurchasesUseCase;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, StoreTransaction>) obj);
                return L.f17438a;
            }

            public final void invoke(Map<String, StoreTransaction> activeSubs) {
                AbstractC5504s.h(activeSubs, "activeSubs");
                QueryPurchasesUseCase queryPurchasesUseCase = this.this$0;
                queryPurchasesUseCase.queryInApps(new C06741(queryPurchasesUseCase, activeSubs), this.this$0.getOnError());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC3156a) obj);
            return L.f17438a;
        }

        public final void invoke(AbstractC3156a invoke) {
            AbstractC5504s.h(invoke, "$this$invoke");
            QueryPurchasesUseCase queryPurchasesUseCase = QueryPurchasesUseCase.this;
            queryPurchasesUseCase.querySubscriptions(new C06731(queryPurchasesUseCase), QueryPurchasesUseCase.this.getOnError());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesUseCase(QueryPurchasesUseCaseParams useCaseParams, Function1 onSuccess, Function1 onError, Function1 withConnectedClient, Function2 executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        AbstractC5504s.h(useCaseParams, "useCaseParams");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(withConnectedClient, "withConnectedClient");
        AbstractC5504s.h(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onSuccess = onSuccess;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    public final void queryInApps(Function1 onQueryInAppsSuccess, Function1 onQueryInAppsError) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "inapp"), onQueryInAppsSuccess, onQueryInAppsError, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    public final void querySubscriptions(Function1 onQuerySubscriptionsSuccess, Function1 onQuerySubscriptionsError) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "subs"), onQuerySubscriptionsSuccess, onQuerySubscriptionsError, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases";
    }

    public final Function1 getOnError() {
        return this.onError;
    }

    public final Function1 getOnSuccess() {
        return this.onSuccess;
    }

    public final Function1 getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(Map<String, ? extends StoreTransaction> map) {
        onOk2((Map<String, StoreTransaction>) map);
    }

    /* JADX INFO: renamed from: onOk */
    public void onOk2(Map<String, StoreTransaction> received) {
        AbstractC5504s.h(received, "received");
        this.onSuccess.invoke(received);
    }
}
