package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f34996d = "c";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Date f34997e = new Date(0);

    public c(com.amazon.device.iap.internal.a.c cVar, boolean z10) {
        super(cVar, "1.0", z10);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f34996d, "data: " + mapB);
        String str = (String) mapB.get("userId");
        String str2 = (String) mapB.get(com.amazon.a.a.o.b.f34655m);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray((String) mapB.get(com.amazon.a.a.o.b.f34614G));
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Receipt receiptA = com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i10), str, (String) null);
                arrayList.add(receiptA);
                if (ProductType.ENTITLED == receiptA.getProductType()) {
                    com.amazon.device.iap.internal.b.a.a().a(str, receiptA.getReceiptId(), receiptA.getSku());
                }
            } catch (e e10) {
                com.amazon.device.iap.internal.util.b.b(f34996d, "fail to parse receipt, requestId:" + e10.a());
            } catch (f e11) {
                com.amazon.device.iap.internal.util.b.b(f34996d, "fail to verify receipt, requestId:" + e11.a());
            } catch (Throwable th2) {
                com.amazon.device.iap.internal.util.b.b(f34996d, "fail to verify receipt, requestId:" + th2.getMessage());
            }
        }
        JSONArray jSONArray2 = new JSONArray((String) mapB.get(com.amazon.a.a.o.b.f34615H));
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            try {
                String string = jSONArray2.getString(i11);
                arrayList.add(new ReceiptBuilder().setSku(string).setProductType(ProductType.ENTITLED).setPurchaseDate(null).setCancelDate(f34997e).setReceiptId(com.amazon.device.iap.internal.b.a.a().a(str, string)).build());
            } catch (JSONException unused) {
                com.amazon.device.iap.internal.util.b.b(f34996d, "fail to parse JSON[" + i11 + "] in \"" + jSONArray2 + "\"");
            }
        }
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f34644b);
        boolean zEqualsIgnoreCase = com.amazon.a.a.o.b.f34640af.equalsIgnoreCase((String) mapB.get(com.amazon.a.a.o.b.f34651i));
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse purchaseUpdatesResponseBuild = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(arrayList).setHasMore(zEqualsIgnoreCase).build();
        purchaseUpdatesResponseBuild.getReceipts().addAll(com.amazon.device.iap.internal.b.d.a().b(purchaseUpdatesResponseBuild.getUserData().getUserId()));
        cVar.a().a(purchaseUpdatesResponseBuild);
        cVar.a().a(com.amazon.a.a.o.b.ap, str3);
        return true;
    }
}
