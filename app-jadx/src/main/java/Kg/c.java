package Kg;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f11150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11151b;

    public c(byte[] bArr, int i10) {
        this.f11150a = Oh.a.f(bArr);
        this.f11151b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.f11151b != this.f11151b) {
            return false;
        }
        return Oh.a.c(this.f11150a, cVar.f11150a);
    }

    public int hashCode() {
        return this.f11151b ^ Oh.a.q(this.f11150a);
    }
}
