package zg;

/* JADX INFO: renamed from: zg.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7414l extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66418b = new a(AbstractC7414l.class, 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66419a;

    /* JADX INFO: renamed from: zg.l$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return AbstractC7414l.y(c7419n0.B());
        }
    }

    AbstractC7414l(byte[] bArr, boolean z10) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.f66419a = z10 ? Oh.a.f(bArr) : bArr;
    }

    static AbstractC7414l y(byte[] bArr) {
        return new C7411j0(bArr, false);
    }

    @Override // zg.AbstractC7432y, zg.r
    public final int hashCode() {
        return Oh.a.q(this.f66419a);
    }

    @Override // zg.AbstractC7432y
    final boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof AbstractC7414l) {
            return Oh.a.c(this.f66419a, ((AbstractC7414l) abstractC7432y).f66419a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    final void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 25, this.f66419a);
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    final int t(boolean z10) {
        return C7430w.g(z10, this.f66419a.length);
    }
}
