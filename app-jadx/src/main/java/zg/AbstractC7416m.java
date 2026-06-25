package zg;

/* JADX INFO: renamed from: zg.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7416m extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66422b = new a(AbstractC7416m.class, 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66423a;

    /* JADX INFO: renamed from: zg.m$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return AbstractC7416m.y(c7419n0.B());
        }
    }

    AbstractC7416m(byte[] bArr, boolean z10) {
        this.f66423a = z10 ? Oh.a.f(bArr) : bArr;
    }

    static AbstractC7416m y(byte[] bArr) {
        return new C7413k0(bArr, false);
    }

    @Override // zg.AbstractC7432y, zg.r
    public final int hashCode() {
        return Oh.a.q(this.f66423a);
    }

    @Override // zg.AbstractC7432y
    final boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof AbstractC7416m) {
            return Oh.a.c(this.f66423a, ((AbstractC7416m) abstractC7432y).f66423a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    final void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 22, this.f66423a);
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    final int t(boolean z10) {
        return C7430w.g(z10, this.f66423a.length);
    }

    public String toString() {
        return z();
    }

    public final String z() {
        return Oh.i.b(this.f66423a);
    }
}
