package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class Y implements InterfaceC7400e, L0 {

    /* JADX INFO: renamed from: a */
    private C7389D f66376a;

    Y(C7389D c7389d) {
        this.f66376a = c7389d;
    }

    static X a(C7389D c7389d) {
        return new X(c7389d.h());
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return a(this.f66376a);
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
