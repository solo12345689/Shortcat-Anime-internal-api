package com.amazon.a;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34790a = new com.amazon.a.a.o.c("CrossPlatformPluginUtils");

    private static boolean a() {
        if (a.b() != null) {
            return a.b().h();
        }
        return false;
    }

    public static void a(Activity activity) {
        com.amazon.a.a.o.a.a.a(a.d(), "AppstoreSDK not initialized");
        if (a()) {
            return;
        }
        a.b().c(activity);
        if (com.amazon.a.a.o.c.f34699a) {
            f34790a.a("Notified Visibility for activity:" + activity);
        }
    }
}
