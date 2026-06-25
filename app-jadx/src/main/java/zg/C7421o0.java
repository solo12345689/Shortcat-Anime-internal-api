package zg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zg.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7421o0 implements InterfaceC7429v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K0 f66430a;

    C7421o0(K0 k02) {
        this.f66430a = k02;
    }

    @Override // zg.InterfaceC7429v
    public InputStream b() {
        return this.f66430a;
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return new C7419n0(this.f66430a.j());
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
