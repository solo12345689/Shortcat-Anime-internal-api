package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class A0 implements X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final A0 f39048a = new A0();

    private A0() {
    }

    public static A0 c() {
        return f39048a;
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final W0 a(Class cls) {
        if (!C0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (W0) C0.b(cls.asSubclass(C0.class)).o(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final boolean b(Class cls) {
        return C0.class.isAssignableFrom(cls);
    }
}
