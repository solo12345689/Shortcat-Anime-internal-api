package com.revenuecat.purchases.react.ui.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.d;
import com.revenuecat.purchases.react.ui.PaywallEventKey;
import com.revenuecat.purchases.react.ui.PaywallEventName;
import com.revenuecat.purchases.react.ui.RNPurchasesConverters;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b0\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;", "T", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewTag", "<init>", "(II)V", "Lcom/revenuecat/purchases/react/ui/PaywallEventName;", "getPaywallEventName", "()Lcom/revenuecat/purchases/react/ui/PaywallEventName;", "", "Lcom/revenuecat/purchases/react/ui/PaywallEventKey;", "", "", "getPayload", "()Ljava/util/Map;", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PaywallEvent<T> extends d {
    public PaywallEvent(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        Map<PaywallEventKey, Map<String, Object>> payload = getPayload();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Map.Entry<PaywallEventKey, Map<String, Object>> entry : payload.entrySet()) {
            writableNativeMap.putMap(entry.getKey().getKey(), RNPurchasesConverters.convertMapToWriteableMap(entry.getValue()));
        }
        return writableNativeMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return getPaywallEventName().getEventName();
    }

    public abstract Map<PaywallEventKey, Map<String, Object>> getPayload();

    public abstract PaywallEventName getPaywallEventName();
}
