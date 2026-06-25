package Ah;

import dh.j;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import rh.AbstractC6327c;
import rh.AbstractC6329d;

/* JADX INFO: loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient j f766a;

    public b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        this.f766a = (j) AbstractC6327c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            try {
                return Oh.a.c(this.f766a.getEncoded(), ((b) obj).f766a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6329d.a(this.f766a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return Oh.a.q(this.f766a.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
