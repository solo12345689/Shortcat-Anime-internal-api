package zg;

import java.io.IOException;

/* JADX INFO: renamed from: zg.a0 */
/* JADX INFO: loaded from: classes5.dex */
class C7393a0 implements InterfaceC7400e, L0 {

    /* JADX INFO: renamed from: a */
    final int f66379a;

    /* JADX INFO: renamed from: b */
    final int f66380b;

    /* JADX INFO: renamed from: c */
    final C7389D f66381c;

    C7393a0(int i10, int i11, C7389D c7389d) {
        this.f66379a = i10;
        this.f66380b = i11;
        this.f66381c = c7389d;
    }

    public AbstractC7432y d() {
        return this.f66381c.c(this.f66379a, this.f66380b);
    }

    @Override // zg.InterfaceC7400e
    public AbstractC7432y e() {
        try {
            return d();
        } catch (IOException e10) {
            throw new C7431x(e10.getMessage());
        }
    }
}
