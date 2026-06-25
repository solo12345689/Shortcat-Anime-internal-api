package xh;

import Oh.i;
import ah.d;
import java.security.Key;
import java.security.PublicKey;
import rh.AbstractC6327c;

/* JADX INFO: renamed from: xh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7177b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient d f64582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f64583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient byte[] f64584c;

    public C7177b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        b((d) AbstractC6327c.a(bVar));
    }

    private void b(d dVar) {
        this.f64582a = dVar;
        this.f64583b = i.g(dVar.b().b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7177b) {
            return Oh.a.c(getEncoded(), ((C7177b) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f64583b;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f64584c == null) {
            this.f64584c = Ih.b.d(this.f64582a);
        }
        return Oh.a.f(this.f64584c);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Oh.a.q(getEncoded());
    }
}
