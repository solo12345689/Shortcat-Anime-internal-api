package zg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class N extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66355b = new a(N.class, 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66356a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return N.y(c7419n0.B());
        }
    }

    N(byte[] bArr, boolean z10) {
        this.f66356a = z10 ? Oh.a.f(bArr) : bArr;
    }

    static N y(byte[] bArr) {
        return new x0(bArr, false);
    }

    @Override // zg.AbstractC7432y, zg.r
    public final int hashCode() {
        return Oh.a.q(this.f66356a);
    }

    @Override // zg.AbstractC7432y
    final boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof N) {
            return Oh.a.c(this.f66356a, ((N) abstractC7432y).f66356a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    final void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 21, this.f66356a);
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    final int t(boolean z10) {
        return C7430w.g(z10, this.f66356a.length);
    }
}
