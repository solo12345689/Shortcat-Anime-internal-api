package zh;

import Oh.i;
import gh.g;
import java.security.Key;
import java.security.PublicKey;
import rh.AbstractC6327c;

/* JADX INFO: renamed from: zh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7435b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient g f66454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f66455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient byte[] f66456c;

    public C7435b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        b((g) AbstractC6327c.a(bVar));
    }

    private void b(g gVar) {
        this.f66454a = gVar;
        this.f66455b = i.g(gVar.b().b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7435b) {
            return Oh.a.c(getEncoded(), ((C7435b) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f66455b;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f66456c == null) {
            this.f66456c = Ih.b.d(this.f66454a);
        }
        return Oh.a.f(this.f66456c);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Oh.a.q(getEncoded());
    }
}
