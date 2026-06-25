package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3603v5 implements Q5 {

    /* JADX INFO: renamed from: b */
    private static final C5 f40006b = new C3585t5();

    /* JADX INFO: renamed from: a */
    private final C5 f40007a;

    public C3603v5() {
        C3415a5 c3415a5C = C3415a5.c();
        int i10 = M5.f39422d;
        C3594u5 c3594u5 = new C3594u5(c3415a5C, f40006b);
        byte[] bArr = AbstractC3505k5.f39813b;
        this.f40007a = c3594u5;
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final P5 a(Class cls) {
        int i10 = R5.f39564b;
        if (!AbstractC3442d5.class.isAssignableFrom(cls)) {
            int i11 = M5.f39422d;
        }
        B5 b5B = this.f40007a.b(cls);
        if (b5B.zza()) {
            int i12 = M5.f39422d;
            return I5.b(R5.a(), U4.a(), b5B.j());
        }
        int i13 = M5.f39422d;
        return H5.A(cls, b5B, K5.a(), AbstractC3559q5.a(), R5.a(), b5B.k() + (-1) != 1 ? U4.a() : null, A5.a());
    }
}
