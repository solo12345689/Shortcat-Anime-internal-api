package Hh;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import qh.f;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient f f8649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC7388C f8650b;

    public a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f8650b = bVar.l();
        this.f8649a = (f) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return Oh.a.c(this.f8649a.getEncoded(), ((a) obj).f8649a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f8649a, this.f8650b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(this.f8649a.getEncoded());
    }
}
