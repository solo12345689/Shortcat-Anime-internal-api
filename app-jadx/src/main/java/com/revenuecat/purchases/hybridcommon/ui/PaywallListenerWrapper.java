package com.revenuecat.purchases.hybridcommon.ui;

import Td.L;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u00020\b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ%\u0010\u0010\u001a\u00020\b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH&¢\u0006\u0004\b\u0010\u0010\u001fJ;\u0010\u0016\u001a\u00020\b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH&¢\u0006\u0004\b\u0016\u0010 J%\u0010\u001a\u001a\u00020\b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH&¢\u0006\u0004\b\u001a\u0010\u001fJ%\u0010\u001c\u001a\u00020\b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH&¢\u0006\u0004\b\u001c\u0010\u001fJ%\u0010\u001e\u001a\u00020\b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "<init>", "()V", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/Resumable;", "resume", "LTd/L;", "onPurchasePackageInitiated", "(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/utils/Resumable;)V", "", "", "", "requestId", "(Ljava/util/Map;Ljava/lang/String;)V", "onPurchaseStarted", "(Lcom/revenuecat/purchases/Package;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "onPurchaseCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "onRestoreCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "onRestoreError", "(Ljava/util/Map;)V", "(Ljava/util/Map;Ljava/util/Map;)V", "Companion", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PaywallListenerWrapper implements PaywallListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<String, Function1> pendingResumeCallbacks = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR,\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper$Companion;", "", "<init>", "()V", "", "requestId", "", "shouldProceed", "LTd/L;", "resumePurchasePackageInitiated", "(Ljava/lang/String;Z)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Function1;", "pendingResumeCallbacks", "Ljava/util/concurrent/ConcurrentHashMap;", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void resumePurchasePackageInitiated(String requestId, boolean shouldProceed) {
            AbstractC5504s.h(requestId, "requestId");
            Function1 function1 = (Function1) PaywallListenerWrapper.pendingResumeCallbacks.remove(requestId);
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(shouldProceed));
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper$onPurchasePackageInitiated$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LTd/L;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Resumable $resume;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Resumable resumable) {
            super(1);
            this.$resume = resumable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L.f17438a;
        }

        public final void invoke(boolean z10) {
            this.$resume.invoke(z10);
        }
    }

    public static final void resumePurchasePackageInitiated(String str, boolean z10) {
        INSTANCE.resumePurchasePackageInitiated(str, z10);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseCancelled() {
        PaywallListener.DefaultImpls.onPurchaseCancelled(this);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
        AbstractC5504s.h(customerInfo, "customerInfo");
        AbstractC5504s.h(storeTransaction, "storeTransaction");
        onPurchaseCompleted(CustomerInfoMapperKt.map(customerInfo), StoreTransactionMapperKt.map(storeTransaction));
    }

    public abstract void onPurchaseCompleted(Map<String, ? extends Object> customerInfo, Map<String, ? extends Object> storeTransaction);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseError(PurchasesError purchasesError) {
        AbstractC5504s.h(purchasesError, "error");
        onPurchaseError((Map<String, ? extends Object>) PurchasesErrorKt.map$default(purchasesError, null, 1, null).getInfo());
    }

    public abstract void onPurchaseError(Map<String, ? extends Object> map);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchasePackageInitiated(Package rcPackage, Resumable resume) {
        AbstractC5504s.h(rcPackage, "rcPackage");
        AbstractC5504s.h(resume, "resume");
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "randomUUID().toString()");
        pendingResumeCallbacks.put(string, new AnonymousClass1(resume));
        onPurchasePackageInitiated(OfferingsMapperKt.map(rcPackage), string);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseStarted(Package rcPackage) {
        AbstractC5504s.h(rcPackage, "rcPackage");
        onPurchaseStarted(OfferingsMapperKt.map(rcPackage));
    }

    public abstract void onPurchaseStarted(Map<String, ? extends Object> rcPackage);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreCompleted(CustomerInfo customerInfo) {
        AbstractC5504s.h(customerInfo, "customerInfo");
        onRestoreCompleted(CustomerInfoMapperKt.map(customerInfo));
    }

    public abstract void onRestoreCompleted(Map<String, ? extends Object> customerInfo);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreError(PurchasesError purchasesError) {
        AbstractC5504s.h(purchasesError, "error");
        onRestoreError((Map<String, ? extends Object>) PurchasesErrorKt.map$default(purchasesError, null, 1, null).getInfo());
    }

    public abstract void onRestoreError(Map<String, ? extends Object> map);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreInitiated(Resumable resumable) {
        PaywallListener.DefaultImpls.onRestoreInitiated(this, resumable);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreStarted() {
        PaywallListener.DefaultImpls.onRestoreStarted(this);
    }

    public void onPurchasePackageInitiated(Map<String, ? extends Object> rcPackage, String requestId) {
        AbstractC5504s.h(rcPackage, "rcPackage");
        AbstractC5504s.h(requestId, "requestId");
        INSTANCE.resumePurchasePackageInitiated(requestId, true);
    }
}
