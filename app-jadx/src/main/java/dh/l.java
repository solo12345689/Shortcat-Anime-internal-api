package dh;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class l extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f45708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f45709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f45710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f45711e;

    public l(n nVar, e eVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f45708b = nVar;
        this.f45709c = eVar;
        this.f45710d = Oh.a.f(bArr2);
        this.f45711e = Oh.a.f(bArr);
    }

    public static l b(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            n nVarE = n.e(dataInputStream2.readInt());
            e eVarF = e.f(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[nVarE.d()];
            dataInputStream2.readFully(bArr2);
            return new l(nVarE, eVarF, bArr2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(Qh.a.c((InputStream) obj));
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
            l lVarB = b(dataInputStream);
            dataInputStream.close();
            return lVarB;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 != null) {
                dataInputStream3.close();
            }
            throw th;
        }
    }

    byte[] c() {
        return C4630a.f().i(this.f45708b.f()).i(this.f45709c.g()).d(this.f45710d).d(this.f45711e).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f45708b.equals(lVar.f45708b) && this.f45709c.equals(lVar.f45709c) && Oh.a.c(this.f45710d, lVar.f45710d)) {
            return Oh.a.c(this.f45711e, lVar.f45711e);
        }
        return false;
    }

    @Override // dh.j, Oh.c
    public byte[] getEncoded() {
        return c();
    }

    public int hashCode() {
        return (((((this.f45708b.hashCode() * 31) + this.f45709c.hashCode()) * 31) + Oh.a.q(this.f45710d)) * 31) + Oh.a.q(this.f45711e);
    }
}
