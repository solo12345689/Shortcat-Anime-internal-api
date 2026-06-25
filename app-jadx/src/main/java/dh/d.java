package dh;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class d extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f45657c;

    public d(int i10, l lVar) {
        super(false);
        if (lVar == null) {
            throw new NullPointerException("lmsPublicKey");
        }
        this.f45656b = i10;
        this.f45657c = lVar;
    }

    public static d b(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj instanceof DataInputStream) {
            return new d(((DataInputStream) obj).readInt(), l.b(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(Qh.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d dVarB = b(dataInputStream);
            dataInputStream.close();
            return dVarB;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                dataInputStream2.close();
            }
            throw th;
        }
    }

    public int c() {
        return this.f45656b;
    }

    public l d() {
        return this.f45657c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f45656b != dVar.f45656b) {
            return false;
        }
        return this.f45657c.equals(dVar.f45657c);
    }

    @Override // dh.j, Oh.c
    public byte[] getEncoded() {
        return C4630a.f().i(this.f45656b).d(this.f45657c.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f45656b * 31) + this.f45657c.hashCode();
    }
}
