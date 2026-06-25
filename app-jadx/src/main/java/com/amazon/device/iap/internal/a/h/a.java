package com.amazon.device.iap.internal.a.h;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35036b = "submit_metric";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35037c = "metricName";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35038d = "metricAttributes";

    public a(c cVar, String str, String str2) {
        super(cVar, f35036b, "1.0", cVar.d().toString(), PurchasingService.SDK_VERSION);
        a(f35037c, str);
        a(f35038d, str2);
        b(false);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        return true;
    }
}
