package com.revenuecat.purchases.hybridcommon.ui;

import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"optionName", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "getOptionName", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;)Ljava/lang/String;", "hybridcommon-ui_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterListenerWrapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOptionName(CustomerCenterManagementOption customerCenterManagementOption) {
        return customerCenterManagementOption instanceof CustomerCenterManagementOption.Cancel ? "cancel" : customerCenterManagementOption instanceof CustomerCenterManagementOption.MissingPurchase ? "missing_purchase" : customerCenterManagementOption instanceof CustomerCenterManagementOption.CustomUrl ? "custom_url" : customerCenterManagementOption instanceof CustomerCenterManagementOption.CustomAction ? "custom_action" : "unknown";
    }
}
