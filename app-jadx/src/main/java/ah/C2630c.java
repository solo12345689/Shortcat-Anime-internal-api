package ah;

/* JADX INFO: renamed from: ah.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C2630c extends AbstractC2628a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f24095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f24096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f24097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f24098f;

    public C2630c(C2629b c2629b, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, c2629b);
        this.f24096d = Oh.a.f(bArr);
        this.f24097e = Oh.a.f(bArr2);
        this.f24098f = Oh.a.f(bArr3);
        this.f24095c = Oh.a.f(bArr4);
    }

    public byte[] c() {
        return Oh.a.f(this.f24097e);
    }

    public byte[] d() {
        return Oh.a.f(this.f24095c);
    }

    public byte[] e() {
        return Oh.a.f(this.f24098f);
    }

    public byte[] f() {
        return Oh.a.f(this.f24096d);
    }
}
