package com.amazon.device.iap.internal.a.c;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.amazon.device.iap.internal.a.c {
    public a(RequestId requestId, UserDataRequest userDataRequest) {
        super(requestId);
        d dVar = new d(this, userDataRequest);
        dVar.b(new c(this));
        a((h) dVar);
    }

    @Override // com.amazon.device.iap.internal.a.c, com.amazon.a.a.j.a
    public void b() {
        a((UserDataResponse) a().b());
    }

    @Override // com.amazon.device.iap.internal.a.c, com.amazon.a.a.j.a
    public void c() {
        UserDataResponse userDataResponseBuild = (UserDataResponse) a().b();
        if (userDataResponseBuild == null) {
            userDataResponseBuild = new UserDataResponseBuilder().setRequestId(d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build();
        }
        a(userDataResponseBuild);
    }
}
