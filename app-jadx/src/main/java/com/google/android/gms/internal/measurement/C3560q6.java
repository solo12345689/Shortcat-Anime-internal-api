package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3560q6 implements InterfaceC3551p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39949a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        f39949a = c3486i4B.d("measurement.service.ad_impression.convert_value_to_double", true);
        c3486i4B.d("measurement.service.separate_public_internal_event_blacklisting", true);
        c3486i4B.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3551p6
    public final boolean zza() {
        return ((Boolean) f39949a.d()).booleanValue();
    }
}
