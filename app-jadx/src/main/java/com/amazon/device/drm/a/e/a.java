package com.amazon.device.drm.a.e;

import android.app.Application;
import com.amazon.a.a.o.b.f;
import com.amazon.a.a.o.d.c;
import com.amazon.a.b.g;
import com.amazon.a.b.h;
import java.security.PublicKey;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static com.amazon.a.b.b a(g gVar, PublicKey publicKey) {
        return new com.amazon.a.b.b(new f(gVar.c(), publicKey));
    }

    public static void a(g gVar, com.amazon.a.b.b bVar, Application application) throws com.amazon.a.b.a.a {
        c cVar = new c();
        cVar.a(gVar.a(), bVar.b(), (com.amazon.a.a.o.d.b) h.CUSTOMER_ID);
        cVar.a(gVar.b(), bVar.c(), (com.amazon.a.a.o.d.b) h.DEVICE_ID);
        cVar.a(bVar.e(), application.getPackageName(), (com.amazon.a.a.o.d.b) h.PACKAGE_NAME);
        cVar.a(bVar.d(), new Date(), (com.amazon.a.a.o.d.b) h.EXPIRATION);
        if (cVar.a()) {
            throw new com.amazon.a.b.a.a(cVar);
        }
    }
}
