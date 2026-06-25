package J;

import i1.InterfaceC5011d;
import r0.C6230l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f9195a;

    public f(float f10) {
        this.f9195a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // J.b
    public float a(long j10, InterfaceC5011d interfaceC5011d) {
        return C6230l.h(j10) * (this.f9195a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f9195a, ((f) obj).f9195a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f9195a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f9195a + "%)";
    }
}
