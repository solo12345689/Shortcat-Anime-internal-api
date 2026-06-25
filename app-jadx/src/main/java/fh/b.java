package Fh;

import Oh.i;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import oh.C5903c;
import rh.AbstractC6327c;
import rh.AbstractC6329d;

/* JADX INFO: loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C5903c f6695a;

    public b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        this.f6695a = (C5903c) AbstractC6327c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return Oh.a.c(this.f6695a.getEncoded(), ((b) obj).f6695a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return i.g(this.f6695a.b().a());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6329d.a(this.f6695a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Oh.a.q(this.f6695a.getEncoded());
    }
}
