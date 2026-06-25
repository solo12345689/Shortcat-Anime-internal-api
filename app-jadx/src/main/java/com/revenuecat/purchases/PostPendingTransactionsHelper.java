package com.revenuecat.purchases;

import Td.L;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.SyncPendingPurchaseResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.utils.Result;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jc\u0010!\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a0\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002¢\u0006\u0004\b!\u0010\"Jg\u0010%\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0018\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0#0\u00122\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001cH\u0002¢\u0006\u0004\b%\u0010&J-\u0010)\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactionsToSync", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lkotlin/Function0;", "LTd/L;", "onNoTransactionsToSync", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "postTransactionsWithCompletion", "(Ljava/util/List;ZLjava/lang/String;Lie/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/utils/Result;", "results", "callCompletionFromResults", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "callback", "syncPendingPurchaseQueue", "(ZLkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostPendingTransactionsHelper {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$postTransactionsWithCompletion$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
        final /* synthetic */ List<StoreTransaction> $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, Function1 function1, Function1 function12) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (CustomerInfo) obj2);
            return L.f17438a;
        }

        public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            AbstractC5504s.h(storeTransaction, "<anonymous parameter 0>");
            AbstractC5504s.h(customerInfo, "customerInfo");
            this.$results.add(new Result.Success(customerInfo));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$postTransactionsWithCompletion$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
        final /* synthetic */ List<StoreTransaction> $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, Function1 function1, Function1 function12) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (PurchasesError) obj2);
            return L.f17438a;
        }

        public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
            AbstractC5504s.h(storeTransaction, "<anonymous parameter 0>");
            AbstractC5504s.h(purchasesError, "purchasesError");
            this.$results.add(new Result.Error(purchasesError));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    public PostPendingTransactionsHelper(AppConfig appConfig, DeviceCache deviceCache, BillingAbstract billing, Dispatcher dispatcher, IdentityManager identityManager, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostReceiptHelper postReceiptHelper) {
        AbstractC5504s.h(appConfig, "appConfig");
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(billing, "billing");
        AbstractC5504s.h(dispatcher, "dispatcher");
        AbstractC5504s.h(identityManager, "identityManager");
        AbstractC5504s.h(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        AbstractC5504s.h(postReceiptHelper, "postReceiptHelper");
        this.appConfig = appConfig;
        this.deviceCache = deviceCache;
        this.billing = billing;
        this.dispatcher = dispatcher;
        this.identityManager = identityManager;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postReceiptHelper = postReceiptHelper;
    }

    public final void callCompletionFromResults(List<StoreTransaction> transactionsToSync, List<? extends Result<CustomerInfo, PurchasesError>> results, Function1 onError, Function1 onSuccess) {
        if (transactionsToSync.size() == results.size()) {
            int i10 = 0;
            for (Object obj : results) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2279u.w();
                }
                Result result = (Result) obj;
                if (result instanceof Result.Error) {
                    if (onError != null) {
                        onError.invoke(((Result.Error) result).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i10 == results.size() - 1 && onSuccess != null) {
                        AbstractC5504s.f(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        onSuccess.invoke(((Result.Success) result).getValue());
                    }
                    i10 = i11;
                }
            }
        }
    }

    static /* synthetic */ void callCompletionFromResults$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        if ((i10 & 8) != 0) {
            function12 = null;
        }
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, function1, function12);
    }

    public final void postTransactionsWithCompletion(List<StoreTransaction> transactionsToSync, boolean allowSharingPlayStoreAccount, String appUserID, InterfaceC5082a onNoTransactionsToSync, Function1 onError, Function1 onSuccess) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (!transactionsToSync.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.postTransactionWithProductDetailsHelper.postTransactions(transactionsToSync, allowSharingPlayStoreAccount, appUserID, PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, false, new AnonymousClass2(arrayList, this, transactionsToSync, onError, onSuccess), new AnonymousClass3(arrayList, this, transactionsToSync, onError, onSuccess));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PostPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1 postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1 = new PostPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
        }
        onNoTransactionsToSync.invoke();
    }

    public static /* synthetic */ void syncPendingPurchaseQueue$default(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        postPendingTransactionsHelper.syncPendingPurchaseQueue(z10, function1);
    }

    public static final void syncPendingPurchaseQueue$lambda$2(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z10, Function1 function1) {
        postPendingTransactionsHelper.billing.queryPurchases(str, new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1(postPendingTransactionsHelper, z10, str, function1), new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2(function1));
    }

    public final void syncPendingPurchaseQueue(final boolean allowSharingPlayStoreAccount, final Function1 callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogIntent logIntent = LogIntent.DEBUG;
            PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2 postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
            }
            final String currentAppUserID = this.identityManager.getCurrentAppUserID();
            Dispatcher.enqueue$default(this.dispatcher, new Runnable() { // from class: com.revenuecat.purchases.f
                @Override // java.lang.Runnable
                public final void run() {
                    PostPendingTransactionsHelper.syncPendingPurchaseQueue$lambda$2(this.f44063a, currentAppUserID, allowSharingPlayStoreAccount, callback);
                }
            }, null, 2, null);
            return;
        }
        LogIntent logIntent2 = LogIntent.DEBUG;
        PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    str = "[Purchases] - " + logLevel11.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    str = "[Purchases] - " + logLevel14.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    str = "[Purchases] - " + logLevel16.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    str = "[Purchases] - " + logLevel17.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
        }
        if (callback != null) {
            callback.invoke(SyncPendingPurchaseResult.AutoSyncDisabled.INSTANCE);
        }
    }
}
