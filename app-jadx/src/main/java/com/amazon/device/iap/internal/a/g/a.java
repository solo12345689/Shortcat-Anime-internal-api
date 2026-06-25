package com.amazon.device.iap.internal.a.g;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f35035b = "response_received";

    a(com.amazon.device.iap.internal.a.c cVar, String str) {
        super(cVar, f35035b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        b(false);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        return true;
    }
}
