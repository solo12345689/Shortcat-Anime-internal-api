package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class E0 extends AbstractC7387B {

    /* JADX INFO: renamed from: c */
    private int f66328c;

    public E0() {
        this.f66328c = -1;
    }

    private int M() {
        if (this.f66328c < 0) {
            int length = this.f66315a.length;
            int iT = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iT += this.f66315a[i10].e().x().t(true);
            }
            this.f66328c = iT;
        }
        return this.f66328c;
    }

    @Override // zg.AbstractC7387B
    AbstractC7394b F() {
        return new z0(P.G(y()), false);
    }

    @Override // zg.AbstractC7387B
    AbstractC7408i G() {
        return new B0(this);
    }

    @Override // zg.AbstractC7387B
    AbstractC7428u I() {
        return new C7419n0(T.D(z()));
    }

    @Override // zg.AbstractC7387B
    AbstractC7388C K() {
        return new G0(false, L());
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.s(z10, 48);
        D0 d0E = c7430w.e();
        int length = this.f66315a.length;
        int i10 = 0;
        if (this.f66328c >= 0 || length > 16) {
            c7430w.k(M());
            while (i10 < length) {
                d0E.u(this.f66315a[i10].e(), true);
                i10++;
            }
            return;
        }
        AbstractC7432y[] abstractC7432yArr = new AbstractC7432y[length];
        int iT = 0;
        for (int i11 = 0; i11 < length; i11++) {
            AbstractC7432y abstractC7432yX = this.f66315a[i11].e().x();
            abstractC7432yArr[i11] = abstractC7432yX;
            iT += abstractC7432yX.t(true);
        }
        this.f66328c = iT;
        c7430w.k(iT);
        while (i10 < length) {
            d0E.u(abstractC7432yArr[i10], true);
            i10++;
        }
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, M());
    }

    public E0(InterfaceC7400e interfaceC7400e) {
        super(interfaceC7400e);
        this.f66328c = -1;
    }

    public E0(C7402f c7402f) {
        super(c7402f);
        this.f66328c = -1;
    }

    E0(InterfaceC7400e[] interfaceC7400eArr, boolean z10) {
        super(interfaceC7400eArr, z10);
        this.f66328c = -1;
    }

    @Override // zg.AbstractC7387B, zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
