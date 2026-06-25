package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.h1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3357h1 {

    /* JADX INFO: renamed from: c */
    private static final C3357h1 f39182c = new C3357h1();

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f39184b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private final InterfaceC3369l1 f39183a = new S0();

    private C3357h1() {
    }

    public static C3357h1 a() {
        return f39182c;
    }

    public final InterfaceC3366k1 b(Class cls) {
        G0.c(cls, "messageType");
        InterfaceC3366k1 interfaceC3366k1 = (InterfaceC3366k1) this.f39184b.get(cls);
        if (interfaceC3366k1 != null) {
            return interfaceC3366k1;
        }
        InterfaceC3366k1 interfaceC3366k1A = this.f39183a.a(cls);
        G0.c(cls, "messageType");
        InterfaceC3366k1 interfaceC3366k12 = (InterfaceC3366k1) this.f39184b.putIfAbsent(cls, interfaceC3366k1A);
        return interfaceC3366k12 == null ? interfaceC3366k1A : interfaceC3366k12;
    }
}
