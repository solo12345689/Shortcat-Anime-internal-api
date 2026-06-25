package com.amazon.device.drm.a.b;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends com.amazon.a.a.j.a {

    /* JADX INFO: renamed from: c */
    private static final String f34952c = "b";

    /* JADX INFO: renamed from: d */
    private final RequestId f34953d;

    /* JADX INFO: renamed from: com.amazon.device.drm.a.b.b$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f34954a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ LicensingListener f34955b;

        AnonymousClass1(Object obj, LicensingListener licensingListener) {
            obj = obj;
            licensingListener = licensingListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object obj = obj;
                if (obj instanceof LicenseResponse) {
                    licensingListener.onLicenseCommandResponse((LicenseResponse) obj);
                    return;
                }
                com.amazon.device.drm.a.e.b.b(b.f34952c, "Unknown response type:" + obj.getClass().getName());
            } catch (Throwable th2) {
                com.amazon.device.drm.a.e.b.b(b.f34952c, "Error in sendResponse: " + th2);
            }
        }
    }

    public b(RequestId requestId) {
        this.f34953d = requestId;
    }

    @Override // com.amazon.a.a.j.a
    protected void a(h hVar) {
        this.f34424b = hVar;
    }

    public RequestId d() {
        return this.f34953d;
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
        f.a(obj, "response");
        Context contextC = d.d().c();
        LicensingListener licensingListenerB = d.d().b();
        if (contextC != null && licensingListenerB != null) {
            new Handler(contextC.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.drm.a.b.b.1

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Object f34954a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ LicensingListener f34955b;

                AnonymousClass1(Object obj2, LicensingListener licensingListenerB2) {
                    obj = obj2;
                    licensingListener = licensingListenerB2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof LicenseResponse) {
                            licensingListener.onLicenseCommandResponse((LicenseResponse) obj2);
                            return;
                        }
                        com.amazon.device.drm.a.e.b.b(b.f34952c, "Unknown response type:" + obj.getClass().getName());
                    } catch (Throwable th2) {
                        com.amazon.device.drm.a.e.b.b(b.f34952c, "Error in sendResponse: " + th2);
                    }
                }
            });
            return;
        }
        com.amazon.device.drm.a.e.b.a(f34952c, "LicensingListener is not set. Dropping response: " + obj2);
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
