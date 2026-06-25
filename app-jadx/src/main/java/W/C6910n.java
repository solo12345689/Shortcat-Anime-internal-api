package w;

/* JADX INFO: renamed from: w.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6910n extends AbstractC6913q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f62573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f62574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62575c;

    public C6910n(float f10, float f11) {
        super(null);
        this.f62573a = f10;
        this.f62574b = f11;
        this.f62575c = 2;
    }

    @Override // w.AbstractC6913q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f62573a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f62574b;
    }

    @Override // w.AbstractC6913q
    public int b() {
        return this.f62575c;
    }

    @Override // w.AbstractC6913q
    public void d() {
        this.f62573a = 0.0f;
        this.f62574b = 0.0f;
    }

    @Override // w.AbstractC6913q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f62573a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f62574b = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6910n)) {
            return false;
        }
        C6910n c6910n = (C6910n) obj;
        return c6910n.f62573a == this.f62573a && c6910n.f62574b == this.f62574b;
    }

    public final float f() {
        return this.f62573a;
    }

    public final float g() {
        return this.f62574b;
    }

    @Override // w.AbstractC6913q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6910n c() {
        return new C6910n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f62573a) * 31) + Float.hashCode(this.f62574b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f62573a + ", v2 = " + this.f62574b;
    }
}
