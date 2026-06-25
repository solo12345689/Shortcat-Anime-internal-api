package com.revenuecat.purchases.identity;

import Df.p;
import Df.r;
import Td.L;
import Zd.e;
import Zd.k;
import ae.AbstractC2605b;
import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010\u001cJ\u001d\u0010'\u001a\u00020\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b)\u0010\u001cJ\u0018\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b+\u0010,JC\u00103\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00142\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170.2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001700¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0014¢\u0006\u0004\b5\u0010\u001cJ#\u00107\u001a\u00020\u00172\u0014\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020\u001700¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0010¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u0011\u0010D\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bC\u0010\"¨\u0006F"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "subscriberAttributesCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "", "uiPreviewMode", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/Dispatcher;Z)V", "", "oldAppUserId", "newAppUserId", "LTd/L;", "copySubscriberAttributesToNewUserIfOldIsAnonymous", "(Ljava/lang/String;Ljava/lang/String;)V", "appUserID", "invalidateETagCacheIfNeeded", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "shouldInvalidateETagCache", "(Lcom/revenuecat/purchases/CustomerInfo;)Z", "generateRandomID", "()Ljava/lang/String;", "newUserID", "resetAndSaveUserID", "Lkotlin/Function0;", "command", "enqueue", "(Lie/a;)V", "configure", "oldAppUserID", "aliasCurrentUserIdTo", "(Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "newAppUserID", "Lkotlin/Function2;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "logIn", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "switchUser", "completion", "logOut", "(Lkotlin/jvm/functions/Function1;)V", "currentUserIsAnonymous", "()Z", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Z", "getCurrentAppUserID", "currentAppUserID", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IdentityManager {
    public static final String UI_PREVIEW_MODE_APP_USER_ID = "$RC_PREVIEW_MODE_USER";
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final OfferingsCache offeringsCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final boolean uiPreviewMode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final p anonymousIdRegex = new p("^\\$RCAnonymousID:([a-f0-9]{32})$");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager$Companion;", "", "<init>", "()V", "", "appUserID", "", "isUserIDAnonymous", "(Ljava/lang/String;)Z", "UI_PREVIEW_MODE_APP_USER_ID", "Ljava/lang/String;", "LDf/p;", "anonymousIdRegex", "LDf/p;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isUserIDAnonymous(String appUserID) {
            AbstractC5504s.h(appUserID, "appUserID");
            return IdentityManager.anonymousIdRegex.h(appUserID);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$configure$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        AnonymousClass2() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m262invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m262invoke() {
            IdentityManager.this.deviceCache.cleanupOldAttributionData$purchases_defaultsBc8Release();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ String $oldAppUserID;
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function2 $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$4$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
            final /* synthetic */ String $newAppUserID;
            final /* synthetic */ String $oldAppUserID;
            final /* synthetic */ Function2 $onSuccess;
            final /* synthetic */ IdentityManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IdentityManager identityManager, Function2 function2, String str, String str2) {
                super(2);
                this.this$0 = identityManager;
                this.$onSuccess = function2;
                this.$oldAppUserID = str;
                this.$newAppUserID = str2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
                return L.f17438a;
            }

            public final void invoke(CustomerInfo customerInfo, boolean z10) {
                LogHandler currentLogHandler;
                String str;
                String str2;
                AbstractC5504s.h(customerInfo, "customerInfo");
                IdentityManager identityManager = this.this$0;
                String str3 = this.$oldAppUserID;
                String str4 = this.$newAppUserID;
                synchronized (identityManager) {
                    try {
                        LogIntent logIntent = LogIntent.USER;
                        IdentityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1 identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1 = new IdentityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1(logIntent, str4, z10);
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                            case 1:
                                LogLevel logLevel = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    str = "[Purchases] - " + logLevel.name();
                                    str2 = (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel2 = LogLevel.WARN;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                }
                                break;
                            case 4:
                                LogLevel logLevel3 = LogLevel.INFO;
                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                }
                                break;
                            case 5:
                                LogLevel logLevel4 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                    str = "[Purchases] - " + logLevel4.name();
                                    str2 = (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel5 = LogLevel.INFO;
                                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                }
                                break;
                            case 8:
                                LogLevel logLevel6 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                    str = "[Purchases] - " + logLevel6.name();
                                    str2 = (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                }
                                break;
                            case 9:
                                LogLevel logLevel7 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                    str = "[Purchases] - " + logLevel7.name();
                                    str2 = (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                }
                                break;
                            case 10:
                                LogLevel logLevel8 = LogLevel.WARN;
                                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                }
                                break;
                            case 11:
                                LogLevel logLevel9 = LogLevel.WARN;
                                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                }
                                break;
                            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                break;
                            case 13:
                                LogLevel logLevel10 = LogLevel.WARN;
                                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                }
                                break;
                            case 14:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                break;
                        }
                        identityManager.deviceCache.clearCachesForAppUserID$purchases_defaultsBc8Release(str3);
                        identityManager.offeringsCache.clearCache();
                        identityManager.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str3);
                        identityManager.deviceCache.cacheAppUserID$purchases_defaultsBc8Release(str4);
                        identityManager.deviceCache.cacheCustomerInfo$purchases_defaultsBc8Release(str4, customerInfo);
                        identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str3, str4);
                        identityManager.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                        L l10 = L.f17438a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.$onSuccess.invoke(customerInfo, Boolean.valueOf(z10));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str, String str2, Function1 function1, Function2 function2) {
            super(0);
            this.$oldAppUserID = str;
            this.$newAppUserID = str2;
            this.$onError = function1;
            this.$onSuccess = function2;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m263invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m263invoke() {
            Backend backend = IdentityManager.this.backend;
            String str = this.$oldAppUserID;
            String str2 = this.$newAppUserID;
            backend.logIn(str, str2, new AnonymousClass1(IdentityManager.this, this.$onSuccess, str, str2), this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logOut$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Function1 $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Function1 function1) {
            super(0);
            this.$completion = function1;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m264invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m264invoke() {
            LogHandler currentLogHandler;
            String str;
            String str2;
            IdentityManager identityManager = IdentityManager.this;
            identityManager.resetAndSaveUserID(identityManager.generateRandomID());
            LogIntent logIntent = LogIntent.USER;
            IdentityManager$logOut$3$invoke$$inlined$log$1 identityManager$logOut$3$invoke$$inlined$log$1 = new IdentityManager$logOut$3$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            this.$completion.invoke(null);
        }
    }

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, Dispatcher dispatcher, boolean z10) {
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(subscriberAttributesCache, "subscriberAttributesCache");
        AbstractC5504s.h(subscriberAttributesManager, "subscriberAttributesManager");
        AbstractC5504s.h(offeringsCache, "offeringsCache");
        AbstractC5504s.h(backend, "backend");
        AbstractC5504s.h(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC5504s.h(dispatcher, "dispatcher");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.dispatcher = dispatcher;
        this.uiPreviewMode = z10;
    }

    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String oldAppUserId, String newAppUserId) {
        if (INSTANCE.isUserIDAnonymous(oldAppUserId)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(oldAppUserId, newAppUserId);
        }
    }

    private final synchronized void enqueue(final InterfaceC5082a command) {
        this.dispatcher.enqueue(new Runnable() { // from class: com.revenuecat.purchases.identity.a
            @Override // java.lang.Runnable
            public final void run() {
                command.invoke();
            }
        }, Delay.NONE);
    }

    public final String generateRandomID() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$RCAnonymousID:");
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "randomUUID().toString()");
        Locale ROOT = Locale.ROOT;
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase = string.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        String strK = r.K(lowerCase, "-", "", false, 4, null);
        LogIntent logIntent = LogIntent.USER;
        IdentityManager$generateRandomID$lambda$12$$inlined$log$1 identityManager$generateRandomID$lambda$12$$inlined$log$1 = new IdentityManager$generateRandomID$lambda$12$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
        }
        sb2.append(strK);
        return sb2.toString();
    }

    private final void invalidateETagCacheIfNeeded(String appUserID) {
        if (!AbstractC5504s.c(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE) && shouldInvalidateETagCache(this.deviceCache.getCachedCustomerInfo$purchases_defaultsBc8Release(appUserID))) {
            LogLevel logLevel = LogLevel.INFO;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.i("[Purchases] - " + logLevel.name(), IdentityStrings.INVALIDATING_CACHED_ETAG_CACHE);
            }
            this.backend.clearCaches();
        }
    }

    public final synchronized void resetAndSaveUserID(String newUserID) {
        this.deviceCache.clearCachesForAppUserID$purchases_defaultsBc8Release(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID$purchases_defaultsBc8Release(newUserID);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateETagCache(CustomerInfo customerInfo) {
        return (customerInfo == null || customerInfo.getEntitlements().getVerification() != VerificationResult.NOT_REQUESTED || AbstractC5504s.c(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) ? false : true;
    }

    public final Object aliasCurrentUserIdTo(String str, e eVar) throws Throwable {
        String currentAppUserID = getCurrentAppUserID();
        k kVar = new k(AbstractC2605b.c(eVar));
        this.backend.aliasUsers(str, currentAppUserID, new IdentityManager$aliasCurrentUserIdTo$2$1(this, kVar, currentAppUserID, str), new IdentityManager$aliasCurrentUserIdTo$2$2(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            h.c(eVar);
        }
        return objA == AbstractC2605b.f() ? objA : L.f17438a;
    }

    public final synchronized void configure(String appUserID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            if (this.uiPreviewMode) {
                LogIntent logIntent = LogIntent.USER;
                IdentityManager$configure$$inlined$log$1 identityManager$configure$$inlined$log$1 = new IdentityManager$configure$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                }
                appUserID = UI_PREVIEW_MODE_APP_USER_ID;
            } else if (appUserID == null || r.l0(appUserID)) {
                if (appUserID != null && r.l0(appUserID)) {
                    LogIntent logIntent2 = LogIntent.WARNING;
                    IdentityManager$configure$$inlined$log$2 identityManager$configure$$inlined$log$2 = new IdentityManager$configure$$inlined$log$2(logIntent2);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                    }
                }
                appUserID = this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
                if (appUserID == null && (appUserID = this.deviceCache.getLegacyCachedAppUserID$purchases_defaultsBc8Release()) == null) {
                    appUserID = generateRandomID();
                }
            }
            LogIntent logIntent3 = LogIntent.USER;
            IdentityManager$configure$$inlined$log$3 identityManager$configure$$inlined$log$3 = new IdentityManager$configure$$inlined$log$3(logIntent3, appUserID);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                case 1:
                    LogLevel logLevel21 = LogLevel.DEBUG;
                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel22 = LogLevel.WARN;
                    LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel23 = LogLevel.INFO;
                    LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel24 = LogLevel.DEBUG;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel25 = LogLevel.INFO;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel26 = LogLevel.DEBUG;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel27 = LogLevel.DEBUG;
                    LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel28 = LogLevel.WARN;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel29 = LogLevel.WARN;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel30 = LogLevel.WARN;
                    LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
            }
            SharedPreferences.Editor editorStartEditing$purchases_defaultsBc8Release = this.deviceCache.startEditing$purchases_defaultsBc8Release();
            this.deviceCache.cacheAppUserID$purchases_defaultsBc8Release(appUserID, editorStartEditing$purchases_defaultsBc8Release);
            this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(appUserID, editorStartEditing$purchases_defaultsBc8Release);
            invalidateETagCacheIfNeeded(appUserID);
            editorStartEditing$purchases_defaultsBc8Release.apply();
            enqueue(new AnonymousClass2());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean currentUserIsAnonymous() {
        Companion companion;
        String cachedAppUserID$purchases_defaultsBc8Release;
        try {
            companion = INSTANCE;
            cachedAppUserID$purchases_defaultsBc8Release = this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
            if (cachedAppUserID$purchases_defaultsBc8Release == null) {
                cachedAppUserID$purchases_defaultsBc8Release = "";
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return companion.isUserIDAnonymous(cachedAppUserID$purchases_defaultsBc8Release) || AbstractC5504s.c(this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release(), this.deviceCache.getLegacyCachedAppUserID$purchases_defaultsBc8Release());
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID$purchases_defaultsBc8Release = this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
        return cachedAppUserID$purchases_defaultsBc8Release == null ? "" : cachedAppUserID$purchases_defaultsBc8Release;
    }

    public final void logIn(String newAppUserID, Function2 onSuccess, Function1 onError) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(newAppUserID, "newAppUserID");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        if (AbstractC5504s.c(getCurrentAppUserID(), UI_PREVIEW_MODE_APP_USER_ID) || AbstractC5504s.c(newAppUserID, UI_PREVIEW_MODE_APP_USER_ID)) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnsupportedError, IdentityStrings.OPERATION_NOT_SUPPORTED_IN_PREVIEW_MODE);
            LogUtilsKt.errorLog(purchasesError);
            onError.invoke(purchasesError);
            return;
        }
        if (r.l0(newAppUserID)) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError2);
            onError.invoke(purchasesError2);
            return;
        }
        LogIntent logIntent = LogIntent.USER;
        IdentityManager$logIn$$inlined$log$1 identityManager$logIn$$inlined$log$1 = new IdentityManager$logIn$$inlined$log$1(logIntent, this, newAppUserID);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(newAppUserID, new AnonymousClass4(getCurrentAppUserID(), newAppUserID, onError, onSuccess));
    }

    public final synchronized void logOut(Function1 completion) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(completion, "completion");
        if (AbstractC5504s.c(getCurrentAppUserID(), UI_PREVIEW_MODE_APP_USER_ID)) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnsupportedError, IdentityStrings.OPERATION_NOT_SUPPORTED_IN_PREVIEW_MODE);
            LogUtilsKt.errorLog(purchasesError);
            completion.invoke(purchasesError);
            return;
        }
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new AnonymousClass3(completion));
            return;
        }
        LogIntent logIntent = LogIntent.RC_ERROR;
        IdentityManager$logOut$$inlined$log$1 identityManager$logOut$$inlined$log$1 = new IdentityManager$logOut$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
        }
        completion.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
    }

    public final void switchUser(String newAppUserID) {
        AbstractC5504s.h(newAppUserID, "newAppUserID");
        if (AbstractC5504s.c(getCurrentAppUserID(), UI_PREVIEW_MODE_APP_USER_ID) || AbstractC5504s.c(newAppUserID, UI_PREVIEW_MODE_APP_USER_ID)) {
            LogUtilsKt.errorLog(new PurchasesError(PurchasesErrorCode.UnsupportedError, IdentityStrings.OPERATION_NOT_SUPPORTED_IN_PREVIEW_MODE));
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str = "[Purchases] - " + logLevel.name();
            String str2 = String.format(IdentityStrings.SWITCHING_USER, Arrays.copyOf(new Object[]{newAppUserID}, 1));
            AbstractC5504s.g(str2, "format(...)");
            currentLogHandler.d(str, str2);
        }
        resetAndSaveUserID(newAppUserID);
    }

    public /* synthetic */ IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, Dispatcher dispatcher, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend, offlineEntitlementsManager, dispatcher, (i10 & 128) != 0 ? false : z10);
    }
}
