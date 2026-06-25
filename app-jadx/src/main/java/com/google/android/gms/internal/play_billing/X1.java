package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X1 implements InterfaceC3656d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3656d2[] f40419a;

    X1(InterfaceC3656d2... interfaceC3656d2Arr) {
        this.f40419a = interfaceC3656d2Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3656d2
    public final InterfaceC3651c2 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC3656d2 interfaceC3656d2 = this.f40419a[i10];
            if (interfaceC3656d2.b(cls)) {
                return interfaceC3656d2.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3656d2
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f40419a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
