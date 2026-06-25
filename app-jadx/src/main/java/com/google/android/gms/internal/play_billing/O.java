package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f40240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f40241c;

    O(Object obj, Object obj2, Object obj3) {
        this.f40239a = obj;
        this.f40240b = obj2;
        this.f40241c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f40241c;
        Object obj2 = this.f40240b;
        Object obj3 = this.f40239a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f34695b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f34695b + String.valueOf(obj));
    }
}
