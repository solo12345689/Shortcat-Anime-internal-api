package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class D6 implements C6 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3540o4 f39340a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC3540o4 f39341b;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        c3486i4B.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        c3486i4B.d("measurement.set_default_event_parameters_with_backfill.service", true);
        c3486i4B.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f39340a = c3486i4B.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f39341b = c3486i4B.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        c3486i4B.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean j() {
        return ((Boolean) f39341b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean zza() {
        return ((Boolean) f39340a.d()).booleanValue();
    }
}
