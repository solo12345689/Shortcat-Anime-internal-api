package qh;

/* JADX INFO: loaded from: classes5.dex */
public class g extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6217a f58199c;

    public g(e eVar, byte[] bArr) {
        super(false, eVar);
        int iB = eVar.b();
        int i10 = iB * 2;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f58199c = new C6217a(Oh.a.m(bArr, 0, iB), Oh.a.m(bArr, iB, i10));
    }

    public byte[] getEncoded() {
        C6217a c6217a = this.f58199c;
        return Oh.a.h(c6217a.f58131a, c6217a.f58132b);
    }
}
