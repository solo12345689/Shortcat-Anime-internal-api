package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25253a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25254b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25255c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25256d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25257e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25258f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25259g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25260h = false;

    Z() {
    }

    public int a() {
        return this.f25259g ? this.f25253a : this.f25254b;
    }

    public int b() {
        return this.f25253a;
    }

    public int c() {
        return this.f25254b;
    }

    public int d() {
        return this.f25259g ? this.f25254b : this.f25253a;
    }

    public void e(int i10, int i11) {
        this.f25260h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f25257e = i10;
            this.f25253a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f25258f = i11;
            this.f25254b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f25259g) {
            return;
        }
        this.f25259g = z10;
        if (!this.f25260h) {
            this.f25253a = this.f25257e;
            this.f25254b = this.f25258f;
            return;
        }
        if (z10) {
            int i10 = this.f25256d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f25257e;
            }
            this.f25253a = i10;
            int i11 = this.f25255c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f25258f;
            }
            this.f25254b = i11;
            return;
        }
        int i12 = this.f25255c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f25257e;
        }
        this.f25253a = i12;
        int i13 = this.f25256d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f25258f;
        }
        this.f25254b = i13;
    }

    public void g(int i10, int i11) {
        this.f25255c = i10;
        this.f25256d = i11;
        this.f25260h = true;
        if (this.f25259g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f25253a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f25254b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f25253a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f25254b = i11;
        }
    }
}
