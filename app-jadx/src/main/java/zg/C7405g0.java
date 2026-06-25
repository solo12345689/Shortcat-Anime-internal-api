package zg;

import java.io.IOException;

/* JADX INFO: renamed from: zg.g0 */
/* JADX INFO: loaded from: classes5.dex */
public class C7405g0 implements InterfaceC7400e, L0 {

    /* JADX INFO: renamed from: a */
    private C7389D f66406a;

    public C7405g0(C7389D c7389d) {
        this.f66406a = c7389d;
    }

    static B0 a(C7389D c7389d) throws C7406h {
        try {
            return new B0(new E0(c7389d.h()));
        } catch (IllegalArgumentException e10) {
            throw new C7406h(e10.getMessage(), e10);
        }
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return a(this.f66406a);
    }

    @Override // zg.InterfaceC7400e
    public AbstractC7432y e() {
        try {
            return d();
        } catch (IOException e10) {
            throw new C7431x("unable to get DER object", e10);
        } catch (IllegalArgumentException e11) {
            throw new C7431x("unable to get DER object", e11);
        }
    }
}
