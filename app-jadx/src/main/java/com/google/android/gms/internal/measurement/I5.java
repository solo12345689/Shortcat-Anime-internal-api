package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class I5 implements P5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E5 f39388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3416a6 f39389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39390c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S4 f39391d;

    private I5(AbstractC3416a6 abstractC3416a6, S4 s42, E5 e52) {
        this.f39389b = abstractC3416a6;
        this.f39391d = s42;
        this.f39388a = e52;
    }

    static I5 b(AbstractC3416a6 abstractC3416a6, S4 s42, E5 e52) {
        return new I5(abstractC3416a6, s42, e52);
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final int a(Object obj) {
        int iG = ((AbstractC3442d5) obj).zzc.g();
        if (!this.f39390c) {
            return iG;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final boolean c(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final int d(Object obj) {
        int iHashCode = ((AbstractC3442d5) obj).zzc.hashCode();
        if (!this.f39390c) {
            return iHashCode;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final void e(Object obj, Object obj2) {
        R5.d(this.f39389b, obj, obj2);
        if (this.f39390c) {
            R5.c(this.f39391d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final void f(Object obj) {
        this.f39389b.b(obj);
        this.f39391d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final void g(Object obj, byte[] bArr, int i10, int i11, C3619x4 c3619x4) {
        AbstractC3442d5 abstractC3442d5 = (AbstractC3442d5) obj;
        if (abstractC3442d5.zzc == C3425b6.a()) {
            abstractC3442d5.zzc = C3425b6.b();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final void h(Object obj, InterfaceC3533n6 interfaceC3533n6) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final boolean i(Object obj, Object obj2) {
        if (!((AbstractC3442d5) obj).zzc.equals(((AbstractC3442d5) obj2).zzc)) {
            return false;
        }
        if (!this.f39390c) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.P5
    public final Object zza() {
        E5 e52 = this.f39388a;
        return e52 instanceof AbstractC3442d5 ? ((AbstractC3442d5) e52).l() : e52.d().D1();
    }
}
