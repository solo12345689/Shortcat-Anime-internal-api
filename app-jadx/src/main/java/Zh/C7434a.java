package zh;

import Oh.i;
import gh.f;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: renamed from: zh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7434a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient f f66451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f66452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC7388C f66453c;

    public C7434a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f66453c = bVar.l();
        f fVar = (f) AbstractC6325a.b(bVar);
        this.f66451a = fVar;
        this.f66452b = i.g(fVar.b().b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7434a) {
            return Oh.a.c(getEncoded(), ((C7434a) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f66452b;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f66451a, this.f66453c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(getEncoded());
    }
}
