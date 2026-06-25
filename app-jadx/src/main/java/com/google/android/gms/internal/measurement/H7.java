package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H7 implements G7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39378a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        f39378a = c3486i4B.d("measurement.tcf.consent_fix", true);
        c3486i4B.d("measurement.tcf.client", true);
        c3486i4B.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.G7
    public final boolean zza() {
        return ((Boolean) f39378a.d()).booleanValue();
    }
}
