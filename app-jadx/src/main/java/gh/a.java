package Gh;

import Vg.g;
import Vg.h;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import ph.C6052b;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import zg.AbstractC7388C;
import zg.C7419n0;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C7427t f7623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient C6052b f7624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC7388C f7625c;

    public a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f7625c = bVar.l();
        this.f7623a = h.l(bVar.r().p()).n().l();
        this.f7624b = (C6052b) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f7623a.u(aVar.f7623a) && Oh.a.c(this.f7624b.c(), aVar.f7624b.c())) {
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
            return (this.f7624b.b() != null ? AbstractC6326b.a(this.f7624b, this.f7625c) : new Cg.b(new Dg.a(g.f20342r, new h(new Dg.a(this.f7623a))), new C7419n0(this.f7624b.c()), this.f7625c)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f7623a.hashCode() + (Oh.a.q(this.f7624b.c()) * 37);
    }
}
