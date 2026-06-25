package oe;

/* JADX INFO: renamed from: oe.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C5865a implements InterfaceC5866b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f55393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f55394b;

    public C5865a(float f10, float f11) {
        this.f55393a = f10;
        this.f55394b = f11;
    }

    @Override // oe.InterfaceC5867c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float e() {
        return Float.valueOf(this.f55394b);
    }

    @Override // oe.InterfaceC5867c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float b() {
        return Float.valueOf(this.f55393a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oe.InterfaceC5866b
    public /* bridge */ /* synthetic */ boolean d(Comparable comparable, Comparable comparable2) {
        return f(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5865a)) {
            return false;
        }
        if (isEmpty() && ((C5865a) obj).isEmpty()) {
            return true;
        }
        C5865a c5865a = (C5865a) obj;
        return this.f55393a == c5865a.f55393a && this.f55394b == c5865a.f55394b;
    }

    public boolean f(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f55393a) * 31) + Float.hashCode(this.f55394b);
    }

    @Override // oe.InterfaceC5866b, oe.InterfaceC5867c
    public boolean isEmpty() {
        return this.f55393a > this.f55394b;
    }

    public String toString() {
        return this.f55393a + ".." + this.f55394b;
    }
}
