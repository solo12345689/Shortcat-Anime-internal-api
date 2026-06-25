package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class P6 implements O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3540o4 f39542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC3540o4 f39543c;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        c3486i4B.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f39541a = c3486i4B.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f39542b = c3486i4B.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f39543c = c3486i4B.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean j() {
        return ((Boolean) f39541a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean k() {
        return ((Boolean) f39542b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean l() {
        return ((Boolean) f39543c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean zza() {
        return true;
    }
}
