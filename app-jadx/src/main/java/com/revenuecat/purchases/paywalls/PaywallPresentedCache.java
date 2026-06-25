package com.revenuecat.purchases.paywalls;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "", "<init>", "()V", "", "hasCachedPurchaseInitiatedData", "()Z", "", "", "purchasedProductIDs", "", "purchaseTimestamp", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "getAndRemovePurchaseInitiatedEventIfNeeded", "(Ljava/util/List;Ljava/lang/Long;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "event", "LTd/L;", "receiveEvent", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "<set-?>", "lastPurchaseInitiatedEvent", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallPresentedCache {
    private PaywallEvent lastPurchaseInitiatedEvent;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaywallEventType.values().length];
            try {
                iArr[PaywallEventType.PURCHASE_INITIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallEventType.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaywallEventType.PURCHASE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final synchronized PaywallEvent getAndRemovePurchaseInitiatedEventIfNeeded(List<String> purchasedProductIDs, Long purchaseTimestamp) {
        try {
            AbstractC5504s.h(purchasedProductIDs, "purchasedProductIDs");
            PaywallEvent paywallEvent = this.lastPurchaseInitiatedEvent;
            if (paywallEvent != null) {
                boolean z10 = false;
                if (purchaseTimestamp != null) {
                    if (paywallEvent.getCreationData().getDate().getTime() <= purchaseTimestamp.longValue()) {
                        z10 = true;
                    }
                }
                if (paywallEvent.getType() == PaywallEventType.PURCHASE_INITIATED && AbstractC2279u.e0(purchasedProductIDs, paywallEvent.getData().getProductIdentifier()) && z10) {
                    PaywallEvent paywallEvent2 = this.lastPurchaseInitiatedEvent;
                    this.lastPurchaseInitiatedEvent = null;
                    return paywallEvent2;
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean hasCachedPurchaseInitiatedData() {
        return this.lastPurchaseInitiatedEvent != null;
    }

    public final synchronized void receiveEvent(PaywallEvent event) {
        try {
            AbstractC5504s.h(event, "event");
            int i10 = WhenMappings.$EnumSwitchMapping$0[event.getType().ordinal()];
            if (i10 == 1) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Caching paywall purchase initiated event.");
                }
                this.lastPurchaseInitiatedEvent = event;
            } else if (i10 == 2 || i10 == 3) {
                LogLevel logLevel2 = LogLevel.VERBOSE;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "Clearing cached paywall purchase initiated event.");
                }
                this.lastPurchaseInitiatedEvent = null;
            }
        } finally {
        }
    }
}
