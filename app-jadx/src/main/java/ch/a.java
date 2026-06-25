package Ch;

import hh.C4954a;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Key, PrivateKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C4954a f3304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC7388C f3305b;

    public a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f3305b = bVar.l();
        this.f3304a = (C4954a) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Oh.a.e(this.f3304a.b(), ((a) obj).f3304a.b());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f3304a, this.f3305b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.u(this.f3304a.b());
    }
}
