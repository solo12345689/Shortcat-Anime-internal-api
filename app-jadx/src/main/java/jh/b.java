package Jh;

import java.io.IOException;
import java.security.PublicKey;
import rh.AbstractC6327c;
import rh.AbstractC6329d;
import sh.t;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public class b implements PublicKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C7427t f9701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient t f9702b;

    public b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        t tVar = (t) AbstractC6327c.a(bVar);
        this.f9702b = tVar;
        this.f9701a = e.a(tVar.b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f9701a.u(bVar.f9701a) && Oh.a.c(this.f9702b.f(), bVar.f9702b.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6329d.a(this.f9702b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f9701a.hashCode() + (Oh.a.q(this.f9702b.f()) * 37);
    }
}
