package Og;

import Oh.i;
import gh.g;
import java.io.IOException;
import rh.AbstractC6327c;
import rh.AbstractC6329d;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Ng.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient g f13162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f13163b;

    public b(Dg.b bVar) {
        b(bVar);
    }

    private void b(Dg.b bVar) {
        g gVar = (g) AbstractC6327c.a(bVar);
        this.f13162a = gVar;
        this.f13163b = i.g(Sg.a.a(gVar.b().b()).b());
    }

    private void c(g gVar) {
        this.f13162a = gVar;
        this.f13163b = i.g(Sg.a.a(gVar.b().b()).b());
    }

    public Sg.a a() {
        return Sg.a.a(this.f13162a.b().b());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return Oh.a.c(getEncoded(), ((b) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f13163b;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return AbstractC6329d.a(this.f13162a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Oh.a.q(getEncoded());
    }

    @Override // Ng.a
    public byte[] r() {
        return this.f13162a.getEncoded();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strD = i.d();
        byte[] encoded = this.f13162a.getEncoded();
        sb2.append(getAlgorithm());
        sb2.append(" ");
        sb2.append("Public Key");
        sb2.append(" [");
        sb2.append(new Oh.d(encoded).toString());
        sb2.append("]");
        sb2.append(strD);
        sb2.append("    public data: ");
        sb2.append(Ph.c.d(encoded));
        sb2.append(strD);
        return sb2.toString();
    }

    public b(g gVar) {
        c(gVar);
    }
}
