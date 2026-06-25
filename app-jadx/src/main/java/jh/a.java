package Jh;

import Vg.l;
import java.io.IOException;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import rh.AbstractC6326b;
import sh.s;
import zg.AbstractC7388C;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public class a implements PrivateKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C7427t f9698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient s f9699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC7388C f9700c;

    public a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        this.f9700c = bVar.l();
        this.f9698a = l.n(bVar.r().p()).r().l();
        this.f9699b = (s) AbstractC6325a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9698a.u(aVar.f9698a) && Oh.a.c(this.f9699b.d(), aVar.f9699b.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6326b.a(this.f9699b, this.f9700c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f9698a.hashCode() + (Oh.a.q(this.f9699b.d()) * 37);
    }
}
