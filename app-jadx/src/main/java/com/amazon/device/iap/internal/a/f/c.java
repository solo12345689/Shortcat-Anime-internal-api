package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35034c = "c";

    public c(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, com.amazon.a.a.o.b.f34642ah);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Receipt receiptA;
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f35034c, "data: " + mapB);
        String str = (String) b().get("requestId");
        String str2 = (String) mapB.get("userId");
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f34655m);
        String str4 = (String) mapB.get(com.amazon.a.a.o.b.f34611D);
        if (f.a(str4)) {
            a(str2, str3, str, PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        JSONObject jSONObject = new JSONObject(str4);
        PurchaseResponse.RequestStatus requestStatusSafeValueOf = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString(com.amazon.a.a.o.b.f34656n));
        if (requestStatusSafeValueOf == PurchaseResponse.RequestStatus.SUCCESSFUL) {
            try {
                receiptA = com.amazon.device.iap.internal.util.c.a(jSONObject, str2, str);
            } catch (Throwable unused) {
                a(str2, str3, str, PurchaseResponse.RequestStatus.FAILED);
                return false;
            }
        } else {
            receiptA = null;
        }
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a(new PurchaseResponseBuilder().setRequestId(cVar.d()).setRequestStatus(requestStatusSafeValueOf).setUserData(new UserDataBuilder().setUserId(str2).setMarketplace(str3).build()).setReceipt(receiptA).build());
        return true;
    }
}
