package com.revenuecat.purchases;

import Td.L;
import Ud.AbstractC2279u;
import Ud.a0;
import app.notifee.core.event.LogEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadata;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadataStore;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.Result;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0001jBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010\"\u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\"\u0010#Jy\u00104\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u001e2$\u0010 \u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001f00j\u0002`3H\u0002¢\u0006\u0004\b4\u00105J+\u00107\u001a\u000206*\u00020\u00122\u0006\u0010&\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b7\u00108J\u008b\u0001\u0010>\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020'2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u001e2$\u0010 \u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001f00j\u0002`3H\u0002¢\u0006\u0004\b>\u0010?JA\u0010B\u001a\u00020\u001f2\u0006\u0010@\u001a\u0002012\u0006\u0010%\u001a\u00020$2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0AH\u0002¢\u0006\u0004\bB\u0010CJ?\u0010D\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\bD\u0010EJi\u0010G\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010'¢\u0006\u0004\bG\u0010HJ\u009f\u0001\u0010T\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020I2\b\u0010L\u001a\u0004\u0018\u00010K2\u0014\u0010O\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020N\u0018\u00010M2\u0006\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010P\u001a\u00020'2\"\b\u0002\u0010!\u001a\u001c\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010Qj\u0004\u0018\u0001`R2\"\b\u0002\u0010 \u001a\u001c\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f\u0018\u00010Qj\u0004\u0018\u0001`S¢\u0006\u0004\bT\u0010UJa\u0010Z\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010V\u001a\u00020'2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020$0W2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001f0A2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\bZ\u0010[R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010]R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010^R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010bR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010cR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010dR\u0014\u0010g\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010<\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;", "localTransactionMetadataStore", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;)V", "", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "transactionMetadataToSync", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "results", "Lkotlin/Function1;", "LTd/L;", "onError", "onSuccess", "callTransactionMetadataCompletionFromResults", "(Ljava/util/List;Ljava/util/concurrent/ConcurrentLinkedQueue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "appUserID", "purchaseToken", "", "isRestore", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lcom/revenuecat/purchases/models/PurchaseState;", "purchaseState", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "postReceiptAndSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/models/PurchaseState;Lkotlin/jvm/functions/Function1;Lie/o;)V", "Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "getOrPutDataToPost", "(Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;)Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallData", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "hasCachedTransactionMetadata", "performPostReceipt", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLkotlin/jvm/functions/Function1;Lie/o;)V", "errorHandlingBehavior", "Lkotlin/Function0;", "useOfflineEntitlementsCustomerInfoIfNeeded", "(Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lie/a;)V", "calculateOfflineCustomerInfo", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "isAutoRenewing", "postTokenWithoutConsuming", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptionForProductIDs", "sdkOriginated", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "postTransactionAndConsumeIfNeeded", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/util/Map;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "allowSharingPlayStoreAccount", "", "pendingTransactionsTokens", "onNoTransactionsToSync", "postRemainingCachedTransactionMetadata", "(Ljava/lang/String;ZLjava/util/Set;Lie/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;", "getFinishTransactions", "()Z", "finishTransactions", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "CachedDataToPost", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final LocalTransactionMetadataStore localTransactionMetadataStore;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "", "localTransactionMetadata", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "paywallEvent", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "didCacheData", "", "(Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Z)V", "getDidCacheData", "()Z", "getLocalTransactionMetadata", "()Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "getPaywallEvent", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class CachedDataToPost {
        private final boolean didCacheData;
        private final LocalTransactionMetadata localTransactionMetadata;
        private final PaywallEvent paywallEvent;

        public CachedDataToPost(LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean z10) {
            this.localTransactionMetadata = localTransactionMetadata;
            this.paywallEvent = paywallEvent;
            this.didCacheData = z10;
        }

        public static /* synthetic */ CachedDataToPost copy$default(CachedDataToPost cachedDataToPost, LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                localTransactionMetadata = cachedDataToPost.localTransactionMetadata;
            }
            if ((i10 & 2) != 0) {
                paywallEvent = cachedDataToPost.paywallEvent;
            }
            if ((i10 & 4) != 0) {
                z10 = cachedDataToPost.didCacheData;
            }
            return cachedDataToPost.copy(localTransactionMetadata, paywallEvent, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LocalTransactionMetadata getLocalTransactionMetadata() {
            return this.localTransactionMetadata;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PaywallEvent getPaywallEvent() {
            return this.paywallEvent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getDidCacheData() {
            return this.didCacheData;
        }

        public final CachedDataToPost copy(LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean didCacheData) {
            return new CachedDataToPost(localTransactionMetadata, paywallEvent, didCacheData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedDataToPost)) {
                return false;
            }
            CachedDataToPost cachedDataToPost = (CachedDataToPost) other;
            return AbstractC5504s.c(this.localTransactionMetadata, cachedDataToPost.localTransactionMetadata) && AbstractC5504s.c(this.paywallEvent, cachedDataToPost.paywallEvent) && this.didCacheData == cachedDataToPost.didCacheData;
        }

        public final boolean getDidCacheData() {
            return this.didCacheData;
        }

        public final LocalTransactionMetadata getLocalTransactionMetadata() {
            return this.localTransactionMetadata;
        }

        public final PaywallEvent getPaywallEvent() {
            return this.paywallEvent;
        }

        public int hashCode() {
            LocalTransactionMetadata localTransactionMetadata = this.localTransactionMetadata;
            int iHashCode = (localTransactionMetadata == null ? 0 : localTransactionMetadata.hashCode()) * 31;
            PaywallEvent paywallEvent = this.paywallEvent;
            return ((iHashCode + (paywallEvent != null ? paywallEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.didCacheData);
        }

        public String toString() {
            return "CachedDataToPost(localTransactionMetadata=" + this.localTransactionMetadata + ", paywallEvent=" + this.paywallEvent + ", didCacheData=" + this.didCacheData + ')';
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1) {
            super(1);
            this.$onSuccess = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            PostReceiptHelper.this.customerInfoUpdateHandler.notifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function1 function1) {
            super(1);
            this.$onError = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            this.$onError.invoke(error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$performPostReceipt$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "unsyncedSubscriberAttributesByKey", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40351 extends AbstractC5506u implements Function1 {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ boolean $hasCachedTransactionMetadata;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ InterfaceC5096o $onError;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ PaywallPostReceiptData $paywallData;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ PurchasesAreCompletedBy $purchasesAreCompletedBy;
        final /* synthetic */ ReceiptInfo $receiptInfo;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$performPostReceipt$1$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06581 extends AbstractC5506u implements Function1 {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ boolean $hasCachedTransactionMetadata;
            final /* synthetic */ Function1 $onSuccess;
            final /* synthetic */ String $purchaseToken;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06581(boolean z10, PostReceiptHelper postReceiptHelper, String str, String str2, Map<String, SubscriberAttribute> map, Function1 function1) {
                super(1);
                this.$hasCachedTransactionMetadata = z10;
                this.this$0 = postReceiptHelper;
                this.$purchaseToken = str;
                this.$appUserID = str2;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onSuccess = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PostReceiptResponse) obj);
                return L.f17438a;
            }

            public final void invoke(PostReceiptResponse postReceiptResponse) {
                AbstractC5504s.h(postReceiptResponse, "postReceiptResponse");
                if (this.$hasCachedTransactionMetadata) {
                    this.this$0.localTransactionMetadataStore.clearLocalTransactionMetadata(a0.c(this.$purchaseToken));
                }
                this.this$0.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(postReceiptResponse.getBody()));
                this.this$0.customerInfoUpdateHandler.cacheAndNotifyListeners(postReceiptResponse.getCustomerInfo());
                this.$onSuccess.invoke(postReceiptResponse);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$performPostReceipt$1$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "responseBody", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5096o {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ boolean $hasCachedTransactionMetadata;
            final /* synthetic */ InterfaceC5096o $onError;
            final /* synthetic */ String $purchaseToken;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(boolean z10, PostReceiptHelper postReceiptHelper, String str, String str2, Map<String, SubscriberAttribute> map, InterfaceC5096o interfaceC5096o) {
                super(3);
                this.$hasCachedTransactionMetadata = z10;
                this.this$0 = postReceiptHelper;
                this.$purchaseToken = str;
                this.$appUserID = str2;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onError = interfaceC5096o;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
                return L.f17438a;
            }

            public final void invoke(PurchasesError error, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
                AbstractC5504s.h(error, "error");
                AbstractC5504s.h(errorHandlingBehavior, "errorHandlingBehavior");
                if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                    if (this.$hasCachedTransactionMetadata) {
                        this.this$0.localTransactionMetadataStore.clearLocalTransactionMetadata(a0.c(this.$purchaseToken));
                    }
                    this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                this.$onError.invoke(error, errorHandlingBehavior, jSONObject);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40351(String str, String str2, boolean z10, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z11, Function1 function1, InterfaceC5096o interfaceC5096o) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$isRestore = z10;
            this.$receiptInfo = receiptInfo;
            this.$initiationSource = postReceiptInitiationSource;
            this.$paywallData = paywallPostReceiptData;
            this.$purchasesAreCompletedBy = purchasesAreCompletedBy;
            this.$hasCachedTransactionMetadata = z11;
            this.$onSuccess = function1;
            this.$onError = interfaceC5096o;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, SubscriberAttribute>) obj);
            return L.f17438a;
        }

        public final void invoke(Map<String, SubscriberAttribute> unsyncedSubscriberAttributesByKey) {
            AbstractC5504s.h(unsyncedSubscriberAttributesByKey, "unsyncedSubscriberAttributesByKey");
            PostReceiptHelper.this.backend.postReceiptData(this.$purchaseToken, this.$appUserID, this.$isRestore, PostReceiptHelper.this.getFinishTransactions(), BackendHelpersKt.toBackendMap(unsyncedSubscriberAttributesByKey), this.$receiptInfo, this.$initiationSource, this.$paywallData, this.$purchasesAreCompletedBy, new C06581(this.$hasCachedTransactionMetadata, PostReceiptHelper.this, this.$purchaseToken, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onSuccess), new AnonymousClass2(this.$hasCachedTransactionMetadata, PostReceiptHelper.this, this.$purchaseToken, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40361 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Boolean $isAutoRenewing;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40361(String str, Boolean bool, Function1 function1) {
            super(1);
            this.$purchaseToken = str;
            this.$isAutoRenewing = bool;
            this.$onSuccess = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PostReceiptResponse) obj);
            return L.f17438a;
        }

        public final void invoke(PostReceiptResponse postReceiptResponse) {
            AbstractC5504s.h(postReceiptResponse, "postReceiptResponse");
            PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken, this.$isAutoRenewing);
            this.$onSuccess.invoke(postReceiptResponse.getCustomerInfo());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40372 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isAutoRenewing;
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Function1 function1) {
                super(1);
                this.$onSuccess = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return L.f17438a;
            }

            public final void invoke(CustomerInfo it) {
                AbstractC5504s.h(it, "it");
                this.$onSuccess.invoke(it);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06592 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ Function1 $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06592(Function1 function1, PurchasesError purchasesError) {
                super(0);
                this.$onError = function1;
                this.$backendError = purchasesError;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m146invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m146invoke() {
                this.$onError.invoke(this.$backendError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40372(String str, Boolean bool, String str2, Function1 function1, Function1 function12) {
            super(3);
            this.$purchaseToken = str;
            this.$isAutoRenewing = bool;
            this.$appUserID = str2;
            this.$onSuccess = function1;
            this.$onError = function12;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return L.f17438a;
        }

        public final void invoke(PurchasesError backendError, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
            AbstractC5504s.h(backendError, "backendError");
            AbstractC5504s.h(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken, this.$isAutoRenewing);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess), new C06592(this.$onError, backendError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40381 extends AbstractC5506u implements Function1 {
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ Function2 $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40381(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, Function2 function2) {
            super(1);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$onSuccess = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PostReceiptResponse) obj);
            return L.f17438a;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse r7) {
            /*
                r6 = this;
                java.lang.String r0 = "postReceiptResponse"
                kotlin.jvm.internal.AbstractC5504s.h(r7, r0)
                java.util.Map r0 = r7.getProductInfoByProductId()
                if (r0 == 0) goto L5d
                com.revenuecat.purchases.models.StoreTransaction r1 = r6.$purchase
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L1a:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L42
                java.lang.Object r3 = r0.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getKey()
                java.lang.String r4 = (java.lang.String) r4
                java.util.List r5 = r1.getProductIds()
                boolean r4 = r5.contains(r4)
                if (r4 == 0) goto L1a
                java.lang.Object r4 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                r2.put(r4, r3)
                goto L1a
            L42:
                java.util.Collection r0 = r2.values()
                if (r0 == 0) goto L5d
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = Ud.AbstractC2279u.n0(r0)
                com.revenuecat.purchases.common.networking.PostReceiptProductInfo r0 = (com.revenuecat.purchases.common.networking.PostReceiptProductInfo) r0
                if (r0 == 0) goto L5d
                java.lang.Boolean r0 = r0.getShouldConsume()
                if (r0 == 0) goto L5d
                boolean r0 = r0.booleanValue()
                goto L5e
            L5d:
                r0 = 0
            L5e:
                com.revenuecat.purchases.PostReceiptHelper r1 = com.revenuecat.purchases.PostReceiptHelper.this
                com.revenuecat.purchases.common.BillingAbstract r1 = com.revenuecat.purchases.PostReceiptHelper.access$getBilling$p(r1)
                com.revenuecat.purchases.PostReceiptHelper r2 = com.revenuecat.purchases.PostReceiptHelper.this
                boolean r2 = com.revenuecat.purchases.PostReceiptHelper.access$getFinishTransactions(r2)
                com.revenuecat.purchases.models.StoreTransaction r3 = r6.$purchase
                com.revenuecat.purchases.PostReceiptInitiationSource r4 = r6.$initiationSource
                r1.consumeAndSave(r2, r3, r0, r4)
                kotlin.jvm.functions.Function2 r0 = r6.$onSuccess
                if (r0 == 0) goto L7e
                com.revenuecat.purchases.models.StoreTransaction r1 = r6.$purchase
                com.revenuecat.purchases.CustomerInfo r7 = r7.getCustomerInfo()
                r0.invoke(r1, r7)
            L7e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PostReceiptHelper.C40381.invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse):void");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40392 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ Function2 $onError;
        final /* synthetic */ Function2 $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function2 $onSuccess;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Function2 function2, StoreTransaction storeTransaction) {
                super(1);
                this.$onSuccess = function2;
                this.$purchase = storeTransaction;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return L.f17438a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                Function2 function2 = this.$onSuccess;
                if (function2 != null) {
                    function2.invoke(this.$purchase, customerInfo);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$2 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06602 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ Function2 $onError;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06602(Function2 function2, StoreTransaction storeTransaction, PurchasesError purchasesError) {
                super(0);
                this.$onError = function2;
                this.$purchase = storeTransaction;
                this.$backendError = purchasesError;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m147invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m147invoke() {
                Function2 function2 = this.$onError;
                if (function2 != null) {
                    function2.invoke(this.$purchase, this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40392(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, String str, Function2 function2, Function2 function22) {
            super(3);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$appUserID = str;
            this.$onSuccess = function2;
            this.$onError = function22;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return L.f17438a;
        }

        public final void invoke(PurchasesError backendError, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
            AbstractC5504s.h(backendError, "backendError");
            AbstractC5504s.h(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase, false, this.$initiationSource);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess, this.$purchase), new C06602(this.$onError, this.$purchase, backendError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$useOfflineEntitlementsCustomerInfoIfNeeded$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C40401 extends AbstractC5506u implements Function1 {
        final /* synthetic */ InterfaceC5082a $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40401(InterfaceC5082a interfaceC5082a) {
            super(1);
            this.$onError = interfaceC5082a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC5504s.h(it, "it");
            this.$onError.invoke();
        }
    }

    public PostReceiptHelper(AppConfig appConfig, Backend backend, BillingAbstract billing, CustomerInfoUpdateHandler customerInfoUpdateHandler, DeviceCache deviceCache, SubscriberAttributesManager subscriberAttributesManager, OfflineEntitlementsManager offlineEntitlementsManager, PaywallPresentedCache paywallPresentedCache, LocalTransactionMetadataStore localTransactionMetadataStore) {
        AbstractC5504s.h(appConfig, "appConfig");
        AbstractC5504s.h(backend, "backend");
        AbstractC5504s.h(billing, "billing");
        AbstractC5504s.h(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(subscriberAttributesManager, "subscriberAttributesManager");
        AbstractC5504s.h(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC5504s.h(paywallPresentedCache, "paywallPresentedCache");
        AbstractC5504s.h(localTransactionMetadataStore, "localTransactionMetadataStore");
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billing;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.localTransactionMetadataStore = localTransactionMetadataStore;
    }

    private final void calculateOfflineCustomerInfo(String appUserID, Function1 onSuccess, Function1 onError) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(appUserID, new AnonymousClass1(onSuccess), new AnonymousClass2(onError));
    }

    public final void callTransactionMetadataCompletionFromResults(List<LocalTransactionMetadata> transactionMetadataToSync, ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> results, Function1 onError, Function1 onSuccess) {
        if (transactionMetadataToSync.size() == results.size()) {
            int i10 = 0;
            for (Object obj : results) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2279u.w();
                }
                Result result = (Result) obj;
                if (result instanceof Result.Error) {
                    if (onError != null) {
                        onError.invoke(((Result.Error) result).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i10 == results.size() - 1 && onSuccess != null) {
                        AbstractC5504s.f(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        onSuccess.invoke(((Result.Success) result).getValue());
                    }
                    i10 = i11;
                }
            }
        }
    }

    static /* synthetic */ void callTransactionMetadataCompletionFromResults$default(PostReceiptHelper postReceiptHelper, List list, ConcurrentLinkedQueue concurrentLinkedQueue, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        if ((i10 & 8) != 0) {
            function12 = null;
        }
        postReceiptHelper.callTransactionMetadataCompletionFromResults(list, concurrentLinkedQueue, function1, function12);
    }

    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final synchronized CachedDataToPost getOrPutDataToPost(LocalTransactionMetadataStore localTransactionMetadataStore, String str, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource) {
        LocalTransactionMetadata localTransactionMetadata;
        boolean z10;
        PaywallEvent andRemovePurchaseInitiatedEventIfNeeded;
        PaywallEvent.Data data;
        try {
            localTransactionMetadata = localTransactionMetadataStore.getLocalTransactionMetadata(str);
            z10 = localTransactionMetadata == null && postReceiptInitiationSource == PostReceiptInitiationSource.PURCHASE;
            andRemovePurchaseInitiatedEventIfNeeded = localTransactionMetadata == null ? this.paywallPresentedCache.getAndRemovePurchaseInitiatedEventIfNeeded(receiptInfo.getProductIDs(), receiptInfo.getPurchaseTime()) : null;
            if (z10) {
                PresentedOfferingContext presentedOfferingContext = (andRemovePurchaseInitiatedEventIfNeeded == null || (data = andRemovePurchaseInitiatedEventIfNeeded.getData()) == null) ? null : data.getPresentedOfferingContext();
                localTransactionMetadataStore.cacheLocalTransactionMetadata(str, new LocalTransactionMetadata(str, (receiptInfo.getPresentedOfferingContext() != null || presentedOfferingContext == null) ? receiptInfo : ReceiptInfo.copy$default(receiptInfo, null, null, presentedOfferingContext, null, null, null, null, null, null, null, false, null, null, 8187, null), andRemovePurchaseInitiatedEventIfNeeded != null ? andRemovePurchaseInitiatedEventIfNeeded.toPaywallPostReceiptData$purchases_defaultsBc8Release() : null, getPurchasesAreCompletedBy()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new CachedDataToPost(localTransactionMetadata, andRemovePurchaseInitiatedEventIfNeeded, z10);
    }

    private final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.appConfig.getPurchasesAreCompletedBy();
    }

    private final void performPostReceipt(String appUserID, String purchaseToken, boolean isRestore, ReceiptInfo receiptInfo, PostReceiptInitiationSource initiationSource, PaywallPostReceiptData paywallData, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean hasCachedTransactionMetadata, Function1 onSuccess, InterfaceC5096o onError) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(appUserID, new C40351(purchaseToken, appUserID, isRestore, receiptInfo, initiationSource, paywallData, purchasesAreCompletedBy, hasCachedTransactionMetadata, onSuccess, onError));
    }

    private final void postReceiptAndSubscriberAttributes(String appUserID, String purchaseToken, boolean isRestore, ReceiptInfo receiptInfo, PostReceiptInitiationSource initiationSource, PurchaseState purchaseState, Function1 onSuccess, InterfaceC5096o onError) {
        PaywallPostReceiptData paywallPostReceiptData;
        ReceiptInfo receiptInfo2;
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        CachedDataToPost orPutDataToPost = getOrPutDataToPost(this.localTransactionMetadataStore, purchaseToken, receiptInfo, initiationSource);
        LocalTransactionMetadata localTransactionMetadata = orPutDataToPost.getLocalTransactionMetadata();
        PaywallEvent paywallEvent = orPutDataToPost.getPaywallEvent();
        boolean didCacheData = orPutDataToPost.getDidCacheData();
        if (localTransactionMetadata != null && (paywallPostReceiptData$purchases_defaultsBc8Release = localTransactionMetadata.getPaywallPostReceiptData()) != null) {
            paywallPostReceiptData = paywallPostReceiptData$purchases_defaultsBc8Release;
        } else if (paywallEvent != null) {
            PaywallPostReceiptData paywallPostReceiptData$purchases_defaultsBc8Release = paywallEvent.toPaywallPostReceiptData$purchases_defaultsBc8Release();
            paywallPostReceiptData = paywallPostReceiptData$purchases_defaultsBc8Release;
        } else {
            paywallPostReceiptData = null;
        }
        if (localTransactionMetadata == null || (receiptInfo2 = localTransactionMetadata.getReceiptInfo()) == null) {
            receiptInfo2 = receiptInfo;
        }
        if (localTransactionMetadata == null || (purchasesAreCompletedBy = localTransactionMetadata.getPurchasesAreCompletedBy()) == null) {
            purchasesAreCompletedBy = getPurchasesAreCompletedBy();
        }
        if (purchaseState != PurchaseState.PENDING) {
            performPostReceipt(appUserID, purchaseToken, isRestore, receiptInfo2, initiationSource, paywallPostReceiptData, purchasesAreCompletedBy, localTransactionMetadata != null || didCacheData, onSuccess, onError);
            return;
        }
        PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, null);
        LogUtilsKt.errorLog(purchasesError);
        onError.invoke(purchasesError, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postTransactionAndConsumeIfNeeded$default(PostReceiptHelper postReceiptHelper, StoreTransaction storeTransaction, StoreProduct storeProduct, Map map, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z11, Function2 function2, Function2 function22, int i10, Object obj) {
        Function2 function23;
        PostReceiptHelper postReceiptHelper2;
        StoreTransaction storeTransaction2;
        StoreProduct storeProduct2;
        Map map2;
        boolean z12;
        String str2;
        PostReceiptInitiationSource postReceiptInitiationSource2;
        boolean z13 = (i10 & 64) != 0 ? false : z11;
        Function2 function24 = (i10 & 128) != 0 ? null : function2;
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            function23 = null;
            storeTransaction2 = storeTransaction;
            storeProduct2 = storeProduct;
            map2 = map;
            z12 = z10;
            str2 = str;
            postReceiptInitiationSource2 = postReceiptInitiationSource;
            postReceiptHelper2 = postReceiptHelper;
        } else {
            function23 = function22;
            postReceiptHelper2 = postReceiptHelper;
            storeTransaction2 = storeTransaction;
            storeProduct2 = storeProduct;
            map2 = map;
            z12 = z10;
            str2 = str;
            postReceiptInitiationSource2 = postReceiptInitiationSource;
        }
        postReceiptHelper2.postTransactionAndConsumeIfNeeded(storeTransaction2, storeProduct2, map2, z12, str2, postReceiptInitiationSource2, z13, function24, function23);
    }

    public final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior errorHandlingBehavior, String appUserID, Function1 onSuccess, InterfaceC5082a onError) {
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME)) {
            calculateOfflineCustomerInfo(appUserID, onSuccess, new C40401(onError));
        } else {
            onError.invoke();
        }
    }

    public final void postRemainingCachedTransactionMetadata(String appUserID, boolean allowSharingPlayStoreAccount, Set<String> pendingTransactionsTokens, InterfaceC5082a onNoTransactionsToSync, Function1 onError, Function1 onSuccess) {
        String appUserID2 = appUserID;
        AbstractC5504s.h(appUserID2, "appUserID");
        AbstractC5504s.h(pendingTransactionsTokens, "pendingTransactionsTokens");
        AbstractC5504s.h(onNoTransactionsToSync, "onNoTransactionsToSync");
        Function1 onError2 = onError;
        AbstractC5504s.h(onError2, "onError");
        Function1 onSuccess2 = onSuccess;
        AbstractC5504s.h(onSuccess2, "onSuccess");
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        PostReceiptHelper postReceiptHelper = this;
        List<LocalTransactionMetadata> allLocalTransactionMetadata = postReceiptHelper.localTransactionMetadataStore.getAllLocalTransactionMetadata();
        ArrayList<LocalTransactionMetadata> arrayList = new ArrayList();
        for (Object obj : allLocalTransactionMetadata) {
            if (!pendingTransactionsTokens.contains(((LocalTransactionMetadata) obj).getToken())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            onNoTransactionsToSync.invoke();
            return;
        }
        for (LocalTransactionMetadata localTransactionMetadata : arrayList) {
            performPostReceipt(appUserID2, localTransactionMetadata.getToken(), allowSharingPlayStoreAccount, localTransactionMetadata.getReceiptInfo(), PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, localTransactionMetadata.getPaywallPostReceiptData(), localTransactionMetadata.getPurchasesAreCompletedBy(), true, new PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1(concurrentLinkedQueue, postReceiptHelper, arrayList, onError2, onSuccess2), new PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2(concurrentLinkedQueue, this, arrayList, onError, onSuccess));
            postReceiptHelper = this;
            appUserID2 = appUserID;
            onError2 = onError;
            onSuccess2 = onSuccess;
            concurrentLinkedQueue = concurrentLinkedQueue;
            arrayList = arrayList;
        }
    }

    public final void postTokenWithoutConsuming(String purchaseToken, ReceiptInfo receiptInfo, boolean isRestore, String appUserID, PostReceiptInitiationSource initiationSource, Function1 onSuccess, Function1 onError, Boolean isAutoRenewing) {
        AbstractC5504s.h(purchaseToken, "purchaseToken");
        AbstractC5504s.h(receiptInfo, "receiptInfo");
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(initiationSource, "initiationSource");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        postReceiptAndSubscriberAttributes(appUserID, purchaseToken, isRestore, receiptInfo, initiationSource, PurchaseState.UNSPECIFIED_STATE, new C40361(purchaseToken, isAutoRenewing, onSuccess), new C40372(purchaseToken, isAutoRenewing, appUserID, onSuccess, onError));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction purchase, StoreProduct storeProduct, Map<String, ? extends SubscriptionOption> subscriptionOptionForProductIDs, boolean isRestore, String appUserID, PostReceiptInitiationSource initiationSource, boolean sdkOriginated, Function2 onSuccess, Function2 onError) {
        AbstractC5504s.h(purchase, "purchase");
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(initiationSource, "initiationSource");
        postReceiptAndSubscriberAttributes(appUserID, purchase.getPurchaseToken(), isRestore, ReceiptInfo.INSTANCE.from(purchase, storeProduct, subscriptionOptionForProductIDs, sdkOriginated), initiationSource, purchase.getPurchaseState(), new C40381(purchase, initiationSource, onSuccess), new C40392(purchase, initiationSource, appUserID, onSuccess, onError));
    }
}
