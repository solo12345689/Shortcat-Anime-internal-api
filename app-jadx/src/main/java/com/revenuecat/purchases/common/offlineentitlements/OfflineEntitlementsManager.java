package com.revenuecat.purchases.common.offlineentitlements;

import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010 \u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001b¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u00112\u0018\b\u0002\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\"\u0010+\u001a\u0004\u0018\u00010\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u001c8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,RN\u00101\u001a<\u0012\u0004\u0012\u00020\u0015\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001b0/j\u0002`00.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0013\u00105\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "offlineCustomerInfoCalculator", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V", "", "isOfflineEntitlementsEnabled", "()Z", "LTd/L;", "resetOfflineCustomerInfoCache", "()V", "isServerError", "", "appUserId", "shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest", "(ZLjava/lang/String;)Z", "shouldCalculateOfflineCustomerInfoInPostReceipt", "(Z)Z", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "calculateAndCacheOfflineCustomerInfo", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "completion", "updateProductEntitlementMappingCacheIfStale", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "<set-?>", "_offlineCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "", "", "Lkotlin/Pair;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCallback;", "offlineCustomerInfoCallbackCache", "Ljava/util/Map;", "getOfflineCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "offlineCustomerInfo", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfflineEntitlementsManager {
    private CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    private final Map<String, List<Pair<Function1, Function1>>> offlineCustomerInfoCallbackCache;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                try {
                    LogLevel logLevel = LogLevel.WARN;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.w("[Purchases] - " + logLevel.name(), OfflineEntitlementsStrings.USING_OFFLINE_ENTITLEMENTS_CUSTOMER_INFO);
                    }
                    DiagnosticsTracker diagnosticsTracker = offlineEntitlementsManager.diagnosticsTracker;
                    if (diagnosticsTracker != null) {
                        diagnosticsTracker.trackEnteredOfflineEntitlementsMode();
                    }
                    offlineEntitlementsManager._offlineCustomerInfo = customerInfo;
                    String cachedAppUserID$purchases_defaultsBc8Release = offlineEntitlementsManager.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
                    if (cachedAppUserID$purchases_defaultsBc8Release != null) {
                        offlineEntitlementsManager.deviceCache.clearCustomerInfoCache$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release);
                    }
                    List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((Function1) ((Pair) it.next()).getFirst()).invoke(customerInfo);
                        }
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                try {
                    List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((Function1) ((Pair) it2.next()).getSecond()).invoke(it);
                        }
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40952 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40952(Function1 function1) {
            super(1);
            this.$completion = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ProductEntitlementMapping) obj);
            return L.f17438a;
        }

        public final void invoke(ProductEntitlementMapping productEntitlementMapping) {
            AbstractC5504s.h(productEntitlementMapping, "productEntitlementMapping");
            OfflineEntitlementsManager.this.deviceCache.cacheProductEntitlementMapping$purchases_defaultsBc8Release(productEntitlementMapping);
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), OfflineEntitlementsStrings.SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS);
            }
            Function1 function1 = this.$completion;
            if (function1 != null) {
                function1.invoke(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "e", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40963 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40963(Function1 function1) {
            super(1);
            this.$completion = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError e10) {
            AbstractC5504s.h(e10, "e");
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String str = String.format(OfflineEntitlementsStrings.ERROR_UPDATING_PRODUCT_ENTITLEMENTS, Arrays.copyOf(new Object[]{e10}, 1));
            AbstractC5504s.g(str, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", str, null);
            Function1 function1 = this.$completion;
            if (function1 != null) {
                function1.invoke(e10);
            }
        }
    }

    public OfflineEntitlementsManager(Backend backend, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, DeviceCache deviceCache, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker) {
        AbstractC5504s.h(backend, "backend");
        AbstractC5504s.h(offlineCustomerInfoCalculator, "offlineCustomerInfoCalculator");
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(appConfig, "appConfig");
        this.backend = backend;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator;
        this.deviceCache = deviceCache;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.offlineCustomerInfoCallbackCache = new LinkedHashMap();
    }

    private final boolean isOfflineEntitlementsEnabled() {
        return this.appConfig.getFinishTransactions() && this.appConfig.getEnableOfflineEntitlements() && !this.appConfig.getCustomEntitlementComputation() && this.appConfig.getStore() != Store.TEST_STORE;
    }

    public static /* synthetic */ void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(function1);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String appUserId, Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(appUserId, "appUserId");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_NOT_ENABLED));
            return;
        }
        synchronized (this) {
            try {
                boolean zContainsKey = this.offlineCustomerInfoCallbackCache.containsKey(appUserId);
                List<Pair<Function1, Function1>> listM = this.offlineCustomerInfoCallbackCache.get(appUserId);
                if (listM == null) {
                    listM = AbstractC2279u.m();
                }
                this.offlineCustomerInfoCallbackCache.put(appUserId, AbstractC2279u.I0(listM, AbstractC2279u.e(z.a(onSuccess, onError))));
                if (!zContainsKey) {
                    L l10 = L.f17438a;
                    this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(appUserId, new AnonymousClass2(appUserId), new AnonymousClass3(appUserId));
                    return;
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    String str = "[Purchases] - " + logLevel.name();
                    String str2 = String.format(OfflineEntitlementsStrings.ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO, Arrays.copyOf(new Object[]{appUserId}, 1));
                    AbstractC5504s.g(str2, "format(...)");
                    currentLogHandler.d(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: getOfflineCustomerInfo, reason: from getter */
    public final CustomerInfo get_offlineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        try {
            if (this._offlineCustomerInfo != null) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), OfflineEntitlementsStrings.RESETTING_OFFLINE_CUSTOMER_INFO_CACHE);
                }
                this._offlineCustomerInfo = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean isServerError, String appUserId) {
        AbstractC5504s.h(appUserId, "appUserId");
        return isServerError && isOfflineEntitlementsEnabled() && this.deviceCache.getCachedCustomerInfo$purchases_defaultsBc8Release(appUserId) == null;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean isServerError) {
        return isServerError && isOfflineEntitlementsEnabled();
    }

    public final void updateProductEntitlementMappingCacheIfStale(Function1 completion) {
        if (!isOfflineEntitlementsEnabled() || !this.deviceCache.isProductEntitlementMappingCacheStale$purchases_defaultsBc8Release()) {
            if (completion != null) {
                completion.invoke(null);
                return;
            }
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), OfflineEntitlementsStrings.UPDATING_PRODUCT_ENTITLEMENT_MAPPING);
        }
        this.backend.getProductEntitlementMapping(new C40952(completion), new C40963(completion));
    }
}
