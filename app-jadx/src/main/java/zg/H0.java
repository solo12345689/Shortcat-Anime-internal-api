package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class H0 implements InterfaceC7400e, L0 {

    /* JADX INFO: renamed from: a */
    private C7389D f66338a;

    H0(C7389D c7389d) {
        this.f66338a = c7389d;
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return C0.b(this.f66338a.h());
    }

    @Override // zg.InterfaceC7400e
    public AbstractC7432y e() {
        try {
            return d();
        } catch (IOException e10) {
            throw new C7431x(e10.getMessage(), e10);
        }
    }
}
