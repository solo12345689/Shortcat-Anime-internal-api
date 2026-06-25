package com.amazon.device.iap.internal.a.e;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.util.MetricsHelper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f35021b = "purchase_item";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f35022f = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f35023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f35024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f35025e;

    a(com.amazon.device.iap.internal.a.c cVar, String str, String str2) {
        super(cVar, f35021b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f35025e = str2;
        boolean zD = com.amazon.device.iap.internal.d.f().d();
        a("sku", str2);
        a(com.amazon.a.a.o.b.f34637ac, Boolean.valueOf(zD));
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        String str = f35022f;
        com.amazon.device.iap.internal.util.b.a(str, "data: " + mapB);
        if (!mapB.containsKey(com.amazon.a.a.o.b.f34668z)) {
            com.amazon.device.iap.internal.util.b.b(str, "did not find intent");
            return false;
        }
        com.amazon.device.iap.internal.util.b.a(str, "found intent");
        final Intent intent = (Intent) mapB.remove(com.amazon.a.a.o.b.f34668z);
        this.f35023c.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.iap.internal.a.e.a.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity activityB = a.this.f35024d.b();
                    if (activityB == null) {
                        activityB = a.this.f35024d.a();
                    }
                    com.amazon.device.iap.internal.util.b.a(a.f35022f, "About to fire intent with activity " + activityB);
                    activityB.startActivity(intent);
                } catch (Exception e10) {
                    MetricsHelper.submitExceptionMetrics(a.this.k(), a.f35022f + ".onResult().execute()", e10);
                    com.amazon.device.iap.internal.util.b.b(a.f35022f, "Exception when attempting to fire intent: " + e10);
                }
            }
        });
        return true;
    }
}
