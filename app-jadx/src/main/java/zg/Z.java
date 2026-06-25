package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class Z extends G {
    Z(int i10, int i11, int i12, InterfaceC7400e interfaceC7400e) {
        super(i10, i11, i12, interfaceC7400e);
    }

    @Override // zg.G
    AbstractC7387B N(AbstractC7432y abstractC7432y) {
        return new V(abstractC7432y);
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        AbstractC7432y abstractC7432yE = this.f66335d.e();
        boolean zM = M();
        if (z10) {
            int i10 = this.f66333b;
            if (zM || abstractC7432yE.p()) {
                i10 |= 32;
            }
            c7430w.t(true, i10, this.f66334c);
        }
        if (!zM) {
            abstractC7432yE.n(c7430w, false);
            return;
        }
        c7430w.i(128);
        abstractC7432yE.n(c7430w, true);
        c7430w.i(0);
        c7430w.i(0);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return M() || this.f66335d.e().p();
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        AbstractC7432y abstractC7432yE = this.f66335d.e();
        boolean zM = M();
        int iT = abstractC7432yE.t(zM);
        if (zM) {
            iT += 3;
        }
        return iT + (z10 ? C7430w.h(this.f66334c) : 0);
    }
}
