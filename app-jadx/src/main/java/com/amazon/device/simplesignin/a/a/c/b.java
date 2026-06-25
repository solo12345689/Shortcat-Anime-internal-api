package com.amazon.device.simplesignin.a.a.c;

import android.util.Log;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35210b = "SSI_PublishMetric";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35211c = "1.0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35212d = "b";

    b(a aVar, SSIEventRequest sSIEventRequest) {
        super(aVar, f35210b, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f35186t, sSIEventRequest.getEvent().toString());
        super.a(com.amazon.device.simplesignin.a.a.a.f35187u, sSIEventRequest.getEpochTimestamp());
        if (sSIEventRequest.getFailureReason() != null) {
            super.a(com.amazon.device.simplesignin.a.a.a.f35188v, sSIEventRequest.getFailureReason().toString());
        } else {
            super.a(com.amazon.device.simplesignin.a.a.a.f35188v, "NA");
        }
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    protected void a(RequestStatus requestStatus) {
        b(requestStatus);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        if (mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f35185s)) {
            b(RequestStatus.SUCCESSFUL);
            return Boolean.parseBoolean(mapB.get(com.amazon.device.simplesignin.a.a.a.f35185s).toString());
        }
        a(RequestStatus.FAILURE);
        return false;
    }

    private void b(RequestStatus requestStatus) {
        d dVar = (d) j();
        Log.i(f35212d, "Response for request id: " + dVar.e() + " is: " + requestStatus.toString());
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        recordMetricsEventResponse.setRequestId(dVar.e());
        recordMetricsEventResponse.setRequestStatus(requestStatus);
        super.a(recordMetricsEventResponse);
    }
}
