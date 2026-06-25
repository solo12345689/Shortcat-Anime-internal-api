package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class b extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f34994b = "purchase_updates";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f34995c;

    b(com.amazon.device.iap.internal.a.c cVar, String str, boolean z10) {
        super(cVar, f34994b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f34995c = z10;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void e() {
        super.e();
        a(com.amazon.a.a.o.b.f34644b, this.f34995c ? null : com.amazon.device.iap.internal.util.a.a((String) ((com.amazon.device.iap.internal.a.c) j()).a().a("userId")));
        a(com.amazon.a.a.o.b.f34637ac, Boolean.valueOf(com.amazon.device.iap.internal.d.f().d()));
    }
}
