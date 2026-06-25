package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class X extends AbstractC7388C {
    public X() {
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.r(z10, 49, this.f66319a);
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        int iT = z10 ? 4 : 3;
        int length = this.f66319a.length;
        for (int i10 = 0; i10 < length; i10++) {
            iT += this.f66319a[i10].e().t(true);
        }
        return iT;
    }

    public X(C7402f c7402f) {
        super(c7402f, false);
    }

    X(boolean z10, InterfaceC7400e[] interfaceC7400eArr) {
        super(z10, interfaceC7400eArr);
    }
}
