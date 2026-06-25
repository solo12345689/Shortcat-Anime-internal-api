package zg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7394b extends AbstractC7432y implements InterfaceC7396c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66382b = new a(AbstractC7394b.class, 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f66383c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f66384a;

    /* JADX INFO: renamed from: zg.b$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y c(AbstractC7387B abstractC7387B) {
            return abstractC7387B.F();
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return AbstractC7394b.y(c7419n0.B());
        }
    }

    AbstractC7394b(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f66384a = Oh.a.v(bArr, (byte) i10);
    }

    public static AbstractC7394b A(Object obj) {
        if (obj == null || (obj instanceof AbstractC7394b)) {
            return (AbstractC7394b) obj;
        }
        if (obj instanceof InterfaceC7400e) {
            AbstractC7432y abstractC7432yE = ((InterfaceC7400e) obj).e();
            if (abstractC7432yE instanceof AbstractC7394b) {
                return (AbstractC7394b) abstractC7432yE;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC7394b) f66382b.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static AbstractC7394b B(G g10, boolean z10) {
        return (AbstractC7394b) f66382b.e(g10, z10);
    }

    static AbstractC7394b y(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i10 = bArr[0] & 255;
        if (i10 > 0) {
            if (i10 > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b10 = bArr[length - 1];
            if (b10 != ((byte) ((255 << i10) & b10))) {
                return new z0(bArr, false);
            }
        }
        return new C7401e0(bArr, false);
    }

    public byte[] D() {
        byte[] bArr = this.f66384a;
        if (bArr[0] == 0) {
            return Oh.a.m(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String F() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i10 = 0; i10 != encoded.length; i10++) {
                byte b10 = encoded[i10];
                char[] cArr = f66383c;
                stringBuffer.append(cArr[(b10 >>> 4) & 15]);
                stringBuffer.append(cArr[b10 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            throw new C7431x("Internal error encoding BitString: " + e10.getMessage(), e10);
        }
    }

    @Override // zg.InterfaceC7396c
    public int c() {
        return this.f66384a[0] & 255;
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return e();
    }

    @Override // zg.InterfaceC7396c
    public InputStream f() {
        byte[] bArr = this.f66384a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        byte[] bArr = this.f66384a;
        if (bArr.length < 2) {
            return 1;
        }
        int i10 = bArr[0] & 255;
        int length = bArr.length - 1;
        return (Oh.a.r(bArr, 0, length) * 257) ^ ((byte) ((255 << i10) & bArr[length]));
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (!(abstractC7432y instanceof AbstractC7394b)) {
            return false;
        }
        byte[] bArr = this.f66384a;
        byte[] bArr2 = ((AbstractC7394b) abstractC7432y).f66384a;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i10 = length - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        int i12 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i10] & i12)) == ((byte) (bArr2[i10] & i12));
    }

    public String toString() {
        return F();
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        return new C7401e0(this.f66384a, false);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        return new z0(this.f66384a, false);
    }

    public byte[] z() {
        byte[] bArr = this.f66384a;
        if (bArr.length == 1) {
            return AbstractC7428u.f66445c;
        }
        int i10 = bArr[0] & 255;
        byte[] bArrM = Oh.a.m(bArr, 1, bArr.length);
        int length = bArrM.length - 1;
        bArrM[length] = (byte) (((byte) (255 << i10)) & bArrM[length]);
        return bArrM;
    }

    AbstractC7394b(byte[] bArr, boolean z10) {
        if (z10) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i10 = bArr[0] & 255;
            if (i10 > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i10 > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.f66384a = bArr;
    }
}
