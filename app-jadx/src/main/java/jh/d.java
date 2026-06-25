package Jh;

import java.io.IOException;
import java.security.PublicKey;
import rh.AbstractC6327c;
import rh.AbstractC6329d;
import sh.z;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public class d implements PublicKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient z f9706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient C7427t f9707b;

    public d(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        z zVar = (z) AbstractC6327c.a(bVar);
        this.f9706a = zVar;
        this.f9707b = e.a(zVar.b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            try {
                if (this.f9707b.u(dVar.f9707b)) {
                    if (Oh.a.c(this.f9706a.getEncoded(), dVar.f9706a.getEncoded())) {
                        return true;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6329d.a(this.f9706a).getEncoded();
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
            return this.f9707b.hashCode() + (Oh.a.q(this.f9706a.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f9707b.hashCode();
        }
    }
}
