package com.revenuecat.purchases;

import Td.L;
import Td.z;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R.\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0014R\u0018\u0010.\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Landroid/os/Handler;)V", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "listener", "LTd/L;", "afterSetListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "", "appUserID", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "Lkotlin/Function0;", "action", "dispatch", "(Lie/a;)V", "customerInfo", "cacheAndNotifyListeners", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "notifyListeners", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Landroid/os/Handler;", "value", "updatedCustomerInfoListener", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "lastSentCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfoUpdateHandler {
    private final AppConfig appConfig;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final Handler handler;
    private final IdentityManager identityManager;
    private CustomerInfo lastSentCustomerInfo;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private UpdatedCustomerInfoListener updatedCustomerInfoListener;

    public CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, Handler handler) {
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(identityManager, "identityManager");
        AbstractC5504s.h(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC5504s.h(appConfig, "appConfig");
        AbstractC5504s.h(handler, "handler");
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.handler = handler;
    }

    private final void afterSetListener(UpdatedCustomerInfoListener listener) {
        CustomerInfo cachedCustomerInfo;
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (listener != null) {
            LogIntent logIntent = LogIntent.DEBUG;
            CustomerInfoUpdateHandler$afterSetListener$$inlined$log$1 customerInfoUpdateHandler$afterSetListener$$inlined$log$1 = new CustomerInfoUpdateHandler$afterSetListener$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$afterSetListener$$inlined$log$1.invoke(), null);
                    break;
            }
            if (this.appConfig.getCustomEntitlementComputation() || (cachedCustomerInfo = getCachedCustomerInfo(this.identityManager.getCurrentAppUserID())) == null) {
                return;
            }
            notifyListeners(cachedCustomerInfo);
        }
    }

    private final void dispatch(final InterfaceC5082a action) {
        if (AbstractC5504s.c(Thread.currentThread(), this.handler.getLooper().getThread())) {
            action.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: com.revenuecat.purchases.b
                @Override // java.lang.Runnable
                public final void run() {
                    action.invoke();
                }
            });
        }
    }

    private final CustomerInfo getCachedCustomerInfo(String appUserID) {
        CustomerInfo customerInfo = this.offlineEntitlementsManager.get_offlineCustomerInfo();
        return customerInfo == null ? this.deviceCache.getCachedCustomerInfo$purchases_defaultsBc8Release(appUserID) : customerInfo;
    }

    public final void cacheAndNotifyListeners(CustomerInfo customerInfo) {
        AbstractC5504s.h(customerInfo, "customerInfo");
        this.deviceCache.cacheCustomerInfo$purchases_defaultsBc8Release(this.identityManager.getCurrentAppUserID(), customerInfo);
        notifyListeners(customerInfo);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.updatedCustomerInfoListener;
    }

    public final void notifyListeners(CustomerInfo customerInfo) {
        Pair pairA;
        LogHandler currentLogHandler;
        String str;
        String str2;
        DiagnosticsTracker diagnosticsTracker;
        AbstractC5504s.h(customerInfo, "customerInfo");
        synchronized (this) {
            pairA = z.a(this.updatedCustomerInfoListener, this.lastSentCustomerInfo);
        }
        UpdatedCustomerInfoListener updatedCustomerInfoListener = (UpdatedCustomerInfoListener) pairA.getFirst();
        CustomerInfo customerInfo2 = (CustomerInfo) pairA.getSecond();
        if (!AbstractC5504s.c(customerInfo2, customerInfo) && (diagnosticsTracker = this.diagnosticsTracker) != null) {
            diagnosticsTracker.trackCustomerInfoVerificationResultIfNeeded(customerInfo);
        }
        if (updatedCustomerInfoListener == null || AbstractC5504s.c(customerInfo2, customerInfo)) {
            return;
        }
        if (customerInfo2 != null) {
            LogIntent logIntent = LogIntent.DEBUG;
            CustomerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1 customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1 = new CustomerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$1.invoke(), null);
                    break;
            }
        } else {
            LogIntent logIntent2 = LogIntent.DEBUG;
            CustomerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2 customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2 = new CustomerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2(logIntent2);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2.invoke(), null);
                    break;
            }
        }
        synchronized (this) {
            this.lastSentCustomerInfo = customerInfo;
            L l10 = L.f17438a;
        }
        dispatch(new CustomerInfoUpdateHandler$notifyListeners$2$4(updatedCustomerInfoListener, customerInfo));
    }

    public final void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        synchronized (this) {
            this.updatedCustomerInfoListener = updatedCustomerInfoListener;
            L l10 = L.f17438a;
        }
        afterSetListener(updatedCustomerInfoListener);
    }

    public /* synthetic */ CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache, identityManager, offlineEntitlementsManager, appConfig, diagnosticsTracker, (i10 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
