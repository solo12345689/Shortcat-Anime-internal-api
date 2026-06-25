package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class G6 implements F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3540o4 f39354b;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        f39353a = c3486i4B.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f39354b = c3486i4B.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean j() {
        return ((Boolean) f39354b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zza() {
        return ((Boolean) f39353a.d()).booleanValue();
    }
}
