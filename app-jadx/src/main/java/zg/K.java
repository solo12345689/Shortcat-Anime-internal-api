package zg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class K extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66344b = new a(K.class, 28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f66345c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66346a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return K.y(c7419n0.B());
        }
    }

    K(byte[] bArr, boolean z10) {
        this.f66346a = z10 ? Oh.a.f(bArr) : bArr;
    }

    private static void A(StringBuffer stringBuffer, int i10) {
        int i11;
        if (i10 < 128) {
            z(stringBuffer, i10);
            return;
        }
        byte[] bArr = new byte[5];
        int i12 = 5;
        while (true) {
            i11 = i12 - 1;
            bArr[i11] = (byte) i10;
            i10 >>>= 8;
            if (i10 == 0) {
                break;
            } else {
                i12 = i11;
            }
        }
        int i13 = i12 - 2;
        bArr[i13] = (byte) ((5 - i11) | 128);
        while (true) {
            int i14 = i13 + 1;
            z(stringBuffer, bArr[i13]);
            if (i14 >= 5) {
                return;
            } else {
                i13 = i14;
            }
        }
    }

    static K y(byte[] bArr) {
        return new w0(bArr, false);
    }

    private static void z(StringBuffer stringBuffer, int i10) {
        char[] cArr = f66345c;
        stringBuffer.append(cArr[(i10 >>> 4) & 15]);
        stringBuffer.append(cArr[i10 & 15]);
    }

    public final String B() {
        int length = this.f66346a.length;
        StringBuffer stringBuffer = new StringBuffer(((C7430w.f(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        A(stringBuffer, length);
        for (int i10 = 0; i10 < length; i10++) {
            z(stringBuffer, this.f66346a[i10]);
        }
        return stringBuffer.toString();
    }

    @Override // zg.AbstractC7432y, zg.r
    public final int hashCode() {
        return Oh.a.q(this.f66346a);
    }

    @Override // zg.AbstractC7432y
    final boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof K) {
            return Oh.a.c(this.f66346a, ((K) abstractC7432y).f66346a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    final void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 28, this.f66346a);
    }

    @Override // zg.AbstractC7432y
    final boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    final int t(boolean z10) {
        return C7430w.g(z10, this.f66346a.length);
    }

    public String toString() {
        return B();
    }
}
