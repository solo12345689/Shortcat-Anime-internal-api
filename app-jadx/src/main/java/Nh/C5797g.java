package nh;

/* JADX INFO: renamed from: nh.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5797g extends AbstractC5794d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5791a f54182c;

    public C5797g(C5795e c5795e, byte[] bArr) {
        super(false, c5795e);
        int iA = c5795e.a();
        int i10 = iA * 2;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f54182c = new C5791a(Oh.a.m(bArr, 0, iA), Oh.a.m(bArr, iA, i10));
    }

    public byte[] getEncoded() {
        C5791a c5791a = this.f54182c;
        return Oh.a.h(c5791a.f54136a, c5791a.f54137b);
    }
}
