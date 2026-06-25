package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class G1 implements InterfaceC3656d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G1 f40209a = new G1();

    private G1() {
    }

    public static G1 c() {
        return f40209a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3656d2
    public final InterfaceC3651c2 a(Class cls) {
        if (!J1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC3651c2) J1.q(cls.asSubclass(J1.class)).i(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3656d2
    public final boolean b(Class cls) {
        return J1.class.isAssignableFrom(cls);
    }
}
