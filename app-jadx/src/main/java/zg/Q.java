package zg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class Q implements InterfaceC7396c {

    /* JADX INFO: renamed from: a */
    private C7389D f66366a;

    /* JADX INFO: renamed from: b */
    private C7395b0 f66367b;

    Q(C7389D c7389d) {
        this.f66366a = c7389d;
    }

    static P a(C7389D c7389d) {
        C7395b0 c7395b0 = new C7395b0(c7389d, false);
        return new P(Qh.a.c(c7395b0), c7395b0.b());
    }

    @Override // zg.InterfaceC7396c
    public int c() {
        return this.f66367b.b();
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return a(this.f66366a);
    }

    @Override // zg.InterfaceC7400e
    public AbstractC7432y e() {
        try {
            return d();
        } catch (IOException e10) {
            throw new C7431x("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    @Override // zg.InterfaceC7396c
    public InputStream f() {
        C7395b0 c7395b0 = new C7395b0(this.f66366a, false);
        this.f66367b = c7395b0;
        return c7395b0;
    }
}
