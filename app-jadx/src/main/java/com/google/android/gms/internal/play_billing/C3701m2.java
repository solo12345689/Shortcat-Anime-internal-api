package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3701m2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C3701m2 f40504c = new C3701m2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f40505d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f40507b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3721q2 f40506a = new Y1();

    private C3701m2() {
    }

    public static C3701m2 a() {
        return f40504c;
    }

    public final InterfaceC3716p2 b(Class cls) {
        P1.c(cls, "messageType");
        ConcurrentMap concurrentMap = this.f40507b;
        InterfaceC3716p2 interfaceC3716p2A = (InterfaceC3716p2) concurrentMap.get(cls);
        if (interfaceC3716p2A == null) {
            interfaceC3716p2A = this.f40506a.a(cls);
            P1.c(cls, "messageType");
            InterfaceC3716p2 interfaceC3716p2 = (InterfaceC3716p2) concurrentMap.putIfAbsent(cls, interfaceC3716p2A);
            if (interfaceC3716p2 != null) {
                return interfaceC3716p2;
            }
        }
        return interfaceC3716p2A;
    }
}
