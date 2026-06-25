package p1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractC5915c {

    /* JADX INFO: renamed from: f */
    float f55697f;

    public e(float f10) {
        super(null);
        this.f55697f = f10;
    }

    @Override // p1.AbstractC5915c
    public float e() {
        if (Float.isNaN(this.f55697f) && p()) {
            this.f55697f = Float.parseFloat(d());
        }
        return this.f55697f;
    }

    @Override // p1.AbstractC5915c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            float fE = e();
            float fE2 = ((e) obj).e();
            if ((Float.isNaN(fE) && Float.isNaN(fE2)) || fE == fE2) {
                return true;
            }
        }
        return false;
    }

    @Override // p1.AbstractC5915c
    public int f() {
        if (Float.isNaN(this.f55697f) && p()) {
            this.f55697f = Integer.parseInt(d());
        }
        return (int) this.f55697f;
    }

    @Override // p1.AbstractC5915c
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f10 = this.f55697f;
        return iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }
}
