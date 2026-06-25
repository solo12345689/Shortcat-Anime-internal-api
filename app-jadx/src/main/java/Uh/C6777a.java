package uh;

import Oh.i;
import Xg.d;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: renamed from: uh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C6777a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient d f61562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC7388C f61563b;

    public C6777a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f61563b = bVar.l();
        this.f61562a = (d) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6777a) {
            return Oh.a.c(this.f61562a.getEncoded(), ((C6777a) obj).f61562a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return i.g(this.f61562a.b().a());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f61562a, this.f61563b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(this.f61562a.getEncoded());
    }
}
