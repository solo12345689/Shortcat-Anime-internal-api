package jh;

/* JADX INFO: renamed from: jh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5405c extends AbstractC5403a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f51942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f51943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f51944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f51945f;

    public C5405c(C5404b c5404b, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, c5404b);
        this.f51942c = Oh.a.f(bArr);
        this.f51943d = Oh.a.f(bArr2);
        this.f51944e = Oh.a.f(bArr3);
        this.f51945f = Oh.a.f(bArr4);
    }

    public byte[] c() {
        return Oh.a.f(this.f51942c);
    }

    public byte[] d() {
        return Oh.a.f(this.f51945f);
    }

    public byte[] e() {
        return Oh.a.f(this.f51943d);
    }

    public byte[] f() {
        return Oh.a.f(this.f51944e);
    }
}
