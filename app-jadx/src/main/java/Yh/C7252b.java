package yh;

import Oh.i;
import ch.f;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import rh.AbstractC6327c;
import rh.AbstractC6329d;

/* JADX INFO: renamed from: yh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7252b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient f f65159a;

    public C7252b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        this.f65159a = (f) AbstractC6327c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7252b) {
            return Oh.a.c(this.f65159a.getEncoded(), ((C7252b) obj).f65159a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return i.g(this.f65159a.b().a());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6329d.a(this.f65159a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Oh.a.q(this.f65159a.getEncoded());
    }
}
