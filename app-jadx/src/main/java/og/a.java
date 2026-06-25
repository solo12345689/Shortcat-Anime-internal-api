package Og;

import Oh.i;
import gh.f;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient f f13158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f13159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC7388C f13160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient byte[] f13161d;

    public a(Cg.b bVar) {
        e(bVar);
    }

    private void e(Cg.b bVar) {
        this.f13160c = bVar.l();
        this.f13161d = bVar.getEncoded();
        f fVar = (f) AbstractC6325a.b(bVar);
        this.f13158a = fVar;
        this.f13159b = i.g(Sg.a.a(fVar.b().b()).b());
    }

    public Sg.a a() {
        return Sg.a.a(this.f13158a.b().b());
    }

    public byte[] b() {
        return this.f13158a.getEncoded();
    }

    public Ng.a c() {
        return new b(this.f13158a.e());
    }

    public byte[] d() {
        return this.f13158a.f();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return Oh.a.c(this.f13158a.getEncoded(), ((a) obj).f13158a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f13159b;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            byte[] bArr = this.f13161d;
            return bArr != null ? bArr : AbstractC6326b.a(this.f13158a, this.f13160c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(this.f13158a.getEncoded());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strD = i.d();
        byte[] bArrD = this.f13158a.d();
        sb2.append(getAlgorithm());
        sb2.append(" ");
        sb2.append("Private Key");
        sb2.append(" [");
        sb2.append(new Oh.d(bArrD).toString());
        sb2.append("]");
        sb2.append(strD);
        sb2.append("    public data: ");
        sb2.append(Ph.c.d(bArrD));
        sb2.append(strD);
        return sb2.toString();
    }

    public a(f fVar) {
        this.f13158a = fVar;
        this.f13159b = i.g(fVar.b().b());
    }
}
