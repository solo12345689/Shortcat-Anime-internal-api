package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z6 implements Y6 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3540o4 f39699a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        c3486i4B.d("measurement.gbraid_campaign.gbraid.client", true);
        f39699a = c3486i4B.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean zza() {
        return ((Boolean) f39699a.d()).booleanValue();
    }
}
