package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class M6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3540o4 f39426b;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        c3486i4B.d("measurement.collection.event_safelist", true);
        f39425a = c3486i4B.d("measurement.service.store_null_safelist", true);
        f39426b = c3486i4B.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean j() {
        return ((Boolean) f39425a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean k() {
        return ((Boolean) f39426b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zza() {
        return true;
    }
}
