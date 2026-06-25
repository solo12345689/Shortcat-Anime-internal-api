package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class u0 extends G {
    u0(int i10, int i11, int i12, InterfaceC7400e interfaceC7400e) {
        super(i10, i11, i12, interfaceC7400e);
    }

    @Override // zg.G
    AbstractC7387B N(AbstractC7432y abstractC7432y) {
        return new r0(abstractC7432y);
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        AbstractC7432y abstractC7432yW = this.f66335d.e().w();
        boolean zM = M();
        if (z10) {
            int i10 = this.f66333b;
            if (zM || abstractC7432yW.p()) {
                i10 |= 32;
            }
            c7430w.t(true, i10, this.f66334c);
        }
        if (zM) {
            c7430w.k(abstractC7432yW.t(true));
        }
        abstractC7432yW.n(c7430w.d(), zM);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return M() || this.f66335d.e().w().p();
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        AbstractC7432y abstractC7432yW = this.f66335d.e().w();
        boolean zM = M();
        int iT = abstractC7432yW.t(zM);
        if (zM) {
            iT += C7430w.f(iT);
        }
        return iT + (z10 ? C7430w.h(this.f66334c) : 0);
    }

    public u0(boolean z10, int i10, InterfaceC7400e interfaceC7400e) {
        super(z10, i10, interfaceC7400e);
    }

    @Override // zg.G, zg.AbstractC7432y
    AbstractC7432y w() {
        return this;
    }

    @Override // zg.G, zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
