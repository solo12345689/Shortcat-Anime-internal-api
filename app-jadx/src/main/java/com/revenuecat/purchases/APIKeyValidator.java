package com.revenuecat.purchases;

import Df.r;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.ConfigureStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator;", "", "<init>", "()V", "", "apiKey", "Lcom/revenuecat/purchases/Store;", "configuredStore", "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "validate", "(Ljava/lang/String;Lcom/revenuecat/purchases/Store;)Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "validationResult", "LTd/L;", "logValidationResult", "(Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;)V", "Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "getApiKeyPlatform", "(Ljava/lang/String;)Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "validateAndLog", "redactApiKey", "(Ljava/lang/String;)Ljava/lang/String;", "APIKeyPlatform", "ValidationResult", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class APIKeyValidator {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "", "(Ljava/lang/String;I)V", "GOOGLE", "AMAZON", "GALAXY", "LEGACY", "TEST", "OTHER_PLATFORM", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        GALAXY,
        LEGACY,
        TEST,
        OTHER_PLATFORM
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "", "(Ljava/lang/String;I)V", "VALID", "GOOGLE_KEY_AMAZON_STORE", "GOOGLE_KEY_GALAXY_STORE", "AMAZON_KEY_GOOGLE_STORE", "AMAZON_KEY_GALAXY_STORE", "GALAXY_KEY_GOOGLE_STORE", "GALAXY_KEY_AMAZON_STORE", "LEGACY", "SIMULATED_STORE", "OTHER_PLATFORM", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        GOOGLE_KEY_GALAXY_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        AMAZON_KEY_GALAXY_STORE,
        GALAXY_KEY_GOOGLE_STORE,
        GALAXY_KEY_AMAZON_STORE,
        LEGACY,
        SIMULATED_STORE,
        OTHER_PLATFORM
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationResult.values().length];
            try {
                iArr[ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationResult.GALAXY_KEY_GOOGLE_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_GALAXY_STORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidationResult.GALAXY_KEY_AMAZON_STORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValidationResult.AMAZON_KEY_GALAXY_STORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ValidationResult.LEGACY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ValidationResult.OTHER_PLATFORM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ValidationResult.SIMULATED_STORE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ValidationResult.VALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final APIKeyPlatform getApiKeyPlatform(String apiKey) {
        return r.Q(apiKey, "goog_", false, 2, null) ? APIKeyPlatform.GOOGLE : r.Q(apiKey, "amzn_", false, 2, null) ? APIKeyPlatform.AMAZON : r.Q(apiKey, "galx_", false, 2, null) ? APIKeyPlatform.GALAXY : r.Q(apiKey, "test_", false, 2, null) ? APIKeyPlatform.TEST : !r.V(apiKey, '_', false, 2, null) ? APIKeyPlatform.LEGACY : APIKeyPlatform.OTHER_PLATFORM;
    }

    private final void logValidationResult(ValidationResult validationResult) {
        switch (WhenMappings.$EnumSwitchMapping$0[validationResult.ordinal()]) {
            case 1:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.AMAZON_API_KEY_GOOGLE_STORE, null);
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.GOOGLE_API_KEY_AMAZON_STORE, null);
                break;
            case 3:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.GALAXY_API_KEY_GOOGLE_STORE, null);
                break;
            case 4:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.GOOGLE_API_KEY_GALAXY_STORE, null);
                break;
            case 5:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.GALAXY_API_KEY_AMAZON_STORE, null);
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.AMAZON_API_KEY_GALAXY_STORE, null);
                break;
            case 7:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), ConfigureStrings.LEGACY_API_KEY);
                }
                break;
            case 8:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.INVALID_API_KEY, null);
                break;
            case 9:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), ConfigureStrings.SIMULATED_STORE_API_KEY);
                }
                break;
        }
    }

    private final ValidationResult validate(String apiKey, Store configuredStore) {
        APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(apiKey);
        if (apiKeyPlatform == APIKeyPlatform.TEST) {
            return ValidationResult.SIMULATED_STORE;
        }
        APIKeyPlatform aPIKeyPlatform = APIKeyPlatform.GOOGLE;
        if (apiKeyPlatform == aPIKeyPlatform && configuredStore == Store.PLAY_STORE) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform2 = APIKeyPlatform.AMAZON;
        if (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == Store.AMAZON) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform3 = APIKeyPlatform.GALAXY;
        return (apiKeyPlatform == aPIKeyPlatform3 && configuredStore == Store.GALAXY) ? ValidationResult.VALID : (apiKeyPlatform == aPIKeyPlatform && configuredStore == Store.AMAZON) ? ValidationResult.GOOGLE_KEY_AMAZON_STORE : (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == Store.PLAY_STORE) ? ValidationResult.AMAZON_KEY_GOOGLE_STORE : (apiKeyPlatform == aPIKeyPlatform && configuredStore == Store.GALAXY) ? ValidationResult.GOOGLE_KEY_GALAXY_STORE : (apiKeyPlatform == aPIKeyPlatform3 && configuredStore == Store.PLAY_STORE) ? ValidationResult.GALAXY_KEY_GOOGLE_STORE : (apiKeyPlatform == aPIKeyPlatform3 && configuredStore == Store.AMAZON) ? ValidationResult.GALAXY_KEY_AMAZON_STORE : (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == Store.GALAXY) ? ValidationResult.AMAZON_KEY_GALAXY_STORE : apiKeyPlatform == APIKeyPlatform.LEGACY ? ValidationResult.LEGACY : apiKeyPlatform == APIKeyPlatform.OTHER_PLATFORM ? ValidationResult.OTHER_PLATFORM : ValidationResult.OTHER_PLATFORM;
    }

    public final String redactApiKey(String apiKey) {
        String strS1;
        String strSubstring;
        AbstractC5504s.h(apiKey, "apiKey");
        int iI0 = r.i0(apiKey, '_', 0, false, 6, null);
        if (iI0 == -1) {
            strS1 = "";
            strSubstring = apiKey;
        } else {
            int i10 = iI0 + 1;
            strS1 = r.s1(apiKey, i10);
            strSubstring = apiKey.substring(i10);
            AbstractC5504s.g(strSubstring, "substring(...)");
        }
        if (strSubstring.length() < 6) {
            return apiKey;
        }
        return strS1 + r.s1(strSubstring, 2) + "********" + r.t1(strSubstring, 4);
    }

    public final ValidationResult validateAndLog(String apiKey, Store configuredStore) {
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(configuredStore, "configuredStore");
        ValidationResult validationResultValidate = validate(apiKey, configuredStore);
        logValidationResult(validationResultValidate);
        return validationResultValidate;
    }
}
