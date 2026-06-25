package com.revenuecat.purchases.react.ui;

import be.AbstractC3048a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/react/ui/PaywallEventName;", "", "eventName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "ON_PURCHASE_STARTED", "ON_PURCHASE_COMPLETED", "ON_PURCHASE_ERROR", "ON_PURCHASE_CANCELLED", "ON_RESTORE_STARTED", "ON_RESTORE_COMPLETED", "ON_RESTORE_ERROR", "ON_DISMISS", "ON_MEASURE", "ON_PURCHASE_PACKAGE_INITIATED", "ON_PERFORM_PURCHASE", "ON_PERFORM_RESTORE", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaywallEventName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaywallEventName[] $VALUES;
    private final String eventName;
    public static final PaywallEventName ON_PURCHASE_STARTED = new PaywallEventName("ON_PURCHASE_STARTED", 0, "onPurchaseStarted");
    public static final PaywallEventName ON_PURCHASE_COMPLETED = new PaywallEventName("ON_PURCHASE_COMPLETED", 1, "onPurchaseCompleted");
    public static final PaywallEventName ON_PURCHASE_ERROR = new PaywallEventName("ON_PURCHASE_ERROR", 2, "onPurchaseError");
    public static final PaywallEventName ON_PURCHASE_CANCELLED = new PaywallEventName("ON_PURCHASE_CANCELLED", 3, "onPurchaseCancelled");
    public static final PaywallEventName ON_RESTORE_STARTED = new PaywallEventName("ON_RESTORE_STARTED", 4, "onRestoreStarted");
    public static final PaywallEventName ON_RESTORE_COMPLETED = new PaywallEventName("ON_RESTORE_COMPLETED", 5, "onRestoreCompleted");
    public static final PaywallEventName ON_RESTORE_ERROR = new PaywallEventName("ON_RESTORE_ERROR", 6, "onRestoreError");
    public static final PaywallEventName ON_DISMISS = new PaywallEventName("ON_DISMISS", 7, "onDismiss");
    public static final PaywallEventName ON_MEASURE = new PaywallEventName("ON_MEASURE", 8, "onMeasure");
    public static final PaywallEventName ON_PURCHASE_PACKAGE_INITIATED = new PaywallEventName("ON_PURCHASE_PACKAGE_INITIATED", 9, "onPurchasePackageInitiated");
    public static final PaywallEventName ON_PERFORM_PURCHASE = new PaywallEventName("ON_PERFORM_PURCHASE", 10, "onPerformPurchase");
    public static final PaywallEventName ON_PERFORM_RESTORE = new PaywallEventName("ON_PERFORM_RESTORE", 11, "onPerformRestore");

    private static final /* synthetic */ PaywallEventName[] $values() {
        return new PaywallEventName[]{ON_PURCHASE_STARTED, ON_PURCHASE_COMPLETED, ON_PURCHASE_ERROR, ON_PURCHASE_CANCELLED, ON_RESTORE_STARTED, ON_RESTORE_COMPLETED, ON_RESTORE_ERROR, ON_DISMISS, ON_MEASURE, ON_PURCHASE_PACKAGE_INITIATED, ON_PERFORM_PURCHASE, ON_PERFORM_RESTORE};
    }

    static {
        PaywallEventName[] paywallEventNameArr$values = $values();
        $VALUES = paywallEventNameArr$values;
        $ENTRIES = AbstractC3048a.a(paywallEventNameArr$values);
    }

    private PaywallEventName(String str, int i10, String str2) {
        this.eventName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PaywallEventName valueOf(String str) {
        return (PaywallEventName) Enum.valueOf(PaywallEventName.class, str);
    }

    public static PaywallEventName[] values() {
        return (PaywallEventName[]) $VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}
