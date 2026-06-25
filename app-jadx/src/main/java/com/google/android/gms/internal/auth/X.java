package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X implements U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U f39137c = new U() { // from class: com.google.android.gms.internal.auth.W
        @Override // com.google.android.gms.internal.auth.U
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile U f39138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f39139b;

    X(U u10) {
        this.f39138a = u10;
    }

    public final String toString() {
        Object obj = this.f39138a;
        if (obj == f39137c) {
            obj = "<supplier that returned " + String.valueOf(this.f39139b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        U u10 = this.f39138a;
        U u11 = f39137c;
        if (u10 != u11) {
            synchronized (this) {
                try {
                    if (this.f39138a != u11) {
                        Object objZza = this.f39138a.zza();
                        this.f39139b = objZza;
                        this.f39138a = u11;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f39139b;
    }
}
