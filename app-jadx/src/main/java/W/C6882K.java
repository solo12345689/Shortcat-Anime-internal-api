package w;

import oe.AbstractC5874j;

/* JADX INFO: renamed from: w.K, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6882K implements InterfaceC6879H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6875D f62373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f62374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f62375e;

    public C6882K(int i10, int i11, InterfaceC6875D interfaceC6875D) {
        this.f62371a = i10;
        this.f62372b = i11;
        this.f62373c = interfaceC6875D;
        this.f62374d = ((long) i10) * 1000000;
        this.f62375e = ((long) i11) * 1000000;
    }

    private final long f(long j10) {
        return AbstractC5874j.o(j10 - this.f62375e, 0L, this.f62374d);
    }

    @Override // w.InterfaceC6879H
    public float c(long j10, float f10, float f11, float f12) {
        float f13 = this.f62371a == 0 ? 1.0f : f(j10) / this.f62374d;
        InterfaceC6875D interfaceC6875D = this.f62373c;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        return u0.k(f10, f11, interfaceC6875D.a(f13 <= 1.0f ? f13 : 1.0f));
    }

    @Override // w.InterfaceC6879H
    public float d(long j10, float f10, float f11, float f12) {
        long jF = f(j10);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return f12;
        }
        return (c(jF, f10, f11, f12) - c(jF - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // w.InterfaceC6879H
    public long e(float f10, float f11, float f12) {
        return ((long) (this.f62372b + this.f62371a)) * 1000000;
    }
}
