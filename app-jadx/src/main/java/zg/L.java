package zg;

/* JADX INFO: loaded from: classes5.dex */
abstract class L extends H {

    /* JADX INFO: renamed from: b */
    final C7391F f66350b;

    L(Class cls, int i10) {
        super(cls);
        this.f66350b = C7391F.a(0, i10);
    }

    final AbstractC7432y a(AbstractC7432y abstractC7432y) {
        if (this.f66337a.isInstance(abstractC7432y)) {
            return abstractC7432y;
        }
        throw new IllegalStateException("unexpected object: " + abstractC7432y.getClass().getName());
    }

    final AbstractC7432y b(byte[] bArr) {
        return a(AbstractC7432y.v(bArr));
    }

    AbstractC7432y c(AbstractC7387B abstractC7387B) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    AbstractC7432y d(C7419n0 c7419n0) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    final AbstractC7432y e(G g10, boolean z10) {
        return a(M.a(g10).D(z10, this));
    }
}
