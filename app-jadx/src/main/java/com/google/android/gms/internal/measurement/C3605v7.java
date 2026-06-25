package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3605v7 implements InterfaceC3587t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3540o4 f40010a = new C3486i4(AbstractC3441d4.a("com.google.android.gms.measurement")).a().b().d("measurement.experiment.enable_phenotype_experiment_reporting", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC3587t7
    public final boolean zza() {
        return ((Boolean) f40010a.d()).booleanValue();
    }
}
