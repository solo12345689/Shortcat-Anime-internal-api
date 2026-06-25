package zg;

import Oh.a;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: zg.C */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7388C extends AbstractC7432y implements Iterable {

    /* JADX INFO: renamed from: c */
    static final L f66318c = new a(AbstractC7388C.class, 17);

    /* JADX INFO: renamed from: a */
    protected final InterfaceC7400e[] f66319a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC7400e[] f66320b;

    /* JADX INFO: renamed from: zg.C$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y c(AbstractC7387B abstractC7387B) {
            return abstractC7387B.K();
        }
    }

    protected AbstractC7388C() {
        InterfaceC7400e[] interfaceC7400eArr = C7402f.f66398d;
        this.f66319a = interfaceC7400eArr;
        this.f66320b = interfaceC7400eArr;
    }

    private static boolean A(byte[] bArr, byte[] bArr2) {
        int i10 = bArr[0] & 223;
        int i11 = bArr2[0] & 223;
        if (i10 != i11) {
            return i10 < i11;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i12 = 1; i12 < iMin; i12++) {
            byte b10 = bArr[i12];
            byte b11 = bArr2[i12];
            if (b10 != b11) {
                return (b10 & 255) < (b11 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    private static void B(InterfaceC7400e[] interfaceC7400eArr) {
        int i10;
        int length = interfaceC7400eArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC7400e interfaceC7400e = interfaceC7400eArr[0];
        InterfaceC7400e interfaceC7400e2 = interfaceC7400eArr[1];
        byte[] bArrY = y(interfaceC7400e);
        byte[] bArrY2 = y(interfaceC7400e2);
        if (A(bArrY2, bArrY)) {
            interfaceC7400e2 = interfaceC7400e;
            interfaceC7400e = interfaceC7400e2;
            bArrY2 = bArrY;
            bArrY = bArrY2;
        }
        for (int i11 = 2; i11 < length; i11++) {
            InterfaceC7400e interfaceC7400e3 = interfaceC7400eArr[i11];
            byte[] bArrY3 = y(interfaceC7400e3);
            if (A(bArrY2, bArrY3)) {
                interfaceC7400eArr[i11 - 2] = interfaceC7400e;
                interfaceC7400e = interfaceC7400e2;
                bArrY = bArrY2;
                interfaceC7400e2 = interfaceC7400e3;
                bArrY2 = bArrY3;
            } else if (A(bArrY, bArrY3)) {
                interfaceC7400eArr[i11 - 2] = interfaceC7400e;
                interfaceC7400e = interfaceC7400e3;
                bArrY = bArrY3;
            } else {
                int i12 = i11 - 1;
                while (true) {
                    i10 = i12 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    InterfaceC7400e interfaceC7400e4 = interfaceC7400eArr[i12 - 2];
                    if (A(y(interfaceC7400e4), bArrY3)) {
                        break;
                    }
                    interfaceC7400eArr[i10] = interfaceC7400e4;
                    i12 = i10;
                }
                interfaceC7400eArr[i10] = interfaceC7400e3;
            }
        }
        interfaceC7400eArr[length - 2] = interfaceC7400e;
        interfaceC7400eArr[length - 1] = interfaceC7400e2;
    }

    private static byte[] y(InterfaceC7400e interfaceC7400e) {
        try {
            return interfaceC7400e.e().i("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static AbstractC7388C z(G g10, boolean z10) {
        return (AbstractC7388C) f66318c.e(g10, z10);
    }

    public InterfaceC7400e[] D() {
        return C7402f.b(this.f66319a);
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        int length = this.f66319a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += this.f66319a[length].e().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a.C0210a(D());
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (!(abstractC7432y instanceof AbstractC7388C)) {
            return false;
        }
        AbstractC7388C abstractC7388C = (AbstractC7388C) abstractC7432y;
        int size = size();
        if (abstractC7388C.size() != size) {
            return false;
        }
        s0 s0Var = (s0) w();
        s0 s0Var2 = (s0) abstractC7388C.w();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC7432y abstractC7432yE = s0Var.f66319a[i10].e();
            AbstractC7432y abstractC7432yE2 = s0Var2.f66319a[i10].e();
            if (abstractC7432yE != abstractC7432yE2 && !abstractC7432yE.l(abstractC7432yE2)) {
                return false;
            }
        }
        return true;
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return true;
    }

    public int size() {
        return this.f66319a.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f66319a[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        if (this.f66320b == null) {
            InterfaceC7400e[] interfaceC7400eArr = (InterfaceC7400e[]) this.f66319a.clone();
            this.f66320b = interfaceC7400eArr;
            B(interfaceC7400eArr);
        }
        return new s0(true, this.f66320b);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        return new G0(this.f66319a, this.f66320b);
    }

    protected AbstractC7388C(C7402f c7402f, boolean z10) {
        InterfaceC7400e[] interfaceC7400eArrG;
        if (c7402f == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z10 || c7402f.f() < 2) {
            interfaceC7400eArrG = c7402f.g();
        } else {
            interfaceC7400eArrG = c7402f.c();
            B(interfaceC7400eArrG);
        }
        this.f66319a = interfaceC7400eArrG;
        if (!z10 && interfaceC7400eArrG.length >= 2) {
            interfaceC7400eArrG = null;
        }
        this.f66320b = interfaceC7400eArrG;
    }

    AbstractC7388C(boolean z10, InterfaceC7400e[] interfaceC7400eArr) {
        this.f66319a = interfaceC7400eArr;
        if (!z10 && interfaceC7400eArr.length >= 2) {
            interfaceC7400eArr = null;
        }
        this.f66320b = interfaceC7400eArr;
    }

    AbstractC7388C(InterfaceC7400e[] interfaceC7400eArr, InterfaceC7400e[] interfaceC7400eArr2) {
        this.f66319a = interfaceC7400eArr;
        this.f66320b = interfaceC7400eArr2;
    }
}
