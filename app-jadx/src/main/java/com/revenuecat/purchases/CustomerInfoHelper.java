package com.revenuecat.purchases;

import Td.L;
import Td.r;
import Ud.S;
import android.os.Handler;
import android.os.Looper;
import app.notifee.core.event.LogEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.SyncPendingPurchaseResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.utils.Result;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b \u0010!JC\u0010%\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\"\b\u0002\u0010\u001b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b'\u0010!J?\u0010(\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b(\u0010!J\u0019\u0010)\u001a\u0004\u0018\u00010#2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010/J/\u00105\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u000e2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\u001a2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a07H\u0002¢\u0006\u0004\b9\u0010:JC\u0010=\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010;\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010<¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010G¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "", "uiPreviewMode", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;ZLcom/revenuecat/purchases/common/DateProvider;Landroid/os/Handler;)V", "", "appUserID", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfoDataResult;", "LTd/L;", "callback", "getCustomerInfoCacheOnly", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "appInBackground", "allowSharingPlayStoreAccount", "postPendingPurchasesAndFetchCustomerInfo", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "getCustomerInfoFetchOnly", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "getCustomerInfoCachedOrFetched", "getCustomerInfoNotStaledCachedOrFetched", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "updateCachedCustomerInfoIfStale", "(Ljava/lang/String;ZZ)V", "trackDiagnostics", "trackGetCustomerInfoStartedIfNeeded", "(Z)V", "Ljava/util/Date;", "startTime", "customerInfoDataResult", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "cacheFetchPolicy", "trackGetCustomerInfoResultIfNeeded", "(ZLjava/util/Date;Lcom/revenuecat/purchases/CustomerInfoDataResult;Lcom/revenuecat/purchases/CacheFetchPolicy;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lie/a;)V", "fetchPolicy", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "retrieveCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CacheFetchPolicy;ZZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Z", "Lcom/revenuecat/purchases/common/DateProvider;", "Landroid/os/Handler;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfoHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler handler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final boolean uiPreviewMode;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper$Companion;", "", "()V", "createPreviewCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "createPreviewCustomerInfo$purchases_defaultsBc8Release", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CustomerInfo createPreviewCustomerInfo$purchases_defaultsBc8Release() throws JSONException {
            Date date = new Date();
            EntitlementInfos entitlementInfos = new EntitlementInfos(S.i(), VerificationResult.NOT_REQUESTED);
            Map mapI = S.i();
            Map mapI2 = S.i();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, new JSONObject());
            jSONObject2.put(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS, new JSONObject());
            L l10 = L.f17438a;
            jSONObject.put(CustomerInfoResponseJsonKeys.SUBSCRIBER, jSONObject2);
            return new CustomerInfo(entitlementInfos, mapI, mapI2, date, 3, date, IdentityManager.UI_PREVIEW_MODE_APP_USER_ID, null, null, jSONObject);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            try {
                iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ Function1 $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function1 function1, CustomerInfo customerInfo) {
            super(0);
            this.$callback = function1;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m123invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m123invoke() {
            this.$callback.invoke(new CustomerInfoDataResult(new Result.Success(this.$cachedCustomerInfo), null, 2, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Function1 function1, PurchasesError purchasesError) {
            super(0);
            this.$callback = function1;
            this.$error = purchasesError;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m124invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m124invoke() {
            this.$callback.invoke(new CustomerInfoDataResult(new Result.Error(this.$error), null, 2, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40212 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ Function1 $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40212(Function1 function1, CustomerInfo customerInfo) {
            super(0);
            this.$callback = function1;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m125invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m125invoke() {
            Function1 function1 = this.$callback;
            if (function1 != null) {
                function1.invoke(new CustomerInfoDataResult(new Result.Success(this.$cachedCustomerInfo), null, 2, null));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", LogEvent.LEVEL_INFO, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ Function1 $callback;
            final /* synthetic */ CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Function1 function1, CustomerInfo customerInfo) {
                super(0);
                this.$callback = function1;
                this.$info = customerInfo;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m126invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m126invoke() {
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new Result.Success(this.$info));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1) {
            super(1);
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo info) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            AbstractC5504s.h(info, "info");
            LogIntent logIntent = LogIntent.RC_SUCCESS;
            CustomerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1 customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            CustomerInfoHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            CustomerInfoHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(info);
            CustomerInfoHelper.this.dispatch(new AnonymousClass2(this.$callback, info));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40222 extends AbstractC5506u implements Function2 {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Function1 $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "offlineComputedCustomerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06552 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                final /* synthetic */ Function1 $callback;
                final /* synthetic */ CustomerInfo $offlineComputedCustomerInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function1 function1, CustomerInfo customerInfo) {
                    super(0);
                    this.$callback = function1;
                    this.$offlineComputedCustomerInfo = customerInfo;
                }

                @Override // ie.InterfaceC5082a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m127invoke();
                    return L.f17438a;
                }

                /* JADX INFO: renamed from: invoke */
                public final void m127invoke() {
                    Function1 function1 = this.$callback;
                    if (function1 != null) {
                        function1.invoke(new Result.Success(this.$offlineComputedCustomerInfo));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06552(CustomerInfoHelper customerInfoHelper, Function1 function1) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return L.f17438a;
            }

            public final void invoke(CustomerInfo offlineComputedCustomerInfo) {
                AbstractC5504s.h(offlineComputedCustomerInfo, "offlineComputedCustomerInfo");
                this.this$0.customerInfoUpdateHandler.notifyListeners(offlineComputedCustomerInfo);
                this.this$0.dispatch(new AnonymousClass1(this.$callback, offlineComputedCustomerInfo));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$3 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ Function1 $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$3$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                final /* synthetic */ PurchasesError $backendError;
                final /* synthetic */ Function1 $callback;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function1 function1, PurchasesError purchasesError) {
                    super(0);
                    this.$callback = function1;
                    this.$backendError = purchasesError;
                }

                @Override // ie.InterfaceC5082a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m128invoke();
                    return L.f17438a;
                }

                /* JADX INFO: renamed from: invoke */
                public final void m128invoke() {
                    Function1 function1 = this.$callback;
                    if (function1 != null) {
                        function1.invoke(new Result.Error(this.$backendError));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CustomerInfoHelper customerInfoHelper, Function1 function1, PurchasesError purchasesError) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = function1;
                this.$backendError = purchasesError;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC5504s.h(it, "it");
                this.this$0.dispatch(new AnonymousClass1(this.$callback, this.$backendError));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$4 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass4 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Function1 function1, PurchasesError purchasesError) {
                super(0);
                this.$callback = function1;
                this.$backendError = purchasesError;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m129invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m129invoke() {
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new Result.Error(this.$backendError));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40222(String str, Function1 function1) {
            super(2);
            this.$appUserID = str;
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }

        public final void invoke(PurchasesError backendError, boolean z10) {
            AbstractC5504s.h(backendError, "backendError");
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String str = String.format(CustomerInfoStrings.ERROR_FETCHING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{backendError}, 1));
            AbstractC5504s.g(str, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", str, null);
            CustomerInfoHelper.this.deviceCache.clearCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(this.$appUserID);
            if (CustomerInfoHelper.this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z10, this.$appUserID)) {
                CustomerInfoHelper.this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(this.$appUserID, new C06552(CustomerInfoHelper.this, this.$callback), new AnonymousClass3(CustomerInfoHelper.this, this.$callback, backendError));
            } else {
                CustomerInfoHelper.this.dispatch(new AnonymousClass4(this.$callback, backendError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "syncResult", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/SyncPendingPurchaseResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40231 extends AbstractC5506u implements Function1 {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Function1 $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ Function1 $callback;
            final /* synthetic */ SyncPendingPurchaseResult $syncResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Function1 function1, SyncPendingPurchaseResult syncPendingPurchaseResult) {
                super(0);
                this.$callback = function1;
                this.$syncResult = syncPendingPurchaseResult;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m130invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m130invoke() {
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new CustomerInfoDataResult(new Result.Success(((SyncPendingPurchaseResult.Success) this.$syncResult).getCustomerInfo()), Boolean.TRUE));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$3 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Function1 function1) {
                super(1);
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Result<CustomerInfo, PurchasesError>) obj);
                return L.f17438a;
            }

            public final void invoke(Result<CustomerInfo, PurchasesError> result) {
                AbstractC5504s.h(result, "result");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new CustomerInfoDataResult(result, Boolean.TRUE));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$4 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass4 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Function1 function1) {
                super(1);
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Result<CustomerInfo, PurchasesError>) obj);
                return L.f17438a;
            }

            public final void invoke(Result<CustomerInfo, PurchasesError> result) {
                AbstractC5504s.h(result, "result");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new CustomerInfoDataResult(result, null, 2, null));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$5 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass5 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(Function1 function1) {
                super(1);
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Result<CustomerInfo, PurchasesError>) obj);
                return L.f17438a;
            }

            public final void invoke(Result<CustomerInfo, PurchasesError> result) {
                AbstractC5504s.h(result, "result");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new CustomerInfoDataResult(result, Boolean.FALSE));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40231(String str, boolean z10, Function1 function1) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z10;
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SyncPendingPurchaseResult) obj);
            return L.f17438a;
        }

        public final void invoke(SyncPendingPurchaseResult syncResult) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            AbstractC5504s.h(syncResult, "syncResult");
            if (!(syncResult instanceof SyncPendingPurchaseResult.Success)) {
                if (syncResult instanceof SyncPendingPurchaseResult.Error) {
                    CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new AnonymousClass3(this.$callback));
                    return;
                } else if (syncResult instanceof SyncPendingPurchaseResult.AutoSyncDisabled) {
                    CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new AnonymousClass4(this.$callback));
                    return;
                } else {
                    if (syncResult instanceof SyncPendingPurchaseResult.NoPendingPurchasesToSync) {
                        CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new AnonymousClass5(this.$callback));
                        return;
                    }
                    return;
                }
            }
            LogIntent logIntent = LogIntent.RC_SUCCESS;
            CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1 customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1 = new CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            CustomerInfoHelper.this.dispatch(new AnonymousClass2(this.$callback, syncResult));
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, DiagnosticsTracker diagnosticsTracker, boolean z10, DateProvider dateProvider, Handler handler) {
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(backend, "backend");
        AbstractC5504s.h(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC5504s.h(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        AbstractC5504s.h(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        AbstractC5504s.h(dateProvider, "dateProvider");
        AbstractC5504s.h(handler, "handler");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.uiPreviewMode = z10;
        this.dateProvider = dateProvider;
        this.handler = handler;
    }

    public final void dispatch(final InterfaceC5082a action) {
        if (AbstractC5504s.c(Thread.currentThread(), this.handler.getLooper().getThread())) {
            action.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: com.revenuecat.purchases.a
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

    private final void getCustomerInfoCacheOnly(String appUserID, Function1 callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (callback == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(new AnonymousClass3(callback, purchasesError));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        CustomerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1 customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
        }
        dispatch(new AnonymousClass2(callback, cachedCustomerInfo));
    }

    private final void getCustomerInfoCachedOrFetched(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, Function1 callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo == null) {
            LogIntent logIntent = LogIntent.DEBUG;
            CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2 customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2 = new CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
            }
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
            return;
        }
        LogIntent logIntent2 = LogIntent.DEBUG;
        CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1 customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    str = "[Purchases] - " + logLevel11.name();
                    str2 = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    str = "[Purchases] - " + logLevel14.name();
                    str2 = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    str = "[Purchases] - " + logLevel16.name();
                    str2 = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    str = "[Purchases] - " + logLevel17.name();
                    str2 = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
        }
        dispatch(new C40212(callback, cachedCustomerInfo));
        updateCachedCustomerInfoIfStale(appUserID, appInBackground, allowSharingPlayStoreAccount);
    }

    static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z10, z11, function1);
    }

    public final void getCustomerInfoFetchOnly(String appUserID, boolean appInBackground, Function1 callback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow$purchases_defaultsBc8Release(appUserID);
        this.backend.getCustomerInfo(appUserID, appInBackground, new AnonymousClass1(callback), new C40222(appUserID, callback));
    }

    static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z10, function1);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, Function1 callback) {
        if (this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsBc8Release(appUserID, appInBackground)) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        }
    }

    static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z10, z11, function1);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, Function1 callback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(allowSharingPlayStoreAccount, new C40231(appUserID, appInBackground, callback));
    }

    static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, function1);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z10, boolean z11, boolean z12, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        boolean z13 = z12;
        if ((i10 & 32) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z10, z11, z13, receiveCustomerInfoCallback);
    }

    public final void trackGetCustomerInfoResultIfNeeded(boolean trackDiagnostics, Date startTime, CustomerInfoDataResult customerInfoDataResult, CacheFetchPolicy cacheFetchPolicy) {
        CustomerInfo customerInfo;
        PurchasesError purchasesError;
        PurchasesErrorCode code;
        EntitlementInfos entitlements;
        if (!trackDiagnostics || this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long jBetween = DurationExtensionsKt.between(Ef.a.f5961b, startTime, this.dateProvider.getNow());
        Result<CustomerInfo, PurchasesError> result = customerInfoDataResult.getResult();
        Integer numValueOf = null;
        if (result instanceof Result.Success) {
            customerInfo = (CustomerInfo) ((Result.Success) customerInfoDataResult.getResult()).getValue();
        } else {
            if (!(result instanceof Result.Error)) {
                throw new r();
            }
            customerInfo = null;
        }
        Result<CustomerInfo, PurchasesError> result2 = customerInfoDataResult.getResult();
        if (result2 instanceof Result.Success) {
            purchasesError = null;
        } else {
            if (!(result2 instanceof Result.Error)) {
                throw new r();
            }
            purchasesError = (PurchasesError) ((Result.Error) customerInfoDataResult.getResult()).getValue();
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        VerificationResult verification = (customerInfo == null || (entitlements = customerInfo.getEntitlements()) == null) ? null : entitlements.getVerification();
        Boolean hadUnsyncedPurchasesBefore = customerInfoDataResult.getHadUnsyncedPurchasesBefore();
        String message = purchasesError != null ? purchasesError.getMessage() : null;
        if (purchasesError != null && (code = purchasesError.getCode()) != null) {
            numValueOf = Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.m233trackGetCustomerInfoResult17CK4j0(cacheFetchPolicy, verification, hadUnsyncedPurchasesBefore, message, numValueOf, jBetween);
    }

    private final void trackGetCustomerInfoStartedIfNeeded(boolean trackDiagnostics) {
        DiagnosticsTracker diagnosticsTracker;
        if (!trackDiagnostics || (diagnosticsTracker = this.diagnosticsTrackerIfEnabled) == null) {
            return;
        }
        diagnosticsTracker.trackGetCustomerInfoStarted();
    }

    private final void updateCachedCustomerInfoIfStale(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsBc8Release(appUserID, appInBackground)) {
            LogIntent logIntent = LogIntent.DEBUG;
            CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 = new CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1(logIntent, appInBackground);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
            }
            postPendingPurchasesAndFetchCustomerInfo$default(this, appUserID, appInBackground, allowSharingPlayStoreAccount, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(String appUserID, CacheFetchPolicy fetchPolicy, boolean appInBackground, boolean allowSharingPlayStoreAccount, boolean trackDiagnostics, ReceiveCustomerInfoCallback callback) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(fetchPolicy, "fetchPolicy");
        if (this.uiPreviewMode) {
            if (callback != null) {
                dispatch(new CustomerInfoHelper$retrieveCustomerInfo$1$1(callback));
                return;
            }
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str = "[Purchases] - " + logLevel.name();
            String str2 = String.format(CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{fetchPolicy}, 1));
            AbstractC5504s.g(str2, "format(...)");
            currentLogHandler.d(str, str2);
        }
        trackGetCustomerInfoStartedIfNeeded(trackDiagnostics);
        CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 = (callback != null || trackDiagnostics) ? new CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1(this, trackDiagnostics, this.dateProvider.getNow(), fetchPolicy, callback) : null;
        int i10 = WhenMappings.$EnumSwitchMapping$0[fetchPolicy.ordinal()];
        if (i10 == 1) {
            getCustomerInfoCacheOnly(appUserID, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
            return;
        }
        if (i10 == 2) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        } else if (i10 == 3) {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        } else {
            if (i10 != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        }
    }

    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, DiagnosticsTracker diagnosticsTracker, boolean z10, DateProvider dateProvider, Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, diagnosticsTracker, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? new DefaultDateProvider() : dateProvider, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
