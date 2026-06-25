package zg;

/* JADX INFO: renamed from: zg.n0 */
/* JADX INFO: loaded from: classes5.dex */
public class C7419n0 extends AbstractC7428u {
    public C7419n0(byte[] bArr) {
        super(bArr);
    }

    static void D(C7430w c7430w, boolean z10, byte[] bArr, int i10, int i11) {
        c7430w.p(z10, 4, bArr, i10, i11);
    }

    static int F(boolean z10, int i10) {
        return C7430w.g(z10, i10);
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 4, this.f66446a);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, this.f66446a.length);
    }

    @Override // zg.AbstractC7428u, zg.AbstractC7432y
    AbstractC7432y w() {
        return this;
    }

    @Override // zg.AbstractC7428u, zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
