package Bh;

import Oh.i;
import eh.d;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import rh.AbstractC6327c;
import rh.AbstractC6329d;

/* JADX INFO: loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient d f2008a;

    public b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        this.f2008a = (d) AbstractC6327c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return Oh.a.c(this.f2008a.getEncoded(), ((b) obj).f2008a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return i.g(this.f2008a.b().a());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6329d.a(this.f2008a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Oh.a.q(this.f2008a.getEncoded());
    }
}
