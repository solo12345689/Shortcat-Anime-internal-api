package dh;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class g implements Oh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f45686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f45687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f45688c;

    public g(e eVar, byte[] bArr, byte[] bArr2) {
        this.f45686a = eVar;
        this.f45687b = bArr;
        this.f45688c = bArr2;
    }

    public static g a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            e eVarF = e.f(dataInputStream2.readInt());
            byte[] bArr = new byte[eVarF.d()];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[eVarF.e() * eVarF.d()];
            dataInputStream2.readFully(bArr2);
            return new g(eVarF, bArr, bArr2);
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
            g gVarA = a(dataInputStream);
            dataInputStream.close();
            return gVarA;
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
        g gVar = (g) obj;
        e eVar = this.f45686a;
        if (eVar == null ? gVar.f45686a != null : !eVar.equals(gVar.f45686a)) {
            return false;
        }
        if (Arrays.equals(this.f45687b, gVar.f45687b)) {
            return Arrays.equals(this.f45688c, gVar.f45688c);
        }
        return false;
    }

    @Override // Oh.c
    public byte[] getEncoded() {
        return C4630a.f().i(this.f45686a.g()).d(this.f45687b).d(this.f45688c).b();
    }

    public int hashCode() {
        e eVar = this.f45686a;
        return ((((eVar != null ? eVar.hashCode() : 0) * 31) + Arrays.hashCode(this.f45687b)) * 31) + Arrays.hashCode(this.f45688c);
    }
}
