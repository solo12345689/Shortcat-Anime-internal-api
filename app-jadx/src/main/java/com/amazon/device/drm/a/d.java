package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.model.AppstoreSDKModes;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f34960a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f34961b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f34962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f34963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LicensingListener f34964e;

    private d() {
    }

    public static d d() {
        return f34961b;
    }

    private void f() {
        if (this.f34964e == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    private void g() {
        if (this.f34963d == null) {
            throw new IllegalStateException("You must register a ApplicationContext before invoking this operation");
        }
    }

    public void a(Context context, LicensingListener licensingListener) {
        if (licensingListener == null || context == null) {
            throw new IllegalArgumentException("LicensingManager/Context cannot be null");
        }
        com.amazon.device.drm.a.e.b.a(f34960a, "LicensingListener registered: " + licensingListener);
        com.amazon.device.drm.a.e.b.a(f34960a, "LicensingListener Context: " + context);
        this.f34963d = context.getApplicationContext();
        this.f34964e = licensingListener;
        c cVarA = a.a().a(this.f34963d);
        this.f34962c = cVarA;
        if (cVarA == null) {
            com.amazon.device.drm.a.e.b.a(f34960a, "requestHandler is null");
        }
    }

    public LicensingListener b() {
        return this.f34964e;
    }

    public Context c() {
        return this.f34963d;
    }

    public RequestId e() {
        f();
        RequestId requestId = new RequestId();
        this.f34962c.a(requestId);
        return requestId;
    }

    public String a() {
        try {
            g();
            if (com.amazon.a.a.a((Application) this.f34963d.getApplicationContext())) {
                return AppstoreSDKModes.SANDBOX.name();
            }
            return AppstoreSDKModes.PRODUCTION.name();
        } catch (IllegalStateException unused) {
            return AppstoreSDKModes.UNKNOWN.name();
        }
    }

    public void a(Context context, Intent intent) {
        try {
            this.f34962c.a(context, intent);
        } catch (Exception e10) {
            com.amazon.device.drm.a.e.b.b(f34960a, "Error in onReceive: " + e10);
        }
    }
}
