package qh;

/* JADX INFO: loaded from: classes5.dex */
public class f extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f58197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final C6217a f58198d;

    public f(e eVar, byte[] bArr) {
        super(true, eVar);
        int iB = eVar.b();
        int i10 = iB * 4;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i11 = iB * 2;
        this.f58197c = new b(Oh.a.m(bArr, 0, iB), Oh.a.m(bArr, iB, i11));
        int i12 = iB * 3;
        this.f58198d = new C6217a(Oh.a.m(bArr, i11, i12), Oh.a.m(bArr, i12, i10));
    }

    public byte[] c() {
        C6217a c6217a = this.f58198d;
        return Oh.a.h(c6217a.f58131a, c6217a.f58132b);
    }

    public byte[] getEncoded() {
        b bVar = this.f58197c;
        byte[] bArr = bVar.f58133a;
        byte[] bArr2 = bVar.f58134b;
        C6217a c6217a = this.f58198d;
        return Oh.a.j(new byte[][]{bArr, bArr2, c6217a.f58131a, c6217a.f58132b});
    }

    public f(e eVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, eVar);
        this.f58197c = new b(bArr, bArr2);
        this.f58198d = new C6217a(bArr3, bArr4);
    }
}
