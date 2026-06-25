package com.revenuecat.purchases.react.ui;

import app.notifee.core.event.LogEvent;
import be.AbstractC3048a;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/react/ui/PaywallEventKey;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", com.amazon.a.a.m.c.f34466f, "REQUEST_ID", "CUSTOMER_INFO", "STORE_TRANSACTION", HybridPurchaseLogicBridge.RESULT_ERROR, "MEASUREMENTS", "HEIGHT", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaywallEventKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaywallEventKey[] $VALUES;
    private final String key;
    public static final PaywallEventKey PACKAGE = new PaywallEventKey(com.amazon.a.a.m.c.f34466f, 0, HybridPurchaseLogicBridge.EVENT_KEY_PACKAGE_BEING_PURCHASED);
    public static final PaywallEventKey REQUEST_ID = new PaywallEventKey("REQUEST_ID", 1, "requestId");
    public static final PaywallEventKey CUSTOMER_INFO = new PaywallEventKey("CUSTOMER_INFO", 2, "customerInfo");
    public static final PaywallEventKey STORE_TRANSACTION = new PaywallEventKey("STORE_TRANSACTION", 3, "storeTransaction");
    public static final PaywallEventKey ERROR = new PaywallEventKey(HybridPurchaseLogicBridge.RESULT_ERROR, 4, LogEvent.LEVEL_ERROR);
    public static final PaywallEventKey MEASUREMENTS = new PaywallEventKey("MEASUREMENTS", 5, "measurements");
    public static final PaywallEventKey HEIGHT = new PaywallEventKey("HEIGHT", 6, "height");

    private static final /* synthetic */ PaywallEventKey[] $values() {
        return new PaywallEventKey[]{PACKAGE, REQUEST_ID, CUSTOMER_INFO, STORE_TRANSACTION, ERROR, MEASUREMENTS, HEIGHT};
    }

    static {
        PaywallEventKey[] paywallEventKeyArr$values = $values();
        $VALUES = paywallEventKeyArr$values;
        $ENTRIES = AbstractC3048a.a(paywallEventKeyArr$values);
    }

    private PaywallEventKey(String str, int i10, String str2) {
        this.key = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PaywallEventKey valueOf(String str) {
        return (PaywallEventKey) Enum.valueOf(PaywallEventKey.class, str);
    }

    public static PaywallEventKey[] values() {
        return (PaywallEventKey[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
