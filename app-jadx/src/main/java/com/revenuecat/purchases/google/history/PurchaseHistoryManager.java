package com.revenuecat.purchases.google.history;

import Gf.AbstractC1646z;
import Gf.C0;
import Gf.InterfaceC1642x;
import Pf.a;
import Pf.g;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Zd.e;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.google.history.PurchaseData;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5503q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J~\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0016\b\u0004\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00072\u001c\b\u0004\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001e\b\u0004\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0082H¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fH\u0086@¢\u0006\u0004\b \u0010!J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0086@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b&\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R,\u00104\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "T", "Lkotlin/Function0;", "LGf/x;", "getDeferred", "Lkotlin/Function1;", "LTd/L;", "setDeferred", "", "debugMessage", "", "clearOnCompletion", "LZd/e;", "operation", "getOrExecute", "(Lie/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;", "type", "continuationToken", "Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;", "queryPurchaseHistory", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;", "Landroid/os/Bundle;", "response", "parseResponse", "(Landroid/os/Bundle;)Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;", "cleanup", "()V", "connect", "(LZd/e;)Ljava/lang/Object;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "queryAllPurchaseHistory", "(Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "disconnect", "Landroid/content/Context;", "Lcom/android/vending/billing/IInAppBillingService;", "billingService", "Lcom/android/vending/billing/IInAppBillingService;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;", "LPf/a;", "operationsMutex", "LPf/a;", "connectDeferred", "LGf/x;", "", "queryDeferreds", "Ljava/util/Map;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseHistoryManager {
    private static final int MAX_PAGINATION_PAGES = 50;
    private IInAppBillingService billingService;
    private InterfaceC1642x connectDeferred;
    private final Context context;
    private final a operationsMutex;
    private final Map<String, InterfaceC1642x> queryDeferreds;
    private ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.history.PurchaseHistoryManager$connect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", l = {347, 374, 379, 347, 347}, m = "connect")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchaseHistoryManager.this.connect(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.history.PurchaseHistoryManager$disconnect$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", l = {346}, m = "disconnect")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41091 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C41091(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchaseHistoryManager.this.disconnect(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.history.PurchaseHistoryManager$queryAllPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", l = {355, 382, 355, 355}, m = "queryAllPurchaseHistory")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41101 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C41101(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchaseHistoryManager.this.queryAllPurchaseHistory(null, this);
        }
    }

    public PurchaseHistoryManager(Context context) {
        AbstractC5504s.h(context, "context");
        this.context = context;
        this.operationsMutex = g.b(false, 1, null);
        this.queryDeferreds = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanup() {
        InterfaceC1642x interfaceC1642x = this.connectDeferred;
        if (interfaceC1642x != null) {
            C0.a.a(interfaceC1642x, null, 1, null);
        }
        Iterator<Map.Entry<String, InterfaceC1642x>> it = this.queryDeferreds.entrySet().iterator();
        while (it.hasNext()) {
            C0.a.a(it.next().getValue(), null, 1, null);
        }
        ServiceConnection serviceConnection = this.serviceConnection;
        if (serviceConnection != null) {
            try {
                this.context.unbindService(serviceConnection);
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "AIDL Billing service disconnected");
                }
            } catch (Throwable th2) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error disconnecting from AIDL Billing service", th2);
            }
        }
        this.billingService = null;
        this.serviceConnection = null;
        this.connectDeferred = null;
        this.queryDeferreds.clear();
    }

    private final <T> Object getOrExecute(InterfaceC5082a interfaceC5082a, Function1 function1, String str, boolean z10, Function1 function12, e eVar) {
        Pair pairA;
        a aVar = this.operationsMutex;
        AbstractC5503q.c(0);
        aVar.c(null, eVar);
        AbstractC5503q.c(1);
        try {
            InterfaceC1642x interfaceC1642x = (InterfaceC1642x) interfaceC5082a.invoke();
            if (interfaceC1642x != null) {
                if (interfaceC1642x.j()) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), str + " (already completed)");
                        L l10 = L.f17438a;
                    }
                } else {
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), str);
                        L l11 = L.f17438a;
                    }
                }
                pairA = z.a(interfaceC1642x, Boolean.FALSE);
            } else {
                InterfaceC1642x interfaceC1642xB = AbstractC1646z.b(null, 1, null);
                function1.invoke(interfaceC1642xB);
                pairA = z.a(interfaceC1642xB, Boolean.TRUE);
            }
            AbstractC5503q.b(1);
            aVar.e(null);
            AbstractC5503q.a(1);
            InterfaceC1642x interfaceC1642x2 = (InterfaceC1642x) pairA.getFirst();
            try {
                if (!((Boolean) pairA.getSecond()).booleanValue()) {
                    AbstractC5503q.c(0);
                    Object objM0 = interfaceC1642x2.M0(eVar);
                    AbstractC5503q.c(1);
                    return objM0;
                }
                try {
                    try {
                        Object objInvoke = function12.invoke(eVar);
                        interfaceC1642x2.O(objInvoke);
                        AbstractC5503q.b(1);
                        if (z10) {
                            aVar = this.operationsMutex;
                            AbstractC5503q.c(0);
                            aVar.c(null, eVar);
                            AbstractC5503q.c(1);
                            try {
                                function1.invoke(null);
                                L l12 = L.f17438a;
                            } finally {
                            }
                        }
                        AbstractC5503q.a(1);
                        return objInvoke;
                    } catch (Throwable th2) {
                        interfaceC1642x2.h(th2);
                        throw th2;
                    }
                } catch (CancellationException e10) {
                    C0.a.a(interfaceC1642x2, null, 1, null);
                    throw e10;
                }
            } catch (Throwable th3) {
                AbstractC5503q.b(1);
                if (z10) {
                    aVar = this.operationsMutex;
                    AbstractC5503q.c(0);
                    aVar.c(null, eVar);
                    AbstractC5503q.c(1);
                    try {
                        function1.invoke(null);
                        L l13 = L.f17438a;
                    } finally {
                    }
                }
                AbstractC5503q.a(1);
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    static /* synthetic */ Object getOrExecute$default(PurchaseHistoryManager purchaseHistoryManager, InterfaceC5082a interfaceC5082a, Function1 function1, String str, boolean z10, Function1 function12, e eVar, int i10, Object obj) {
        Pair pairA;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        a aVar = purchaseHistoryManager.operationsMutex;
        AbstractC5503q.c(0);
        aVar.c(null, eVar);
        AbstractC5503q.c(1);
        try {
            InterfaceC1642x interfaceC1642x = (InterfaceC1642x) interfaceC5082a.invoke();
            if (interfaceC1642x != null) {
                if (interfaceC1642x.j()) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), str + " (already completed)");
                    }
                } else {
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), str);
                    }
                }
                pairA = z.a(interfaceC1642x, Boolean.FALSE);
            } else {
                InterfaceC1642x interfaceC1642xB = AbstractC1646z.b(null, 1, null);
                function1.invoke(interfaceC1642xB);
                pairA = z.a(interfaceC1642xB, Boolean.TRUE);
            }
            AbstractC5503q.b(1);
            aVar.e(null);
            AbstractC5503q.a(1);
            InterfaceC1642x interfaceC1642x2 = (InterfaceC1642x) pairA.getFirst();
            try {
                if (!((Boolean) pairA.getSecond()).booleanValue()) {
                    AbstractC5503q.c(0);
                    Object objM0 = interfaceC1642x2.M0(eVar);
                    AbstractC5503q.c(1);
                    return objM0;
                }
                try {
                    AbstractC5503q.c(0);
                    Object objInvoke = function12.invoke(eVar);
                    AbstractC5503q.c(1);
                    interfaceC1642x2.O(objInvoke);
                    AbstractC5503q.b(1);
                    if (z10) {
                        aVar = purchaseHistoryManager.operationsMutex;
                        AbstractC5503q.c(0);
                        aVar.c(null, eVar);
                        AbstractC5503q.c(1);
                        try {
                            function1.invoke(null);
                            L l10 = L.f17438a;
                        } finally {
                        }
                    }
                    AbstractC5503q.a(1);
                    return objInvoke;
                } catch (CancellationException e10) {
                    C0.a.a(interfaceC1642x2, null, 1, null);
                    throw e10;
                } catch (Throwable th2) {
                    interfaceC1642x2.h(th2);
                    throw th2;
                }
            } catch (Throwable th3) {
                AbstractC5503q.b(1);
                if (z10) {
                    aVar = purchaseHistoryManager.operationsMutex;
                    AbstractC5503q.c(0);
                    aVar.c(null, eVar);
                    AbstractC5503q.c(1);
                    try {
                        function1.invoke(null);
                        L l11 = L.f17438a;
                    } finally {
                    }
                }
                AbstractC5503q.a(1);
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private final PurchaseHistoryResult parseResponse(Bundle response) {
        PurchaseHistoryRecord purchaseHistoryRecord;
        int i10 = response.getInt(BillingConstants.RESPONSE_CODE, -1);
        if (i10 != 0) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Purchase history query returned non-OK response: " + ErrorsKt.getBillingResponseCodeName(i10));
            }
            return new PurchaseHistoryResult(i10, AbstractC2279u.m(), null);
        }
        ArrayList<String> stringArrayList = response.getStringArrayList(BillingConstants.INAPP_PURCHASE_DATA_LIST);
        if (stringArrayList == null) {
            stringArrayList = new ArrayList<>();
        }
        ArrayList<String> stringArrayList2 = response.getStringArrayList(BillingConstants.INAPP_DATA_SIGNATURE_LIST);
        if (stringArrayList2 == null) {
            stringArrayList2 = new ArrayList<>();
        }
        String string = response.getString(BillingConstants.INAPP_CONTINUATION_TOKEN);
        List<Pair> listJ1 = AbstractC2279u.j1(stringArrayList, stringArrayList2);
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listJ1) {
            String purchaseJson = (String) pair.getFirst();
            String signature = (String) pair.getSecond();
            PurchaseData.Companion companion = PurchaseData.INSTANCE;
            AbstractC5504s.g(purchaseJson, "purchaseJson");
            PurchaseData purchaseDataFromJson = companion.fromJson(purchaseJson);
            if (purchaseDataFromJson != null) {
                AbstractC5504s.g(signature, "signature");
                purchaseHistoryRecord = new PurchaseHistoryRecord(purchaseDataFromJson, signature, purchaseJson);
            } else {
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), "Failed to parse purchase data: " + purchaseJson);
                }
                purchaseHistoryRecord = null;
            }
            if (purchaseHistoryRecord != null) {
                arrayList.add(purchaseHistoryRecord);
            }
        }
        LogLevel logLevel3 = LogLevel.DEBUG;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Parsed " + arrayList.size() + " purchase history records from AIDL.");
        }
        return new PurchaseHistoryResult(i10, arrayList, string);
    }

    public static /* synthetic */ Object queryAllPurchaseHistory$default(PurchaseHistoryManager purchaseHistoryManager, String str, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "inapp";
        }
        return purchaseHistoryManager.queryAllPurchaseHistory(str, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseHistoryResult queryPurchaseHistory(String type, String continuationToken) {
        if (this.billingService == null) {
            return new PurchaseHistoryResult(2, AbstractC2279u.m(), null);
        }
        try {
            Bundle bundle = new Bundle();
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Calling getPurchaseHistory via AIDL with API version 7, type=" + type);
            }
            IInAppBillingService iInAppBillingService = this.billingService;
            AbstractC5504s.e(iInAppBillingService);
            Bundle response = iInAppBillingService.getPurchaseHistory(7, this.context.getPackageName(), type, continuationToken, bundle);
            AbstractC5504s.g(response, "response");
            return parseResponse(response);
        } catch (Throwable th2) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error querying purchase history via AIDL", th2);
            return new PurchaseHistoryResult(6, AbstractC2279u.m(), null);
        }
    }

    static /* synthetic */ PurchaseHistoryResult queryPurchaseHistory$default(PurchaseHistoryManager purchaseHistoryManager, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "inapp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return purchaseHistoryManager.queryPurchaseHistory(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object connect(Zd.e r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.history.PurchaseHistoryManager.connect(Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object disconnect(Zd.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.revenuecat.purchases.google.history.PurchaseHistoryManager.C41091
            if (r0 == 0) goto L13
            r0 = r6
            com.revenuecat.purchases.google.history.PurchaseHistoryManager$disconnect$1 r0 = (com.revenuecat.purchases.google.history.PurchaseHistoryManager.C41091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.google.history.PurchaseHistoryManager$disconnect$1 r0 = new com.revenuecat.purchases.google.history.PurchaseHistoryManager$disconnect$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            Pf.a r1 = (Pf.a) r1
            java.lang.Object r0 = r0.L$0
            com.revenuecat.purchases.google.history.PurchaseHistoryManager r0 = (com.revenuecat.purchases.google.history.PurchaseHistoryManager) r0
            Td.v.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            Td.v.b(r6)
            Pf.a r6 = r5.operationsMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            r0.cleanup()     // Catch: java.lang.Throwable -> L59
            Td.L r6 = Td.L.f17438a     // Catch: java.lang.Throwable -> L59
            r1.e(r4)
            Td.L r6 = Td.L.f17438a
            return r6
        L59:
            r6 = move-exception
            r1.e(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.history.PurchaseHistoryManager.disconnect(Zd.e):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(2:14|15)(5:16|124|111|112|139))(6:17|18|128|93|94|95))(2:19|20))(1:21))(3:22|(1:25)|109)|126|26|27|130|(3:29|(2:31|(1:33))(2:36|(1:38))|39)(3:41|(1:43)(1:45)|46)|47|123|(2:49|(0)(1:52))(11:121|53|(4:54|55|132|(3:137|57|(1:59)(0))(2:65|(2:134|67)(3:69|(1:71)|(1:78)(1:135))))|131|79|(1:81)(1:82)|83|(2:86|84)|138|87|(2:89|(6:92|18|128|93|94|95))(1:99))|109|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d8, code lost:
    
        if (r2 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02da, code lost:
    
        r2 = r13.operationsMutex;
        r3.L$0 = r13;
        r3.L$1 = r12;
        r3.L$2 = r0;
        r3.L$3 = r2;
        r3.label = 4;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ee, code lost:
    
        if (r2.c(null, r3) != r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f1, code lost:
    
        r4 = r0;
        r5 = r12;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0307, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object queryAllPurchaseHistory(java.lang.String r18, Zd.e r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.history.PurchaseHistoryManager.queryAllPurchaseHistory(java.lang.String, Zd.e):java.lang.Object");
    }
}
