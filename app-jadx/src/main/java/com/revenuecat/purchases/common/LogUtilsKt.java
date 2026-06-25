package com.revenuecat.purchases.common;

import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a!\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a!\u0010\u000e\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a@\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0011\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/LogLevel$Companion;", "", "enabled", "Lcom/revenuecat/purchases/LogLevel;", "debugLogsEnabled", "(Lcom/revenuecat/purchases/LogLevel$Companion;Z)Lcom/revenuecat/purchases/LogLevel;", "Lkotlin/Function0;", "", "messageBuilder", "LTd/L;", "verboseLog", "(Lie/a;)V", "debugLog", "infoLog", "warnLog", "", "throwable", "errorLog", "(Ljava/lang/Throwable;Lie/a;)V", "level", "Lkotlin/Function2;", "logger", "logIfEnabled", "(Lcom/revenuecat/purchases/LogLevel;Lkotlin/jvm/functions/Function2;Lie/a;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "(Lcom/revenuecat/purchases/PurchasesError;)V", "PURCHASES_LOG_TAG", "Ljava/lang/String;", "getDebugLogsEnabled", "(Lcom/revenuecat/purchases/LogLevel;)Z", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LogUtilsKt {
    private static final String PURCHASES_LOG_TAG = "[Purchases]";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesErrorCode.values().length];
            try {
                iArr[PurchasesErrorCode.UnknownError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesErrorCode.NetworkError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchasesErrorCode.ReceiptAlreadyInUseError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchasesErrorCode.UnexpectedBackendResponseError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidAppUserIdError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchasesErrorCode.OperationAlreadyInProgressError.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchasesErrorCode.UnknownBackendError.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PurchasesErrorCode.LogOutWithAnonymousUserError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PurchasesErrorCode.ConfigurationError.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PurchasesErrorCode.UnsupportedError.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PurchasesErrorCode.EmptySubscriberAttributesError.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PurchasesErrorCode.CustomerInfoError.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PurchasesErrorCode.SignatureVerificationError.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidSubscriberAttributesError.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PurchasesErrorCode.TestStoreSimulatedPurchaseError.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseCancelledError.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PurchasesErrorCode.StoreProblemError.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseNotAllowedError.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseInvalidError.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PurchasesErrorCode.ProductNotAvailableForPurchaseError.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PurchasesErrorCode.ProductAlreadyPurchasedError.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidReceiptError.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PurchasesErrorCode.MissingReceiptFileError.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidAppleSubscriptionKeyError.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[PurchasesErrorCode.IneligibleError.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[PurchasesErrorCode.InsufficientPermissionsError.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[PurchasesErrorCode.PaymentPendingError.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidCredentialsError.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void debugLog(InterfaceC5082a messageBuilder) {
        AbstractC5504s.h(messageBuilder, "messageBuilder");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) messageBuilder.invoke());
        }
    }

    public static final LogLevel debugLogsEnabled(LogLevel.Companion companion, boolean z10) {
        AbstractC5504s.h(companion, "<this>");
        return z10 ? LogLevel.DEBUG : LogLevel.INFO;
    }

    public static final void errorLog(Throwable th2, InterfaceC5082a messageBuilder) {
        AbstractC5504s.h(messageBuilder, "messageBuilder");
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) messageBuilder.invoke(), th2);
    }

    public static /* synthetic */ void errorLog$default(Throwable th2, InterfaceC5082a messageBuilder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        AbstractC5504s.h(messageBuilder, "messageBuilder");
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) messageBuilder.invoke(), th2);
    }

    public static final boolean getDebugLogsEnabled(LogLevel logLevel) {
        AbstractC5504s.h(logLevel, "<this>");
        return logLevel.compareTo(LogLevel.DEBUG) <= 0;
    }

    public static final void infoLog(InterfaceC5082a messageBuilder) {
        AbstractC5504s.h(messageBuilder, "messageBuilder");
        LogLevel logLevel = LogLevel.INFO;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.i("[Purchases] - " + logLevel.name(), (String) messageBuilder.invoke());
        }
    }

    private static final void logIfEnabled(LogLevel logLevel, Function2 function2, InterfaceC5082a interfaceC5082a) {
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            function2.invoke("[Purchases] - " + logLevel.name(), interfaceC5082a.invoke());
        }
    }

    public static final void verboseLog(InterfaceC5082a messageBuilder) {
        AbstractC5504s.h(messageBuilder, "messageBuilder");
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), (String) messageBuilder.invoke());
        }
    }

    public static final void warnLog(InterfaceC5082a messageBuilder) {
        AbstractC5504s.h(messageBuilder, "messageBuilder");
        LogLevel logLevel = LogLevel.WARN;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.w("[Purchases] - " + logLevel.name(), (String) messageBuilder.invoke());
        }
    }

    public static final void errorLog(PurchasesError error) {
        AbstractC5504s.h(error, "error");
        switch (WhenMappings.$EnumSwitchMapping$0[error.getCode().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                LogIntent logIntent = LogIntent.RC_ERROR;
                LogUtilsKt$errorLog$$inlined$log$1 logUtilsKt$errorLog$$inlined$log$1 = new LogUtilsKt$errorLog$$inlined$log$1(logIntent, error);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
                LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                LogUtilsKt$errorLog$$inlined$log$2 logUtilsKt$errorLog$$inlined$log$2 = new LogUtilsKt$errorLog$$inlined$log$2(logIntent2, error);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        LogLevel logLevel11 = LogLevel.DEBUG;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            currentLogHandler11.d("[Purchases] - " + logLevel11.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel12 = LogLevel.WARN;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel13 = LogLevel.INFO;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel14 = LogLevel.DEBUG;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler14.d("[Purchases] - " + logLevel14.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel15 = LogLevel.INFO;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler15.i("[Purchases] - " + logLevel15.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler16.d("[Purchases] - " + logLevel16.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel17 = LogLevel.DEBUG;
                        LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler17.d("[Purchases] - " + logLevel17.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler18.w("[Purchases] - " + logLevel18.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel19 = LogLevel.WARN;
                        LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                            currentLogHandler19.w("[Purchases] - " + logLevel19.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel20 = LogLevel.WARN;
                        LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                            currentLogHandler20.w("[Purchases] - " + logLevel20.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                }
                break;
        }
    }
}
