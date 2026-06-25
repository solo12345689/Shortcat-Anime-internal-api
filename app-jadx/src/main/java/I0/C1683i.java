package I0;

/* JADX INFO: renamed from: I0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1683i implements InterfaceC1680f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8715b;

    public C1683i(float f10) {
        this.f8715b = f10;
    }

    @Override // I0.InterfaceC1680f
    public long a(long j10, long j11) {
        float f10 = this.f8715b;
        return N.a((((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1683i) && Float.compare(this.f8715b, ((C1683i) obj).f8715b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f8715b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f8715b + ')';
    }
}
