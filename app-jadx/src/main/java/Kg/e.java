package Kg;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f11157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11158c;

    public e(byte[] bArr, int i10) {
        this(bArr, i10, -1);
    }

    public int a() {
        return this.f11158c;
    }

    public byte[] b() {
        return Oh.a.f(this.f11157b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f11158c != this.f11158c) {
            return false;
        }
        return Oh.a.c(this.f11157b, eVar.f11157b);
    }

    public int hashCode() {
        return this.f11158c ^ Oh.a.q(this.f11157b);
    }

    public e(byte[] bArr, int i10, int i11) {
        this.f11157b = Oh.a.f(bArr);
        this.f11158c = i10;
        this.f11156a = i11;
    }
}
