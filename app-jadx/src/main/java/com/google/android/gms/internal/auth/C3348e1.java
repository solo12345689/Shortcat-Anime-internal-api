package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3348e1 implements InterfaceC3366k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f39172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3381p1 f39173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC3400w0 f39174c;

    private C3348e1(AbstractC3381p1 abstractC3381p1, AbstractC3400w0 abstractC3400w0, Z0 z02) {
        this.f39173b = abstractC3381p1;
        this.f39174c = abstractC3400w0;
        this.f39172a = z02;
    }

    static C3348e1 g(AbstractC3381p1 abstractC3381p1, AbstractC3400w0 abstractC3400w0, Z0 z02) {
        return new C3348e1(abstractC3381p1, abstractC3400w0, z02);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3366k1
    public final void a(Object obj) {
        this.f39173b.c(obj);
        this.f39174c.b(obj);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3366k1
    public final int b(Object obj) {
        return this.f39173b.a(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3366k1
    public final boolean c(Object obj, Object obj2) {
        return this.f39173b.a(obj).equals(this.f39173b.a(obj2));
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3366k1
    public final void d(Object obj, byte[] bArr, int i10, int i11, C3347e0 c3347e0) {
        C0 c02 = (C0) obj;
        if (c02.zzc == C3386r1.a()) {
            c02.zzc = C3386r1.d();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3366k1
    public final void e(Object obj, Object obj2) {
        AbstractC3372m1.c(this.f39173b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3366k1
    public final boolean f(Object obj) {
        this.f39174c.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3366k1
    public final Object l() {
        Z0 z02 = this.f39172a;
        return z02 instanceof C0 ? ((C0) z02).c() : ((B0) ((C0) z02).o(5, null, null)).l();
    }
}
