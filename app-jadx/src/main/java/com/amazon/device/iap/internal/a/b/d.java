package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f34998d = "d";

    public d(com.amazon.device.iap.internal.a.c cVar, boolean z10) {
        super(cVar, com.amazon.a.a.o.b.f34642ah, z10);
    }

    private List<Receipt> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i10), str, str3));
            } catch (e e10) {
                com.amazon.device.iap.internal.util.b.b(f34998d, "fail to parse receipt, requestId:" + e10.a());
            } catch (f e11) {
                com.amazon.device.iap.internal.util.b.b(f34998d, "fail to verify receipt, requestId:" + e11.a());
            } catch (Throwable th2) {
                com.amazon.device.iap.internal.util.b.b(f34998d, "fail to verify receipt, requestId:" + th2.getMessage());
            }
        }
        return arrayList;
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f34998d, "data: " + mapB);
        String str = (String) mapB.get("userId");
        String str2 = (String) mapB.get(com.amazon.a.a.o.b.f34655m);
        List<Receipt> listA = a(str, (String) mapB.get(com.amazon.a.a.o.b.f34614G), (String) mapB.get("requestId"));
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f34644b);
        boolean zBooleanValue = Boolean.valueOf((String) mapB.get(com.amazon.a.a.o.b.f34651i)).booleanValue();
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse purchaseUpdatesResponseBuild = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(listA).setHasMore(zBooleanValue).build();
        cVar.a().a(com.amazon.a.a.o.b.ap, str3);
        cVar.a().a(purchaseUpdatesResponseBuild);
        return true;
    }
}
