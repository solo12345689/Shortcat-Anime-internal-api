package com.revenuecat.purchases.react.ui.customercenter.events;

import be.AbstractC3048a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;", "", "eventName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "ON_DISMISS", "ON_CUSTOM_ACTION_SELECTED", "ON_RESTORE_STARTED", "ON_RESTORE_COMPLETED", "ON_RESTORE_FAILED", "ON_SHOWING_MANAGE_SUBSCRIPTIONS", "ON_FEEDBACK_SURVEY_COMPLETED", "ON_MANAGEMENT_OPTION_SELECTED", "ON_REFUND_REQUEST_STARTED", "ON_REFUND_REQUEST_COMPLETED", "ON_PROMOTIONAL_OFFER_SUCCEEDED", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomerCenterEventName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CustomerCenterEventName[] $VALUES;
    private final String eventName;
    public static final CustomerCenterEventName ON_DISMISS = new CustomerCenterEventName("ON_DISMISS", 0, "onDismiss");
    public static final CustomerCenterEventName ON_CUSTOM_ACTION_SELECTED = new CustomerCenterEventName("ON_CUSTOM_ACTION_SELECTED", 1, "onCustomActionSelected");
    public static final CustomerCenterEventName ON_RESTORE_STARTED = new CustomerCenterEventName("ON_RESTORE_STARTED", 2, "onRestoreStarted");
    public static final CustomerCenterEventName ON_RESTORE_COMPLETED = new CustomerCenterEventName("ON_RESTORE_COMPLETED", 3, "onRestoreCompleted");
    public static final CustomerCenterEventName ON_RESTORE_FAILED = new CustomerCenterEventName("ON_RESTORE_FAILED", 4, "onRestoreFailed");
    public static final CustomerCenterEventName ON_SHOWING_MANAGE_SUBSCRIPTIONS = new CustomerCenterEventName("ON_SHOWING_MANAGE_SUBSCRIPTIONS", 5, "onShowingManageSubscriptions");
    public static final CustomerCenterEventName ON_FEEDBACK_SURVEY_COMPLETED = new CustomerCenterEventName("ON_FEEDBACK_SURVEY_COMPLETED", 6, "onFeedbackSurveyCompleted");
    public static final CustomerCenterEventName ON_MANAGEMENT_OPTION_SELECTED = new CustomerCenterEventName("ON_MANAGEMENT_OPTION_SELECTED", 7, "onManagementOptionSelected");
    public static final CustomerCenterEventName ON_REFUND_REQUEST_STARTED = new CustomerCenterEventName("ON_REFUND_REQUEST_STARTED", 8, "onRefundRequestStarted");
    public static final CustomerCenterEventName ON_REFUND_REQUEST_COMPLETED = new CustomerCenterEventName("ON_REFUND_REQUEST_COMPLETED", 9, "onRefundRequestCompleted");
    public static final CustomerCenterEventName ON_PROMOTIONAL_OFFER_SUCCEEDED = new CustomerCenterEventName("ON_PROMOTIONAL_OFFER_SUCCEEDED", 10, "onPromotionalOfferSucceeded");

    private static final /* synthetic */ CustomerCenterEventName[] $values() {
        return new CustomerCenterEventName[]{ON_DISMISS, ON_CUSTOM_ACTION_SELECTED, ON_RESTORE_STARTED, ON_RESTORE_COMPLETED, ON_RESTORE_FAILED, ON_SHOWING_MANAGE_SUBSCRIPTIONS, ON_FEEDBACK_SURVEY_COMPLETED, ON_MANAGEMENT_OPTION_SELECTED, ON_REFUND_REQUEST_STARTED, ON_REFUND_REQUEST_COMPLETED, ON_PROMOTIONAL_OFFER_SUCCEEDED};
    }

    static {
        CustomerCenterEventName[] customerCenterEventNameArr$values = $values();
        $VALUES = customerCenterEventNameArr$values;
        $ENTRIES = AbstractC3048a.a(customerCenterEventNameArr$values);
    }

    private CustomerCenterEventName(String str, int i10, String str2) {
        this.eventName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CustomerCenterEventName valueOf(String str) {
        return (CustomerCenterEventName) Enum.valueOf(CustomerCenterEventName.class, str);
    }

    public static CustomerCenterEventName[] values() {
        return (CustomerCenterEventName[]) $VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}
