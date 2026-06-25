package Eh;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import kh.C5486c;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C5486c f5978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC7388C f5979b;

    public a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f5979b = bVar.l();
        this.f5978a = (C5486c) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return Oh.a.c(this.f5978a.getEncoded(), ((a) obj).f5978a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Picnic";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f5978a, this.f5979b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(this.f5978a.getEncoded());
    }
}
