package i1;

import j1.InterfaceC5326a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5014g implements InterfaceC5011d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f48544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f48545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5326a f48546c;

    public C5014g(float f10, float f11, InterfaceC5326a interfaceC5326a) {
        this.f48544a = f10;
        this.f48545b = f11;
        this.f48546c = interfaceC5326a;
    }

    @Override // i1.InterfaceC5019l
    public long O(float f10) {
        return AbstractC5030w.e(this.f48546c.a(f10));
    }

    @Override // i1.InterfaceC5019l
    public float T(long j10) {
        if (C5031x.g(C5029v.g(j10), C5031x.f48582b.b())) {
            return C5015h.n(this.f48546c.b(C5029v.h(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5014g)) {
            return false;
        }
        C5014g c5014g = (C5014g) obj;
        return Float.compare(this.f48544a, c5014g.f48544a) == 0 && Float.compare(this.f48545b, c5014g.f48545b) == 0 && AbstractC5504s.c(this.f48546c, c5014g.f48546c);
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f48544a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f48544a) * 31) + Float.hashCode(this.f48545b)) * 31) + this.f48546c.hashCode();
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f48545b;
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f48544a + ", fontScale=" + this.f48545b + ", converter=" + this.f48546c + ')';
    }
}
