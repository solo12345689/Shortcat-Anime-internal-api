package com.revenuecat.purchases.react.ui.customercenter.events;

import com.facebook.react.uimanager.events.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEvent;", "T", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewTag", "<init>", "(II)V", "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;", "getCustomerCenterEventName", "()Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;", "", "getEventName", "()Ljava/lang/String;", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CustomerCenterEvent<T> extends d {
    public CustomerCenterEvent(int i10, int i11) {
        super(i10, i11);
    }

    public abstract CustomerCenterEventName getCustomerCenterEventName();

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return getCustomerCenterEventName().getEventName();
    }
}
