package dh;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class m implements Oh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f45713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f45714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[][] f45715d;

    public m(int i10, g gVar, n nVar, byte[][] bArr) {
        this.f45712a = i10;
        this.f45713b = gVar;
        this.f45714c = nVar;
        this.f45715d = bArr;
    }

    public static m a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int i10 = dataInputStream2.readInt();
            g gVarA = g.a(obj);
            n nVarE = n.e(dataInputStream2.readInt());
            int iC = nVarE.c();
            byte[][] bArr = new byte[iC][];
            for (int i11 = 0; i11 < iC; i11++) {
                byte[] bArr2 = new byte[nVarE.d()];
                bArr[i11] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new m(i10, gVarA, nVarE, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(Qh.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream3 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            m mVarA = a(dataInputStream);
            dataInputStream.close();
            return mVarA;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 != null) {
                dataInputStream3.close();
            }
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f45712a != mVar.f45712a) {
            return false;
        }
        g gVar = this.f45713b;
        if (gVar == null ? mVar.f45713b != null : !gVar.equals(mVar.f45713b)) {
            return false;
        }
        n nVar = this.f45714c;
        if (nVar == null ? mVar.f45714c == null : nVar.equals(mVar.f45714c)) {
            return Arrays.deepEquals(this.f45715d, mVar.f45715d);
        }
        return false;
    }

    @Override // Oh.c
    public byte[] getEncoded() {
        return C4630a.f().i(this.f45712a).d(this.f45713b.getEncoded()).i(this.f45714c.f()).e(this.f45715d).b();
    }

    public int hashCode() {
        int i10 = this.f45712a * 31;
        g gVar = this.f45713b;
        int iHashCode = (i10 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        n nVar = this.f45714c;
        return ((iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.f45715d);
    }
}
