package zg;

/* JADX INFO: loaded from: classes5.dex */
public class I extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66339b = new a(I.class, 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66340a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return I.y(c7419n0.B());
        }
    }

    I(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f66340a = bArr;
        if (!z(0) || !z(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    static I y(byte[] bArr) {
        return new I(bArr);
    }

    private boolean z(int i10) {
        byte b10;
        byte[] bArr = this.f66340a;
        return bArr.length > i10 && (b10 = bArr[i10]) >= 48 && b10 <= 57;
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return Oh.a.q(this.f66340a);
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof I) {
            return Oh.a.c(this.f66340a, ((I) abstractC7432y).f66340a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 23, this.f66340a);
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, this.f66340a.length);
    }

    public String toString() {
        return Oh.i.b(this.f66340a);
    }
}
