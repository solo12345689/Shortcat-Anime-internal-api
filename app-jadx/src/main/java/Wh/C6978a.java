package wh;

import Oh.i;
import Zg.d;
import java.security.Key;
import java.security.PrivateKey;
import rh.AbstractC6325a;
import zg.AbstractC7388C;

/* JADX INFO: renamed from: wh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C6978a implements PrivateKey, Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient d f63207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f63208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient byte[] f63209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient AbstractC7388C f63210d;

    public C6978a(Cg.b bVar) {
        a(bVar);
    }

    private void a(Cg.b bVar) {
        b((d) AbstractC6325a.b(bVar), bVar.l());
    }

    private void b(d dVar, AbstractC7388C abstractC7388C) {
        this.f63210d = abstractC7388C;
        this.f63207a = dVar;
        this.f63208b = i.g(dVar.b().b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6978a) {
            return Oh.a.c(getEncoded(), ((C6978a) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f63208b;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f63209c == null) {
            this.f63209c = Ih.b.b(this.f63207a, this.f63210d);
        }
        return Oh.a.f(this.f63209c);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return Oh.a.q(getEncoded());
    }
}
