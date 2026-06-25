package com.amazon.device.iap.internal.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.a.a.i.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34982b = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f34983e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f34984f = "Amazon Appstore required";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f34985g = "Amazon Appstore Update Required";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f34986j = 31536000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f34987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.amazon.a.a.i.c f34988i;

    public a(com.amazon.a.a.i.c cVar) {
        super(cVar);
        this.f34988i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    protected void i() {
        com.amazon.device.iap.internal.util.b.a(f34982b, "doAction");
        if (f34984f.equalsIgnoreCase(this.f34988i.e()) || f34985g.equalsIgnoreCase(this.f34988i.e())) {
            try {
                Activity activityB = this.f34987h.b();
                if (activityB == null) {
                    activityB = this.f34987h.a();
                }
                activityB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f34983e)));
            } catch (Exception e10) {
                com.amazon.device.iap.internal.util.b.b(f34982b, "Exception in PurchaseItemCommandTask.OnSuccess: " + e10);
            }
        }
    }

    public String toString() {
        return f34982b;
    }
}
