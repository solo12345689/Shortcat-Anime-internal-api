package zg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zg.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C7397c0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7389D f66391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f66392b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f66393c;

    C7397c0(C7389D c7389d) {
        this.f66391a = c7389d;
    }

    private InterfaceC7429v a() throws IOException {
        InterfaceC7400e interfaceC7400eG = this.f66391a.g();
        if (interfaceC7400eG == null) {
            return null;
        }
        if (interfaceC7400eG instanceof InterfaceC7429v) {
            return (InterfaceC7429v) interfaceC7400eG;
        }
        throw new IOException("unknown object encountered: " + interfaceC7400eG.getClass());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InterfaceC7429v interfaceC7429vA;
        if (this.f66393c == null) {
            if (!this.f66392b || (interfaceC7429vA = a()) == null) {
                return -1;
            }
            this.f66392b = false;
            this.f66393c = interfaceC7429vA.b();
        }
        while (true) {
            int i10 = this.f66393c.read();
            if (i10 >= 0) {
                return i10;
            }
            InterfaceC7429v interfaceC7429vA2 = a();
            if (interfaceC7429vA2 == null) {
                this.f66393c = null;
                return -1;
            }
            this.f66393c = interfaceC7429vA2.b();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        InterfaceC7429v interfaceC7429vA;
        int i12 = 0;
        if (this.f66393c == null) {
            if (!this.f66392b || (interfaceC7429vA = a()) == null) {
                return -1;
            }
            this.f66392b = false;
            this.f66393c = interfaceC7429vA.b();
        }
        while (true) {
            int i13 = this.f66393c.read(bArr, i10 + i12, i11 - i12);
            if (i13 >= 0) {
                i12 += i13;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                InterfaceC7429v interfaceC7429vA2 = a();
                if (interfaceC7429vA2 == null) {
                    this.f66393c = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f66393c = interfaceC7429vA2.b();
            }
        }
    }
}
