package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39553b;

    Q4(Object obj, int i10) {
        this.f39552a = obj;
        this.f39553b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q4)) {
            return false;
        }
        Q4 q42 = (Q4) obj;
        return this.f39552a == q42.f39552a && this.f39553b == q42.f39553b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f39552a) * 65535) + this.f39553b;
    }
}
