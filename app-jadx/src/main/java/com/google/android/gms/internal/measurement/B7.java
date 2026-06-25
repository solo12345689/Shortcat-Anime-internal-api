package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class B7 implements A7 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3540o4 f39335a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        f39335a = c3486i4B.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c3486i4B.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c3486i4B.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.A7
    public final boolean zza() {
        return ((Boolean) f39335a.d()).booleanValue();
    }
}
