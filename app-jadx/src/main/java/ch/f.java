package ch;

/* JADX INFO: loaded from: classes5.dex */
public class f extends AbstractC3108c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f33702c;

    public f(d dVar, byte[] bArr) {
        super(true, dVar);
        this.f33702c = Oh.a.f(bArr);
    }

    public byte[] c() {
        return Oh.a.f(this.f33702c);
    }

    public byte[] getEncoded() {
        return c();
    }
}
