package zg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class U implements InterfaceC7429v {

    /* JADX INFO: renamed from: a */
    private C7389D f66374a;

    U(C7389D c7389d) {
        this.f66374a = c7389d;
    }

    static T a(C7389D c7389d) {
        return new T(Qh.a.c(new C7397c0(c7389d)));
    }

    @Override // zg.InterfaceC7429v
    public InputStream b() {
        return new C7397c0(this.f66374a);
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return a(this.f66374a);
    }

    @Override // zg.InterfaceC7400e
    public AbstractC7432y e() {
        try {
            return d();
        } catch (IOException e10) {
            throw new C7431x("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }
}
