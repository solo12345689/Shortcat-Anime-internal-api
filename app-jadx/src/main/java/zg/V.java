package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class V extends AbstractC7387B {
    public V() {
    }

    @Override // zg.AbstractC7387B
    AbstractC7394b F() {
        return new P(y());
    }

    @Override // zg.AbstractC7387B
    AbstractC7408i G() {
        return ((AbstractC7387B) x()).G();
    }

    @Override // zg.AbstractC7387B
    AbstractC7428u I() {
        return new T(z());
    }

    @Override // zg.AbstractC7387B
    AbstractC7388C K() {
        return new X(false, L());
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.r(z10, 48, this.f66315a);
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        int iT = z10 ? 4 : 3;
        int length = this.f66315a.length;
        for (int i10 = 0; i10 < length; i10++) {
            iT += this.f66315a[i10].e().t(true);
        }
        return iT;
    }

    public V(InterfaceC7400e interfaceC7400e) {
        super(interfaceC7400e);
    }

    public V(C7402f c7402f) {
        super(c7402f);
    }
}
