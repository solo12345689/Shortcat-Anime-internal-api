package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3516l7 implements InterfaceC3507k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3540o4 f39842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC3540o4 f39843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC3540o4 f39844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC3540o4 f39845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC3540o4 f39846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC3540o4 f39847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC3540o4 f39848h;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        c3486i4B.d("measurement.rb.attribution.ad_campaign_info", true);
        c3486i4B.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f39841a = c3486i4B.d("measurement.rb.attribution.client2", true);
        f39842b = c3486i4B.d("measurement.rb.attribution.followup1.service", false);
        c3486i4B.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f39843c = c3486i4B.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        c3486i4B.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f39844d = c3486i4B.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f39845e = c3486i4B.d("measurement.rb.attribution.retry_disposition", false);
        f39846f = c3486i4B.d("measurement.rb.attribution.service", true);
        f39847g = c3486i4B.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f39848h = c3486i4B.d("measurement.rb.attribution.uuid_generation", true);
        c3486i4B.c("measurement.id.rb.attribution.retry_disposition", 0L);
        c3486i4B.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean a() {
        return ((Boolean) f39847g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean b() {
        return ((Boolean) f39848h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean j() {
        return ((Boolean) f39841a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean k() {
        return ((Boolean) f39842b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean l() {
        return ((Boolean) f39843c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean m() {
        return ((Boolean) f39844d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean n() {
        return ((Boolean) f39845e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean o() {
        return ((Boolean) f39846f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3507k7
    public final boolean zza() {
        return true;
    }
}
