package zg;

/* JADX INFO: renamed from: zg.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7390E extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66326b = new a(AbstractC7390E.class, 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66327a;

    /* JADX INFO: renamed from: zg.E$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return AbstractC7390E.y(c7419n0.B());
        }
    }

    AbstractC7390E(byte[] bArr, boolean z10) {
        this.f66327a = z10 ? Oh.a.f(bArr) : bArr;
    }

    static AbstractC7390E y(byte[] bArr) {
        return new t0(bArr, false);
    }

    @Override // zg.AbstractC7432y, zg.r
    public final int hashCode() {
        return Oh.a.q(this.f66327a);
    }

    @Override // zg.AbstractC7432y
    final boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof AbstractC7390E) {
            return Oh.a.c(this.f66327a, ((AbstractC7390E) abstractC7432y).f66327a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    final void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 20, this.f66327a);
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    final int t(boolean z10) {
        return C7430w.g(z10, this.f66327a.length);
    }

    public String toString() {
        return z();
    }

    public final String z() {
        return Oh.i.b(this.f66327a);
    }
}
