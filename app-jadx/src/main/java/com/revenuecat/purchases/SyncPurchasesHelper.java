package com.revenuecat.purchases;

import Td.L;
import Ud.AbstractC2279u;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JE\u0010\"\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/SyncPurchasesHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/PostReceiptHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "appUserID", "", "appInBackground", "isRestore", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "LTd/L;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "retrieveCustomerInfo", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", LogEvent.LEVEL_ERROR, "Ljava/util/Date;", "startTime", "trackSyncPurchasesResultIfNeeded", "(Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Date;)V", "syncPurchases", "(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SyncPurchasesHelper {
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Function1 $handleError;
        final /* synthetic */ Function1 $handleSuccess;
        final /* synthetic */ boolean $isRestore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, boolean z10, boolean z11, Function1 function1, Function1 function12) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z10;
            this.$isRestore = z11;
            this.$handleSuccess = function1;
            this.$handleError = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, Function1 function1, Function1 function12, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
            if (AbstractC5504s.c(storeTransaction, storeTransaction2)) {
                if (!list.isEmpty()) {
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    String str2 = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1));
                    AbstractC5504s.g(str2, "format(...)");
                    currentLogHandler.e("[Purchases] - ERROR", str2, null);
                    function12.invoke(AbstractC2279u.m0(list));
                    return;
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel.name(), PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                }
                syncPurchasesHelper.retrieveCustomerInfo(str, z10, z11, function1, function12);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return L.f17438a;
        }

        public final void invoke(List<StoreTransaction> allPurchases) {
            AbstractC5504s.h(allPurchases, "allPurchases");
            if (allPurchases.isEmpty()) {
                SyncPurchasesHelper.this.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$handleSuccess, this.$handleError);
                return;
            }
            StoreTransaction storeTransaction = (StoreTransaction) AbstractC2279u.y0(allPurchases);
            ArrayList arrayList = new ArrayList();
            SyncPurchasesHelper syncPurchasesHelper = SyncPurchasesHelper.this;
            boolean z10 = this.$isRestore;
            String str = this.$appUserID;
            boolean z11 = this.$appInBackground;
            Function1 function1 = this.$handleSuccess;
            Function1 function12 = this.$handleError;
            for (StoreTransaction storeTransaction2 : allPurchases) {
                ReceiptInfo receiptInfo = new ReceiptInfo(storeTransaction2.getProductIds(), Long.valueOf(storeTransaction2.getPurchaseTime()), null, null, null, null, null, null, null, null, false, storeTransaction2.getStoreUserID(), storeTransaction2.getMarketplace(), 2044, null);
                PostReceiptHelper postReceiptHelper = syncPurchasesHelper.postReceiptHelper;
                String purchaseToken = storeTransaction2.getPurchaseToken();
                PostReceiptInitiationSource postReceiptInitiationSource = PostReceiptInitiationSource.RESTORE;
                ArrayList arrayList2 = arrayList;
                SyncPurchasesHelper$syncPurchases$2$1$1 syncPurchasesHelper$syncPurchases$2$1$1 = new SyncPurchasesHelper$syncPurchases$2$1$1(storeTransaction2, storeTransaction, arrayList2, syncPurchasesHelper, str, z11, z10, function1, function12);
                StoreTransaction storeTransaction3 = storeTransaction;
                SyncPurchasesHelper$syncPurchases$2$1$2 syncPurchasesHelper$syncPurchases$2$1$2 = new SyncPurchasesHelper$syncPurchases$2$1$2(arrayList2, storeTransaction2, storeTransaction3, syncPurchasesHelper, str, z11, z10, function1, function12);
                storeTransaction = storeTransaction3;
                Function1 function13 = function1;
                Function1 function14 = function12;
                boolean z12 = z10;
                String str2 = str;
                postReceiptHelper.postTokenWithoutConsuming(purchaseToken, receiptInfo, z12, str2, postReceiptInitiationSource, syncPurchasesHelper$syncPurchases$2$1$1, syncPurchasesHelper$syncPurchases$2$1$2, storeTransaction2.getIsAutoRenewing());
                z11 = z11;
                z10 = z12;
                str = str2;
                function12 = function14;
                function1 = function13;
                arrayList = arrayList2;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $handleError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Function1 function1) {
            super(1);
            this.$handleError = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            AbstractC5504s.h(it, "it");
            LogIntent logIntent = LogIntent.RC_ERROR;
            SyncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1 syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1 = new SyncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1(logIntent, it);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            this.$handleError.invoke(it);
        }
    }

    public SyncPurchasesHelper(BillingAbstract billing, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider) {
        AbstractC5504s.h(billing, "billing");
        AbstractC5504s.h(identityManager, "identityManager");
        AbstractC5504s.h(customerInfoHelper, "customerInfoHelper");
        AbstractC5504s.h(postReceiptHelper, "postReceiptHelper");
        AbstractC5504s.h(dateProvider, "dateProvider");
        this.billing = billing;
        this.identityManager = identityManager;
        this.customerInfoHelper = customerInfoHelper;
        this.postReceiptHelper = postReceiptHelper;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrieveCustomerInfo(String appUserID, boolean appInBackground, boolean isRestore, final Function1 onSuccess, final Function1 onError) {
        CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, appUserID, CacheFetchPolicy.CACHED_OR_FETCHED, appInBackground, isRestore, false, new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.SyncPurchasesHelper.retrieveCustomerInfo.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                onSuccess.invoke(customerInfo);
            }
        }, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackSyncPurchasesResultIfNeeded(PurchasesError error, Date startTime) {
        PurchasesErrorCode code;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m242trackSyncPurchasesResultSxA4cEA((error == null || (code = error.getCode()) == null) ? null : Integer.valueOf(code.getCode()), error != null ? error.getMessage() : null, DurationExtensionsKt.between(Ef.a.f5961b, startTime, this.dateProvider.getNow()));
        }
    }

    public final void syncPurchases(boolean isRestore, boolean appInBackground, Function1 onSuccess, Function1 onError) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        SyncPurchasesHelper$syncPurchases$$inlined$log$1 syncPurchasesHelper$syncPurchases$$inlined$log$1 = new SyncPurchasesHelper$syncPurchases$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
        }
        Date now = this.dateProvider.getNow();
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackSyncPurchasesStarted();
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        SyncPurchasesHelper$syncPurchases$handleSuccess$1 syncPurchasesHelper$syncPurchases$handleSuccess$1 = new SyncPurchasesHelper$syncPurchases$handleSuccess$1(this, now, onSuccess);
        SyncPurchasesHelper$syncPurchases$handleError$1 syncPurchasesHelper$syncPurchases$handleError$1 = new SyncPurchasesHelper$syncPurchases$handleError$1(this, now, onError);
        this.billing.queryAllPurchases(currentAppUserID, new AnonymousClass2(currentAppUserID, appInBackground, isRestore, syncPurchasesHelper$syncPurchases$handleSuccess$1, syncPurchasesHelper$syncPurchases$handleError$1), new AnonymousClass3(syncPurchasesHelper$syncPurchases$handleError$1));
    }

    public /* synthetic */ SyncPurchasesHelper(BillingAbstract billingAbstract, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(billingAbstract, identityManager, customerInfoHelper, postReceiptHelper, diagnosticsTracker, (i10 & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
