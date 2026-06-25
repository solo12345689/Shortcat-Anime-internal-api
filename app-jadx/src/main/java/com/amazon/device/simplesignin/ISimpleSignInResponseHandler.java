package com.amazon.device.simplesignin;

import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface ISimpleSignInResponseHandler {
    void onGetUserAndLinksResponse(GetUserAndLinksResponse getUserAndLinksResponse);

    void onLinkUserAccountResponse(LinkUserAccountResponse linkUserAccountResponse);

    void onRecordMetricsEventResponse(RecordMetricsEventResponse recordMetricsEventResponse);

    void onShowLoginSelectionResponse(ShowLoginSelectionResponse showLoginSelectionResponse);
}
