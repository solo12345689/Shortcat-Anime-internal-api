package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class S0 implements InterfaceC3369l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X0 f39119b = new Q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0 f39120a;

    public S0() {
        X0 x02;
        A0 a0C = A0.c();
        try {
            x02 = (X0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            x02 = f39119b;
        }
        R0 r02 = new R0(a0C, x02);
        byte[] bArr = G0.f39066d;
        this.f39120a = r02;
    }

    private static boolean b(W0 w02) {
        return w02.k() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3369l1
    public final InterfaceC3366k1 a(Class cls) {
        AbstractC3372m1.d(cls);
        W0 w0A = this.f39120a.a(cls);
        return w0A.j() ? C0.class.isAssignableFrom(cls) ? C3348e1.g(AbstractC3372m1.b(), AbstractC3406y0.b(), w0A.zza()) : C3348e1.g(AbstractC3372m1.a(), AbstractC3406y0.a(), w0A.zza()) : C0.class.isAssignableFrom(cls) ? b(w0A) ? C3345d1.s(cls, w0A, AbstractC3354g1.b(), P0.d(), AbstractC3372m1.b(), AbstractC3406y0.b(), V0.b()) : C3345d1.s(cls, w0A, AbstractC3354g1.b(), P0.d(), AbstractC3372m1.b(), null, V0.b()) : b(w0A) ? C3345d1.s(cls, w0A, AbstractC3354g1.a(), P0.c(), AbstractC3372m1.a(), AbstractC3406y0.a(), V0.a()) : C3345d1.s(cls, w0A, AbstractC3354g1.a(), P0.c(), AbstractC3372m1.a(), null, V0.a());
    }
}
