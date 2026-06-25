package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class y7 implements x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f40117a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        f40117a = c3486i4B.d("measurement.session_stitching_token_enabled", false);
        c3486i4B.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.x7
    public final boolean j() {
        return ((Boolean) f40117a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.x7
    public final boolean zza() {
        return true;
    }
}
