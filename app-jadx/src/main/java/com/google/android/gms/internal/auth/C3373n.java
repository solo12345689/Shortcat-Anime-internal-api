package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3373n extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U f39277b;

    C3373n(Context context, U u10) {
        this.f39276a = context;
        this.f39277b = u10;
    }

    @Override // com.google.android.gms.internal.auth.K
    final Context a() {
        return this.f39276a;
    }

    @Override // com.google.android.gms.internal.auth.K
    final U b() {
        return this.f39277b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k10 = (K) obj;
            if (this.f39276a.equals(k10.a()) && this.f39277b.equals(k10.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f39276a.hashCode() ^ 1000003) * 1000003) ^ this.f39277b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f39276a.toString() + ", hermeticFileOverrides=" + this.f39277b.toString() + "}";
    }
}
