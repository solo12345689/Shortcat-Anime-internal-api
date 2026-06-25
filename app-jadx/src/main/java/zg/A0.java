package zg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class A0 implements InterfaceC7396c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0 f66312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66313b = 0;

    A0(K0 k02) {
        this.f66312a = k02;
    }

    private InputStream a(boolean z10) throws IOException {
        int iG = this.f66312a.g();
        if (iG < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i10 = this.f66312a.read();
        this.f66313b = i10;
        if (i10 > 0) {
            if (iG < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i10 > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
            if (z10) {
                throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f66313b);
            }
        }
        return this.f66312a;
    }

    @Override // zg.InterfaceC7396c
    public int c() {
        return this.f66313b;
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return AbstractC7394b.y(this.f66312a.j());
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
        return a(false);
    }
}
