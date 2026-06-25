package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3517m {
    static InterfaceC3553q b(InterfaceC3517m interfaceC3517m, InterfaceC3553q interfaceC3553q, Y1 y12, List list) {
        if (interfaceC3517m.f(interfaceC3553q.k())) {
            InterfaceC3553q interfaceC3553qC = interfaceC3517m.c(interfaceC3553q.k());
            if (interfaceC3553qC instanceof AbstractC3499k) {
                return ((AbstractC3499k) interfaceC3553qC).a(y12, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC3553q.k()));
        }
        if (!"hasOwnProperty".equals(interfaceC3553q.k())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC3553q.k()));
        }
        AbstractC3633z2.a("hasOwnProperty", 1, list);
        return interfaceC3517m.f(y12.a((InterfaceC3553q) list.get(0)).k()) ? InterfaceC3553q.f39934e0 : InterfaceC3553q.f39935f0;
    }

    static Iterator e(Map map) {
        return new C3508l(map.keySet().iterator());
    }

    InterfaceC3553q c(String str);

    void d(String str, InterfaceC3553q interfaceC3553q);

    boolean f(String str);
}
