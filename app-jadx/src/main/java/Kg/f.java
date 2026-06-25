package Kg;

/* JADX INFO: loaded from: classes5.dex */
public class f implements Fg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f11159a;

    private f(int i10) {
        this.f11159a = new byte[i10];
    }

    public byte[] a() {
        return this.f11159a;
    }

    public f(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public f(byte[] bArr, int i10, int i11) {
        this(i11);
        System.arraycopy(bArr, i10, this.f11159a, 0, i11);
    }
}
