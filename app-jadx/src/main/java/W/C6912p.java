package w;

/* JADX INFO: renamed from: w.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6912p extends AbstractC6913q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f62640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f62641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f62642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f62643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62644e;

    public C6912p(float f10, float f11, float f12, float f13) {
        super(null);
        this.f62640a = f10;
        this.f62641b = f11;
        this.f62642c = f12;
        this.f62643d = f13;
        this.f62644e = 4;
    }

    @Override // w.AbstractC6913q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f62640a;
        }
        if (i10 == 1) {
            return this.f62641b;
        }
        if (i10 == 2) {
            return this.f62642c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f62643d;
    }

    @Override // w.AbstractC6913q
    public int b() {
        return this.f62644e;
    }

    @Override // w.AbstractC6913q
    public void d() {
        this.f62640a = 0.0f;
        this.f62641b = 0.0f;
        this.f62642c = 0.0f;
        this.f62643d = 0.0f;
    }

    @Override // w.AbstractC6913q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f62640a = f10;
            return;
        }
        if (i10 == 1) {
            this.f62641b = f10;
        } else if (i10 == 2) {
            this.f62642c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f62643d = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6912p)) {
            return false;
        }
        C6912p c6912p = (C6912p) obj;
        return c6912p.f62640a == this.f62640a && c6912p.f62641b == this.f62641b && c6912p.f62642c == this.f62642c && c6912p.f62643d == this.f62643d;
    }

    public final float f() {
        return this.f62640a;
    }

    public final float g() {
        return this.f62641b;
    }

    public final float h() {
        return this.f62642c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f62640a) * 31) + Float.hashCode(this.f62641b)) * 31) + Float.hashCode(this.f62642c)) * 31) + Float.hashCode(this.f62643d);
    }

    public final float i() {
        return this.f62643d;
    }

    @Override // w.AbstractC6913q
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C6912p c() {
        return new C6912p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f62640a + ", v2 = " + this.f62641b + ", v3 = " + this.f62642c + ", v4 = " + this.f62643d;
    }
}
