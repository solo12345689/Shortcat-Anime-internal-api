package Mh;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f12455a;

    public h(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iE = f.e(bArr, 0);
        int iA = e.a(iE - 1);
        if (bArr.length != (iE * iA) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.f12455a = new int[iE];
        for (int i10 = 0; i10 < iE; i10++) {
            this.f12455a[i10] = f.f(bArr, (i10 * iA) + 4, iA);
        }
        if (!b(this.f12455a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    private boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 : iArr) {
            if (i10 < 0 || i10 >= length || zArr[i10]) {
                return false;
            }
            zArr[i10] = true;
        }
        return true;
    }

    public byte[] a() {
        int length = this.f12455a.length;
        int iA = e.a(length - 1);
        byte[] bArr = new byte[(length * iA) + 4];
        f.a(length, bArr, 0);
        for (int i10 = 0; i10 < length; i10++) {
            f.b(this.f12455a[i10], bArr, (i10 * iA) + 4, iA);
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return d.b(this.f12455a, ((h) obj).f12455a);
        }
        return false;
    }

    public int hashCode() {
        return Oh.a.t(this.f12455a);
    }

    public String toString() {
        String str = "[" + this.f12455a[0];
        for (int i10 = 1; i10 < this.f12455a.length; i10++) {
            str = str + ", " + this.f12455a[i10];
        }
        return str + "]";
    }
}
