package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class M5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final M5 f39421c = new M5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f39422d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f39424b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q5 f39423a = new C3603v5();

    private M5() {
    }

    public static M5 a() {
        return f39421c;
    }

    public final P5 b(Class cls) {
        AbstractC3505k5.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f39424b;
        P5 p5A = (P5) concurrentMap.get(cls);
        if (p5A == null) {
            p5A = this.f39423a.a(cls);
            AbstractC3505k5.a(cls, "messageType");
            P5 p52 = (P5) concurrentMap.putIfAbsent(cls, p5A);
            if (p52 != null) {
                return p52;
            }
        }
        return p5A;
    }
}
