package dh;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: dh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4630a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f45646a = new ByteArrayOutputStream();

    private C4630a() {
    }

    public static C4630a f() {
        return new C4630a();
    }

    public C4630a a(boolean z10) {
        this.f45646a.write(z10 ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.f45646a.toByteArray();
    }

    public C4630a c(Oh.c cVar) {
        try {
            this.f45646a.write(cVar.getEncoded());
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public C4630a d(byte[] bArr) {
        try {
            this.f45646a.write(bArr);
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public C4630a e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.f45646a.write(bArr2);
            }
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public C4630a g(int i10, int i11) {
        while (this.f45646a.size() < i11) {
            this.f45646a.write(i10);
        }
        return this;
    }

    public C4630a h(int i10) {
        int i11 = i10 & 65535;
        this.f45646a.write((byte) (i11 >>> 8));
        this.f45646a.write((byte) i11);
        return this;
    }

    public C4630a i(int i10) {
        this.f45646a.write((byte) (i10 >>> 24));
        this.f45646a.write((byte) (i10 >>> 16));
        this.f45646a.write((byte) (i10 >>> 8));
        this.f45646a.write((byte) i10);
        return this;
    }

    public C4630a j(long j10) {
        i((int) (j10 >>> 32));
        i((int) j10);
        return this;
    }
}
