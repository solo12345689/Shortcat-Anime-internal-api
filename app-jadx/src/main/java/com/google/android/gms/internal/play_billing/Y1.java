package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y1 implements InterfaceC3721q2 {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC3656d2 f40424b = new W1();

    /* JADX INFO: renamed from: a */
    private final InterfaceC3656d2 f40425a;

    public Y1() {
        G1 g1C = G1.c();
        int i10 = C3701m2.f40505d;
        X1 x12 = new X1(g1C, f40424b);
        byte[] bArr = P1.f40250b;
        this.f40425a = x12;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3721q2
    public final InterfaceC3716p2 a(Class cls) {
        int i10 = AbstractC3725r2.f40545b;
        if (!J1.class.isAssignableFrom(cls)) {
            int i11 = C3701m2.f40505d;
        }
        InterfaceC3651c2 interfaceC3651c2A = this.f40425a.a(cls);
        if (interfaceC3651c2A.j()) {
            int i12 = C3701m2.f40505d;
            return C3686j2.i(AbstractC3725r2.r(), C1.a(), interfaceC3651c2A.zza());
        }
        int i13 = C3701m2.f40505d;
        return C3681i2.A(cls, interfaceC3651c2A, AbstractC3696l2.a(), U1.a(), AbstractC3725r2.r(), interfaceC3651c2A.k() + (-1) != 1 ? C1.a() : null, AbstractC3646b2.a());
    }
}
