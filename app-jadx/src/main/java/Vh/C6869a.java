package vh;

import Oh.i;
import Yg.g;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: renamed from: vh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C6869a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient g f62317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC7388C f62318b;

    public C6869a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f62318b = bVar.l();
        this.f62317a = (g) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6869a) {
            return Oh.a.c(this.f62317a.getEncoded(), ((C6869a) obj).f62317a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return i.g(this.f62317a.b().b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f62317a, this.f62318b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(this.f62317a.getEncoded());
    }
}
