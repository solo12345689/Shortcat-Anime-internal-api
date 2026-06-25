package com.amazon.device.iap.internal.a;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends com.amazon.a.a.j.a {

    /* JADX INFO: renamed from: c */
    private static final String f34999c = "c";

    /* JADX INFO: renamed from: d */
    private RequestId f35000d;

    /* JADX INFO: renamed from: com.amazon.device.iap.internal.a.c$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f35001a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PurchasingListener f35002b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ h f35003c;

        AnonymousClass1(Object obj, PurchasingListener purchasingListener, h hVar) {
            obj = obj;
            purchasingListener = purchasingListener;
            hVar = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a().a(com.amazon.a.a.o.b.ao, Boolean.FALSE);
            try {
                Object obj = obj;
                if (obj instanceof ProductDataResponse) {
                    purchasingListener.onProductDataResponse((ProductDataResponse) obj);
                } else if (obj instanceof UserDataResponse) {
                    purchasingListener.onUserDataResponse((UserDataResponse) obj);
                } else if (obj instanceof PurchaseUpdatesResponse) {
                    PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj;
                    purchasingListener.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                    Object objA = c.this.a().a(com.amazon.a.a.o.b.ap);
                    if (objA != null && (objA instanceof String)) {
                        com.amazon.device.iap.internal.util.a.a(purchaseUpdatesResponse.getUserData().getUserId(), objA.toString());
                    }
                } else if (obj instanceof PurchaseResponse) {
                    purchasingListener.onPurchaseResponse((PurchaseResponse) obj);
                } else {
                    com.amazon.device.iap.internal.util.b.b(c.f34999c, "Unknown response type:" + obj.getClass().getName());
                }
                c.this.a().a(com.amazon.a.a.o.b.ao, Boolean.TRUE);
            } catch (Throwable th2) {
                com.amazon.device.iap.internal.util.b.b(c.f34999c, "Error in sendResponse: " + th2);
            }
            h hVar = hVar;
            if (hVar != null) {
                hVar.a(true);
                hVar.l();
            }
        }
    }

    public c(RequestId requestId) {
        this.f35000d = requestId;
    }

    @Override // com.amazon.a.a.j.a
    protected void a(h hVar) {
        this.f34424b = hVar;
    }

    public RequestId d() {
        return this.f35000d;
    }

    public void e() {
        h hVar = this.f34424b;
        if (hVar != null) {
            hVar.l();
        } else {
            b();
        }
    }

    protected void a(Object obj) {
        a(obj, null);
    }

    protected void a(Object obj, h hVar) {
        com.amazon.a.a.o.f.a(obj, "response");
        Context contextB = com.amazon.device.iap.internal.d.f().b();
        PurchasingListener purchasingListenerA = com.amazon.device.iap.internal.d.f().a();
        if (contextB != null && purchasingListenerA != null) {
            new Handler(contextB.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.a.c.1

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Object f35001a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ PurchasingListener f35002b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ h f35003c;

                AnonymousClass1(Object obj2, PurchasingListener purchasingListenerA2, h hVar2) {
                    obj = obj2;
                    purchasingListener = purchasingListenerA2;
                    hVar = hVar2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.this.a().a(com.amazon.a.a.o.b.ao, Boolean.FALSE);
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof ProductDataResponse) {
                            purchasingListener.onProductDataResponse((ProductDataResponse) obj2);
                        } else if (obj2 instanceof UserDataResponse) {
                            purchasingListener.onUserDataResponse((UserDataResponse) obj2);
                        } else if (obj2 instanceof PurchaseUpdatesResponse) {
                            PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj2;
                            purchasingListener.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                            Object objA = c.this.a().a(com.amazon.a.a.o.b.ap);
                            if (objA != null && (objA instanceof String)) {
                                com.amazon.device.iap.internal.util.a.a(purchaseUpdatesResponse.getUserData().getUserId(), objA.toString());
                            }
                        } else if (obj2 instanceof PurchaseResponse) {
                            purchasingListener.onPurchaseResponse((PurchaseResponse) obj2);
                        } else {
                            com.amazon.device.iap.internal.util.b.b(c.f34999c, "Unknown response type:" + obj.getClass().getName());
                        }
                        c.this.a().a(com.amazon.a.a.o.b.ao, Boolean.TRUE);
                    } catch (Throwable th2) {
                        com.amazon.device.iap.internal.util.b.b(c.f34999c, "Error in sendResponse: " + th2);
                    }
                    h hVar2 = hVar;
                    if (hVar2 != null) {
                        hVar2.a(true);
                        hVar.l();
                    }
                }
            });
            return;
        }
        com.amazon.device.iap.internal.util.b.a(f34999c, "PurchasingListener is not set. Dropping response: " + obj2);
    }

    @Override // com.amazon.a.a.j.a
    public com.amazon.a.a.j.b a() {
        return this.f34423a;
    }

    @Override // com.amazon.a.a.j.a
    public void b() {
    }

    @Override // com.amazon.a.a.j.a
    public void c() {
    }
}
