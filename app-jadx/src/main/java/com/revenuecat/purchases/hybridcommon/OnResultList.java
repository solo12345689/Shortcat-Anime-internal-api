package com.revenuecat.purchases.hybridcommon;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface OnResultList {
    void onError(ErrorContainer errorContainer);

    void onReceived(List<Map<String, ?>> list);
}
