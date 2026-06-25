package com.amazon.device.iap.internal.a.d;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.b.d;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c */
    private final String f35013c;

    /* JADX INFO: renamed from: d */
    private final FulfillmentResult f35014d;

    public a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        super(requestId);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        this.f35013c = str;
        this.f35014d = fulfillmentResult;
        a((h) new b(this, hashSet, fulfillmentResult.toString()));
    }

    @Override // com.amazon.device.iap.internal.a.c, com.amazon.a.a.j.a
    public void c() {
        String strC;
        FulfillmentResult fulfillmentResult = FulfillmentResult.FULFILLED;
        FulfillmentResult fulfillmentResult2 = this.f35014d;
        if ((fulfillmentResult == fulfillmentResult2 || FulfillmentResult.UNAVAILABLE == fulfillmentResult2) && (strC = d.a().c(this.f35013c)) != null) {
            new com.amazon.device.iap.internal.a.g.b(this, strC).l();
            d.a().a(this.f35013c);
        }
    }

    @Override // com.amazon.device.iap.internal.a.c, com.amazon.a.a.j.a
    public void b() {
    }
}
