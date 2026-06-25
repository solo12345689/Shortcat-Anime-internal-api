package com.revenuecat.purchases;

import Td.L;
import Ud.AbstractC2279u;
import Ud.S;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.SyncPendingPurchaseResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesByHashedToken", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ Function1 $callback;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ boolean $allowSharingPlayStoreAccount;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ Set<String> $pendingTransactionsTokens;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Function1 function1) {
                super(0);
                this.$callback = function1;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m143invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m143invoke() {
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(SyncPendingPurchaseResult.NoPendingPurchasesToSync.INSTANCE);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06562 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06562(Function1 function1) {
                super(1);
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC5504s.h(it, "it");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new SyncPendingPurchaseResult.Error(it));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Function1 function1) {
                super(1);
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return L.f17438a;
            }

            public final void invoke(CustomerInfo it) {
                AbstractC5504s.h(it, "it");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new SyncPendingPurchaseResult.Success(it));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z10, Set<String> set, Function1 function1) {
            super(0);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z10;
            this.$pendingTransactionsTokens = set;
            this.$callback = function1;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m142invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m142invoke() {
            this.this$0.postReceiptHelper.postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new AnonymousClass1(this.$callback), new C06562(this.$callback), new AnonymousClass3(this.$callback));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
        final /* synthetic */ boolean $allowSharingPlayStoreAccount;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ Set<String> $pendingTransactionsTokens;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ Function1 $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Function1 function1, PurchasesError purchasesError) {
                super(0);
                this.$callback = function1;
                this.$error = purchasesError;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m144invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m144invoke() {
                LogHandler currentLogHandler;
                String str;
                String str2;
                LogIntent logIntent = LogIntent.DEBUG;
                PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new SyncPendingPurchaseResult.Error(this.$error));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Function1 function1, PurchasesError purchasesError) {
                super(1);
                this.$callback = function1;
                this.$error = purchasesError;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC5504s.h(it, "it");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new SyncPendingPurchaseResult.Error(this.$error));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06573 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06573(Function1 function1) {
                super(1);
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return L.f17438a;
            }

            public final void invoke(CustomerInfo it) {
                AbstractC5504s.h(it, "it");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new SyncPendingPurchaseResult.Success(it));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z10, Set<String> set, Function1 function1) {
            super(1);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z10;
            this.$pendingTransactionsTokens = set;
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            this.this$0.postReceiptHelper.postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new AnonymousClass1(this.$callback, error), new AnonymousClass2(this.$callback, error), new C06573(this.$callback));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements Function1 {
        final /* synthetic */ boolean $allowSharingPlayStoreAccount;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ Set<String> $pendingTransactionsTokens;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            final /* synthetic */ Function1 $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Function1 function1, CustomerInfo customerInfo) {
                super(0);
                this.$callback = function1;
                this.$customerInfo = customerInfo;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m145invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m145invoke() {
                LogHandler currentLogHandler;
                String str;
                String str2;
                LogIntent logIntent = LogIntent.DEBUG;
                PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new SyncPendingPurchaseResult.Success(this.$customerInfo));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Function1 function1) {
                super(1);
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return L.f17438a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC5504s.h(it, "it");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new SyncPendingPurchaseResult.Error(it));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
            final /* synthetic */ Function1 $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Function1 function1) {
                super(1);
                this.$callback = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return L.f17438a;
            }

            public final void invoke(CustomerInfo it) {
                AbstractC5504s.h(it, "it");
                Function1 function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(new SyncPendingPurchaseResult.Success(it));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z10, Set<String> set, Function1 function1) {
            super(1);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z10;
            this.$pendingTransactionsTokens = set;
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return L.f17438a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            this.this$0.postReceiptHelper.postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new AnonymousClass1(this.$callback, customerInfo), new AnonymousClass2(this.$callback), new AnonymousClass3(this.$callback));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z10, String str, Function1 function1) {
        super(1);
        this.this$0 = postPendingTransactionsHelper;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, StoreTransaction>) obj);
        return L.f17438a;
    }

    public final void invoke(Map<String, StoreTransaction> purchasesByHashedToken) {
        LogHandler currentLogHandler;
        String str;
        Object objInvoke;
        AbstractC5504s.h(purchasesByHashedToken, "purchasesByHashedToken");
        for (Map.Entry<String, StoreTransaction> entry : purchasesByHashedToken.entrySet()) {
            String key = entry.getKey();
            StoreTransaction value = entry.getValue();
            LogIntent logIntent = LogIntent.DEBUG;
            PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1(logIntent, value, key);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        objInvoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        objInvoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        objInvoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        objInvoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
            }
            currentLogHandler.d(str, (String) objInvoke);
        }
        this.this$0.deviceCache.cleanPreviouslySentTokens$purchases_defaultsBc8Release(purchasesByHashedToken.keySet());
        List<StoreTransaction> activePurchasesNotInCache$purchases_defaultsBc8Release = this.this$0.deviceCache.getActivePurchasesNotInCache$purchases_defaultsBc8Release(purchasesByHashedToken);
        List<StoreTransaction> purchasesWithAutoRenewingChange$purchases_defaultsBc8Release = this.this$0.deviceCache.getPurchasesWithAutoRenewingChange$purchases_defaultsBc8Release(purchasesByHashedToken);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(purchasesWithAutoRenewingChange$purchases_defaultsBc8Release, 10));
        Iterator<T> it = purchasesWithAutoRenewingChange$purchases_defaultsBc8Release.iterator();
        while (it.hasNext()) {
            arrayList.add(UtilsKt.sha1(((StoreTransaction) it.next()).getPurchaseToken()));
        }
        this.this$0.deviceCache.saveAutoRenewingStatus$purchases_defaultsBc8Release(S.m(purchasesByHashedToken, AbstractC2279u.f1(arrayList)));
        List listI0 = AbstractC2279u.I0(activePurchasesNotInCache$purchases_defaultsBc8Release, purchasesWithAutoRenewingChange$purchases_defaultsBc8Release);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listI0) {
            if (hashSet.add(((StoreTransaction) obj).getPurchaseToken())) {
                arrayList2.add(obj);
            }
        }
        Collection<StoreTransaction> collectionValues = purchasesByHashedToken.values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (((StoreTransaction) obj2).getPurchaseState() == PurchaseState.PENDING) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC2279u.x(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((StoreTransaction) it2.next()).getPurchaseToken());
        }
        Set setF1 = AbstractC2279u.f1(arrayList4);
        PostPendingTransactionsHelper postPendingTransactionsHelper = this.this$0;
        boolean z10 = this.$allowSharingPlayStoreAccount;
        String str2 = this.$appUserID;
        postPendingTransactionsHelper.postTransactionsWithCompletion(arrayList2, z10, str2, new AnonymousClass2(postPendingTransactionsHelper, str2, z10, setF1, this.$callback), new AnonymousClass3(this.this$0, this.$appUserID, this.$allowSharingPlayStoreAccount, setF1, this.$callback), new AnonymousClass4(this.this$0, this.$appUserID, this.$allowSharingPlayStoreAccount, setF1, this.$callback));
    }
}
