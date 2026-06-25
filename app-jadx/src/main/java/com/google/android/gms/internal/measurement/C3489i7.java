package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3489i7 implements InterfaceC3480h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3540o4 f39795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC3540o4 f39796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC3540o4 f39797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC3540o4 f39798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC3540o4 f39799f;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        f39794a = c3486i4B.d("measurement.test.boolean_flag", false);
        f39795b = c3486i4B.c("measurement.test.cached_long_flag", -1L);
        f39796c = c3486i4B.e("measurement.test.double_flag", -3.0d);
        f39797d = c3486i4B.c("measurement.test.int_flag", -2L);
        f39798e = c3486i4B.c("measurement.test.long_flag", -1L);
        f39799f = c3486i4B.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3480h7
    public final long j() {
        return ((Long) f39795b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3480h7
    public final double k() {
        return ((Double) f39796c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3480h7
    public final long l() {
        return ((Long) f39797d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3480h7
    public final long m() {
        return ((Long) f39798e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3480h7
    public final String n() {
        return (String) f39799f.d();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3480h7
    public final boolean zza() {
        return ((Boolean) f39794a.d()).booleanValue();
    }
}
