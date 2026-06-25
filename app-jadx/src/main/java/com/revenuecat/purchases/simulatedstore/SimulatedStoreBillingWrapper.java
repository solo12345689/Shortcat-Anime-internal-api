package com.revenuecat.purchases.simulatedstore;

import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.app.Activity;
import android.os.Handler;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.networking.WebBillingProductResponse;
import com.revenuecat.purchases.common.networking.WebBillingProductsResponse;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.utils.AlertDialogHelper;
import com.revenuecat.purchases.utils.DefaultAlertDialogHelper;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001f\u0010\u001eJI\u0010)\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0018\u0010%\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020\u00140\"2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140\"j\u0002`'H\u0016¢\u0006\u0004\b)\u0010*J[\u00102\u001a\u00020\u00142\u0006\u0010,\u001a\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020 0-2\u001c\u00100\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100#\u0012\u0004\u0012\u00020\u00140\"j\u0002`/2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140\"j\u0002`'H\u0016¢\u0006\u0004\b2\u00103J/\u0010:\u001a\u00020\u00142\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020$2\u0006\u00107\u001a\u0002042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;JO\u0010>\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010<\u001a\u00020 2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\"2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140\"H\u0016¢\u0006\u0004\b>\u0010?JE\u0010E\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010A\u001a\u00020@2\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010D\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u000204H\u0016¢\u0006\u0004\bG\u0010HJK\u0010K\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u001e\u0010J\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020$0I\u0012\u0004\u0012\u00020\u00140\"2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140\"H\u0016¢\u0006\u0004\bK\u0010*J3\u0010P\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0#2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00140NH\u0016¢\u0006\u0004\bP\u0010QJ;\u0010R\u001a\u00020\u00142\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\"2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140\"j\u0002`'H\u0016¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0016\u0010X\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesStateProvider", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/utils/AlertDialogHelper;", "dialogHelper", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Landroid/os/Handler;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/utils/AlertDialogHelper;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "product", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "LTd/L;", "showPurchaseDialog", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "completePurchase", "(Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "", "delayMilliseconds", "startConnectionOnMainThread", "(J)V", "startConnection", "()V", "endConnection", "", "appUserID", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "", "productIds", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "finishTransactions", "purchase", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "isConnected", "()Z", "", "onSuccess", "queryPurchases", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lie/a;)V", "getStorefront", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/utils/AlertDialogHelper;", "connected", "Z", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SimulatedStoreBillingWrapper extends BillingAbstract {
    private final Backend backend;
    private volatile boolean connected;
    private final DeviceCache deviceCache;
    private final AlertDialogHelper dialogHelper;
    private final Handler mainHandler;

    /* JADX INFO: renamed from: com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper$queryProductDetailsAsync$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse;", "response", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onReceive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function1 function1, Function1 function12) {
            super(1);
            this.$onReceive = function1;
            this.$onError = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((WebBillingProductsResponse) obj);
            return L.f17438a;
        }

        public final void invoke(WebBillingProductsResponse response) {
            AbstractC5504s.h(response, "response");
            try {
                List<WebBillingProductResponse> productDetails = response.getProductDetails();
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(productDetails, 10));
                Iterator<T> it = productDetails.iterator();
                while (it.hasNext()) {
                    arrayList.add(SimulatedStoreProductConverter.convertToStoreProduct$default(SimulatedStoreProductConverter.INSTANCE, (WebBillingProductResponse) it.next(), null, 2, null));
                }
                this.$onReceive.invoke(arrayList);
            } catch (PurchasesException e10) {
                this.$onError.invoke(e10.getError());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper$showPurchaseDialog$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ StoreProduct $product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
            super(0);
            this.$product = storeProduct;
            this.$presentedOfferingContext = presentedOfferingContext;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() throws JSONException {
            m361invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m361invoke() throws JSONException {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "[Test store] Performing test purchase. This purchase won't appear in production.");
            }
            SimulatedStoreBillingWrapper.this.completePurchase(this.$product, this.$presentedOfferingContext);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper$showPurchaseDialog$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41442 extends AbstractC5506u implements InterfaceC5082a {
        C41442() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m362invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m362invoke() {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "[Test store] Purchase failure simulated successfully in Test Store.");
            }
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = SimulatedStoreBillingWrapper.this.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(new PurchasesError(PurchasesErrorCode.TestStoreSimulatedPurchaseError, "Simulated error successfully."));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper$showPurchaseDialog$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
        AnonymousClass3() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m363invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m363invoke() {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = SimulatedStoreBillingWrapper.this.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(new PurchasesError(PurchasesErrorCode.PurchaseCancelledError, "Purchase cancelled by user"));
            }
        }
    }

    public /* synthetic */ SimulatedStoreBillingWrapper(DeviceCache deviceCache, Handler handler, PurchasesStateProvider purchasesStateProvider, Backend backend, AlertDialogHelper alertDialogHelper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache, handler, purchasesStateProvider, backend, (i10 & 16) != 0 ? new DefaultAlertDialogHelper() : alertDialogHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completePurchase(StoreProduct product, PresentedOfferingContext presentedOfferingContext) throws JSONException {
        Map mapI;
        String str;
        long time = new Date().getTime();
        String str2 = "test_" + time + '_' + UUID.randomUUID();
        List listE = AbstractC2279u.e(product.getId());
        ProductType type = product.getType();
        PurchaseState purchaseState = PurchaseState.PURCHASED;
        Boolean boolValueOf = Boolean.valueOf(product.getType() == ProductType.SUBS);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orderId", str2);
        jSONObject.put("productId", product.getId());
        jSONObject.put("purchaseTime", time);
        jSONObject.put("purchaseToken", str2);
        jSONObject.put("purchaseState", purchaseState.ordinal());
        L l10 = L.f17438a;
        PurchaseType purchaseType = PurchaseType.GOOGLE_PURCHASE;
        SubscriptionOption defaultOption = product.getDefaultOption();
        String str3 = defaultOption != null ? defaultOption.get$id() : null;
        SubscriptionOption defaultOption2 = product.getDefaultOption();
        if (defaultOption2 == null || (str = defaultOption2.get$id()) == null || (mapI = S.f(z.a(product.getId(), str))) == null) {
            mapI = S.i();
        }
        StoreTransaction storeTransaction = new StoreTransaction(str2, listE, type, time, str2, purchaseState, boolValueOf, null, jSONObject, presentedOfferingContext, null, purchaseType, null, str3, mapI, null);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesUpdated(AbstractC2279u.e(storeTransaction));
        }
    }

    private final void showPurchaseDialog(Activity activity, StoreProduct product, PresentedOfferingContext presentedOfferingContext) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("This is a test purchase and should only be used during development. In production, use a Google/Amazon API key from RevenueCat.\n\n");
        sb2.append("Product: " + product.getId() + '\n');
        sb2.append("Price: " + product.getPrice().getFormatted() + '\n');
        SubscriptionOption defaultOption = product.getDefaultOption();
        if (defaultOption != null) {
            for (PricingPhase pricingPhase : defaultOption.getPricingPhases()) {
                sb2.append("Phase: " + pricingPhase.getPrice().getFormatted() + " for " + pricingPhase.getBillingPeriod().getIso8601() + '\n');
            }
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        this.dialogHelper.showDialog(activity, "Test Store Purchase", string, "Test valid Purchase", "Test failed Purchase", "Cancel", new AnonymousClass1(product, presentedOfferingContext), new C41442(), new AnonymousClass3());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean finishTransactions, StoreTransaction purchase, boolean shouldConsume, PostReceiptInitiationSource initiationSource) {
        AbstractC5504s.h(purchase, "purchase");
        AbstractC5504s.h(initiationSource, "initiationSource");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: consumeAndSave - no-op for test store");
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    protected void endConnection() {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: Ending connection");
        }
        this.connected = false;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, ProductType productType, String productId, Function1 onCompletion, Function1 onError) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(productType, "productType");
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(onCompletion, "onCompletion");
        AbstractC5504s.h(onError, "onError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: findPurchaseInPurchaseHistory for product: " + productId + " will always fail");
        }
        onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, "No active purchase found for product: " + productId));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: getStorefront - returning US by default");
        }
        onSuccess.invoke("US");
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    /* JADX INFO: renamed from: isConnected, reason: from getter */
    public boolean getConnected() {
        return this.connected;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice) throws PurchasesException {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(purchasingData, "purchasingData");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: makePurchaseAsync for product: " + purchasingData.getProductId());
        }
        SimulatedStorePurchasingData simulatedStorePurchasingData = purchasingData instanceof SimulatedStorePurchasingData ? (SimulatedStorePurchasingData) purchasingData : null;
        if (simulatedStorePurchasingData != null) {
            showPurchaseDialog(activity, simulatedStorePurchasingData.getStoreProduct(), presentedOfferingContext);
            return;
        }
        throw new PurchasesException(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Purchasing data is not a valid SimulatedStorePurchasingData: " + purchasingData.getProductId()));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, Function1 onReceivePurchaseHistory, Function1 onReceivePurchaseHistoryError) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        AbstractC5504s.h(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: queryAllPurchases - returning empty list");
        }
        onReceivePurchaseHistory.invoke(AbstractC2279u.m());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(ProductType productType, Set<String> productIds, Function1 onReceive, Function1 onError) throws Throwable {
        AbstractC5504s.h(productType, "productType");
        AbstractC5504s.h(productIds, "productIds");
        AbstractC5504s.h(onReceive, "onReceive");
        AbstractC5504s.h(onError, "onError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: queryProductDetailsAsync for products: " + productIds);
        }
        Backend backend = this.backend;
        String cachedAppUserID$purchases_defaultsBc8Release = this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
        if (cachedAppUserID$purchases_defaultsBc8Release == null) {
            cachedAppUserID$purchases_defaultsBc8Release = "";
        }
        backend.getWebBillingProducts(cachedAppUserID$purchases_defaultsBc8Release, productIds, new AnonymousClass2(onReceive, onError), onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: queryPurchases - returning empty map");
        }
        onSuccess.invoke(S.i());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, InterfaceC5082a subscriptionStatusChange) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(inAppMessageTypes, "inAppMessageTypes");
        AbstractC5504s.h(subscriptionStatusChange, "subscriptionStatusChange");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: showInAppMessagesIfNeeded - no-op for test store");
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: Starting connection");
        }
        this.connected = true;
        BillingAbstract.StateListener stateListener = getStateListener();
        if (stateListener != null) {
            stateListener.onConnected();
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long delayMilliseconds) {
        this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.simulatedstore.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f44177a.startConnection();
            }
        }, delayMilliseconds);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulatedStoreBillingWrapper(DeviceCache deviceCache, Handler mainHandler, PurchasesStateProvider purchasesStateProvider, Backend backend, AlertDialogHelper dialogHelper) {
        super(purchasesStateProvider);
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(mainHandler, "mainHandler");
        AbstractC5504s.h(purchasesStateProvider, "purchasesStateProvider");
        AbstractC5504s.h(backend, "backend");
        AbstractC5504s.h(dialogHelper, "dialogHelper");
        this.deviceCache = deviceCache;
        this.mainHandler = mainHandler;
        this.backend = backend;
        this.dialogHelper = dialogHelper;
    }
}
