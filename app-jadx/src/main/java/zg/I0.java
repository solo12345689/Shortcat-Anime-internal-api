package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class I0 extends G {
    I0(int i10, int i11, int i12, InterfaceC7400e interfaceC7400e) {
        super(i10, i11, i12, interfaceC7400e);
    }

    @Override // zg.G
    AbstractC7387B N(AbstractC7432y abstractC7432y) {
        return new E0(abstractC7432y);
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        AbstractC7432y abstractC7432yX = this.f66335d.e().x();
        boolean zM = M();
        if (z10) {
            int i10 = this.f66333b;
            if (zM || abstractC7432yX.p()) {
                i10 |= 32;
            }
            c7430w.t(true, i10, this.f66334c);
        }
        if (zM) {
            c7430w.k(abstractC7432yX.t(true));
        }
        abstractC7432yX.n(c7430w.e(), zM);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return M() || this.f66335d.e().x().p();
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        AbstractC7432y abstractC7432yX = this.f66335d.e().x();
        boolean zM = M();
        int iT = abstractC7432yX.t(zM);
        if (zM) {
            iT += C7430w.f(iT);
        }
        return iT + (z10 ? C7430w.h(this.f66334c) : 0);
    }

    public I0(boolean z10, int i10, InterfaceC7400e interfaceC7400e) {
        super(z10, i10, interfaceC7400e);
    }

    @Override // zg.G, zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
