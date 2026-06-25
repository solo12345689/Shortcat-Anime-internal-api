package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3415a5 implements C5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3415a5 f39704a = new C3415a5();

    private C3415a5() {
    }

    public static C3415a5 c() {
        return f39704a;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final boolean a(Class cls) {
        return AbstractC3442d5.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final B5 b(Class cls) {
        if (!AbstractC3442d5.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (B5) AbstractC3442d5.r(cls.asSubclass(AbstractC3442d5.class)).B(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
