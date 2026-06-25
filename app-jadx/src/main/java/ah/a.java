package Ah;

import dh.j;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient j f764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC7388C f765b;

    public a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f765b = bVar.l();
        this.f764a = (j) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            return Oh.a.c(this.f764a.getEncoded(), ((a) obj).f764a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f764a, this.f765b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return Oh.a.q(this.f764a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
