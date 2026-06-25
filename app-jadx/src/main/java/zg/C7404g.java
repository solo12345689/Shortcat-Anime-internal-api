package zg;

/* JADX INFO: renamed from: zg.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7404g extends AbstractC7432y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final L f66402c = new a(C7404g.class, 10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C7404g[] f66403d = new C7404g[12];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f66404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66405b;

    /* JADX INFO: renamed from: zg.g$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return C7404g.y(c7419n0.B(), false);
        }
    }

    C7404g(byte[] bArr, boolean z10) {
        if (C7420o.I(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f66404a = z10 ? Oh.a.f(bArr) : bArr;
        this.f66405b = C7420o.M(bArr);
    }

    static C7404g y(byte[] bArr, boolean z10) {
        if (bArr.length > 1) {
            return new C7404g(bArr, z10);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i10 = bArr[0] & 255;
        C7404g[] c7404gArr = f66403d;
        if (i10 >= c7404gArr.length) {
            return new C7404g(bArr, z10);
        }
        C7404g c7404g = c7404gArr[i10];
        if (c7404g != null) {
            return c7404g;
        }
        C7404g c7404g2 = new C7404g(bArr, z10);
        c7404gArr[i10] = c7404g2;
        return c7404g2;
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return Oh.a.q(this.f66404a);
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof C7404g) {
            return Oh.a.c(this.f66404a, ((C7404g) abstractC7432y).f66404a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 10, this.f66404a);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, this.f66404a.length);
    }
}
