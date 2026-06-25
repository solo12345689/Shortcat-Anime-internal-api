package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class R0 implements X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0[] f39118a;

    R0(X0... x0Arr) {
        this.f39118a = x0Arr;
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final W0 a(Class cls) {
        X0[] x0Arr = this.f39118a;
        for (int i10 = 0; i10 < 2; i10++) {
            X0 x02 = x0Arr[i10];
            if (x02.b(cls)) {
                return x02.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final boolean b(Class cls) {
        X0[] x0Arr = this.f39118a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (x0Arr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
