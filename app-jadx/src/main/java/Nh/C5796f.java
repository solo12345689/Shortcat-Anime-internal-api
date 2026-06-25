package nh;

/* JADX INFO: renamed from: nh.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5796f extends AbstractC5794d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final C5792b f54180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final C5791a f54181d;

    public C5796f(C5795e c5795e, byte[] bArr) {
        super(true, c5795e);
        int iA = c5795e.a();
        int i10 = iA * 4;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i11 = iA * 2;
        this.f54180c = new C5792b(Oh.a.m(bArr, 0, iA), Oh.a.m(bArr, iA, i11));
        int i12 = iA * 3;
        this.f54181d = new C5791a(Oh.a.m(bArr, i11, i12), Oh.a.m(bArr, i12, i10));
    }

    public byte[] getEncoded() {
        C5792b c5792b = this.f54180c;
        byte[] bArr = c5792b.f54138a;
        byte[] bArr2 = c5792b.f54139b;
        C5791a c5791a = this.f54181d;
        return Oh.a.j(new byte[][]{bArr, bArr2, c5791a.f54136a, c5791a.f54137b});
    }
}
