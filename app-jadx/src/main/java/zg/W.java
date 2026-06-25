package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class W implements InterfaceC7400e, L0 {

    /* JADX INFO: renamed from: a */
    private C7389D f66375a;

    W(C7389D c7389d) {
        this.f66375a = c7389d;
    }

    static V a(C7389D c7389d) {
        return new V(c7389d.h());
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return a(this.f66375a);
    }

    @Override // zg.InterfaceC7400e
    public AbstractC7432y e() {
        try {
            return d();
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }
}
