package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S7 extends AbstractC3499k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B3 f39572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f39573d;

    public S7(B3 b32) {
        super("require");
        this.f39573d = new HashMap();
        this.f39572c = b32;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3499k
    public final InterfaceC3553q a(Y1 y12, List list) {
        InterfaceC3553q interfaceC3553q;
        AbstractC3633z2.a("require", 1, list);
        String strK = y12.a((InterfaceC3553q) list.get(0)).k();
        Map map = this.f39573d;
        if (map.containsKey(strK)) {
            return (InterfaceC3553q) map.get(strK);
        }
        Map map2 = this.f39572c.f39329a;
        if (map2.containsKey(strK)) {
            try {
                interfaceC3553q = (InterfaceC3553q) ((Callable) map2.get(strK)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strK)));
            }
        } else {
            interfaceC3553q = InterfaceC3553q.f39929W;
        }
        if (interfaceC3553q instanceof AbstractC3499k) {
            this.f39573d.put(strK, (AbstractC3499k) interfaceC3553q);
        }
        return interfaceC3553q;
    }
}
