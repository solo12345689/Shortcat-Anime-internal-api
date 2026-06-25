package com.revenuecat.purchases.google.usecase;

import N4.l;
import N4.o;
import Td.L;
import Ud.AbstractC2279u;
import com.android.billingclient.api.AbstractC3156a;
import com.android.billingclient.api.C3160e;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\n\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0006\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00072\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R)\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b&\u0010$R\u0014\u0010)\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "LTd/L;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "productType", "Lcom/android/billingclient/api/e;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryPurchaseHistoryRequestIfNeeded", "(Ljava/lang/String;Lcom/android/billingclient/api/e;Ljava/util/Date;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "Lkotlin/jvm/functions/Function1;", "getOnReceive", "()Lkotlin/jvm/functions/Function1;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", com.amazon.a.a.o.b.f34648f, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchaseHistoryUseCase extends BillingClientUseCase<List<? extends StoreTransaction>> {
    private final Function1 onError;
    private final Function1 onReceive;
    private final QueryPurchaseHistoryUseCaseParams useCaseParams;
    private final Function1 withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "LTd/L;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        AnonymousClass1() {
            super(1);
        }

        public static final void invoke$lambda$7$lambda$6(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date, C3160e billingResult, List activePurchases) {
            L l10;
            LogHandler currentLogHandler;
            String str;
            Object objInvoke;
            AbstractC5504s.h(billingResult, "billingResult");
            AbstractC5504s.h(activePurchases, "activePurchases");
            if (atomicBoolean.getAndSet(true)) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1 queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1 = new QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1(logIntent, billingResult);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke(), null);
                        break;
                }
                return;
            }
            queryPurchaseHistoryUseCase.trackGoogleQueryPurchaseHistoryRequestIfNeeded(queryPurchaseHistoryUseCase.useCaseParams.getProductType(), billingResult, date);
            List<Purchase> list = !activePurchases.isEmpty() ? activePurchases : null;
            if (list != null) {
                for (Purchase purchase : list) {
                    LogIntent logIntent2 = LogIntent.RC_PURCHASE_SUCCESS;
                    QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1 queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1 = new QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1(logIntent2, purchase);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                str = "[Purchases] - " + logLevel11.name();
                                objInvoke = queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke();
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke(), null);
                            continue;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                str = "[Purchases] - " + logLevel14.name();
                                objInvoke = queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke();
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke(), null);
                            continue;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                str = "[Purchases] - " + logLevel16.name();
                                objInvoke = queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke();
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                str = "[Purchases] - " + logLevel17.name();
                                objInvoke = queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke();
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke(), null);
                            continue;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke(), null);
                            continue;
                    }
                    currentLogHandler.d(str, (String) objInvoke);
                }
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                LogIntent logIntent3 = LogIntent.DEBUG;
                QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2 queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2 = new QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2(logIntent3);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                    case 1:
                        LogLevel logLevel21 = LogLevel.DEBUG;
                        LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                            currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel22 = LogLevel.WARN;
                        LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                            currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel23 = LogLevel.INFO;
                        LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                            currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel24 = LogLevel.DEBUG;
                        LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                            currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel25 = LogLevel.INFO;
                        LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                            currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel26 = LogLevel.DEBUG;
                        LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                            currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel27 = LogLevel.DEBUG;
                        LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                            currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel28 = LogLevel.WARN;
                        LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                            currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel29 = LogLevel.WARN;
                        LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                            currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel30 = LogLevel.WARN;
                        LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                            currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                }
            }
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(activePurchases, 10));
            Iterator it = activePurchases.iterator();
            while (it.hasNext()) {
                Purchase it2 = (Purchase) it.next();
                AbstractC5504s.g(it2, "it");
                arrayList.add(StoreTransactionConversionsKt.toStoreTransaction$default(it2, ProductTypeConversionsKt.toRevenueCatProductType(queryPurchaseHistoryUseCase.useCaseParams.getProductType()), null, null, null, null, 30, null));
            }
            BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, billingResult, arrayList, null, null, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC3156a) obj);
            return L.f17438a;
        }

        public final void invoke(AbstractC3156a invoke) {
            L l10;
            AbstractC5504s.h(invoke, "$this$invoke");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final Date now = QueryPurchaseHistoryUseCase.this.useCaseParams.getDateProvider().getNow();
            o oVarBuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(QueryPurchaseHistoryUseCase.this.useCaseParams.getProductType());
            if (oVarBuildQueryPurchasesParams != null) {
                final QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = QueryPurchaseHistoryUseCase.this;
                invoke.j(oVarBuildQueryPurchasesParams, new l() { // from class: com.revenuecat.purchases.google.usecase.f
                    @Override // N4.l
                    public final void a(C3160e c3160e, List list) {
                        QueryPurchaseHistoryUseCase.AnonymousClass1.invoke$lambda$7$lambda$6(atomicBoolean, queryPurchaseHistoryUseCase, now, c3160e, list);
                    }
                });
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase2 = QueryPurchaseHistoryUseCase.this;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1));
                AbstractC5504s.g(str, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", str, null);
                C3160e c3160eA = C3160e.d().d(5).a();
                AbstractC5504s.g(c3160eA, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase2, c3160eA, null, null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase(QueryPurchaseHistoryUseCaseParams useCaseParams, Function1 onReceive, Function1 onError, Function1 withConnectedClient, Function2 executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        AbstractC5504s.h(useCaseParams, "useCaseParams");
        AbstractC5504s.h(onReceive, "onReceive");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(withConnectedClient, "withConnectedClient");
        AbstractC5504s.h(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    public final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String productType, C3160e billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iC = billingResult.c();
            String strA = billingResult.a();
            AbstractC5504s.g(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m237trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(productType, iC, strA, DurationExtensionsKt.between(Ef.a.f5961b, requestStartTime, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error receiving purchase history";
    }

    public final Function1 getOnError() {
        return this.onError;
    }

    public final Function1 getOnReceive() {
        return this.onReceive;
    }

    public final Function1 getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(List<? extends StoreTransaction> list) {
        onOk2((List<StoreTransaction>) list);
    }

    /* JADX INFO: renamed from: onOk */
    public void onOk2(List<StoreTransaction> received) {
        Function1 function1 = this.onReceive;
        if (received == null) {
            received = AbstractC2279u.m();
        }
        function1.invoke(received);
    }
}
