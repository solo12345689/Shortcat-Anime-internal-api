package W9;

import V9.g;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f20787a;

    private a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f20787a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            return new a(bArr, i10, i11);
        }
        throw new NullPointerException("data must be non-null");
    }

    public byte[] c() {
        byte[] bArr = this.f20787a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f20787a, this.f20787a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f20787a);
    }

    public String toString() {
        return "Bytes(" + g.a(this.f20787a) + ")";
    }
}
