package zg;

import java.io.IOException;

/* JADX INFO: renamed from: zg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7392a extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66377b = new C1001a(AbstractC7392a.class, 30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final char[] f66378a;

    /* JADX INFO: renamed from: zg.a$a, reason: collision with other inner class name */
    static class C1001a extends L {
        C1001a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return AbstractC7392a.y(c7419n0.B());
        }
    }

    AbstractC7392a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i10 = length / 2;
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 != i10; i11++) {
            int i12 = i11 * 2;
            cArr[i11] = (char) ((bArr[i12 + 1] & 255) | (bArr[i12] << 8));
        }
        this.f66378a = cArr;
    }

    static AbstractC7392a y(byte[] bArr) {
        return new C7399d0(bArr);
    }

    static AbstractC7392a z(char[] cArr) {
        return new C7399d0(cArr);
    }

    public final String A() {
        return new String(this.f66378a);
    }

    @Override // zg.AbstractC7432y, zg.r
    public final int hashCode() {
        return Oh.a.s(this.f66378a);
    }

    @Override // zg.AbstractC7432y
    final boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof AbstractC7392a) {
            return Oh.a.d(this.f66378a, ((AbstractC7392a) abstractC7432y).f66378a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    final void n(C7430w c7430w, boolean z10) throws IOException {
        int length = this.f66378a.length;
        c7430w.s(z10, 30);
        c7430w.k(length * 2);
        byte[] bArr = new byte[8];
        int i10 = length & (-4);
        int i11 = 0;
        while (i11 < i10) {
            char[] cArr = this.f66378a;
            char c10 = cArr[i11];
            char c11 = cArr[i11 + 1];
            char c12 = cArr[i11 + 2];
            char c13 = cArr[i11 + 3];
            i11 += 4;
            bArr[0] = (byte) (c10 >> '\b');
            bArr[1] = (byte) c10;
            bArr[2] = (byte) (c11 >> '\b');
            bArr[3] = (byte) c11;
            bArr[4] = (byte) (c12 >> '\b');
            bArr[5] = (byte) c12;
            bArr[6] = (byte) (c13 >> '\b');
            bArr[7] = (byte) c13;
            c7430w.j(bArr, 0, 8);
        }
        if (i11 < length) {
            int i12 = 0;
            do {
                char c14 = this.f66378a[i11];
                i11++;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (c14 >> '\b');
                i12 += 2;
                bArr[i13] = (byte) c14;
            } while (i11 < length);
            c7430w.j(bArr, 0, i12);
        }
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    final int t(boolean z10) {
        return C7430w.g(z10, this.f66378a.length * 2);
    }

    public String toString() {
        return A();
    }

    AbstractC7392a(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f66378a = cArr;
    }
}
