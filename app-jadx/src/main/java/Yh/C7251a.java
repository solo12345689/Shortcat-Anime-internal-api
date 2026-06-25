package yh;

import Oh.i;
import ch.e;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: renamed from: yh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7251a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient e f65157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC7388C f65158b;

    public C7251a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f65158b = bVar.l();
        this.f65157a = (e) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7251a) {
            return Oh.a.c(this.f65157a.getEncoded(), ((C7251a) obj).f65157a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return i.g(this.f65157a.b().a());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f65157a, this.f65158b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(this.f65157a.getEncoded());
    }
}
