package m1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class g implements InterfaceC5627f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f52997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52998b;

    g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f52997a = new Object[i10];
    }

    @Override // m1.InterfaceC5627f
    public boolean a(Object obj) {
        int i10 = this.f52998b;
        Object[] objArr = this.f52997a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f52998b = i10 + 1;
        return true;
    }

    @Override // m1.InterfaceC5627f
    public Object b() {
        int i10 = this.f52998b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f52997a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f52998b = i10 - 1;
        return obj;
    }

    @Override // m1.InterfaceC5627f
    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f52998b;
            Object[] objArr2 = this.f52997a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f52998b = i12 + 1;
            }
        }
    }
}
