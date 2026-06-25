package zg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class O extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66359b = new a(O.class, 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66360a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return O.y(c7419n0.B());
        }
    }

    O(byte[] bArr, boolean z10) {
        this.f66360a = z10 ? Oh.a.f(bArr) : bArr;
    }

    static O y(byte[] bArr) {
        return new y0(bArr, false);
    }

    @Override // zg.AbstractC7432y, zg.r
    public final int hashCode() {
        return Oh.a.q(this.f66360a);
    }

    @Override // zg.AbstractC7432y
    final boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof O) {
            return Oh.a.c(this.f66360a, ((O) abstractC7432y).f66360a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    final void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 26, this.f66360a);
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    final int t(boolean z10) {
        return C7430w.g(z10, this.f66360a.length);
    }

    public String toString() {
        return z();
    }

    public final String z() {
        return Oh.i.b(this.f66360a);
    }
}
