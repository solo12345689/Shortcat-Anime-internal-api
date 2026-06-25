package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f34989b = "getItem_data";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Set<String> f34990c;

    a(com.amazon.device.iap.internal.a.c cVar, String str, Set<String> set) {
        super(cVar, f34989b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f34990c = set;
        a(com.amazon.a.a.o.b.f34622O, set);
    }
}
