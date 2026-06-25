package com.revenuecat.purchases.google.usecase;

import N4.C1961a;
import N4.InterfaceC1962b;
import Td.L;
import Td.r;
import com.android.billingclient.api.AbstractC3156a;
import com.android.billingclient.api.C3160e;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\t\u0012\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0005\u0012*\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR/\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/AcknowledgePurchaseUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lcom/revenuecat/purchases/google/usecase/AcknowledgePurchaseUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "LTd/L;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/AcknowledgePurchaseUseCaseParams;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/google/usecase/AcknowledgePurchaseUseCaseParams;", "Lkotlin/jvm/functions/Function1;", "getOnReceive", "()Lkotlin/jvm/functions/Function1;", "getOnError", "getWithConnectedClient", "", "getBackoffForNetworkErrors", "()Z", "backoffForNetworkErrors", "getErrorMessage", "()Ljava/lang/String;", com.amazon.a.a.o.b.f34648f, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AcknowledgePurchaseUseCase extends BillingClientUseCase<String> {
    private final Function1 onError;
    private final Function1 onReceive;
    private final AcknowledgePurchaseUseCaseParams useCaseParams;
    private final Function1 withConnectedClient;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase$executeAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "LTd/L;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase, C3160e billingResult) {
            AbstractC5504s.h(billingResult, "billingResult");
            BillingClientUseCase.processResult$default(acknowledgePurchaseUseCase, billingResult, acknowledgePurchaseUseCase.useCaseParams.getPurchaseToken(), null, new AcknowledgePurchaseUseCase$executeAsync$1$1$1(acknowledgePurchaseUseCase), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC3156a) obj);
            return L.f17438a;
        }

        public final void invoke(AbstractC3156a invoke) {
            AbstractC5504s.h(invoke, "$this$invoke");
            C1961a c1961aA = C1961a.b().b(AcknowledgePurchaseUseCase.this.useCaseParams.getPurchaseToken()).a();
            AbstractC5504s.g(c1961aA, "newBuilder()\n           …\n                .build()");
            final AcknowledgePurchaseUseCase acknowledgePurchaseUseCase = AcknowledgePurchaseUseCase.this;
            invoke.a(c1961aA, new InterfaceC1962b() { // from class: com.revenuecat.purchases.google.usecase.a
                @Override // N4.InterfaceC1962b
                public final void a(C3160e c3160e) {
                    AcknowledgePurchaseUseCase.AnonymousClass1.invoke$lambda$0(acknowledgePurchaseUseCase, c3160e);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcknowledgePurchaseUseCase(AcknowledgePurchaseUseCaseParams useCaseParams, Function1 onReceive, Function1 onError, Function1 withConnectedClient, Function2 executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        AbstractC5504s.h(useCaseParams, "useCaseParams");
        AbstractC5504s.h(onReceive, "onReceive");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(withConnectedClient, "withConnectedClient");
        AbstractC5504s.h(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    protected boolean getBackoffForNetworkErrors() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.useCaseParams.getInitiationSource().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw new r();
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error acknowledging purchase";
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
    public void onOk(String received) {
        AbstractC5504s.h(received, "received");
        this.onReceive.invoke(received);
    }
}
