package com.amazon.device.iap.internal.a.d;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35015d = "purchase_fulfilled";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Set<String> f35016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f35017c;

    public b(c cVar, Set<String> set, String str) {
        super(cVar, f35015d, com.amazon.a.a.o.b.f34642ah, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f35016b = set;
        this.f35017c = str;
        b(false);
        a(com.amazon.a.a.o.b.f34613F, set);
        a(com.amazon.a.a.o.b.f34649g, str);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        return true;
    }

    @Override // com.amazon.a.a.n.a.h
    public void l() {
        Object objA = j().a().a(com.amazon.a.a.o.b.ao);
        if (objA != null && Boolean.FALSE.equals(objA)) {
            a(com.amazon.a.a.o.b.f34649g, com.amazon.device.iap.internal.model.a.DELIVERY_ATTEMPTED.toString());
        }
        super.l();
    }
}
