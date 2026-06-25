package com.revenuecat.purchases.common.networking;

import Td.AbstractC2163n;
import Td.r;
import Td.z;
import Ud.S;
import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import java.util.Date;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010!J]\u0010/\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0017H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b0\u00101J\u0019\u00105\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u00106\u001a\u00020\u000bH\u0000¢\u0006\u0004\b7\u0010\u0012J\u000f\u0010;\u001a\u00020\u0010H\u0000¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=¨\u0006?"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagManager;", "", "Landroid/content/Context;", "context", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "prefs", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/Context;Lkotlin/Lazy;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "urlString", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "result", "eTag", "LTd/L;", "storeResult", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/networking/HTTPResult;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "getStoredResultSavedInSharedPreferences", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "resultFromBackend", "", "shouldStoreBackendResult", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)Z", "storedResult", "verificationRequested", "shouldUseETag", "(Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;Z)Z", "refreshETag", "", "getETagHeaders$purchases_defaultsBc8Release", "(Ljava/lang/String;ZZ)Ljava/util/Map;", "getETagHeaders", "", "responseCode", "payload", "eTagHeader", "Ljava/util/Date;", "requestDate", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "isLoadShedderResponse", "isFallbackURL", "getHTTPResultFromCacheOrBackend$purchases_defaultsBc8Release", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZ)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getHTTPResultFromCacheOrBackend", "shouldUseCachedVersion$purchases_defaultsBc8Release", "(I)Z", "shouldUseCachedVersion", "getStoredResult$purchases_defaultsBc8Release", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getStoredResult", "eTagInResponse", "storeBackendResultIfNoError$purchases_defaultsBc8Release", "storeBackendResultIfNoError", "clearCaches$purchases_defaultsBc8Release", "()V", "clearCaches", "Lkotlin/Lazy;", "Lcom/revenuecat/purchases/common/DateProvider;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ETagManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DateProvider dateProvider;
    private final Lazy prefs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.common.networking.ETagManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // ie.InterfaceC5082a
        public final SharedPreferences invoke() {
            return ETagManager.INSTANCE.initializeSharedPreferences(this.$context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagManager$Companion;", "", "()V", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            AbstractC5504s.h(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences_etags", 0);
            AbstractC5504s.g(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationResult.values().length];
            try {
                iArr[VerificationResult.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationResult.NOT_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationResult.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationResult.VERIFIED_ON_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ETagManager(Context context, Lazy prefs, DateProvider dateProvider) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(prefs, "prefs");
        AbstractC5504s.h(dateProvider, "dateProvider");
        this.prefs = prefs;
        this.dateProvider = dateProvider;
    }

    public static /* synthetic */ Map getETagHeaders$purchases_defaultsBc8Release$default(ETagManager eTagManager, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return eTagManager.getETagHeaders$purchases_defaultsBc8Release(str, z10, z11);
    }

    private final HTTPResultWithETag getStoredResultSavedInSharedPreferences(String urlString) {
        String string = ((SharedPreferences) this.prefs.getValue()).getString(urlString, null);
        if (string != null) {
            return HTTPResultWithETag.INSTANCE.deserialize(string);
        }
        return null;
    }

    private final boolean shouldStoreBackendResult(HTTPResult resultFromBackend) {
        int responseCode = resultFromBackend.getResponseCode();
        return (responseCode == 304 || responseCode >= 500 || resultFromBackend.getVerificationResult() == VerificationResult.FAILED) ? false : true;
    }

    private final boolean shouldUseETag(HTTPResultWithETag storedResult, boolean verificationRequested) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[storedResult.getHttpResult().getVerificationResult().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return !verificationRequested;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new r();
    }

    private final synchronized void storeResult(String urlString, HTTPResult result, String eTag) {
        ((SharedPreferences) this.prefs.getValue()).edit().putString(urlString, new HTTPResultWithETag(new ETagData(eTag, this.dateProvider.getNow()), HTTPResult.copy$default(result, 0, null, HTTPResult.Origin.CACHE, null, null, false, false, 123, null)).serialize()).apply();
    }

    public final synchronized void clearCaches$purchases_defaultsBc8Release() {
        ((SharedPreferences) this.prefs.getValue()).edit().clear().apply();
    }

    public final Map<String, String> getETagHeaders$purchases_defaultsBc8Release(String urlString, boolean verificationRequested, boolean refreshETag) {
        ETagData eTagData;
        Date lastRefreshTime;
        AbstractC5504s.h(urlString, "urlString");
        String string = null;
        HTTPResultWithETag storedResultSavedInSharedPreferences = refreshETag ? null : getStoredResultSavedInSharedPreferences(urlString);
        if (storedResultSavedInSharedPreferences == null || (eTagData = storedResultSavedInSharedPreferences.getETagData()) == null || !shouldUseETag(storedResultSavedInSharedPreferences, verificationRequested)) {
            eTagData = null;
        }
        String eTag = eTagData != null ? eTagData.getETag() : null;
        if (eTag == null) {
            eTag = "";
        }
        Pair pairA = z.a("X-RevenueCat-ETag", eTag);
        if (eTagData != null && (lastRefreshTime = eTagData.getLastRefreshTime()) != null) {
            string = Long.valueOf(lastRefreshTime.getTime()).toString();
        }
        return S.l(pairA, z.a(HTTPRequest.ETAG_LAST_REFRESH_NAME, string));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final HTTPResult getHTTPResultFromCacheOrBackend$purchases_defaultsBc8Release(int responseCode, String payload, String eTagHeader, String urlString, boolean refreshETag, Date requestDate, VerificationResult verificationResult, boolean isLoadShedderResponse, boolean isFallbackURL) {
        HTTPResult hTTPResultCopy$default;
        AbstractC5504s.h(payload, "payload");
        AbstractC5504s.h(urlString, "urlString");
        AbstractC5504s.h(verificationResult, "verificationResult");
        HTTPResult hTTPResult = new HTTPResult(responseCode, payload, HTTPResult.Origin.BACKEND, requestDate, verificationResult, isLoadShedderResponse, isFallbackURL);
        if (eTagHeader != null) {
            if (shouldUseCachedVersion$purchases_defaultsBc8Release(responseCode)) {
                HTTPResult storedResult$purchases_defaultsBc8Release = getStoredResult$purchases_defaultsBc8Release(urlString);
                if (storedResult$purchases_defaultsBc8Release != null) {
                    hTTPResultCopy$default = HTTPResult.copy$default(storedResult$purchases_defaultsBc8Release, 0, null, null, requestDate == null ? storedResult$purchases_defaultsBc8Release.getRequestDate() : requestDate, verificationResult, false, false, 103, null);
                } else {
                    hTTPResultCopy$default = null;
                }
                if (hTTPResultCopy$default != null) {
                    return hTTPResultCopy$default;
                }
                if (!refreshETag) {
                    return null;
                }
                LogIntent logIntent = LogIntent.WARNING;
                ETagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1 eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1 = new ETagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1(logIntent, hTTPResult);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke(), null);
                        return hTTPResult;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke(), null);
                        return hTTPResult;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke(), null);
                        return hTTPResult;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                            return hTTPResult;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke(), null);
                        return hTTPResult;
                }
            } else {
                storeBackendResultIfNoError$purchases_defaultsBc8Release(urlString, hTTPResult, eTagHeader);
            }
        }
        return hTTPResult;
    }

    public final HTTPResult getStoredResult$purchases_defaultsBc8Release(String urlString) {
        AbstractC5504s.h(urlString, "urlString");
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(urlString);
        if (storedResultSavedInSharedPreferences != null) {
            return storedResultSavedInSharedPreferences.getHttpResult();
        }
        return null;
    }

    public final boolean shouldUseCachedVersion$purchases_defaultsBc8Release(int responseCode) {
        return responseCode == 304;
    }

    public final void storeBackendResultIfNoError$purchases_defaultsBc8Release(String urlString, HTTPResult resultFromBackend, String eTagInResponse) {
        AbstractC5504s.h(urlString, "urlString");
        AbstractC5504s.h(resultFromBackend, "resultFromBackend");
        AbstractC5504s.h(eTagInResponse, "eTagInResponse");
        if (shouldStoreBackendResult(resultFromBackend)) {
            storeResult(urlString, resultFromBackend, eTagInResponse);
        }
    }

    public /* synthetic */ ETagManager(Context context, Lazy lazy, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? AbstractC2163n.b(new AnonymousClass1(context)) : lazy, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
