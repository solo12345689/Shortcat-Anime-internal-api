package vh;

import Oh.i;
import Yg.h;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import rh.AbstractC6327c;
import rh.AbstractC6329d;

/* JADX INFO: renamed from: vh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C6870b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient h f62319a;

    public C6870b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        this.f62319a = (h) AbstractC6327c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6870b) {
            return Oh.a.c(this.f62319a.getEncoded(), ((C6870b) obj).f62319a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return i.g(this.f62319a.b().b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6329d.a(this.f62319a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Oh.a.q(this.f62319a.getEncoded());
    }
}
