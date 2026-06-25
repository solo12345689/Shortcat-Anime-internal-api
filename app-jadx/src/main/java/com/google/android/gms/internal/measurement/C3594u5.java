package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3594u5 implements C5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5[] f39999a;

    C3594u5(C5... c5Arr) {
        this.f39999a = c5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f39999a[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final B5 b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            C5 c52 = this.f39999a[i10];
            if (c52.a(cls)) {
                return c52.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
