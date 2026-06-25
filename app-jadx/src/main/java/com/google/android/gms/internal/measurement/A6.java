package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A6 implements InterfaceC3637z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39326a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        c3486i4B.d("measurement.client.3p_consent_state_v1", true);
        f39326a = c3486i4B.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3637z6
    public final long zza() {
        return ((Long) f39326a.d()).longValue();
    }
}
