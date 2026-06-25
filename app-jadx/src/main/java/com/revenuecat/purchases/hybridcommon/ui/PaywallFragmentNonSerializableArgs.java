package com.revenuecat.purchases.hybridcommon.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgs;", "", "paywallListener", "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;", "purchaseLogic", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "(Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V", "getPaywallListener", "()Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;", "getPurchaseLogic", "()Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaywallFragmentNonSerializableArgs {
    private final PaywallListenerWrapper paywallListener;
    private final HybridPurchaseLogicBridge purchaseLogic;

    public PaywallFragmentNonSerializableArgs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaywallFragmentNonSerializableArgs copy$default(PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs, PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallListenerWrapper = paywallFragmentNonSerializableArgs.paywallListener;
        }
        if ((i10 & 2) != 0) {
            hybridPurchaseLogicBridge = paywallFragmentNonSerializableArgs.purchaseLogic;
        }
        return paywallFragmentNonSerializableArgs.copy(paywallListenerWrapper, hybridPurchaseLogicBridge);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaywallListenerWrapper getPaywallListener() {
        return this.paywallListener;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HybridPurchaseLogicBridge getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public final PaywallFragmentNonSerializableArgs copy(PaywallListenerWrapper paywallListener, HybridPurchaseLogicBridge purchaseLogic) {
        return new PaywallFragmentNonSerializableArgs(paywallListener, purchaseLogic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallFragmentNonSerializableArgs)) {
            return false;
        }
        PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs = (PaywallFragmentNonSerializableArgs) other;
        return AbstractC5504s.c(this.paywallListener, paywallFragmentNonSerializableArgs.paywallListener) && AbstractC5504s.c(this.purchaseLogic, paywallFragmentNonSerializableArgs.purchaseLogic);
    }

    public final PaywallListenerWrapper getPaywallListener() {
        return this.paywallListener;
    }

    public final HybridPurchaseLogicBridge getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public int hashCode() {
        PaywallListenerWrapper paywallListenerWrapper = this.paywallListener;
        int iHashCode = (paywallListenerWrapper == null ? 0 : paywallListenerWrapper.hashCode()) * 31;
        HybridPurchaseLogicBridge hybridPurchaseLogicBridge = this.purchaseLogic;
        return iHashCode + (hybridPurchaseLogicBridge != null ? hybridPurchaseLogicBridge.hashCode() : 0);
    }

    public String toString() {
        return "PaywallFragmentNonSerializableArgs(paywallListener=" + this.paywallListener + ", purchaseLogic=" + this.purchaseLogic + ')';
    }

    public PaywallFragmentNonSerializableArgs(PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
        this.paywallListener = paywallListenerWrapper;
        this.purchaseLogic = hybridPurchaseLogicBridge;
    }

    public /* synthetic */ PaywallFragmentNonSerializableArgs(PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : paywallListenerWrapper, (i10 & 2) != 0 ? null : hybridPurchaseLogicBridge);
    }
}
