package i1;

import j1.InterfaceC5326a;

/* JADX INFO: renamed from: i1.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5028u implements InterfaceC5326a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f48577a;

    public C5028u(float f10) {
        this.f48577a = f10;
    }

    @Override // j1.InterfaceC5326a
    public float a(float f10) {
        return f10 / this.f48577a;
    }

    @Override // j1.InterfaceC5326a
    public float b(float f10) {
        return f10 * this.f48577a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5028u) && Float.compare(this.f48577a, ((C5028u) obj).f48577a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f48577a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f48577a + ')';
    }
}
