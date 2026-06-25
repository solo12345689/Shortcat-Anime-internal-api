package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3616x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C3622y f40021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Y1 f40022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Y1 f40023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final B3 f40024d;

    public C3616x1() {
        C3622y c3622y = new C3622y();
        this.f40021a = c3622y;
        Y1 y12 = new Y1(null, c3622y);
        this.f40023c = y12;
        this.f40022b = y12.c();
        B3 b32 = new B3();
        this.f40024d = b32;
        y12.e("require", new S7(b32));
        b32.a("internal.platform", CallableC3447e1.f39746a);
        y12.e("runtime.counter", new C3490j(Double.valueOf(0.0d)));
    }

    public final InterfaceC3553q a(Y1 y12, G3... g3Arr) {
        InterfaceC3553q interfaceC3553qB = InterfaceC3553q.f39929W;
        for (G3 g32 : g3Arr) {
            interfaceC3553qB = AbstractC3413a3.b(g32);
            AbstractC3633z2.l(this.f40023c);
            if ((interfaceC3553qB instanceof r) || (interfaceC3553qB instanceof C3544p)) {
                interfaceC3553qB = this.f40021a.b(y12, interfaceC3553qB);
            }
        }
        return interfaceC3553qB;
    }
}
