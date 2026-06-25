package zg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zg.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C7395b0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7389D f66385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f66386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f66387c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66388d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC7396c f66389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f66390f;

    C7395b0(C7389D c7389d, boolean z10) {
        this.f66385a = c7389d;
        this.f66386b = z10;
    }

    private InterfaceC7396c a() throws IOException {
        InterfaceC7400e interfaceC7400eG = this.f66385a.g();
        if (interfaceC7400eG == null) {
            if (!this.f66386b || this.f66388d == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f66388d);
        }
        if (interfaceC7400eG instanceof InterfaceC7396c) {
            if (this.f66388d == 0) {
                return (InterfaceC7396c) interfaceC7400eG;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + interfaceC7400eG.getClass());
    }

    int b() {
        return this.f66388d;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f66390f == null) {
            if (!this.f66387c) {
                return -1;
            }
            InterfaceC7396c interfaceC7396cA = a();
            this.f66389e = interfaceC7396cA;
            if (interfaceC7396cA == null) {
                return -1;
            }
            this.f66387c = false;
            this.f66390f = interfaceC7396cA.f();
        }
        while (true) {
            int i10 = this.f66390f.read();
            if (i10 >= 0) {
                return i10;
            }
            this.f66388d = this.f66389e.c();
            InterfaceC7396c interfaceC7396cA2 = a();
            this.f66389e = interfaceC7396cA2;
            if (interfaceC7396cA2 == null) {
                this.f66390f = null;
                return -1;
            }
            this.f66390f = interfaceC7396cA2.f();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        if (this.f66390f == null) {
            if (!this.f66387c) {
                return -1;
            }
            InterfaceC7396c interfaceC7396cA = a();
            this.f66389e = interfaceC7396cA;
            if (interfaceC7396cA == null) {
                return -1;
            }
            this.f66387c = false;
            this.f66390f = interfaceC7396cA.f();
        }
        while (true) {
            int i13 = this.f66390f.read(bArr, i10 + i12, i11 - i12);
            if (i13 >= 0) {
                i12 += i13;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                this.f66388d = this.f66389e.c();
                InterfaceC7396c interfaceC7396cA2 = a();
                this.f66389e = interfaceC7396cA2;
                if (interfaceC7396cA2 == null) {
                    this.f66390f = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f66390f = interfaceC7396cA2.f();
            }
        }
    }
}
