package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c7 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3435c7 implements InterfaceC3426b7 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3540o4 f39731a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        c3486i4B.d("measurement.gmscore_feature_tracking", true);
        f39731a = c3486i4B.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3426b7
    public final boolean zza() {
        return ((Boolean) f39731a.d()).booleanValue();
    }
}
