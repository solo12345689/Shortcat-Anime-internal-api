package w;

/* JADX INFO: renamed from: w.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6909m extends AbstractC6913q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f62545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62546b;

    public C6909m(float f10) {
        super(null);
        this.f62545a = f10;
        this.f62546b = 1;
    }

    @Override // w.AbstractC6913q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f62545a;
        }
        return 0.0f;
    }

    @Override // w.AbstractC6913q
    public int b() {
        return this.f62546b;
    }

    @Override // w.AbstractC6913q
    public void d() {
        this.f62545a = 0.0f;
    }

    @Override // w.AbstractC6913q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f62545a = f10;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6909m) && ((C6909m) obj).f62545a == this.f62545a;
    }

    public final float f() {
        return this.f62545a;
    }

    @Override // w.AbstractC6913q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C6909m c() {
        return new C6909m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f62545a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f62545a;
    }
}
