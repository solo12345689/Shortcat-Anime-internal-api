package zg;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
class D0 extends C7430w {
    D0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // zg.C7430w
    void l(InterfaceC7400e[] interfaceC7400eArr) {
        for (InterfaceC7400e interfaceC7400e : interfaceC7400eArr) {
            interfaceC7400e.e().x().n(this, true);
        }
    }

    @Override // zg.C7430w
    void u(AbstractC7432y abstractC7432y, boolean z10) {
        abstractC7432y.x().n(this, z10);
    }

    @Override // zg.C7430w
    void v(AbstractC7432y[] abstractC7432yArr) {
        for (AbstractC7432y abstractC7432y : abstractC7432yArr) {
            abstractC7432y.x().n(this, true);
        }
    }

    @Override // zg.C7430w
    D0 e() {
        return this;
    }
}
