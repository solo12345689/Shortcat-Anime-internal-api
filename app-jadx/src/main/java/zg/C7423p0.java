package zg;

import java.io.OutputStream;

/* JADX INFO: renamed from: zg.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C7423p0 extends D0 {
    C7423p0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // zg.D0, zg.C7430w
    void l(InterfaceC7400e[] interfaceC7400eArr) {
        for (InterfaceC7400e interfaceC7400e : interfaceC7400eArr) {
            interfaceC7400e.e().w().n(this, true);
        }
    }

    @Override // zg.D0, zg.C7430w
    void u(AbstractC7432y abstractC7432y, boolean z10) {
        abstractC7432y.w().n(this, z10);
    }

    @Override // zg.D0, zg.C7430w
    void v(AbstractC7432y[] abstractC7432yArr) {
        for (AbstractC7432y abstractC7432y : abstractC7432yArr) {
            abstractC7432y.w().n(this, true);
        }
    }

    @Override // zg.C7430w
    C7423p0 d() {
        return this;
    }
}
