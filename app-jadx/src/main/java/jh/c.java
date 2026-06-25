package Jh;

import Vg.k;
import java.io.IOException;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import sh.y;
import zg.AbstractC7388C;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public class c implements PrivateKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient y f9703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient C7427t f9704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC7388C f9705c;

    public c(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f9705c = bVar.l();
        this.f9704b = k.n(bVar.r().p()).p().l();
        this.f9703a = (y) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f9704b.u(cVar.f9704b) && Oh.a.c(this.f9703a.d(), cVar.f9703a.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f9703a, this.f9705c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f9704b.hashCode() + (Oh.a.q(this.f9703a.d()) * 37);
    }
}
