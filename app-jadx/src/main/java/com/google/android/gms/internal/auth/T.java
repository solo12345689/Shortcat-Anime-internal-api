package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class T extends S {

    /* JADX INFO: renamed from: a */
    private final Object f39121a;

    T(Object obj) {
        this.f39121a = obj;
    }

    @Override // com.google.android.gms.internal.auth.S
    public final Object a() {
        return this.f39121a;
    }

    @Override // com.google.android.gms.internal.auth.S
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return this.f39121a.equals(((T) obj).f39121a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39121a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f39121a.toString() + ")";
    }
}
