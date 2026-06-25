package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3756y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40591b;

    C3756y1(Object obj, int i10) {
        this.f40590a = obj;
        this.f40591b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3756y1)) {
            return false;
        }
        C3756y1 c3756y1 = (C3756y1) obj;
        return this.f40590a == c3756y1.f40590a && this.f40591b == c3756y1.f40591b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f40590a) * 65535) + this.f40591b;
    }
}
