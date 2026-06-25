package Gh;

import Vg.g;
import Vg.h;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import ph.C6053c;
import rh.AbstractC6327c;
import rh.AbstractC6329d;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C7427t f7626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient C6053c f7627b;

    public b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        this.f7626a = h.l(bVar.l().p()).n().l();
        this.f7627b = (C6053c) AbstractC6327c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f7626a.u(bVar.f7626a) && Oh.a.c(this.f7627b.c(), bVar.f7627b.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.f7627b.b() != null ? AbstractC6329d.a(this.f7627b) : new Dg.b(new Dg.a(g.f20342r, new h(new Dg.a(this.f7626a))), this.f7627b.c())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f7626a.hashCode() + (Oh.a.q(this.f7627b.c()) * 37);
    }
}
