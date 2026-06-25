package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o7 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3543o7 implements InterfaceC3534n7 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3540o4 f39917a;

    static {
        C3486i4 c3486i4B = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b();
        f39917a = c3486i4B.d("measurement.add_first_launch_logging_timestamp.service", false);
        c3486i4B.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3534n7
    public final boolean zza() {
        return ((Boolean) f39917a.d()).booleanValue();
    }
}
