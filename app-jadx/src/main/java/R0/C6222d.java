package r0;

/* JADX INFO: renamed from: r0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6222d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f58325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f58326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f58327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f58328d;

    public C6222d(float f10, float f11, float f12, float f13) {
        this.f58325a = f10;
        this.f58326b = f11;
        this.f58327c = f12;
        this.f58328d = f13;
    }

    public final float a() {
        return this.f58328d;
    }

    public final float b() {
        return this.f58325a;
    }

    public final float c() {
        return this.f58327c;
    }

    public final float d() {
        return this.f58326b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f58325a = Math.max(f10, this.f58325a);
        this.f58326b = Math.max(f11, this.f58326b);
        this.f58327c = Math.min(f12, this.f58327c);
        this.f58328d = Math.min(f13, this.f58328d);
    }

    public final boolean f() {
        return (this.f58325a >= this.f58327c) | (this.f58326b >= this.f58328d);
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f58325a = f10;
        this.f58326b = f11;
        this.f58327c = f12;
        this.f58328d = f13;
    }

    public final void h(float f10) {
        this.f58328d = f10;
    }

    public final void i(float f10) {
        this.f58325a = f10;
    }

    public final void j(float f10) {
        this.f58327c = f10;
    }

    public final void k(float f10) {
        this.f58326b = f10;
    }

    public final void l(float f10, float f11) {
        this.f58325a += f10;
        this.f58326b += f11;
        this.f58327c += f10;
        this.f58328d += f11;
    }

    public final void m(long j10) {
        l(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public String toString() {
        return "MutableRect(" + AbstractC6221c.a(this.f58325a, 1) + ", " + AbstractC6221c.a(this.f58326b, 1) + ", " + AbstractC6221c.a(this.f58327c, 1) + ", " + AbstractC6221c.a(this.f58328d, 1) + ')';
    }
}
