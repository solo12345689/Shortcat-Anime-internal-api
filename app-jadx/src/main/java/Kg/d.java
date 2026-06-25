package Kg;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class d implements Fg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f11152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f11153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f11154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f11155d;

    public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, e eVar) {
        this.f11152a = bigInteger3;
        this.f11154c = bigInteger;
        this.f11153b = bigInteger2;
        this.f11155d = eVar;
    }

    public BigInteger a() {
        return this.f11152a;
    }

    public BigInteger b() {
        return this.f11154c;
    }

    public BigInteger c() {
        return this.f11153b;
    }

    public e d() {
        return this.f11155d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.b().equals(this.f11154c) && dVar.c().equals(this.f11153b) && dVar.a().equals(this.f11152a);
    }

    public int hashCode() {
        return (b().hashCode() ^ c().hashCode()) ^ a().hashCode();
    }
}
