package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class F0 implements InterfaceC7400e, L0 {

    /* JADX INFO: renamed from: a */
    private C7389D f66331a;

    F0(C7389D c7389d) {
        this.f66331a = c7389d;
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return C0.a(this.f66331a.h());
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
