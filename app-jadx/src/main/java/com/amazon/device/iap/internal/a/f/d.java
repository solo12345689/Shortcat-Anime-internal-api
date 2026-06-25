package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.amazon.device.iap.internal.a.c {
    public d(RequestId requestId) {
        super(requestId);
        c cVar = new c(this);
        cVar.b(new b(this));
        a((h) cVar);
    }

    @Override // com.amazon.device.iap.internal.a.c, com.amazon.a.a.j.a
    public void b() {
        PurchaseResponse purchaseResponse = (PurchaseResponse) a().b();
        if (purchaseResponse == null) {
            return;
        }
        Receipt receipt = purchaseResponse.getReceipt();
        boolean z10 = receipt != null;
        h cVar = new com.amazon.device.iap.internal.a.g.c(this, z10);
        if (z10 && (ProductType.ENTITLED == receipt.getProductType() || ProductType.SUBSCRIPTION == receipt.getProductType())) {
            cVar.b(new com.amazon.device.iap.internal.a.g.b(this, d().toString()));
        }
        a(purchaseResponse, cVar);
    }

    @Override // com.amazon.device.iap.internal.a.c, com.amazon.a.a.j.a
    public void c() {
        PurchaseResponse purchaseResponseBuild = (PurchaseResponse) a().b();
        if (purchaseResponseBuild == null) {
            purchaseResponseBuild = new PurchaseResponseBuilder().setRequestId(d()).setRequestStatus(PurchaseResponse.RequestStatus.FAILED).build();
        }
        a(purchaseResponseBuild, new com.amazon.device.iap.internal.a.g.c(this, false));
    }
}
