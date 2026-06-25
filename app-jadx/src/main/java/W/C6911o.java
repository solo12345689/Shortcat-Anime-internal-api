package w;

/* JADX INFO: renamed from: w.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6911o extends AbstractC6913q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f62585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f62586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f62587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62588d;

    public C6911o(float f10, float f11, float f12) {
        super(null);
        this.f62585a = f10;
        this.f62586b = f11;
        this.f62587c = f12;
        this.f62588d = 3;
    }

    @Override // w.AbstractC6913q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f62585a;
        }
        if (i10 == 1) {
            return this.f62586b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f62587c;
    }

    @Override // w.AbstractC6913q
    public int b() {
        return this.f62588d;
    }

    @Override // w.AbstractC6913q
    public void d() {
        this.f62585a = 0.0f;
        this.f62586b = 0.0f;
        this.f62587c = 0.0f;
    }

    @Override // w.AbstractC6913q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f62585a = f10;
        } else if (i10 == 1) {
            this.f62586b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f62587c = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6911o)) {
            return false;
        }
        C6911o c6911o = (C6911o) obj;
        return c6911o.f62585a == this.f62585a && c6911o.f62586b == this.f62586b && c6911o.f62587c == this.f62587c;
    }

    @Override // w.AbstractC6913q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6911o c() {
        return new C6911o(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f62585a) * 31) + Float.hashCode(this.f62586b)) * 31) + Float.hashCode(this.f62587c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f62585a + ", v2 = " + this.f62586b + ", v3 = " + this.f62587c;
    }
}
