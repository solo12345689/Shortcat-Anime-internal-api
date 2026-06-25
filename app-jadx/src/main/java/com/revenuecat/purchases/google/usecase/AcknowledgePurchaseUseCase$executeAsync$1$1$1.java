package com.revenuecat.purchases.google.usecase;

import Td.L;
import com.android.billingclient.api.C3160e;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.google.BillingResultExtensionsBillingIndependentKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/android/billingclient/api/e;", "errorBillingResult", "LTd/L;", "invoke", "(Lcom/android/billingclient/api/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AcknowledgePurchaseUseCase$executeAsync$1$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ AcknowledgePurchaseUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcknowledgePurchaseUseCase$executeAsync$1$1$1(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase) {
        super(1);
        this.this$0 = acknowledgePurchaseUseCase;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3160e) obj);
        return L.f17438a;
    }

    public final void invoke(C3160e errorBillingResult) {
        String str;
        LogHandler currentLogHandler;
        String str2;
        String str3;
        AbstractC5504s.h(errorBillingResult, "errorBillingResult");
        if (errorBillingResult.c() != 8 || this.this$0.useCaseParams.getInitiationSource() != PostReceiptInitiationSource.RESTORE) {
            str = this.this$0.getErrorMessage() + " - " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(errorBillingResult);
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            AcknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2 acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2 = new AcknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2(logIntent, str);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke(), null);
                    break;
            }
        } else {
            LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            str = PurchaseStrings.ACKNOWLEDGING_PURCHASE_ERROR_RESTORE;
            AcknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1 acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1 = new AcknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1(logIntent2, PurchaseStrings.ACKNOWLEDGING_PURCHASE_ERROR_RESTORE);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        str2 = "[Purchases] - " + logLevel11.name();
                        str3 = (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        str2 = "[Purchases] - " + logLevel14.name();
                        str3 = (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        str2 = "[Purchases] - " + logLevel16.name();
                        str3 = (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        str2 = "[Purchases] - " + logLevel17.name();
                        str3 = (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) acknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
        }
        this.this$0.getOnError().invoke(ErrorsKt.billingResponseToPurchasesError(errorBillingResult.c(), str));
    }
}
