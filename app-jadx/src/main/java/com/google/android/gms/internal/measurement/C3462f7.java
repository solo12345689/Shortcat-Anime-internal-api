package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3462f7 implements InterfaceC3453e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f39757a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        c3486i4B.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f39757a = c3486i4B.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c3486i4B.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3453e7
    public final boolean zza() {
        return ((Boolean) f39757a.d()).booleanValue();
    }
}
