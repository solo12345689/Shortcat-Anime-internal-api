package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3686j2 implements InterfaceC3716p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3666f2 f40491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3745v2 f40492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f40493c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A1 f40494d;

    private C3686j2(AbstractC3745v2 abstractC3745v2, A1 a12, InterfaceC3666f2 interfaceC3666f2) {
        this.f40492b = abstractC3745v2;
        this.f40494d = a12;
        this.f40491a = interfaceC3666f2;
    }

    static C3686j2 i(AbstractC3745v2 abstractC3745v2, A1 a12, InterfaceC3666f2 interfaceC3666f2) {
        return new C3686j2(abstractC3745v2, a12, interfaceC3666f2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final int a(Object obj) {
        int iHashCode = ((J1) obj).zzc.hashCode();
        if (!this.f40493c) {
            return iHashCode;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final int b(Object obj) {
        int iB = ((J1) obj).zzc.b();
        if (!this.f40493c) {
            return iB;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final boolean c(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final void d(Object obj, G2 g22) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final void e(Object obj) {
        this.f40492b.b(obj);
        this.f40494d.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final void f(Object obj, Object obj2) {
        AbstractC3725r2.u(this.f40492b, obj, obj2);
        if (this.f40493c) {
            AbstractC3725r2.t(this.f40494d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final boolean g(Object obj, Object obj2) {
        if (!((J1) obj).zzc.equals(((J1) obj2).zzc)) {
            return false;
        }
        if (!this.f40493c) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final void h(Object obj, byte[] bArr, int i10, int i11, C3655d1 c3655d1) {
        J1 j12 = (J1) obj;
        if (j12.zzc == C3749w2.c()) {
            j12.zzc = C3749w2.f();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3716p2
    public final Object m() {
        InterfaceC3666f2 interfaceC3666f2 = this.f40491a;
        return interfaceC3666f2 instanceof J1 ? ((J1) interfaceC3666f2).r() : interfaceC3666f2.f().o();
    }
}
