package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3434c6 extends AbstractC3416a6 {
    C3434c6() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3416a6
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        AbstractC3442d5 abstractC3442d5 = (AbstractC3442d5) obj;
        C3425b6 c3425b6 = abstractC3442d5.zzc;
        if (c3425b6 != C3425b6.a()) {
            return c3425b6;
        }
        C3425b6 c3425b6B = C3425b6.b();
        abstractC3442d5.zzc = c3425b6B;
        return c3425b6B;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3416a6
    final void b(Object obj) {
        ((AbstractC3442d5) obj).zzc.d();
    }
}
