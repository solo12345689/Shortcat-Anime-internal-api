package xa;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class P implements InterfaceC7068B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7070D f64108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f64109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f64110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f64111d;

    P(InterfaceC7070D interfaceC7070D, String str, Object[] objArr) {
        this.f64108a = interfaceC7070D;
        this.f64109b = str;
        this.f64110c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f64111d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f64111d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // xa.InterfaceC7068B
    public boolean a() {
        return (this.f64111d & 2) == 2;
    }

    @Override // xa.InterfaceC7068B
    public InterfaceC7070D b() {
        return this.f64108a;
    }

    @Override // xa.InterfaceC7068B
    public M c() {
        int i10 = this.f64111d;
        return (i10 & 1) != 0 ? M.PROTO2 : (i10 & 4) == 4 ? M.EDITIONS : M.PROTO3;
    }

    Object[] d() {
        return this.f64110c;
    }

    String e() {
        return this.f64109b;
    }
}
