package com.amazon.device.drm.a.c;

import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a */
    private RequestId f34958a;

    /* JADX INFO: renamed from: b */
    private LicenseResponse.RequestStatus f34959b;

    public LicenseResponse a() {
        return new LicenseResponse(this);
    }

    public RequestId b() {
        return this.f34958a;
    }

    public LicenseResponse.RequestStatus c() {
        return this.f34959b;
    }

    public a a(RequestId requestId) {
        this.f34958a = requestId;
        return this;
    }

    public a a(LicenseResponse.RequestStatus requestStatus) {
        this.f34959b = requestStatus;
        return this;
    }
}
