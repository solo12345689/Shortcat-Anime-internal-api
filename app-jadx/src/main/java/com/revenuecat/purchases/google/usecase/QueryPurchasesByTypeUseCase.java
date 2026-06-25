package com.revenuecat.purchases.google.usecase;

import N4.l;
import N4.o;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.android.billingclient.api.AbstractC3156a;
import com.android.billingclient.api.C3160e;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\"\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J-\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020$0\u001c2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J#\u0010*\u001a\u00020\b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R/\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b0\u0010/R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b1\u0010/R\u0014\u00104\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "LTd/L;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "billingClient", "productType", "LN4/o;", "queryParams", "LN4/l;", "listener", "queryPurchasesAsyncWithTrackingEnsuringOneResponse", "(Lcom/android/billingclient/api/a;Ljava/lang/String;LN4/o;LN4/l;)V", "", "foundProductIds", "Lcom/android/billingclient/api/e;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryPurchasesRequestIfNeeded", "(Ljava/lang/String;Ljava/util/List;Lcom/android/billingclient/api/e;Ljava/util/Date;)V", "Lcom/android/billingclient/api/Purchase;", "toMapOfGooglePurchaseWrapper", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "executeAsync", "()V", "received", "onOk", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "Lkotlin/jvm/functions/Function1;", "getOnSuccess", "()Lkotlin/jvm/functions/Function1;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", com.amazon.a.a.o.b.f34648f, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchasesByTypeUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final Function1 onError;
    private final Function1 onSuccess;
    private final QueryPurchasesByTypeUseCaseParams useCaseParams;
    private final Function1 withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase$executeAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "LTd/L;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        AnonymousClass1() {
            super(1);
        }

        public static final void invoke$lambda$1$lambda$0(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, C3160e result, List purchases) {
            AbstractC5504s.h(result, "result");
            AbstractC5504s.h(purchases, "purchases");
            BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase, result, queryPurchasesByTypeUseCase.toMapOfGooglePurchaseWrapper(purchases, queryPurchasesByTypeUseCase.useCaseParams.getProductType()), null, null, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC3156a) obj);
            return L.f17438a;
        }

        public final void invoke(AbstractC3156a invoke) {
            L l10;
            AbstractC5504s.h(invoke, "$this$invoke");
            o oVarBuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(QueryPurchasesByTypeUseCase.this.useCaseParams.getProductType());
            if (oVarBuildQueryPurchasesParams != null) {
                final QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase = QueryPurchasesByTypeUseCase.this;
                queryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse(invoke, queryPurchasesByTypeUseCase.useCaseParams.getProductType(), oVarBuildQueryPurchasesParams, new l() { // from class: com.revenuecat.purchases.google.usecase.h
                    @Override // N4.l
                    public final void a(C3160e c3160e, List list) {
                        QueryPurchasesByTypeUseCase.AnonymousClass1.invoke$lambda$1$lambda$0(queryPurchasesByTypeUseCase, c3160e, list);
                    }
                });
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase2 = QueryPurchasesByTypeUseCase.this;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchasesByType"}, 1));
                AbstractC5504s.g(str, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", str, null);
                C3160e c3160eA = C3160e.d().d(5).a();
                AbstractC5504s.g(c3160eA, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase2, c3160eA, S.i(), null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesByTypeUseCase(QueryPurchasesByTypeUseCaseParams useCaseParams, Function1 onSuccess, Function1 onError, Function1 withConnectedClient, Function2 executeRequestOnUIThread) {
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

    public final void queryPurchasesAsyncWithTrackingEnsuringOneResponse(AbstractC3156a billingClient, final String productType, o queryParams, final l listener) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Date now = this.useCaseParams.getDateProvider().getNow();
        billingClient.j(queryParams, new l() { // from class: com.revenuecat.purchases.google.usecase.g
            @Override // N4.l
            public final void a(C3160e c3160e, List list) {
                QueryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2(atomicBoolean, this, productType, now, listener, c3160e, list);
            }
        });
    }

    public static final void queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2(AtomicBoolean atomicBoolean, QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, String str, Date date, l lVar, C3160e billingResult, List purchases) {
        AbstractC5504s.h(billingResult, "billingResult");
        AbstractC5504s.h(purchases, "purchases");
        if (!atomicBoolean.getAndSet(true)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = purchases.iterator();
            while (it.hasNext()) {
                List listC = ((Purchase) it.next()).c();
                AbstractC5504s.g(listC, "it.products");
                AbstractC2279u.D(arrayList, listC);
            }
            queryPurchasesByTypeUseCase.trackGoogleQueryPurchasesRequestIfNeeded(str, arrayList, billingResult, date);
            lVar.a(billingResult, purchases);
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        QueryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1 queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1 = new QueryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1(logIntent, billingResult);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke(), null);
                break;
        }
    }

    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(list, 10)), 16));
        for (Purchase purchase : list) {
            String strF = purchase.f();
            AbstractC5504s.g(strF, "purchase.purchaseToken");
            Pair pairA = z.a(UtilsKt.sha1(strF), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), null, null, null, null, 30, null));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String productType, List<String> foundProductIds, C3160e billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iC = billingResult.c();
            String strA = billingResult.a();
            AbstractC5504s.g(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m238trackGoogleQueryPurchasesRequestzkXUZaI(productType, iC, strA, DurationExtensionsKt.between(Ef.a.f5961b, requestStartTime, this.useCaseParams.getDateProvider().getNow()), foundProductIds);
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases of type " + this.useCaseParams.getProductType();
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
