package com.revenuecat.purchases;

import Td.L;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.SyncPurchasesHelper;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SyncPurchasesHelper$syncPurchases$2$1$2 extends AbstractC5506u implements Function1 {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ List<PurchasesError> $errors;
    final /* synthetic */ Function1 $handleError;
    final /* synthetic */ Function1 $handleSuccess;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ StoreTransaction $lastPurchase;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyncPurchasesHelper$syncPurchases$2$1$2(List<PurchasesError> list, StoreTransaction storeTransaction, StoreTransaction storeTransaction2, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, Function1 function1, Function1 function12) {
        super(1);
        this.$errors = list;
        this.$purchase = storeTransaction;
        this.$lastPurchase = storeTransaction2;
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z10;
        this.$isRestore = z11;
        this.$handleSuccess = function1;
        this.$handleError = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return L.f17438a;
    }

    public final void invoke(PurchasesError error) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(error, "error");
        LogIntent logIntent = LogIntent.RC_ERROR;
        SyncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1 syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1 = new SyncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1(logIntent, this.$purchase, error);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
        }
        this.$errors.add(error);
        SyncPurchasesHelper.AnonymousClass2.invoke$handleLastPurchase(this.$errors, this.this$0, this.$appUserID, this.$appInBackground, this.$isRestore, this.$handleSuccess, this.$handleError, this.$purchase, this.$lastPurchase);
    }
}
