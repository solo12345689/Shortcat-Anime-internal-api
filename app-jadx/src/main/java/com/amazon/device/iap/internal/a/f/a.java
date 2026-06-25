package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseResponse;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f35032b = "purchase_response";

    a(com.amazon.device.iap.internal.a.c cVar, String str) {
        super(cVar, f35032b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
    }

    protected void a(String str, String str2, String str3, PurchaseResponse.RequestStatus requestStatus) {
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a(new PurchaseResponseBuilder().setRequestId(cVar.d()).setRequestStatus(requestStatus).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipt(null).build());
    }
}
