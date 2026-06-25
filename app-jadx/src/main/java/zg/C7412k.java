package zg;

/* JADX INFO: renamed from: zg.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7412k extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66416b = new a(C7412k.class, 24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66417a;

    /* JADX INFO: renamed from: zg.k$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return C7412k.y(c7419n0.B());
        }
    }

    C7412k(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f66417a = bArr;
        if (!D(0) || !D(1) || !D(2) || !D(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    private boolean D(int i10) {
        byte b10;
        byte[] bArr = this.f66417a;
        return bArr.length > i10 && (b10 = bArr[i10]) >= 48 && b10 <= 57;
    }

    static C7412k y(byte[] bArr) {
        return new C7412k(bArr);
    }

    protected boolean A() {
        return D(10) && D(11);
    }

    protected boolean B() {
        return D(12) && D(13);
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return Oh.a.q(this.f66417a);
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof C7412k) {
            return Oh.a.c(this.f66417a, ((C7412k) abstractC7432y).f66417a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 24, this.f66417a);
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, this.f66417a.length);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        return new C7409i0(this.f66417a);
    }

    protected boolean z() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f66417a;
            if (i10 == bArr.length) {
                return false;
            }
            if (bArr[i10] == 46 && i10 == 14) {
                return true;
            }
            i10++;
        }
    }
}
