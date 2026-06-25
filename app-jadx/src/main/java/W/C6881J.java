package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w.J, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6881J implements InterfaceC6879H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f62367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f62368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f62369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6899f0 f62370d;

    public C6881J(float f10, float f11, float f12) {
        this.f62367a = f10;
        this.f62368b = f11;
        this.f62369c = f12;
        C6899f0 c6899f0 = new C6899f0(1.0f);
        c6899f0.d(f10);
        c6899f0.f(f11);
        this.f62370d = c6899f0;
    }

    @Override // w.InterfaceC6879H
    public float b(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // w.InterfaceC6879H
    public float c(long j10, float f10, float f11, float f12) {
        this.f62370d.e(f11);
        return U.b(this.f62370d.g(f10, f12, j10 / 1000000));
    }

    @Override // w.InterfaceC6879H
    public float d(long j10, float f10, float f11, float f12) {
        this.f62370d.e(f11);
        return U.c(this.f62370d.g(f10, f12, j10 / 1000000));
    }

    @Override // w.InterfaceC6879H
    public long e(float f10, float f11, float f12) {
        float fB = this.f62370d.b();
        float fA = this.f62370d.a();
        float f13 = f10 - f11;
        float f14 = this.f62369c;
        return AbstractC6897e0.b(fB, fA, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    public /* synthetic */ C6881J(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
