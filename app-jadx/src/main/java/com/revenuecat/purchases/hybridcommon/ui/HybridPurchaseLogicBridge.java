package com.revenuecat.purchases.hybridcommon.ui;

import Gf.AbstractC1646z;
import Gf.InterfaceC1642x;
import Td.z;
import Ud.S;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogicParams;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aBO\u0012\"\u0010\u0007\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\"\u0010\b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R0\u0010\u0007\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R0\u0010\b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogic;", "Lkotlin/Function1;", "", "", "", "LTd/L;", "onPerformPurchase", "onPerformRestore", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;", "performPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "performRestore", "(Lcom/revenuecat/purchases/CustomerInfo;LZd/e;)Ljava/lang/Object;", "cancelPending", "()V", "Lkotlin/jvm/functions/Function1;", "Companion", "PendingRequest", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HybridPurchaseLogicBridge implements PurchaseLogic {
    public static final String EVENT_KEY_PACKAGE_BEING_PURCHASED = "packageBeingPurchased";
    public static final String EVENT_KEY_REQUEST_ID = "requestId";
    public static final String RESULT_CANCELLATION = "CANCELLATION";
    public static final String RESULT_ERROR = "ERROR";
    public static final String RESULT_SUCCESS = "SUCCESS";
    private static final String TAG = "HybridPurchaseLogicBridge";
    private final Function1 onPerformPurchase;
    private final Function1 onPerformRestore;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<String, PendingRequest> pendingRequests = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$Companion;", "", "<init>", "()V", "", "requestId", "resultString", com.amazon.a.a.o.b.f34648f, "LTd/L;", "resolveResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "EVENT_KEY_PACKAGE_BEING_PURCHASED", "Ljava/lang/String;", "EVENT_KEY_REQUEST_ID", "RESULT_CANCELLATION", "RESULT_ERROR", "RESULT_SUCCESS", "TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;", "pendingRequests", "Ljava/util/concurrent/ConcurrentHashMap;", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void resolveResult$default(Companion companion, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            companion.resolveResult(str, str2, str3);
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveResult(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            /*
                r4 = this;
                java.lang.String r0 = "requestId"
                kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
                java.lang.String r0 = "resultString"
                kotlin.jvm.internal.AbstractC5504s.h(r6, r0)
                java.util.concurrent.ConcurrentHashMap r0 = com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge.access$getPendingRequests$cp()
                java.lang.Object r0 = r0.remove(r5)
                com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge$PendingRequest r0 = (com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge.PendingRequest) r0
                if (r0 != 0) goto L32
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "No pending callback for requestId '"
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = "'. It may have already been resolved."
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r6 = "HybridPurchaseLogicBridge"
                android.util.Log.w(r6, r5)
                return
            L32:
                int r5 = r6.hashCode()
                r1 = -1149187101(0xffffffffbb80cbe3, float:-0.003930555)
                if (r5 == r1) goto L6c
                r1 = 66247144(0x3f2d9e8, float:1.42735105E-36)
                if (r5 == r1) goto L52
                r1 = 1196388611(0x474f7103, float:53105.01)
                if (r5 == r1) goto L46
                goto L74
            L46:
                java.lang.String r5 = "CANCELLATION"
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L4f
                goto L74
            L4f:
                com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Cancellation r5 = com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult.Cancellation.INSTANCE
                goto L96
            L52:
                java.lang.String r5 = "ERROR"
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L5b
                goto L74
            L5b:
                com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Error r5 = new com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Error
                com.revenuecat.purchases.PurchasesError r6 = new com.revenuecat.purchases.PurchasesError
                com.revenuecat.purchases.PurchasesErrorCode r1 = com.revenuecat.purchases.PurchasesErrorCode.UnknownError
                if (r7 != 0) goto L65
                java.lang.String r7 = "Operation failed"
            L65:
                r6.<init>(r1, r7)
                r5.<init>(r6)
                goto L96
            L6c:
                java.lang.String r5 = "SUCCESS"
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L94
            L74:
                com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Error r5 = new com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Error
                com.revenuecat.purchases.PurchasesError r1 = new com.revenuecat.purchases.PurchasesError
                com.revenuecat.purchases.PurchasesErrorCode r2 = com.revenuecat.purchases.PurchasesErrorCode.UnknownError
                if (r7 != 0) goto L8d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r3 = "Unknown result: "
                r7.append(r3)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
            L8d:
                r1.<init>(r2, r7)
                r5.<init>(r1)
                goto L96
            L94:
                com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Success r5 = com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult.Success.INSTANCE
            L96:
                Gf.x r6 = r0.getDeferred()
                r6.O(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge.Companion.resolveResult(java.lang.String, java.lang.String, java.lang.String):void");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u001f\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;", "", "LGf/x;", "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;", "deferred", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "owner", "<init>", "(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V", "LGf/x;", "getDeferred", "()LGf/x;", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "getOwner", "()Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "Purchase", "Restore", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Purchase;", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Restore;", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static abstract class PendingRequest {
        private final InterfaceC1642x deferred;
        private final HybridPurchaseLogicBridge owner;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Purchase;", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;", "LGf/x;", "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;", "deferred", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "owner", "<init>", "(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Purchase extends PendingRequest {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Purchase(InterfaceC1642x deferred, HybridPurchaseLogicBridge owner) {
                super(deferred, owner, null);
                AbstractC5504s.h(deferred, "deferred");
                AbstractC5504s.h(owner, "owner");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest$Restore;", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge$PendingRequest;", "LGf/x;", "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;", "deferred", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "owner", "<init>", "(LGf/x;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Restore extends PendingRequest {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Restore(InterfaceC1642x deferred, HybridPurchaseLogicBridge owner) {
                super(deferred, owner, null);
                AbstractC5504s.h(deferred, "deferred");
                AbstractC5504s.h(owner, "owner");
            }
        }

        public /* synthetic */ PendingRequest(InterfaceC1642x interfaceC1642x, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC1642x, hybridPurchaseLogicBridge);
        }

        public final InterfaceC1642x getDeferred() {
            return this.deferred;
        }

        public final HybridPurchaseLogicBridge getOwner() {
            return this.owner;
        }

        private PendingRequest(InterfaceC1642x interfaceC1642x, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
            this.deferred = interfaceC1642x;
            this.owner = hybridPurchaseLogicBridge;
        }
    }

    public HybridPurchaseLogicBridge(Function1 function1, Function1 function12) {
        this.onPerformPurchase = function1;
        this.onPerformRestore = function12;
    }

    public static final void resolveResult(String str, String str2, String str3) {
        INSTANCE.resolveResult(str, str2, str3);
    }

    public final void cancelPending() {
        Iterator<Map.Entry<String, PendingRequest>> it = pendingRequests.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, PendingRequest> next = it.next();
            AbstractC5504s.g(next, "iterator.next()");
            Map.Entry<String, PendingRequest> entry = next;
            if (entry.getValue().getOwner() == this) {
                it.remove();
                entry.getValue().getDeferred().O(PurchaseLogicResult.Cancellation.INSTANCE);
            }
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic, com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic
    public Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, Zd.e eVar) {
        return PurchaseLogic.DefaultImpls.performPurchase(this, activity, paywallPurchaseLogicParams, eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic
    public Object performRestore(CustomerInfo customerInfo, Zd.e eVar) {
        final Function1 function1 = this.onPerformRestore;
        if (function1 == null) {
            Log.w(TAG, "No onPerformRestore handler registered");
            return new PurchaseLogicResult.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "No onPerformRestore handler registered"));
        }
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "randomUUID().toString()");
        InterfaceC1642x interfaceC1642xB = AbstractC1646z.b(null, 1, null);
        pendingRequests.put(string, new PendingRequest.Restore(interfaceC1642xB, this));
        final Map mapF = S.f(z.a("requestId", string));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.revenuecat.purchases.hybridcommon.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                function1.invoke(mapF);
            }
        });
        return interfaceC1642xB.M0(eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic
    public Object performPurchase(Activity activity, Package r62, Zd.e eVar) {
        final Function1 function1 = this.onPerformPurchase;
        if (function1 == null) {
            Log.w(TAG, "No onPerformPurchase handler registered");
            return new PurchaseLogicResult.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "No onPerformPurchase handler registered"));
        }
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "randomUUID().toString()");
        InterfaceC1642x interfaceC1642xB = AbstractC1646z.b(null, 1, null);
        pendingRequests.put(string, new PendingRequest.Purchase(interfaceC1642xB, this));
        final Map mapL = S.l(z.a("requestId", string), z.a(EVENT_KEY_PACKAGE_BEING_PURCHASED, OfferingsMapperKt.map(r62)));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.revenuecat.purchases.hybridcommon.ui.a
            @Override // java.lang.Runnable
            public final void run() {
                function1.invoke(mapL);
            }
        });
        return interfaceC1642xB.M0(eVar);
    }
}
