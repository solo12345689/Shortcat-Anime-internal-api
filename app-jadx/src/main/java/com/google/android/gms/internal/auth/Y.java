package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y implements Serializable, U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f39141a;

    Y(Object obj) {
        this.f39141a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Object obj2 = this.f39141a;
        Object obj3 = ((Y) obj).f39141a;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39141a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f39141a.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        return this.f39141a;
    }
}
