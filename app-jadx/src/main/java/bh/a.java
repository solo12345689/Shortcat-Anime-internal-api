package Bh;

import Oh.i;
import eh.C4678c;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;

/* JADX INFO: loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C4678c f2006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC7388C f2007b;

    public a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f2007b = bVar.l();
        this.f2006a = (C4678c) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return Oh.a.c(this.f2006a.getEncoded(), ((a) obj).f2006a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return i.g(this.f2006a.b().a());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f2006a, this.f2007b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(this.f2006a.getEncoded());
    }
}
