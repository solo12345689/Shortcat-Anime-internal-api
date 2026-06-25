package xh;

import Oh.i;
import ah.C2630c;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import zg.AbstractC7388C;

/* JADX INFO: renamed from: xh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7176a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient C2630c f64578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f64579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient byte[] f64580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient AbstractC7388C f64581d;

    public C7176a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        b((C2630c) AbstractC6325a.b(bVar), bVar.l());
    }

    private void b(C2630c c2630c, AbstractC7388C abstractC7388C) {
        this.f64581d = abstractC7388C;
        this.f64578a = c2630c;
        this.f64579b = i.g(c2630c.b().b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7176a) {
            return Oh.a.c(getEncoded(), ((C7176a) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f64579b;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f64580c == null) {
            this.f64580c = Ih.b.b(this.f64578a, this.f64581d);
        }
        return Oh.a.f(this.f64580c);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(getEncoded());
    }
}
