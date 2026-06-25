package wh;

import Oh.i;
import Zg.e;
import java.security.Key;
import java.security.PublicKey;
import rh.AbstractC6327c;

/* JADX INFO: renamed from: wh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C6979b implements PublicKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient e f63211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f63212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient byte[] f63213c;

    public C6979b(Dg.b bVar) {
        a(bVar);
    }

    private void a(Dg.b bVar) {
        b((e) AbstractC6327c.a(bVar));
    }

    private void b(e eVar) {
        this.f63211a = eVar;
        this.f63212b = i.g(eVar.b().b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6979b) {
            return Oh.a.c(getEncoded(), ((C6979b) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f63212b;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f63213c == null) {
            this.f63213c = Ih.b.d(this.f63211a);
        }
        return Oh.a.f(this.f63213c);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Oh.a.q(getEncoded());
    }
}
