package com.revenuecat.purchases.google.usecase;

import N4.C1968h;
import N4.InterfaceC1965e;
import Td.L;
import com.android.billingclient.api.AbstractC3156a;
import com.android.billingclient.api.C3158c;
import com.android.billingclient.api.C3160e;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.strings.BillingStrings;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u000b\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR/\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "Lcom/android/billingclient/api/c;", "Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;", "useCaseParams", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lkotlin/Function1;", "LTd/L;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "executeAsync", "()V", "received", "onOk", "(Lcom/android/billingclient/api/c;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lkotlin/jvm/functions/Function1;", "getOnReceive", "()Lkotlin/jvm/functions/Function1;", "getOnError", "getWithConnectedClient", "", "getErrorMessage", "()Ljava/lang/String;", com.amazon.a.a.o.b.f34648f, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetBillingConfigUseCase extends BillingClientUseCase<C3158c> {
    private final DeviceCache deviceCache;
    private final Function1 onError;
    private final Function1 onReceive;
    private final Function1 withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase$executeAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "LTd/L;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        AnonymousClass1() {
            super(1);
        }

        public static final void invoke$lambda$1(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase, C3160e result, C3158c c3158c) {
            AbstractC5504s.h(result, "result");
            if (!atomicBoolean.getAndSet(true)) {
                BillingClientUseCase.processResult$default(getBillingConfigUseCase, result, c3158c, null, null, 12, null);
                return;
            }
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            GetBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1 getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1 = new GetBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1(logIntent, result);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    break;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC3156a) obj);
            return L.f17438a;
        }

        public final void invoke(AbstractC3156a invoke) {
            AbstractC5504s.h(invoke, "$this$invoke");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C1968h c1968hA = C1968h.a().a();
            final GetBillingConfigUseCase getBillingConfigUseCase = GetBillingConfigUseCase.this;
            invoke.d(c1968hA, new InterfaceC1965e() { // from class: com.revenuecat.purchases.google.usecase.c
                @Override // N4.InterfaceC1965e
                public final void a(C3160e c3160e, C3158c c3158c) {
                    GetBillingConfigUseCase.AnonymousClass1.invoke$lambda$1(atomicBoolean, getBillingConfigUseCase, c3160e, c3158c);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBillingConfigUseCase(GetBillingConfigUseCaseParams useCaseParams, DeviceCache deviceCache, Function1 onReceive, Function1 onError, Function1 withConnectedClient, Function2 executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        AbstractC5504s.h(useCaseParams, "useCaseParams");
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(onReceive, "onReceive");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(withConnectedClient, "withConnectedClient");
        AbstractC5504s.h(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.deviceCache = deviceCache;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error getting billing config";
    }

    public final Function1 getOnError() {
        return this.onError;
    }

    public final Function1 getOnReceive() {
        return this.onReceive;
    }

    public final Function1 getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(C3158c received) {
        if (received == null) {
            this.onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, BillingStrings.BILLING_CONFIG_NULL_ON_SUCCESS));
            return;
        }
        DeviceCache deviceCache = this.deviceCache;
        String strA = received.a();
        AbstractC5504s.g(strA, "received.countryCode");
        deviceCache.setStorefront$purchases_defaultsBc8Release(strA);
        this.onReceive.invoke(received);
    }
}
